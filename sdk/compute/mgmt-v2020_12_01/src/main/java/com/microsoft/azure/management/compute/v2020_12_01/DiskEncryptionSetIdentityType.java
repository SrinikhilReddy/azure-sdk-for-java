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
 * Defines values for DiskEncryptionSetIdentityType.
 */
public final class DiskEncryptionSetIdentityType extends ExpandableStringEnum<DiskEncryptionSetIdentityType> {
    /** Static value SystemAssigned for DiskEncryptionSetIdentityType. */
    public static final DiskEncryptionSetIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /** Static value None for DiskEncryptionSetIdentityType. */
    public static final DiskEncryptionSetIdentityType NONE = fromString("None");

    /**
     * Creates or finds a DiskEncryptionSetIdentityType from its string representation.
     * @param name a name to look for
     * @return the corresponding DiskEncryptionSetIdentityType
     */
    @JsonCreator
    public static DiskEncryptionSetIdentityType fromString(String name) {
        return fromString(name, DiskEncryptionSetIdentityType.class);
    }

    /**
     * @return known DiskEncryptionSetIdentityType values
     */
    public static Collection<DiskEncryptionSetIdentityType> values() {
        return values(DiskEncryptionSetIdentityType.class);
    }
}
