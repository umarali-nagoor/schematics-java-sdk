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
 * The getAllWorkspaceInputs options.
 */
public class GetAllWorkspaceInputsOptions extends GenericModel {

  protected String wId;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;

    /**
     * Instantiates a new Builder from an existing GetAllWorkspaceInputsOptions instance.
     *
     * @param getAllWorkspaceInputsOptions the instance to initialize the Builder with
     */
    private Builder(GetAllWorkspaceInputsOptions getAllWorkspaceInputsOptions) {
      this.wId = getAllWorkspaceInputsOptions.wId;
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
     * Builds a GetAllWorkspaceInputsOptions.
     *
     * @return the new GetAllWorkspaceInputsOptions instance
     */
    public GetAllWorkspaceInputsOptions build() {
      return new GetAllWorkspaceInputsOptions(this);
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the GetAllWorkspaceInputsOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }
  }

  protected GetAllWorkspaceInputsOptions() { }

  protected GetAllWorkspaceInputsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    wId = builder.wId;
  }

  /**
   * New builder.
   *
   * @return a GetAllWorkspaceInputsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wId.
   *
   * The ID of the workspace for which you want to retrieve input parameters and  values. To find the workspace ID, use
   * the `GET /workspaces` API.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
  }
}

