/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2017_10.implementation;

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
 * in ManagedInstanceEncryptionProtectors.
 */
public class ManagedInstanceEncryptionProtectorsInner {
    /** The Retrofit service to perform REST calls. */
    private ManagedInstanceEncryptionProtectorsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ManagedInstanceEncryptionProtectorsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ManagedInstanceEncryptionProtectorsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(ManagedInstanceEncryptionProtectorsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ManagedInstanceEncryptionProtectors to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ManagedInstanceEncryptionProtectorsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2017_10.ManagedInstanceEncryptionProtectors listByInstance" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/encryptionProtector")
        Observable<Response<ResponseBody>> listByInstance(@Path("resourceGroupName") String resourceGroupName, @Path("managedInstanceName") String managedInstanceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2017_10.ManagedInstanceEncryptionProtectors get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/encryptionProtector/{encryptionProtectorName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("managedInstanceName") String managedInstanceName, @Path("encryptionProtectorName") String encryptionProtectorName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2017_10.ManagedInstanceEncryptionProtectors createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/encryptionProtector/{encryptionProtectorName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("managedInstanceName") String managedInstanceName, @Path("encryptionProtectorName") String encryptionProtectorName, @Path("subscriptionId") String subscriptionId, @Body ManagedInstanceEncryptionProtectorInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2017_10.ManagedInstanceEncryptionProtectors beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/managedInstances/{managedInstanceName}/encryptionProtector/{encryptionProtectorName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("managedInstanceName") String managedInstanceName, @Path("encryptionProtectorName") String encryptionProtectorName, @Path("subscriptionId") String subscriptionId, @Body ManagedInstanceEncryptionProtectorInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2017_10.ManagedInstanceEncryptionProtectors listByInstanceNext" })
        @GET
        Observable<Response<ResponseBody>> listByInstanceNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of managed instance encryption protectors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ManagedInstanceEncryptionProtectorInner&gt; object if successful.
     */
    public PagedList<ManagedInstanceEncryptionProtectorInner> listByInstance(final String resourceGroupName, final String managedInstanceName) {
        ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>> response = listByInstanceSinglePageAsync(resourceGroupName, managedInstanceName).toBlocking().single();
        return new PagedList<ManagedInstanceEncryptionProtectorInner>(response.body()) {
            @Override
            public Page<ManagedInstanceEncryptionProtectorInner> nextPage(String nextPageLink) {
                return listByInstanceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of managed instance encryption protectors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ManagedInstanceEncryptionProtectorInner>> listByInstanceAsync(final String resourceGroupName, final String managedInstanceName, final ListOperationCallback<ManagedInstanceEncryptionProtectorInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByInstanceSinglePageAsync(resourceGroupName, managedInstanceName),
            new Func1<String, Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>> call(String nextPageLink) {
                    return listByInstanceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of managed instance encryption protectors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedInstanceEncryptionProtectorInner&gt; object
     */
    public Observable<Page<ManagedInstanceEncryptionProtectorInner>> listByInstanceAsync(final String resourceGroupName, final String managedInstanceName) {
        return listByInstanceWithServiceResponseAsync(resourceGroupName, managedInstanceName)
            .map(new Func1<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>, Page<ManagedInstanceEncryptionProtectorInner>>() {
                @Override
                public Page<ManagedInstanceEncryptionProtectorInner> call(ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of managed instance encryption protectors.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedInstanceEncryptionProtectorInner&gt; object
     */
    public Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>> listByInstanceWithServiceResponseAsync(final String resourceGroupName, final String managedInstanceName) {
        return listByInstanceSinglePageAsync(resourceGroupName, managedInstanceName)
            .concatMap(new Func1<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>, Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>> call(ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByInstanceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of managed instance encryption protectors.
     *
    ServiceResponse<PageImpl<ManagedInstanceEncryptionProtectorInner>> * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
    ServiceResponse<PageImpl<ManagedInstanceEncryptionProtectorInner>> * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ManagedInstanceEncryptionProtectorInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>> listByInstanceSinglePageAsync(final String resourceGroupName, final String managedInstanceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (managedInstanceName == null) {
            throw new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByInstance(resourceGroupName, managedInstanceName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ManagedInstanceEncryptionProtectorInner>> result = listByInstanceDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ManagedInstanceEncryptionProtectorInner>> listByInstanceDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ManagedInstanceEncryptionProtectorInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ManagedInstanceEncryptionProtectorInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a managed instance encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagedInstanceEncryptionProtectorInner object if successful.
     */
    public ManagedInstanceEncryptionProtectorInner get(String resourceGroupName, String managedInstanceName) {
        return getWithServiceResponseAsync(resourceGroupName, managedInstanceName).toBlocking().single().body();
    }

    /**
     * Gets a managed instance encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagedInstanceEncryptionProtectorInner> getAsync(String resourceGroupName, String managedInstanceName, final ServiceCallback<ManagedInstanceEncryptionProtectorInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, managedInstanceName), serviceCallback);
    }

    /**
     * Gets a managed instance encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagedInstanceEncryptionProtectorInner object
     */
    public Observable<ManagedInstanceEncryptionProtectorInner> getAsync(String resourceGroupName, String managedInstanceName) {
        return getWithServiceResponseAsync(resourceGroupName, managedInstanceName).map(new Func1<ServiceResponse<ManagedInstanceEncryptionProtectorInner>, ManagedInstanceEncryptionProtectorInner>() {
            @Override
            public ManagedInstanceEncryptionProtectorInner call(ServiceResponse<ManagedInstanceEncryptionProtectorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a managed instance encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagedInstanceEncryptionProtectorInner object
     */
    public Observable<ServiceResponse<ManagedInstanceEncryptionProtectorInner>> getWithServiceResponseAsync(String resourceGroupName, String managedInstanceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (managedInstanceName == null) {
            throw new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String encryptionProtectorName = "current";
        return service.get(resourceGroupName, managedInstanceName, encryptionProtectorName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ManagedInstanceEncryptionProtectorInner>>>() {
                @Override
                public Observable<ServiceResponse<ManagedInstanceEncryptionProtectorInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ManagedInstanceEncryptionProtectorInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ManagedInstanceEncryptionProtectorInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ManagedInstanceEncryptionProtectorInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ManagedInstanceEncryptionProtectorInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagedInstanceEncryptionProtectorInner object if successful.
     */
    public ManagedInstanceEncryptionProtectorInner createOrUpdate(String resourceGroupName, String managedInstanceName, ManagedInstanceEncryptionProtectorInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, parameters).toBlocking().last().body();
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The requested encryption protector resource state.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagedInstanceEncryptionProtectorInner> createOrUpdateAsync(String resourceGroupName, String managedInstanceName, ManagedInstanceEncryptionProtectorInner parameters, final ServiceCallback<ManagedInstanceEncryptionProtectorInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, parameters), serviceCallback);
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ManagedInstanceEncryptionProtectorInner> createOrUpdateAsync(String resourceGroupName, String managedInstanceName, ManagedInstanceEncryptionProtectorInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, parameters).map(new Func1<ServiceResponse<ManagedInstanceEncryptionProtectorInner>, ManagedInstanceEncryptionProtectorInner>() {
            @Override
            public ManagedInstanceEncryptionProtectorInner call(ServiceResponse<ManagedInstanceEncryptionProtectorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<ManagedInstanceEncryptionProtectorInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String managedInstanceName, ManagedInstanceEncryptionProtectorInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (managedInstanceName == null) {
            throw new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null.");
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
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(resourceGroupName, managedInstanceName, encryptionProtectorName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<ManagedInstanceEncryptionProtectorInner>() { }.getType());
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagedInstanceEncryptionProtectorInner object if successful.
     */
    public ManagedInstanceEncryptionProtectorInner beginCreateOrUpdate(String resourceGroupName, String managedInstanceName, ManagedInstanceEncryptionProtectorInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, parameters).toBlocking().single().body();
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The requested encryption protector resource state.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagedInstanceEncryptionProtectorInner> beginCreateOrUpdateAsync(String resourceGroupName, String managedInstanceName, ManagedInstanceEncryptionProtectorInner parameters, final ServiceCallback<ManagedInstanceEncryptionProtectorInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, parameters), serviceCallback);
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagedInstanceEncryptionProtectorInner object
     */
    public Observable<ManagedInstanceEncryptionProtectorInner> beginCreateOrUpdateAsync(String resourceGroupName, String managedInstanceName, ManagedInstanceEncryptionProtectorInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, managedInstanceName, parameters).map(new Func1<ServiceResponse<ManagedInstanceEncryptionProtectorInner>, ManagedInstanceEncryptionProtectorInner>() {
            @Override
            public ManagedInstanceEncryptionProtectorInner call(ServiceResponse<ManagedInstanceEncryptionProtectorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates an existing encryption protector.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param parameters The requested encryption protector resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagedInstanceEncryptionProtectorInner object
     */
    public Observable<ServiceResponse<ManagedInstanceEncryptionProtectorInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String managedInstanceName, ManagedInstanceEncryptionProtectorInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (managedInstanceName == null) {
            throw new IllegalArgumentException("Parameter managedInstanceName is required and cannot be null.");
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
        return service.beginCreateOrUpdate(resourceGroupName, managedInstanceName, encryptionProtectorName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ManagedInstanceEncryptionProtectorInner>>>() {
                @Override
                public Observable<ServiceResponse<ManagedInstanceEncryptionProtectorInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ManagedInstanceEncryptionProtectorInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ManagedInstanceEncryptionProtectorInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ManagedInstanceEncryptionProtectorInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ManagedInstanceEncryptionProtectorInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of managed instance encryption protectors.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ManagedInstanceEncryptionProtectorInner&gt; object if successful.
     */
    public PagedList<ManagedInstanceEncryptionProtectorInner> listByInstanceNext(final String nextPageLink) {
        ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>> response = listByInstanceNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ManagedInstanceEncryptionProtectorInner>(response.body()) {
            @Override
            public Page<ManagedInstanceEncryptionProtectorInner> nextPage(String nextPageLink) {
                return listByInstanceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of managed instance encryption protectors.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ManagedInstanceEncryptionProtectorInner>> listByInstanceNextAsync(final String nextPageLink, final ServiceFuture<List<ManagedInstanceEncryptionProtectorInner>> serviceFuture, final ListOperationCallback<ManagedInstanceEncryptionProtectorInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByInstanceNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>> call(String nextPageLink) {
                    return listByInstanceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of managed instance encryption protectors.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedInstanceEncryptionProtectorInner&gt; object
     */
    public Observable<Page<ManagedInstanceEncryptionProtectorInner>> listByInstanceNextAsync(final String nextPageLink) {
        return listByInstanceNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>, Page<ManagedInstanceEncryptionProtectorInner>>() {
                @Override
                public Page<ManagedInstanceEncryptionProtectorInner> call(ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of managed instance encryption protectors.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedInstanceEncryptionProtectorInner&gt; object
     */
    public Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>> listByInstanceNextWithServiceResponseAsync(final String nextPageLink) {
        return listByInstanceNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>, Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>> call(ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByInstanceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of managed instance encryption protectors.
     *
    ServiceResponse<PageImpl<ManagedInstanceEncryptionProtectorInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ManagedInstanceEncryptionProtectorInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>> listByInstanceNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByInstanceNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ManagedInstanceEncryptionProtectorInner>> result = listByInstanceNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ManagedInstanceEncryptionProtectorInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ManagedInstanceEncryptionProtectorInner>> listByInstanceNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ManagedInstanceEncryptionProtectorInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ManagedInstanceEncryptionProtectorInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
