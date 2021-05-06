// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.fluent.DomainsClient;
import com.azure.resourcemanager.eventgrid.fluent.models.DomainInner;
import com.azure.resourcemanager.eventgrid.fluent.models.DomainSharedAccessKeysInner;
import com.azure.resourcemanager.eventgrid.models.Domain;
import com.azure.resourcemanager.eventgrid.models.DomainRegenerateKeyRequest;
import com.azure.resourcemanager.eventgrid.models.DomainSharedAccessKeys;
import com.azure.resourcemanager.eventgrid.models.Domains;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DomainsImpl implements Domains {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DomainsImpl.class);

    private final DomainsClient innerClient;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    public DomainsImpl(DomainsClient innerClient, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Domain getByResourceGroup(String resourceGroupName, String domainName) {
        DomainInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, domainName);
        if (inner != null) {
            return new DomainImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Domain> getByResourceGroupWithResponse(
        String resourceGroupName, String domainName, Context context) {
        Response<DomainInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, domainName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DomainImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String domainName) {
        this.serviceClient().delete(resourceGroupName, domainName);
    }

    public void delete(String resourceGroupName, String domainName, Context context) {
        this.serviceClient().delete(resourceGroupName, domainName, context);
    }

    public PagedIterable<Domain> list() {
        PagedIterable<DomainInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DomainImpl(inner1, this.manager()));
    }

    public PagedIterable<Domain> list(String filter, Integer top, Context context) {
        PagedIterable<DomainInner> inner = this.serviceClient().list(filter, top, context);
        return Utils.mapPage(inner, inner1 -> new DomainImpl(inner1, this.manager()));
    }

    public PagedIterable<Domain> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DomainInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new DomainImpl(inner1, this.manager()));
    }

    public PagedIterable<Domain> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context) {
        PagedIterable<DomainInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new DomainImpl(inner1, this.manager()));
    }

    public DomainSharedAccessKeys listSharedAccessKeys(String resourceGroupName, String domainName) {
        DomainSharedAccessKeysInner inner = this.serviceClient().listSharedAccessKeys(resourceGroupName, domainName);
        if (inner != null) {
            return new DomainSharedAccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DomainSharedAccessKeys> listSharedAccessKeysWithResponse(
        String resourceGroupName, String domainName, Context context) {
        Response<DomainSharedAccessKeysInner> inner =
            this.serviceClient().listSharedAccessKeysWithResponse(resourceGroupName, domainName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DomainSharedAccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DomainSharedAccessKeys regenerateKey(
        String resourceGroupName, String domainName, DomainRegenerateKeyRequest regenerateKeyRequest) {
        DomainSharedAccessKeysInner inner =
            this.serviceClient().regenerateKey(resourceGroupName, domainName, regenerateKeyRequest);
        if (inner != null) {
            return new DomainSharedAccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DomainSharedAccessKeys> regenerateKeyWithResponse(
        String resourceGroupName, String domainName, DomainRegenerateKeyRequest regenerateKeyRequest, Context context) {
        Response<DomainSharedAccessKeysInner> inner =
            this
                .serviceClient()
                .regenerateKeyWithResponse(resourceGroupName, domainName, regenerateKeyRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DomainSharedAccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Domain getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, domainName, Context.NONE).getValue();
    }

    public Response<Domain> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, domainName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        this.delete(resourceGroupName, domainName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        this.delete(resourceGroupName, domainName, context);
    }

    private DomainsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }

    public DomainImpl define(String name) {
        return new DomainImpl(name, this.manager());
    }
}
