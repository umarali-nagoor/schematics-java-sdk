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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Complete Action details with user inputs and system generated data.
 */
public class Action extends GenericModel {

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

  /**
   * Type of source for the Template.
   */
  public interface SourceType {
    /** local. */
    String LOCAL = "local";
    /** git_hub. */
    String GIT_HUB = "git_hub";
    /** git_hub_enterprise. */
    String GIT_HUB_ENTERPRISE = "git_hub_enterprise";
    /** git_lab. */
    String GIT_LAB = "git_lab";
    /** ibm_git_lab. */
    String IBM_GIT_LAB = "ibm_git_lab";
    /** ibm_cloud_catalog. */
    String IBM_CLOUD_CATALOG = "ibm_cloud_catalog";
    /** external_scm. */
    String EXTERNAL_SCM = "external_scm";
  }

  protected String name;
  protected String description;
  protected String location;
  @SerializedName("resource_group")
  protected String resourceGroup;
  protected List<String> tags;
  @SerializedName("user_state")
  protected UserState userState;
  @SerializedName("source_readme_url")
  protected String sourceReadmeUrl;
  protected ExternalSource source;
  @SerializedName("source_type")
  protected String sourceType;
  @SerializedName("command_parameter")
  protected String commandParameter;
  protected TargetResourceset bastion;
  protected List<TargetResourceset> targets;
  protected List<VariableData> inputs;
  protected List<VariableData> outputs;
  protected List<VariableData> settings;
  @SerializedName("trigger_record_id")
  protected String triggerRecordId;
  protected String id;
  protected String crn;
  protected String account;
  @SerializedName("source_created_at")
  protected Date sourceCreatedAt;
  @SerializedName("source_created_by")
  protected String sourceCreatedBy;
  @SerializedName("source_updated_at")
  protected Date sourceUpdatedAt;
  @SerializedName("source_updated_by")
  protected String sourceUpdatedBy;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  protected String namespace;
  protected ActionState state;
  @SerializedName("playbook_names")
  protected List<String> playbookNames;
  @SerializedName("sys_lock")
  protected SystemLock sysLock;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String location;
    private String resourceGroup;
    private List<String> tags;
    private UserState userState;
    private String sourceReadmeUrl;
    private ExternalSource source;
    private String sourceType;
    private String commandParameter;
    private TargetResourceset bastion;
    private List<TargetResourceset> targets;
    private List<VariableData> inputs;
    private List<VariableData> outputs;
    private List<VariableData> settings;
    private String triggerRecordId;
    private ActionState state;
    private SystemLock sysLock;

