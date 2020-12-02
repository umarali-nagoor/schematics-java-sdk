/*
 * (C) Copyright IBM Corp. 2020.
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
 * The deleteWorkspace options.
 */
public class DeleteWorkspaceOptions extends GenericModel {

  protected String wId;
  protected String refreshToken;
  protected String destroyResources;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;
    private String refreshToken;
    private String destroyResources;

    private Builder(DeleteWorkspaceOptions deleteWorkspaceOptions) {
      this.wId = deleteWorkspaceOptions.wId;
      this.refreshToken = deleteWorkspaceOptions.refreshToken;
      this.destroyResources = deleteWorkspaceOptions.destroyResources;
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
     * @param refreshToken the refreshToken
     */
    public Builder(String wId, String refreshToken) {
      this.wId = wId;
      this.refreshToken = refreshToken;
    }

    /**
     * Builds a DeleteWorkspaceOptions.
     *
     * @return the new DeleteWorkspaceOptions instance
     */
    public DeleteWorkspaceOptions build() {
      return new DeleteWorkspaceOptions(this);
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the DeleteWorkspaceOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }

    /**
     * Set the refreshToken.
     *
     * @param refreshToken the refreshToken
     * @return the DeleteWorkspaceOptions builder
     */
    public Builder refreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }

    /**
     * Set the destroyResources.
     *
     * @param destroyResources the destroyResources
     * @return the DeleteWorkspaceOptions builder
     */
    public Builder destroyResources(String destroyResources) {
      this.destroyResources = destroyResources;
      return this;
    }
  }

  protected DeleteWorkspaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.refreshToken,
      "refreshToken cannot be null");
    wId = builder.wId;
    refreshToken = builder.refreshToken;
    destroyResources = builder.destroyResources;
  }

  /**
   * New builder.
   *
   * @return a DeleteWorkspaceOptions builder
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
   * Gets the refreshToken.
   *
   * The IAM refresh token associated with the IBM Cloud account.
   *
   * @return the refreshToken
   */
  public String refreshToken() {
    return refreshToken;
  }

  /**
   * Gets the destroyResources.
   *
   * true or 1 - to destroy resources before deleting workspace;  If this is true, refresh_token is mandatory.
   *
   * @return the destroyResources
   */
  public String destroyResources() {
    return destroyResources;
  }
}

