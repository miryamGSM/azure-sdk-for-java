/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_07_01.implementation;

import com.microsoft.azure.management.storage.v2018_07_01.UsageUnit;
import com.microsoft.azure.management.storage.v2018_07_01.UsageName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes Storage Resource Usage.
 */
public class UsageInner {
    /**
     * Gets the unit of measurement. Possible values include: 'Count', 'Bytes',
     * 'Seconds', 'Percent', 'CountsPerSecond', 'BytesPerSecond'.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private UsageUnit unit;

    /**
     * Gets the current count of the allocated resources in the subscription.
     */
    @JsonProperty(value = "currentValue", access = JsonProperty.Access.WRITE_ONLY)
    private Integer currentValue;

    /**
     * Gets the maximum count of the resources that can be allocated in the
     * subscription.
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Integer limit;

    /**
     * Gets the name of the type of usage.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private UsageName name;

    /**
     * Get gets the unit of measurement. Possible values include: 'Count', 'Bytes', 'Seconds', 'Percent', 'CountsPerSecond', 'BytesPerSecond'.
     *
     * @return the unit value
     */
    public UsageUnit unit() {
        return this.unit;
    }

    /**
     * Get gets the current count of the allocated resources in the subscription.
     *
     * @return the currentValue value
     */
    public Integer currentValue() {
        return this.currentValue;
    }

    /**
     * Get gets the maximum count of the resources that can be allocated in the subscription.
     *
     * @return the limit value
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Get gets the name of the type of usage.
     *
     * @return the name value
     */
    public UsageName name() {
        return this.name;
    }

}
