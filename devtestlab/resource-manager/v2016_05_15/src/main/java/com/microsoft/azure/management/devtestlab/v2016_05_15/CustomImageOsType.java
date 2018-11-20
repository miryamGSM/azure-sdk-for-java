/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CustomImageOsType.
 */
public final class CustomImageOsType extends ExpandableStringEnum<CustomImageOsType> {
    /** Static value Windows for CustomImageOsType. */
    public static final CustomImageOsType WINDOWS = fromString("Windows");

    /** Static value Linux for CustomImageOsType. */
    public static final CustomImageOsType LINUX = fromString("Linux");

    /** Static value None for CustomImageOsType. */
    public static final CustomImageOsType NONE = fromString("None");

    /**
     * Creates or finds a CustomImageOsType from its string representation.
     * @param name a name to look for
     * @return the corresponding CustomImageOsType
     */
    @JsonCreator
    public static CustomImageOsType fromString(String name) {
        return fromString(name, CustomImageOsType.class);
    }

    /**
     * @return known CustomImageOsType values
     */
    public static Collection<CustomImageOsType> values() {
        return values(CustomImageOsType.class);
    }
}
