/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2014_04.implementation;

import com.microsoft.azure.management.sql.v3_2014_04.TransparentDataEncryption;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v3_2014_04.TransparentDataEncryptionStatus;

class TransparentDataEncryptionImpl extends WrapperImpl<TransparentDataEncryptionInner> implements TransparentDataEncryption {
    private final SqlManager manager;
    TransparentDataEncryptionImpl(TransparentDataEncryptionInner inner, SqlManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public TransparentDataEncryptionStatus status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
