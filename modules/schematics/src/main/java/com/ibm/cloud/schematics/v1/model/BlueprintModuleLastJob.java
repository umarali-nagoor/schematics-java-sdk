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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Status of the last job executed by the module.
 */
public class BlueprintModuleLastJob extends GenericModel {

  /**
   * Name of the Schematics automation resource.
   */
  public interface CommandObject {
    /** workspace. */
    String WORKSPACE = "workspace";
    /** action. */
    String ACTION = "action";
    /** system. */
    String SYSTEM = "system";
    /** environment. */
    String ENVIRONMENT = "environment";
    /** blueprint. */
    String BLUEPRINT = "blueprint";
  }

  /**
   * Schematics job command name.
   */
  public interface CommandName {
    /** workspace_plan. */
    String WORKSPACE_PLAN = "workspace_plan";
    /** workspace_apply. */
    String WORKSPACE_APPLY = "workspace_apply";
    /** workspace_destroy. */
    String WORKSPACE_DESTROY = "workspace_destroy";
    /** workspace_refresh. */
    String WORKSPACE_REFRESH = "workspace_refresh";
    /** ansible_playbook_run. */
    String ANSIBLE_PLAYBOOK_RUN = "ansible_playbook_run";
    /** ansible_playbook_check. */
    String ANSIBLE_PLAYBOOK_CHECK = "ansible_playbook_check";
    /** create_action. */
    String CREATE_ACTION = "create_action";
    /** put_action. */
    String PUT_ACTION = "put_action";
    /** patch_action. */
    String PATCH_ACTION = "patch_action";
    /** delete_action. */
    String DELETE_ACTION = "delete_action";
    /** system_key_enable. */
    String SYSTEM_KEY_ENABLE = "system_key_enable";
    /** system_key_delete. */
    String SYSTEM_KEY_DELETE = "system_key_delete";
    /** system_key_disable. */
    String SYSTEM_KEY_DISABLE = "system_key_disable";
    /** system_key_rotate. */
    String SYSTEM_KEY_ROTATE = "system_key_rotate";
    /** system_key_restore. */
    String SYSTEM_KEY_RESTORE = "system_key_restore";
    /** create_workspace. */
    String CREATE_WORKSPACE = "create_workspace";
    /** put_workspace. */
    String PUT_WORKSPACE = "put_workspace";
    /** patch_workspace. */
    String PATCH_WORKSPACE = "patch_workspace";
    /** delete_workspace. */
    String DELETE_WORKSPACE = "delete_workspace";
    /** create_cart. */
    String CREATE_CART = "create_cart";
    /** create_environment. */
    String CREATE_ENVIRONMENT = "create_environment";
    /** put_environment. */
    String PUT_ENVIRONMENT = "put_environment";
    /** delete_environment. */
    String DELETE_ENVIRONMENT = "delete_environment";
    /** environment_create_init. */
    String ENVIRONMENT_CREATE_INIT = "environment_create_init";
    /** environment_update_init. */
    String ENVIRONMENT_UPDATE_INIT = "environment_update_init";
    /** environment_install. */
    String ENVIRONMENT_INSTALL = "environment_install";
    /** environment_uninstall. */
    String ENVIRONMENT_UNINSTALL = "environment_uninstall";
    /** blueprint_create_init. */
    String BLUEPRINT_CREATE_INIT = "blueprint_create_init";
    /** blueprint_update_init. */
    String BLUEPRINT_UPDATE_INIT = "blueprint_update_init";
    /** blueprint_install. */
    String BLUEPRINT_INSTALL = "blueprint_install";
    /** blueprint_destroy. */
    String BLUEPRINT_DESTROY = "blueprint_destroy";
    /** blueprint_delete. */
    String BLUEPRINT_DELETE = "blueprint_delete";
    /** blueprint_plan_init. */
    String BLUEPRINT_PLAN_INIT = "blueprint_plan_init";
    /** blueprint_plan_apply. */
    String BLUEPRINT_PLAN_APPLY = "blueprint_plan_apply";
    /** blueprint_plan_destroy. */
    String BLUEPRINT_PLAN_DESTROY = "blueprint_plan_destroy";
    /** blueprint_run_plan. */
    String BLUEPRINT_RUN_PLAN = "blueprint_run_plan";
    /** blueprint_run_apply. */
    String BLUEPRINT_RUN_APPLY = "blueprint_run_apply";
    /** blueprint_run_destroy. */
    String BLUEPRINT_RUN_DESTROY = "blueprint_run_destroy";
    /** repository_process. */
    String REPOSITORY_PROCESS = "repository_process";
    /** terraform_commands. */
    String TERRAFORM_COMMANDS = "terraform_commands";
  }

