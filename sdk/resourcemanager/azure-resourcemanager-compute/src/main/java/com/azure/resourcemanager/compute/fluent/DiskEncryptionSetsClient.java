// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.fluent.models.DiskEncryptionSetInner;
import com.azure.resourcemanager.compute.models.DiskEncryptionSetUpdate;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DiskEncryptionSetsClient. */
public interface DiskEncryptionSetsClient
    extends InnerSupportsGet<DiskEncryptionSetInner>,
        InnerSupportsListing<DiskEncryptionSetInner>,
        InnerSupportsDelete<Void> {
    /**
     * Creates or updates a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param diskEncryptionSet disk encryption set resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk encryption set resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String diskEncryptionSetName, DiskEncryptionSetInner diskEncryptionSet);

    /**
     * Creates or updates a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param diskEncryptionSet disk encryption set resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk encryption set resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<DiskEncryptionSetInner>, DiskEncryptionSetInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String diskEncryptionSetName, DiskEncryptionSetInner diskEncryptionSet);

    /**
     * Creates or updates a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param diskEncryptionSet disk encryption set resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk encryption set resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DiskEncryptionSetInner>, DiskEncryptionSetInner> beginCreateOrUpdate(
        String resourceGroupName, String diskEncryptionSetName, DiskEncryptionSetInner diskEncryptionSet);

    /**
     * Creates or updates a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param diskEncryptionSet disk encryption set resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk encryption set resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DiskEncryptionSetInner>, DiskEncryptionSetInner> beginCreateOrUpdate(
        String resourceGroupName,
        String diskEncryptionSetName,
        DiskEncryptionSetInner diskEncryptionSet,
        Context context);

    /**
     * Creates or updates a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param diskEncryptionSet disk encryption set resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk encryption set resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DiskEncryptionSetInner> createOrUpdateAsync(
        String resourceGroupName, String diskEncryptionSetName, DiskEncryptionSetInner diskEncryptionSet);

    /**
     * Creates or updates a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param diskEncryptionSet disk encryption set resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk encryption set resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskEncryptionSetInner createOrUpdate(
        String resourceGroupName, String diskEncryptionSetName, DiskEncryptionSetInner diskEncryptionSet);

    /**
     * Creates or updates a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param diskEncryptionSet disk encryption set resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk encryption set resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskEncryptionSetInner createOrUpdate(
        String resourceGroupName,
        String diskEncryptionSetName,
        DiskEncryptionSetInner diskEncryptionSet,
        Context context);

    /**
     * Updates (patches) a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param diskEncryptionSet disk encryption set update resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk encryption set resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName, String diskEncryptionSetName, DiskEncryptionSetUpdate diskEncryptionSet);

    /**
     * Updates (patches) a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param diskEncryptionSet disk encryption set update resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk encryption set resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<DiskEncryptionSetInner>, DiskEncryptionSetInner> beginUpdateAsync(
        String resourceGroupName, String diskEncryptionSetName, DiskEncryptionSetUpdate diskEncryptionSet);

    /**
     * Updates (patches) a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param diskEncryptionSet disk encryption set update resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk encryption set resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DiskEncryptionSetInner>, DiskEncryptionSetInner> beginUpdate(
        String resourceGroupName, String diskEncryptionSetName, DiskEncryptionSetUpdate diskEncryptionSet);

    /**
     * Updates (patches) a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param diskEncryptionSet disk encryption set update resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk encryption set resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DiskEncryptionSetInner>, DiskEncryptionSetInner> beginUpdate(
        String resourceGroupName,
        String diskEncryptionSetName,
        DiskEncryptionSetUpdate diskEncryptionSet,
        Context context);

    /**
     * Updates (patches) a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param diskEncryptionSet disk encryption set update resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk encryption set resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DiskEncryptionSetInner> updateAsync(
        String resourceGroupName, String diskEncryptionSetName, DiskEncryptionSetUpdate diskEncryptionSet);

    /**
     * Updates (patches) a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param diskEncryptionSet disk encryption set update resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk encryption set resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskEncryptionSetInner update(
        String resourceGroupName, String diskEncryptionSetName, DiskEncryptionSetUpdate diskEncryptionSet);

    /**
     * Updates (patches) a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param diskEncryptionSet disk encryption set update resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk encryption set resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskEncryptionSetInner update(
        String resourceGroupName,
        String diskEncryptionSetName,
        DiskEncryptionSetUpdate diskEncryptionSet,
        Context context);

    /**
     * Gets information about a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk encryption set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DiskEncryptionSetInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String diskEncryptionSetName);

    /**
     * Gets information about a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk encryption set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DiskEncryptionSetInner> getByResourceGroupAsync(String resourceGroupName, String diskEncryptionSetName);

    /**
     * Gets information about a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk encryption set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskEncryptionSetInner getByResourceGroup(String resourceGroupName, String diskEncryptionSetName);

    /**
     * Gets information about a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk encryption set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiskEncryptionSetInner> getByResourceGroupWithResponse(
        String resourceGroupName, String diskEncryptionSetName, Context context);

    /**
     * Deletes a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String diskEncryptionSetName);

    /**
     * Deletes a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String diskEncryptionSetName);

    /**
     * Deletes a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String diskEncryptionSetName);

    /**
     * Deletes a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String diskEncryptionSetName, Context context);

    /**
     * Deletes a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String diskEncryptionSetName);

    /**
     * Deletes a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String diskEncryptionSetName);

    /**
     * Deletes a disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String diskEncryptionSetName, Context context);

    /**
     * Lists all the disk encryption sets under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk encryption set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DiskEncryptionSetInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists all the disk encryption sets under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk encryption set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskEncryptionSetInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the disk encryption sets under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk encryption set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskEncryptionSetInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the disk encryption sets under a subscription.
     *
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk encryption set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DiskEncryptionSetInner> listAsync();

    /**
     * Lists all the disk encryption sets under a subscription.
     *
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk encryption set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskEncryptionSetInner> list();

    /**
     * Lists all the disk encryption sets under a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk encryption set operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskEncryptionSetInner> list(Context context);

    /**
     * Lists all resources that are encrypted with this disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List resources which are encrypted with the disk encryption set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<String> listAssociatedResourcesAsync(String resourceGroupName, String diskEncryptionSetName);

    /**
     * Lists all resources that are encrypted with this disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List resources which are encrypted with the disk encryption set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<String> listAssociatedResources(String resourceGroupName, String diskEncryptionSetName);

    /**
     * Lists all resources that are encrypted with this disk encryption set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can't be changed
     *     after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The
     *     maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List resources which are encrypted with the disk encryption set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<String> listAssociatedResources(
        String resourceGroupName, String diskEncryptionSetName, Context context);
}
