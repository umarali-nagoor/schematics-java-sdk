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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceBlueprint options.
 */
public class ReplaceBlueprintOptions extends GenericModel {

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

  /**
   * Level of details returned by the get method.
   */
  public interface Profile {
    /** ids. */
    String IDS = "ids";
    /** summary. */
    String SUMMARY = "summary";
  }

  protected String blueprintId;
  protected String name;
  protected String schemaVersion;
  protected ExternalSource source;
  protected List<BlueprintConfigItem> config;
  protected String description;
  protected String resourceGroup;
  protected List<String> tags;
  protected String location;
  protected List<VariableData> inputs;
  protected List<VariableData> settings;
  protected BlueprintFlow flow;
  protected UserState userState;
  protected String profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String blueprintId;
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
    private String profile;

    /**
     * Instantiates a new Builder from an existing ReplaceBlueprintOptions instance.
     *
     * @param replaceBlueprintOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceBlueprintOptions replaceBlueprintOptions) {
      this.blueprintId = replaceBlueprintOptions.blueprintId;
      this.name = replaceBlueprintOptions.name;
      this.schemaVersion = replaceBlueprintOptions.schemaVersion;
      this.source = replaceBlueprintOptions.source;
      this.config = replaceBlueprintOptions.config;
      this.description = replaceBlueprintOptions.description;
      this.resourceGroup = replaceBlueprintOptions.resourceGroup;
      this.tags = replaceBlueprintOptions.tags;
      this.location = replaceBlueprintOptions.location;
      this.inputs = replaceBlueprintOptions.inputs;
      this.settings = replaceBlueprintOptions.settings;
      this.flow = replaceBlueprintOptions.flow;
      this.userState = replaceBlueprintOptions.userState;
      this.profile = replaceBlueprintOptions.profile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param blueprintId the blueprintId
     * @param name the name
     */
    public Builder(String blueprintId, String name) {
      this.blueprintId = blueprintId;
      this.name = name;
    }

    /**
     * Builds a ReplaceBlueprintOptions.
     *
     * @return the new ReplaceBlueprintOptions instance
     */
    public ReplaceBlueprintOptions build() {
      return new ReplaceBlueprintOptions(this);
    }

    /**
     * Adds a new element to config.
     *
     * @param config the new element to be added
     * @return the ReplaceBlueprintOptions builder
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
     * @return the ReplaceBlueprintOptions builder
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
     * @return the ReplaceBlueprintOptions builder
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
     * @return the ReplaceBlueprintOptions builder
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
     * Set the blueprintId.
     *
     * @param blueprintId the blueprintId
     * @return the ReplaceBlueprintOptions builder
     */
    public Builder blueprintId(String blueprintId) {
      this.blueprintId = blueprintId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ReplaceBlueprintOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the schemaVersion.
     *
     * @param schemaVersion the schemaVersion
     * @return the ReplaceBlueprintOptions builder
     */
    public Builder schemaVersion(String schemaVersion) {
      this.schemaVersion = schemaVersion;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the ReplaceBlueprintOptions builder
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
     * @return the ReplaceBlueprintOptions builder
     */
    public Builder config(List<BlueprintConfigItem> config) {
      this.config = config;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the ReplaceBlueprintOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the ReplaceBlueprintOptions builder
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
     * @return the ReplaceBlueprintOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the ReplaceBlueprintOptions builder
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
     * @return the ReplaceBlueprintOptions builder
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
     * @return the ReplaceBlueprintOptions builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the flow.
     *
     * @param flow the flow
     * @return the ReplaceBlueprintOptions builder
     */
    public Builder flow(BlueprintFlow flow) {
      this.flow = flow;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the ReplaceBlueprintOptions builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the ReplaceBlueprintOptions builder
     */
    public Builder profile(String profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the blueprint.
     *
     * @param blueprint the blueprint
     * @return the ReplaceBlueprintOptions builder
     */
    public Builder blueprint(Blueprint blueprint) {
      this.name = blueprint.name();
      this.schemaVersion = blueprint.schemaVersion();
      this.source = blueprint.source();
      this.config = blueprint.config();
      this.description = blueprint.description();
      this.resourceGroup = blueprint.resourceGroup();
      this.tags = blueprint.tags();
      this.location = blueprint.location();
      this.inputs = blueprint.inputs();
      this.settings = blueprint.settings();
      this.flow = blueprint.flow();
      this.userState = blueprint.userState();
      return this;
    }
  }

  protected ReplaceBlueprintOptions() { }

  protected ReplaceBlueprintOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.blueprintId,
      "blueprintId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    blueprintId = builder.blueprintId;
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
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a ReplaceBlueprintOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the blueprintId.
   *
   * Environment Id.  Use `GET /v2/blueprints` API to look up the order ids in your IBM Cloud account.
   *
   * @return the blueprintId
   */
  public String blueprintId() {
    return blueprintId;
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

