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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Complete Target details with user inputs and system generated data.
 */
public class TargetResourceset extends GenericModel {

  protected String name;
  protected String type;
  protected String description;
  @SerializedName("resource_query")
  protected String resourceQuery;
  @SerializedName("credential_ref")
  protected String credentialRef;
  protected String id;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  @SerializedName("sys_lock")
  protected SystemLock sysLock;
  @SerializedName("resource_ids")
  protected List<String> resourceIds;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String type;
    private String description;
    private String resourceQuery;
    private String credentialRef;
    private SystemLock sysLock;

    private Builder(TargetResourceset targetResourceset) {
      this.name = targetResourceset.name;
      this.type = targetResourceset.type;
      this.description = targetResourceset.description;
      this.resourceQuery = targetResourceset.resourceQuery;
      this.credentialRef = targetResourceset.credentialRef;
      this.sysLock = targetResourceset.sysLock;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TargetResourceset.
     *
     * @return the new TargetResourceset instance
     */
    public TargetResourceset build() {
      return new TargetResourceset(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the TargetResourceset builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the TargetResourceset builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the TargetResourceset builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the resourceQuery.
     *
     * @param resourceQuery the resourceQuery
     * @return the TargetResourceset builder
     */
    public Builder resourceQuery(String resourceQuery) {
      this.resourceQuery = resourceQuery;
      return this;
    }

    /**
     * Set the credentialRef.
     *
     * @param credentialRef the credentialRef
     * @return the TargetResourceset builder
     */
    public Builder credentialRef(String credentialRef) {
      this.credentialRef = credentialRef;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the TargetResourceset builder
     */
    public Builder sysLock(SystemLock sysLock) {
      this.sysLock = sysLock;
      return this;
    }
  }

  protected TargetResourceset(Builder builder) {
    name = builder.name;
    type = builder.type;
    description = builder.description;
    resourceQuery = builder.resourceQuery;
    credentialRef = builder.credentialRef;
    sysLock = builder.sysLock;
  }

  /**
   * New builder.
   *
   * @return a TargetResourceset builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Target name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * Target type (cluster, vsi, icd, vpc).
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the description.
   *
   * Target description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the resourceQuery.
   *
   * Resource selection query string.
   *
   * @return the resourceQuery
   */
  public String resourceQuery() {
    return resourceQuery;
  }

  /**
   * Gets the credentialRef.
   *
   * Override credential for each resource.  Reference to credentials values, used by all resources.
   *
   * @return the credentialRef
   */
  public String credentialRef() {
    return credentialRef;
  }

  /**
   * Gets the id.
   *
   * Target id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the createdAt.
   *
   * Targets creation time.
   *
   * @return the createdAt
   */
  public Date createdAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Email address of user who created the Targets.
   *
   * @return the createdBy
   */
  public String createdBy() {
    return createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Targets updation time.
   *
   * @return the updatedAt
   */
  public Date updatedAt() {
    return updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Email address of user who updated the Targets.
   *
   * @return the updatedBy
   */
  public String updatedBy() {
    return updatedBy;
  }

  /**
   * Gets the sysLock.
   *
   * System lock status.
   *
   * @return the sysLock
   */
  public SystemLock sysLock() {
    return sysLock;
  }

  /**
   * Gets the resourceIds.
   *
   * Array of resource ids.
   *
   * @return the resourceIds
   */
  public List<String> resourceIds() {
    return resourceIds;
  }
}

