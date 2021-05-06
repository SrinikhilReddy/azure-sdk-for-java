// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.resourcemanager.billing.fluent.models.ReservationInner;
import com.azure.resourcemanager.billing.models.Reservation;
import com.azure.resourcemanager.billing.models.ReservationPropertyUtilization;
import com.azure.resourcemanager.billing.models.ReservationSkuProperty;
import java.util.Collections;
import java.util.List;

public final class ReservationImpl implements Reservation {
    private ReservationInner innerObject;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    ReservationImpl(ReservationInner innerObject, com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public ReservationSkuProperty sku() {
        return this.innerModel().sku();
    }

    public List<String> appliedScopes() {
        List<String> inner = this.innerModel().appliedScopes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String appliedScopeType() {
        return this.innerModel().appliedScopeType();
    }

    public String reservedResourceType() {
        return this.innerModel().reservedResourceType();
    }

    public Float quantity() {
        return this.innerModel().quantity();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String expiryDate() {
        return this.innerModel().expiryDate();
    }

    public String provisioningSubState() {
        return this.innerModel().provisioningSubState();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String displayProvisioningState() {
        return this.innerModel().displayProvisioningState();
    }

    public String userFriendlyRenewState() {
        return this.innerModel().userFriendlyRenewState();
    }

    public String userFriendlyAppliedScopeType() {
        return this.innerModel().userFriendlyAppliedScopeType();
    }

    public String effectiveDateTime() {
        return this.innerModel().effectiveDateTime();
    }

    public String skuDescription() {
        return this.innerModel().skuDescription();
    }

    public String term() {
        return this.innerModel().term();
    }

    public Boolean renew() {
        return this.innerModel().renew();
    }

    public String renewSource() {
        return this.innerModel().renewSource();
    }

    public ReservationPropertyUtilization utilization() {
        return this.innerModel().utilization();
    }

    public ReservationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
