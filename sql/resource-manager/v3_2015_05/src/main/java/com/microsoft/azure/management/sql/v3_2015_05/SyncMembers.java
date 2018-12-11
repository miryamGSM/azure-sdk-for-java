/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2015_05;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.sql.v3_2015_05.implementation.SyncMembersInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v3_2015_05.SyncMemberSyncGroupDatabasisServerSyncFullSchemaProperties;

/**
 * Type representing SyncMembers.
 */
public interface SyncMembers extends SupportsCreating<SyncMember.DefinitionStages.Blank>, HasInner<SyncMembersInner> {
    /**
     * Refreshes a sync member database schema.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable refreshMemberSchemaAsync(String resourceGroupName, String serverName, String databaseName, String syncGroupName, String syncMemberName);

    /**
     * Gets a sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SyncMember> getAsync(String resourceGroupName, String serverName, String databaseName, String syncGroupName, String syncMemberName);

    /**
     * Lists sync members in the given sync group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SyncMember> listBySyncGroupAsync(final String resourceGroupName, final String serverName, final String databaseName, final String syncGroupName);

    /**
     * Deletes a sync member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serverName, String databaseName, String syncGroupName, String syncMemberName);

    /**
     * Gets a sync member database schema.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database on which the sync group is hosted.
     * @param syncGroupName The name of the sync group on which the sync member is hosted.
     * @param syncMemberName The name of the sync member.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SyncMemberSyncGroupDatabasisServerSyncFullSchemaProperties> listMemberSchemasAsync(final String resourceGroupName, final String serverName, final String databaseName, final String syncGroupName, final String syncMemberName);

}
