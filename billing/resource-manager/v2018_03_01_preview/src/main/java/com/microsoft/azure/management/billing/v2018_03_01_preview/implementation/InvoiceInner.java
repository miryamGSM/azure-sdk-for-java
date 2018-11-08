/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_03_01_preview.implementation;

import org.joda.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * An invoice resource can be used download a PDF version of an invoice.
 */
@JsonFlatten
public class InvoiceInner extends ProxyResource {
    /**
     * A secure link to download the PDF version of an invoice. The link will
     * cease to work after its expiry time is reached.
     */
    @JsonProperty(value = "properties.downloadUrl")
    private DownloadUrlInner downloadUrl;

    /**
     * The start of the date range covered by the invoice.
     */
    @JsonProperty(value = "properties.invoicePeriodStartDate", access = JsonProperty.Access.WRITE_ONLY)
    private LocalDate invoicePeriodStartDate;

    /**
     * The end of the date range covered by the invoice.
     */
    @JsonProperty(value = "properties.invoicePeriodEndDate", access = JsonProperty.Access.WRITE_ONLY)
    private LocalDate invoicePeriodEndDate;

    /**
     * Array of billing perdiod ids that the invoice is attributed to.
     */
    @JsonProperty(value = "properties.billingPeriodIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> billingPeriodIds;

    /**
     * Get a secure link to download the PDF version of an invoice. The link will cease to work after its expiry time is reached.
     *
     * @return the downloadUrl value
     */
    public DownloadUrlInner downloadUrl() {
        return this.downloadUrl;
    }

    /**
     * Set a secure link to download the PDF version of an invoice. The link will cease to work after its expiry time is reached.
     *
     * @param downloadUrl the downloadUrl value to set
     * @return the InvoiceInner object itself.
     */
    public InvoiceInner withDownloadUrl(DownloadUrlInner downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * Get the start of the date range covered by the invoice.
     *
     * @return the invoicePeriodStartDate value
     */
    public LocalDate invoicePeriodStartDate() {
        return this.invoicePeriodStartDate;
    }

    /**
     * Get the end of the date range covered by the invoice.
     *
     * @return the invoicePeriodEndDate value
     */
    public LocalDate invoicePeriodEndDate() {
        return this.invoicePeriodEndDate;
    }

    /**
     * Get array of billing perdiod ids that the invoice is attributed to.
     *
     * @return the billingPeriodIds value
     */
    public List<String> billingPeriodIds() {
        return this.billingPeriodIds;
    }

}
