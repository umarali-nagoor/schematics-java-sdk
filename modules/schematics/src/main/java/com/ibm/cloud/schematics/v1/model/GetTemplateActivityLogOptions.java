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
 * The getTemplateActivityLog options.
 */
public class GetTemplateActivityLogOptions extends GenericModel {

  protected String wId;
  protected String tId;
  protected String activityId;
  protected Boolean logTfCmd;
  protected Boolean logTfPrefix;
  protected Boolean logTfNullResource;
  protected Boolean logTfAnsible;

  /**
   * Builder.
   */
  public static class Builder {
    private String wId;
    private String tId;
    private String activityId;
    private Boolean logTfCmd;
    private Boolean logTfPrefix;
    private Boolean logTfNullResource;
    private Boolean logTfAnsible;

    private Builder(GetTemplateActivityLogOptions getTemplateActivityLogOptions) {
      this.wId = getTemplateActivityLogOptions.wId;
      this.tId = getTemplateActivityLogOptions.tId;
      this.activityId = getTemplateActivityLogOptions.activityId;
      this.logTfCmd = getTemplateActivityLogOptions.logTfCmd;
      this.logTfPrefix = getTemplateActivityLogOptions.logTfPrefix;
      this.logTfNullResource = getTemplateActivityLogOptions.logTfNullResource;
      this.logTfAnsible = getTemplateActivityLogOptions.logTfAnsible;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param wId the wId
     * @param tId the tId
     * @param activityId the activityId
     */
    public Builder(String wId, String tId, String activityId) {
      this.wId = wId;
      this.tId = tId;
      this.activityId = activityId;
    }

    /**
     * Builds a GetTemplateActivityLogOptions.
     *
     * @return the new GetTemplateActivityLogOptions instance
     */
    public GetTemplateActivityLogOptions build() {
      return new GetTemplateActivityLogOptions(this);
    }

    /**
     * Set the wId.
     *
     * @param wId the wId
     * @return the GetTemplateActivityLogOptions builder
     */
    public Builder wId(String wId) {
      this.wId = wId;
      return this;
    }

    /**
     * Set the tId.
     *
     * @param tId the tId
     * @return the GetTemplateActivityLogOptions builder
     */
    public Builder tId(String tId) {
      this.tId = tId;
      return this;
    }

    /**
     * Set the activityId.
     *
     * @param activityId the activityId
     * @return the GetTemplateActivityLogOptions builder
     */
    public Builder activityId(String activityId) {
      this.activityId = activityId;
      return this;
    }

    /**
     * Set the logTfCmd.
     *
     * @param logTfCmd the logTfCmd
     * @return the GetTemplateActivityLogOptions builder
     */
    public Builder logTfCmd(Boolean logTfCmd) {
      this.logTfCmd = logTfCmd;
      return this;
    }

    /**
     * Set the logTfPrefix.
     *
     * @param logTfPrefix the logTfPrefix
     * @return the GetTemplateActivityLogOptions builder
     */
    public Builder logTfPrefix(Boolean logTfPrefix) {
      this.logTfPrefix = logTfPrefix;
      return this;
    }

    /**
     * Set the logTfNullResource.
     *
     * @param logTfNullResource the logTfNullResource
     * @return the GetTemplateActivityLogOptions builder
     */
    public Builder logTfNullResource(Boolean logTfNullResource) {
      this.logTfNullResource = logTfNullResource;
      return this;
    }

    /**
     * Set the logTfAnsible.
     *
     * @param logTfAnsible the logTfAnsible
     * @return the GetTemplateActivityLogOptions builder
     */
    public Builder logTfAnsible(Boolean logTfAnsible) {
      this.logTfAnsible = logTfAnsible;
      return this;
    }
  }

  protected GetTemplateActivityLogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.wId,
      "wId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.tId,
      "tId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.activityId,
      "activityId cannot be empty");
    wId = builder.wId;
    tId = builder.tId;
    activityId = builder.activityId;
    logTfCmd = builder.logTfCmd;
    logTfPrefix = builder.logTfPrefix;
    logTfNullResource = builder.logTfNullResource;
    logTfAnsible = builder.logTfAnsible;
  }

  /**
   * New builder.
   *
   * @return a GetTemplateActivityLogOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wId.
   *
   * The workspace ID for the workspace that you want to query.  You can run the GET /workspaces call if you need to
   * look up the  workspace IDs in your IBM Cloud account.
   *
   * @return the wId
   */
  public String wId() {
    return wId;
  }

  /**
   * Gets the tId.
   *
   * The Template ID for which you want to get the values.  Use the GET /workspaces to look up the workspace IDs  or
   * template IDs in your IBM Cloud account.
   *
   * @return the tId
   */
  public String tId() {
    return tId;
  }

  /**
   * Gets the activityId.
   *
   * The activity ID that you want to see additional details.
   *
   * @return the activityId
   */
  public String activityId() {
    return activityId;
  }

  /**
   * Gets the logTfCmd.
   *
   * `false` will hide the terraform command header in the logs.
   *
   * @return the logTfCmd
   */
  public Boolean logTfCmd() {
    return logTfCmd;
  }

  /**
   * Gets the logTfPrefix.
   *
   * `false` will hide all the terraform command prefix in the log statements.
   *
   * @return the logTfPrefix
   */
  public Boolean logTfPrefix() {
    return logTfPrefix;
  }

  /**
   * Gets the logTfNullResource.
   *
   * `false` will hide all the null resource prefix in the log statements.
   *
   * @return the logTfNullResource
   */
  public Boolean logTfNullResource() {
    return logTfNullResource;
  }

  /**
   * Gets the logTfAnsible.
   *
   * `true` will format all logs to withhold the original format  of ansible output in the log statements.
   *
   * @return the logTfAnsible
   */
  public Boolean logTfAnsible() {
    return logTfAnsible;
  }
}

