// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MinimumTlsVersion. */
public final class MinimumTlsVersion extends ExpandableStringEnum<MinimumTlsVersion> {
    /** Static value 1.0 for MinimumTlsVersion. */
    public static final MinimumTlsVersion ONE_ZERO = fromString("1.0");

    /** Static value 1.2 for MinimumTlsVersion. */
    public static final MinimumTlsVersion ONE_TWO = fromString("1.2");

    /**
     * Creates or finds a MinimumTlsVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MinimumTlsVersion.
     */
    @JsonCreator
    public static MinimumTlsVersion fromString(String name) {
        return fromString(name, MinimumTlsVersion.class);
    }

    /** @return known MinimumTlsVersion values. */
    public static Collection<MinimumTlsVersion> values() {
        return values(MinimumTlsVersion.class);
    }
}
