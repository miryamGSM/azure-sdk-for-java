/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import java.util.List;
import com.microsoft.azure.servicefabric.DeployedServicePackageHealthState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.servicefabric.EntityHealth;

/**
 * Information about the health of an application deployed on a Service Fabric
 * node.
 */
public class DeployedApplicationHealthInner extends EntityHealth {
    /**
     * Name of the application deployed on the node whose health information is
     * described by this object.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * Name of the node where this application is deployed.
     */
    @JsonProperty(value = "NodeName")
    private String nodeName;

    /**
     * Deployed service package health states for the current deployed
     * application as found in the health store.
     */
    @JsonProperty(value = "DeployedServicePackageHealthStates")
    private List<DeployedServicePackageHealthState> deployedServicePackageHealthStates;

    /**
     * Get name of the application deployed on the node whose health information is described by this object.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the application deployed on the node whose health information is described by this object.
     *
     * @param name the name value to set
     * @return the DeployedApplicationHealthInner object itself.
     */
    public DeployedApplicationHealthInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name of the node where this application is deployed.
     *
     * @return the nodeName value
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Set name of the node where this application is deployed.
     *
     * @param nodeName the nodeName value to set
     * @return the DeployedApplicationHealthInner object itself.
     */
    public DeployedApplicationHealthInner withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get deployed service package health states for the current deployed application as found in the health store.
     *
     * @return the deployedServicePackageHealthStates value
     */
    public List<DeployedServicePackageHealthState> deployedServicePackageHealthStates() {
        return this.deployedServicePackageHealthStates;
    }

    /**
     * Set deployed service package health states for the current deployed application as found in the health store.
     *
     * @param deployedServicePackageHealthStates the deployedServicePackageHealthStates value to set
     * @return the DeployedApplicationHealthInner object itself.
     */
    public DeployedApplicationHealthInner withDeployedServicePackageHealthStates(List<DeployedServicePackageHealthState> deployedServicePackageHealthStates) {
        this.deployedServicePackageHealthStates = deployedServicePackageHealthStates;
        return this;
    }

}