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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SharedDatasetResponse - request returned by create.
 */
public class SharedDatasetResponse extends GenericModel {

  protected String account;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  protected String description;
  @SerializedName("effected_workspace_ids")
  protected List<String> effectedWorkspaceIds;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("shared_dataset_data")
  protected List<SharedDatasetData> sharedDatasetData;
  @SerializedName("shared_dataset_id")
  protected String sharedDatasetId;
  @SerializedName("shared_dataset_name")
  protected String sharedDatasetName;
  @SerializedName("shared_dataset_type")
  protected List<String> sharedDatasetType;
  protected String state;
  protected List<String> tags;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  protected String version;

  /**
   * Gets the account.
   *
   * Account id.
   *
   * @return the account
   */
  public String getAccount() {
    return account;
  }

  /**
   * Gets the createdAt.
   *
   * Dataset created at.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Dataset created by.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the description.
   *
   * Dataset description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the effectedWorkspaceIds.
   *
   * Affected workspace id.
   *
   * @return the effectedWorkspaceIds
   */
  public List<String> getEffectedWorkspaceIds() {
    return effectedWorkspaceIds;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource group name.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the sharedDatasetData.
   *
   * Shared dataset data.
   *
   * @return the sharedDatasetData
   */
  public List<SharedDatasetData> getSharedDatasetData() {
    return sharedDatasetData;
  }

  /**
   * Gets the sharedDatasetId.
   *
   * Shared dataset id.
   *
   * @return the sharedDatasetId
   */
  public String getSharedDatasetId() {
    return sharedDatasetId;
  }

  /**
   * Gets the sharedDatasetName.
   *
   * Shared dataset name.
   *
   * @return the sharedDatasetName
   */
  public String getSharedDatasetName() {
    return sharedDatasetName;
  }

  /**
   * Gets the sharedDatasetType.
   *
   * Shared dataset type.
   *
   * @return the sharedDatasetType
   */
  public List<String> getSharedDatasetType() {
    return sharedDatasetType;
  }

  /**
   * Gets the state.
   *
   * shareddata variable status type.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the tags.
   *
   * Shared dataset tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the updatedAt.
   *
   * Shared dataset updated at.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Shared dataset updated by.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * Gets the version.
   *
   * Shared dataset version.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }
}

