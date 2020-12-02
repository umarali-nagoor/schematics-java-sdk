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
 * Workspace Job state-file.
 */
public class JobStateData extends GenericModel {

  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("job_name")
  protected String jobName;
  protected List<JobStateDataSummaryItem> summary;
  protected String format;
  protected byte[] details;
  @SerializedName("updated_at")
  protected Date updatedAt;

  /**
   * Gets the jobId.
   *
   * Job Id.
   *
   * @return the jobId
   */
  public String getJobId() {
    return jobId;
  }

  /**
   * Gets the jobName.
   *
   * Job name, uniquely derived from the related Action.
   *
   * @return the jobName
   */
  public String getJobName() {
    return jobName;
  }

  /**
   * Gets the summary.
   *
   * Job state summary.
   *
   * @return the summary
   */
  public List<JobStateDataSummaryItem> getSummary() {
    return summary;
  }

  /**
   * Gets the format.
   *
   * Format of the State data (eg. tfstate).
   *
   * @return the format
   */
  public String getFormat() {
    return format;
  }

  /**
   * Gets the details.
   *
   * State data file.
   *
   * @return the details
   */
  public byte[] getDetails() {
    return details;
  }

  /**
   * Gets the updatedAt.
   *
   * Job status updation timestamp.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }
}

