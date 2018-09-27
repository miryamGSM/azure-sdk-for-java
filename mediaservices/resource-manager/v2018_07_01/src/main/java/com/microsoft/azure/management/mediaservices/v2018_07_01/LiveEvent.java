/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mediaservices.v2018_07_01.implementation.LiveEventInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2018_07_01.implementation.MediaManager;
import java.util.Map;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing LiveEvent.
 */
public interface LiveEvent extends HasInner<LiveEventInner>, Indexable, Refreshable<LiveEvent>, Updatable<LiveEvent.Update>, HasManager<MediaManager> {
    /**
     * @return the created value.
     */
    DateTime created();

    /**
     * @return the crossSiteAccessPolicies value.
     */
    CrossSiteAccessPolicies crossSiteAccessPolicies();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the encoding value.
     */
    LiveEventEncoding encoding();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the input value.
     */
    LiveEventInput input();

    /**
     * @return the lastModified value.
     */
    DateTime lastModified();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the preview value.
     */
    LiveEventPreview preview();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceState value.
     */
    LiveEventResourceState resourceState();

    /**
     * @return the streamOptions value.
     */
    List<StreamOptionsFlag> streamOptions();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the vanityUrl value.
     */
    Boolean vanityUrl();

    /**
     * The entirety of the LiveEvent definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMediaservice, DefinitionStages.WithInput, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of LiveEvent definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a LiveEvent definition.
         */
        interface Blank extends WithMediaservice {
        }

        /**
         * The stage of the liveevent definition allowing to specify Mediaservice.
         */
        interface WithMediaservice {
           /**
            * Specifies resourceGroupName, accountName.
            */
            WithInput withExistingMediaservice(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the liveevent definition allowing to specify Input.
         */
        interface WithInput {
           /**
            * Specifies input.
            */
            WithCreate withInput(LiveEventInput input);
        }

        /**
         * The stage of the liveevent definition allowing to specify CrossSiteAccessPolicies.
         */
        interface WithCrossSiteAccessPolicies {
            /**
             * Specifies crossSiteAccessPolicies.
             */
            WithCreate withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies);
        }

        /**
         * The stage of the liveevent definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the liveevent definition allowing to specify Encoding.
         */
        interface WithEncoding {
            /**
             * Specifies encoding.
             */
            WithCreate withEncoding(LiveEventEncoding encoding);
        }

        /**
         * The stage of the liveevent definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the liveevent definition allowing to specify Preview.
         */
        interface WithPreview {
            /**
             * Specifies preview.
             */
            WithCreate withPreview(LiveEventPreview preview);
        }

        /**
         * The stage of the liveevent definition allowing to specify StreamOptions.
         */
        interface WithStreamOptions {
            /**
             * Specifies streamOptions.
             */
            WithCreate withStreamOptions(List<StreamOptionsFlag> streamOptions);
        }

        /**
         * The stage of the liveevent definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the liveevent definition allowing to specify VanityUrl.
         */
        interface WithVanityUrl {
            /**
             * Specifies vanityUrl.
             */
            WithCreate withVanityUrl(Boolean vanityUrl);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<LiveEvent>, DefinitionStages.WithCrossSiteAccessPolicies, DefinitionStages.WithDescription, DefinitionStages.WithEncoding, DefinitionStages.WithLocation, DefinitionStages.WithPreview, DefinitionStages.WithStreamOptions, DefinitionStages.WithTags, DefinitionStages.WithVanityUrl {
        }
    }
    /**
     * The template for a LiveEvent update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<LiveEvent>, UpdateStages.WithCrossSiteAccessPolicies, UpdateStages.WithDescription, UpdateStages.WithEncoding, UpdateStages.WithLocation, UpdateStages.WithPreview, UpdateStages.WithStreamOptions, UpdateStages.WithTags, UpdateStages.WithVanityUrl {
    }

    /**
     * Grouping of LiveEvent update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the liveevent update allowing to specify CrossSiteAccessPolicies.
         */
        interface WithCrossSiteAccessPolicies {
            /**
             * Specifies crossSiteAccessPolicies.
             */
            Update withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies);
        }

        /**
         * The stage of the liveevent update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the liveevent update allowing to specify Encoding.
         */
        interface WithEncoding {
            /**
             * Specifies encoding.
             */
            Update withEncoding(LiveEventEncoding encoding);
        }

        /**
         * The stage of the liveevent update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the liveevent update allowing to specify Preview.
         */
        interface WithPreview {
            /**
             * Specifies preview.
             */
            Update withPreview(LiveEventPreview preview);
        }

        /**
         * The stage of the liveevent update allowing to specify StreamOptions.
         */
        interface WithStreamOptions {
            /**
             * Specifies streamOptions.
             */
            Update withStreamOptions(List<StreamOptionsFlag> streamOptions);
        }

        /**
         * The stage of the liveevent update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the liveevent update allowing to specify VanityUrl.
         */
        interface WithVanityUrl {
            /**
             * Specifies vanityUrl.
             */
            Update withVanityUrl(Boolean vanityUrl);
        }

    }
}
