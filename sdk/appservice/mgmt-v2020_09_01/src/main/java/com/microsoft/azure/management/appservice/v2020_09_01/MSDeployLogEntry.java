/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MSDeploy log entry.
 */
public class MSDeployLogEntry {
    /**
     * Timestamp of log entry.
     */
    @JsonProperty(value = "time", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime time;

    /**
     * Log entry type. Possible values include: 'Message', 'Warning', 'Error'.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private MSDeployLogEntryType type;

    /**
     * Log entry message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get timestamp of log entry.
     *
     * @return the time value
     */
    public DateTime time() {
        return this.time;
    }

    /**
     * Get log entry type. Possible values include: 'Message', 'Warning', 'Error'.
     *
     * @return the type value
     */
    public MSDeployLogEntryType type() {
        return this.type;
    }

    /**
     * Get log entry message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

}
