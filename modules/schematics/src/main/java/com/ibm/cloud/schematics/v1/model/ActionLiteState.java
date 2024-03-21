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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Computed state of the Action.
 */
public class ActionLiteState extends GenericModel {

  /**
   * Status of automation (workspace or action).
   */
  public interface StatusCode {
    /** normal. */
    String NORMAL = "normal";
    /** pending. */
    String PENDING = "pending";
    /** disabled. */
    String DISABLED = "disabled";
    /** critical. */
    String CRITICAL = "critical";
  }

  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_message")
  protected String statusMessage;

  protected ActionLiteState() { }

  /**
   * Gets the statusCode.
   *
   * Status of automation (workspace or action).
   *
   * @return the statusCode
   */
  public String getStatusCode() {
    return statusCode;
  }

  /**
   * Gets the statusMessage.
   *
   * Automation status message - to be displayed along with the status_code.
   *
   * @return the statusMessage
   */
  public String getStatusMessage() {
    return statusMessage;
  }
}

