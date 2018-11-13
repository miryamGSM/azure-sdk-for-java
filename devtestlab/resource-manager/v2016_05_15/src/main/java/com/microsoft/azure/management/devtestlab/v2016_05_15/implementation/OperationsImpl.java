/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlab.v2016_05_15.Operations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.devtestlab.v2016_05_15.OperationResult;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final DevTestLabManager manager;

    OperationsImpl(DevTestLabManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public DevTestLabManager manager() {
        return this.manager;
    }

    private OperationResultImpl wrapModel(OperationResultInner inner) {
        return  new OperationResultImpl(inner, manager());
    }

    @Override
    public Observable<OperationResult> getAsync(String locationName, String name) {
        OperationsInner client = this.inner();
        return client.getAsync(locationName, name)
        .map(new Func1<OperationResultInner, OperationResult>() {
            @Override
            public OperationResult call(OperationResultInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
