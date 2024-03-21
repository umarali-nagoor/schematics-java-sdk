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
 * The getInventory options.
 */
public class GetInventoryOptions extends GenericModel {

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** summary. */
    String SUMMARY = "summary";
    /** detailed. */
    String DETAILED = "detailed";
    /** ids. */
    String IDS = "ids";
  }

  protected String inventoryId;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String inventoryId;
    private String profile;

    /**
     * Instantiates a new Builder from an existing GetInventoryOptions instance.
     *
     * @param getInventoryOptions the instance to initialize the Builder with
     */
    private Builder(GetInventoryOptions getInventoryOptions) {
      this.inventoryId = getInventoryOptions.inventoryId;
      this.profile = getInventoryOptions.profile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param inventoryId the inventoryId
     */
    public Builder(String inventoryId) {
      this.inventoryId = inventoryId;
    }

    /**
     * Builds a GetInventoryOptions.
     *
     * @return the new GetInventoryOptions instance
     */
    public GetInventoryOptions build() {
      return new GetInventoryOptions(this);
    }

    /**
     * Set the inventoryId.
     *
     * @param inventoryId the inventoryId
     * @return the GetInventoryOptions builder
     */
    public Builder inventoryId(String inventoryId) {
      this.inventoryId = inventoryId;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the GetInventoryOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }
  }

  protected GetInventoryOptions() { }

  protected GetInventoryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.inventoryId,
      "inventoryId cannot be empty");
    inventoryId = builder.inventoryId;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a GetInventoryOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the inventoryId.
   *
   * Resource Inventory Id.  Use `GET /v2/inventories` API to look up the Resource Inventory definition Ids  in your IBM
   * Cloud account.
   *
   * @return the inventoryId
   */
  public String inventoryId() {
    return inventoryId;
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

