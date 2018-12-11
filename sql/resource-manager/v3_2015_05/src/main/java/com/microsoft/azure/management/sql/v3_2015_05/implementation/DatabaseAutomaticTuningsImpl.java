/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.sql.v3_2015_05.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v3_2015_05.DatabaseAutomaticTunings;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.sql.v3_2015_05.DatabaseAutomaticTuning;

class DatabaseAutomaticTuningsImpl extends WrapperImpl<DatabaseAutomaticTuningsInner> implements DatabaseAutomaticTunings {
    private final SqlManager manager;

    DatabaseAutomaticTuningsImpl(SqlManager manager) {
        super(manager.inner().databaseAutomaticTunings());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<DatabaseAutomaticTuning> getAsync(String resourceGroupName, String serverName, String databaseName) {
        DatabaseAutomaticTuningsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, databaseName)
        .map(new Func1<DatabaseAutomaticTuningInner, DatabaseAutomaticTuning>() {
            @Override
            public DatabaseAutomaticTuning call(DatabaseAutomaticTuningInner inner) {
                return new DatabaseAutomaticTuningImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DatabaseAutomaticTuning> updateAsync(String resourceGroupName, String serverName, String databaseName, DatabaseAutomaticTuningInner parameters) {
        DatabaseAutomaticTuningsInner client = this.inner();
        return client.updateAsync(resourceGroupName, serverName, databaseName, parameters)
        .map(new Func1<DatabaseAutomaticTuningInner, DatabaseAutomaticTuning>() {
            @Override
            public DatabaseAutomaticTuning call(DatabaseAutomaticTuningInner inner) {
                return new DatabaseAutomaticTuningImpl(inner, manager());
            }
        });
    }

}
