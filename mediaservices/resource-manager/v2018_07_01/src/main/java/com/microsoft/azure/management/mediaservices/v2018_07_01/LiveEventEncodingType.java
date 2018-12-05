/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for LiveEventEncodingType.
 */
public enum LiveEventEncodingType {
    /** Enum value None. */
    NONE("None"),

    /** Enum value Basic. */
    BASIC("Basic");

    /** The actual serialized value for a LiveEventEncodingType instance. */
    private String value;

    LiveEventEncodingType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a LiveEventEncodingType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed LiveEventEncodingType object, or null if unable to parse.
     */
    @JsonCreator
    public static LiveEventEncodingType fromString(String value) {
        LiveEventEncodingType[] items = LiveEventEncodingType.values();
        for (LiveEventEncodingType item : items) {
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
