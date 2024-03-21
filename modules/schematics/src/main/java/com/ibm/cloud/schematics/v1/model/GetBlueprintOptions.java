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
 * The getBlueprint options.
 */
public class GetBlueprintOptions extends GenericModel {

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

  /**
   * Builder.
   */
  public static class Builder {
    private String blueprintId;
    private String profile;

    /**
     * Instantiates a new Builder from an existing GetBlueprintOptions instance.
     *
     * @param getBlueprintOptions the instance to initialize the Builder with
     */
    private Builder(GetBlueprintOptions getBlueprintOptions) {
      this.blueprintId = getBlueprintOptions.blueprintId;
      this.profile = getBlueprintOptions.profile;
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
     * Builds a GetBlueprintOptions.
     *
     * @return the new GetBlueprintOptions instance
     */
    public GetBlueprintOptions build() {
      return new GetBlueprintOptions(this);
    }

    /**
     * Set the blueprintId.
     *
     * @param blueprintId the blueprintId
     * @return the GetBlueprintOptions builder
     */
    public Builder blueprintId(String blueprintId) {
      this.blueprintId = blueprintId;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the GetBlueprintOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected GetBlueprintOptions() { }

  protected GetBlueprintOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.blueprintId,
      "blueprintId cannot be empty");
    blueprintId = builder.blueprintId;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a GetBlueprintOptions builder
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
}

