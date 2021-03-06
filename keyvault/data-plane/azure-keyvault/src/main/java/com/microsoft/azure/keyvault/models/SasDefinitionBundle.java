/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A SAS definition bundle consists of key vault SAS definition details plus
 * its attributes.
 */
public class SasDefinitionBundle {
    /**
     * The SAS definition id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Storage account SAS definition secret id.
     */
    @JsonProperty(value = "sid", access = JsonProperty.Access.WRITE_ONLY)
    private String secretId;

    /**
     * The SAS definition token template signed with an arbitrary key.  Tokens
     * created according to the SAS definition will have the same properties as
     * the template.
     */
    @JsonProperty(value = "templateUri", access = JsonProperty.Access.WRITE_ONLY)
    private String templateUri;

    /**
     * The type of SAS token the SAS definition will create. Possible values
     * include: 'account', 'service'.
     */
    @JsonProperty(value = "sasType", access = JsonProperty.Access.WRITE_ONLY)
    private SasTokenType sasType;

    /**
     * The validity period of SAS tokens created according to the SAS
     * definition.
     */
    @JsonProperty(value = "validityPeriod", access = JsonProperty.Access.WRITE_ONLY)
    private String validityPeriod;

    /**
     * The SAS definition attributes.
     */
    @JsonProperty(value = "attributes", access = JsonProperty.Access.WRITE_ONLY)
    private SasDefinitionAttributes attributes;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the secretId value.
     *
     * @return the secretId value
     */
    public String secretId() {
        return this.secretId;
    }

    /**
     * Get the templateUri value.
     *
     * @return the templateUri value
     */
    public String templateUri() {
        return this.templateUri;
    }

    /**
     * Get the sasType value.
     *
     * @return the sasType value
     */
    public SasTokenType sasType() {
        return this.sasType;
    }

    /**
     * Get the validityPeriod value.
     *
     * @return the validityPeriod value
     */
    public String validityPeriod() {
        return this.validityPeriod;
    }

    /**
     * Get the attributes value.
     *
     * @return the attributes value
     */
    public SasDefinitionAttributes attributes() {
        return this.attributes;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

}
