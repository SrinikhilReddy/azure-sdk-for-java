/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines the Sql ElasticPool resource settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resourceType", defaultImpl = SqlElasticPoolResourceSettings.class)
@JsonTypeName("Microsoft.Sql/servers/elasticPools")
public class SqlElasticPoolResourceSettings extends ResourceSettings {
    /**
     * Possible values include: 'Enable', 'Disable'.
     */
    @JsonProperty(value = "zoneRedundant")
    private ZoneRedundant zoneRedundant;

    /**
     * Get possible values include: 'Enable', 'Disable'.
     *
     * @return the zoneRedundant value
     */
    public ZoneRedundant zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set possible values include: 'Enable', 'Disable'.
     *
     * @param zoneRedundant the zoneRedundant value to set
     * @return the SqlElasticPoolResourceSettings object itself.
     */
    public SqlElasticPoolResourceSettings withZoneRedundant(ZoneRedundant zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

}
