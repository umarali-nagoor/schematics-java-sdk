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
 * The deleteJob options.
 */
public class DeleteJobOptions extends GenericModel {

  protected String jobId;
  protected String refreshToken;
  protected Boolean force;
  protected Boolean propagate;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobId;
    private String refreshToken;
    private Boolean force;
    private Boolean propagate;

    /**
     * Instantiates a new Builder from an existing DeleteJobOptions instance.
     *
     * @param deleteJobOptions the instance to initialize the Builder with
     */
    private Builder(DeleteJobOptions deleteJobOptions) {
      this.jobId = deleteJobOptions.jobId;
      this.refreshToken = deleteJobOptions.refreshToken;
      this.force = deleteJobOptions.force;
      this.propagate = deleteJobOptions.propagate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param jobId the jobId
     * @param refreshToken the refreshToken
     */
    public Builder(String jobId, String refreshToken) {
      this.jobId = jobId;
      this.refreshToken = refreshToken;
    }

    /**
     * Builds a DeleteJobOptions.
     *
     * @return the new DeleteJobOptions instance
     */
    public DeleteJobOptions build() {
      return new DeleteJobOptions(this);
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the DeleteJobOptions builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the refreshToken.
     *
     * @param refreshToken the refreshToken
     * @return the DeleteJobOptions builder
     */
    public Builder refreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }

    /**
     * Set the force.
     *
     * @param force the force
     * @return the DeleteJobOptions builder
     */
    public Builder force(Boolean force) {
      this.force = force;
      return this;
    }

    /**
     * Set the propagate.
     *
     * @param propagate the propagate
     * @return the DeleteJobOptions builder
     */
    public Builder propagate(Boolean propagate) {
      this.propagate = propagate;
      return this;
    }
  }

  protected DeleteJobOptions() { }

  protected DeleteJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.jobId,
      "jobId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.refreshToken,
      "refreshToken cannot be null");
    jobId = builder.jobId;
    refreshToken = builder.refreshToken;
    force = builder.force;
    propagate = builder.propagate;
  }

  /**
   * New builder.
   *
   * @return a DeleteJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the jobId.
   *
   * Job Id. Use `GET /v2/jobs` API to look up the Job Ids in your IBM Cloud account.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
  }

  /**
   * Gets the refreshToken.
   *
   * The IAM refresh token for the user or service identity.
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
   * Gets the force.
   *
   * Equivalent to -force options in the command line.
   *
   * @return the force
   */
  public Boolean force() {
    return force;
  }

  /**
   * Gets the propagate.
   *
   * Auto propagate the chaange or deletion to the dependent resources.
   *
   * @return the propagate
   */
  public Boolean propagate() {
    return propagate;
  }
}

