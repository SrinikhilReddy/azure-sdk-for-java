/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.compute.v2020_12_01.DedicatedHostGroup;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_12_01.DedicatedHostGroupUpdate;
import java.util.List;
import com.microsoft.azure.management.compute.v2020_12_01.SubResourceReadOnly;
import com.microsoft.azure.management.compute.v2020_12_01.DedicatedHostGroupInstanceView;
import rx.functions.Func1;

class DedicatedHostGroupImpl extends GroupableResourceCoreImpl<DedicatedHostGroup, DedicatedHostGroupInner, DedicatedHostGroupImpl, ComputeManager> implements DedicatedHostGroup, DedicatedHostGroup.Definition, DedicatedHostGroup.Update {
    private DedicatedHostGroupUpdate updateParameter;
    DedicatedHostGroupImpl(String name, DedicatedHostGroupInner inner, ComputeManager manager) {
        super(name, inner, manager);
        this.updateParameter = new DedicatedHostGroupUpdate();
    }

    @Override
    public Observable<DedicatedHostGroup> createResourceAsync() {
        DedicatedHostGroupsInner client = this.manager().inner().dedicatedHostGroups();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<DedicatedHostGroupInner, DedicatedHostGroupInner>() {
               @Override
               public DedicatedHostGroupInner call(DedicatedHostGroupInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DedicatedHostGroup> updateResourceAsync() {
        DedicatedHostGroupsInner client = this.manager().inner().dedicatedHostGroups();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<DedicatedHostGroupInner, DedicatedHostGroupInner>() {
               @Override
               public DedicatedHostGroupInner call(DedicatedHostGroupInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DedicatedHostGroupInner> getInnerAsync() {
        DedicatedHostGroupsInner client = this.manager().inner().dedicatedHostGroups();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new DedicatedHostGroupUpdate();
    }

    @Override
    public List<SubResourceReadOnly> hosts() {
        return this.inner().hosts();
    }

    @Override
    public DedicatedHostGroupInstanceView instanceView() {
        return this.inner().instanceView();
    }

    @Override
    public int platformFaultDomainCount() {
        return this.inner().platformFaultDomainCount();
    }

    @Override
    public Boolean supportAutomaticPlacement() {
        return this.inner().supportAutomaticPlacement();
    }

    @Override
    public List<String> zones() {
        return this.inner().zones();
    }

    @Override
    public DedicatedHostGroupImpl withPlatformFaultDomainCount(int platformFaultDomainCount) {
        this.inner().withPlatformFaultDomainCount(platformFaultDomainCount);
        return this;
    }

    @Override
    public DedicatedHostGroupImpl withSupportAutomaticPlacement(Boolean supportAutomaticPlacement) {
        if (isInCreateMode()) {
            this.inner().withSupportAutomaticPlacement(supportAutomaticPlacement);
        } else {
            this.updateParameter.withSupportAutomaticPlacement(supportAutomaticPlacement);
        }
        return this;
    }

    @Override
    public DedicatedHostGroupImpl withZones(List<String> zones) {
        if (isInCreateMode()) {
            this.inner().withZones(zones);
        } else {
            this.updateParameter.withZones(zones);
        }
        return this;
    }

}
