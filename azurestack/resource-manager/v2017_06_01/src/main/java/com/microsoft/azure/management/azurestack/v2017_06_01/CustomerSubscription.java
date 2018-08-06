/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.azurestack.v2017_06_01.implementation.CustomerSubscriptionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azurestack.v2017_06_01.implementation.AzureStackManager;

/**
 * Type representing CustomerSubscription.
 */
public interface CustomerSubscription extends HasInner<CustomerSubscriptionInner>, Indexable, Refreshable<CustomerSubscription>, Updatable<CustomerSubscription.Update>, HasManager<AzureStackManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the CustomerSubscription definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRegistration, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of CustomerSubscription definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a CustomerSubscription definition.
         */
        interface Blank extends WithRegistration {
        }

        /**
         * The stage of the customersubscription definition allowing to specify Registration.
         */
        interface WithRegistration {
           /**
            * Specifies resourceGroup, registrationName.
            */
            WithCreate withExistingRegistration(String resourceGroup, String registrationName);
        }

        /**
         * The stage of the customersubscription definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the customersubscription definition allowing to specify TenantId.
         */
        interface WithTenantId {
            /**
             * Specifies tenantId.
             */
            WithCreate withTenantId(String tenantId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<CustomerSubscription>, DefinitionStages.WithEtag, DefinitionStages.WithTenantId {
        }
    }
    /**
     * The template for a CustomerSubscription update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<CustomerSubscription>, UpdateStages.WithEtag, UpdateStages.WithTenantId {
    }

    /**
     * Grouping of CustomerSubscription update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the customersubscription update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the customersubscription update allowing to specify TenantId.
         */
        interface WithTenantId {
            /**
             * Specifies tenantId.
             */
            Update withTenantId(String tenantId);
        }

    }
}
