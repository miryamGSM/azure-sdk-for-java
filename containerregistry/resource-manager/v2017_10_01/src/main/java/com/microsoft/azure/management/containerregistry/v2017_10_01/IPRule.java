/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IP rule with specific IP or IP range in CIDR format.
 */
public class IPRule {
    /**
     * The action of IP ACL rule. Possible values include: 'Allow'.
     */
    @JsonProperty(value = "action")
    private Action action;

    /**
     * Specifies the IP or IP range in CIDR format. Only IPV4 address is
     * allowed.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the action of IP ACL rule. Possible values include: 'Allow'.
     *
     * @return the action value
     */
    public Action action() {
        return this.action;
    }

    /**
     * Set the action of IP ACL rule. Possible values include: 'Allow'.
     *
     * @param action the action value to set
     * @return the IPRule object itself.
     */
    public IPRule withAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     * Get specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     *
     * @param value the value value to set
     * @return the IPRule object itself.
     */
    public IPRule withValue(String value) {
        this.value = value;
        return this;
    }

}
