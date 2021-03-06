/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_15;

import rx.Observable;
import com.microsoft.azure.management.healthcareapis.v2020_03_15.implementation.OperationResultsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing OperationResults.
 */
public interface OperationResults extends HasInner<OperationResultsInner> {
    /**
     * Get the operation result for a long running operation.
     *
     * @param locationName The location of the operation.
     * @param operationResultId The ID of the operation result to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Object> getAsync(String locationName, String operationResultId);

}
