// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ContentSourceType. */
public final class ContentSourceType extends ExpandableStringEnum<ContentSourceType> {
    /** Static value embeddedContent for ContentSourceType. */
    public static final ContentSourceType EMBEDDED_CONTENT = fromString("embeddedContent");

    /** Static value uri for ContentSourceType. */
    public static final ContentSourceType URI = fromString("uri");

    /**
     * Creates or finds a ContentSourceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContentSourceType.
     */
    @JsonCreator
    public static ContentSourceType fromString(String name) {
        return fromString(name, ContentSourceType.class);
    }

    /** @return known ContentSourceType values. */
    public static Collection<ContentSourceType> values() {
        return values(ContentSourceType.class);
    }
}
