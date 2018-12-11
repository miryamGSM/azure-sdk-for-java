/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2014_04.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in RecommendedElasticPools.
 */
public class RecommendedElasticPoolsInner {
    /** The Retrofit service to perform REST calls. */
    private RecommendedElasticPoolsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of RecommendedElasticPoolsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RecommendedElasticPoolsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(RecommendedElasticPoolsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for RecommendedElasticPools to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RecommendedElasticPoolsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2014_04.RecommendedElasticPools get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/recommendedElasticPools/{recommendedElasticPoolName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("recommendedElasticPoolName") String recommendedElasticPoolName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2014_04.RecommendedElasticPools listByServer" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/recommendedElasticPools")
        Observable<Response<ResponseBody>> listByServer(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2014_04.RecommendedElasticPools listMetrics" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/recommendedElasticPools/{recommendedElasticPoolName}/metrics")
        Observable<Response<ResponseBody>> listMetrics(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("recommendedElasticPoolName") String recommendedElasticPoolName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a recommented elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recommendedElasticPoolName The name of the recommended elastic pool to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RecommendedElasticPoolInner object if successful.
     */
    public RecommendedElasticPoolInner get(String resourceGroupName, String serverName, String recommendedElasticPoolName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, recommendedElasticPoolName).toBlocking().single().body();
    }

    /**
     * Gets a recommented elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recommendedElasticPoolName The name of the recommended elastic pool to be retrieved.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RecommendedElasticPoolInner> getAsync(String resourceGroupName, String serverName, String recommendedElasticPoolName, final ServiceCallback<RecommendedElasticPoolInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, recommendedElasticPoolName), serviceCallback);
    }

    /**
     * Gets a recommented elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recommendedElasticPoolName The name of the recommended elastic pool to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecommendedElasticPoolInner object
     */
    public Observable<RecommendedElasticPoolInner> getAsync(String resourceGroupName, String serverName, String recommendedElasticPoolName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, recommendedElasticPoolName).map(new Func1<ServiceResponse<RecommendedElasticPoolInner>, RecommendedElasticPoolInner>() {
            @Override
            public RecommendedElasticPoolInner call(ServiceResponse<RecommendedElasticPoolInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a recommented elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recommendedElasticPoolName The name of the recommended elastic pool to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecommendedElasticPoolInner object
     */
    public Observable<ServiceResponse<RecommendedElasticPoolInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String recommendedElasticPoolName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (recommendedElasticPoolName == null) {
            throw new IllegalArgumentException("Parameter recommendedElasticPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, recommendedElasticPoolName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RecommendedElasticPoolInner>>>() {
                @Override
                public Observable<ServiceResponse<RecommendedElasticPoolInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RecommendedElasticPoolInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RecommendedElasticPoolInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RecommendedElasticPoolInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RecommendedElasticPoolInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns recommended elastic pools.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;RecommendedElasticPoolInner&gt; object if successful.
     */
    public List<RecommendedElasticPoolInner> listByServer(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Returns recommended elastic pools.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RecommendedElasticPoolInner>> listByServerAsync(String resourceGroupName, String serverName, final ServiceCallback<List<RecommendedElasticPoolInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByServerWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Returns recommended elastic pools.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RecommendedElasticPoolInner&gt; object
     */
    public Observable<List<RecommendedElasticPoolInner>> listByServerAsync(String resourceGroupName, String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<List<RecommendedElasticPoolInner>>, List<RecommendedElasticPoolInner>>() {
            @Override
            public List<RecommendedElasticPoolInner> call(ServiceResponse<List<RecommendedElasticPoolInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns recommended elastic pools.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RecommendedElasticPoolInner&gt; object
     */
    public Observable<ServiceResponse<List<RecommendedElasticPoolInner>>> listByServerWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByServer(this.client.subscriptionId(), resourceGroupName, serverName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<RecommendedElasticPoolInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<RecommendedElasticPoolInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RecommendedElasticPoolInner>> result = listByServerDelegate(response);
                        List<RecommendedElasticPoolInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<RecommendedElasticPoolInner>> clientResponse = new ServiceResponse<List<RecommendedElasticPoolInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RecommendedElasticPoolInner>> listByServerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RecommendedElasticPoolInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RecommendedElasticPoolInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Returns recommented elastic pool metrics.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recommendedElasticPoolName The name of the recommended elastic pool to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;RecommendedElasticPoolMetricInner&gt; object if successful.
     */
    public List<RecommendedElasticPoolMetricInner> listMetrics(String resourceGroupName, String serverName, String recommendedElasticPoolName) {
        return listMetricsWithServiceResponseAsync(resourceGroupName, serverName, recommendedElasticPoolName).toBlocking().single().body();
    }

    /**
     * Returns recommented elastic pool metrics.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recommendedElasticPoolName The name of the recommended elastic pool to be retrieved.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RecommendedElasticPoolMetricInner>> listMetricsAsync(String resourceGroupName, String serverName, String recommendedElasticPoolName, final ServiceCallback<List<RecommendedElasticPoolMetricInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listMetricsWithServiceResponseAsync(resourceGroupName, serverName, recommendedElasticPoolName), serviceCallback);
    }

    /**
     * Returns recommented elastic pool metrics.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recommendedElasticPoolName The name of the recommended elastic pool to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RecommendedElasticPoolMetricInner&gt; object
     */
    public Observable<List<RecommendedElasticPoolMetricInner>> listMetricsAsync(String resourceGroupName, String serverName, String recommendedElasticPoolName) {
        return listMetricsWithServiceResponseAsync(resourceGroupName, serverName, recommendedElasticPoolName).map(new Func1<ServiceResponse<List<RecommendedElasticPoolMetricInner>>, List<RecommendedElasticPoolMetricInner>>() {
            @Override
            public List<RecommendedElasticPoolMetricInner> call(ServiceResponse<List<RecommendedElasticPoolMetricInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns recommented elastic pool metrics.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param recommendedElasticPoolName The name of the recommended elastic pool to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RecommendedElasticPoolMetricInner&gt; object
     */
    public Observable<ServiceResponse<List<RecommendedElasticPoolMetricInner>>> listMetricsWithServiceResponseAsync(String resourceGroupName, String serverName, String recommendedElasticPoolName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (recommendedElasticPoolName == null) {
            throw new IllegalArgumentException("Parameter recommendedElasticPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listMetrics(this.client.subscriptionId(), resourceGroupName, serverName, recommendedElasticPoolName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<RecommendedElasticPoolMetricInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<RecommendedElasticPoolMetricInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RecommendedElasticPoolMetricInner>> result = listMetricsDelegate(response);
                        List<RecommendedElasticPoolMetricInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<RecommendedElasticPoolMetricInner>> clientResponse = new ServiceResponse<List<RecommendedElasticPoolMetricInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RecommendedElasticPoolMetricInner>> listMetricsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RecommendedElasticPoolMetricInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RecommendedElasticPoolMetricInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
