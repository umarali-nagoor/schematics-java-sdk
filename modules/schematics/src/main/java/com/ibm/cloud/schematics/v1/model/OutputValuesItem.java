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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * OutputValuesItem.
 */
public class OutputValuesItem extends GenericModel {

  protected String folder;
  protected String id;
  @SerializedName("output_values")
  protected List<Object> outputValues;
  @SerializedName("value_type")
  protected String valueType;

  /**
   * Gets the folder.
   *
   * Output variable name.
   *
   * @return the folder
   */
  public String getFolder() {
    return folder;
  }

  /**
   * Gets the id.
   *
   * Output variable id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the outputValues.
   *
   * List of Output values.
   *
   * @return the outputValues
   */
  public List<Object> getOutputValues() {
    return outputValues;
  }

  /**
   * Gets the valueType.
   *
   * Output variable type.
   *
   * @return the valueType
   */
  public String getValueType() {
    return valueType;
  }
}

