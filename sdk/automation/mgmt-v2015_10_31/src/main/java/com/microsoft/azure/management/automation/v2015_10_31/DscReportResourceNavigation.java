/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Navigation for DSC Report Resource.
 */
public class DscReportResourceNavigation {
    /**
     * Gets or sets the ID of the resource to navigate to.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Get gets or sets the ID of the resource to navigate to.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set gets or sets the ID of the resource to navigate to.
     *
     * @param resourceId the resourceId value to set
     * @return the DscReportResourceNavigation object itself.
     */
    public DscReportResourceNavigation withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

}
