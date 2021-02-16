/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_09_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.netapp.v2020_09_01.implementation.BackupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Backups.
 */
public interface Backups extends SupportsCreating<CapacityPoolNetAppAccountBackup.DefinitionStages.Blank>, HasInner<BackupsInner> {
    /**
     * Get a backup.
     * Get a particular backup of the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @param backupName The name of the backup
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CapacityPoolNetAppAccountBackup> getAsync(String resourceGroupName, String accountName, String poolName, String volumeName, String backupName);

    /**
     * List Backups.
     * List all backups for a volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CapacityPoolNetAppAccountBackup> listAsync(String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * Delete backup.
     * Delete a backup of the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @param backupName The name of the backup
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String poolName, String volumeName, String backupName);

}
