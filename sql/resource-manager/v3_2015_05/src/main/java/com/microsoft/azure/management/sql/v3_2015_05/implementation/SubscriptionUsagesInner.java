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
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in SubscriptionUsages.
 */
public class SubscriptionUsagesInner {
    /** The Retrofit service to perform REST calls. */
    private SubscriptionUsagesService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of SubscriptionUsagesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SubscriptionUsagesInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(SubscriptionUsagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SubscriptionUsages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SubscriptionUsagesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2015_05.SubscriptionUsages listByLocation" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Sql/locations/{locationName}/usages")
        Observable<Response<ResponseBody>> listByLocation(@Path("locationName") String locationName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2015_05.SubscriptionUsages get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Sql/locations/{locationName}/usages/{usageName}")
        Observable<Response<ResponseBody>> get(@Path("locationName") String locationName, @Path("usageName") String usageName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v3_2015_05.SubscriptionUsages listByLocationNext" })
        @GET
        Observable<Response<ResponseBody>> listByLocationNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SubscriptionUsageInner&gt; object if successful.
     */
    public PagedList<SubscriptionUsageInner> listByLocation(final String locationName) {
        ServiceResponse<Page<SubscriptionUsageInner>> response = listByLocationSinglePageAsync(locationName).toBlocking().single();
        return new PagedList<SubscriptionUsageInner>(response.body()) {
            @Override
            public Page<SubscriptionUsageInner> nextPage(String nextPageLink) {
                return listByLocationNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param locationName The name of the region where the resource is located.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SubscriptionUsageInner>> listByLocationAsync(final String locationName, final ListOperationCallback<SubscriptionUsageInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByLocationSinglePageAsync(locationName),
            new Func1<String, Observable<ServiceResponse<Page<SubscriptionUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionUsageInner>>> call(String nextPageLink) {
                    return listByLocationNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SubscriptionUsageInner&gt; object
     */
    public Observable<Page<SubscriptionUsageInner>> listByLocationAsync(final String locationName) {
        return listByLocationWithServiceResponseAsync(locationName)
            .map(new Func1<ServiceResponse<Page<SubscriptionUsageInner>>, Page<SubscriptionUsageInner>>() {
                @Override
                public Page<SubscriptionUsageInner> call(ServiceResponse<Page<SubscriptionUsageInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SubscriptionUsageInner&gt; object
     */
    public Observable<ServiceResponse<Page<SubscriptionUsageInner>>> listByLocationWithServiceResponseAsync(final String locationName) {
        return listByLocationSinglePageAsync(locationName)
            .concatMap(new Func1<ServiceResponse<Page<SubscriptionUsageInner>>, Observable<ServiceResponse<Page<SubscriptionUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionUsageInner>>> call(ServiceResponse<Page<SubscriptionUsageInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByLocationNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
    ServiceResponse<PageImpl<SubscriptionUsageInner>> * @param locationName The name of the region where the resource is located.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SubscriptionUsageInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SubscriptionUsageInner>>> listByLocationSinglePageAsync(final String locationName) {
        if (locationName == null) {
            throw new IllegalArgumentException("Parameter locationName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByLocation(locationName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SubscriptionUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionUsageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SubscriptionUsageInner>> result = listByLocationDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SubscriptionUsageInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SubscriptionUsageInner>> listByLocationDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SubscriptionUsageInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SubscriptionUsageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a subscription usage metric.
     *
     * @param locationName The name of the region where the resource is located.
     * @param usageName Name of usage metric to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SubscriptionUsageInner object if successful.
     */
    public SubscriptionUsageInner get(String locationName, String usageName) {
        return getWithServiceResponseAsync(locationName, usageName).toBlocking().single().body();
    }

    /**
     * Gets a subscription usage metric.
     *
     * @param locationName The name of the region where the resource is located.
     * @param usageName Name of usage metric to return.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SubscriptionUsageInner> getAsync(String locationName, String usageName, final ServiceCallback<SubscriptionUsageInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(locationName, usageName), serviceCallback);
    }

    /**
     * Gets a subscription usage metric.
     *
     * @param locationName The name of the region where the resource is located.
     * @param usageName Name of usage metric to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubscriptionUsageInner object
     */
    public Observable<SubscriptionUsageInner> getAsync(String locationName, String usageName) {
        return getWithServiceResponseAsync(locationName, usageName).map(new Func1<ServiceResponse<SubscriptionUsageInner>, SubscriptionUsageInner>() {
            @Override
            public SubscriptionUsageInner call(ServiceResponse<SubscriptionUsageInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a subscription usage metric.
     *
     * @param locationName The name of the region where the resource is located.
     * @param usageName Name of usage metric to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SubscriptionUsageInner object
     */
    public Observable<ServiceResponse<SubscriptionUsageInner>> getWithServiceResponseAsync(String locationName, String usageName) {
        if (locationName == null) {
            throw new IllegalArgumentException("Parameter locationName is required and cannot be null.");
        }
        if (usageName == null) {
            throw new IllegalArgumentException("Parameter usageName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(locationName, usageName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SubscriptionUsageInner>>>() {
                @Override
                public Observable<ServiceResponse<SubscriptionUsageInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SubscriptionUsageInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SubscriptionUsageInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SubscriptionUsageInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SubscriptionUsageInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SubscriptionUsageInner&gt; object if successful.
     */
    public PagedList<SubscriptionUsageInner> listByLocationNext(final String nextPageLink) {
        ServiceResponse<Page<SubscriptionUsageInner>> response = listByLocationNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<SubscriptionUsageInner>(response.body()) {
            @Override
            public Page<SubscriptionUsageInner> nextPage(String nextPageLink) {
                return listByLocationNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SubscriptionUsageInner>> listByLocationNextAsync(final String nextPageLink, final ServiceFuture<List<SubscriptionUsageInner>> serviceFuture, final ListOperationCallback<SubscriptionUsageInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByLocationNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<SubscriptionUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionUsageInner>>> call(String nextPageLink) {
                    return listByLocationNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SubscriptionUsageInner&gt; object
     */
    public Observable<Page<SubscriptionUsageInner>> listByLocationNextAsync(final String nextPageLink) {
        return listByLocationNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<SubscriptionUsageInner>>, Page<SubscriptionUsageInner>>() {
                @Override
                public Page<SubscriptionUsageInner> call(ServiceResponse<Page<SubscriptionUsageInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SubscriptionUsageInner&gt; object
     */
    public Observable<ServiceResponse<Page<SubscriptionUsageInner>>> listByLocationNextWithServiceResponseAsync(final String nextPageLink) {
        return listByLocationNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<SubscriptionUsageInner>>, Observable<ServiceResponse<Page<SubscriptionUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionUsageInner>>> call(ServiceResponse<Page<SubscriptionUsageInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByLocationNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all subscription usage metrics in a given location.
     *
    ServiceResponse<PageImpl<SubscriptionUsageInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SubscriptionUsageInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SubscriptionUsageInner>>> listByLocationNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByLocationNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SubscriptionUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionUsageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SubscriptionUsageInner>> result = listByLocationNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SubscriptionUsageInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SubscriptionUsageInner>> listByLocationNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SubscriptionUsageInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SubscriptionUsageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
