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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The description of your input variable.
 */
public class WorkspaceVariableResponse extends GenericModel {

  protected String description;
  protected String name;
  protected Boolean secure;
  protected String type;
  protected String value;

  protected WorkspaceVariableResponse() { }

  /**
   * Gets the description.
   *
   * The description of your input variable.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the name.
   *
   * The name of the variable.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the secure.
   *
   * If set to `true`, the value of your input variable is protected and not returned in your API response.
   *
   * @return the secure
   */
  public Boolean isSecure() {
    return secure;
  }

  /**
   * Gets the type.
   *
   * `Terraform v0.11` supports `string`, `list`, `map` data type. For more information, about the syntax, see
   * [Configuring input variables](https://www.terraform.io/docs/configuration-0-11/variables.html).
   * &lt;br&gt; `Terraform v0.12` additionally, supports `bool`, `number` and complex data types such as `list(type)`,
   * `map(type)`,
   * `object({attribute name=type,..})`, `set(type)`, `tuple([type])`. For more information, about the syntax to use the
   * complex data type, see [Configuring
   * variables](https://www.terraform.io/docs/configuration/variables.html#type-constraints).
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the value.
   *
   * Enter the value as a string for the primitive types such as `bool`, `number`, `string`, and `HCL` format for the
   * complex variables, as you provide in a `.tfvars` file. **You need to enter escaped string of `HCL` format for the
   * complex variable value**. For more information, about how to declare variables in a terraform configuration file
   * and provide value to schematics, see [Providing values for the declared
   * variables](https://cloud.ibm.com/docs/schematics?topic=schematics-create-tf-config#declare-variable).
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

