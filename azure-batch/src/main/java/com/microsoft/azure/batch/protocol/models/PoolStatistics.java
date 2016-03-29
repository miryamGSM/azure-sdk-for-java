/**
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains utilization and resource usage statistics for the lifetime of a
 * pool.
 */
public class PoolStatistics {
    /**
     * Gets or sets the URL for the statistics.
     */
    @JsonProperty(required = true)
    private String url;

    /**
     * Gets or sets the start time of the time range covered by the statistics.
     */
    @JsonProperty(required = true)
    private DateTime startTime;

    /**
     * Gets or sets the time at which the statistics were last updated. All
     * statistics are limited to the range between startTime and
     * lastUpdateTime.
     */
    @JsonProperty(required = true)
    private DateTime lastUpdateTime;

    /**
     * Gets or sets statistics related to pool usage information, such as the
     * amount of core-time used.
     */
    private UsageStatistics usageStats;

    /**
     * Gets or sets statistics related to resource consumption by compute
     * nodes in the pool.
     */
    private ResourceStatistics resourceStats;

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     */
    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Get the lastUpdateTime value.
     *
     * @return the lastUpdateTime value
     */
    public DateTime getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Set the lastUpdateTime value.
     *
     * @param lastUpdateTime the lastUpdateTime value to set
     */
    public void setLastUpdateTime(DateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * Get the usageStats value.
     *
     * @return the usageStats value
     */
    public UsageStatistics getUsageStats() {
        return this.usageStats;
    }

    /**
     * Set the usageStats value.
     *
     * @param usageStats the usageStats value to set
     */
    public void setUsageStats(UsageStatistics usageStats) {
        this.usageStats = usageStats;
    }

    /**
     * Get the resourceStats value.
     *
     * @return the resourceStats value
     */
    public ResourceStatistics getResourceStats() {
        return this.resourceStats;
    }

    /**
     * Set the resourceStats value.
     *
     * @param resourceStats the resourceStats value to set
     */
    public void setResourceStats(ResourceStatistics resourceStats) {
        this.resourceStats = resourceStats;
    }

}