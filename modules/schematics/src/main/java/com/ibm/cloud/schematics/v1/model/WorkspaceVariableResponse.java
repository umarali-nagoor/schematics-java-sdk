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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * WorkspaceVariableResponse -.
 */
public class WorkspaceVariableResponse extends GenericModel {

  protected String description;
  protected String name;
  protected Boolean secure;
  protected String type;
  protected String value;

  /**
   * Gets the description.
   *
   * Variable descrption.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the name.
   *
   * Variable name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the secure.
   *
   * Variable is secure.
   *
   * @return the secure
   */
  public Boolean isSecure() {
    return secure;
  }

  /**
   * Gets the type.
   *
   * Variable type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the value.
   *
   * Value of the Variable.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

