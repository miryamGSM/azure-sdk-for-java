/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DirectoryObject list operation result.
 */
public class DirectoryObjectListResultInner {
    /**
     * A collection of DirectoryObject.
     */
    @JsonProperty(value = "value")
    private List<DirectoryObjectInner> value;

    /**
     * Get a collection of DirectoryObject.
     *
     * @return the value value
     */
    public List<DirectoryObjectInner> value() {
        return this.value;
    }

    /**
     * Set a collection of DirectoryObject.
     *
     * @param value the value value to set
     * @return the DirectoryObjectListResultInner object itself.
     */
    public DirectoryObjectListResultInner withValue(List<DirectoryObjectInner> value) {
        this.value = value;
        return this;
    }

}