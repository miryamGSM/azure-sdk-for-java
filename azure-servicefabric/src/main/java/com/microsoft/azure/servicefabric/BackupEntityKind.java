/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BackupEntityKind.
 */
public final class BackupEntityKind extends ExpandableStringEnum<BackupEntityKind> {
    /** Static value Invalid for BackupEntityKind. */
    public static final BackupEntityKind INVALID = fromString("Invalid");

    /** Static value Partition for BackupEntityKind. */
    public static final BackupEntityKind PARTITION = fromString("Partition");

    /** Static value Service for BackupEntityKind. */
    public static final BackupEntityKind SERVICE = fromString("Service");

    /** Static value Application for BackupEntityKind. */
    public static final BackupEntityKind APPLICATION = fromString("Application");

    /**
     * Creates or finds a BackupEntityKind from its string representation.
     * @param name a name to look for
     * @return the corresponding BackupEntityKind
     */
    @JsonCreator
    public static BackupEntityKind fromString(String name) {
        return fromString(name, BackupEntityKind.class);
    }

    /**
     * @return known BackupEntityKind values
     */
    public static Collection<BackupEntityKind> values() {
        return values(BackupEntityKind.class);
    }
}