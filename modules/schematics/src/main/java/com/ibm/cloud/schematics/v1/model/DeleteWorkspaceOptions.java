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
 * The deleteWorkspace options.
 */
public class DeleteWorkspaceOptions extends GenericModel {

  protected String refreshToken;
  protected String wId;
  protected String destroyResources;

  /**
   * Builder.
   */
  public static class Builder {
    private String refreshToken;
    private String wId;
    private String destroyResources;

    /**
     * Instantiates a new Builder from an existing DeleteWorkspaceOptions instance.
     *
     * @param deleteWorkspaceOptions the instance to initialize the Builder with
     */
    private Builder(DeleteWorkspaceOptions deleteWorkspaceOptions) {
      this.refreshToken = deleteWorkspaceOptions.refreshToken;
      this.wId = deleteWorkspaceOptions.wId;
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
     * @param refreshToken the refreshToken
     * @param wId the wId
     */
    public Builder(String refreshToken, String wId) {
      this.refreshToken = refreshToken;
      this.wId = wId;
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

  protected DeleteWorkspaceOptions() { }

  protected DeleteWorkspaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.refreshToken,
      "refreshToken cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    refreshToken = builder.refreshToken;
    wId = builder.wId;
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
   * Gets the refreshToken.
   *
   * The IAM refresh token for the user or service identity. The IAM refresh token is required only if you want to
   * destroy the Terraform resources before deleting the Schematics workspace. If you want to delete the workspace only
   * and keep all your Terraform resources, refresh token is not required.
   *
   *   **Retrieving refresh token**:
   *   * Use `export IBMCLOUD_API_KEY=&lt;ibmcloud_api_key&gt;`, and execute `curl -X POST
   * "https://iam.cloud.ibm.com/identity/token" -H "Content-Type: application/x-www-form-urlencoded" -d
   * "grant_type=urn:ibm:params:oauth:grant-type:apikey&amp;apikey=$IBMCLOUD_API_KEY" -u bx:bx`.
   *   * For more information, about creating IAM access token and API Docs, refer, [IAM access
   * token](/apidocs/iam-identity-token-api#gettoken-password) and [Create API
   * key](/apidocs/iam-identity-token-api#create-api-key).
   *
   *   **Limitation**:
   *   * If the token is expired, you can use `refresh token` to get a new IAM access token.
   *   * The `refresh_token` parameter cannot be used to retrieve a new IAM access token.
   *   * When the IAM access token is about to expire, use the API key to create a new access token.
   *
   * @return the refreshToken
   */
  public String refreshToken() {
    return refreshToken;
  }

  /**
   * Gets the wId.
   *
   * The ID of the workspace.  To find the workspace ID, use the `GET /v1/workspaces` API.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
  }

  /**
   * Gets the destroyResources.
   *
   * If set to `true`, refresh_token header configuration is required to delete all the Terraform resources, and the
   * Schematics workspace. If set to `false`, you can remove only the workspace. Your Terraform resources are still
   * available and must be managed with the resource dashboard or CLI.
   *
   * @return the destroyResources
   */
  public String destroyResources() {
    return destroyResources;
  }
}

