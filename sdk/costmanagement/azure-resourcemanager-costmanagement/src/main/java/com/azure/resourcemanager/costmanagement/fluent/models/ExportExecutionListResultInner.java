// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of listing the execution history of an export. */
@Immutable
public final class ExportExecutionListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExportExecutionListResultInner.class);

    /*
     * A list of export executions.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExportExecutionInner> value;

    /**
     * Get the value property: A list of export executions.
     *
     * @return the value value.
     */
    public List<ExportExecutionInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
