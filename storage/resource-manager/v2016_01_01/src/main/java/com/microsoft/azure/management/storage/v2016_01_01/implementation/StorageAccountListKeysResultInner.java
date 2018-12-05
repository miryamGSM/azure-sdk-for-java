/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2016_01_01.implementation;

import java.util.List;
import com.microsoft.azure.management.storage.v2016_01_01.StorageAccountKey;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response from the ListKeys operation.
 */
public class StorageAccountListKeysResultInner {
    /**
     * Gets the list of storage account keys and their properties for the
     * specified storage account.
     */
    @JsonProperty(value = "keys", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageAccountKey> keys;

    /**
     * Get gets the list of storage account keys and their properties for the specified storage account.
     *
     * @return the keys value
     */
    public List<StorageAccountKey> keys() {
        return this.keys;
    }

}