  /**
   * Status of Jobs.
   */
  public interface JobStatus {
    /** job_pending. */
    String JOB_PENDING = "job_pending";
    /** job_in_progress. */
    String JOB_IN_PROGRESS = "job_in_progress";
    /** job_finished. */
    String JOB_FINISHED = "job_finished";
    /** job_failed. */
    String JOB_FAILED = "job_failed";
    /** job_cancelled. */
    String JOB_CANCELLED = "job_cancelled";
    /** job_stopped. */
    String JOB_STOPPED = "job_stopped";
    /** job_stop_in_progress. */
    String JOB_STOP_IN_PROGRESS = "job_stop_in_progress";
    /** job_ready_to_execute. */
    String JOB_READY_TO_EXECUTE = "job_ready_to_execute";
  }

  @SerializedName("command_object")
  protected String commandObject;
  @SerializedName("command_object_name")
  protected String commandObjectName;
  @SerializedName("command_object_id")
  protected String commandObjectId;
  @SerializedName("command_name")
  protected String commandName;
  @SerializedName("job_status")
  protected String jobStatus;

  /**
   * Builder.
   */
  public static class Builder {
    private String commandObject;
    private String commandObjectName;
    private String commandObjectId;
    private String commandName;
    private String jobStatus;

    /**
     * Instantiates a new Builder from an existing BlueprintModuleLastJob instance.
     *
     * @param blueprintModuleLastJob the instance to initialize the Builder with
     */
    private Builder(BlueprintModuleLastJob blueprintModuleLastJob) {
      this.commandObject = blueprintModuleLastJob.commandObject;
      this.commandObjectName = blueprintModuleLastJob.commandObjectName;
      this.commandObjectId = blueprintModuleLastJob.commandObjectId;
      this.commandName = blueprintModuleLastJob.commandName;
      this.jobStatus = blueprintModuleLastJob.jobStatus;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BlueprintModuleLastJob.
     *
     * @return the new BlueprintModuleLastJob instance
     */
    public BlueprintModuleLastJob build() {
      return new BlueprintModuleLastJob(this);
    }

    /**
     * Set the commandObject.
     *
     * @param commandObject the commandObject
     * @return the BlueprintModuleLastJob builder
     */
    public Builder commandObject(String commandObject) {
      this.commandObject = commandObject;
      return this;
    }

    /**
     * Set the commandObjectName.
     *
     * @param commandObjectName the commandObjectName
     * @return the BlueprintModuleLastJob builder
     */
    public Builder commandObjectName(String commandObjectName) {
      this.commandObjectName = commandObjectName;
      return this;
    }

    /**
     * Set the commandObjectId.
     *
     * @param commandObjectId the commandObjectId
     * @return the BlueprintModuleLastJob builder
     */
    public Builder commandObjectId(String commandObjectId) {
      this.commandObjectId = commandObjectId;
      return this;
    }

    /**
     * Set the commandName.
     *
     * @param commandName the commandName
     * @return the BlueprintModuleLastJob builder
     */
    public Builder commandName(String commandName) {
      this.commandName = commandName;
      return this;
    }

    /**
     * Set the jobStatus.
     *
     * @param jobStatus the jobStatus
     * @return the BlueprintModuleLastJob builder
     */
    public Builder jobStatus(String jobStatus) {
      this.jobStatus = jobStatus;
      return this;
    }
  }

  protected BlueprintModuleLastJob() { }

  protected BlueprintModuleLastJob(Builder builder) {
    commandObject = builder.commandObject;
    commandObjectName = builder.commandObjectName;
    commandObjectId = builder.commandObjectId;
    commandName = builder.commandName;
    jobStatus = builder.jobStatus;
  }

  /**
   * New builder.
   *
   * @return a BlueprintModuleLastJob builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the commandObject.
   *
   * Name of the Schematics automation resource.
   *
   * @return the commandObject
   */
  public String commandObject() {
    return commandObject;
  }

  /**
   * Gets the commandObjectName.
   *
   * Name of the command object id, maps to workspace_name or action_name.
   *
   * @return the commandObjectName
   */
  public String commandObjectName() {
    return commandObjectName;
  }

  /**
   * Gets the commandObjectId.
   *
   * Module command object id, maps to workspace_id or action_id.
   *
   * @return the commandObjectId
   */
  public String commandObjectId() {
    return commandObjectId;
  }

  /**
   * Gets the commandName.
   *
   * Schematics job command name.
   *
   * @return the commandName
   */
  public String commandName() {
    return commandName;
  }

  /**
   * Gets the jobStatus.
   *
   * Status of Jobs.
   *
   * @return the jobStatus
   */
  public String jobStatus() {
    return jobStatus;
  }
}

