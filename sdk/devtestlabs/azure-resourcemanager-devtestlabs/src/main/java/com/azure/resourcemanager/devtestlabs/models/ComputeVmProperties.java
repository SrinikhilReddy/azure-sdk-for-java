// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a virtual machine returned by the Microsoft.Compute API. */
@Fluent
public final class ComputeVmProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ComputeVmProperties.class);

    /*
     * Gets the statuses of the virtual machine.
     */
    @JsonProperty(value = "statuses")
    private List<ComputeVmInstanceViewStatus> statuses;

    /*
     * Gets the OS type of the virtual machine.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /*
     * Gets the size of the virtual machine.
     */
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /*
     * Gets the network interface ID of the virtual machine.
     */
    @JsonProperty(value = "networkInterfaceId")
    private String networkInterfaceId;

    /*
     * Gets OS disk blob uri for the virtual machine.
     */
    @JsonProperty(value = "osDiskId")
    private String osDiskId;

    /*
     * Gets data disks blob uri for the virtual machine.
     */
    @JsonProperty(value = "dataDiskIds")
    private List<String> dataDiskIds;

    /*
     * Gets all data disks attached to the virtual machine.
     */
    @JsonProperty(value = "dataDisks")
    private List<ComputeDataDisk> dataDisks;

    /**
     * Get the statuses property: Gets the statuses of the virtual machine.
     *
     * @return the statuses value.
     */
    public List<ComputeVmInstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the statuses property: Gets the statuses of the virtual machine.
     *
     * @param statuses the statuses value to set.
     * @return the ComputeVmProperties object itself.
     */
    public ComputeVmProperties withStatuses(List<ComputeVmInstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Get the osType property: Gets the OS type of the virtual machine.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the osType property: Gets the OS type of the virtual machine.
     *
     * @param osType the osType value to set.
     * @return the ComputeVmProperties object itself.
     */
    public ComputeVmProperties withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the vmSize property: Gets the size of the virtual machine.
     *
     * @return the vmSize value.
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Gets the size of the virtual machine.
     *
     * @param vmSize the vmSize value to set.
     * @return the ComputeVmProperties object itself.
     */
    public ComputeVmProperties withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the networkInterfaceId property: Gets the network interface ID of the virtual machine.
     *
     * @return the networkInterfaceId value.
     */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * Set the networkInterfaceId property: Gets the network interface ID of the virtual machine.
     *
     * @param networkInterfaceId the networkInterfaceId value to set.
     * @return the ComputeVmProperties object itself.
     */
    public ComputeVmProperties withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * Get the osDiskId property: Gets OS disk blob uri for the virtual machine.
     *
     * @return the osDiskId value.
     */
    public String osDiskId() {
        return this.osDiskId;
    }

    /**
     * Set the osDiskId property: Gets OS disk blob uri for the virtual machine.
     *
     * @param osDiskId the osDiskId value to set.
     * @return the ComputeVmProperties object itself.
     */
    public ComputeVmProperties withOsDiskId(String osDiskId) {
        this.osDiskId = osDiskId;
        return this;
    }

    /**
     * Get the dataDiskIds property: Gets data disks blob uri for the virtual machine.
     *
     * @return the dataDiskIds value.
     */
    public List<String> dataDiskIds() {
        return this.dataDiskIds;
    }

    /**
     * Set the dataDiskIds property: Gets data disks blob uri for the virtual machine.
     *
     * @param dataDiskIds the dataDiskIds value to set.
     * @return the ComputeVmProperties object itself.
     */
    public ComputeVmProperties withDataDiskIds(List<String> dataDiskIds) {
        this.dataDiskIds = dataDiskIds;
        return this;
    }

    /**
     * Get the dataDisks property: Gets all data disks attached to the virtual machine.
     *
     * @return the dataDisks value.
     */
    public List<ComputeDataDisk> dataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks property: Gets all data disks attached to the virtual machine.
     *
     * @param dataDisks the dataDisks value to set.
     * @return the ComputeVmProperties object itself.
     */
    public ComputeVmProperties withDataDisks(List<ComputeDataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
        if (dataDisks() != null) {
            dataDisks().forEach(e -> e.validate());
        }
    }
}
