// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ResourceProviders. */
public interface ResourceProviders {
    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param parameters Check SKU Availability POST body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check SKU availability result list.
     */
    SkuAvailabilityListResult checkSkuAvailability(String location, CheckSkuAvailabilityParameter parameters);

    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param parameters Check SKU Availability POST body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return check SKU availability result list.
     */
    Response<SkuAvailabilityListResult> checkSkuAvailabilityWithResponse(
        String location, CheckSkuAvailabilityParameter parameters, Context context);

    /**
     * Check whether a domain is available.
     *
     * @param parameters Check Domain Availability parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain availability.
     */
    DomainAvailability checkDomainAvailability(CheckDomainAvailabilityParameter parameters);

    /**
     * Check whether a domain is available.
     *
     * @param parameters Check Domain Availability parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain availability.
     */
    Response<DomainAvailability> checkDomainAvailabilityWithResponse(
        CheckDomainAvailabilityParameter parameters, Context context);
}
