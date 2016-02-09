/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.LocalNetworkGateway;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.List;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.HTTP;
import retrofit.http.Path;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in LocalNetworkGatewaysOperations.
 */
public interface LocalNetworkGatewaysOperations {
    /**
     * The interface defining all the services for LocalNetworkGatewaysOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LocalNetworkGatewaysService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("localNetworkGatewayName") String localNetworkGatewayName, @Path("subscriptionId") String subscriptionId, @Body LocalNetworkGateway parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("localNetworkGatewayName") String localNetworkGatewayName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways/{localNetworkGatewayName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("localNetworkGatewayName") String localNetworkGatewayName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/localNetworkGateways")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * The Put LocalNetworkGateway operation creates/updates a local network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Local Network Gateway operation through Network resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the LocalNetworkGateway object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<LocalNetworkGateway> createOrUpdate(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGateway parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put LocalNetworkGateway operation creates/updates a local network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param parameters Parameters supplied to the Begin Create or update Local Network Gateway operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String localNetworkGatewayName, LocalNetworkGateway parameters, final ServiceCallback<LocalNetworkGateway> serviceCallback);

    /**
     * The Get LocalNetworkGateway operation retrieves information about the specified local network gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the LocalNetworkGateway object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<LocalNetworkGateway> get(String resourceGroupName, String localNetworkGatewayName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get LocalNetworkGateway operation retrieves information about the specified local network gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String localNetworkGatewayName, final ServiceCallback<LocalNetworkGateway> serviceCallback);

    /**
     * The Delete LocalNetworkGateway operation deletes the specifed local network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String localNetworkGatewayName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Delete LocalNetworkGateway operation deletes the specifed local network Gateway through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param localNetworkGatewayName The name of the local network gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String localNetworkGatewayName, final ServiceCallback<Void> serviceCallback);

    /**
     * The List LocalNetworkGateways opertion retrieves all the local network gateways stored.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;LocalNetworkGateway&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<LocalNetworkGateway>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List LocalNetworkGateways opertion retrieves all the local network gateways stored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(final String resourceGroupName, final ListOperationCallback<LocalNetworkGateway> serviceCallback);

    /**
     * The List LocalNetworkGateways opertion retrieves all the local network gateways stored.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;LocalNetworkGateway&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<LocalNetworkGateway>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List LocalNetworkGateways opertion retrieves all the local network gateways stored.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(final String nextPageLink, final ListOperationCallback<LocalNetworkGateway> serviceCallback);

}
