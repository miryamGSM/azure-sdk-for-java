/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_07_01.implementation.SubnetInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_07_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2018_07_01.implementation.NetworkSecurityGroupInner;
import com.microsoft.azure.management.network.v2018_07_01.implementation.RouteTableInner;
import com.microsoft.azure.management.network.v2018_07_01.implementation.ServiceEndpointPolicyInner;

/**
 * Type representing Subnet.
 */
public interface Subnet extends HasInner<SubnetInner>, Indexable, Refreshable<Subnet>, Updatable<Subnet.Update>, HasManager<NetworkManager> {
    /**
     * @return the addressPrefix value.
     */
    String addressPrefix();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the ipConfigurations value.
     */
    List<IPConfiguration> ipConfigurations();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the networkSecurityGroup value.
     */
    NetworkSecurityGroup networkSecurityGroup();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceNavigationLinks value.
     */
    List<ResourceNavigationLink> resourceNavigationLinks();

    /**
     * @return the routeTable value.
     */
    RouteTable routeTable();

    /**
     * @return the serviceEndpointPolicies value.
     */
    List<ServiceEndpointPolicy> serviceEndpointPolicies();

    /**
     * @return the serviceEndpoints value.
     */
    List<ServiceEndpointPropertiesFormat> serviceEndpoints();

    /**
     * The entirety of the Subnet definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVirtualNetwork, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Subnet definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Subnet definition.
         */
        interface Blank extends WithVirtualNetwork {
        }

        /**
         * The stage of the subnet definition allowing to specify VirtualNetwork.
         */
        interface WithVirtualNetwork {
           /**
            * Specifies resourceGroupName, virtualNetworkName.
            * @param resourceGroupName The name of the resource group
            * @param virtualNetworkName The name of the virtual network
            * @return the next definition stage
            */
            WithCreate withExistingVirtualNetwork(String resourceGroupName, String virtualNetworkName);
        }

        /**
         * The stage of the subnet definition allowing to specify AddressPrefix.
         */
        interface WithAddressPrefix {
            /**
             * Specifies addressPrefix.
             * @param addressPrefix The address prefix for the subnet
             * @return the next definition stage
             */
            WithCreate withAddressPrefix(String addressPrefix);
        }

        /**
         * The stage of the subnet definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag A unique read-only string that changes whenever the resource is updated
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the subnet definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the subnet definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the subnet definition allowing to specify NetworkSecurityGroup.
         */
        interface WithNetworkSecurityGroup {
            /**
             * Specifies networkSecurityGroup.
             * @param networkSecurityGroup The reference of the NetworkSecurityGroup resource
             * @return the next definition stage
             */
            WithCreate withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup);
        }

        /**
         * The stage of the subnet definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the resource
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the subnet definition allowing to specify ResourceNavigationLinks.
         */
        interface WithResourceNavigationLinks {
            /**
             * Specifies resourceNavigationLinks.
             * @param resourceNavigationLinks Gets an array of references to the external resources using subnet
             * @return the next definition stage
             */
            WithCreate withResourceNavigationLinks(List<ResourceNavigationLink> resourceNavigationLinks);
        }

        /**
         * The stage of the subnet definition allowing to specify RouteTable.
         */
        interface WithRouteTable {
            /**
             * Specifies routeTable.
             * @param routeTable The reference of the RouteTable resource
             * @return the next definition stage
             */
            WithCreate withRouteTable(RouteTableInner routeTable);
        }

        /**
         * The stage of the subnet definition allowing to specify ServiceEndpointPolicies.
         */
        interface WithServiceEndpointPolicies {
            /**
             * Specifies serviceEndpointPolicies.
             * @param serviceEndpointPolicies An array of service endpoint policies
             * @return the next definition stage
             */
            WithCreate withServiceEndpointPolicies(List<ServiceEndpointPolicyInner> serviceEndpointPolicies);
        }

        /**
         * The stage of the subnet definition allowing to specify ServiceEndpoints.
         */
        interface WithServiceEndpoints {
            /**
             * Specifies serviceEndpoints.
             * @param serviceEndpoints An array of service endpoints
             * @return the next definition stage
             */
            WithCreate withServiceEndpoints(List<ServiceEndpointPropertiesFormat> serviceEndpoints);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Subnet>, DefinitionStages.WithAddressPrefix, DefinitionStages.WithEtag, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithNetworkSecurityGroup, DefinitionStages.WithProvisioningState, DefinitionStages.WithResourceNavigationLinks, DefinitionStages.WithRouteTable, DefinitionStages.WithServiceEndpointPolicies, DefinitionStages.WithServiceEndpoints {
        }
    }
    /**
     * The template for a Subnet update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Subnet>, UpdateStages.WithAddressPrefix, UpdateStages.WithEtag, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithNetworkSecurityGroup, UpdateStages.WithProvisioningState, UpdateStages.WithResourceNavigationLinks, UpdateStages.WithRouteTable, UpdateStages.WithServiceEndpointPolicies, UpdateStages.WithServiceEndpoints {
    }

    /**
     * Grouping of Subnet update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the subnet update allowing to specify AddressPrefix.
         */
        interface WithAddressPrefix {
            /**
             * Specifies addressPrefix.
             * @param addressPrefix The address prefix for the subnet
             * @return the next update stage
             */
            Update withAddressPrefix(String addressPrefix);
        }

        /**
         * The stage of the subnet update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag A unique read-only string that changes whenever the resource is updated
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the subnet update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the subnet update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the subnet update allowing to specify NetworkSecurityGroup.
         */
        interface WithNetworkSecurityGroup {
            /**
             * Specifies networkSecurityGroup.
             * @param networkSecurityGroup The reference of the NetworkSecurityGroup resource
             * @return the next update stage
             */
            Update withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup);
        }

        /**
         * The stage of the subnet update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the resource
             * @return the next update stage
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the subnet update allowing to specify ResourceNavigationLinks.
         */
        interface WithResourceNavigationLinks {
            /**
             * Specifies resourceNavigationLinks.
             * @param resourceNavigationLinks Gets an array of references to the external resources using subnet
             * @return the next update stage
             */
            Update withResourceNavigationLinks(List<ResourceNavigationLink> resourceNavigationLinks);
        }

        /**
         * The stage of the subnet update allowing to specify RouteTable.
         */
        interface WithRouteTable {
            /**
             * Specifies routeTable.
             * @param routeTable The reference of the RouteTable resource
             * @return the next update stage
             */
            Update withRouteTable(RouteTableInner routeTable);
        }

        /**
         * The stage of the subnet update allowing to specify ServiceEndpointPolicies.
         */
        interface WithServiceEndpointPolicies {
            /**
             * Specifies serviceEndpointPolicies.
             * @param serviceEndpointPolicies An array of service endpoint policies
             * @return the next update stage
             */
            Update withServiceEndpointPolicies(List<ServiceEndpointPolicyInner> serviceEndpointPolicies);
        }

        /**
         * The stage of the subnet update allowing to specify ServiceEndpoints.
         */
        interface WithServiceEndpoints {
            /**
             * Specifies serviceEndpoints.
             * @param serviceEndpoints An array of service endpoints
             * @return the next update stage
             */
            Update withServiceEndpoints(List<ServiceEndpointPropertiesFormat> serviceEndpoints);
        }

    }
}
