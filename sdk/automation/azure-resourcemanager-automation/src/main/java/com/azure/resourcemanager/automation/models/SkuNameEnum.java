// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SkuNameEnum. */
public final class SkuNameEnum extends ExpandableStringEnum<SkuNameEnum> {
    /** Static value Free for SkuNameEnum. */
    public static final SkuNameEnum FREE = fromString("Free");

    /** Static value Basic for SkuNameEnum. */
    public static final SkuNameEnum BASIC = fromString("Basic");

    /**
     * Creates or finds a SkuNameEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuNameEnum.
     */
    @JsonCreator
    public static SkuNameEnum fromString(String name) {
        return fromString(name, SkuNameEnum.class);
    }

    /** @return known SkuNameEnum values. */
    public static Collection<SkuNameEnum> values() {
        return values(SkuNameEnum.class);
    }
}
