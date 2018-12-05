/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ProjectProvisioningState.
 */
public final class ProjectProvisioningState extends ExpandableStringEnum<ProjectProvisioningState> {
    /** Static value Deleting for ProjectProvisioningState. */
    public static final ProjectProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for ProjectProvisioningState. */
    public static final ProjectProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Creates or finds a ProjectProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding ProjectProvisioningState
     */
    @JsonCreator
    public static ProjectProvisioningState fromString(String name) {
        return fromString(name, ProjectProvisioningState.class);
    }

    /**
     * @return known ProjectProvisioningState values
     */
    public static Collection<ProjectProvisioningState> values() {
        return values(ProjectProvisioningState.class);
    }
}
