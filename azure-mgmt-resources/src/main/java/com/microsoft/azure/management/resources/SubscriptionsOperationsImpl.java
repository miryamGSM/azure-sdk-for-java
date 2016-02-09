/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.resources.models.Location;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.azure.management.resources.models.Subscription;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.List;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in SubscriptionsOperations.
 */
public final class SubscriptionsOperationsImpl implements SubscriptionsOperations {
    /** The Retrofit service to perform REST calls. */
    private SubscriptionsService service;
    /** The service client containing this operation class. */
    private SubscriptionClient client;

    /**
     * Initializes an instance of SubscriptionsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SubscriptionsOperationsImpl(Retrofit retrofit, SubscriptionClient client) {
        this.service = retrofit.create(SubscriptionsService.class);
        this.client = client;
    }

    /**
     * Gets a list of the subscription locations.
     *
     * @param subscriptionId Id of the subscription
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Location&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<List<Location>> listLocations(final String subscriptionId) throws CloudException, IOException, IllegalArgumentException {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listLocations(subscriptionId, this.client.getApiVersion(), this.client.getAcceptLanguage());
        ServiceResponse<PageImpl<Location>> response = listLocationsDelegate(call.execute(), null);
        List<Location> result = response.getBody().getItems();
        while (response.getBody().getNextPageLink() != null) {
            response = listLocationsNext(response.getBody().getNextPageLink());
            result.addAll(response.getBody().getItems());
        }
        return new ServiceResponse<>(result, response.getResponse());
    }

    /**
     * Gets a list of the subscription locations.
     *
     * @param subscriptionId Id of the subscription
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> listLocationsAsync(final String subscriptionId, final ListOperationCallback<Location> serviceCallback) {
        if (subscriptionId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listLocations(subscriptionId, this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<List<Location>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    ServiceResponse<PageImpl<Location>> result = listLocationsDelegate(response, retrofit);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listLocationsNextAsync(result.getBody().getNextPageLink(), serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponse<>(serviceCallback.get(), response));
                        }
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Location>> listLocationsDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<Location>, CloudException>()
                .register(200, new TypeToken<PageImpl<Location>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * Gets details about particular subscription.
     *
     * @param subscriptionId Id of the subscription.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Subscription object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Subscription> get(String subscriptionId) throws CloudException, IOException, IllegalArgumentException {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.get(subscriptionId, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDelegate(call.execute(), null);
    }

    /**
     * Gets details about particular subscription.
     *
     * @param subscriptionId Id of the subscription.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getAsync(String subscriptionId, final ServiceCallback<Subscription> serviceCallback) {
        if (subscriptionId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter subscriptionId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.get(subscriptionId, this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Subscription>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Subscription> getDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Subscription, CloudException>()
                .register(200, new TypeToken<Subscription>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Subscription&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<List<Subscription>> list() throws CloudException, IOException, IllegalArgumentException {
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.list(this.client.getApiVersion(), this.client.getAcceptLanguage());
        ServiceResponse<PageImpl<Subscription>> response = listDelegate(call.execute(), null);
        List<Subscription> result = response.getBody().getItems();
        while (response.getBody().getNextPageLink() != null) {
            response = listNext(response.getBody().getNextPageLink());
            result.addAll(response.getBody().getItems());
        }
        return new ServiceResponse<>(result, response.getResponse());
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> listAsync(final ListOperationCallback<Subscription> serviceCallback) {
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.list(this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<List<Subscription>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    ServiceResponse<PageImpl<Subscription>> result = listDelegate(response, retrofit);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listNextAsync(result.getBody().getNextPageLink(), serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponse<>(serviceCallback.get(), response));
                        }
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Subscription>> listDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<Subscription>, CloudException>()
                .register(200, new TypeToken<PageImpl<Subscription>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * Gets a list of the subscription locations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Location&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Location>> listLocationsNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listLocationsNext(nextPageLink, this.client.getAcceptLanguage());
        return listLocationsNextDelegate(call.execute(), null);
    }

    /**
     * Gets a list of the subscription locations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> listLocationsNextAsync(final String nextPageLink, final ListOperationCallback<Location> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listLocationsNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<List<Location>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    ServiceResponse<PageImpl<Location>> result = listLocationsNextDelegate(response, retrofit);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listLocationsNextAsync(result.getBody().getNextPageLink(), serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponse<>(serviceCallback.get(), response));
                    }
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Location>> listLocationsNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<Location>, CloudException>()
                .register(200, new TypeToken<PageImpl<Location>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Subscription&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Subscription>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        return listNextDelegate(call.execute(), null);
    }

    /**
     * Gets a list of the subscriptionIds.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> listNextAsync(final String nextPageLink, final ListOperationCallback<Subscription> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<List<Subscription>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    ServiceResponse<PageImpl<Subscription>> result = listNextDelegate(response, retrofit);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listNextAsync(result.getBody().getNextPageLink(), serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponse<>(serviceCallback.get(), response));
                    }
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<Subscription>> listNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<Subscription>, CloudException>()
                .register(200, new TypeToken<PageImpl<Subscription>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

}
