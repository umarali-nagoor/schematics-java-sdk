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
 * The getWorkspaceInputMetadata options.
 */
public class GetWorkspaceInputMetadataOptions extends GenericModel {

  protected String wId;
  protected String tId;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;
    private String tId;

    private Builder(GetWorkspaceInputMetadataOptions getWorkspaceInputMetadataOptions) {
      this.wId = getWorkspaceInputMetadataOptions.wId;
      this.tId = getWorkspaceInputMetadataOptions.tId;
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
     * @param tId the tId
     */
    public Builder(String wId, String tId) {
      this.wId = wId;
      this.tId = tId;
    }

    /**
     * Builds a GetWorkspaceInputMetadataOptions.
     *
     * @return the new GetWorkspaceInputMetadataOptions instance
     */
    public GetWorkspaceInputMetadataOptions build() {
      return new GetWorkspaceInputMetadataOptions(this);
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the GetWorkspaceInputMetadataOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }

    /**
     * Set the tId.
     *
     * @param tId the tId
     * @return the GetWorkspaceInputMetadataOptions builder
     */
    public Builder tId(String tId) {
      this.tId = tId;
      return this;
    }
  }

  protected GetWorkspaceInputMetadataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.tId,
      "tId cannot be empty");
    wId = builder.wId;
    tId = builder.tId;
  }

  /**
   * New builder.
   *
   * @return a GetWorkspaceInputMetadataOptions builder
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
   * Gets the tId.
   *
   * The Template ID for which you want to get the values.  Use the GET /workspaces to look up the workspace IDs  or
   * template IDs in your IBM Cloud account.
   *
   * @return the tId
   */
  public String tId() {
    return tId;
  }
}

