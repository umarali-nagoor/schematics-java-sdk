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
 * Response after uploading Template in tar file format.
 */
public class TemplateRepoTarUploadResponse extends GenericModel {

  @SerializedName("file_value")
  protected String fileValue;
  @SerializedName("has_received_file")
  protected Boolean hasReceivedFile;
  protected String id;

  protected TemplateRepoTarUploadResponse() { }

  /**
   * Gets the fileValue.
   *
   * Tar file value.
   *
   * @return the fileValue
   */
  public String getFileValue() {
    return fileValue;
  }

  /**
   * Gets the hasReceivedFile.
   *
   * Has received tar file?.
   *
   * @return the hasReceivedFile
   */
  public Boolean isHasReceivedFile() {
    return hasReceivedFile;
  }

  /**
   * Gets the id.
   *
   * Template ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }
}

