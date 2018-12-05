/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2018_09_01_preview;

import rx.Observable;

/**
 * Type representing DenyAssignments.
 */
public interface DenyAssignments {
    /**
     * Gets deny assignments for a resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param parentResourcePath The parent resource identity.
     * @param resourceType The resource type of the resource.
     * @param resourceName The name of the resource to get deny assignments for.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DenyAssignment> listForResourceAsync(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName);

    /**
     * Get the specified deny assignment.
     *
     * @param scope The scope of the deny assignment.
     * @param denyAssignmentId The ID of the deny assignment to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DenyAssignment> getAsync(String scope, String denyAssignmentId);

    /**
     * Gets a deny assignment by ID.
     *
     * @param denyAssignmentId The fully qualified deny assignment ID. For example, use the format, /subscriptions/{guid}/providers/Microsoft.Authorization/denyAssignments/{denyAssignmentId} for subscription level deny assignments, or /providers/Microsoft.Authorization/denyAssignments/{denyAssignmentId} for tenant level deny assignments.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DenyAssignment> getByIdAsync(String denyAssignmentId);

    /**
     * Gets deny assignments for a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DenyAssignment> listByResourceGroupAsync(final String resourceGroupName);

    /**
     * Gets all deny assignments for the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DenyAssignment> listAsync();

    /**
     * Gets deny assignments for a scope.
     *
     * @param scope The scope of the deny assignments.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DenyAssignment> listForScopeAsync(final String scope);

}
