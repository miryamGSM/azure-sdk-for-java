/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Task level output for the task that validates connection to SQL Server and
 * also validates source server requirements.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("TaskLevelOutput")
public class ConnectToSourceSqlServerTaskOutputTaskLevel extends ConnectToSourceSqlServerTaskOutput {
    /**
     * Source databases as a map from database name to database id.
     */
    @JsonProperty(value = "databases", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> databases;

    /**
     * Source server version.
     */
    @JsonProperty(value = "sourceServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerVersion;

    /**
     * Source server brand version.
     */
    @JsonProperty(value = "sourceServerBrandVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerBrandVersion;

    /**
     * Validation errors.
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /**
     * Get source databases as a map from database name to database id.
     *
     * @return the databases value
     */
    public Map<String, String> databases() {
        return this.databases;
    }

    /**
     * Get source server version.
     *
     * @return the sourceServerVersion value
     */
    public String sourceServerVersion() {
        return this.sourceServerVersion;
    }

    /**
     * Get source server brand version.
     *
     * @return the sourceServerBrandVersion value
     */
    public String sourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }

    /**
     * Get validation errors.
     *
     * @return the validationErrors value
     */
    public List<ReportableException> validationErrors() {
        return this.validationErrors;
    }

}
