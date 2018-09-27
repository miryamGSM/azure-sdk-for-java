/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mediaservices.v2018_07_01.implementation.StreamingLocatorInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2018_07_01.implementation.MediaManager;
import org.joda.time.DateTime;
import java.util.UUID;
import java.util.List;

/**
 * Type representing StreamingLocator.
 */
public interface StreamingLocator extends HasInner<StreamingLocatorInner>, Indexable, Refreshable<StreamingLocator>, Updatable<StreamingLocator.Update>, HasManager<MediaManager> {
    /**
     * @return the alternativeMediaId value.
     */
    String alternativeMediaId();

    /**
     * @return the assetName value.
     */
    String assetName();

    /**
     * @return the contentKeys value.
     */
    List<StreamingLocatorContentKey> contentKeys();

    /**
     * @return the created value.
     */
    DateTime created();

    /**
     * @return the defaultContentKeyPolicyName value.
     */
    String defaultContentKeyPolicyName();

    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the streamingLocatorId value.
     */
    UUID streamingLocatorId();

    /**
     * @return the streamingPolicyName value.
     */
    String streamingPolicyName();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the StreamingLocator definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMediaservice, DefinitionStages.WithAssetName, DefinitionStages.WithStreamingPolicyName, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StreamingLocator definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StreamingLocator definition.
         */
        interface Blank extends WithMediaservice {
        }

        /**
         * The stage of the streaminglocator definition allowing to specify Mediaservice.
         */
        interface WithMediaservice {
           /**
            * Specifies resourceGroupName, accountName.
            */
            WithAssetName withExistingMediaservice(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify AssetName.
         */
        interface WithAssetName {
           /**
            * Specifies assetName.
            */
            WithStreamingPolicyName withAssetName(String assetName);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify StreamingPolicyName.
         */
        interface WithStreamingPolicyName {
           /**
            * Specifies streamingPolicyName.
            */
            WithCreate withStreamingPolicyName(String streamingPolicyName);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify AlternativeMediaId.
         */
        interface WithAlternativeMediaId {
            /**
             * Specifies alternativeMediaId.
             */
            WithCreate withAlternativeMediaId(String alternativeMediaId);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify ContentKeys.
         */
        interface WithContentKeys {
            /**
             * Specifies contentKeys.
             */
            WithCreate withContentKeys(List<StreamingLocatorContentKey> contentKeys);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify DefaultContentKeyPolicyName.
         */
        interface WithDefaultContentKeyPolicyName {
            /**
             * Specifies defaultContentKeyPolicyName.
             */
            WithCreate withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify EndTime.
         */
        interface WithEndTime {
            /**
             * Specifies endTime.
             */
            WithCreate withEndTime(DateTime endTime);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify StartTime.
         */
        interface WithStartTime {
            /**
             * Specifies startTime.
             */
            WithCreate withStartTime(DateTime startTime);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify StreamingLocatorId.
         */
        interface WithStreamingLocatorId {
            /**
             * Specifies streamingLocatorId.
             */
            WithCreate withStreamingLocatorId(UUID streamingLocatorId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StreamingLocator>, DefinitionStages.WithAlternativeMediaId, DefinitionStages.WithContentKeys, DefinitionStages.WithDefaultContentKeyPolicyName, DefinitionStages.WithEndTime, DefinitionStages.WithStartTime, DefinitionStages.WithStreamingLocatorId {
        }
    }
    /**
     * The template for a StreamingLocator update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StreamingLocator>, UpdateStages.WithAlternativeMediaId, UpdateStages.WithContentKeys, UpdateStages.WithDefaultContentKeyPolicyName, UpdateStages.WithEndTime, UpdateStages.WithStartTime, UpdateStages.WithStreamingLocatorId {
    }

    /**
     * Grouping of StreamingLocator update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the streaminglocator update allowing to specify AlternativeMediaId.
         */
        interface WithAlternativeMediaId {
            /**
             * Specifies alternativeMediaId.
             */
            Update withAlternativeMediaId(String alternativeMediaId);
        }

        /**
         * The stage of the streaminglocator update allowing to specify ContentKeys.
         */
        interface WithContentKeys {
            /**
             * Specifies contentKeys.
             */
            Update withContentKeys(List<StreamingLocatorContentKey> contentKeys);
        }

        /**
         * The stage of the streaminglocator update allowing to specify DefaultContentKeyPolicyName.
         */
        interface WithDefaultContentKeyPolicyName {
            /**
             * Specifies defaultContentKeyPolicyName.
             */
            Update withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName);
        }

        /**
         * The stage of the streaminglocator update allowing to specify EndTime.
         */
        interface WithEndTime {
            /**
             * Specifies endTime.
             */
            Update withEndTime(DateTime endTime);
        }

        /**
         * The stage of the streaminglocator update allowing to specify StartTime.
         */
        interface WithStartTime {
            /**
             * Specifies startTime.
             */
            Update withStartTime(DateTime startTime);
        }

        /**
         * The stage of the streaminglocator update allowing to specify StreamingLocatorId.
         */
        interface WithStreamingLocatorId {
            /**
             * Specifies streamingLocatorId.
             */
            Update withStreamingLocatorId(UUID streamingLocatorId);
        }

    }
}
