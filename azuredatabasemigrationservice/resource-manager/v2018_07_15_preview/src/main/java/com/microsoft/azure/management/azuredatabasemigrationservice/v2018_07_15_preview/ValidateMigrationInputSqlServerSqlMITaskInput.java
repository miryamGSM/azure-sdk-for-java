/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for task that validates migration input for SQL to Azure SQL Managed
 * Instance.
 */
public class ValidateMigrationInputSqlServerSqlMITaskInput {
    /**
     * Information for connecting to source.
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private SqlConnectionInfo sourceConnectionInfo;

    /**
     * Information for connecting to target.
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private SqlConnectionInfo targetConnectionInfo;

    /**
     * Databases to migrate.
     */
    @JsonProperty(value = "selectedDatabases", required = true)
    private List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases;

    /**
     * Logins to migrate.
     */
    @JsonProperty(value = "selectedLogins")
    private List<String> selectedLogins;

    /**
     * Backup file share information for all selected databases.
     */
    @JsonProperty(value = "backupFileShare")
    private FileShare backupFileShare;

    /**
     * SAS URI of Azure Storage Account Container to be used for storing backup
     * files.
     */
    @JsonProperty(value = "backupBlobShare", required = true)
    private BlobShare backupBlobShare;

    /**
     * Backup Mode to specify whether to use existing backup or create new
     * backup. Possible values include: 'CreateBackup', 'ExistingBackup'.
     */
    @JsonProperty(value = "backupMode")
    private BackupMode backupMode;

    /**
     * Get information for connecting to source.
     *
     * @return the sourceConnectionInfo value
     */
    public SqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set information for connecting to source.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set
     * @return the ValidateMigrationInputSqlServerSqlMITaskInput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput withSourceConnectionInfo(SqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Get information for connecting to target.
     *
     * @return the targetConnectionInfo value
     */
    public SqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set information for connecting to target.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set
     * @return the ValidateMigrationInputSqlServerSqlMITaskInput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput withTargetConnectionInfo(SqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Get databases to migrate.
     *
     * @return the selectedDatabases value
     */
    public List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Set databases to migrate.
     *
     * @param selectedDatabases the selectedDatabases value to set
     * @return the ValidateMigrationInputSqlServerSqlMITaskInput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput withSelectedDatabases(List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases) {
        this.selectedDatabases = selectedDatabases;
        return this;
    }

    /**
     * Get logins to migrate.
     *
     * @return the selectedLogins value
     */
    public List<String> selectedLogins() {
        return this.selectedLogins;
    }

    /**
     * Set logins to migrate.
     *
     * @param selectedLogins the selectedLogins value to set
     * @return the ValidateMigrationInputSqlServerSqlMITaskInput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput withSelectedLogins(List<String> selectedLogins) {
        this.selectedLogins = selectedLogins;
        return this;
    }

    /**
     * Get backup file share information for all selected databases.
     *
     * @return the backupFileShare value
     */
    public FileShare backupFileShare() {
        return this.backupFileShare;
    }

    /**
     * Set backup file share information for all selected databases.
     *
     * @param backupFileShare the backupFileShare value to set
     * @return the ValidateMigrationInputSqlServerSqlMITaskInput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput withBackupFileShare(FileShare backupFileShare) {
        this.backupFileShare = backupFileShare;
        return this;
    }

    /**
     * Get sAS URI of Azure Storage Account Container to be used for storing backup files.
     *
     * @return the backupBlobShare value
     */
    public BlobShare backupBlobShare() {
        return this.backupBlobShare;
    }

    /**
     * Set sAS URI of Azure Storage Account Container to be used for storing backup files.
     *
     * @param backupBlobShare the backupBlobShare value to set
     * @return the ValidateMigrationInputSqlServerSqlMITaskInput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput withBackupBlobShare(BlobShare backupBlobShare) {
        this.backupBlobShare = backupBlobShare;
        return this;
    }

    /**
     * Get backup Mode to specify whether to use existing backup or create new backup. Possible values include: 'CreateBackup', 'ExistingBackup'.
     *
     * @return the backupMode value
     */
    public BackupMode backupMode() {
        return this.backupMode;
    }

    /**
     * Set backup Mode to specify whether to use existing backup or create new backup. Possible values include: 'CreateBackup', 'ExistingBackup'.
     *
     * @param backupMode the backupMode value to set
     * @return the ValidateMigrationInputSqlServerSqlMITaskInput object itself.
     */
    public ValidateMigrationInputSqlServerSqlMITaskInput withBackupMode(BackupMode backupMode) {
        this.backupMode = backupMode;
        return this;
    }

}
