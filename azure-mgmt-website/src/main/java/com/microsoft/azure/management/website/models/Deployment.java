/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

/**
 * Represents user crendentials used for publishing activity.
 */
public class Deployment extends Resource {
    /**
     * Id.
     */
    @JsonProperty(value = "properties.id")
    private String deploymentId;

    /**
     * Status.
     */
    @JsonProperty(value = "properties.status")
    private Integer status;

    /**
     * Message.
     */
    @JsonProperty(value = "properties.message")
    private String message;

    /**
     * Author.
     */
    @JsonProperty(value = "properties.author")
    private String author;

    /**
     * Deployer.
     */
    @JsonProperty(value = "properties.deployer")
    private String deployer;

    /**
     * AuthorEmail.
     */
    @JsonProperty(value = "properties.author_email")
    private String authorEmail;

    /**
     * StartTime.
     */
    @JsonProperty(value = "properties.start_time")
    private DateTime startTime;

    /**
     * EndTime.
     */
    @JsonProperty(value = "properties.end_time")
    private DateTime endTime;

    /**
     * Active.
     */
    @JsonProperty(value = "properties.active")
    private Boolean active;

    /**
     * Detail.
     */
    @JsonProperty(value = "properties.details")
    private String details;

    /**
     * Get the deploymentId value.
     *
     * @return the deploymentId value
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * Set the deploymentId value.
     *
     * @param deploymentId the deploymentId value to set
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Get the author value.
     *
     * @return the author value
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Set the author value.
     *
     * @param author the author value to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Get the deployer value.
     *
     * @return the deployer value
     */
    public String getDeployer() {
        return this.deployer;
    }

    /**
     * Set the deployer value.
     *
     * @param deployer the deployer value to set
     */
    public void setDeployer(String deployer) {
        this.deployer = deployer;
    }

    /**
     * Get the authorEmail value.
     *
     * @return the authorEmail value
     */
    public String getAuthorEmail() {
        return this.authorEmail;
    }

    /**
     * Set the authorEmail value.
     *
     * @param authorEmail the authorEmail value to set
     */
    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     */
    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     */
    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Get the active value.
     *
     * @return the active value
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Set the active value.
     *
     * @param active the active value to set
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     */
    public void setDetails(String details) {
        this.details = details;
    }

}
