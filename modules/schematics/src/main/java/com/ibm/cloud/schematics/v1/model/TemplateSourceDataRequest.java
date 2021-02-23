/*
 * (C) Copyright IBM Corp. 2021.
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
 * TemplateSourceDataRequest -.
 */
public class TemplateSourceDataRequest extends GenericModel {

  @SerializedName("env_values")
  protected List<Object> envValues;
  protected String folder;
  @SerializedName("init_state_file")
  protected String initStateFile;
  protected String type;
  @SerializedName("uninstall_script_name")
  protected String uninstallScriptName;
  protected String values;
  @SerializedName("values_metadata")
  protected List<Object> valuesMetadata;
  protected List<WorkspaceVariableRequest> variablestore;

  /**
   * Builder.
   */
  public static class Builder {
    private List<Object> envValues;
    private String folder;
    private String initStateFile;
    private String type;
    private String uninstallScriptName;
    private String values;
    private List<Object> valuesMetadata;
    private List<WorkspaceVariableRequest> variablestore;

    private Builder(TemplateSourceDataRequest templateSourceDataRequest) {
      this.envValues = templateSourceDataRequest.envValues;
      this.folder = templateSourceDataRequest.folder;
      this.initStateFile = templateSourceDataRequest.initStateFile;
      this.type = templateSourceDataRequest.type;
      this.uninstallScriptName = templateSourceDataRequest.uninstallScriptName;
      this.values = templateSourceDataRequest.values;
      this.valuesMetadata = templateSourceDataRequest.valuesMetadata;
      this.variablestore = templateSourceDataRequest.variablestore;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TemplateSourceDataRequest.
     *
     * @return the new TemplateSourceDataRequest instance
     */
    public TemplateSourceDataRequest build() {
      return new TemplateSourceDataRequest(this);
    }

    /**
     * Adds an envValues to envValues.
     *
     * @param envValues the new envValues
     * @return the TemplateSourceDataRequest builder
     */
    public Builder addEnvValues(Object envValues) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(envValues,
        "envValues cannot be null");
      if (this.envValues == null) {
        this.envValues = new ArrayList<Object>();
      }
      this.envValues.add(envValues);
      return this;
    }

    /**
     * Adds an valuesMetadata to valuesMetadata.
     *
     * @param valuesMetadata the new valuesMetadata
     * @return the TemplateSourceDataRequest builder
     */
    public Builder addValuesMetadata(Object valuesMetadata) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(valuesMetadata,
        "valuesMetadata cannot be null");
      if (this.valuesMetadata == null) {
        this.valuesMetadata = new ArrayList<Object>();
      }
      this.valuesMetadata.add(valuesMetadata);
      return this;
    }

    /**
     * Adds an variablestore to variablestore.
     *
     * @param variablestore the new variablestore
     * @return the TemplateSourceDataRequest builder
     */
    public Builder addVariablestore(WorkspaceVariableRequest variablestore) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(variablestore,
        "variablestore cannot be null");
      if (this.variablestore == null) {
        this.variablestore = new ArrayList<WorkspaceVariableRequest>();
      }
      this.variablestore.add(variablestore);
      return this;
    }

    /**
     * Set the envValues.
     * Existing envValues will be replaced.
     *
     * @param envValues the envValues
     * @return the TemplateSourceDataRequest builder
     */
    public Builder envValues(List<Object> envValues) {
      this.envValues = envValues;
      return this;
    }

    /**
     * Set the folder.
     *
     * @param folder the folder
     * @return the TemplateSourceDataRequest builder
     */
    public Builder folder(String folder) {
      this.folder = folder;
      return this;
    }

    /**
     * Set the initStateFile.
     *
     * @param initStateFile the initStateFile
     * @return the TemplateSourceDataRequest builder
     */
    public Builder initStateFile(String initStateFile) {
      this.initStateFile = initStateFile;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the TemplateSourceDataRequest builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the uninstallScriptName.
     *
     * @param uninstallScriptName the uninstallScriptName
     * @return the TemplateSourceDataRequest builder
     */
    public Builder uninstallScriptName(String uninstallScriptName) {
      this.uninstallScriptName = uninstallScriptName;
      return this;
    }

    /**
     * Set the values.
     *
     * @param values the values
     * @return the TemplateSourceDataRequest builder
     */
    public Builder values(String values) {
      this.values = values;
      return this;
    }

    /**
     * Set the valuesMetadata.
     * Existing valuesMetadata will be replaced.
     *
     * @param valuesMetadata the valuesMetadata
     * @return the TemplateSourceDataRequest builder
     */
    public Builder valuesMetadata(List<Object> valuesMetadata) {
      this.valuesMetadata = valuesMetadata;
      return this;
    }

    /**
     * Set the variablestore.
     * Existing variablestore will be replaced.
     *
     * @param variablestore the variablestore
     * @return the TemplateSourceDataRequest builder
     */
    public Builder variablestore(List<WorkspaceVariableRequest> variablestore) {
      this.variablestore = variablestore;
      return this;
    }
  }

  protected TemplateSourceDataRequest(Builder builder) {
    envValues = builder.envValues;
    folder = builder.folder;
    initStateFile = builder.initStateFile;
    type = builder.type;
    uninstallScriptName = builder.uninstallScriptName;
    values = builder.values;
    valuesMetadata = builder.valuesMetadata;
    variablestore = builder.variablestore;
  }

  /**
   * New builder.
   *
   * @return a TemplateSourceDataRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the envValues.
   *
   * EnvVariableRequest ..
   *
   * @return the envValues
   */
  public List<Object> envValues() {
    return envValues;
  }

  /**
   * Gets the folder.
   *
   * Folder name.
   *
   * @return the folder
   */
  public String folder() {
    return folder;
  }

  /**
   * Gets the initStateFile.
   *
   * Init state file.
   *
   * @return the initStateFile
   */
  public String initStateFile() {
    return initStateFile;
  }

  /**
   * Gets the type.
   *
   * Template type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the uninstallScriptName.
   *
   * Uninstall script name.
   *
   * @return the uninstallScriptName
   */
  public String uninstallScriptName() {
    return uninstallScriptName;
  }

  /**
   * Gets the values.
   *
   * Value.
   *
   * @return the values
   */
  public String values() {
    return values;
  }

  /**
   * Gets the valuesMetadata.
   *
   * List of values metadata.
   *
   * @return the valuesMetadata
   */
  public List<Object> valuesMetadata() {
    return valuesMetadata;
  }

  /**
   * Gets the variablestore.
   *
   * VariablesRequest -.
   *
   * @return the variablestore
   */
  public List<WorkspaceVariableRequest> variablestore() {
    return variablestore;
  }
}

