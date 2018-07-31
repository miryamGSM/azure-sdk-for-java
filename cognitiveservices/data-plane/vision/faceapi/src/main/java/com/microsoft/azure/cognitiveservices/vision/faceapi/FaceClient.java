/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi;

import com.microsoft.azure.AzureClient;
import com.microsoft.rest.RestClient;

/**
 * The interface for FaceClient class.
 */
public interface FaceClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    String userAgent();

    /**
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus.api.cognitive.microsoft.com)..
     *
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * Sets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus.api.cognitive.microsoft.com)..
     *
     * @param endpoint the endpoint value.
     * @return the service client itself
     */
    FaceClient withEndpoint(String endpoint);

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String acceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    FaceClient withAcceptLanguage(String acceptLanguage);

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int longRunningOperationRetryTimeout();

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    FaceClient withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean generateClientRequestId();

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    FaceClient withGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Gets the Faces object to access its operations.
     * @return the Faces object.
     */
    Faces faces();

    /**
     * Gets the PersonGroupPersons object to access its operations.
     * @return the PersonGroupPersons object.
     */
    PersonGroupPersons personGroupPersons();

    /**
     * Gets the PersonGroups object to access its operations.
     * @return the PersonGroups object.
     */
    PersonGroups personGroups();

    /**
     * Gets the FaceLists object to access its operations.
     * @return the FaceLists object.
     */
    FaceLists faceLists();

    /**
     * Gets the LargePersonGroupPersons object to access its operations.
     * @return the LargePersonGroupPersons object.
     */
    LargePersonGroupPersons largePersonGroupPersons();

    /**
     * Gets the LargePersonGroups object to access its operations.
     * @return the LargePersonGroups object.
     */
    LargePersonGroups largePersonGroups();

    /**
     * Gets the LargeFaceLists object to access its operations.
     * @return the LargeFaceLists object.
     */
    LargeFaceLists largeFaceLists();

    /**
     * Gets the LargeFaceListFaces object to access its operations.
     * @return the LargeFaceListFaces object.
     */
    LargeFaceListFaces largeFaceListFaces();

}
