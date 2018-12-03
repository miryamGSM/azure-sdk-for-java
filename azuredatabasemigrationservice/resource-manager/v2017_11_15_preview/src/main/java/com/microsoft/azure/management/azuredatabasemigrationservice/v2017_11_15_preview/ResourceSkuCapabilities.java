/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes The SKU capabilities object.
 */
public class ResourceSkuCapabilities {
    /**
     * An invariant to describe the feature.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * An invariant if the feature is measured by quantity.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get an invariant to describe the feature.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get an invariant if the feature is measured by quantity.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

}
