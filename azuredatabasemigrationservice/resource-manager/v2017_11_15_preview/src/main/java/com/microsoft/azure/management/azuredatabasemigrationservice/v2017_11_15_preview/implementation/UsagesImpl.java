/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.Usages;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.Quota;

class UsagesImpl extends WrapperImpl<UsagesInner> implements Usages {
    private final DataMigrationManager manager;

    UsagesImpl(DataMigrationManager manager) {
        super(manager.inner().usages());
        this.manager = manager;
    }

    public DataMigrationManager manager() {
        return this.manager;
    }

    private QuotaImpl wrapModel(QuotaInner inner) {
        return  new QuotaImpl(inner, manager());
    }

    @Override
    public Observable<Quota> listAsync(final String location) {
        UsagesInner client = this.inner();
        return client.listAsync(location)
        .flatMapIterable(new Func1<Page<QuotaInner>, Iterable<QuotaInner>>() {
            @Override
            public Iterable<QuotaInner> call(Page<QuotaInner> page) {
                return page.items();
            }
        })
        .map(new Func1<QuotaInner, Quota>() {
            @Override
            public Quota call(QuotaInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
