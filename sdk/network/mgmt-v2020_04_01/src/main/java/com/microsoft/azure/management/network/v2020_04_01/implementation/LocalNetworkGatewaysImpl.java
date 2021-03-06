/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_04_01.LocalNetworkGateways;
import com.microsoft.azure.management.network.v2020_04_01.LocalNetworkGateway;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class LocalNetworkGatewaysImpl extends GroupableResourcesCoreImpl<LocalNetworkGateway, LocalNetworkGatewayImpl, LocalNetworkGatewayInner, LocalNetworkGatewaysInner, NetworkManager>  implements LocalNetworkGateways {
    protected LocalNetworkGatewaysImpl(NetworkManager manager) {
        super(manager.inner().localNetworkGateways(), manager);
    }

    @Override
    protected Observable<LocalNetworkGatewayInner> getInnerAsync(String resourceGroupName, String name) {
        LocalNetworkGatewaysInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        LocalNetworkGatewaysInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<LocalNetworkGateway> listByResourceGroup(String resourceGroupName) {
        LocalNetworkGatewaysInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<LocalNetworkGateway> listByResourceGroupAsync(String resourceGroupName) {
        LocalNetworkGatewaysInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<LocalNetworkGatewayInner>, Iterable<LocalNetworkGatewayInner>>() {
            @Override
            public Iterable<LocalNetworkGatewayInner> call(Page<LocalNetworkGatewayInner> page) {
                return page.items();
            }
        })
        .map(new Func1<LocalNetworkGatewayInner, LocalNetworkGateway>() {
            @Override
            public LocalNetworkGateway call(LocalNetworkGatewayInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public LocalNetworkGatewayImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected LocalNetworkGatewayImpl wrapModel(LocalNetworkGatewayInner inner) {
        return  new LocalNetworkGatewayImpl(inner.name(), inner, manager());
    }

    @Override
    protected LocalNetworkGatewayImpl wrapModel(String name) {
        return new LocalNetworkGatewayImpl(name, new LocalNetworkGatewayInner(), this.manager());
    }

}
