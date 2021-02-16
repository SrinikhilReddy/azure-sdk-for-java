// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.spark.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the SparkClient type. */
public final class SparkClientImpl {
    /** The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net. */
    private final String endpoint;

    /**
     * Gets The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Valid api-version for the request. */
    private final String livyApiVersion;

    /**
     * Gets Valid api-version for the request.
     *
     * @return the livyApiVersion value.
     */
    public String getLivyApiVersion() {
        return this.livyApiVersion;
    }

    /** Name of the spark pool. */
    private final String sparkPoolName;

    /**
     * Gets Name of the spark pool.
     *
     * @return the sparkPoolName value.
     */
    public String getSparkPoolName() {
        return this.sparkPoolName;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The SparkBatchesImpl object to access its operations. */
    private final SparkBatchesImpl sparkBatches;

    /**
     * Gets the SparkBatchesImpl object to access its operations.
     *
     * @return the SparkBatchesImpl object.
     */
    public SparkBatchesImpl getSparkBatches() {
        return this.sparkBatches;
    }

    /** The SparkSessionsImpl object to access its operations. */
    private final SparkSessionsImpl sparkSessions;

    /**
     * Gets the SparkSessionsImpl object to access its operations.
     *
     * @return the SparkSessionsImpl object.
     */
    public SparkSessionsImpl getSparkSessions() {
        return this.sparkSessions;
    }

    /**
     * Initializes an instance of SparkClient client.
     *
     * @param endpoint The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     * @param livyApiVersion Valid api-version for the request.
     * @param sparkPoolName Name of the spark pool.
     */
    public SparkClientImpl(String endpoint, String livyApiVersion, String sparkPoolName) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint,
                livyApiVersion,
                sparkPoolName);
    }

    /**
     * Initializes an instance of SparkClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     * @param livyApiVersion Valid api-version for the request.
     * @param sparkPoolName Name of the spark pool.
     */
    public SparkClientImpl(HttpPipeline httpPipeline, String endpoint, String livyApiVersion, String sparkPoolName) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, livyApiVersion, sparkPoolName);
    }

    /**
     * Initializes an instance of SparkClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The workspace development endpoint, for example https://myworkspace.dev.azuresynapse.net.
     * @param livyApiVersion Valid api-version for the request.
     * @param sparkPoolName Name of the spark pool.
     */
    public SparkClientImpl(
            HttpPipeline httpPipeline,
            SerializerAdapter serializerAdapter,
            String endpoint,
            String livyApiVersion,
            String sparkPoolName) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.livyApiVersion = livyApiVersion;
        this.sparkPoolName = sparkPoolName;
        this.sparkBatches = new SparkBatchesImpl(this);
        this.sparkSessions = new SparkSessionsImpl(this);
    }
}
