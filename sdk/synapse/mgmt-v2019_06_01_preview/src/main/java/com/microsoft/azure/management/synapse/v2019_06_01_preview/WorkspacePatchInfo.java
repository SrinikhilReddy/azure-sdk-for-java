/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Workspace patch details.
 */
@JsonFlatten
public class WorkspacePatchInfo {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The identity of the workspace.
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /**
     * SQL administrator login password.
     */
    @JsonProperty(value = "properties.sqlAdministratorLoginPassword")
    private String sqlAdministratorLoginPassword;

    /**
     * Managed Virtual Network Settings.
     */
    @JsonProperty(value = "properties.managedVirtualNetworkSettings")
    private ManagedVirtualNetworkSettings managedVirtualNetworkSettings;

    /**
     * Git integration settings.
     */
    @JsonProperty(value = "properties.workspaceRepositoryConfiguration")
    private WorkspaceRepositoryConfiguration workspaceRepositoryConfiguration;

    /**
     * Purview Configuration.
     */
    @JsonProperty(value = "properties.purviewConfiguration")
    private PurviewConfiguration purviewConfiguration;

    /**
     * Resource provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The encryption details of the workspace.
     */
    @JsonProperty(value = "properties.encryption")
    private EncryptionDetails encryption;

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity of the workspace.
     *
     * @return the identity value
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity of the workspace.
     *
     * @param identity the identity value to set
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get sQL administrator login password.
     *
     * @return the sqlAdministratorLoginPassword value
     */
    public String sqlAdministratorLoginPassword() {
        return this.sqlAdministratorLoginPassword;
    }

    /**
     * Set sQL administrator login password.
     *
     * @param sqlAdministratorLoginPassword the sqlAdministratorLoginPassword value to set
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withSqlAdministratorLoginPassword(String sqlAdministratorLoginPassword) {
        this.sqlAdministratorLoginPassword = sqlAdministratorLoginPassword;
        return this;
    }

    /**
     * Get managed Virtual Network Settings.
     *
     * @return the managedVirtualNetworkSettings value
     */
    public ManagedVirtualNetworkSettings managedVirtualNetworkSettings() {
        return this.managedVirtualNetworkSettings;
    }

    /**
     * Set managed Virtual Network Settings.
     *
     * @param managedVirtualNetworkSettings the managedVirtualNetworkSettings value to set
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withManagedVirtualNetworkSettings(ManagedVirtualNetworkSettings managedVirtualNetworkSettings) {
        this.managedVirtualNetworkSettings = managedVirtualNetworkSettings;
        return this;
    }

    /**
     * Get git integration settings.
     *
     * @return the workspaceRepositoryConfiguration value
     */
    public WorkspaceRepositoryConfiguration workspaceRepositoryConfiguration() {
        return this.workspaceRepositoryConfiguration;
    }

    /**
     * Set git integration settings.
     *
     * @param workspaceRepositoryConfiguration the workspaceRepositoryConfiguration value to set
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withWorkspaceRepositoryConfiguration(WorkspaceRepositoryConfiguration workspaceRepositoryConfiguration) {
        this.workspaceRepositoryConfiguration = workspaceRepositoryConfiguration;
        return this;
    }

    /**
     * Get purview Configuration.
     *
     * @return the purviewConfiguration value
     */
    public PurviewConfiguration purviewConfiguration() {
        return this.purviewConfiguration;
    }

    /**
     * Set purview Configuration.
     *
     * @param purviewConfiguration the purviewConfiguration value to set
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withPurviewConfiguration(PurviewConfiguration purviewConfiguration) {
        this.purviewConfiguration = purviewConfiguration;
        return this;
    }

    /**
     * Get resource provisioning state.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the encryption details of the workspace.
     *
     * @return the encryption value
     */
    public EncryptionDetails encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption details of the workspace.
     *
     * @param encryption the encryption value to set
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withEncryption(EncryptionDetails encryption) {
        this.encryption = encryption;
        return this;
    }

}
