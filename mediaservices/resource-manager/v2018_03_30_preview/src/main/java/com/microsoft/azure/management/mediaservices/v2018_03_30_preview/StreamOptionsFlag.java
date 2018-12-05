/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for StreamOptionsFlag.
 */
public enum StreamOptionsFlag {
    /** Enum value Default. */
    DEFAULT("Default"),

    /** Enum value LowLatency. */
    LOW_LATENCY("LowLatency");

    /** The actual serialized value for a StreamOptionsFlag instance. */
    private String value;

    StreamOptionsFlag(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a StreamOptionsFlag instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed StreamOptionsFlag object, or null if unable to parse.
     */
    @JsonCreator
    public static StreamOptionsFlag fromString(String value) {
        StreamOptionsFlag[] items = StreamOptionsFlag.values();
        for (StreamOptionsFlag item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
