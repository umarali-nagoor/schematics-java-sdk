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
 * Blueprint configuration item.
 */
public class BlueprintConfigItem extends GenericModel {

  protected String name;
  protected String description;
  protected ExternalSource source;
  protected List<VariableData> inputs;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private ExternalSource source;
    private List<VariableData> inputs;

    /**
     * Instantiates a new Builder from an existing BlueprintConfigItem instance.
     *
     * @param blueprintConfigItem the instance to initialize the Builder with
     */
    private Builder(BlueprintConfigItem blueprintConfigItem) {
      this.name = blueprintConfigItem.name;
      this.description = blueprintConfigItem.description;
      this.source = blueprintConfigItem.source;
      this.inputs = blueprintConfigItem.inputs;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BlueprintConfigItem.
     *
     * @return the new BlueprintConfigItem instance
     */
    public BlueprintConfigItem build() {
      return new BlueprintConfigItem(this);
    }

    /**
     * Adds a new element to inputs.
     *
     * @param inputs the new element to be added
     * @return the BlueprintConfigItem builder
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
     * Set the name.
     *
     * @param name the name
     * @return the BlueprintConfigItem builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the BlueprintConfigItem builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the BlueprintConfigItem builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the BlueprintConfigItem builder
     */
    public Builder inputs(List<VariableData> inputs) {
      this.inputs = inputs;
      return this;
    }
  }

  protected BlueprintConfigItem() { }

  protected BlueprintConfigItem(Builder builder) {
    name = builder.name;
    description = builder.description;
    source = builder.source;
    inputs = builder.inputs;
  }

  /**
   * New builder.
   *
   * @return a BlueprintConfigItem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the blueprint configuration item.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Description for the blueprint configuration item.
   *
   * @return the description
   */
  public String description() {
    return description;
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
   * Gets the inputs.
   *
   * Input variables and values for the blueprint configuration item.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }
}

