/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2017_03;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.sql.v3_2017_03.implementation.ExtendedServerBlobAuditingPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ExtendedServerBlobAuditingPolicies.
 */
public interface ExtendedServerBlobAuditingPolicies extends SupportsCreating<ExtendedServerBlobAuditingPolicy.DefinitionStages.Blank>, HasInner<ExtendedServerBlobAuditingPoliciesInner> {
    /**
     * Gets an extended server's blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExtendedServerBlobAuditingPolicy> getAsync(String resourceGroupName, String serverName);

}
