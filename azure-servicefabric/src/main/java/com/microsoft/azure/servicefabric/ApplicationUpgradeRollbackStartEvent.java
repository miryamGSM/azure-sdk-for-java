/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.servicefabric.implementation.ApplicationEventInner;

/**
 * Application Upgrade Rollback Start event.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ApplicationUpgradeRollbackStart")
public class ApplicationUpgradeRollbackStartEvent extends ApplicationEventInner {
    /**
     * Application type name.
     */
    @JsonProperty(value = "ApplicationTypeName", required = true)
    private String applicationTypeName;

    /**
     * Current Application type version.
     */
    @JsonProperty(value = "CurrentApplicationTypeVersion", required = true)
    private String currentApplicationTypeVersion;

    /**
     * Target Application type version.
     */
    @JsonProperty(value = "ApplicationTypeVersion", required = true)
    private String applicationTypeVersion;

    /**
     * Describes reason of failure.
     */
    @JsonProperty(value = "FailureReason", required = true)
    private String failureReason;

    /**
     * Overall upgrade time in milli-seconds.
     */
    @JsonProperty(value = "OverallUpgradeElapsedTimeInMs", required = true)
    private double overallUpgradeElapsedTimeInMs;

    /**
     * Get application type name.
     *
     * @return the applicationTypeName value
     */
    public String applicationTypeName() {
        return this.applicationTypeName;
    }

    /**
     * Set application type name.
     *
     * @param applicationTypeName the applicationTypeName value to set
     * @return the ApplicationUpgradeRollbackStartEvent object itself.
     */
    public ApplicationUpgradeRollbackStartEvent withApplicationTypeName(String applicationTypeName) {
        this.applicationTypeName = applicationTypeName;
        return this;
    }

    /**
     * Get current Application type version.
     *
     * @return the currentApplicationTypeVersion value
     */
    public String currentApplicationTypeVersion() {
        return this.currentApplicationTypeVersion;
    }

    /**
     * Set current Application type version.
     *
     * @param currentApplicationTypeVersion the currentApplicationTypeVersion value to set
     * @return the ApplicationUpgradeRollbackStartEvent object itself.
     */
    public ApplicationUpgradeRollbackStartEvent withCurrentApplicationTypeVersion(String currentApplicationTypeVersion) {
        this.currentApplicationTypeVersion = currentApplicationTypeVersion;
        return this;
    }

    /**
     * Get target Application type version.
     *
     * @return the applicationTypeVersion value
     */
    public String applicationTypeVersion() {
        return this.applicationTypeVersion;
    }

    /**
     * Set target Application type version.
     *
     * @param applicationTypeVersion the applicationTypeVersion value to set
     * @return the ApplicationUpgradeRollbackStartEvent object itself.
     */
    public ApplicationUpgradeRollbackStartEvent withApplicationTypeVersion(String applicationTypeVersion) {
        this.applicationTypeVersion = applicationTypeVersion;
        return this;
    }

    /**
     * Get describes reason of failure.
     *
     * @return the failureReason value
     */
    public String failureReason() {
        return this.failureReason;
    }

    /**
     * Set describes reason of failure.
     *
     * @param failureReason the failureReason value to set
     * @return the ApplicationUpgradeRollbackStartEvent object itself.
     */
    public ApplicationUpgradeRollbackStartEvent withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * Get overall upgrade time in milli-seconds.
     *
     * @return the overallUpgradeElapsedTimeInMs value
     */
    public double overallUpgradeElapsedTimeInMs() {
        return this.overallUpgradeElapsedTimeInMs;
    }

    /**
     * Set overall upgrade time in milli-seconds.
     *
     * @param overallUpgradeElapsedTimeInMs the overallUpgradeElapsedTimeInMs value to set
     * @return the ApplicationUpgradeRollbackStartEvent object itself.
     */
    public ApplicationUpgradeRollbackStartEvent withOverallUpgradeElapsedTimeInMs(double overallUpgradeElapsedTimeInMs) {
        this.overallUpgradeElapsedTimeInMs = overallUpgradeElapsedTimeInMs;
        return this;
    }

}