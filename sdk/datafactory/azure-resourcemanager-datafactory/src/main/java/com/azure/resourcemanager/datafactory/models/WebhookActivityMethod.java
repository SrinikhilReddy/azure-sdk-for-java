// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WebhookActivityMethod. */
public final class WebhookActivityMethod extends ExpandableStringEnum<WebhookActivityMethod> {
    /** Static value POST for WebhookActivityMethod. */
    public static final WebhookActivityMethod POST = fromString("POST");

    /**
     * Creates or finds a WebhookActivityMethod from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WebhookActivityMethod.
     */
    @JsonCreator
    public static WebhookActivityMethod fromString(String name) {
        return fromString(name, WebhookActivityMethod.class);
    }

    /** @return known WebhookActivityMethod values. */
    public static Collection<WebhookActivityMethod> values() {
        return values(WebhookActivityMethod.class);
    }
}
