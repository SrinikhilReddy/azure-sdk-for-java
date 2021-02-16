/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DiffDiskOptions.
 */
public final class DiffDiskOptions extends ExpandableStringEnum<DiffDiskOptions> {
    /** Static value Local for DiffDiskOptions. */
    public static final DiffDiskOptions LOCAL = fromString("Local");

    /**
     * Creates or finds a DiffDiskOptions from its string representation.
     * @param name a name to look for
     * @return the corresponding DiffDiskOptions
     */
    @JsonCreator
    public static DiffDiskOptions fromString(String name) {
        return fromString(name, DiffDiskOptions.class);
    }

    /**
     * @return known DiffDiskOptions values
     */
    public static Collection<DiffDiskOptions> values() {
        return values(DiffDiskOptions.class);
    }
}
