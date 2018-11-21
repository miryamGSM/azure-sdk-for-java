/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15.implementation;

import java.util.List;
import com.microsoft.azure.management.devtestlab.v2018_09_15.Subnet;
import com.microsoft.azure.management.devtestlab.v2018_09_15.ExternalSubnet;
import com.microsoft.azure.management.devtestlab.v2018_09_15.SubnetOverride;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A virtual network.
 */
@JsonFlatten
@SkipParentValidation
public class VirtualNetworkInner extends Resource {
    /**
     * The allowed subnets of the virtual network.
     */
    @JsonProperty(value = "properties.allowedSubnets")
    private List<Subnet> allowedSubnets;

    /**
     * The description of the virtual network.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The Microsoft.Network resource identifier of the virtual network.
     */
    @JsonProperty(value = "properties.externalProviderResourceId")
    private String externalProviderResourceId;

    /**
     * The external subnet properties.
     */
    @JsonProperty(value = "properties.externalSubnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExternalSubnet> externalSubnets;

    /**
     * The subnet overrides of the virtual network.
     */
    @JsonProperty(value = "properties.subnetOverrides")
    private List<SubnetOverride> subnetOverrides;

    /**
     * The creation date of the virtual network.
     */
    @JsonProperty(value = "properties.createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdDate;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueIdentifier;

    /**
     * Get the allowed subnets of the virtual network.
     *
     * @return the allowedSubnets value
     */
    public List<Subnet> allowedSubnets() {
        return this.allowedSubnets;
    }

    /**
     * Set the allowed subnets of the virtual network.
     *
     * @param allowedSubnets the allowedSubnets value to set
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withAllowedSubnets(List<Subnet> allowedSubnets) {
        this.allowedSubnets = allowedSubnets;
        return this;
    }

    /**
     * Get the description of the virtual network.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the virtual network.
     *
     * @param description the description value to set
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the Microsoft.Network resource identifier of the virtual network.
     *
     * @return the externalProviderResourceId value
     */
    public String externalProviderResourceId() {
        return this.externalProviderResourceId;
    }

    /**
     * Set the Microsoft.Network resource identifier of the virtual network.
     *
     * @param externalProviderResourceId the externalProviderResourceId value to set
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withExternalProviderResourceId(String externalProviderResourceId) {
        this.externalProviderResourceId = externalProviderResourceId;
        return this;
    }

    /**
     * Get the external subnet properties.
     *
     * @return the externalSubnets value
     */
    public List<ExternalSubnet> externalSubnets() {
        return this.externalSubnets;
    }

    /**
     * Get the subnet overrides of the virtual network.
     *
     * @return the subnetOverrides value
     */
    public List<SubnetOverride> subnetOverrides() {
        return this.subnetOverrides;
    }

    /**
     * Set the subnet overrides of the virtual network.
     *
     * @param subnetOverrides the subnetOverrides value to set
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withSubnetOverrides(List<SubnetOverride> subnetOverrides) {
        this.subnetOverrides = subnetOverrides;
        return this;
    }

    /**
     * Get the creation date of the virtual network.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the provisioning status of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

}
