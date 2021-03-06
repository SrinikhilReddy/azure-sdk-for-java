// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TokenStore model. */
@JsonFlatten
@Fluent
public class TokenStore extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TokenStore.class);

    /*
     * The enabled property.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /*
     * The tokenRefreshExtensionHours property.
     */
    @JsonProperty(value = "properties.tokenRefreshExtensionHours")
    private Double tokenRefreshExtensionHours;

    /*
     * The fileSystem property.
     */
    @JsonProperty(value = "properties.fileSystem")
    private FileSystemTokenStore fileSystem;

    /*
     * The azureBlobStorage property.
     */
    @JsonProperty(value = "properties.azureBlobStorage")
    private BlobStorageTokenStore azureBlobStorage;

    /**
     * Get the enabled property: The enabled property.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The enabled property.
     *
     * @param enabled the enabled value to set.
     * @return the TokenStore object itself.
     */
    public TokenStore withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the tokenRefreshExtensionHours property: The tokenRefreshExtensionHours property.
     *
     * @return the tokenRefreshExtensionHours value.
     */
    public Double tokenRefreshExtensionHours() {
        return this.tokenRefreshExtensionHours;
    }

    /**
     * Set the tokenRefreshExtensionHours property: The tokenRefreshExtensionHours property.
     *
     * @param tokenRefreshExtensionHours the tokenRefreshExtensionHours value to set.
     * @return the TokenStore object itself.
     */
    public TokenStore withTokenRefreshExtensionHours(Double tokenRefreshExtensionHours) {
        this.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
        return this;
    }

    /**
     * Get the fileSystem property: The fileSystem property.
     *
     * @return the fileSystem value.
     */
    public FileSystemTokenStore fileSystem() {
        return this.fileSystem;
    }

    /**
     * Set the fileSystem property: The fileSystem property.
     *
     * @param fileSystem the fileSystem value to set.
     * @return the TokenStore object itself.
     */
    public TokenStore withFileSystem(FileSystemTokenStore fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    /**
     * Get the azureBlobStorage property: The azureBlobStorage property.
     *
     * @return the azureBlobStorage value.
     */
    public BlobStorageTokenStore azureBlobStorage() {
        return this.azureBlobStorage;
    }

    /**
     * Set the azureBlobStorage property: The azureBlobStorage property.
     *
     * @param azureBlobStorage the azureBlobStorage value to set.
     * @return the TokenStore object itself.
     */
    public TokenStore withAzureBlobStorage(BlobStorageTokenStore azureBlobStorage) {
        this.azureBlobStorage = azureBlobStorage;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TokenStore withKind(String kind) {
        super.withKind(kind);
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
        if (fileSystem() != null) {
            fileSystem().validate();
        }
        if (azureBlobStorage() != null) {
            azureBlobStorage().validate();
        }
    }
}
