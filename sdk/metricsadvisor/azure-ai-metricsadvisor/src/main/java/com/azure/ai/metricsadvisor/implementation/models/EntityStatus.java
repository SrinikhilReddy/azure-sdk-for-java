// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EntityStatus. */
public final class EntityStatus extends ExpandableStringEnum<EntityStatus> {
    /** Static value Active for EntityStatus. */
    public static final EntityStatus ACTIVE = fromString("Active");

    /** Static value Paused for EntityStatus. */
    public static final EntityStatus PAUSED = fromString("Paused");

    /**
     * Creates or finds a EntityStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EntityStatus.
     */
    @JsonCreator
    public static EntityStatus fromString(String name) {
        return fromString(name, EntityStatus.class);
    }

    /** @return known EntityStatus values. */
    public static Collection<EntityStatus> values() {
        return values(EntityStatus.class);
    }
}
