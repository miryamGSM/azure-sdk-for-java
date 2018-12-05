/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2017_12_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The port exposed on the container group.
 */
public class Port {
    /**
     * The protocol associated with the port. Possible values include: 'TCP',
     * 'UDP'.
     */
    @JsonProperty(value = "protocol")
    private ContainerGroupNetworkProtocol protocol;

    /**
     * The port number.
     */
    @JsonProperty(value = "port", required = true)
    private int port;

    /**
     * Get the protocol associated with the port. Possible values include: 'TCP', 'UDP'.
     *
     * @return the protocol value
     */
    public ContainerGroupNetworkProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol associated with the port. Possible values include: 'TCP', 'UDP'.
     *
     * @param protocol the protocol value to set
     * @return the Port object itself.
     */
    public Port withProtocol(ContainerGroupNetworkProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the port number.
     *
     * @return the port value
     */
    public int port() {
        return this.port;
    }

    /**
     * Set the port number.
     *
     * @param port the port value to set
     * @return the Port object itself.
     */
    public Port withPort(int port) {
        this.port = port;
        return this;
    }

}
