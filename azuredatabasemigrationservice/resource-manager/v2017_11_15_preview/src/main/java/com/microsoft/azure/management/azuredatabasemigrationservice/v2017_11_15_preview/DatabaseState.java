/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DatabaseState.
 */
public enum DatabaseState {
    /** Enum value Online. */
    ONLINE("Online"),

    /** Enum value Restoring. */
    RESTORING("Restoring"),

    /** Enum value Recovering. */
    RECOVERING("Recovering"),

    /** Enum value RecoveryPending. */
    RECOVERY_PENDING("RecoveryPending"),

    /** Enum value Suspect. */
    SUSPECT("Suspect"),

    /** Enum value Emergency. */
    EMERGENCY("Emergency"),

    /** Enum value Offline. */
    OFFLINE("Offline"),

    /** Enum value Copying. */
    COPYING("Copying"),

    /** Enum value OfflineSecondary. */
    OFFLINE_SECONDARY("OfflineSecondary");

    /** The actual serialized value for a DatabaseState instance. */
    private String value;

    DatabaseState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DatabaseState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DatabaseState object, or null if unable to parse.
     */
    @JsonCreator
    public static DatabaseState fromString(String value) {
        DatabaseState[] items = DatabaseState.values();
        for (DatabaseState item : items) {
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
