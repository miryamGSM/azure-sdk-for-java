/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01.implementation;

import com.microsoft.azure.management.mediaservices.v2018_07_01.LiveEvent;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.mediaservices.v2018_07_01.LiveEventInput;
import com.microsoft.azure.management.mediaservices.v2018_07_01.LiveEventPreview;
import com.microsoft.azure.management.mediaservices.v2018_07_01.LiveEventEncoding;
import com.microsoft.azure.management.mediaservices.v2018_07_01.LiveEventResourceState;
import com.microsoft.azure.management.mediaservices.v2018_07_01.CrossSiteAccessPolicies;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_07_01.StreamOptionsFlag;
import org.joda.time.DateTime;

class LiveEventImpl extends CreatableUpdatableImpl<LiveEvent, LiveEventInner, LiveEventImpl> implements LiveEvent, LiveEvent.Definition, LiveEvent.Update {
    private final MediaManager manager;
    private String resourceGroupName;
    private String accountName;
    private String liveEventName;
    private Boolean cautoStart;

    LiveEventImpl(String name, MediaManager manager) {
        super(name, new LiveEventInner());
        this.manager = manager;
        // Set resource name
        this.liveEventName = name;
        //
    }

    LiveEventImpl(LiveEventInner inner, MediaManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.liveEventName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "mediaservices");
        this.liveEventName = IdParsingUtils.getValueFromIdByName(inner.id(), "liveEvents");
        //
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public Observable<LiveEvent> createResourceAsync() {
        LiveEventsInner client = this.manager().inner().liveEvents();
        return client.createAsync(this.resourceGroupName, this.accountName, this.liveEventName, this.inner(), this.cautoStart)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<LiveEvent> updateResourceAsync() {
        LiveEventsInner client = this.manager().inner().liveEvents();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.liveEventName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<LiveEventInner> getInnerAsync() {
        LiveEventsInner client = this.manager().inner().liveEvents();
        return client.getAsync(this.resourceGroupName, this.accountName, this.liveEventName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime created() {
        return this.inner().created();
    }

    @Override
    public CrossSiteAccessPolicies crossSiteAccessPolicies() {
        return this.inner().crossSiteAccessPolicies();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public LiveEventEncoding encoding() {
        return this.inner().encoding();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public LiveEventInput input() {
        return this.inner().input();
    }

    @Override
    public DateTime lastModified() {
        return this.inner().lastModified();
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
    public LiveEventPreview preview() {
        return this.inner().preview();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public LiveEventResourceState resourceState() {
        return this.inner().resourceState();
    }

    @Override
    public List<StreamOptionsFlag> streamOptions() {
        return this.inner().streamOptions();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public Boolean vanityUrl() {
        return this.inner().vanityUrl();
    }

    @Override
    public LiveEventImpl withExistingMediaservice(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public LiveEventImpl withAutoStart(Boolean autoStart) {
        this.cautoStart = autoStart;
        return this;
    }

    @Override
    public LiveEventImpl withInput(LiveEventInput input) {
        this.inner().withInput(input);
        return this;
    }

    @Override
    public LiveEventImpl withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies) {
        this.inner().withCrossSiteAccessPolicies(crossSiteAccessPolicies);
        return this;
    }

    @Override
    public LiveEventImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public LiveEventImpl withEncoding(LiveEventEncoding encoding) {
        this.inner().withEncoding(encoding);
        return this;
    }

    @Override
    public LiveEventImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public LiveEventImpl withPreview(LiveEventPreview preview) {
        this.inner().withPreview(preview);
        return this;
    }

    @Override
    public LiveEventImpl withStreamOptions(List<StreamOptionsFlag> streamOptions) {
        this.inner().withStreamOptions(streamOptions);
        return this;
    }

    @Override
    public LiveEventImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

    @Override
    public LiveEventImpl withVanityUrl(Boolean vanityUrl) {
        this.inner().withVanityUrl(vanityUrl);
        return this;
    }

}
