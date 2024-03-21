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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Blueprint summary profile.
 */
public class BlueprintLite extends GenericModel {

  /**
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   */
  public interface Location {
    /** us-south. */
    String US_SOUTH = "us-south";
    /** us-east. */
    String US_EAST = "us-east";
    /** eu-gb. */
    String EU_GB = "eu-gb";
    /** eu-de. */
    String EU_DE = "eu-de";
  }

  protected String name;
  @SerializedName("source_type")
  protected String sourceType;
  protected ExternalSourceLite source;
  protected String description;
  @SerializedName("resource_group")
  protected String resourceGroup;
  protected List<String> tags;
  protected String location;
  protected String id;
  protected String crn;
  protected String account;
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
  @SerializedName("user_state")
  protected UserState userState;
  protected BlueprintLiteState state;

  protected BlueprintLite() { }

  /**
   * Gets the name.
   *
   * Blueprint name (unique for an account).
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the sourceType.
   *
   * @return the sourceType
   */
  public String getSourceType() {
    return sourceType;
  }

  /**
   * Gets the source.
   *
   * Source of templates, playbooks, or controls.
   *
   * @return the source
   */
  public ExternalSourceLite getSource() {
    return source;
  }

  /**
   * Gets the description.
   *
   * Blueprint description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name for the blueprint.  By default, blueprint will be created in Default Resource Group.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the tags.
   *
   * Blueprint tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the location.
   *
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   *
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Gets the id.
   *
   * System generated blueprint Id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * Blueprint CRN.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the account.
   *
   * Account id for the blueprint.
   *
   * @return the account
   */
  public String getAccount() {
    return account;
  }

  /**
   * Gets the createdAt.
   *
   * Blueprint creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * User who created the Cart order.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Blueprint updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * User who updated the Cart order.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * Gets the sysLock.
   *
   * System lock status.
   *
   * @return the sysLock
   */
  public SystemLock getSysLock() {
    return sysLock;
  }

  /**
   * Gets the userState.
   *
   * User defined status of the Schematics object.
   *
   * @return the userState
   */
  public UserState getUserState() {
    return userState;
  }

  /**
   * Gets the state.
   *
   * Computed state of the blueprint.
   *
   * @return the state
   */
  public BlueprintLiteState getState() {
    return state;
  }
}

