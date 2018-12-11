/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2014_04.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The database usages.
 */
public class DatabaseUsageInner {
    /**
     * The name of the usage metric.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The name of the resource.
     */
    @JsonProperty(value = "resourceName", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceName;

    /**
     * The usage metric display name.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * The current value of the usage metric.
     */
    @JsonProperty(value = "currentValue", access = JsonProperty.Access.WRITE_ONLY)
    private Double currentValue;

    /**
     * The current limit of the usage metric.
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Double limit;

    /**
     * The units of the usage metric.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /**
     * The next reset time for the usage metric (ISO8601 format).
     */
    @JsonProperty(value = "nextResetTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime nextResetTime;

    /**
     * Get the name of the usage metric.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the name of the resource.
     *
     * @return the resourceName value
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Get the usage metric display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the current value of the usage metric.
     *
     * @return the currentValue value
     */
    public Double currentValue() {
        return this.currentValue;
    }

    /**
     * Get the current limit of the usage metric.
     *
     * @return the limit value
     */
    public Double limit() {
        return this.limit;
    }

    /**
     * Get the units of the usage metric.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the next reset time for the usage metric (ISO8601 format).
     *
     * @return the nextResetTime value
     */
    public DateTime nextResetTime() {
        return this.nextResetTime;
    }

}
