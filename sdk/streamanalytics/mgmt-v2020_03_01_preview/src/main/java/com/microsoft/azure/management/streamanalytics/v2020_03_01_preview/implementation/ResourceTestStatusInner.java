/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.ErrorResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the status of the test operation along with error information, if
 * applicable.
 */
public class ResourceTestStatusInner {
    /**
     * The status of the test operation.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Describes the error that occurred.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ErrorResponse error;

    /**
     * Get the status of the test operation.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get describes the error that occurred.
     *
     * @return the error value
     */
    public ErrorResponse error() {
        return this.error;
    }

}
