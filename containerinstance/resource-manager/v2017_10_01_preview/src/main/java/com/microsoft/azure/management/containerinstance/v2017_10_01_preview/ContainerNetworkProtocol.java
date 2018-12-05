/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2017_10_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ContainerNetworkProtocol.
 */
public final class ContainerNetworkProtocol extends ExpandableStringEnum<ContainerNetworkProtocol> {
    /** Static value TCP for ContainerNetworkProtocol. */
    public static final ContainerNetworkProtocol TCP = fromString("TCP");

    /** Static value UDP for ContainerNetworkProtocol. */
    public static final ContainerNetworkProtocol UDP = fromString("UDP");

    /**
     * Creates or finds a ContainerNetworkProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding ContainerNetworkProtocol
     */
    @JsonCreator
    public static ContainerNetworkProtocol fromString(String name) {
        return fromString(name, ContainerNetworkProtocol.class);
    }

    /**
     * @return known ContainerNetworkProtocol values
     */
    public static Collection<ContainerNetworkProtocol> values() {
        return values(ContainerNetworkProtocol.class);
    }
}
