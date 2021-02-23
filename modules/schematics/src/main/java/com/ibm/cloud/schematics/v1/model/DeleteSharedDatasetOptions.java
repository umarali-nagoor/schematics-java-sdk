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
 * The deleteSharedDataset options.
 */
public class DeleteSharedDatasetOptions extends GenericModel {

  protected String sdId;

  /**
   * Builder.
   */
  public static class Builder {
    private String sdId;

    private Builder(DeleteSharedDatasetOptions deleteSharedDatasetOptions) {
      this.sdId = deleteSharedDatasetOptions.sdId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param sdId the sdId
     */
    public Builder(String sdId) {
      this.sdId = sdId;
    }

    /**
     * Builds a DeleteSharedDatasetOptions.
     *
     * @return the new DeleteSharedDatasetOptions instance
     */
    public DeleteSharedDatasetOptions build() {
      return new DeleteSharedDatasetOptions(this);
    }

    /**
     * Set the sdId.
     *
     * @param sdId the sdId
     * @return the DeleteSharedDatasetOptions builder
     */
    public Builder sdId(String sdId) {
      this.sdId = sdId;
      return this;
    }
  }

  protected DeleteSharedDatasetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.sdId,
      "sdId cannot be empty");
    sdId = builder.sdId;
  }

  /**
   * New builder.
   *
   * @return a DeleteSharedDatasetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sdId.
   *
   * The shared dataset ID Use the GET /shared_datasets to look up the shared dataset IDs  in your IBM Cloud account.
   *
   * @return the sdId
   */
  public String sdId() {
    return sdId;
  }
}

