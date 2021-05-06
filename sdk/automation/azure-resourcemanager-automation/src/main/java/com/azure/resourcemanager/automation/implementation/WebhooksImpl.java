// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.WebhooksClient;
import com.azure.resourcemanager.automation.fluent.models.WebhookInner;
import com.azure.resourcemanager.automation.models.Webhook;
import com.azure.resourcemanager.automation.models.Webhooks;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WebhooksImpl implements Webhooks {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebhooksImpl.class);

    private final WebhooksClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public WebhooksImpl(
        WebhooksClient innerClient, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public String generateUri(String resourceGroupName, String automationAccountName) {
        return this.serviceClient().generateUri(resourceGroupName, automationAccountName);
    }

    public Response<String> generateUriWithResponse(
        String resourceGroupName, String automationAccountName, Context context) {
        return this.serviceClient().generateUriWithResponse(resourceGroupName, automationAccountName, context);
    }

    public void delete(String resourceGroupName, String automationAccountName, String webhookName) {
        this.serviceClient().delete(resourceGroupName, automationAccountName, webhookName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String automationAccountName, String webhookName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, automationAccountName, webhookName, context);
    }

    public Webhook get(String resourceGroupName, String automationAccountName, String webhookName) {
        WebhookInner inner = this.serviceClient().get(resourceGroupName, automationAccountName, webhookName);
        if (inner != null) {
            return new WebhookImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Webhook> getWithResponse(
        String resourceGroupName, String automationAccountName, String webhookName, Context context) {
        Response<WebhookInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, automationAccountName, webhookName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WebhookImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Webhook> listByAutomationAccount(String resourceGroupName, String automationAccountName) {
        PagedIterable<WebhookInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName);
        return Utils.mapPage(inner, inner1 -> new WebhookImpl(inner1, this.manager()));
    }

    public PagedIterable<Webhook> listByAutomationAccount(
        String resourceGroupName, String automationAccountName, String filter, Context context) {
        PagedIterable<WebhookInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName, filter, context);
        return Utils.mapPage(inner, inner1 -> new WebhookImpl(inner1, this.manager()));
    }

    public Webhook getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String webhookName = Utils.getValueFromIdByName(id, "webhooks");
        if (webhookName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webhooks'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, webhookName, Context.NONE).getValue();
    }

    public Response<Webhook> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String webhookName = Utils.getValueFromIdByName(id, "webhooks");
        if (webhookName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webhooks'.", id)));
        }
        return this.getWithResponse(resourceGroupName, automationAccountName, webhookName, context);
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
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String webhookName = Utils.getValueFromIdByName(id, "webhooks");
        if (webhookName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webhooks'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, automationAccountName, webhookName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String automationAccountName = Utils.getValueFromIdByName(id, "automationAccounts");
        if (automationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'automationAccounts'.", id)));
        }
        String webhookName = Utils.getValueFromIdByName(id, "webhooks");
        if (webhookName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'webhooks'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, automationAccountName, webhookName, context);
    }

    private WebhooksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    public WebhookImpl define(String name) {
        return new WebhookImpl(name, this.manager());
    }
}
