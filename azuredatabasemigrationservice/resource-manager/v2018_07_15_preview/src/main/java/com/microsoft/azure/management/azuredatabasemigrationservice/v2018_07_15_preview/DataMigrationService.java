/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.DataMigrationManager;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.DataMigrationServiceInner;

/**
 * Type representing DataMigrationService.
 */
public interface DataMigrationService extends HasInner<DataMigrationServiceInner>, Resource, GroupableResourceCore<DataMigrationManager, DataMigrationServiceInner>, HasResourceGroup, Refreshable<DataMigrationService>, Updatable<DataMigrationService.Update>, HasManager<DataMigrationManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the provisioningState value.
     */
    ServiceProvisioningState provisioningState();

    /**
     * @return the publicKey value.
     */
    String publicKey();

    /**
     * @return the sku value.
     */
    ServiceSku sku();

    /**
     * @return the virtualSubnetId value.
     */
    String virtualSubnetId();

    /**
     * The entirety of the DataMigrationService definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithVirtualSubnetId, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DataMigrationService definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DataMigrationService definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the DataMigrationService definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithVirtualSubnetId> {
        }

        /**
         * The stage of the datamigrationservice definition allowing to specify VirtualSubnetId.
         */
        interface WithVirtualSubnetId {
           /**
            * Specifies virtualSubnetId.
            * @param virtualSubnetId The ID of the Microsoft.Network/virtualNetworks/subnets resource to which the service should be joined
            * @return the next definition stage
*/
            WithCreate withVirtualSubnetId(String virtualSubnetId);
        }

        /**
         * The stage of the datamigrationservice definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag HTTP strong entity tag value. Ignored if submitted
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the datamigrationservice definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind The resource kind. Only 'vm' (the default) is supported
             * @return the next definition stage
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the datamigrationservice definition allowing to specify PublicKey.
         */
        interface WithPublicKey {
            /**
             * Specifies publicKey.
             * @param publicKey The public key of the service, used to encrypt secrets sent to the service
             * @return the next definition stage
             */
            WithCreate withPublicKey(String publicKey);
        }

        /**
         * The stage of the datamigrationservice definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Service SKU
             * @return the next definition stage
             */
            WithCreate withSku(ServiceSku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DataMigrationService>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithEtag, DefinitionStages.WithKind, DefinitionStages.WithPublicKey, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a DataMigrationService update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DataMigrationService>, Resource.UpdateWithTags<Update>, UpdateStages.WithEtag, UpdateStages.WithKind, UpdateStages.WithPublicKey, UpdateStages.WithSku {
    }

    /**
     * Grouping of DataMigrationService update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the datamigrationservice update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag HTTP strong entity tag value. Ignored if submitted
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the datamigrationservice update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind The resource kind. Only 'vm' (the default) is supported
             * @return the next update stage
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the datamigrationservice update allowing to specify PublicKey.
         */
        interface WithPublicKey {
            /**
             * Specifies publicKey.
             * @param publicKey The public key of the service, used to encrypt secrets sent to the service
             * @return the next update stage
             */
            Update withPublicKey(String publicKey);
        }

        /**
         * The stage of the datamigrationservice update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Service SKU
             * @return the next update stage
             */
            Update withSku(ServiceSku sku);
        }

    }
}
