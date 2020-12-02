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
 * Job summary profile with system generated data.
 */
public class JobLite extends GenericModel {

  /**
   * Name of the Schematics automation resource.
   */
  public interface CommandObject {
    /** workspace. */
    String WORKSPACE = "workspace";
    /** action. */
    String ACTION = "action";
  }

  /**
   * Schematics job command name.
   */
  public interface CommandName {
    /** workspace_init_flow. */
    String WORKSPACE_INIT_FLOW = "workspace_init_flow";
    /** workspace_plan_flow. */
    String WORKSPACE_PLAN_FLOW = "workspace_plan_flow";
    /** workspace_apply_flow. */
    String WORKSPACE_APPLY_FLOW = "workspace_apply_flow";
    /** workspace_destroy_flow. */
    String WORKSPACE_DESTROY_FLOW = "workspace_destroy_flow";
    /** workspace_refresh_flow. */
    String WORKSPACE_REFRESH_FLOW = "workspace_refresh_flow";
    /** workspace_show_flow. */
    String WORKSPACE_SHOW_FLOW = "workspace_show_flow";
    /** workspace_custom_flow. */
    String WORKSPACE_CUSTOM_FLOW = "workspace_custom_flow";
    /** terraform_init. */
    String TERRAFORM_INIT = "terraform_init";
    /** terrform_plan. */
    String TERRFORM_PLAN = "terrform_plan";
    /** terrform_apply. */
    String TERRFORM_APPLY = "terrform_apply";
    /** terrform_destroy. */
    String TERRFORM_DESTROY = "terrform_destroy";
    /** terrform_refresh. */
    String TERRFORM_REFRESH = "terrform_refresh";
    /** terrform_taint. */
    String TERRFORM_TAINT = "terrform_taint";
    /** terrform_show. */
    String TERRFORM_SHOW = "terrform_show";
    /** helm_install. */
    String HELM_INSTALL = "helm_install";
    /** helm_list. */
    String HELM_LIST = "helm_list";
    /** helm_show. */
    String HELM_SHOW = "helm_show";
    /** ansible_playbook_run. */
    String ANSIBLE_PLAYBOOK_RUN = "ansible_playbook_run";
    /** ansible_playbook_check. */
    String ANSIBLE_PLAYBOOK_CHECK = "ansible_playbook_check";
    /** opa_evaluate. */
    String OPA_EVALUATE = "opa_evaluate";
  }

  /**
   * List of workspace locations supported by IBM Cloud Schematics service.  Note, this does not limit the location of
   * the resources provisioned using Schematics.
   */
  public interface Location {
    /** us_south. */
    String US_SOUTH = "us_south";
    /** us_east. */
    String US_EAST = "us_east";
    /** eu_gb. */
    String EU_GB = "eu_gb";
    /** eu_de. */
    String EU_DE = "eu_de";
  }

  protected String id;
  protected String name;
  protected String description;
  @SerializedName("command_object")
  protected String commandObject;
  @SerializedName("command_object_id")
  protected String commandObjectId;
  @SerializedName("command_name")
  protected String commandName;
  protected List<String> tags;
  protected String location;
  @SerializedName("resource_group")
  protected String resourceGroup;
  protected List<TargetResourceset> targets;
  @SerializedName("submitted_at")
  protected Date submittedAt;
  @SerializedName("submitted_by")
  protected String submittedBy;
  protected String duration;
  @SerializedName("start_at")
  protected Date startAt;
  @SerializedName("end_at")
  protected Date endAt;
  protected JobStatus status;
  @SerializedName("log_summary")
  protected JobLogSummary logSummary;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Gets the id.
   *
   * Job ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * Job name, uniquely derived from the related Action.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Job description derived from the related Action.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the commandObject.
   *
   * Name of the Schematics automation resource.
   *
   * @return the commandObject
   */
  public String getCommandObject() {
    return commandObject;
  }

  /**
   * Gets the commandObjectId.
   *
   * Job command object id (action-id).
   *
   * @return the commandObjectId
   */
  public String getCommandObjectId() {
    return commandObjectId;
  }

  /**
   * Gets the commandName.
   *
   * Schematics job command name.
   *
   * @return the commandName
   */
  public String getCommandName() {
    return commandName;
  }

  /**
   * Gets the tags.
   *
   * User defined tags, while running the job.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the location.
   *
   * List of workspace locations supported by IBM Cloud Schematics service.  Note, this does not limit the location of
   * the resources provisioned using Schematics.
   *
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name derived from the related Action,.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the targets.
   *
   * Job targets.
   *
   * @return the targets
   */
  public List<TargetResourceset> getTargets() {
    return targets;
  }

  /**
   * Gets the submittedAt.
   *
   * Job submission time.
   *
   * @return the submittedAt
   */
  public Date getSubmittedAt() {
    return submittedAt;
  }

  /**
   * Gets the submittedBy.
   *
   * Email address of user who submitted the job.
   *
   * @return the submittedBy
   */
  public String getSubmittedBy() {
    return submittedBy;
  }

  /**
   * Gets the duration.
   *
   * Duration of job execution; example 40 sec.
   *
   * @return the duration
   */
  public String getDuration() {
    return duration;
  }

  /**
   * Gets the startAt.
   *
   * Job start time.
   *
   * @return the startAt
   */
  public Date getStartAt() {
    return startAt;
  }

  /**
   * Gets the endAt.
   *
   * Job end time.
   *
   * @return the endAt
   */
  public Date getEndAt() {
    return endAt;
  }

  /**
   * Gets the status.
   *
   * Job Status.
   *
   * @return the status
   */
  public JobStatus getStatus() {
    return status;
  }

  /**
   * Gets the logSummary.
   *
   * Job log summary record.
   *
   * @return the logSummary
   */
  public JobLogSummary getLogSummary() {
    return logSummary;
  }

  /**
   * Gets the updatedAt.
   *
   * Job status updation timestamp.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

