// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.resourcemanager.billing.fluent.models.BillingProfileInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of BillingProfile. */
public interface BillingProfile {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the displayName property: The name of the billing profile.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the poNumber property: The purchase order name that will appear on the invoices generated for the billing
     * profile.
     *
     * @return the poNumber value.
     */
    String poNumber();

    /**
     * Gets the billingRelationshipType property: Identifies which services and purchases are paid by a billing profile.
     *
     * @return the billingRelationshipType value.
     */
    BillingRelationshipType billingRelationshipType();

    /**
     * Gets the billTo property: Billing address.
     *
     * @return the billTo value.
     */
    AddressDetails billTo();

    /**
     * Gets the indirectRelationshipInfo property: Identifies the billing profile that is linked to another billing
     * profile in indirect purchase motion.
     *
     * @return the indirectRelationshipInfo value.
     */
    IndirectRelationshipInfo indirectRelationshipInfo();

    /**
     * Gets the invoiceEmailOptIn property: Flag controlling whether the invoices for the billing profile are sent
     * through email.
     *
     * @return the invoiceEmailOptIn value.
     */
    Boolean invoiceEmailOptIn();

    /**
     * Gets the invoiceDay property: The day of the month when the invoice for the billing profile is generated.
     *
     * @return the invoiceDay value.
     */
    Integer invoiceDay();

    /**
     * Gets the currency property: The currency in which the charges for the billing profile are billed.
     *
     * @return the currency value.
     */
    String currency();

    /**
     * Gets the enabledAzurePlans property: Information about the enabled azure plans.
     *
     * @return the enabledAzurePlans value.
     */
    List<AzurePlan> enabledAzurePlans();

    /**
     * Gets the invoiceSections property: The invoice sections associated to the billing profile. By default this is not
     * populated, unless it's specified in $expand.
     *
     * @return the invoiceSections value.
     */
    InvoiceSectionsOnExpand invoiceSections();

    /**
     * Gets the hasReadAccess property: Indicates whether user has read access to the billing profile.
     *
     * @return the hasReadAccess value.
     */
    Boolean hasReadAccess();

    /**
     * Gets the systemId property: The system generated unique identifier for a billing profile.
     *
     * @return the systemId value.
     */
    String systemId();

    /**
     * Gets the status property: The status of the billing profile.
     *
     * @return the status value.
     */
    BillingProfileStatus status();

    /**
     * Gets the statusReasonCode property: Reason for the specified billing profile status.
     *
     * @return the statusReasonCode value.
     */
    StatusReasonCode statusReasonCode();

    /**
     * Gets the spendingLimit property: The billing profile spending limit.
     *
     * @return the spendingLimit value.
     */
    SpendingLimit spendingLimit();

    /**
     * Gets the targetClouds property: Identifies the cloud environments that are associated with a billing profile.
     * This is a system managed optional field and gets updated as the billing profile gets associated with accounts in
     * various clouds.
     *
     * @return the targetClouds value.
     */
    List<TargetCloud> targetClouds();

    /**
     * Gets the tags property: Tags of billing profiles.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the inner com.azure.resourcemanager.billing.fluent.models.BillingProfileInner object.
     *
     * @return the inner object.
     */
    BillingProfileInner innerModel();
}
