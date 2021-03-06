/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The quota usage for a container registry.
 */
public class RegistryUsage {
    /**
     * The name of the usage.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The limit of the usage.
     */
    @JsonProperty(value = "limit")
    private Long limit;

    /**
     * The current value of the usage.
     */
    @JsonProperty(value = "currentValue")
    private Long currentValue;

    /**
     * The unit of measurement. Possible values include: 'Count', 'Bytes'.
     */
    @JsonProperty(value = "unit")
    private RegistryUsageUnit unit;

    /**
     * Get the name of the usage.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the usage.
     *
     * @param name the name value to set
     * @return the RegistryUsage object itself.
     */
    public RegistryUsage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the limit of the usage.
     *
     * @return the limit value
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Set the limit of the usage.
     *
     * @param limit the limit value to set
     * @return the RegistryUsage object itself.
     */
    public RegistryUsage withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the current value of the usage.
     *
     * @return the currentValue value
     */
    public Long currentValue() {
        return this.currentValue;
    }

    /**
     * Set the current value of the usage.
     *
     * @param currentValue the currentValue value to set
     * @return the RegistryUsage object itself.
     */
    public RegistryUsage withCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the unit of measurement. Possible values include: 'Count', 'Bytes'.
     *
     * @return the unit value
     */
    public RegistryUsageUnit unit() {
        return this.unit;
    }

    /**
     * Set the unit of measurement. Possible values include: 'Count', 'Bytes'.
     *
     * @param unit the unit value to set
     * @return the RegistryUsage object itself.
     */
    public RegistryUsage withUnit(RegistryUsageUnit unit) {
        this.unit = unit;
        return this;
    }

}
