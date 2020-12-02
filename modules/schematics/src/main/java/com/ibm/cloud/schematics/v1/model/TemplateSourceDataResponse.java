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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * TemplateSourceDataResponse -.
 */
public class TemplateSourceDataResponse extends GenericModel {

  @SerializedName("env_values")
  protected List<EnvVariableResponse> envValues;
  protected String folder;
  @SerializedName("has_githubtoken")
  protected Boolean hasGithubtoken;
  protected String id;
  @SerializedName("template_type")
  protected String templateType;
  @SerializedName("uninstall_script_name")
  protected String uninstallScriptName;
  protected String values;
  @SerializedName("values_metadata")
  protected List<Object> valuesMetadata;
  @SerializedName("values_url")
  protected String valuesUrl;
  protected List<WorkspaceVariableResponse> variablestore;

  /**
   * Gets the envValues.
   *
   * List of environment values.
   *
   * @return the envValues
   */
  public List<EnvVariableResponse> getEnvValues() {
    return envValues;
  }

  /**
   * Gets the folder.
   *
   * Folder name.
   *
   * @return the folder
   */
  public String getFolder() {
    return folder;
  }

  /**
   * Gets the hasGithubtoken.
   *
   * Has github token.
   *
   * @return the hasGithubtoken
   */
  public Boolean isHasGithubtoken() {
    return hasGithubtoken;
  }

  /**
   * Gets the id.
   *
   * Template id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the templateType.
   *
   * Template tyoe.
   *
   * @return the templateType
   */
  public String getTemplateType() {
    return templateType;
  }

  /**
   * Gets the uninstallScriptName.
   *
   * Uninstall script name.
   *
   * @return the uninstallScriptName
   */
  public String getUninstallScriptName() {
    return uninstallScriptName;
  }

  /**
   * Gets the values.
   *
   * Values.
   *
   * @return the values
   */
  public String getValues() {
    return values;
  }

  /**
   * Gets the valuesMetadata.
   *
   * List of values metadata.
   *
   * @return the valuesMetadata
   */
  public List<Object> getValuesMetadata() {
    return valuesMetadata;
  }

  /**
   * Gets the valuesUrl.
   *
   * Values URL.
   *
   * @return the valuesUrl
   */
  public String getValuesUrl() {
    return valuesUrl;
  }

  /**
   * Gets the variablestore.
   *
   * VariablesResponse -.
   *
   * @return the variablestore
   */
  public List<WorkspaceVariableResponse> getVariablestore() {
    return variablestore;
  }
}

