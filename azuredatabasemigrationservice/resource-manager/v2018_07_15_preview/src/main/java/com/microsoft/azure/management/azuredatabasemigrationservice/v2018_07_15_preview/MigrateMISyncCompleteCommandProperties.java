/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.CommandPropertiesInner;

/**
 * Properties for the command that completes online migration for an Azure SQL
 * Database Managed Instance.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "commandType")
@JsonTypeName("Migrate.SqlServer.AzureDbSqlMi.Complete")
public class MigrateMISyncCompleteCommandProperties extends CommandPropertiesInner {
    /**
     * Command input.
     */
    @JsonProperty(value = "input")
    private MigrateMISyncCompleteCommandInput input;

    /**
     * Command output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private MigrateMISyncCompleteCommandOutput output;

    /**
     * Get command input.
     *
     * @return the input value
     */
    public MigrateMISyncCompleteCommandInput input() {
        return this.input;
    }

    /**
     * Set command input.
     *
     * @param input the input value to set
     * @return the MigrateMISyncCompleteCommandProperties object itself.
     */
    public MigrateMISyncCompleteCommandProperties withInput(MigrateMISyncCompleteCommandInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get command output. This is ignored if submitted.
     *
     * @return the output value
     */
    public MigrateMISyncCompleteCommandOutput output() {
        return this.output;
    }

}
