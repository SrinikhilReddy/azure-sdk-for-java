/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Service health status.
 */
public class DataMigrationServiceStatusResponseInner {
    /**
     * The DMS instance agent version.
     */
    @JsonProperty(value = "agentVersion")
    private String agentVersion;

    /**
     * The machine-readable status, such as 'Initializing', 'Offline',
     * 'Online', 'Deploying', 'Deleting', 'Stopped', 'Stopping', 'Starting',
     * 'FailedToStart', 'FailedToStop' or 'Failed'.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The services virtual machine size, such as 'Standard_D2_v2'.
     */
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /**
     * The list of supported task types.
     */
    @JsonProperty(value = "supportedTaskTypes")
    private List<String> supportedTaskTypes;

    /**
     * Get the DMS instance agent version.
     *
     * @return the agentVersion value
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set the DMS instance agent version.
     *
     * @param agentVersion the agentVersion value to set
     * @return the DataMigrationServiceStatusResponseInner object itself.
     */
    public DataMigrationServiceStatusResponseInner withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get the machine-readable status, such as 'Initializing', 'Offline', 'Online', 'Deploying', 'Deleting', 'Stopped', 'Stopping', 'Starting', 'FailedToStart', 'FailedToStop' or 'Failed'.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the machine-readable status, such as 'Initializing', 'Offline', 'Online', 'Deploying', 'Deleting', 'Stopped', 'Stopping', 'Starting', 'FailedToStart', 'FailedToStop' or 'Failed'.
     *
     * @param status the status value to set
     * @return the DataMigrationServiceStatusResponseInner object itself.
     */
    public DataMigrationServiceStatusResponseInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the services virtual machine size, such as 'Standard_D2_v2'.
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the services virtual machine size, such as 'Standard_D2_v2'.
     *
     * @param vmSize the vmSize value to set
     * @return the DataMigrationServiceStatusResponseInner object itself.
     */
    public DataMigrationServiceStatusResponseInner withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the list of supported task types.
     *
     * @return the supportedTaskTypes value
     */
    public List<String> supportedTaskTypes() {
        return this.supportedTaskTypes;
    }

    /**
     * Set the list of supported task types.
     *
     * @param supportedTaskTypes the supportedTaskTypes value to set
     * @return the DataMigrationServiceStatusResponseInner object itself.
     */
    public DataMigrationServiceStatusResponseInner withSupportedTaskTypes(List<String> supportedTaskTypes) {
        this.supportedTaskTypes = supportedTaskTypes;
        return this;
    }

}
