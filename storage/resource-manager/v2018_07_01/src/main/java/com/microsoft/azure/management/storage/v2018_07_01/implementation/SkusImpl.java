/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.storage.v2018_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.v2018_07_01.Skus;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.arm.utils.PagedListConverter;
import com.microsoft.azure.management.storage.v2018_07_01.Sku;

class SkusImpl extends WrapperImpl<SkusInner> implements Skus {
    private PagedListConverter<SkuInner, Sku> converter;
    private final StorageManager manager;

    SkusImpl(StorageManager manager) {
        super(manager.inner().skus());
        this.manager = manager;
        this.converter = new PagedListConverter<SkuInner, Sku>() {
            @Override
            public Observable<Sku> typeConvertAsync(SkuInner inner) {
                return Observable.just((Sku) wrapModel(inner));
            }
        };
    }

    public StorageManager manager() {
        return this.manager;
    }

    private SkuImpl wrapModel(SkuInner inner) {
        return  new SkuImpl(inner, manager());
    }

    @Override
    public PagedList<Sku> list() {
        SkusInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<Sku> listAsync() {
        SkusInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<SkuInner>, Observable<SkuInner>>() {
            @Override
            public Observable<SkuInner> call(Page<SkuInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<SkuInner, Sku>() {
            @Override
            public Sku call(SkuInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
