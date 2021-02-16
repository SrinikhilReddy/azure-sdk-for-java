/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a Power BI output data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = PowerBIOutputDataSource.class)
@JsonTypeName("PowerBI")
@JsonFlatten
public class PowerBIOutputDataSource extends OutputDataSource {
    /**
     * A refresh token that can be used to obtain a valid access token that can
     * then be used to authenticate with the data source. A valid refresh token
     * is currently only obtainable via the Azure Portal. It is recommended to
     * put a dummy string value here when creating the data source and then
     * going to the Azure Portal to authenticate the data source which will
     * update this property with a valid refresh token. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.refreshToken")
    private String refreshToken;

    /**
     * The user principal name (UPN) of the user that was used to obtain the
     * refresh token. Use this property to help remember which user was used to
     * obtain the refresh token.
     */
    @JsonProperty(value = "properties.tokenUserPrincipalName")
    private String tokenUserPrincipalName;

    /**
     * The user display name of the user that was used to obtain the refresh
     * token. Use this property to help remember which user was used to obtain
     * the refresh token.
     */
    @JsonProperty(value = "properties.tokenUserDisplayName")
    private String tokenUserDisplayName;

    /**
     * The name of the Power BI dataset. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "properties.dataset")
    private String dataset;

    /**
     * The name of the Power BI table under the specified dataset. Required on
     * PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.table")
    private String table;

    /**
     * The ID of the Power BI group.
     */
    @JsonProperty(value = "properties.groupId")
    private String groupId;

    /**
     * The name of the Power BI group. Use this property to help remember which
     * specific Power BI group id was used.
     */
    @JsonProperty(value = "properties.groupName")
    private String groupName;

    /**
     * Authentication Mode. Possible values include: 'Msi', 'UserToken',
     * 'ConnectionString'.
     */
    @JsonProperty(value = "properties.authenticationMode")
    private AuthenticationMode authenticationMode;

    /**
     * Get a refresh token that can be used to obtain a valid access token that can then be used to authenticate with the data source. A valid refresh token is currently only obtainable via the Azure Portal. It is recommended to put a dummy string value here when creating the data source and then going to the Azure Portal to authenticate the data source which will update this property with a valid refresh token. Required on PUT (CreateOrReplace) requests.
     *
     * @return the refreshToken value
     */
    public String refreshToken() {
        return this.refreshToken;
    }

    /**
     * Set a refresh token that can be used to obtain a valid access token that can then be used to authenticate with the data source. A valid refresh token is currently only obtainable via the Azure Portal. It is recommended to put a dummy string value here when creating the data source and then going to the Azure Portal to authenticate the data source which will update this property with a valid refresh token. Required on PUT (CreateOrReplace) requests.
     *
     * @param refreshToken the refreshToken value to set
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the user principal name (UPN) of the user that was used to obtain the refresh token. Use this property to help remember which user was used to obtain the refresh token.
     *
     * @return the tokenUserPrincipalName value
     */
    public String tokenUserPrincipalName() {
        return this.tokenUserPrincipalName;
    }

    /**
     * Set the user principal name (UPN) of the user that was used to obtain the refresh token. Use this property to help remember which user was used to obtain the refresh token.
     *
     * @param tokenUserPrincipalName the tokenUserPrincipalName value to set
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withTokenUserPrincipalName(String tokenUserPrincipalName) {
        this.tokenUserPrincipalName = tokenUserPrincipalName;
        return this;
    }

    /**
     * Get the user display name of the user that was used to obtain the refresh token. Use this property to help remember which user was used to obtain the refresh token.
     *
     * @return the tokenUserDisplayName value
     */
    public String tokenUserDisplayName() {
        return this.tokenUserDisplayName;
    }

    /**
     * Set the user display name of the user that was used to obtain the refresh token. Use this property to help remember which user was used to obtain the refresh token.
     *
     * @param tokenUserDisplayName the tokenUserDisplayName value to set
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withTokenUserDisplayName(String tokenUserDisplayName) {
        this.tokenUserDisplayName = tokenUserDisplayName;
        return this;
    }

    /**
     * Get the name of the Power BI dataset. Required on PUT (CreateOrReplace) requests.
     *
     * @return the dataset value
     */
    public String dataset() {
        return this.dataset;
    }

    /**
     * Set the name of the Power BI dataset. Required on PUT (CreateOrReplace) requests.
     *
     * @param dataset the dataset value to set
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withDataset(String dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get the name of the Power BI table under the specified dataset. Required on PUT (CreateOrReplace) requests.
     *
     * @return the table value
     */
    public String table() {
        return this.table;
    }

    /**
     * Set the name of the Power BI table under the specified dataset. Required on PUT (CreateOrReplace) requests.
     *
     * @param table the table value to set
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Get the ID of the Power BI group.
     *
     * @return the groupId value
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the ID of the Power BI group.
     *
     * @param groupId the groupId value to set
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the name of the Power BI group. Use this property to help remember which specific Power BI group id was used.
     *
     * @return the groupName value
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Set the name of the Power BI group. Use this property to help remember which specific Power BI group id was used.
     *
     * @param groupName the groupName value to set
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Get authentication Mode. Possible values include: 'Msi', 'UserToken', 'ConnectionString'.
     *
     * @return the authenticationMode value
     */
    public AuthenticationMode authenticationMode() {
        return this.authenticationMode;
    }

    /**
     * Set authentication Mode. Possible values include: 'Msi', 'UserToken', 'ConnectionString'.
     *
     * @param authenticationMode the authenticationMode value to set
     * @return the PowerBIOutputDataSource object itself.
     */
    public PowerBIOutputDataSource withAuthenticationMode(AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }

}
