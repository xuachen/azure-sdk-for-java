/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.storage.implementation.api;

import java.util.List;

/**
 * The List Usages operation response.
 */
public class UsageListResultInner {
    /**
     * Gets or sets the list Storage Resource Usages.
     */
    private List<Usage> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<Usage> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the UsageListResultInner object itself.
     */
    public UsageListResultInner withValue(List<Usage> value) {
        this.value = value;
        return this;
    }

}
