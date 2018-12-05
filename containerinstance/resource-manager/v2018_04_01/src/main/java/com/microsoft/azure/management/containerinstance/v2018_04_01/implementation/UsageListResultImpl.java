/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_04_01.implementation;

import com.microsoft.azure.management.containerinstance.v2018_04_01.UsageListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.containerinstance.v2018_04_01.Usage;

class UsageListResultImpl extends WrapperImpl<UsageListResultInner> implements UsageListResult {
    private final ContainerInstanceManager manager;
    UsageListResultImpl(UsageListResultInner inner, ContainerInstanceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerInstanceManager manager() {
        return this.manager;
    }

    @Override
    public List<Usage> value() {
        return this.inner().value();
    }

}
