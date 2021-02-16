// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EdgeUsageDataEventHub model. */
@Fluent
public final class EdgeUsageDataEventHub {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EdgeUsageDataEventHub.class);

    /*
     * Name of the Event Hub where usage will be reported.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Namespace of the Event Hub where usage will be reported.
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /*
     * SAS token needed to interact with Event Hub.
     */
    @JsonProperty(value = "token")
    private String token;

    /**
     * Get the name property: Name of the Event Hub where usage will be reported.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Event Hub where usage will be reported.
     *
     * @param name the name value to set.
     * @return the EdgeUsageDataEventHub object itself.
     */
    public EdgeUsageDataEventHub withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the namespace property: Namespace of the Event Hub where usage will be reported.
     *
     * @return the namespace value.
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: Namespace of the Event Hub where usage will be reported.
     *
     * @param namespace the namespace value to set.
     * @return the EdgeUsageDataEventHub object itself.
     */
    public EdgeUsageDataEventHub withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the token property: SAS token needed to interact with Event Hub.
     *
     * @return the token value.
     */
    public String token() {
        return this.token;
    }

    /**
     * Set the token property: SAS token needed to interact with Event Hub.
     *
     * @param token the token value to set.
     * @return the EdgeUsageDataEventHub object itself.
     */
    public EdgeUsageDataEventHub withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
