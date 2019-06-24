/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the Compute Node agent.
 * The Batch Compute Node agent is a program that runs on each Compute Node in
 * the Pool and provides Batch capability on the Compute Node.
 */
public class NodeAgentInformation {
    /**
     * The version of the Batch Compute Node agent running on the Compute Node.
     * This version number can be checked against the Compute Node agent
     * release notes located at
     * https://github.com/Azure/Batch/blob/master/changelogs/nodeagent/CHANGELOG.md.
     */
    @JsonProperty(value = "version", required = true)
    private String version;

    /**
     * The time when the Compute Node agent was updated on the Compute Node.
     * This is the most recent time that the Compute Node agent was updated to
     * a new version.
     */
    @JsonProperty(value = "lastUpdateTime", required = true)
    private DateTime lastUpdateTime;

    /**
     * Get this version number can be checked against the Compute Node agent release notes located at https://github.com/Azure/Batch/blob/master/changelogs/nodeagent/CHANGELOG.md.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set this version number can be checked against the Compute Node agent release notes located at https://github.com/Azure/Batch/blob/master/changelogs/nodeagent/CHANGELOG.md.
     *
     * @param version the version value to set
     * @return the NodeAgentInformation object itself.
     */
    public NodeAgentInformation withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get this is the most recent time that the Compute Node agent was updated to a new version.
     *
     * @return the lastUpdateTime value
     */
    public DateTime lastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Set this is the most recent time that the Compute Node agent was updated to a new version.
     *
     * @param lastUpdateTime the lastUpdateTime value to set
     * @return the NodeAgentInformation object itself.
     */
    public NodeAgentInformation withLastUpdateTime(DateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

}