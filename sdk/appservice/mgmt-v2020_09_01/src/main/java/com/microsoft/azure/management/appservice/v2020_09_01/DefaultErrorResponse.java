/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * App Service error response.
 */
public class DefaultErrorResponse {
    /**
     * Error model.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private DefaultErrorResponseError error;

    /**
     * Get error model.
     *
     * @return the error value
     */
    public DefaultErrorResponseError error() {
        return this.error;
    }

}
