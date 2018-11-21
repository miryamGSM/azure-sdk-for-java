/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.devtestlab.v2016_05_15.implementation.UserInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlab.v2016_05_15.implementation.DevTestLabManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing User.
 */
public interface User extends HasInner<UserInner>, Indexable, Refreshable<User>, Updatable<User.Update>, HasManager<DevTestLabManager> {
    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identity value.
     */
    UserIdentity identity();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the secretStore value.
     */
    UserSecretStore secretStore();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * The entirety of the User definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLab, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of User definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a User definition.
         */
        interface Blank extends WithLab {
        }

        /**
         * The stage of the user definition allowing to specify Lab.
         */
        interface WithLab {
           /**
            * Specifies resourceGroupName, labName.
            * @param resourceGroupName The name of the resource group
            * @param labName The name of the lab
            * @return the next definition stage
            */
            WithCreate withExistingLab(String resourceGroupName, String labName);
        }

        /**
         * The stage of the user definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the user
             * @return the next definition stage
             */
            WithCreate withIdentity(UserIdentity identity);
        }

        /**
         * The stage of the user definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the user definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning status of the resource
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the user definition allowing to specify SecretStore.
         */
        interface WithSecretStore {
            /**
             * Specifies secretStore.
             * @param secretStore The secret store of the user
             * @return the next definition stage
             */
            WithCreate withSecretStore(UserSecretStore secretStore);
        }

        /**
         * The stage of the user definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the user definition allowing to specify UniqueIdentifier.
         */
        interface WithUniqueIdentifier {
            /**
             * Specifies uniqueIdentifier.
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid)
             * @return the next definition stage
             */
            WithCreate withUniqueIdentifier(String uniqueIdentifier);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<User>, DefinitionStages.WithIdentity, DefinitionStages.WithLocation, DefinitionStages.WithProvisioningState, DefinitionStages.WithSecretStore, DefinitionStages.WithTags, DefinitionStages.WithUniqueIdentifier {
        }
    }
    /**
     * The template for a User update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<User>, UpdateStages.WithIdentity, UpdateStages.WithLocation, UpdateStages.WithProvisioningState, UpdateStages.WithSecretStore, UpdateStages.WithTags, UpdateStages.WithUniqueIdentifier {
    }

    /**
     * Grouping of User update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the user update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the user
             * @return the next update stage
             */
            Update withIdentity(UserIdentityFragment identity);
        }

        /**
         * The stage of the user update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the user update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning status of the resource
             * @return the next update stage
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the user update allowing to specify SecretStore.
         */
        interface WithSecretStore {
            /**
             * Specifies secretStore.
             * @param secretStore The secret store of the user
             * @return the next update stage
             */
            Update withSecretStore(UserSecretStoreFragment secretStore);
        }

        /**
         * The stage of the user update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the user update allowing to specify UniqueIdentifier.
         */
        interface WithUniqueIdentifier {
            /**
             * Specifies uniqueIdentifier.
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid)
             * @return the next update stage
             */
            Update withUniqueIdentifier(String uniqueIdentifier);
        }

    }
}
