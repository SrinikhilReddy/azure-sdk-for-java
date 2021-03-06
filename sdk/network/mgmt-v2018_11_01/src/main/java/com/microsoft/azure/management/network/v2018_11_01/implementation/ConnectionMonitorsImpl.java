/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2018_11_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2018_11_01.ConnectionMonitors;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.network.v2018_11_01.ConnectionMonitorQueryResult;
import com.microsoft.azure.management.network.v2018_11_01.ConnectionMonitorResult;

class ConnectionMonitorsImpl extends WrapperImpl<ConnectionMonitorsInner> implements ConnectionMonitors {
    private final NetworkManager manager;

    ConnectionMonitorsImpl(NetworkManager manager) {
        super(manager.inner().connectionMonitors());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public ConnectionMonitorResultImpl define(String name) {
        return wrapModel(name);
    }

    private ConnectionMonitorResultImpl wrapModel(ConnectionMonitorResultInner inner) {
        return  new ConnectionMonitorResultImpl(inner, manager());
    }

    private ConnectionMonitorResultImpl wrapModel(String name) {
        return new ConnectionMonitorResultImpl(name, this.manager());
    }

    @Override
    public Completable stopAsync(String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        ConnectionMonitorsInner client = this.inner();
        return client.stopAsync(resourceGroupName, networkWatcherName, connectionMonitorName).toCompletable();
    }

    @Override
    public Completable startAsync(String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        ConnectionMonitorsInner client = this.inner();
        return client.startAsync(resourceGroupName, networkWatcherName, connectionMonitorName).toCompletable();
    }

    @Override
    public Observable<ConnectionMonitorQueryResult> queryAsync(String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        ConnectionMonitorsInner client = this.inner();
        return client.queryAsync(resourceGroupName, networkWatcherName, connectionMonitorName)
        .map(new Func1<ConnectionMonitorQueryResultInner, ConnectionMonitorQueryResult>() {
            @Override
            public ConnectionMonitorQueryResult call(ConnectionMonitorQueryResultInner inner) {
                return new ConnectionMonitorQueryResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ConnectionMonitorResult> listAsync(String resourceGroupName, String networkWatcherName) {
        ConnectionMonitorsInner client = this.inner();
        return client.listAsync(resourceGroupName, networkWatcherName)
        .flatMap(new Func1<List<ConnectionMonitorResultInner>, Observable<ConnectionMonitorResultInner>>() {
            @Override
            public Observable<ConnectionMonitorResultInner> call(List<ConnectionMonitorResultInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ConnectionMonitorResultInner, ConnectionMonitorResult>() {
            @Override
            public ConnectionMonitorResult call(ConnectionMonitorResultInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ConnectionMonitorResult> getAsync(String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        ConnectionMonitorsInner client = this.inner();
        return client.getAsync(resourceGroupName, networkWatcherName, connectionMonitorName)
        .flatMap(new Func1<ConnectionMonitorResultInner, Observable<ConnectionMonitorResult>>() {
            @Override
            public Observable<ConnectionMonitorResult> call(ConnectionMonitorResultInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ConnectionMonitorResult)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String networkWatcherName, String connectionMonitorName) {
        ConnectionMonitorsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, networkWatcherName, connectionMonitorName).toCompletable();
    }

}
