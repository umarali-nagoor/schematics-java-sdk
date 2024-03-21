/*
 * (C) Copyright IBM Corp. 2024.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.schematics.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getWorkspaceActivityLogs options.
 */
public class GetWorkspaceActivityLogsOptions extends GenericModel {

  protected String wId;
  protected String activityId;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;
    private String activityId;

    /**
     * Instantiates a new Builder from an existing GetWorkspaceActivityLogsOptions instance.
     *
     * @param getWorkspaceActivityLogsOptions the instance to initialize the Builder with
     */
    private Builder(GetWorkspaceActivityLogsOptions getWorkspaceActivityLogsOptions) {
      this.wId = getWorkspaceActivityLogsOptions.wId;
      this.activityId = getWorkspaceActivityLogsOptions.activityId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param wId the wId
     * @param activityId the activityId
     */
    public Builder(String wId, String activityId) {
      this.wId = wId;
      this.activityId = activityId;
    }

    /**
     * Builds a GetWorkspaceActivityLogsOptions.
     *
     * @return the new GetWorkspaceActivityLogsOptions instance
     */
    public GetWorkspaceActivityLogsOptions build() {
      return new GetWorkspaceActivityLogsOptions(this);
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the GetWorkspaceActivityLogsOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }

    /**
     * Set the activityId.
     *
     * @param activityId the activityId
     * @return the GetWorkspaceActivityLogsOptions builder
     */
    public Builder activityId(String activityId) {
      this.activityId = activityId;
      return this;
    }
  }

  protected GetWorkspaceActivityLogsOptions() { }

  protected GetWorkspaceActivityLogsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.activityId,
      "activityId cannot be empty");
    wId = builder.wId;
    activityId = builder.activityId;
  }

  /**
   * New builder.
   *
   * @return a GetWorkspaceActivityLogsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wId.
   *
   * The ID of the workspace for which you want to retrieve the Terraform statefile.  To find the workspace ID, use the
   * `GET /v1/workspaces` API.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
  }

  /**
   * Gets the activityId.
   *
   * The ID of the activity or job, for which you want to retrieve details.  To find the job ID, use the `GET
   * /v1/workspaces/{id}/actions` API.
   *
   * @return the activityId
   */
  public String activityId() {
    return activityId;
  }
}

