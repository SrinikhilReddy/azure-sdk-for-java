/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.microsoft.azure.management.logic.v2016_06_01.implementation.WorkflowTriggerInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SetTriggerStateActionDefinition model.
 */
public class SetTriggerStateActionDefinition {
    /**
     * The source property.
     */
    @JsonProperty(value = "source", required = true)
    private WorkflowTriggerInner source;

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public WorkflowTriggerInner source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set
     * @return the SetTriggerStateActionDefinition object itself.
     */
    public SetTriggerStateActionDefinition withSource(WorkflowTriggerInner source) {
        this.source = source;
        return this;
    }

}
