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
 * WorkspaceResponse - request returned by create.
 */
public class WorkspaceResponse extends GenericModel {

  @SerializedName("applied_shareddata_ids")
  protected List<String> appliedShareddataIds;
  @SerializedName("catalog_ref")
  protected CatalogRef catalogRef;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  protected String crn;
  protected String description;
  protected String id;
  @SerializedName("last_health_check_at")
  protected Date lastHealthCheckAt;
  protected String location;
  protected String name;
  @SerializedName("resource_group")
  protected String resourceGroup;
  @SerializedName("runtime_data")
  protected List<TemplateRunTimeDataResponse> runtimeData;
  @SerializedName("shared_data")
  protected SharedTargetDataResponse sharedData;
  protected String status;
  protected List<String> tags;
  @SerializedName("template_data")
  protected List<TemplateSourceDataResponse> templateData;
  @SerializedName("template_ref")
  protected String templateRef;
  @SerializedName("template_repo")
  protected TemplateRepoResponse templateRepo;
  protected List<String> type;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  @SerializedName("workspace_status")
  protected WorkspaceStatusResponse workspaceStatus;
  @SerializedName("workspace_status_msg")
  protected WorkspaceStatusMessage workspaceStatusMsg;

  /**
   * Gets the appliedShareddataIds.
   *
   * List of applied shared dataset id.
   *
   * @return the appliedShareddataIds
   */
  public List<String> getAppliedShareddataIds() {
    return appliedShareddataIds;
  }

  /**
   * Gets the catalogRef.
   *
   * CatalogRef -.
   *
   * @return the catalogRef
   */
  public CatalogRef getCatalogRef() {
    return catalogRef;
  }

  /**
   * Gets the createdAt.
   *
   * Workspace created at.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Workspace created by.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the crn.
   *
   * Workspace CRN.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the description.
   *
   * Workspace description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the id.
   *
   * Workspace id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lastHealthCheckAt.
   *
   * Last health checked at.
   *
   * @return the lastHealthCheckAt
   */
  public Date getLastHealthCheckAt() {
    return lastHealthCheckAt;
  }

  /**
   * Gets the location.
   *
   * Workspace location.
   *
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Gets the name.
   *
   * Workspace name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * Workspace resource group.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the runtimeData.
   *
   * Workspace runtime data.
   *
   * @return the runtimeData
   */
  public List<TemplateRunTimeDataResponse> getRuntimeData() {
    return runtimeData;
  }

  /**
   * Gets the sharedData.
   *
   * SharedTargetDataResponse -.
   *
   * @return the sharedData
   */
  public SharedTargetDataResponse getSharedData() {
    return sharedData;
  }

  /**
   * Gets the status.
   *
   * Workspace status type.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the tags.
   *
   * Workspace tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the templateData.
   *
   * Workspace template data.
   *
   * @return the templateData
   */
  public List<TemplateSourceDataResponse> getTemplateData() {
    return templateData;
  }

  /**
   * Gets the templateRef.
   *
   * Workspace template ref.
   *
   * @return the templateRef
   */
  public String getTemplateRef() {
    return templateRef;
  }

  /**
   * Gets the templateRepo.
   *
   * TemplateRepoResponse -.
   *
   * @return the templateRepo
   */
  public TemplateRepoResponse getTemplateRepo() {
    return templateRepo;
  }

  /**
   * Gets the type.
   *
   * List of Workspace type.
   *
   * @return the type
   */
  public List<String> getType() {
    return type;
  }

  /**
   * Gets the updatedAt.
   *
   * Workspace updated at.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Workspace updated by.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * Gets the workspaceStatus.
   *
   * WorkspaceStatusResponse -.
   *
   * @return the workspaceStatus
   */
  public WorkspaceStatusResponse getWorkspaceStatus() {
    return workspaceStatus;
  }

  /**
   * Gets the workspaceStatusMsg.
   *
   * WorkspaceStatusMessage -.
   *
   * @return the workspaceStatusMsg
   */
  public WorkspaceStatusMessage getWorkspaceStatusMsg() {
    return workspaceStatusMsg;
  }
}

