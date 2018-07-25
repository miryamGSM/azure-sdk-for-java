/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a time range in a 24 hour day specified by a start and end time.
 */
public class TimeRange {
    /**
     * Defines an hour and minute of the day specified in 24 hour time.
     */
    @JsonProperty(value = "StartTime")
    private TimeOfDay startTime;

    /**
     * Defines an hour and minute of the day specified in 24 hour time.
     */
    @JsonProperty(value = "EndTime")
    private TimeOfDay endTime;

    /**
     * Get defines an hour and minute of the day specified in 24 hour time.
     *
     * @return the startTime value
     */
    public TimeOfDay startTime() {
        return this.startTime;
    }

    /**
     * Set defines an hour and minute of the day specified in 24 hour time.
     *
     * @param startTime the startTime value to set
     * @return the TimeRange object itself.
     */
    public TimeRange withStartTime(TimeOfDay startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get defines an hour and minute of the day specified in 24 hour time.
     *
     * @return the endTime value
     */
    public TimeOfDay endTime() {
        return this.endTime;
    }

    /**
     * Set defines an hour and minute of the day specified in 24 hour time.
     *
     * @param endTime the endTime value to set
     * @return the TimeRange object itself.
     */
    public TimeRange withEndTime(TimeOfDay endTime) {
        this.endTime = endTime;
        return this;
    }

}