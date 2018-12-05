/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2018_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2018_07_01.NetworkInterfaceLoadBalancers;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2018_07_01.NetworkInterfaceLoadBalancer;

class NetworkInterfaceLoadBalancersImpl extends WrapperImpl<NetworkInterfaceLoadBalancersInner> implements NetworkInterfaceLoadBalancers {
    private final NetworkManager manager;

    NetworkInterfaceLoadBalancersImpl(NetworkManager manager) {
        super(manager.inner().networkInterfaceLoadBalancers());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private NetworkInterfaceLoadBalancerImpl wrapModel(LoadBalancerInner inner) {
        return  new NetworkInterfaceLoadBalancerImpl(inner, manager());
    }

    @Override
    public Observable<NetworkInterfaceLoadBalancer> listAsync(final String resourceGroupName, final String networkInterfaceName) {
        NetworkInterfaceLoadBalancersInner client = this.inner();
        return client.listAsync(resourceGroupName, networkInterfaceName)
        .flatMapIterable(new Func1<Page<LoadBalancerInner>, Iterable<LoadBalancerInner>>() {
            @Override
            public Iterable<LoadBalancerInner> call(Page<LoadBalancerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<LoadBalancerInner, NetworkInterfaceLoadBalancer>() {
            @Override
            public NetworkInterfaceLoadBalancer call(LoadBalancerInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
