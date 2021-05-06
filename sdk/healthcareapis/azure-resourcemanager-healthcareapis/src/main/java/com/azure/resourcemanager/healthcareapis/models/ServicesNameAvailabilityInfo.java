// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.resourcemanager.healthcareapis.fluent.models.ServicesNameAvailabilityInfoInner;

/** An immutable client-side representation of ServicesNameAvailabilityInfo. */
public interface ServicesNameAvailabilityInfo {
    /**
     * Gets the nameAvailable property: The value which indicates whether the provided name is available.
     *
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * Gets the reason property: The reason for unavailability.
     *
     * @return the reason value.
     */
    ServiceNameUnavailabilityReason reason();

    /**
     * Gets the message property: The detailed reason message.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.healthcareapis.fluent.models.ServicesNameAvailabilityInfoInner object.
     *
     * @return the inner object.
     */
    ServicesNameAvailabilityInfoInner innerModel();
}
