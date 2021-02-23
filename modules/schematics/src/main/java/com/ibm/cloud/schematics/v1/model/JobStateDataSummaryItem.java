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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * JobStateDataSummaryItem.
 */
public class JobStateDataSummaryItem extends GenericModel {

  /**
   * State summary feature type.
   */
  public interface Type {
    /** number. */
    String NUMBER = "number";
    /** string. */
    String STRING = "string";
  }

  protected String name;
  protected String type;
  protected String value;

  /**
   * Gets the name.
   *
   * State summary feature name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the type.
   *
   * State summary feature type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the value.
   *
   * State summary feature value.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }
}

