/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Job relationship information properties including pipeline information,
 * correlation information, etc.
 */
public class JobRelationshipProperties {
    /**
     * the job relationship pipeline identifier (a GUID).
     */
    @JsonProperty(value = "pipelineId")
    private UUID pipelineId;

    /**
     * the friendly name of the job relationship pipeline, which does not need
     * to be unique.
     */
    @JsonProperty(value = "pipelineName")
    private String pipelineName;

    /**
     * the pipeline uri, unique, links to the originating service for this
     * pipeline.
     */
    @JsonProperty(value = "pipelineUri")
    private String pipelineUri;

    /**
     * the run identifier (a GUID), unique identifier of the iteration of this
     * pipeline.
     */
    @JsonProperty(value = "runId")
    private UUID runId;

    /**
     * the recurrence identifier (a GUID), unique per activity/script,
     * regardless of iterations. This is something to link different
     * occurrences of the same job together.
     */
    @JsonProperty(value = "recurrenceId", required = true)
    private UUID recurrenceId;

    /**
     * the recurrence name, user friendly name for the correlation between
     * jobs.
     */
    @JsonProperty(value = "recurrenceName")
    private String recurrenceName;

    /**
     * Get the pipelineId value.
     *
     * @return the pipelineId value
     */
    public UUID pipelineId() {
        return this.pipelineId;
    }

    /**
     * Set the pipelineId value.
     *
     * @param pipelineId the pipelineId value to set
     * @return the JobRelationshipProperties object itself.
     */
    public JobRelationshipProperties withPipelineId(UUID pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * Get the pipelineName value.
     *
     * @return the pipelineName value
     */
    public String pipelineName() {
        return this.pipelineName;
    }

    /**
     * Set the pipelineName value.
     *
     * @param pipelineName the pipelineName value to set
     * @return the JobRelationshipProperties object itself.
     */
    public JobRelationshipProperties withPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }

    /**
     * Get the pipelineUri value.
     *
     * @return the pipelineUri value
     */
    public String pipelineUri() {
        return this.pipelineUri;
    }

    /**
     * Set the pipelineUri value.
     *
     * @param pipelineUri the pipelineUri value to set
     * @return the JobRelationshipProperties object itself.
     */
    public JobRelationshipProperties withPipelineUri(String pipelineUri) {
        this.pipelineUri = pipelineUri;
        return this;
    }

    /**
     * Get the runId value.
     *
     * @return the runId value
     */
    public UUID runId() {
        return this.runId;
    }

    /**
     * Set the runId value.
     *
     * @param runId the runId value to set
     * @return the JobRelationshipProperties object itself.
     */
    public JobRelationshipProperties withRunId(UUID runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get the recurrenceId value.
     *
     * @return the recurrenceId value
     */
    public UUID recurrenceId() {
        return this.recurrenceId;
    }

    /**
     * Set the recurrenceId value.
     *
     * @param recurrenceId the recurrenceId value to set
     * @return the JobRelationshipProperties object itself.
     */
    public JobRelationshipProperties withRecurrenceId(UUID recurrenceId) {
        this.recurrenceId = recurrenceId;
        return this;
    }

    /**
     * Get the recurrenceName value.
     *
     * @return the recurrenceName value
     */
    public String recurrenceName() {
        return this.recurrenceName;
    }

    /**
     * Set the recurrenceName value.
     *
     * @param recurrenceName the recurrenceName value to set
     * @return the JobRelationshipProperties object itself.
     */
    public JobRelationshipProperties withRecurrenceName(String recurrenceName) {
        this.recurrenceName = recurrenceName;
        return this;
    }

}
