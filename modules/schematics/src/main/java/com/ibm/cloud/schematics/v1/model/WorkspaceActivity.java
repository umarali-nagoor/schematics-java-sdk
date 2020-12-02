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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * WorkspaceActivity -.
 */
public class WorkspaceActivity extends GenericModel {

  @SerializedName("action_id")
  protected String actionId;
  protected List<String> message;
  protected String name;
  @SerializedName("performed_at")
  protected Date performedAt;
  @SerializedName("performed_by")
  protected String performedBy;
  protected String status;
  protected List<WorkspaceActivityTemplate> templates;

  /**
   * Gets the actionId.
   *
   * Activity id.
   *
   * @return the actionId
   */
  public String getActionId() {
    return actionId;
  }

  /**
   * Gets the message.
   *
   * StatusMessages -.
   *
   * @return the message
   */
  public List<String> getMessage() {
    return message;
  }

  /**
   * Gets the name.
   *
   * WorkspaceActivityAction activity action type.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the performedAt.
   *
   * Activity performed at.
   *
   * @return the performedAt
   */
  public Date getPerformedAt() {
    return performedAt;
  }

  /**
   * Gets the performedBy.
   *
   * Activity performed by.
   *
   * @return the performedBy
   */
  public String getPerformedBy() {
    return performedBy;
  }

  /**
   * Gets the status.
   *
   * WorkspaceActivityStatus activity status type.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the templates.
   *
   * List of template activities.
   *
   * @return the templates
   */
  public List<WorkspaceActivityTemplate> getTemplates() {
    return templates;
  }
}

