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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SharedDatasetResponseList -.
 */
public class SharedDatasetResponseList extends GenericModel {

  protected Long count;
  @SerializedName("shared_datasets")
  protected List<SharedDatasetResponse> sharedDatasets;

  /**
   * Gets the count.
   *
   * Shared dataset count.
   *
   * @return the count
   */
  public Long getCount() {
    return count;
  }

  /**
   * Gets the sharedDatasets.
   *
   * List of datasets.
   *
   * @return the sharedDatasets
   */
  public List<SharedDatasetResponse> getSharedDatasets() {
    return sharedDatasets;
  }
}

