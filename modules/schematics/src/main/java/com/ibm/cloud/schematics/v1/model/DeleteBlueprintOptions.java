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
 * The deleteBlueprint options.
 */
public class DeleteBlueprintOptions extends GenericModel {

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** ids. */
    String IDS = "ids";
    /** summary. */
    String SUMMARY = "summary";
  }

  protected String blueprintId;
  protected String profile;
  protected Boolean destroy;

  /**
   * Builder.
   */
  public static class Builder {
    private String blueprintId;
    private String profile;
    private Boolean destroy;

    /**
     * Instantiates a new Builder from an existing DeleteBlueprintOptions instance.
     *
     * @param deleteBlueprintOptions the instance to initialize the Builder with
     */
    private Builder(DeleteBlueprintOptions deleteBlueprintOptions) {
      this.blueprintId = deleteBlueprintOptions.blueprintId;
      this.profile = deleteBlueprintOptions.profile;
      this.destroy = deleteBlueprintOptions.destroy;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param blueprintId the blueprintId
     */
    public Builder(String blueprintId) {
      this.blueprintId = blueprintId;
    }

    /**
     * Builds a DeleteBlueprintOptions.
     *
     * @return the new DeleteBlueprintOptions instance
     */
    public DeleteBlueprintOptions build() {
      return new DeleteBlueprintOptions(this);
    }

    /**
     * Set the blueprintId.
     *
     * @param blueprintId the blueprintId
     * @return the DeleteBlueprintOptions builder
     */
    public Builder blueprintId(String blueprintId) {
      this.blueprintId = blueprintId;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the DeleteBlueprintOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the destroy.
     *
     * @param destroy the destroy
     * @return the DeleteBlueprintOptions builder
     */
    public Builder destroy(Boolean destroy) {
      this.destroy = destroy;
      return this;
    }
  }

  protected DeleteBlueprintOptions() { }

  protected DeleteBlueprintOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.blueprintId,
      "blueprintId cannot be empty");
    blueprintId = builder.blueprintId;
    profile = builder.profile;
    destroy = builder.destroy;
  }

  /**
   * New builder.
   *
   * @return a DeleteBlueprintOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the blueprintId.
   *
   * Environment Id.  Use `GET /v2/blueprints` API to look up the order ids in your IBM Cloud account.
   *
   * @return the blueprintId
   */
  public String blueprintId() {
    return blueprintId;
  }

  /**
   * Gets the profile.
   *
   * Level of details returned by the get method.
   *
   * @return the profile
   */
  public String profile() {
    return profile;
  }

  /**
   * Gets the destroy.
   *
   * Destroy the resources before deleting the blueprint.
   *
   * @return the destroy
   */
  public Boolean destroy() {
    return destroy;
  }
}

