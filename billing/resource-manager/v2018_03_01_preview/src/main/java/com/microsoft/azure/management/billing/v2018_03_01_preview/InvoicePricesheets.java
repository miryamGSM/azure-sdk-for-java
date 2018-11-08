/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_03_01_preview;

import rx.Observable;

/**
 * Type representing InvoicePricesheets.
 */
public interface InvoicePricesheets {
    /**
     * Get pricesheet data for invoice id (invoiceName).
     *
     * @param billingAccountId Azure Billing Account ID.
     * @param invoiceName The name of an invoice resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DownloadUrl> postAsync(String billingAccountId, String invoiceName);

}
