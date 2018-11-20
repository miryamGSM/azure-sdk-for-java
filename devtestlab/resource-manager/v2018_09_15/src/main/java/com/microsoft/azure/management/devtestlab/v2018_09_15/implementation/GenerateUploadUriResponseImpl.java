/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15.implementation;

import com.microsoft.azure.management.devtestlab.v2018_09_15.GenerateUploadUriResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class GenerateUploadUriResponseImpl extends WrapperImpl<GenerateUploadUriResponseInner> implements GenerateUploadUriResponse {
    private final DevTestLabManager manager;
    GenerateUploadUriResponseImpl(GenerateUploadUriResponseInner inner, DevTestLabManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public String uploadUri() {
        return this.inner().uploadUri();
    }

}
