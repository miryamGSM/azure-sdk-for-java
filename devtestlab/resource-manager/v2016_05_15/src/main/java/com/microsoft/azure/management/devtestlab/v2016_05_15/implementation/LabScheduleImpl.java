/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15.implementation;

import com.microsoft.azure.management.devtestlab.v2016_05_15.LabSchedule;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.devtestlab.v2016_05_15.ScheduleFragment;
import java.util.Map;
import com.microsoft.azure.management.devtestlab.v2016_05_15.EnableStatus;
import com.microsoft.azure.management.devtestlab.v2016_05_15.WeekDetails;
import com.microsoft.azure.management.devtestlab.v2016_05_15.DayDetails;
import com.microsoft.azure.management.devtestlab.v2016_05_15.HourDetails;
import com.microsoft.azure.management.devtestlab.v2016_05_15.NotificationSettings;
import org.joda.time.DateTime;
import com.microsoft.azure.management.devtestlab.v2016_05_15.DayDetailsFragment;
import com.microsoft.azure.management.devtestlab.v2016_05_15.HourDetailsFragment;
import com.microsoft.azure.management.devtestlab.v2016_05_15.NotificationSettingsFragment;
import com.microsoft.azure.management.devtestlab.v2016_05_15.WeekDetailsFragment;
import rx.functions.Func1;

class LabScheduleImpl extends CreatableUpdatableImpl<LabSchedule, ScheduleInner, LabScheduleImpl> implements LabSchedule, LabSchedule.Definition, LabSchedule.Update {
    private final DevTestLabManager manager;
    private String resourceGroupName;
    private String labName;
    private String name;
    private ScheduleFragment updateParameter;

    LabScheduleImpl(String name, DevTestLabManager manager) {
        super(name, new ScheduleInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
        this.updateParameter = new ScheduleFragment();
    }

    LabScheduleImpl(ScheduleInner inner, DevTestLabManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.labName = IdParsingUtils.getValueFromIdByName(inner.id(), "labs");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "schedules");
        //
        this.updateParameter = new ScheduleFragment();
    }

    @Override
    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public Observable<LabSchedule> createResourceAsync() {
        SchedulesInner client = this.manager().inner().schedules();
        return client.createOrUpdateAsync(this.resourceGroupName, this.labName, this.name, this.inner())
            .map(new Func1<ScheduleInner, ScheduleInner>() {
               @Override
               public ScheduleInner call(ScheduleInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<LabSchedule> updateResourceAsync() {
        SchedulesInner client = this.manager().inner().schedules();
        return client.updateAsync(this.resourceGroupName, this.labName, this.name, this.updateParameter)
            .map(new Func1<ScheduleInner, ScheduleInner>() {
               @Override
               public ScheduleInner call(ScheduleInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ScheduleInner> getInnerAsync() {
        SchedulesInner client = this.manager().inner().schedules();
        return client.getAsync(this.resourceGroupName, this.labName, this.name);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ScheduleFragment();
    }

    @Override
    public DateTime createdDate() {
        return this.inner().createdDate();
    }

    @Override
    public DayDetails dailyRecurrence() {
        return this.inner().dailyRecurrence();
    }

    @Override
    public HourDetails hourlyRecurrence() {
        return this.inner().hourlyRecurrence();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public NotificationSettings notificationSettings() {
        return this.inner().notificationSettings();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public EnableStatus status() {
        return this.inner().status();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String targetResourceId() {
        return this.inner().targetResourceId();
    }

    @Override
    public String taskType() {
        return this.inner().taskType();
    }

    @Override
    public String timeZoneId() {
        return this.inner().timeZoneId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String uniqueIdentifier() {
        return this.inner().uniqueIdentifier();
    }

    @Override
    public WeekDetails weeklyRecurrence() {
        return this.inner().weeklyRecurrence();
    }

    @Override
    public LabScheduleImpl withExistingLab(String resourceGroupName, String labName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        return this;
    }

    @Override
    public LabScheduleImpl withDailyRecurrence(DayDetails dailyRecurrence) {
        this.inner().withDailyRecurrence(dailyRecurrence);
        return this;
    }

    @Override
    public LabScheduleImpl withHourlyRecurrence(HourDetails hourlyRecurrence) {
        this.inner().withHourlyRecurrence(hourlyRecurrence);
        return this;
    }

    @Override
    public LabScheduleImpl withNotificationSettings(NotificationSettings notificationSettings) {
        this.inner().withNotificationSettings(notificationSettings);
        return this;
    }

    @Override
    public LabScheduleImpl withWeeklyRecurrence(WeekDetails weeklyRecurrence) {
        this.inner().withWeeklyRecurrence(weeklyRecurrence);
        return this;
    }

    @Override
    public LabScheduleImpl withDailyRecurrence(DayDetailsFragment dailyRecurrence) {
        this.updateParameter.withDailyRecurrence(dailyRecurrence);
        return this;
    }

    @Override
    public LabScheduleImpl withHourlyRecurrence(HourDetailsFragment hourlyRecurrence) {
        this.updateParameter.withHourlyRecurrence(hourlyRecurrence);
        return this;
    }

    @Override
    public LabScheduleImpl withNotificationSettings(NotificationSettingsFragment notificationSettings) {
        this.updateParameter.withNotificationSettings(notificationSettings);
        return this;
    }

    @Override
    public LabScheduleImpl withWeeklyRecurrence(WeekDetailsFragment weeklyRecurrence) {
        this.updateParameter.withWeeklyRecurrence(weeklyRecurrence);
        return this;
    }

    @Override
    public LabScheduleImpl withLocation(String location) {
        if (isInCreateMode()) {
            this.inner().withLocation(location);
        } else {
            this.updateParameter.withLocation(location);
        }
        return this;
    }

    @Override
    public LabScheduleImpl withProvisioningState(String provisioningState) {
        if (isInCreateMode()) {
            this.inner().withProvisioningState(provisioningState);
        } else {
            this.updateParameter.withProvisioningState(provisioningState);
        }
        return this;
    }

    @Override
    public LabScheduleImpl withStatus(EnableStatus status) {
        if (isInCreateMode()) {
            this.inner().withStatus(status);
        } else {
            this.updateParameter.withStatus(status);
        }
        return this;
    }

    @Override
    public LabScheduleImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public LabScheduleImpl withTargetResourceId(String targetResourceId) {
        if (isInCreateMode()) {
            this.inner().withTargetResourceId(targetResourceId);
        } else {
            this.updateParameter.withTargetResourceId(targetResourceId);
        }
        return this;
    }

    @Override
    public LabScheduleImpl withTaskType(String taskType) {
        if (isInCreateMode()) {
            this.inner().withTaskType(taskType);
        } else {
            this.updateParameter.withTaskType(taskType);
        }
        return this;
    }

    @Override
    public LabScheduleImpl withTimeZoneId(String timeZoneId) {
        if (isInCreateMode()) {
            this.inner().withTimeZoneId(timeZoneId);
        } else {
            this.updateParameter.withTimeZoneId(timeZoneId);
        }
        return this;
    }

    @Override
    public LabScheduleImpl withUniqueIdentifier(String uniqueIdentifier) {
        if (isInCreateMode()) {
            this.inner().withUniqueIdentifier(uniqueIdentifier);
        } else {
            this.updateParameter.withUniqueIdentifier(uniqueIdentifier);
        }
        return this;
    }

}
