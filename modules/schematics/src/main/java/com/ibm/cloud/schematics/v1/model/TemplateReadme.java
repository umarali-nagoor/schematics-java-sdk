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
 * The `README.md` file for the template used by the workspace.
 */
public class TemplateReadme extends GenericModel {

  protected String readme;

  protected TemplateReadme() { }

  /**
   * Gets the readme.
   *
   * The `README.md` file for the template used by the workspace.
   *
   * @return the readme
   */
  public String getReadme() {
    return readme;
  }
}

