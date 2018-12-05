/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the DataMigrationServiceClientImpl class.
 */
public class DataMigrationServiceClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Version of the API. */
    private String apiVersion;

    /**
     * Gets Version of the API.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Identifier of the subscription. */
    private String subscriptionId;

    /**
     * Gets Identifier of the subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Identifier of the subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public DataMigrationServiceClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public DataMigrationServiceClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public DataMigrationServiceClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public DataMigrationServiceClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ResourceSkusInner object to access its operations.
     */
    private ResourceSkusInner resourceSkus;

    /**
     * Gets the ResourceSkusInner object to access its operations.
     * @return the ResourceSkusInner object.
     */
    public ResourceSkusInner resourceSkus() {
        return this.resourceSkus;
    }

    /**
     * The ServicesInner object to access its operations.
     */
    private ServicesInner services;

    /**
     * Gets the ServicesInner object to access its operations.
     * @return the ServicesInner object.
     */
    public ServicesInner services() {
        return this.services;
    }

    /**
     * The TasksInner object to access its operations.
     */
    private TasksInner tasks;

    /**
     * Gets the TasksInner object to access its operations.
     * @return the TasksInner object.
     */
    public TasksInner tasks() {
        return this.tasks;
    }

    /**
     * The ProjectsInner object to access its operations.
     */
    private ProjectsInner projects;

    /**
     * Gets the ProjectsInner object to access its operations.
     * @return the ProjectsInner object.
     */
    public ProjectsInner projects() {
        return this.projects;
    }

    /**
     * The UsagesInner object to access its operations.
     */
    private UsagesInner usages;

    /**
     * Gets the UsagesInner object to access its operations.
     * @return the UsagesInner object.
     */
    public UsagesInner usages() {
        return this.usages;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * Initializes an instance of DataMigrationServiceClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public DataMigrationServiceClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of DataMigrationServiceClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public DataMigrationServiceClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of DataMigrationServiceClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public DataMigrationServiceClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2018-03-31-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.resourceSkus = new ResourceSkusInner(restClient().retrofit(), this);
        this.services = new ServicesInner(restClient().retrofit(), this);
        this.tasks = new TasksInner(restClient().retrofit(), this);
        this.projects = new ProjectsInner(restClient().retrofit(), this);
        this.usages = new UsagesInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "DataMigrationServiceClient", "2018-03-31-preview");
    }
}
