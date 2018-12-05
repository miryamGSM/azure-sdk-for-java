/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description about the errors happen while performing migration validation.
 */
public class SchemaComparisonValidationResultType {
    /**
     * Name of the object that has the difference.
     */
    @JsonProperty(value = "objectName")
    private String objectName;

    /**
     * Type of the object that has the difference. e.g
     * (Table/View/StoredProcedure). Possible values include:
     * 'StoredProcedures', 'Table', 'User', 'View', 'Function'.
     */
    @JsonProperty(value = "objectType")
    private ObjectType objectType;

    /**
     * Update action type with respect to target. Possible values include:
     * 'DeletedOnTarget', 'ChangedOnTarget', 'AddedOnTarget'.
     */
    @JsonProperty(value = "updateAction")
    private UpdateActionType updateAction;

    /**
     * Get name of the object that has the difference.
     *
     * @return the objectName value
     */
    public String objectName() {
        return this.objectName;
    }

    /**
     * Set name of the object that has the difference.
     *
     * @param objectName the objectName value to set
     * @return the SchemaComparisonValidationResultType object itself.
     */
    public SchemaComparisonValidationResultType withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    /**
     * Get type of the object that has the difference. e.g (Table/View/StoredProcedure). Possible values include: 'StoredProcedures', 'Table', 'User', 'View', 'Function'.
     *
     * @return the objectType value
     */
    public ObjectType objectType() {
        return this.objectType;
    }

    /**
     * Set type of the object that has the difference. e.g (Table/View/StoredProcedure). Possible values include: 'StoredProcedures', 'Table', 'User', 'View', 'Function'.
     *
     * @param objectType the objectType value to set
     * @return the SchemaComparisonValidationResultType object itself.
     */
    public SchemaComparisonValidationResultType withObjectType(ObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get update action type with respect to target. Possible values include: 'DeletedOnTarget', 'ChangedOnTarget', 'AddedOnTarget'.
     *
     * @return the updateAction value
     */
    public UpdateActionType updateAction() {
        return this.updateAction;
    }

    /**
     * Set update action type with respect to target. Possible values include: 'DeletedOnTarget', 'ChangedOnTarget', 'AddedOnTarget'.
     *
     * @param updateAction the updateAction value to set
     * @return the SchemaComparisonValidationResultType object itself.
     */
    public SchemaComparisonValidationResultType withUpdateAction(UpdateActionType updateAction) {
        this.updateAction = updateAction;
        return this;
    }

}
