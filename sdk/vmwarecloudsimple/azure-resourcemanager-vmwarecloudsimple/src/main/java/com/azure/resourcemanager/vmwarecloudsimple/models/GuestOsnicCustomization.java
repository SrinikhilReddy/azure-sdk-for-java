// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Guest OS nic customization. */
@Fluent
public final class GuestOsnicCustomization {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GuestOsnicCustomization.class);

    /*
     * IP address allocation method
     */
    @JsonProperty(value = "allocation")
    private GuestOsnicCustomizationAllocation allocation;

    /*
     * List of dns servers to use
     */
    @JsonProperty(value = "dnsServers")
    private List<String> dnsServers;

    /*
     * Gateway addresses assigned to nic
     */
    @JsonProperty(value = "gateway")
    private List<String> gateway;

    /*
     * Static ip address for nic
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * Network mask for nic
     */
    @JsonProperty(value = "mask")
    private String mask;

    /*
     * primary WINS server for Windows
     */
    @JsonProperty(value = "primaryWinsServer")
    private String primaryWinsServer;

    /*
     * secondary WINS server for Windows
     */
    @JsonProperty(value = "secondaryWinsServer")
    private String secondaryWinsServer;

    /**
     * Get the allocation property: IP address allocation method.
     *
     * @return the allocation value.
     */
    public GuestOsnicCustomizationAllocation allocation() {
        return this.allocation;
    }

    /**
     * Set the allocation property: IP address allocation method.
     *
     * @param allocation the allocation value to set.
     * @return the GuestOsnicCustomization object itself.
     */
    public GuestOsnicCustomization withAllocation(GuestOsnicCustomizationAllocation allocation) {
        this.allocation = allocation;
        return this;
    }

    /**
     * Get the dnsServers property: List of dns servers to use.
     *
     * @return the dnsServers value.
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers property: List of dns servers to use.
     *
     * @param dnsServers the dnsServers value to set.
     * @return the GuestOsnicCustomization object itself.
     */
    public GuestOsnicCustomization withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get the gateway property: Gateway addresses assigned to nic.
     *
     * @return the gateway value.
     */
    public List<String> gateway() {
        return this.gateway;
    }

    /**
     * Set the gateway property: Gateway addresses assigned to nic.
     *
     * @param gateway the gateway value to set.
     * @return the GuestOsnicCustomization object itself.
     */
    public GuestOsnicCustomization withGateway(List<String> gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * Get the ipAddress property: Static ip address for nic.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: Static ip address for nic.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the GuestOsnicCustomization object itself.
     */
    public GuestOsnicCustomization withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the mask property: Network mask for nic.
     *
     * @return the mask value.
     */
    public String mask() {
        return this.mask;
    }

    /**
     * Set the mask property: Network mask for nic.
     *
     * @param mask the mask value to set.
     * @return the GuestOsnicCustomization object itself.
     */
    public GuestOsnicCustomization withMask(String mask) {
        this.mask = mask;
        return this;
    }

    /**
     * Get the primaryWinsServer property: primary WINS server for Windows.
     *
     * @return the primaryWinsServer value.
     */
    public String primaryWinsServer() {
        return this.primaryWinsServer;
    }

    /**
     * Set the primaryWinsServer property: primary WINS server for Windows.
     *
     * @param primaryWinsServer the primaryWinsServer value to set.
     * @return the GuestOsnicCustomization object itself.
     */
    public GuestOsnicCustomization withPrimaryWinsServer(String primaryWinsServer) {
        this.primaryWinsServer = primaryWinsServer;
        return this;
    }

    /**
     * Get the secondaryWinsServer property: secondary WINS server for Windows.
     *
     * @return the secondaryWinsServer value.
     */
    public String secondaryWinsServer() {
        return this.secondaryWinsServer;
    }

    /**
     * Set the secondaryWinsServer property: secondary WINS server for Windows.
     *
     * @param secondaryWinsServer the secondaryWinsServer value to set.
     * @return the GuestOsnicCustomization object itself.
     */
    public GuestOsnicCustomization withSecondaryWinsServer(String secondaryWinsServer) {
        this.secondaryWinsServer = secondaryWinsServer;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
