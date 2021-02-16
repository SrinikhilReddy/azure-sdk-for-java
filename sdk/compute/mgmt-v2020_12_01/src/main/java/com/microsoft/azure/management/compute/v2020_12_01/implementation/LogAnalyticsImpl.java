/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_12_01.LogAnalytics;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_12_01.LogAnalyticsOperationResult;
import com.microsoft.azure.management.compute.v2020_12_01.RequestRateByIntervalInput;
import com.microsoft.azure.management.compute.v2020_12_01.ThrottledRequestsInput;

class LogAnalyticsImpl extends WrapperImpl<LogAnalyticsInner> implements LogAnalytics {
    private final ComputeManager manager;

    LogAnalyticsImpl(ComputeManager manager) {
        super(manager.inner().logAnalytics());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<LogAnalyticsOperationResult> exportRequestRateByIntervalAsync(String location, RequestRateByIntervalInput parameters) {
        LogAnalyticsInner client = this.inner();
        return client.exportRequestRateByIntervalAsync(location, parameters)
        .map(new Func1<LogAnalyticsOperationResultInner, LogAnalyticsOperationResult>() {
            @Override
            public LogAnalyticsOperationResult call(LogAnalyticsOperationResultInner inner) {
                return new LogAnalyticsOperationResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<LogAnalyticsOperationResult> exportThrottledRequestsAsync(String location, ThrottledRequestsInput parameters) {
        LogAnalyticsInner client = this.inner();
        return client.exportThrottledRequestsAsync(location, parameters)
        .map(new Func1<LogAnalyticsOperationResultInner, LogAnalyticsOperationResult>() {
            @Override
            public LogAnalyticsOperationResult call(LogAnalyticsOperationResultInner inner) {
                return new LogAnalyticsOperationResultImpl(inner, manager());
            }
        });
    }

}
