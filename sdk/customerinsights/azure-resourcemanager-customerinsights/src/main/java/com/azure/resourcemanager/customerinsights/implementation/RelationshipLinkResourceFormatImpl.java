// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.customerinsights.fluent.models.RelationshipLinkResourceFormatInner;
import com.azure.resourcemanager.customerinsights.models.ParticipantProfilePropertyReference;
import com.azure.resourcemanager.customerinsights.models.ProvisioningStates;
import com.azure.resourcemanager.customerinsights.models.RelationshipLinkFieldMapping;
import com.azure.resourcemanager.customerinsights.models.RelationshipLinkResourceFormat;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class RelationshipLinkResourceFormatImpl
    implements RelationshipLinkResourceFormat,
        RelationshipLinkResourceFormat.Definition,
        RelationshipLinkResourceFormat.Update {
    private RelationshipLinkResourceFormatInner innerObject;

    private final com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Map<String, String> displayName() {
        Map<String, String> inner = this.innerModel().displayName();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Map<String, String> description() {
        Map<String, String> inner = this.innerModel().description();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String interactionType() {
        return this.innerModel().interactionType();
    }

    public String linkName() {
        return this.innerModel().linkName();
    }

    public List<RelationshipLinkFieldMapping> mappings() {
        List<RelationshipLinkFieldMapping> inner = this.innerModel().mappings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ParticipantProfilePropertyReference> profilePropertyReferences() {
        List<ParticipantProfilePropertyReference> inner = this.innerModel().profilePropertyReferences();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningStates provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<ParticipantProfilePropertyReference> relatedProfilePropertyReferences() {
        List<ParticipantProfilePropertyReference> inner = this.innerModel().relatedProfilePropertyReferences();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String relationshipName() {
        return this.innerModel().relationshipName();
    }

    public String relationshipGuidId() {
        return this.innerModel().relationshipGuidId();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public RelationshipLinkResourceFormatInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String hubName;

    private String relationshipLinkName;

    public RelationshipLinkResourceFormatImpl withExistingHub(String resourceGroupName, String hubName) {
        this.resourceGroupName = resourceGroupName;
        this.hubName = hubName;
        return this;
    }

    public RelationshipLinkResourceFormat create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRelationshipLinks()
                .createOrUpdate(resourceGroupName, hubName, relationshipLinkName, this.innerModel(), Context.NONE);
        return this;
    }

    public RelationshipLinkResourceFormat create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRelationshipLinks()
                .createOrUpdate(resourceGroupName, hubName, relationshipLinkName, this.innerModel(), context);
        return this;
    }

    RelationshipLinkResourceFormatImpl(
        String name, com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerObject = new RelationshipLinkResourceFormatInner();
        this.serviceManager = serviceManager;
        this.relationshipLinkName = name;
    }

    public RelationshipLinkResourceFormatImpl update() {
        return this;
    }

    public RelationshipLinkResourceFormat apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRelationshipLinks()
                .createOrUpdate(resourceGroupName, hubName, relationshipLinkName, this.innerModel(), Context.NONE);
        return this;
    }

    public RelationshipLinkResourceFormat apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRelationshipLinks()
                .createOrUpdate(resourceGroupName, hubName, relationshipLinkName, this.innerModel(), context);
        return this;
    }

    RelationshipLinkResourceFormatImpl(
        RelationshipLinkResourceFormatInner innerObject,
        com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.hubName = Utils.getValueFromIdByName(innerObject.id(), "hubs");
        this.relationshipLinkName = Utils.getValueFromIdByName(innerObject.id(), "relationshipLinks");
    }

    public RelationshipLinkResourceFormat refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRelationshipLinks()
                .getWithResponse(resourceGroupName, hubName, relationshipLinkName, Context.NONE)
                .getValue();
        return this;
    }

    public RelationshipLinkResourceFormat refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRelationshipLinks()
                .getWithResponse(resourceGroupName, hubName, relationshipLinkName, context)
                .getValue();
        return this;
    }

    public RelationshipLinkResourceFormatImpl withDisplayName(Map<String, String> displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public RelationshipLinkResourceFormatImpl withDescription(Map<String, String> description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public RelationshipLinkResourceFormatImpl withInteractionType(String interactionType) {
        this.innerModel().withInteractionType(interactionType);
        return this;
    }

    public RelationshipLinkResourceFormatImpl withMappings(List<RelationshipLinkFieldMapping> mappings) {
        this.innerModel().withMappings(mappings);
        return this;
    }

    public RelationshipLinkResourceFormatImpl withProfilePropertyReferences(
        List<ParticipantProfilePropertyReference> profilePropertyReferences) {
        this.innerModel().withProfilePropertyReferences(profilePropertyReferences);
        return this;
    }

    public RelationshipLinkResourceFormatImpl withRelatedProfilePropertyReferences(
        List<ParticipantProfilePropertyReference> relatedProfilePropertyReferences) {
        this.innerModel().withRelatedProfilePropertyReferences(relatedProfilePropertyReferences);
        return this;
    }

    public RelationshipLinkResourceFormatImpl withRelationshipName(String relationshipName) {
        this.innerModel().withRelationshipName(relationshipName);
        return this;
    }
}
