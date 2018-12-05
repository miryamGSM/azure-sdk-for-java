/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview.implementation;

import java.util.UUID;
import org.joda.time.DateTime;
import com.microsoft.azure.management.mediaservices.v2018_03_30_preview.AssetStorageEncryptionFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An Asset.
 */
@JsonFlatten
public class AssetInner extends ProxyResource {
    /**
     * The Asset ID.
     */
    @JsonProperty(value = "properties.assetId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID assetId;

    /**
     * The creation date of the Asset.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * The last modified date of the Asset.
     */
    @JsonProperty(value = "properties.lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModified;

    /**
     * The alternate ID of the Asset.
     */
    @JsonProperty(value = "properties.alternateId")
    private String alternateId;

    /**
     * The Asset description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The name of the asset blob container.
     */
    @JsonProperty(value = "properties.container")
    private String container;

    /**
     * The name of the storage account.
     */
    @JsonProperty(value = "properties.storageAccountName")
    private String storageAccountName;

    /**
     * The Asset encryption format. One of None or MediaStorageEncryption.
     * Possible values include: 'None', 'MediaStorageClientEncryption'.
     */
    @JsonProperty(value = "properties.storageEncryptionFormat", access = JsonProperty.Access.WRITE_ONLY)
    private AssetStorageEncryptionFormat storageEncryptionFormat;

    /**
     * Get the Asset ID.
     *
     * @return the assetId value
     */
    public UUID assetId() {
        return this.assetId;
    }

    /**
     * Get the creation date of the Asset.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get the last modified date of the Asset.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get the alternate ID of the Asset.
     *
     * @return the alternateId value
     */
    public String alternateId() {
        return this.alternateId;
    }

    /**
     * Set the alternate ID of the Asset.
     *
     * @param alternateId the alternateId value to set
     * @return the AssetInner object itself.
     */
    public AssetInner withAlternateId(String alternateId) {
        this.alternateId = alternateId;
        return this;
    }

    /**
     * Get the Asset description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the Asset description.
     *
     * @param description the description value to set
     * @return the AssetInner object itself.
     */
    public AssetInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the name of the asset blob container.
     *
     * @return the container value
     */
    public String container() {
        return this.container;
    }

    /**
     * Set the name of the asset blob container.
     *
     * @param container the container value to set
     * @return the AssetInner object itself.
     */
    public AssetInner withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * Get the name of the storage account.
     *
     * @return the storageAccountName value
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Set the name of the storage account.
     *
     * @param storageAccountName the storageAccountName value to set
     * @return the AssetInner object itself.
     */
    public AssetInner withStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
        return this;
    }

    /**
     * Get the Asset encryption format. One of None or MediaStorageEncryption. Possible values include: 'None', 'MediaStorageClientEncryption'.
     *
     * @return the storageEncryptionFormat value
     */
    public AssetStorageEncryptionFormat storageEncryptionFormat() {
        return this.storageEncryptionFormat;
    }

}
