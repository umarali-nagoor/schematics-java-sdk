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
 * Component for the Blueprint.
 */
public class BlueprintModule extends GenericModel {

  /**
   * Name of the Schematics automation resource.
   */
  public interface ModuleType {
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

  @SerializedName("module_id")
  protected String moduleId;
  @SerializedName("module_type")
  protected String moduleType;
  protected String name;
  protected String layer;
  protected ExternalSource source;
  protected List<InjectTerraformTemplateInner> injectors;
  protected String tags;
  protected String description;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;
  protected List<String> version;
  protected String status;
  protected String location;
  protected List<VariableData> inputs;
  protected List<VariableData> settings;
  protected Boolean updated;
  protected Boolean deleted;
  protected List<BlueprintVariableData> outputs;
  @SerializedName("last_job")
  protected BlueprintModuleLastJob lastJob;

  /**
   * Builder.
   */
  public static class Builder {
    private String moduleType;
    private ExternalSource source;
    private List<InjectTerraformTemplateInner> injectors;
    private String description;
    private List<String> version;

    /**
     * Instantiates a new Builder from an existing BlueprintModule instance.
     *
     * @param blueprintModule the instance to initialize the Builder with
     */
    private Builder(BlueprintModule blueprintModule) {
      this.moduleType = blueprintModule.moduleType;
      this.source = blueprintModule.source;
      this.injectors = blueprintModule.injectors;
      this.description = blueprintModule.description;
      this.version = blueprintModule.version;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BlueprintModule.
     *
     * @return the new BlueprintModule instance
     */
    public BlueprintModule build() {
      return new BlueprintModule(this);
    }

    /**
     * Adds a new element to injectors.
     *
     * @param injectors the new element to be added
     * @return the BlueprintModule builder
     */
    public Builder addInjectors(InjectTerraformTemplateInner injectors) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(injectors,
        "injectors cannot be null");
      if (this.injectors == null) {
        this.injectors = new ArrayList<InjectTerraformTemplateInner>();
      }
      this.injectors.add(injectors);
      return this;
    }

    /**
     * Adds a new element to version.
     *
     * @param version the new element to be added
     * @return the BlueprintModule builder
     */
    public Builder addVersion(String version) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(version,
        "version cannot be null");
      if (this.version == null) {
        this.version = new ArrayList<String>();
      }
      this.version.add(version);
      return this;
    }

    /**
     * Set the moduleType.
     *
     * @param moduleType the moduleType
     * @return the BlueprintModule builder
     */
    public Builder moduleType(String moduleType) {
      this.moduleType = moduleType;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the BlueprintModule builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the injectors.
     * Existing injectors will be replaced.
     *
     * @param injectors the injectors
     * @return the BlueprintModule builder
     */
    public Builder injectors(List<InjectTerraformTemplateInner> injectors) {
      this.injectors = injectors;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the BlueprintModule builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the version.
     * Existing version will be replaced.
     *
     * @param version the version
     * @return the BlueprintModule builder
     */
    public Builder version(List<String> version) {
      this.version = version;
      return this;
    }
  }

  protected BlueprintModule() { }

  protected BlueprintModule(Builder builder) {
    moduleType = builder.moduleType;
    source = builder.source;
    injectors = builder.injectors;
    description = builder.description;
    version = builder.version;
  }

  /**
   * New builder.
   *
   * @return a BlueprintModule builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the moduleId.
   *
   * Module id.
   *
   * @return the moduleId
   */
  public String moduleId() {
    return moduleId;
  }

  /**
   * Gets the moduleType.
   *
   * Name of the Schematics automation resource.
   *
   * @return the moduleType
   */
  public String moduleType() {
    return moduleType;
  }

  /**
   * Gets the name.
   *
   * Name of the module.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the layer.
   *
   * Layer for the module.
   *
   * @return the layer
   */
  public String layer() {
    return layer;
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
   * Gets the injectors.
   *
   * Array of injectable terraform blocks.
   *
   * @return the injectors
   */
  public List<InjectTerraformTemplateInner> injectors() {
    return injectors;
  }

  /**
   * Gets the tags.
   *
   * Tags used by the module.
   *
   * @return the tags
   */
  public String tags() {
    return tags;
  }

  /**
   * Gets the description.
   *
   * The description of the module.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the createdAt.
   *
   * The timestamp when the module was created.
   *
   * @return the createdAt
   */
  public Date createdAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * The user ID that created the module.
   *
   * @return the createdBy
   */
  public String createdBy() {
    return createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * The timestamp when the module was updated.
   *
   * @return the updatedAt
   */
  public Date updatedAt() {
    return updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * The user ID that updated the module.
   *
   * @return the updatedBy
   */
  public String updatedBy() {
    return updatedBy;
  }

  /**
   * Gets the version.
   *
   * The Terraform version of the module that was used to run your Terraform code.
   *
   * @return the version
   */
  public List<String> version() {
    return version;
  }

  /**
   * Gets the status.
   *
   * Status of the module.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the location.
   *
   * Location of the module.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the inputs.
   *
   * Inputs used by the module.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the settings.
   *
   * Environment settings for the module.
   *
   * @return the settings
   */
  public List<VariableData> settings() {
    return settings;
  }

  /**
   * Gets the updated.
   *
   * True, when the blueprint module settings is updated or changed.
   *
   * @return the updated
   */
  public Boolean updated() {
    return updated;
  }

  /**
   * Gets the deleted.
   *
   * True, when there are deletions in the blueprint module settings.
   *
   * @return the deleted
   */
  public Boolean deleted() {
    return deleted;
  }

  /**
   * Gets the outputs.
   *
   * Outputs from the module.
   *
   * @return the outputs
   */
  public List<BlueprintVariableData> outputs() {
    return outputs;
  }

  /**
   * Gets the lastJob.
   *
   * Status of the last job executed by the module.
   *
   * @return the lastJob
   */
  public BlueprintModuleLastJob lastJob() {
    return lastJob;
  }
}

