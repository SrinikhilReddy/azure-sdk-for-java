// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.ModulesClient;
import com.azure.resourcemanager.automation.fluent.models.ModuleInner;
import com.azure.resourcemanager.automation.models.Module;
import com.azure.resourcemanager.automation.models.ModuleCreateOrUpdateParameters;
import com.azure.resourcemanager.automation.models.ModuleUpdateParameters;
import com.azure.resourcemanager.automation.models.Modules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ModulesImpl implements Modules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ModulesImpl.class);

    private final ModulesClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public ModulesImpl(
        ModulesClient innerClient, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String automationAccountName, String moduleName) {
        this.serviceClient().delete(resourceGroupName, automationAccountName, moduleName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String automationAccountName, String moduleName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, automationAccountName, moduleName, context);
    }

    public Module get(String resourceGroupName, String automationAccountName, String moduleName) {
        ModuleInner inner = this.serviceClient().get(resourceGroupName, automationAccountName, moduleName);
        if (inner != null) {
            return new ModuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Module> getWithResponse(
        String resourceGroupName, String automationAccountName, String moduleName, Context context) {
        Response<ModuleInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, automationAccountName, moduleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ModuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Module createOrUpdate(
        String resourceGroupName,
        String automationAccountName,
        String moduleName,
        ModuleCreateOrUpdateParameters parameters) {
        ModuleInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, automationAccountName, moduleName, parameters);
        if (inner != null) {
            return new ModuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Module> createOrUpdateWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String moduleName,
        ModuleCreateOrUpdateParameters parameters,
        Context context) {
        Response<ModuleInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(resourceGroupName, automationAccountName, moduleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ModuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Module update(
        String resourceGroupName, String automationAccountName, String moduleName, ModuleUpdateParameters parameters) {
        ModuleInner inner =
            this.serviceClient().update(resourceGroupName, automationAccountName, moduleName, parameters);
        if (inner != null) {
            return new ModuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Module> updateWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String moduleName,
        ModuleUpdateParameters parameters,
        Context context) {
        Response<ModuleInner> inner =
            this
                .serviceClient()
                .updateWithResponse(resourceGroupName, automationAccountName, moduleName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ModuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Module> listByAutomationAccount(String resourceGroupName, String automationAccountName) {
        PagedIterable<ModuleInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName);
        return Utils.mapPage(inner, inner1 -> new ModuleImpl(inner1, this.manager()));
    }

    public PagedIterable<Module> listByAutomationAccount(
        String resourceGroupName, String automationAccountName, Context context) {
        PagedIterable<ModuleInner> inner =
            this.serviceClient().listByAutomationAccount(resourceGroupName, automationAccountName, context);
        return Utils.mapPage(inner, inner1 -> new ModuleImpl(inner1, this.manager()));
    }

    private ModulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}
