/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A list of services that support encryption.
 */
public class EncryptionServices {
    /**
     * The encryption function of the blob storage service.
     */
    @JsonProperty(value = "blob")
    private EncryptionService blob;

    /**
     * The encryption function of the file storage service.
     */
    @JsonProperty(value = "file")
    private EncryptionService file;

    /**
     * The encryption function of the table storage service.
     */
    @JsonProperty(value = "table", access = JsonProperty.Access.WRITE_ONLY)
    private EncryptionService table;

    /**
     * The encryption function of the queue storage service.
     */
    @JsonProperty(value = "queue", access = JsonProperty.Access.WRITE_ONLY)
    private EncryptionService queue;

    /**
     * Get the encryption function of the blob storage service.
     *
     * @return the blob value
     */
    public EncryptionService blob() {
        return this.blob;
    }

    /**
     * Set the encryption function of the blob storage service.
     *
     * @param blob the blob value to set
     * @return the EncryptionServices object itself.
     */
    public EncryptionServices withBlob(EncryptionService blob) {
        this.blob = blob;
        return this;
    }

    /**
     * Get the encryption function of the file storage service.
     *
     * @return the file value
     */
    public EncryptionService file() {
        return this.file;
    }

    /**
     * Set the encryption function of the file storage service.
     *
     * @param file the file value to set
     * @return the EncryptionServices object itself.
     */
    public EncryptionServices withFile(EncryptionService file) {
        this.file = file;
        return this;
    }

    /**
     * Get the encryption function of the table storage service.
     *
     * @return the table value
     */
    public EncryptionService table() {
        return this.table;
    }

    /**
     * Get the encryption function of the queue storage service.
     *
     * @return the queue value
     */
    public EncryptionService queue() {
        return this.queue;
    }

}
