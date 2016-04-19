/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.network;

import com.microsoft.azure.management.network.models.UsagesListResponse;
import com.microsoft.windowsazure.exception.ServiceException;

import java.io.IOException;
import java.util.concurrent.Future;

/**
* Operations for listing usage.
*/
public interface UsageOperations {
    /**
    * Lists compute usages for a subscription.
    *
    * @param location Required. The location upon which resource usage is
    * queried.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The List Usages operation response.
    */
    UsagesListResponse list(String location) throws IOException, ServiceException;
    
    /**
    * Lists compute usages for a subscription.
    *
    * @param location Required. The location upon which resource usage is
    * queried.
    * @return The List Usages operation response.
    */
    Future<UsagesListResponse> listAsync(String location);
}