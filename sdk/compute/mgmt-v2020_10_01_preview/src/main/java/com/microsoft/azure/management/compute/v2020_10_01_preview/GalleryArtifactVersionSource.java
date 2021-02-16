/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The gallery artifact version source.
 */
public class GalleryArtifactVersionSource {
    /**
     * The id of the gallery artifact version source. Can specify a disk uri,
     * snapshot uri, or user image.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id of the gallery artifact version source. Can specify a disk uri, snapshot uri, or user image.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id of the gallery artifact version source. Can specify a disk uri, snapshot uri, or user image.
     *
     * @param id the id value to set
     * @return the GalleryArtifactVersionSource object itself.
     */
    public GalleryArtifactVersionSource withId(String id) {
        this.id = id;
        return this;
    }

}
