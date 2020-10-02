// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ChangeThresholdCondition model. */
@Fluent
public final class ChangeThresholdCondition {
    /*
     * change percentage, value range : [0, +∞)
     */
    @JsonProperty(value = "changePercentage", required = true)
    private double changePercentage;

    /*
     * shift point, value range : [1, +∞)
     */
    @JsonProperty(value = "shiftPoint", required = true)
    private int shiftPoint;

    /*
     * if the withinRange = true, detected data is abnormal when the value
     * falls in the range, in this case anomalyDetectorDirection must be Both
     * if the withinRange = false, detected data is abnormal when the value
     * falls out of the range
     */
    @JsonProperty(value = "withinRange", required = true)
    private boolean withinRange;

    /*
     * detection direction
     */
    @JsonProperty(value = "anomalyDetectorDirection", required = true)
    private AnomalyDetectorDirection anomalyDetectorDirection;

    /*
     * The suppressCondition property.
     */
    @JsonProperty(value = "suppressCondition", required = true)
    private SuppressCondition suppressCondition;

    /**
     * Get the changePercentage property: change percentage, value range : [0, +∞).
     *
     * @return the changePercentage value.
     */
    public double getChangePercentage() {
        return this.changePercentage;
    }

    /**
     * Set the changePercentage property: change percentage, value range : [0, +∞).
     *
     * @param changePercentage the changePercentage value to set.
     * @return the ChangeThresholdCondition object itself.
     */
    public ChangeThresholdCondition setChangePercentage(double changePercentage) {
        this.changePercentage = changePercentage;
        return this;
    }

    /**
     * Get the shiftPoint property: shift point, value range : [1, +∞).
     *
     * @return the shiftPoint value.
     */
    public int getShiftPoint() {
        return this.shiftPoint;
    }

    /**
     * Set the shiftPoint property: shift point, value range : [1, +∞).
     *
     * @param shiftPoint the shiftPoint value to set.
     * @return the ChangeThresholdCondition object itself.
     */
    public ChangeThresholdCondition setShiftPoint(int shiftPoint) {
        this.shiftPoint = shiftPoint;
        return this;
    }

    /**
     * Get the withinRange property: if the withinRange = true, detected data is abnormal when the value falls in the
     * range, in this case anomalyDetectorDirection must be Both if the withinRange = false, detected data is abnormal
     * when the value falls out of the range.
     *
     * @return the withinRange value.
     */
    public boolean isWithinRange() {
        return this.withinRange;
    }

    /**
     * Set the withinRange property: if the withinRange = true, detected data is abnormal when the value falls in the
     * range, in this case anomalyDetectorDirection must be Both if the withinRange = false, detected data is abnormal
     * when the value falls out of the range.
     *
     * @param withinRange the withinRange value to set.
     * @return the ChangeThresholdCondition object itself.
     */
    public ChangeThresholdCondition setWithinRange(boolean withinRange) {
        this.withinRange = withinRange;
        return this;
    }

    /**
     * Get the anomalyDetectorDirection property: detection direction.
     *
     * @return the anomalyDetectorDirection value.
     */
    public AnomalyDetectorDirection getAnomalyDetectorDirection() {
        return this.anomalyDetectorDirection;
    }

    /**
     * Set the anomalyDetectorDirection property: detection direction.
     *
     * @param anomalyDetectorDirection the anomalyDetectorDirection value to set.
     * @return the ChangeThresholdCondition object itself.
     */
    public ChangeThresholdCondition setAnomalyDetectorDirection(AnomalyDetectorDirection anomalyDetectorDirection) {
        this.anomalyDetectorDirection = anomalyDetectorDirection;
        return this;
    }

    /**
     * Get the suppressCondition property: The suppressCondition property.
     *
     * @return the suppressCondition value.
     */
    public SuppressCondition getSuppressCondition() {
        return this.suppressCondition;
    }

    /**
     * Set the suppressCondition property: The suppressCondition property.
     *
     * @param suppressCondition the suppressCondition value to set.
     * @return the ChangeThresholdCondition object itself.
     */
    public ChangeThresholdCondition setSuppressCondition(SuppressCondition suppressCondition) {
        this.suppressCondition = suppressCondition;
        return this;
    }
}
