// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.fluent.models.DataExportInner;
import com.azure.resourcemanager.loganalytics.models.DataExport;
import com.azure.resourcemanager.loganalytics.models.Type;
import java.util.Collections;
import java.util.List;

public final class DataExportImpl implements DataExport, DataExport.Definition, DataExport.Update {
    private DataExportInner innerObject;

    private final LogAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String dataExportId() {
        return this.innerModel().dataExportId();
    }

    public List<String> tableNames() {
        List<String> inner = this.innerModel().tableNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean enable() {
        return this.innerModel().enable();
    }

    public String createdDate() {
        return this.innerModel().createdDate();
    }

    public String lastModifiedDate() {
        return this.innerModel().lastModifiedDate();
    }

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public Type typePropertiesDestinationType() {
        return this.innerModel().typePropertiesDestinationType();
    }

    public String eventHubName() {
        return this.innerModel().eventHubName();
    }

    public DataExportInner innerModel() {
        return this.innerObject;
    }

    private LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String dataExportName;

    public DataExportImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public DataExport create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataExports()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, dataExportName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DataExport create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataExports()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, dataExportName, this.innerModel(), context)
                .getValue();
        return this;
    }

    DataExportImpl(String name, LogAnalyticsManager serviceManager) {
        this.innerObject = new DataExportInner();
        this.serviceManager = serviceManager;
        this.dataExportName = name;
    }

    public DataExportImpl update() {
        return this;
    }

    public DataExport apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataExports()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, dataExportName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DataExport apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataExports()
                .createOrUpdateWithResponse(
                    resourceGroupName, workspaceName, dataExportName, this.innerModel(), context)
                .getValue();
        return this;
    }

    DataExportImpl(DataExportInner innerObject, LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.dataExportName = Utils.getValueFromIdByName(innerObject.id(), "dataExports");
    }

    public DataExport refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataExports()
                .getWithResponse(resourceGroupName, workspaceName, dataExportName, Context.NONE)
                .getValue();
        return this;
    }

    public DataExport refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataExports()
                .getWithResponse(resourceGroupName, workspaceName, dataExportName, context)
                .getValue();
        return this;
    }

    public DataExportImpl withDataExportId(String dataExportId) {
        this.innerModel().withDataExportId(dataExportId);
        return this;
    }

    public DataExportImpl withTableNames(List<String> tableNames) {
        this.innerModel().withTableNames(tableNames);
        return this;
    }

    public DataExportImpl withEnable(Boolean enable) {
        this.innerModel().withEnable(enable);
        return this;
    }

    public DataExportImpl withCreatedDate(String createdDate) {
        this.innerModel().withCreatedDate(createdDate);
        return this;
    }

    public DataExportImpl withLastModifiedDate(String lastModifiedDate) {
        this.innerModel().withLastModifiedDate(lastModifiedDate);
        return this;
    }

    public DataExportImpl withResourceId(String resourceId) {
        this.innerModel().withResourceId(resourceId);
        return this;
    }

    public DataExportImpl withEventHubName(String eventHubName) {
        this.innerModel().withEventHubName(eventHubName);
        return this;
    }
}
