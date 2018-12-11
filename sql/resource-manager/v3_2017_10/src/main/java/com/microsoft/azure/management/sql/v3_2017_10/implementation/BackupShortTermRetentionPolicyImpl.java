/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2017_10.implementation;

import com.microsoft.azure.management.sql.v3_2017_10.BackupShortTermRetentionPolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class BackupShortTermRetentionPolicyImpl extends CreatableUpdatableImpl<BackupShortTermRetentionPolicy, BackupShortTermRetentionPolicyInner, BackupShortTermRetentionPolicyImpl> implements BackupShortTermRetentionPolicy, BackupShortTermRetentionPolicy.Definition, BackupShortTermRetentionPolicy.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String databaseName;

    BackupShortTermRetentionPolicyImpl(String name, SqlManager manager) {
        super(name, new BackupShortTermRetentionPolicyInner());
        this.manager = manager;
        // Set resource name
        this.databaseName = name;
        //
    }

    BackupShortTermRetentionPolicyImpl(BackupShortTermRetentionPolicyInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.databaseName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BackupShortTermRetentionPolicy> createResourceAsync() {
        BackupShortTermRetentionPoliciesInner client = this.manager().inner().backupShortTermRetentionPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<BackupShortTermRetentionPolicy> updateResourceAsync() {
        BackupShortTermRetentionPoliciesInner client = this.manager().inner().backupShortTermRetentionPolicies();
        return client.updateAsync(this.resourceGroupName, this.serverName, this.databaseName)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<BackupShortTermRetentionPolicyInner> getInnerAsync() {
        BackupShortTermRetentionPoliciesInner client = this.manager().inner().backupShortTermRetentionPolicies();
        return client.getAsync(this.resourceGroupName, this.serverName, this.databaseName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
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
    public Integer retentionDays() {
        return this.inner().retentionDays();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public BackupShortTermRetentionPolicyImpl withExistingDatabasis(String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

}
