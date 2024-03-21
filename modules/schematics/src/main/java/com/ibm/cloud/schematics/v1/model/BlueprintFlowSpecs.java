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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BlueprintFlowSpecs.
 */
public class BlueprintFlowSpecs extends GenericModel {

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
   * Type of blueprint flow specification.
   */
  public interface FlowType {
    /** sequence_flow. */
    String SEQUENCE_FLOW = "sequence_flow";
    /** conditional_flow. */
    String CONDITIONAL_FLOW = "conditional_flow";
  }

  @SerializedName("command_name")
  protected String commandName;
  @SerializedName("flow_type")
  protected String flowType;
  @SerializedName("sequence_flow")
  protected List<BlueprintFlowSequenceFlow> sequenceFlow;
  @SerializedName("conditional_flow")
  protected String conditionalFlow;

  /**
   * Builder.
   */
  public static class Builder {
    private String commandName;
    private String flowType;
    private List<BlueprintFlowSequenceFlow> sequenceFlow;
    private String conditionalFlow;

    /**
     * Instantiates a new Builder from an existing BlueprintFlowSpecs instance.
     *
     * @param blueprintFlowSpecs the instance to initialize the Builder with
     */
    private Builder(BlueprintFlowSpecs blueprintFlowSpecs) {
      this.commandName = blueprintFlowSpecs.commandName;
      this.flowType = blueprintFlowSpecs.flowType;
      this.sequenceFlow = blueprintFlowSpecs.sequenceFlow;
      this.conditionalFlow = blueprintFlowSpecs.conditionalFlow;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BlueprintFlowSpecs.
     *
     * @return the new BlueprintFlowSpecs instance
     */
    public BlueprintFlowSpecs build() {
      return new BlueprintFlowSpecs(this);
    }

    /**
     * Adds a new element to sequenceFlow.
     *
     * @param sequenceFlow the new element to be added
     * @return the BlueprintFlowSpecs builder
     */
    public Builder addSequenceFlow(BlueprintFlowSequenceFlow sequenceFlow) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(sequenceFlow,
        "sequenceFlow cannot be null");
      if (this.sequenceFlow == null) {
        this.sequenceFlow = new ArrayList<BlueprintFlowSequenceFlow>();
      }
      this.sequenceFlow.add(sequenceFlow);
      return this;
    }

    /**
     * Set the commandName.
     *
     * @param commandName the commandName
     * @return the BlueprintFlowSpecs builder
     */
    public Builder commandName(String commandName) {
      this.commandName = commandName;
      return this;
    }

    /**
     * Set the flowType.
     *
     * @param flowType the flowType
     * @return the BlueprintFlowSpecs builder
     */
    public Builder flowType(String flowType) {
      this.flowType = flowType;
      return this;
    }

    /**
     * Set the sequenceFlow.
     * Existing sequenceFlow will be replaced.
     *
     * @param sequenceFlow the sequenceFlow
     * @return the BlueprintFlowSpecs builder
     */
    public Builder sequenceFlow(List<BlueprintFlowSequenceFlow> sequenceFlow) {
      this.sequenceFlow = sequenceFlow;
      return this;
    }

    /**
     * Set the conditionalFlow.
     *
     * @param conditionalFlow the conditionalFlow
     * @return the BlueprintFlowSpecs builder
     */
    public Builder conditionalFlow(String conditionalFlow) {
      this.conditionalFlow = conditionalFlow;
      return this;
    }
  }

  protected BlueprintFlowSpecs() { }

  protected BlueprintFlowSpecs(Builder builder) {
    commandName = builder.commandName;
    flowType = builder.flowType;
    sequenceFlow = builder.sequenceFlow;
    conditionalFlow = builder.conditionalFlow;
  }

  /**
   * New builder.
   *
   * @return a BlueprintFlowSpecs builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the flowType.
   *
   * Type of blueprint flow specification.
   *
   * @return the flowType
   */
  public String flowType() {
    return flowType;
  }

  /**
   * Gets the sequenceFlow.
   *
   * Ordered items in the simple sequence.
   *
   * @return the sequenceFlow
   */
  public List<BlueprintFlowSequenceFlow> sequenceFlow() {
    return sequenceFlow;
  }

  /**
   * Gets the conditionalFlow.
   *
   * Placeholder for conditional flow.
   *
   * @return the conditionalFlow
   */
  public String conditionalFlow() {
    return conditionalFlow;
  }
}

