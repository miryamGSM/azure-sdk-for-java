/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation;

import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.FileStorageInfo;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;

class FileStorageInfoImpl extends WrapperImpl<FileStorageInfoInner> implements FileStorageInfo {
    private final DataMigrationManager manager;
    FileStorageInfoImpl(FileStorageInfoInner inner, DataMigrationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataMigrationManager manager() {
        return this.manager;
    }

    @Override
    public Map<String, String> headers() {
        return this.inner().headers();
    }

    @Override
    public String uri() {
        return this.inner().uri();
    }

}
