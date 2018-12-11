/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2014_04;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.sql.v3_2014_04.implementation.DatabaseThreatDetectionPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DatabaseThreatDetectionPolicies.
 */
public interface DatabaseThreatDetectionPolicies extends SupportsCreating<DatabaseSecurityAlertPolicy.DefinitionStages.Blank>, HasInner<DatabaseThreatDetectionPoliciesInner> {
    /**
     * Gets a database's threat detection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which database Threat Detection policy is defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DatabaseSecurityAlertPolicy> getAsync(String resourceGroupName, String serverName, String databaseName);

}
