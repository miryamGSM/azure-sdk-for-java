/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_03_01_preview;

import rx.Observable;
import com.microsoft.azure.management.signalr.v2018_03_01_preview.implementation.SignalRsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Locations.
 */
public interface Locations extends HasInner<SignalRsInner> {
    /**
     * Checks that the SignalR name is valid and is not already in use.
     *
     * @param location the region
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NameAvailability> checkNameAvailabilityAsync(String location);

}