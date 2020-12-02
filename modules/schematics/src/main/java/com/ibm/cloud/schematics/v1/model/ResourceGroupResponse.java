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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ResourceGroupResponse -.
 */
public class ResourceGroupResponse extends GenericModel {

  @SerializedName("account_id")
  protected String accountId;
  protected String crn;
  @SerializedName("default")
  protected Boolean xDefault;
  protected String name;
  @SerializedName("resource_group_id")
  protected String resourceGroupId;
  protected String state;

  /**
   * Gets the accountId.
   *
   * Account id.
   *
   * @return the accountId
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * Gets the crn.
   *
   * CRN.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the xDefault.
   *
   * default.
   *
   * @return the xDefault
   */
  public Boolean isXDefault() {
    return xDefault;
  }

  /**
   * Gets the name.
   *
   * Resource group name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroupId.
   *
   * Resource group id.
   *
   * @return the resourceGroupId
   */
  public String getResourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Gets the state.
   *
   * Resource group state.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }
}

