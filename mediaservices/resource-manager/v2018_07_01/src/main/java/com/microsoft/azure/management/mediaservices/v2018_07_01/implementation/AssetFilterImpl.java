/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01.implementation;

import com.microsoft.azure.management.mediaservices.v2018_07_01.AssetFilter;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.mediaservices.v2018_07_01.PresentationTimeRange;
import com.microsoft.azure.management.mediaservices.v2018_07_01.FirstQuality;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_07_01.FilterTrackSelection;

class AssetFilterImpl extends CreatableUpdatableImpl<AssetFilter, AssetFilterInner, AssetFilterImpl> implements AssetFilter, AssetFilter.Definition, AssetFilter.Update {
    private final MediaManager manager;
    private String resourceGroupName;
    private String accountName;
    private String assetName;
    private String filterName;

    AssetFilterImpl(String name, MediaManager manager) {
        super(name, new AssetFilterInner());
        this.manager = manager;
        // Set resource name
        this.filterName = name;
        //
    }

    AssetFilterImpl(AssetFilterInner inner, MediaManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.filterName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "mediaServices");
        this.assetName = IdParsingUtils.getValueFromIdByName(inner.id(), "assets");
        this.filterName = IdParsingUtils.getValueFromIdByName(inner.id(), "assetFilters");
        //
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AssetFilter> createResourceAsync() {
        AssetFiltersInner client = this.manager().inner().assetFilters();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName, this.assetName, this.filterName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AssetFilter> updateResourceAsync() {
        AssetFiltersInner client = this.manager().inner().assetFilters();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.assetName, this.filterName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AssetFilterInner> getInnerAsync() {
        AssetFiltersInner client = this.manager().inner().assetFilters();
        return client.getAsync(this.resourceGroupName, this.accountName, this.assetName, this.filterName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public FirstQuality firstQuality() {
        return this.inner().firstQuality();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public PresentationTimeRange presentationTimeRange() {
        return this.inner().presentationTimeRange();
    }

    @Override
    public List<FilterTrackSelection> tracks() {
        return this.inner().tracks();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public AssetFilterImpl withExistingAsset(String resourceGroupName, String accountName, String assetName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.assetName = assetName;
        return this;
    }

    @Override
    public AssetFilterImpl withFirstQuality(FirstQuality firstQuality) {
        this.inner().withFirstQuality(firstQuality);
        return this;
    }

    @Override
    public AssetFilterImpl withPresentationTimeRange(PresentationTimeRange presentationTimeRange) {
        this.inner().withPresentationTimeRange(presentationTimeRange);
        return this;
    }

    @Override
    public AssetFilterImpl withTracks(List<FilterTrackSelection> tracks) {
        this.inner().withTracks(tracks);
        return this;
    }

}
