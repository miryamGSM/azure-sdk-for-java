/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_03_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_03_01_preview.EnrollmentAccount;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class EnrollmentAccountImpl extends WrapperImpl<EnrollmentAccountInner> implements EnrollmentAccount {
    private final BillingManager manager;
    EnrollmentAccountImpl(EnrollmentAccountInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String principalName() {
        return this.inner().principalName();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}