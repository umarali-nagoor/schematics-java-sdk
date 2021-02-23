/*
 * (C) Copyright IBM Corp. 2021.
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
 * The listWorkspaceActivities options.
 */
public class ListWorkspaceActivitiesOptions extends GenericModel {

  protected String wId;
  protected Long offset;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;
    private Long offset;
    private Long limit;

    private Builder(ListWorkspaceActivitiesOptions listWorkspaceActivitiesOptions) {
      this.wId = listWorkspaceActivitiesOptions.wId;
      this.offset = listWorkspaceActivitiesOptions.offset;
      this.limit = listWorkspaceActivitiesOptions.limit;
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
     */
    public Builder(String wId) {
      this.wId = wId;
    }

    /**
     * Builds a ListWorkspaceActivitiesOptions.
     *
     * @return the new ListWorkspaceActivitiesOptions instance
     */
    public ListWorkspaceActivitiesOptions build() {
      return new ListWorkspaceActivitiesOptions(this);
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the ListWorkspaceActivitiesOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListWorkspaceActivitiesOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListWorkspaceActivitiesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListWorkspaceActivitiesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    wId = builder.wId;
    offset = builder.offset;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListWorkspaceActivitiesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wId.
   *
   * The workspace ID for the workspace that you want to query.  You can run the GET /workspaces call if you need to
   * look up the  workspace IDs in your IBM Cloud account.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
  }

  /**
   * Gets the offset.
   *
   * The number of items to skip before starting to collect the result set.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The numbers of items to return.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

