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

/** The ZipDeflate compression read settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ZipDeflateReadSettings")
@Fluent
public final class ZipDeflateReadSettings extends CompressionReadSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ZipDeflateReadSettings.class);

    /*
     * Preserve the zip file name as folder path. Type: boolean (or Expression
     * with resultType boolean).
     */
    @JsonProperty(value = "preserveZipFileNameAsFolder")
    private Object preserveZipFileNameAsFolder;

    /**
     * Get the preserveZipFileNameAsFolder property: Preserve the zip file name as folder path. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @return the preserveZipFileNameAsFolder value.
     */
    public Object preserveZipFileNameAsFolder() {
        return this.preserveZipFileNameAsFolder;
    }

    /**
     * Set the preserveZipFileNameAsFolder property: Preserve the zip file name as folder path. Type: boolean (or
     * Expression with resultType boolean).
     *
     * @param preserveZipFileNameAsFolder the preserveZipFileNameAsFolder value to set.
     * @return the ZipDeflateReadSettings object itself.
     */
    public ZipDeflateReadSettings withPreserveZipFileNameAsFolder(Object preserveZipFileNameAsFolder) {
        this.preserveZipFileNameAsFolder = preserveZipFileNameAsFolder;
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
    }
}
