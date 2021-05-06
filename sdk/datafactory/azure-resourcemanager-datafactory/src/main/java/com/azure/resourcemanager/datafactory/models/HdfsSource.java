// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity HDFS source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HdfsSource")
@Fluent
public final class HdfsSource extends CopySource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HdfsSource.class);

    /*
     * If true, files under the folder path will be read recursively. Default
     * is true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "recursive")
    private Object recursive;

    /*
     * Specifies Distcp-related settings.
     */
    @JsonProperty(value = "distcpSettings")
    private DistcpSettings distcpSettings;

    /**
     * Get the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the recursive value.
     */
    public Object recursive() {
        return this.recursive;
    }

    /**
     * Set the recursive property: If true, files under the folder path will be read recursively. Default is true. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param recursive the recursive value to set.
     * @return the HdfsSource object itself.
     */
    public HdfsSource withRecursive(Object recursive) {
        this.recursive = recursive;
        return this;
    }

    /**
     * Get the distcpSettings property: Specifies Distcp-related settings.
     *
     * @return the distcpSettings value.
     */
    public DistcpSettings distcpSettings() {
        return this.distcpSettings;
    }

    /**
     * Set the distcpSettings property: Specifies Distcp-related settings.
     *
     * @param distcpSettings the distcpSettings value to set.
     * @return the HdfsSource object itself.
     */
    public HdfsSource withDistcpSettings(DistcpSettings distcpSettings) {
        this.distcpSettings = distcpSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HdfsSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HdfsSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HdfsSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (distcpSettings() != null) {
            distcpSettings().validate();
        }
    }
}
