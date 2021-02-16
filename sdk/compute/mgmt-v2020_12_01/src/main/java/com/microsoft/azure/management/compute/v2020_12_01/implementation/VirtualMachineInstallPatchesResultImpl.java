/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import com.microsoft.azure.management.compute.v2020_12_01.VirtualMachineInstallPatchesResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_12_01.ApiError;
import java.util.List;
import com.microsoft.azure.management.compute.v2020_12_01.PatchInstallationDetail;
import com.microsoft.azure.management.compute.v2020_12_01.VMGuestPatchRebootStatus;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2020_12_01.PatchOperationStatus;

class VirtualMachineInstallPatchesResultImpl extends WrapperImpl<VirtualMachineInstallPatchesResultInner> implements VirtualMachineInstallPatchesResult {
    private final ComputeManager manager;
    VirtualMachineInstallPatchesResultImpl(VirtualMachineInstallPatchesResultInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public ApiError error() {
        return this.inner().error();
    }

    @Override
    public Integer excludedPatchCount() {
        return this.inner().excludedPatchCount();
    }

    @Override
    public Integer failedPatchCount() {
        return this.inner().failedPatchCount();
    }

    @Override
    public String installationActivityId() {
        return this.inner().installationActivityId();
    }

    @Override
    public Integer installedPatchCount() {
        return this.inner().installedPatchCount();
    }

    @Override
    public Boolean maintenanceWindowExceeded() {
        return this.inner().maintenanceWindowExceeded();
    }

    @Override
    public Integer notSelectedPatchCount() {
        return this.inner().notSelectedPatchCount();
    }

    @Override
    public List<PatchInstallationDetail> patches() {
        return this.inner().patches();
    }

    @Override
    public Integer pendingPatchCount() {
        return this.inner().pendingPatchCount();
    }

    @Override
    public VMGuestPatchRebootStatus rebootStatus() {
        return this.inner().rebootStatus();
    }

    @Override
    public DateTime startDateTime() {
        return this.inner().startDateTime();
    }

    @Override
    public PatchOperationStatus status() {
        return this.inner().status();
    }

}
