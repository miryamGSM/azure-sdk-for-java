/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v3_2017_03.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v3_2017_03.ExtendedDatabaseBlobAuditingPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.sql.v3_2017_03.ExtendedDatabaseBlobAuditingPolicy;

class ExtendedDatabaseBlobAuditingPoliciesImpl extends WrapperImpl<ExtendedDatabaseBlobAuditingPoliciesInner> implements ExtendedDatabaseBlobAuditingPolicies {
    private final SqlManager manager;

    ExtendedDatabaseBlobAuditingPoliciesImpl(SqlManager manager) {
        super(manager.inner().extendedDatabaseBlobAuditingPolicies());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public ExtendedDatabaseBlobAuditingPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private ExtendedDatabaseBlobAuditingPolicyImpl wrapModel(ExtendedDatabaseBlobAuditingPolicyInner inner) {
        return  new ExtendedDatabaseBlobAuditingPolicyImpl(inner, manager());
    }

    private ExtendedDatabaseBlobAuditingPolicyImpl wrapModel(String name) {
        return new ExtendedDatabaseBlobAuditingPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<ExtendedDatabaseBlobAuditingPolicy> getAsync(String resourceGroupName, String serverName, String databaseName) {
        ExtendedDatabaseBlobAuditingPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, databaseName)
        .map(new Func1<ExtendedDatabaseBlobAuditingPolicyInner, ExtendedDatabaseBlobAuditingPolicy>() {
            @Override
            public ExtendedDatabaseBlobAuditingPolicy call(ExtendedDatabaseBlobAuditingPolicyInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
