/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The cluster host information.
 */
public class HostInfoInner {
    /**
     * The host name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The Fully Qualified Domain Name of host.
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /**
     * The effective disk encryption key URL used by the host.
     */
    @JsonProperty(value = "effectiveDiskEncryptionKeyUrl")
    private String effectiveDiskEncryptionKeyUrl;

    /**
     * Get the host name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the host name.
     *
     * @param name the name value to set
     * @return the HostInfoInner object itself.
     */
    public HostInfoInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the Fully Qualified Domain Name of host.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the Fully Qualified Domain Name of host.
     *
     * @param fqdn the fqdn value to set
     * @return the HostInfoInner object itself.
     */
    public HostInfoInner withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the effective disk encryption key URL used by the host.
     *
     * @return the effectiveDiskEncryptionKeyUrl value
     */
    public String effectiveDiskEncryptionKeyUrl() {
        return this.effectiveDiskEncryptionKeyUrl;
    }

    /**
     * Set the effective disk encryption key URL used by the host.
     *
     * @param effectiveDiskEncryptionKeyUrl the effectiveDiskEncryptionKeyUrl value to set
     * @return the HostInfoInner object itself.
     */
    public HostInfoInner withEffectiveDiskEncryptionKeyUrl(String effectiveDiskEncryptionKeyUrl) {
        this.effectiveDiskEncryptionKeyUrl = effectiveDiskEncryptionKeyUrl;
        return this;
    }

}
