/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.devtestlab.v2018_09_15.GalleryImageReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A gallery image.
 */
@JsonFlatten
@SkipParentValidation
public class GalleryImageInner extends Resource {
    /**
     * The author of the gallery image.
     */
    @JsonProperty(value = "properties.author")
    private String author;

    /**
     * The creation date of the gallery image.
     */
    @JsonProperty(value = "properties.createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdDate;

    /**
     * The description of the gallery image.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The image reference of the gallery image.
     */
    @JsonProperty(value = "properties.imageReference")
    private GalleryImageReference imageReference;

    /**
     * The icon of the gallery image.
     */
    @JsonProperty(value = "properties.icon")
    private String icon;

    /**
     * Indicates whether this gallery image is enabled.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * The third party plan that applies to this image.
     */
    @JsonProperty(value = "properties.planId")
    private String planId;

    /**
     * Indicates if the plan has been authorized for programmatic deployment.
     */
    @JsonProperty(value = "properties.isPlanAuthorized")
    private Boolean isPlanAuthorized;

    /**
     * Get the author of the gallery image.
     *
     * @return the author value
     */
    public String author() {
        return this.author;
    }

    /**
     * Set the author of the gallery image.
     *
     * @param author the author value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get the creation date of the gallery image.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the description of the gallery image.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the gallery image.
     *
     * @param description the description value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the image reference of the gallery image.
     *
     * @return the imageReference value
     */
    public GalleryImageReference imageReference() {
        return this.imageReference;
    }

    /**
     * Set the image reference of the gallery image.
     *
     * @param imageReference the imageReference value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withImageReference(GalleryImageReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

    /**
     * Get the icon of the gallery image.
     *
     * @return the icon value
     */
    public String icon() {
        return this.icon;
    }

    /**
     * Set the icon of the gallery image.
     *
     * @param icon the icon value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Get indicates whether this gallery image is enabled.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set indicates whether this gallery image is enabled.
     *
     * @param enabled the enabled value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the third party plan that applies to this image.
     *
     * @return the planId value
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Set the third party plan that applies to this image.
     *
     * @param planId the planId value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get indicates if the plan has been authorized for programmatic deployment.
     *
     * @return the isPlanAuthorized value
     */
    public Boolean isPlanAuthorized() {
        return this.isPlanAuthorized;
    }

    /**
     * Set indicates if the plan has been authorized for programmatic deployment.
     *
     * @param isPlanAuthorized the isPlanAuthorized value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withIsPlanAuthorized(Boolean isPlanAuthorized) {
        this.isPlanAuthorized = isPlanAuthorized;
        return this;
    }

}
