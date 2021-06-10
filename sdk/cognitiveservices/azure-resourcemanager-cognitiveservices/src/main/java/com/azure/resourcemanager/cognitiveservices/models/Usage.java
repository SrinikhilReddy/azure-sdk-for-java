// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The usage data for a usage request. */
@Fluent
public final class Usage {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Usage.class);

    /*
     * The unit of the metric.
     */
    @JsonProperty(value = "unit")
    private UnitType unit;

    /*
     * The name information for the metric.
     */
    @JsonProperty(value = "name")
    private MetricName name;

    /*
     * The quota period used to summarize the usage values.
     */
    @JsonProperty(value = "quotaPeriod")
    private String quotaPeriod;

    /*
     * Maximum value for this metric.
     */
    @JsonProperty(value = "limit")
    private Double limit;

    /*
     * Current value for this metric.
     */
    @JsonProperty(value = "currentValue")
    private Double currentValue;

    /*
     * Next reset time for current quota.
     */
    @JsonProperty(value = "nextResetTime")
    private String nextResetTime;

    /*
     * Cognitive Services account quota usage status.
     */
    @JsonProperty(value = "status")
    private QuotaUsageStatus status;

    /**
     * Get the unit property: The unit of the metric.
     *
     * @return the unit value.
     */
    public UnitType unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit of the metric.
     *
     * @param unit the unit value to set.
     * @return the Usage object itself.
     */
    public Usage withUnit(UnitType unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the name property: The name information for the metric.
     *
     * @return the name value.
     */
    public MetricName name() {
        return this.name;
    }

    /**
     * Set the name property: The name information for the metric.
     *
     * @param name the name value to set.
     * @return the Usage object itself.
     */
    public Usage withName(MetricName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the quotaPeriod property: The quota period used to summarize the usage values.
     *
     * @return the quotaPeriod value.
     */
    public String quotaPeriod() {
        return this.quotaPeriod;
    }

    /**
     * Set the quotaPeriod property: The quota period used to summarize the usage values.
     *
     * @param quotaPeriod the quotaPeriod value to set.
     * @return the Usage object itself.
     */
    public Usage withQuotaPeriod(String quotaPeriod) {
        this.quotaPeriod = quotaPeriod;
        return this;
    }

    /**
     * Get the limit property: Maximum value for this metric.
     *
     * @return the limit value.
     */
    public Double limit() {
        return this.limit;
    }

    /**
     * Set the limit property: Maximum value for this metric.
     *
     * @param limit the limit value to set.
     * @return the Usage object itself.
     */
    public Usage withLimit(Double limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the currentValue property: Current value for this metric.
     *
     * @return the currentValue value.
     */
    public Double currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: Current value for this metric.
     *
     * @param currentValue the currentValue value to set.
     * @return the Usage object itself.
     */
    public Usage withCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the nextResetTime property: Next reset time for current quota.
     *
     * @return the nextResetTime value.
     */
    public String nextResetTime() {
        return this.nextResetTime;
    }

    /**
     * Set the nextResetTime property: Next reset time for current quota.
     *
     * @param nextResetTime the nextResetTime value to set.
     * @return the Usage object itself.
     */
    public Usage withNextResetTime(String nextResetTime) {
        this.nextResetTime = nextResetTime;
        return this;
    }

    /**
     * Get the status property: Cognitive Services account quota usage status.
     *
     * @return the status value.
     */
    public QuotaUsageStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Cognitive Services account quota usage status.
     *
     * @param status the status value to set.
     * @return the Usage object itself.
     */
    public Usage withStatus(QuotaUsageStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }
}
