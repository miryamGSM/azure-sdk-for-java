/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2014_04.implementation;

import com.microsoft.azure.management.sql.v3_2014_04.ServiceTierAdvisor;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.UUID;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.sql.v3_2014_04.SloUsageMetric;

class ServiceTierAdvisorImpl extends IndexableRefreshableWrapperImpl<ServiceTierAdvisor, ServiceTierAdvisorInner> implements ServiceTierAdvisor {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String databaseName;
    private String serviceTierAdvisorName;

    ServiceTierAdvisorImpl(ServiceTierAdvisorInner inner,  SqlManager manager) {
        super(null, inner);
        this.manager = manager;
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        this.serviceTierAdvisorName = IdParsingUtils.getValueFromIdByName(inner.id(), "serviceTierAdvisors");
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ServiceTierAdvisorInner> getInnerAsync() {
        ServiceTierAdvisorsInner client = this.manager().inner().serviceTierAdvisors();
        return client.getAsync(this.resourceGroupName, this.serverName, this.databaseName, this.serviceTierAdvisorName);
    }



    @Override
    public Double activeTimeRatio() {
        return this.inner().activeTimeRatio();
    }

    @Override
    public Double avgDtu() {
        return this.inner().avgDtu();
    }

    @Override
    public double confidence() {
        return this.inner().confidence();
    }

    @Override
    public String currentServiceLevelObjective() {
        return this.inner().currentServiceLevelObjective();
    }

    @Override
    public UUID currentServiceLevelObjectiveId() {
        return this.inner().currentServiceLevelObjectiveId();
    }

    @Override
    public String databaseSizeBasedRecommendationServiceLevelObjective() {
        return this.inner().databaseSizeBasedRecommendationServiceLevelObjective();
    }

    @Override
    public UUID databaseSizeBasedRecommendationServiceLevelObjectiveId() {
        return this.inner().databaseSizeBasedRecommendationServiceLevelObjectiveId();
    }

    @Override
    public String disasterPlanBasedRecommendationServiceLevelObjective() {
        return this.inner().disasterPlanBasedRecommendationServiceLevelObjective();
    }

    @Override
    public UUID disasterPlanBasedRecommendationServiceLevelObjectiveId() {
        return this.inner().disasterPlanBasedRecommendationServiceLevelObjectiveId();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Double maxDtu() {
        return this.inner().maxDtu();
    }

    @Override
    public Double maxSizeInGB() {
        return this.inner().maxSizeInGB();
    }

    @Override
    public Double minDtu() {
        return this.inner().minDtu();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public DateTime observationPeriodEnd() {
        return this.inner().observationPeriodEnd();
    }

    @Override
    public DateTime observationPeriodStart() {
        return this.inner().observationPeriodStart();
    }

    @Override
    public String overallRecommendationServiceLevelObjective() {
        return this.inner().overallRecommendationServiceLevelObjective();
    }

    @Override
    public UUID overallRecommendationServiceLevelObjectiveId() {
        return this.inner().overallRecommendationServiceLevelObjectiveId();
    }

    @Override
    public List<SloUsageMetric> serviceLevelObjectiveUsageMetrics() {
        return this.inner().serviceLevelObjectiveUsageMetrics();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String usageBasedRecommendationServiceLevelObjective() {
        return this.inner().usageBasedRecommendationServiceLevelObjective();
    }

    @Override
    public UUID usageBasedRecommendationServiceLevelObjectiveId() {
        return this.inner().usageBasedRecommendationServiceLevelObjectiveId();
    }

}
