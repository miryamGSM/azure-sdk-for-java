/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlab.v2015_05_21_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlab.v2015_05_21_preview.Costs;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.devtestlab.v2015_05_21_preview.Cost;

class CostsImpl extends WrapperImpl<CostsInner> implements Costs {
    private final DevTestLabManager manager;

    CostsImpl(DevTestLabManager manager) {
        super(manager.inner().costs());
        this.manager = manager;
    }

    public DevTestLabManager manager() {
        return this.manager;
    }

    private CostImpl wrapModel(CostInner inner) {
        return  new CostImpl(inner, manager());
    }

    @Override
    public Completable refreshDataAsync(String resourceGroupName, String labName, String name) {
        CostsInner client = this.inner();
        return client.refreshDataAsync(resourceGroupName, labName, name).toCompletable();
    }

    @Override
    public Observable<Cost> listAsync(final String resourceGroupName, final String labName) {
        CostsInner client = this.inner();
        return client.listAsync(resourceGroupName, labName)
        .flatMapIterable(new Func1<Page<CostInner>, Iterable<CostInner>>() {
            @Override
            public Iterable<CostInner> call(Page<CostInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CostInner, Cost>() {
            @Override
            public Cost call(CostInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Cost> getResourceAsync(String resourceGroupName, String labName, String name) {
        CostsInner client = this.inner();
        return client.getResourceAsync(resourceGroupName, labName, name)
        .map(new Func1<CostInner, Cost>() {
            @Override
            public Cost call(CostInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
