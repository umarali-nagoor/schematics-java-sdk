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
 * LogSummary ...
 */
public class LogSummary extends GenericModel {

  @SerializedName("activity_status")
  protected String activityStatus;
  @SerializedName("detected_template_type")
  protected String detectedTemplateType;
  @SerializedName("discarded_files")
  protected Long discardedFiles;
  protected String error;
  @SerializedName("resources_added")
  protected Long resourcesAdded;
  @SerializedName("resources_destroyed")
  protected Long resourcesDestroyed;
  @SerializedName("resources_modified")
  protected Long resourcesModified;
  @SerializedName("scanned_files")
  protected Long scannedFiles;
  @SerializedName("template_variable_count")
  protected Long templateVariableCount;
  @SerializedName("time_taken")
  protected Double timeTaken;

  /**
   * Gets the activityStatus.
   *
   * WorkspaceActivityStatus activity status type.
   *
   * @return the activityStatus
   */
  public String getActivityStatus() {
    return activityStatus;
  }

  /**
   * Gets the detectedTemplateType.
   *
   * Template detected type.
   *
   * @return the detectedTemplateType
   */
  public String getDetectedTemplateType() {
    return detectedTemplateType;
  }

  /**
   * Gets the discardedFiles.
   *
   * Numner of discarded files.
   *
   * @return the discardedFiles
   */
  public Long getDiscardedFiles() {
    return discardedFiles;
  }

  /**
   * Gets the error.
   *
   * Numner of errors in log.
   *
   * @return the error
   */
  public String getError() {
    return error;
  }

  /**
   * Gets the resourcesAdded.
   *
   * Numner of resources added.
   *
   * @return the resourcesAdded
   */
  public Long getResourcesAdded() {
    return resourcesAdded;
  }

  /**
   * Gets the resourcesDestroyed.
   *
   * Numner of resources destroyed.
   *
   * @return the resourcesDestroyed
   */
  public Long getResourcesDestroyed() {
    return resourcesDestroyed;
  }

  /**
   * Gets the resourcesModified.
   *
   * Numner of resources modified.
   *
   * @return the resourcesModified
   */
  public Long getResourcesModified() {
    return resourcesModified;
  }

  /**
   * Gets the scannedFiles.
   *
   * Numner of filed scanned.
   *
   * @return the scannedFiles
   */
  public Long getScannedFiles() {
    return scannedFiles;
  }

  /**
   * Gets the templateVariableCount.
   *
   * Numner of template variables.
   *
   * @return the templateVariableCount
   */
  public Long getTemplateVariableCount() {
    return templateVariableCount;
  }

  /**
   * Gets the timeTaken.
   *
   * Time takemn to perform activity.
   *
   * @return the timeTaken
   */
  public Double getTimeTaken() {
    return timeTaken;
  }
}