    private Builder(Action action) {
      this.name = action.name;
      this.description = action.description;
      this.location = action.location;
      this.resourceGroup = action.resourceGroup;
      this.tags = action.tags;
      this.userState = action.userState;
      this.sourceReadmeUrl = action.sourceReadmeUrl;
      this.source = action.source;
      this.sourceType = action.sourceType;
      this.commandParameter = action.commandParameter;
      this.bastion = action.bastion;
      this.targets = action.targets;
      this.inputs = action.inputs;
      this.outputs = action.outputs;
      this.settings = action.settings;
      this.triggerRecordId = action.triggerRecordId;
      this.state = action.state;
      this.sysLock = action.sysLock;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Action.
     *
     * @return the new Action instance
     */
    public Action build() {
      return new Action(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the Action builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Adds an targets to targets.
     *
     * @param targets the new targets
     * @return the Action builder
     */
    public Builder addTargets(TargetResourceset targets) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(targets,
        "targets cannot be null");
      if (this.targets == null) {
        this.targets = new ArrayList<TargetResourceset>();
      }
      this.targets.add(targets);
      return this;
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the Action builder
     */
    public Builder addInputs(VariableData inputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(inputs,
        "inputs cannot be null");
      if (this.inputs == null) {
        this.inputs = new ArrayList<VariableData>();
      }
      this.inputs.add(inputs);
      return this;
    }

    /**
     * Adds an outputs to outputs.
     *
     * @param outputs the new outputs
     * @return the Action builder
     */
    public Builder addOutputs(VariableData outputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(outputs,
        "outputs cannot be null");
      if (this.outputs == null) {
        this.outputs = new ArrayList<VariableData>();
      }
      this.outputs.add(outputs);
      return this;
    }

    /**
     * Adds an settings to settings.
     *
     * @param settings the new settings
     * @return the Action builder
     */
    public Builder addSettings(VariableData settings) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(settings,
        "settings cannot be null");
      if (this.settings == null) {
        this.settings = new ArrayList<VariableData>();
      }
      this.settings.add(settings);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the Action builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Action builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the Action builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the Action builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the Action builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the Action builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the sourceReadmeUrl.
     *
     * @param sourceReadmeUrl the sourceReadmeUrl
     * @return the Action builder
     */
    public Builder sourceReadmeUrl(String sourceReadmeUrl) {
      this.sourceReadmeUrl = sourceReadmeUrl;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the Action builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the Action builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Set the commandParameter.
     *
     * @param commandParameter the commandParameter
     * @return the Action builder
     */
    public Builder commandParameter(String commandParameter) {
      this.commandParameter = commandParameter;
      return this;
    }

    /**
     * Set the bastion.
     *
     * @param bastion the bastion
     * @return the Action builder
     */
    public Builder bastion(TargetResourceset bastion) {
      this.bastion = bastion;
      return this;
    }

    /**
     * Set the targets.
     * Existing targets will be replaced.
     *
     * @param targets the targets
     * @return the Action builder
     */
    public Builder targets(List<TargetResourceset> targets) {
      this.targets = targets;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the Action builder
     */
    public Builder inputs(List<VariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the outputs.
     * Existing outputs will be replaced.
     *
     * @param outputs the outputs
     * @return the Action builder
     */
    public Builder outputs(List<VariableData> outputs) {
      this.outputs = outputs;
      return this;
    }

    /**
     * Set the settings.
     * Existing settings will be replaced.
     *
     * @param settings the settings
     * @return the Action builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the triggerRecordId.
     *
     * @param triggerRecordId the triggerRecordId
     * @return the Action builder
     */
    public Builder triggerRecordId(String triggerRecordId) {
      this.triggerRecordId = triggerRecordId;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the Action builder
     */
    public Builder state(ActionState state) {
      this.state = state;
      return this;
    }

    /**
     * Set the sysLock.
     *
     * @param sysLock the sysLock
     * @return the Action builder
     */
    public Builder sysLock(SystemLock sysLock) {
      this.sysLock = sysLock;
      return this;
    }
  }

  protected Action(Builder builder) {
    name = builder.name;
    description = builder.description;
    location = builder.location;
    resourceGroup = builder.resourceGroup;
    tags = builder.tags;
    userState = builder.userState;
    sourceReadmeUrl = builder.sourceReadmeUrl;
    source = builder.source;
    sourceType = builder.sourceType;
    commandParameter = builder.commandParameter;
    bastion = builder.bastion;
    targets = builder.targets;
    inputs = builder.inputs;
    outputs = builder.outputs;
    settings = builder.settings;
    triggerRecordId = builder.triggerRecordId;
    state = builder.state;
    sysLock = builder.sysLock;
  }

  /**
   * New builder.
   *
   * @return a Action builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Action name (unique for an account).
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Action description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the location.
   *
   * List of workspace locations supported by IBM Cloud Schematics service.  Note, this does not limit the location of
   * the resources provisioned using Schematics.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name for the Action.  By default, Action will be created in Default Resource Group.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the tags.
   *
   * Action tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the userState.
   *
   * User defined status of the Schematics object.
   *
   * @return the userState
   */
  public UserState userState() {
    return userState;
  }

  /**
   * Gets the sourceReadmeUrl.
   *
   * URL of the README file, for the source.
   *
   * @return the sourceReadmeUrl
   */
  public String sourceReadmeUrl() {
    return sourceReadmeUrl;
  }

  /**
   * Gets the source.
   *
   * Source of templates, playbooks, or controls.
   *
   * @return the source
   */
  public ExternalSource source() {
    return source;
  }

  /**
   * Gets the sourceType.
   *
   * Type of source for the Template.
   *
   * @return the sourceType
   */
  public String sourceType() {
    return sourceType;
  }

  /**
   * Gets the commandParameter.
   *
   * Schematics job command parameter (playbook-name, capsule-name or flow-name).
   *
   * @return the commandParameter
   */
  public String commandParameter() {
    return commandParameter;
  }

  /**
   * Gets the bastion.
   *
   * Complete Target details with user inputs and system generated data.
   *
   * @return the bastion
   */
  public TargetResourceset bastion() {
    return bastion;
  }

  /**
   * Gets the targets.
   *
   * Action targets.
   *
   * @return the targets
   */
  public List<TargetResourceset> targets() {
    return targets;
  }

  /**
   * Gets the inputs.
   *
   * Input variables for the Action.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the outputs.
   *
   * Output variables for the Action.
   *
   * @return the outputs
   */
  public List<VariableData> outputs() {
    return outputs;
  }

  /**
   * Gets the settings.
   *
   * Environment variables for the Action.
   *
   * @return the settings
   */
  public List<VariableData> settings() {
    return settings;
  }

  /**
   * Gets the triggerRecordId.
   *
   * Id to the Trigger.
   *
   * @return the triggerRecordId
   */
  public String triggerRecordId() {
    return triggerRecordId;
  }

  /**
   * Gets the id.
   *
   * Action Id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * Action Cloud Resource Name.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the account.
   *
   * Action account id.
   *
   * @return the account
   */
  public String account() {
    return account;
  }

  /**
   * Gets the sourceCreatedAt.
   *
   * Action Playbook Source creation time.
   *
   * @return the sourceCreatedAt
   */
  public Date sourceCreatedAt() {
    return sourceCreatedAt;
  }

  /**
   * Gets the sourceCreatedBy.
   *
   * Email address of user who created the Action Playbook Source.
   *
   * @return the sourceCreatedBy
   */
  public String sourceCreatedBy() {
    return sourceCreatedBy;
  }

  /**
   * Gets the sourceUpdatedAt.
   *
   * Action Playbook updation time.
   *
   * @return the sourceUpdatedAt
   */
  public Date sourceUpdatedAt() {
    return sourceUpdatedAt;
  }

  /**
   * Gets the sourceUpdatedBy.
   *
   * Email address of user who updated the Action Playbook Source.
   *
   * @return the sourceUpdatedBy
   */
  public String sourceUpdatedBy() {
    return sourceUpdatedBy;
  }

  /**
   * Gets the createdAt.
   *
   * Action creation time.
   *
   * @return the createdAt
   */
  public Date createdAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Email address of user who created the action.
   *
   * @return the createdBy
   */
  public String createdBy() {
    return createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Action updation time.
   *
   * @return the updatedAt
   */
  public Date updatedAt() {
    return updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * Email address of user who updated the action.
   *
   * @return the updatedBy
   */
  public String updatedBy() {
    return updatedBy;
  }

  /**
   * Gets the namespace.
   *
   * name of the namespace.
   *
   * @return the namespace
   */
  public String namespace() {
    return namespace;
  }

  /**
   * Gets the state.
   *
   * Computed state of the Action.
   *
   * @return the state
   */
  public ActionState state() {
    return state;
  }

  /**
   * Gets the playbookNames.
   *
   * Playbook names retrieved from repo.
   *
   * @return the playbookNames
   */
  public List<String> playbookNames() {
    return playbookNames;
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
}

