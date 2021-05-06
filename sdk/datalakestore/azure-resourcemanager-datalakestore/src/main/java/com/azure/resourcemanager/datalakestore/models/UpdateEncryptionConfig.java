// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The encryption configuration used to update a user managed Key Vault key. */
@Fluent
public final class UpdateEncryptionConfig {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpdateEncryptionConfig.class);

    /*
     * The updated Key Vault key to use in user managed key rotation.
     */
    @JsonProperty(value = "keyVaultMetaInfo")
    private UpdateKeyVaultMetaInfo keyVaultMetaInfo;

    /**
     * Get the keyVaultMetaInfo property: The updated Key Vault key to use in user managed key rotation.
     *
     * @return the keyVaultMetaInfo value.
     */
    public UpdateKeyVaultMetaInfo keyVaultMetaInfo() {
        return this.keyVaultMetaInfo;
    }

    /**
     * Set the keyVaultMetaInfo property: The updated Key Vault key to use in user managed key rotation.
     *
     * @param keyVaultMetaInfo the keyVaultMetaInfo value to set.
     * @return the UpdateEncryptionConfig object itself.
     */
    public UpdateEncryptionConfig withKeyVaultMetaInfo(UpdateKeyVaultMetaInfo keyVaultMetaInfo) {
        this.keyVaultMetaInfo = keyVaultMetaInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultMetaInfo() != null) {
            keyVaultMetaInfo().validate();
        }
    }
}
