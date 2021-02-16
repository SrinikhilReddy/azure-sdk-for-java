/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2020_09_01.BuildStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2020_09_01.ProxyOnlyResource;

/**
 * Static Site Build ARM resource.
 */
@JsonFlatten
public class StaticSiteBuildARMResourceInner extends ProxyOnlyResource {
    /**
     * An identifier for the static site build.
     */
    @JsonProperty(value = "properties.buildId", access = JsonProperty.Access.WRITE_ONLY)
    private String buildId;

    /**
     * The source branch.
     */
    @JsonProperty(value = "properties.sourceBranch", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceBranch;

    /**
     * The title of a pull request that a static site build is related to.
     */
    @JsonProperty(value = "properties.pullRequestTitle", access = JsonProperty.Access.WRITE_ONLY)
    private String pullRequestTitle;

    /**
     * The hostname for a static site build.
     */
    @JsonProperty(value = "properties.hostname", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /**
     * When this build was created.
     */
    @JsonProperty(value = "properties.createdTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdTimeUtc;

    /**
     * When this build was updated.
     */
    @JsonProperty(value = "properties.lastUpdatedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastUpdatedOn;

    /**
     * The status of the static site build. Possible values include:
     * 'WaitingForDeployment', 'Uploading', 'Deploying', 'Ready', 'Failed',
     * 'Deleting', 'Detached'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private BuildStatus status;

    /**
     * Get an identifier for the static site build.
     *
     * @return the buildId value
     */
    public String buildId() {
        return this.buildId;
    }

    /**
     * Get the source branch.
     *
     * @return the sourceBranch value
     */
    public String sourceBranch() {
        return this.sourceBranch;
    }

    /**
     * Get the title of a pull request that a static site build is related to.
     *
     * @return the pullRequestTitle value
     */
    public String pullRequestTitle() {
        return this.pullRequestTitle;
    }

    /**
     * Get the hostname for a static site build.
     *
     * @return the hostname value
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get when this build was created.
     *
     * @return the createdTimeUtc value
     */
    public DateTime createdTimeUtc() {
        return this.createdTimeUtc;
    }

    /**
     * Get when this build was updated.
     *
     * @return the lastUpdatedOn value
     */
    public DateTime lastUpdatedOn() {
        return this.lastUpdatedOn;
    }

    /**
     * Get the status of the static site build. Possible values include: 'WaitingForDeployment', 'Uploading', 'Deploying', 'Ready', 'Failed', 'Deleting', 'Detached'.
     *
     * @return the status value
     */
    public BuildStatus status() {
        return this.status;
    }

}
