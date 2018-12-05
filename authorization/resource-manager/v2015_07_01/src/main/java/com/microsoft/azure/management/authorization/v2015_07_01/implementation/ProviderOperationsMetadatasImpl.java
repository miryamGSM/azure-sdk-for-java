/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.authorization.v2015_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.authorization.v2015_07_01.ProviderOperationsMetadatas;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.authorization.v2015_07_01.ProviderOperationsMetadata;

class ProviderOperationsMetadatasImpl extends WrapperImpl<ProviderOperationsMetadatasInner> implements ProviderOperationsMetadatas {
    private final AuthorizationManager manager;

    ProviderOperationsMetadatasImpl(AuthorizationManager manager) {
        super(manager.inner().providerOperationsMetadatas());
        this.manager = manager;
    }

    public AuthorizationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ProviderOperationsMetadata> getAsync(String resourceProviderNamespace, String apiVersion) {
        ProviderOperationsMetadatasInner client = this.inner();
        return client.getAsync(resourceProviderNamespace, apiVersion)
        .map(new Func1<ProviderOperationsMetadataInner, ProviderOperationsMetadata>() {
            @Override
            public ProviderOperationsMetadata call(ProviderOperationsMetadataInner inner) {
                return new ProviderOperationsMetadataImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ProviderOperationsMetadata> listAsync(final String apiVersion) {
        ProviderOperationsMetadatasInner client = this.inner();
        return client.listAsync(apiVersion)
        .flatMapIterable(new Func1<Page<ProviderOperationsMetadataInner>, Iterable<ProviderOperationsMetadataInner>>() {
            @Override
            public Iterable<ProviderOperationsMetadataInner> call(Page<ProviderOperationsMetadataInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProviderOperationsMetadataInner, ProviderOperationsMetadata>() {
            @Override
            public ProviderOperationsMetadata call(ProviderOperationsMetadataInner inner) {
                return new ProviderOperationsMetadataImpl(inner, manager());
            }
        });
    }

}
