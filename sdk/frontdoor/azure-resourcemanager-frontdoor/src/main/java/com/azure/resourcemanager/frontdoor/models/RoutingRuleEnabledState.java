// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RoutingRuleEnabledState. */
public final class RoutingRuleEnabledState extends ExpandableStringEnum<RoutingRuleEnabledState> {
    /** Static value Enabled for RoutingRuleEnabledState. */
    public static final RoutingRuleEnabledState ENABLED = fromString("Enabled");

    /** Static value Disabled for RoutingRuleEnabledState. */
    public static final RoutingRuleEnabledState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a RoutingRuleEnabledState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RoutingRuleEnabledState.
     */
    @JsonCreator
    public static RoutingRuleEnabledState fromString(String name) {
        return fromString(name, RoutingRuleEnabledState.class);
    }

    /** @return known RoutingRuleEnabledState values. */
    public static Collection<RoutingRuleEnabledState> values() {
        return values(RoutingRuleEnabledState.class);
    }
}
