/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_06_14;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kusto.v2020_06_14.implementation.KustoManager;
import com.microsoft.azure.management.kusto.v2020_06_14.implementation.FollowerDatabaseDefinitionInner;

/**
 * Type representing FollowerDatabaseDefinition.
 */
public interface FollowerDatabaseDefinition extends HasInner<FollowerDatabaseDefinitionInner>, HasManager<KustoManager> {
    /**
     * @return the attachedDatabaseConfigurationName value.
     */
    String attachedDatabaseConfigurationName();

    /**
     * @return the clusterResourceId value.
     */
    String clusterResourceId();

    /**
     * @return the databaseName value.
     */
    String databaseName();

}
