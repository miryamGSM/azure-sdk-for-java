/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2015_05.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in EncryptionProtectors.
 */
public class EncryptionProtectorsInner {
    /** The Retrofit service to perform REST calls. */
    private EncryptionProtectorsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of EncryptionProtectorsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public EncryptionProtectorsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(EncryptionProtectorsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for EncryptionProtectors to be
     * used by Retrofit to perform actually REST calls.
     */
    interface EncryptionProtectorsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2015_05.EncryptionProtectors listByServer" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/encryptionProtector")
        Observable<Response<ResponseBody>> listByServer(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2015_05.EncryptionProtectors get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/encryptionProtector/{encryptionProtectorName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("encryptionProtectorName") String encryptionProtectorName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2015_05.EncryptionProtectors createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/encryptionProtector/{encryptionProtectorName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("encryptionProtectorName") String encryptionProtectorName, @Path("subscriptionId") String subscriptionId, @Body EncryptionProtectorInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2015_05.EncryptionProtectors beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/encryptionProtector/{encryptionProtectorName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("encryptionProtectorName") String encryptionProtectorName, @Path("subscriptionId") String subscriptionId, @Body EncryptionProtectorInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2015_05.EncryptionProtectors listByServerNext" })
        @GET
        Observable<Response<ResponseBody>> listByServerNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of server encryption protectors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;EncryptionProtectorInner&gt; object if successful.
     */
    public PagedList<EncryptionProtectorInner> listByServer(final String resourceGroupName, final String serverName) {
        ServiceResponse<Page<EncryptionProtectorInner>> response = listByServerSinglePageAsync(resourceGroupName, serverName).toBlocking().single();
        return new PagedList<EncryptionProtectorInner>(response.body()) {
            @Override
            public Page<EncryptionProtectorInner> nextPage(String nextPageLink) {
                return listByServerNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of server encryption protectors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<EncryptionProtectorInner>> listByServerAsync(final String resourceGroupName, final String serverName, final ListOperationCallback<EncryptionProtectorInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServerSinglePageAsync(resourceGroupName, serverName),
            new Func1<String, Observable<ServiceResponse<Page<EncryptionProtectorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EncryptionProtectorInner>>> call(String nextPageLink) {
                    return listByServerNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of server encryption protectors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EncryptionProtectorInner&gt; object
     */
    public Observable<Page<EncryptionProtectorInner>> listByServerAsync(final String resourceGroupName, final String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName)
            .map(new Func1<ServiceResponse<Page<EncryptionProtectorInner>>, Page<EncryptionProtectorInner>>() {
                @Override
                public Page<EncryptionProtectorInner> call(ServiceResponse<Page<EncryptionProtectorInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of server encryption protectors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EncryptionProtectorInner&gt; object
     */
    public Observable<ServiceResponse<Page<EncryptionProtectorInner>>> listByServerWithServiceResponseAsync(final String resourceGroupName, final String serverName) {
        return listByServerSinglePageAsync(resourceGroupName, serverName)
            .concatMap(new Func1<ServiceResponse<Page<EncryptionProtectorInner>>, Observable<ServiceResponse<Page<EncryptionProtectorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EncryptionProtectorInner>>> call(ServiceResponse<Page<EncryptionProtectorInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServerNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of server encryption protectors.
     *
    ServiceResponse<PageImpl<EncryptionProtectorInner>> * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
    ServiceResponse<PageImpl<EncryptionProtectorInner>> * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;EncryptionProtectorInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<EncryptionProtectorInner>>> listByServerSinglePageAsync(final String resourceGroupName, final String serverName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByServer(resourceGroupName, serverName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<EncryptionProtectorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EncryptionProtectorInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<EncryptionProtectorInner>> result = listByServerDelegate(response);
                        return Observable.just(new ServiceResponse<Page<EncryptionProtectorInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<EncryptionProtectorInner>> listByServerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<EncryptionProtectorInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<EncryptionProtectorInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a server encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EncryptionProtectorInner object if successful.
     */
    public EncryptionProtectorInner get(String resourceGroupName, String serverName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Gets a server encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EncryptionProtectorInner> getAsync(String resourceGroupName, String serverName, final ServiceCallback<EncryptionProtectorInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Gets a server encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EncryptionProtectorInner object
     */
    public Observable<EncryptionProtectorInner> getAsync(String resourceGroupName, String serverName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<EncryptionProtectorInner>, EncryptionProtectorInner>() {
            @Override
            public EncryptionProtectorInner call(ServiceResponse<EncryptionProtectorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a server encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EncryptionProtectorInner object
     */
    public Observable<ServiceResponse<EncryptionProtectorInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String encryptionProtectorName = "current";
        return service.get(resourceGroupName, serverName, encryptionProtectorName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EncryptionProtectorInner>>>() {
                @Override
                public Observable<ServiceResponse<EncryptionProtectorInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EncryptionProtectorInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EncryptionProtectorInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<EncryptionProtectorInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EncryptionProtectorInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EncryptionProtectorInner object if successful.
     */
    public EncryptionProtectorInner createOrUpdate(String resourceGroupName, String serverName, EncryptionProtectorInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters).toBlocking().last().body();
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The requested encryption protector resource state.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EncryptionProtectorInner> createOrUpdateAsync(String resourceGroupName, String serverName, EncryptionProtectorInner parameters, final ServiceCallback<EncryptionProtectorInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters), serviceCallback);
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<EncryptionProtectorInner> createOrUpdateAsync(String resourceGroupName, String serverName, EncryptionProtectorInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters).map(new Func1<ServiceResponse<EncryptionProtectorInner>, EncryptionProtectorInner>() {
            @Override
            public EncryptionProtectorInner call(ServiceResponse<EncryptionProtectorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<EncryptionProtectorInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, EncryptionProtectorInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String encryptionProtectorName = "current";
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(resourceGroupName, serverName, encryptionProtectorName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<EncryptionProtectorInner>() { }.getType());
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EncryptionProtectorInner object if successful.
     */
    public EncryptionProtectorInner beginCreateOrUpdate(String resourceGroupName, String serverName, EncryptionProtectorInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters).toBlocking().single().body();
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The requested encryption protector resource state.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EncryptionProtectorInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, EncryptionProtectorInner parameters, final ServiceCallback<EncryptionProtectorInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters), serviceCallback);
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EncryptionProtectorInner object
     */
    public Observable<EncryptionProtectorInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, EncryptionProtectorInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, parameters).map(new Func1<ServiceResponse<EncryptionProtectorInner>, EncryptionProtectorInner>() {
            @Override
            public EncryptionProtectorInner call(ServiceResponse<EncryptionProtectorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EncryptionProtectorInner object
     */
    public Observable<ServiceResponse<EncryptionProtectorInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, EncryptionProtectorInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String encryptionProtectorName = "current";
        return service.beginCreateOrUpdate(resourceGroupName, serverName, encryptionProtectorName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EncryptionProtectorInner>>>() {
                @Override
                public Observable<ServiceResponse<EncryptionProtectorInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EncryptionProtectorInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EncryptionProtectorInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<EncryptionProtectorInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EncryptionProtectorInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of server encryption protectors.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;EncryptionProtectorInner&gt; object if successful.
     */
    public PagedList<EncryptionProtectorInner> listByServerNext(final String nextPageLink) {
        ServiceResponse<Page<EncryptionProtectorInner>> response = listByServerNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<EncryptionProtectorInner>(response.body()) {
            @Override
            public Page<EncryptionProtectorInner> nextPage(String nextPageLink) {
                return listByServerNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of server encryption protectors.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<EncryptionProtectorInner>> listByServerNextAsync(final String nextPageLink, final ServiceFuture<List<EncryptionProtectorInner>> serviceFuture, final ListOperationCallback<EncryptionProtectorInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServerNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<EncryptionProtectorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EncryptionProtectorInner>>> call(String nextPageLink) {
                    return listByServerNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of server encryption protectors.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EncryptionProtectorInner&gt; object
     */
    public Observable<Page<EncryptionProtectorInner>> listByServerNextAsync(final String nextPageLink) {
        return listByServerNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<EncryptionProtectorInner>>, Page<EncryptionProtectorInner>>() {
                @Override
                public Page<EncryptionProtectorInner> call(ServiceResponse<Page<EncryptionProtectorInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of server encryption protectors.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;EncryptionProtectorInner&gt; object
     */
    public Observable<ServiceResponse<Page<EncryptionProtectorInner>>> listByServerNextWithServiceResponseAsync(final String nextPageLink) {
        return listByServerNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<EncryptionProtectorInner>>, Observable<ServiceResponse<Page<EncryptionProtectorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EncryptionProtectorInner>>> call(ServiceResponse<Page<EncryptionProtectorInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServerNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of server encryption protectors.
     *
    ServiceResponse<PageImpl<EncryptionProtectorInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;EncryptionProtectorInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<EncryptionProtectorInner>>> listByServerNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByServerNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<EncryptionProtectorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<EncryptionProtectorInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<EncryptionProtectorInner>> result = listByServerNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<EncryptionProtectorInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<EncryptionProtectorInner>> listByServerNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<EncryptionProtectorInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<EncryptionProtectorInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
