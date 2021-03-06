// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExpressRouteCircuitPeeringId model. */
@Fluent
public final class ExpressRouteCircuitPeeringId {
    /*
     * The ID of the ExpressRoute circuit peering.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: The ID of the ExpressRoute circuit peering.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the ExpressRoute circuit peering.
     *
     * @param id the id value to set.
     * @return the ExpressRouteCircuitPeeringId object itself.
     */
    public ExpressRouteCircuitPeeringId withId(String id) {
        this.id = id;
        return this;
    }
}
