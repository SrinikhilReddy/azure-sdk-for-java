// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SqlPoolSensitivityLabels. */
public interface SqlPoolSensitivityLabels {
    /**
     * Gets SQL pool sensitivity labels.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sQL pool sensitivity labels.
     */
    PagedIterable<SensitivityLabel> listCurrent(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Gets SQL pool sensitivity labels.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sQL pool sensitivity labels.
     */
    PagedIterable<SensitivityLabel> listCurrent(
        String resourceGroupName, String workspaceName, String sqlPoolName, String filter, Context context);

    /**
     * Update sensitivity labels of a given SQL Pool using an operations batch.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param parameters A list of sensitivity label update operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void update(
        String resourceGroupName, String workspaceName, String sqlPoolName, SensitivityLabelUpdateList parameters);

    /**
     * Update sensitivity labels of a given SQL Pool using an operations batch.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param parameters A list of sensitivity label update operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> updateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        SensitivityLabelUpdateList parameters,
        Context context);

    /**
     * Gets sensitivity labels of a given SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sensitivity labels of a given SQL pool.
     */
    PagedIterable<SensitivityLabel> listRecommended(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Gets sensitivity labels of a given SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param includeDisabledRecommendations Specifies whether to include disabled recommendations or not.
     * @param skipToken An OData query option to indicate how many elements to skip in the collection.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sensitivity labels of a given SQL pool.
     */
    PagedIterable<SensitivityLabel> listRecommended(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        Boolean includeDisabledRecommendations,
        String skipToken,
        String filter,
        Context context);

    /**
     * Deletes the sensitivity label of a given column in a Sql pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName);

    /**
     * Deletes the sensitivity label of a given column in a Sql pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName,
        Context context);

    /**
     * Gets the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param sensitivityLabelSource The source of the sensitivity label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sensitivity label of a given column.
     */
    SensitivityLabel get(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelSource sensitivityLabelSource);

    /**
     * Gets the sensitivity label of a given column.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param sensitivityLabelSource The source of the sensitivity label.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the sensitivity label of a given column.
     */
    Response<SensitivityLabel> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName,
        SensitivityLabelSource sensitivityLabelSource,
        Context context);

    /**
     * Enables sensitivity recommendations on a given column (recommendations are enabled by default on all columns).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enableRecommendation(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName);

    /**
     * Enables sensitivity recommendations on a given column (recommendations are enabled by default on all columns).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> enableRecommendationWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName,
        Context context);

    /**
     * Disables sensitivity recommendations on a given column.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disableRecommendation(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName);

    /**
     * Disables sensitivity recommendations on a given column.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param sqlPoolName SQL pool name.
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param columnName The name of the column.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> disableRecommendationWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String schemaName,
        String tableName,
        String columnName,
        Context context);

    /**
     * Deletes the sensitivity label of a given column in a Sql pool.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the sensitivity label of a given column in a Sql pool.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SensitivityLabel resource.
     *
     * @return the first stage of the new SensitivityLabel definition.
     */
    SensitivityLabel.DefinitionStages.Blank define();
}
