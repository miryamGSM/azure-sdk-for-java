/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac.implementation;

import java.util.List;
import com.microsoft.azure.graphrbac.AppRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Active Directory service principal information.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("ServicePrincipal")
public class ServicePrincipalInner extends DirectoryObjectInner {
    /**
     * The display name of the service principal.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The application ID.
     */
    @JsonProperty(value = "appId")
    private String appId;

    /**
     * The collection of application roles that an application may declare.
     * These roles can be assigned to users, groups or service principals.
     */
    @JsonProperty(value = "appRoles")
    private List<AppRole> appRoles;

    /**
     * A collection of service principal names.
     */
    @JsonProperty(value = "servicePrincipalNames")
    private List<String> servicePrincipalNames;

    /**
     * Get the display name of the service principal.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the service principal.
     *
     * @param displayName the displayName value to set
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the application ID.
     *
     * @return the appId value
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the application ID.
     *
     * @param appId the appId value to set
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the collection of application roles that an application may declare. These roles can be assigned to users, groups or service principals.
     *
     * @return the appRoles value
     */
    public List<AppRole> appRoles() {
        return this.appRoles;
    }

    /**
     * Set the collection of application roles that an application may declare. These roles can be assigned to users, groups or service principals.
     *
     * @param appRoles the appRoles value to set
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withAppRoles(List<AppRole> appRoles) {
        this.appRoles = appRoles;
        return this;
    }

    /**
     * Get a collection of service principal names.
     *
     * @return the servicePrincipalNames value
     */
    public List<String> servicePrincipalNames() {
        return this.servicePrincipalNames;
    }

    /**
     * Set a collection of service principal names.
     *
     * @param servicePrincipalNames the servicePrincipalNames value to set
     * @return the ServicePrincipalInner object itself.
     */
    public ServicePrincipalInner withServicePrincipalNames(List<String> servicePrincipalNames) {
        this.servicePrincipalNames = servicePrincipalNames;
        return this;
    }

}