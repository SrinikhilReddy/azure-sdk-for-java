// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** outlookGeoCoordinates. */
@Fluent
public final class MicrosoftGraphOutlookGeoCoordinates {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphOutlookGeoCoordinates.class);

    /*
     * The accuracy of the latitude and longitude. As an example, the accuracy
     * can be measured in meters, such as the latitude and longitude are
     * accurate to within 50 meters.
     */
    @JsonProperty(value = "accuracy")
    private Double accuracy;

    /*
     * The altitude of the location.
     */
    @JsonProperty(value = "altitude")
    private Double altitude;

    /*
     * The accuracy of the altitude.
     */
    @JsonProperty(value = "altitudeAccuracy")
    private Double altitudeAccuracy;

    /*
     * The latitude of the location.
     */
    @JsonProperty(value = "latitude")
    private Double latitude;

    /*
     * The longitude of the location.
     */
    @JsonProperty(value = "longitude")
    private Double longitude;

    /*
     * outlookGeoCoordinates
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the accuracy property: The accuracy of the latitude and longitude. As an example, the accuracy can be
     * measured in meters, such as the latitude and longitude are accurate to within 50 meters.
     *
     * @return the accuracy value.
     */
    public Double accuracy() {
        return this.accuracy;
    }

    /**
     * Set the accuracy property: The accuracy of the latitude and longitude. As an example, the accuracy can be
     * measured in meters, such as the latitude and longitude are accurate to within 50 meters.
     *
     * @param accuracy the accuracy value to set.
     * @return the MicrosoftGraphOutlookGeoCoordinates object itself.
     */
    public MicrosoftGraphOutlookGeoCoordinates withAccuracy(Double accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    /**
     * Get the altitude property: The altitude of the location.
     *
     * @return the altitude value.
     */
    public Double altitude() {
        return this.altitude;
    }

    /**
     * Set the altitude property: The altitude of the location.
     *
     * @param altitude the altitude value to set.
     * @return the MicrosoftGraphOutlookGeoCoordinates object itself.
     */
    public MicrosoftGraphOutlookGeoCoordinates withAltitude(Double altitude) {
        this.altitude = altitude;
        return this;
    }

    /**
     * Get the altitudeAccuracy property: The accuracy of the altitude.
     *
     * @return the altitudeAccuracy value.
     */
    public Double altitudeAccuracy() {
        return this.altitudeAccuracy;
    }

    /**
     * Set the altitudeAccuracy property: The accuracy of the altitude.
     *
     * @param altitudeAccuracy the altitudeAccuracy value to set.
     * @return the MicrosoftGraphOutlookGeoCoordinates object itself.
     */
    public MicrosoftGraphOutlookGeoCoordinates withAltitudeAccuracy(Double altitudeAccuracy) {
        this.altitudeAccuracy = altitudeAccuracy;
        return this;
    }

    /**
     * Get the latitude property: The latitude of the location.
     *
     * @return the latitude value.
     */
    public Double latitude() {
        return this.latitude;
    }

    /**
     * Set the latitude property: The latitude of the location.
     *
     * @param latitude the latitude value to set.
     * @return the MicrosoftGraphOutlookGeoCoordinates object itself.
     */
    public MicrosoftGraphOutlookGeoCoordinates withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Get the longitude property: The longitude of the location.
     *
     * @return the longitude value.
     */
    public Double longitude() {
        return this.longitude;
    }

    /**
     * Set the longitude property: The longitude of the location.
     *
     * @param longitude the longitude value to set.
     * @return the MicrosoftGraphOutlookGeoCoordinates object itself.
     */
    public MicrosoftGraphOutlookGeoCoordinates withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Get the additionalProperties property: outlookGeoCoordinates.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: outlookGeoCoordinates.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOutlookGeoCoordinates object itself.
     */
    public MicrosoftGraphOutlookGeoCoordinates withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
