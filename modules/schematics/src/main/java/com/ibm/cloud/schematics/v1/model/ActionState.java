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
public class ActionState extends GenericModel {

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
  @SerializedName("status_job_id")
  protected String statusJobId;
  @SerializedName("status_message")
  protected String statusMessage;

  /**
   * Builder.
   */
  public static class Builder {
    private String statusCode;
    private String statusJobId;
    private String statusMessage;

    /**
     * Instantiates a new Builder from an existing ActionState instance.
     *
     * @param actionState the instance to initialize the Builder with
     */
    private Builder(ActionState actionState) {
      this.statusCode = actionState.statusCode;
      this.statusJobId = actionState.statusJobId;
      this.statusMessage = actionState.statusMessage;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ActionState.
     *
     * @return the new ActionState instance
     */
    public ActionState build() {
      return new ActionState(this);
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the ActionState builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusJobId.
     *
     * @param statusJobId the statusJobId
     * @return the ActionState builder
     */
    public Builder statusJobId(String statusJobId) {
      this.statusJobId = statusJobId;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the ActionState builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }
  }

  protected ActionState() { }

  protected ActionState(Builder builder) {
    statusCode = builder.statusCode;
    statusJobId = builder.statusJobId;
    statusMessage = builder.statusMessage;
  }

  /**
   * New builder.
   *
   * @return a ActionState builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the statusCode.
   *
   * Status of automation (workspace or action).
   *
   * @return the statusCode
   */
  public String statusCode() {
    return statusCode;
  }

  /**
   * Gets the statusJobId.
   *
   * Job id reference for this status.
   *
   * @return the statusJobId
   */
  public String statusJobId() {
    return statusJobId;
  }

  /**
   * Gets the statusMessage.
   *
   * Automation status message - to be displayed along with the status_code.
   *
   * @return the statusMessage
   */
  public String statusMessage() {
    return statusMessage;
  }
}

