// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.models;

import com.azure.cosmos.util.Beta;
import com.azure.cosmos.util.Beta.SinceVersion;

/**
 * Specifies the partition scheme for an multiple-partitioned container in the Azure Cosmos DB database service.
 */
public enum PartitionKind {
    /**
     * The Partition of a item is calculated based on the hash value of the PartitionKey.
     */
    HASH("Hash"),

    RANGE("Range"),
    /**
     * The Partition of a item is calculated based on the hash value of multiple PartitionKeys.
     */
    MULTI_HASH("MultiHash");

    PartitionKind(String overWireValue) {
        this.overWireValue = overWireValue;
    }

    private final String overWireValue;

    @Override
    public String toString() {
        return this.overWireValue;
    }
}
