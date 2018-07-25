/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents data structure that contains load information for a certain
 * metric on a node.
 */
public class NodeLoadMetricInformation {
    /**
     * Name of the metric for which this load information is provided.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * Total capacity on the node for this metric.
     */
    @JsonProperty(value = "NodeCapacity")
    private String nodeCapacity;

    /**
     * Current load on the node for this metric.
     */
    @JsonProperty(value = "NodeLoad")
    private String nodeLoad;

    /**
     * The remaining capacity on the node for this metric.
     */
    @JsonProperty(value = "NodeRemainingCapacity")
    private String nodeRemainingCapacity;

    /**
     * Indicates if there is a capacity violation for this metric on the node.
     */
    @JsonProperty(value = "IsCapacityViolation")
    private Boolean isCapacityViolation;

    /**
     * The value that indicates the reserved capacity for this metric on the
     * node.
     */
    @JsonProperty(value = "NodeBufferedCapacity")
    private String nodeBufferedCapacity;

    /**
     * The remaining reserved capacity for this metric on the node.
     */
    @JsonProperty(value = "NodeRemainingBufferedCapacity")
    private String nodeRemainingBufferedCapacity;

    /**
     * Get name of the metric for which this load information is provided.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the metric for which this load information is provided.
     *
     * @param name the name value to set
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get total capacity on the node for this metric.
     *
     * @return the nodeCapacity value
     */
    public String nodeCapacity() {
        return this.nodeCapacity;
    }

    /**
     * Set total capacity on the node for this metric.
     *
     * @param nodeCapacity the nodeCapacity value to set
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation withNodeCapacity(String nodeCapacity) {
        this.nodeCapacity = nodeCapacity;
        return this;
    }

    /**
     * Get current load on the node for this metric.
     *
     * @return the nodeLoad value
     */
    public String nodeLoad() {
        return this.nodeLoad;
    }

    /**
     * Set current load on the node for this metric.
     *
     * @param nodeLoad the nodeLoad value to set
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation withNodeLoad(String nodeLoad) {
        this.nodeLoad = nodeLoad;
        return this;
    }

    /**
     * Get the remaining capacity on the node for this metric.
     *
     * @return the nodeRemainingCapacity value
     */
    public String nodeRemainingCapacity() {
        return this.nodeRemainingCapacity;
    }

    /**
     * Set the remaining capacity on the node for this metric.
     *
     * @param nodeRemainingCapacity the nodeRemainingCapacity value to set
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation withNodeRemainingCapacity(String nodeRemainingCapacity) {
        this.nodeRemainingCapacity = nodeRemainingCapacity;
        return this;
    }

    /**
     * Get indicates if there is a capacity violation for this metric on the node.
     *
     * @return the isCapacityViolation value
     */
    public Boolean isCapacityViolation() {
        return this.isCapacityViolation;
    }

    /**
     * Set indicates if there is a capacity violation for this metric on the node.
     *
     * @param isCapacityViolation the isCapacityViolation value to set
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation withIsCapacityViolation(Boolean isCapacityViolation) {
        this.isCapacityViolation = isCapacityViolation;
        return this;
    }

    /**
     * Get the value that indicates the reserved capacity for this metric on the node.
     *
     * @return the nodeBufferedCapacity value
     */
    public String nodeBufferedCapacity() {
        return this.nodeBufferedCapacity;
    }

    /**
     * Set the value that indicates the reserved capacity for this metric on the node.
     *
     * @param nodeBufferedCapacity the nodeBufferedCapacity value to set
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation withNodeBufferedCapacity(String nodeBufferedCapacity) {
        this.nodeBufferedCapacity = nodeBufferedCapacity;
        return this;
    }

    /**
     * Get the remaining reserved capacity for this metric on the node.
     *
     * @return the nodeRemainingBufferedCapacity value
     */
    public String nodeRemainingBufferedCapacity() {
        return this.nodeRemainingBufferedCapacity;
    }

    /**
     * Set the remaining reserved capacity for this metric on the node.
     *
     * @param nodeRemainingBufferedCapacity the nodeRemainingBufferedCapacity value to set
     * @return the NodeLoadMetricInformation object itself.
     */
    public NodeLoadMetricInformation withNodeRemainingBufferedCapacity(String nodeRemainingBufferedCapacity) {
        this.nodeRemainingBufferedCapacity = nodeRemainingBufferedCapacity;
        return this;
    }

}