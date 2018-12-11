/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2017_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The minimum per-database performance level capability.
 */
public class ElasticPoolPerDatabaseMinPerformanceLevelCapability {
    /**
     * The minimum performance level per database.
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Double limit;

    /**
     * Unit type used to measure performance level. Possible values include:
     * 'DTU', 'VCores'.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private PerformanceLevelUnit unit;

    /**
     * The status of the capability. Possible values include: 'Visible',
     * 'Available', 'Default', 'Disabled'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /**
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the minimum performance level per database.
     *
     * @return the limit value
     */
    public Double limit() {
        return this.limit;
    }

    /**
     * Get unit type used to measure performance level. Possible values include: 'DTU', 'VCores'.
     *
     * @return the unit value
     */
    public PerformanceLevelUnit unit() {
        return this.unit;
    }

    /**
     * Get the status of the capability. Possible values include: 'Visible', 'Available', 'Default', 'Disabled'.
     *
     * @return the status value
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason for the capability not being available.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason for the capability not being available.
     *
     * @param reason the reason value to set
     * @return the ElasticPoolPerDatabaseMinPerformanceLevelCapability object itself.
     */
    public ElasticPoolPerDatabaseMinPerformanceLevelCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

}
