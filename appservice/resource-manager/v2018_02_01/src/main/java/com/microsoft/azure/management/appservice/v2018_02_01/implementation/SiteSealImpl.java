/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.SiteSeal;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class SiteSealImpl extends WrapperImpl<SiteSealInner> implements SiteSeal {
    private final CertificateRegistrationManager manager;
    SiteSealImpl(SiteSealInner inner, CertificateRegistrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public String html() {
        return this.inner().html();
    }

}
