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
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Blueprint details with user inputs and system generated data.
 */
public class Blueprint extends GenericModel {

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
  @SerializedName("schema_version")
  protected String schemaVersion;
  protected ExternalSource source;
  protected List<BlueprintConfigItem> config;
  protected String description;
  @SerializedName("resource_group")
  protected String resourceGroup;
  protected List<String> tags;
  protected String location;
  protected List<VariableData> inputs;
  protected List<VariableData> settings;
  protected List<VariableData> outputs;
  protected List<BlueprintModule> modules;
  protected BlueprintFlow flow;
  @SerializedName("blueprint_id")
  protected String blueprintId;
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

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String schemaVersion;
    private ExternalSource source;
    private List<BlueprintConfigItem> config;
    private String description;
    private String resourceGroup;
    private List<String> tags;
    private String location;
    private List<VariableData> inputs;
    private List<VariableData> settings;
    private BlueprintFlow flow;
    private UserState userState;

    /**
     * Instantiates a new Builder from an existing Blueprint instance.
     *
     * @param blueprint the instance to initialize the Builder with
     */
    private Builder(Blueprint blueprint) {
      this.name = blueprint.name;
      this.schemaVersion = blueprint.schemaVersion;
      this.source = blueprint.source;
      this.config = blueprint.config;
      this.description = blueprint.description;
      this.resourceGroup = blueprint.resourceGroup;
      this.tags = blueprint.tags;
      this.location = blueprint.location;
      this.inputs = blueprint.inputs;
      this.settings = blueprint.settings;
      this.flow = blueprint.flow;
      this.userState = blueprint.userState;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     */
    public Builder(String name) {
      this.name = name;
    }

    /**
     * Builds a Blueprint.
     *
     * @return the new Blueprint instance
     */
    public Blueprint build() {
      return new Blueprint(this);
    }

    /**
     * Adds a new element to config.
     *
     * @param config the new element to be added
     * @return the Blueprint builder
     */
    public Builder addConfig(BlueprintConfigItem config) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(config,
        "config cannot be null");
      if (this.config == null) {
        this.config = new ArrayList<BlueprintConfigItem>();
      }
      this.config.add(config);
      return this;
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the Blueprint builder
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
     * Adds a new element to inputs.
     *
     * @param inputs the new element to be added
     * @return the Blueprint builder
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
     * Adds a new element to settings.
     *
     * @param settings the new element to be added
     * @return the Blueprint builder
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
     * @return the Blueprint builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the schemaVersion.
     *
     * @param schemaVersion the schemaVersion
     * @return the Blueprint builder
     */
    public Builder schemaVersion(String schemaVersion) {
      this.schemaVersion = schemaVersion;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the Blueprint builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the config.
     * Existing config will be replaced.
     *
     * @param config the config
     * @return the Blueprint builder
     */
    public Builder config(List<BlueprintConfigItem> config) {
      this.config = config;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the Blueprint builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the Blueprint builder
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
     * @return the Blueprint builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the Blueprint builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the Blueprint builder
     */
    public Builder inputs(List<VariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the settings.
     * Existing settings will be replaced.
     *
     * @param settings the settings
     * @return the Blueprint builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the flow.
     *
     * @param flow the flow
     * @return the Blueprint builder
     */
    public Builder flow(BlueprintFlow flow) {
      this.flow = flow;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the Blueprint builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }
  }

  protected Blueprint() { }

  protected Blueprint(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    name = builder.name;
    schemaVersion = builder.schemaVersion;
    source = builder.source;
    config = builder.config;
    description = builder.description;
    resourceGroup = builder.resourceGroup;
    tags = builder.tags;
    location = builder.location;
    inputs = builder.inputs;
    settings = builder.settings;
    flow = builder.flow;
    userState = builder.userState;
  }

  /**
   * New builder.
   *
   * @return a Blueprint builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Blueprint name (unique for an account).
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the schemaVersion.
   *
   * Schema version.
   *
   * @return the schemaVersion
   */
  public String schemaVersion() {
    return schemaVersion;
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
   * Gets the config.
   *
   * Blueprint input configuration definition.
   *
   * @return the config
   */
  public List<BlueprintConfigItem> config() {
    return config;
  }

  /**
   * Gets the description.
   *
   * Blueprint description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name for the blueprint.  By default, blueprint will be created in Default Resource Group.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the tags.
   *
   * Blueprint instance tags.
   *
   * @return the tags
   */
  public List<String> tags() {
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
  public String location() {
    return location;
  }

  /**
   * Gets the inputs.
   *
   * Additional inputs configuration for the blueprint.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the settings.
   *
   * Input environemnt settings for blueprint.
   *
   * @return the settings
   */
  public List<VariableData> settings() {
    return settings;
  }

  /**
   * Gets the outputs.
   *
   * Output variables for the blueprint.
   *
   * @return the outputs
   */
  public List<VariableData> outputs() {
    return outputs;
  }

  /**
   * Gets the modules.
   *
   * Components of the blueprint.
   *
   * @return the modules
   */
  public List<BlueprintModule> modules() {
    return modules;
  }

  /**
   * Gets the flow.
   *
   * Flow definitions for all the blueprint command.
   *
   * @return the flow
   */
  public BlueprintFlow flow() {
    return flow;
  }

  /**
   * Gets the blueprintId.
   *
   * System generated blueprint Id.
   *
   * @return the blueprintId
   */
  public String blueprintId() {
    return blueprintId;
  }

  /**
   * Gets the crn.
   *
   * Blueprint CRN.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the account.
   *
   * Account id.
   *
   * @return the account
   */
  public String account() {
    return account;
  }

  /**
   * Gets the createdAt.
   *
   * Blueprint creation time.
   *
   * @return the createdAt
   */
  public Date createdAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * User who created the blueprint.
   *
   * @return the createdBy
   */
  public String createdBy() {
    return createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * Blueprint updation time.
   *
   * @return the updatedAt
   */
  public Date updatedAt() {
    return updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * User who updated the blueprint.
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
   * Gets the state.
   *
   * Computed state of the blueprint.
   *
   * @return the state
   */
  public BlueprintLiteState state() {
    return state;
  }
}

