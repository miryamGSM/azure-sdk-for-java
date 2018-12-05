/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2017_12_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.containerinstance.v2017_12_01_preview.Usage;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response containing the usage data.
 */
public class UsageListResultInner {
    /**
     * The value property.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<Usage> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<Usage> value() {
        return this.value;
    }

}
