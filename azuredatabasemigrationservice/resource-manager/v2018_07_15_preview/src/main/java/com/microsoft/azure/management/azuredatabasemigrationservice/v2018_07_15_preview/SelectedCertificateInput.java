/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Info for certificate to be exported for TDE enabled databases.
 */
public class SelectedCertificateInput {
    /**
     * Name of certificate to be exported.
     */
    @JsonProperty(value = "certificateName", required = true)
    private String certificateName;

    /**
     * Password to use for encrypting the exported certificate.
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /**
     * Get name of certificate to be exported.
     *
     * @return the certificateName value
     */
    public String certificateName() {
        return this.certificateName;
    }

    /**
     * Set name of certificate to be exported.
     *
     * @param certificateName the certificateName value to set
     * @return the SelectedCertificateInput object itself.
     */
    public SelectedCertificateInput withCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * Get password to use for encrypting the exported certificate.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set password to use for encrypting the exported certificate.
     *
     * @param password the password value to set
     * @return the SelectedCertificateInput object itself.
     */
    public SelectedCertificateInput withPassword(String password) {
        this.password = password;
        return this;
    }

}
