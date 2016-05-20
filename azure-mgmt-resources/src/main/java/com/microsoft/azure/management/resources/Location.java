package com.microsoft.azure.management.resources;

import com.microsoft.azure.management.resources.fluentcore.model.Indexable;
import com.microsoft.azure.management.resources.fluentcore.model.Wrapper;
import com.microsoft.azure.management.resources.implementation.api.LocationInner;
import com.microsoft.azure.management.resources.implementation.api.SubscriptionInner;
import com.microsoft.azure.management.resources.implementation.api.SubscriptionPolicies;

/**
 * Defines an interface for accessing a location in Azure.
 */
public interface Location extends
        Indexable,
        Wrapper<LocationInner>{
    /**
     * Get the subscription Id.
     *
     * @return the subscription Id.
     */
    String subscriptionId();

    /**
     * Get the location name.
     *
     * @return the location name.
     */
    String name();

    /**
     * Get the display name of the location.
     *
     * @return the display name of the location.
     */
    String displayName();

    /**
     * Get the latitude of the location.
     *
     * @return the latitude of the location.
     */
    String latitude();

    /**
     * Get the longitude of the location.
     *
     * @return the longitude of the location.
     */
    String longitude();
}
