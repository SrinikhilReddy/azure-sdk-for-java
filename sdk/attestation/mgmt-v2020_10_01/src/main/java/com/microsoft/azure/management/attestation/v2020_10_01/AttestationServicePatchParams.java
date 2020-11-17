/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.attestation.v2020_10_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for patching an attestation service instance.
 */
public class AttestationServicePatchParams {
    /**
     * The tags that will be assigned to the attestation service instance.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the tags that will be assigned to the attestation service instance.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags that will be assigned to the attestation service instance.
     *
     * @param tags the tags value to set
     * @return the AttestationServicePatchParams object itself.
     */
    public AttestationServicePatchParams withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
