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
 * The maximum size range capability.
 */
public class MaxSizeRangeCapability {
    /**
     * Minimum value.
     */
    @JsonProperty(value = "minValue", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability minValue;

    /**
     * Maximum value.
     */
    @JsonProperty(value = "maxValue", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability maxValue;

    /**
     * Scale/step size for discrete values between the minimum value and the
     * maximum value.
     */
    @JsonProperty(value = "scaleSize", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability scaleSize;

    /**
     * Size of transaction log.
     */
    @JsonProperty(value = "logSize", access = JsonProperty.Access.WRITE_ONLY)
    private LogSizeCapability logSize;

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
     * Get minimum value.
     *
     * @return the minValue value
     */
    public MaxSizeCapability minValue() {
        return this.minValue;
    }

    /**
     * Get maximum value.
     *
     * @return the maxValue value
     */
    public MaxSizeCapability maxValue() {
        return this.maxValue;
    }

    /**
     * Get scale/step size for discrete values between the minimum value and the maximum value.
     *
     * @return the scaleSize value
     */
    public MaxSizeCapability scaleSize() {
        return this.scaleSize;
    }

    /**
     * Get size of transaction log.
     *
     * @return the logSize value
     */
    public LogSizeCapability logSize() {
        return this.logSize;
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
     * @return the MaxSizeRangeCapability object itself.
     */
    public MaxSizeRangeCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

}
