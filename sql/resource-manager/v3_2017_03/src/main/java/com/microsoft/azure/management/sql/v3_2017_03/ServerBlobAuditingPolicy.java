/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2017_03;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v3_2017_03.implementation.ServerBlobAuditingPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v3_2017_03.implementation.SqlManager;
import java.util.List;
import java.util.UUID;

/**
 * Type representing ServerBlobAuditingPolicy.
 */
public interface ServerBlobAuditingPolicy extends HasInner<ServerBlobAuditingPolicyInner>, Indexable, Refreshable<ServerBlobAuditingPolicy>, Updatable<ServerBlobAuditingPolicy.Update>, HasManager<SqlManager> {
    /**
     * @return the auditActionsAndGroups value.
     */
    List<String> auditActionsAndGroups();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isAzureMonitorTargetEnabled value.
     */
    Boolean isAzureMonitorTargetEnabled();

    /**
     * @return the isStorageSecondaryKeyInUse value.
     */
    Boolean isStorageSecondaryKeyInUse();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the retentionDays value.
     */
    Integer retentionDays();

    /**
     * @return the state value.
     */
    BlobAuditingPolicyState state();

    /**
     * @return the storageAccountAccessKey value.
     */
    String storageAccountAccessKey();

    /**
     * @return the storageAccountSubscriptionId value.
     */
    UUID storageAccountSubscriptionId();

    /**
     * @return the storageEndpoint value.
     */
    String storageEndpoint();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ServerBlobAuditingPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithServer, DefinitionStages.WithState, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ServerBlobAuditingPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ServerBlobAuditingPolicy definition.
         */
        interface Blank extends WithServer {
        }

        /**
         * The stage of the serverblobauditingpolicy definition allowing to specify Server.
         */
        interface WithServer {
           /**
            * Specifies resourceGroupName, serverName.
            */
            WithState withExistingServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the serverblobauditingpolicy definition allowing to specify State.
         */
        interface WithState {
           /**
            * Specifies state.
            */
            WithCreate withState(BlobAuditingPolicyState state);
        }

        /**
         * The stage of the serverblobauditingpolicy definition allowing to specify AuditActionsAndGroups.
         */
        interface WithAuditActionsAndGroups {
            /**
             * Specifies auditActionsAndGroups.
             */
            WithCreate withAuditActionsAndGroups(List<String> auditActionsAndGroups);
        }

        /**
         * The stage of the serverblobauditingpolicy definition allowing to specify IsAzureMonitorTargetEnabled.
         */
        interface WithIsAzureMonitorTargetEnabled {
            /**
             * Specifies isAzureMonitorTargetEnabled.
             */
            WithCreate withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled);
        }

        /**
         * The stage of the serverblobauditingpolicy definition allowing to specify IsStorageSecondaryKeyInUse.
         */
        interface WithIsStorageSecondaryKeyInUse {
            /**
             * Specifies isStorageSecondaryKeyInUse.
             */
            WithCreate withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse);
        }

        /**
         * The stage of the serverblobauditingpolicy definition allowing to specify RetentionDays.
         */
        interface WithRetentionDays {
            /**
             * Specifies retentionDays.
             */
            WithCreate withRetentionDays(Integer retentionDays);
        }

        /**
         * The stage of the serverblobauditingpolicy definition allowing to specify StorageAccountAccessKey.
         */
        interface WithStorageAccountAccessKey {
            /**
             * Specifies storageAccountAccessKey.
             */
            WithCreate withStorageAccountAccessKey(String storageAccountAccessKey);
        }

        /**
         * The stage of the serverblobauditingpolicy definition allowing to specify StorageAccountSubscriptionId.
         */
        interface WithStorageAccountSubscriptionId {
            /**
             * Specifies storageAccountSubscriptionId.
             */
            WithCreate withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId);
        }

        /**
         * The stage of the serverblobauditingpolicy definition allowing to specify StorageEndpoint.
         */
        interface WithStorageEndpoint {
            /**
             * Specifies storageEndpoint.
             */
            WithCreate withStorageEndpoint(String storageEndpoint);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ServerBlobAuditingPolicy>, DefinitionStages.WithAuditActionsAndGroups, DefinitionStages.WithIsAzureMonitorTargetEnabled, DefinitionStages.WithIsStorageSecondaryKeyInUse, DefinitionStages.WithRetentionDays, DefinitionStages.WithStorageAccountAccessKey, DefinitionStages.WithStorageAccountSubscriptionId, DefinitionStages.WithStorageEndpoint {
        }
    }
    /**
     * The template for a ServerBlobAuditingPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ServerBlobAuditingPolicy>, UpdateStages.WithAuditActionsAndGroups, UpdateStages.WithIsAzureMonitorTargetEnabled, UpdateStages.WithIsStorageSecondaryKeyInUse, UpdateStages.WithRetentionDays, UpdateStages.WithStorageAccountAccessKey, UpdateStages.WithStorageAccountSubscriptionId, UpdateStages.WithStorageEndpoint {
    }

    /**
     * Grouping of ServerBlobAuditingPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the serverblobauditingpolicy update allowing to specify AuditActionsAndGroups.
         */
        interface WithAuditActionsAndGroups {
            /**
             * Specifies auditActionsAndGroups.
             */
            Update withAuditActionsAndGroups(List<String> auditActionsAndGroups);
        }

        /**
         * The stage of the serverblobauditingpolicy update allowing to specify IsAzureMonitorTargetEnabled.
         */
        interface WithIsAzureMonitorTargetEnabled {
            /**
             * Specifies isAzureMonitorTargetEnabled.
             */
            Update withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled);
        }

        /**
         * The stage of the serverblobauditingpolicy update allowing to specify IsStorageSecondaryKeyInUse.
         */
        interface WithIsStorageSecondaryKeyInUse {
            /**
             * Specifies isStorageSecondaryKeyInUse.
             */
            Update withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse);
        }

        /**
         * The stage of the serverblobauditingpolicy update allowing to specify RetentionDays.
         */
        interface WithRetentionDays {
            /**
             * Specifies retentionDays.
             */
            Update withRetentionDays(Integer retentionDays);
        }

        /**
         * The stage of the serverblobauditingpolicy update allowing to specify StorageAccountAccessKey.
         */
        interface WithStorageAccountAccessKey {
            /**
             * Specifies storageAccountAccessKey.
             */
            Update withStorageAccountAccessKey(String storageAccountAccessKey);
        }

        /**
         * The stage of the serverblobauditingpolicy update allowing to specify StorageAccountSubscriptionId.
         */
        interface WithStorageAccountSubscriptionId {
            /**
             * Specifies storageAccountSubscriptionId.
             */
            Update withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId);
        }

        /**
         * The stage of the serverblobauditingpolicy update allowing to specify StorageEndpoint.
         */
        interface WithStorageEndpoint {
            /**
             * Specifies storageEndpoint.
             */
            Update withStorageEndpoint(String storageEndpoint);
        }

    }
}
