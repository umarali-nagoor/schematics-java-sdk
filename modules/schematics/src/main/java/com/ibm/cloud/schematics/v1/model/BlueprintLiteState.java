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
 * Computed state of the blueprint.
 */
public class BlueprintLiteState extends GenericModel {

  /**
   * User-defined states
   *   * `Blueprint_Create_Init` When Create Blueprint POST API is invoked and CreateBlueprint process is initiated.
   *   * `Blueprint_Create_InProgress` When Create Blueprint process is in progress.
   *   * `Blueprint_Create_Success` Repos are downloaded and underlying objects are created
   *   * `Blueprint_Create_Failed` Failed to create Blueprint or underlying schematics objects.
   */
  public interface StatusCode {
    /** Blueprint_Create_Init. */
    String BLUEPRINT_CREATE_INIT = "Blueprint_Create_Init";
    /** Blueprint_Create_InProgress. */
    String BLUEPRINT_CREATE_INPROGRESS = "Blueprint_Create_InProgress";
    /** Blueprint_Create_Success. */
    String BLUEPRINT_CREATE_SUCCESS = "Blueprint_Create_Success";
    /** Blueprint_Create_Failed. */
    String BLUEPRINT_CREATE_FAILED = "Blueprint_Create_Failed";
  }

  /**
   * Status of overall Blueprint.
   */
  public interface SummaryStatus {
    /** Blueprint_Normal. */
    String BLUEPRINT_NORMAL = "Blueprint_Normal";
    /** Blueprint_InProgress. */
    String BLUEPRINT_INPROGRESS = "Blueprint_InProgress";
    /** Blueprint_Pending. */
    String BLUEPRINT_PENDING = "Blueprint_Pending";
    /** Blueprint_Error. */
    String BLUEPRINT_ERROR = "Blueprint_Error";
  }

  /**
   * Status of Blueprint Spec.
   */
  public interface ConfigStatus {
    /** Blueprint_Config_Draft. */
    String BLUEPRINT_CONFIG_DRAFT = "Blueprint_Config_Draft";
    /** Blueprint_Config_Saved. */
    String BLUEPRINT_CONFIG_SAVED = "Blueprint_Config_Saved";
    /** Blueprint_Config_Saving. */
    String BLUEPRINT_CONFIG_SAVING = "Blueprint_Config_Saving";
    /** Blueprint_Config_Error. */
    String BLUEPRINT_CONFIG_ERROR = "Blueprint_Config_Error";
    /** Blueprint_Config_Delete. */
    String BLUEPRINT_CONFIG_DELETE = "Blueprint_Config_Delete";
    /** Blueprint_Config_Deleting. */
    String BLUEPRINT_CONFIG_DELETING = "Blueprint_Config_Deleting";
    /** Blueprint_Config_Deleted. */
    String BLUEPRINT_CONFIG_DELETED = "Blueprint_Config_Deleted";
    /** Blueprint_Config_Delete_Error. */
    String BLUEPRINT_CONFIG_DELETE_ERROR = "Blueprint_Config_Delete_Error";
  }

  /**
   * Status of Blueprint Plan.
   */
  public interface PlanStatus {
    /** Blueprint_Plan_None. */
    String BLUEPRINT_PLAN_NONE = "Blueprint_Plan_None";
    /** Blueprint_Plan. */
    String BLUEPRINT_PLAN = "Blueprint_Plan";
    /** Blueprint_Planned. */
    String BLUEPRINT_PLANNED = "Blueprint_Planned";
    /** Blueprint_Planning. */
    String BLUEPRINT_PLANNING = "Blueprint_Planning";
    /** Blueprint_Plan_Error. */
    String BLUEPRINT_PLAN_ERROR = "Blueprint_Plan_Error";
    /** Blueprint_Plan_Partial. */
    String BLUEPRINT_PLAN_PARTIAL = "Blueprint_Plan_Partial";
    /** Blueprint_Plan_Delete. */
    String BLUEPRINT_PLAN_DELETE = "Blueprint_Plan_Delete";
    /** Blueprint_Plan_Deleting. */
    String BLUEPRINT_PLAN_DELETING = "Blueprint_Plan_Deleting";
    /** Blueprint_Plan_Delete_Error. */
    String BLUEPRINT_PLAN_DELETE_ERROR = "Blueprint_Plan_Delete_Error";
  }

  /**
   * Status of Blueprint Run Job.
   */
  public interface RunStatus {
    /** Blueprint_Run_Plan. */
    String BLUEPRINT_RUN_PLAN = "Blueprint_Run_Plan";
    /** Blueprint_Run_Apply. */
    String BLUEPRINT_RUN_APPLY = "Blueprint_Run_Apply";
    /** Blueprint_Run_Destroy. */
    String BLUEPRINT_RUN_DESTROY = "Blueprint_Run_Destroy";
    /** Blueprint_Run_Plan_Inprogress. */
    String BLUEPRINT_RUN_PLAN_INPROGRESS = "Blueprint_Run_Plan_Inprogress";
    /** Blueprint_Run_Apply_Inprogress. */
    String BLUEPRINT_RUN_APPLY_INPROGRESS = "Blueprint_Run_Apply_Inprogress";
    /** Blueprint_Run_Destroy_Inprogress. */
    String BLUEPRINT_RUN_DESTROY_INPROGRESS = "Blueprint_Run_Destroy_Inprogress";
    /** Blueprint_Run_Plan_Error. */
    String BLUEPRINT_RUN_PLAN_ERROR = "Blueprint_Run_Plan_Error";
    /** Blueprint_Run_Apply_Error. */
    String BLUEPRINT_RUN_APPLY_ERROR = "Blueprint_Run_Apply_Error";
    /** Blueprint_Run_Destroy_Error. */
    String BLUEPRINT_RUN_DESTROY_ERROR = "Blueprint_Run_Destroy_Error";
    /** Blueprint_Run_Plan_Complete. */
    String BLUEPRINT_RUN_PLAN_COMPLETE = "Blueprint_Run_Plan_Complete";
    /** Blueprint_Run_Apply_Complete. */
    String BLUEPRINT_RUN_APPLY_COMPLETE = "Blueprint_Run_Apply_Complete";
    /** Blueprint_Run_Destroy_Complete. */
    String BLUEPRINT_RUN_DESTROY_COMPLETE = "Blueprint_Run_Destroy_Complete";
  }

  /**
   * Status of Blueprint Resource.
   */
  public interface ResourceStatus {
    /** Blueprint_Resource_Drifted. */
    String BLUEPRINT_RESOURCE_DRIFTED = "Blueprint_Resource_Drifted";
    /** Blueprint_Resource_Tainted. */
    String BLUEPRINT_RESOURCE_TAINTED = "Blueprint_Resource_Tainted";
    /** Blueprint_Resource_Untainted. */
    String BLUEPRINT_RESOURCE_UNTAINTED = "Blueprint_Resource_Untainted";
    /** Blueprint_Resource_Error. */
    String BLUEPRINT_RESOURCE_ERROR = "Blueprint_Resource_Error";
    /** Blueprint_Resource_Active. */
    String BLUEPRINT_RESOURCE_ACTIVE = "Blueprint_Resource_Active";
  }

  @SerializedName("status_code")
  protected String statusCode;
  @SerializedName("status_message")
  protected String statusMessage;
  @SerializedName("summary_status")
  protected String summaryStatus;
  @SerializedName("config_status")
  protected String configStatus;
  @SerializedName("plan_status")
  protected String planStatus;
  @SerializedName("run_status")
  protected String runStatus;
  @SerializedName("resource_status")
  protected String resourceStatus;

  /**
   * Builder.
   */
  public static class Builder {
    private String statusCode;
    private String statusMessage;
    private String summaryStatus;
    private String configStatus;
    private String planStatus;
    private String runStatus;
    private String resourceStatus;

    /**
     * Instantiates a new Builder from an existing BlueprintLiteState instance.
     *
     * @param blueprintLiteState the instance to initialize the Builder with
     */
    private Builder(BlueprintLiteState blueprintLiteState) {
      this.statusCode = blueprintLiteState.statusCode;
      this.statusMessage = blueprintLiteState.statusMessage;
      this.summaryStatus = blueprintLiteState.summaryStatus;
      this.configStatus = blueprintLiteState.configStatus;
      this.planStatus = blueprintLiteState.planStatus;
      this.runStatus = blueprintLiteState.runStatus;
      this.resourceStatus = blueprintLiteState.resourceStatus;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BlueprintLiteState.
     *
     * @return the new BlueprintLiteState instance
     */
    public BlueprintLiteState build() {
      return new BlueprintLiteState(this);
    }

    /**
     * Set the statusCode.
     *
     * @param statusCode the statusCode
     * @return the BlueprintLiteState builder
     */
    public Builder statusCode(String statusCode) {
      this.statusCode = statusCode;
      return this;
    }

    /**
     * Set the statusMessage.
     *
     * @param statusMessage the statusMessage
     * @return the BlueprintLiteState builder
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }

    /**
     * Set the summaryStatus.
     *
     * @param summaryStatus the summaryStatus
     * @return the BlueprintLiteState builder
     */
    public Builder summaryStatus(String summaryStatus) {
      this.summaryStatus = summaryStatus;
      return this;
    }

    /**
     * Set the configStatus.
     *
     * @param configStatus the configStatus
     * @return the BlueprintLiteState builder
     */
    public Builder configStatus(String configStatus) {
      this.configStatus = configStatus;
      return this;
    }

    /**
     * Set the planStatus.
     *
     * @param planStatus the planStatus
     * @return the BlueprintLiteState builder
     */
    public Builder planStatus(String planStatus) {
      this.planStatus = planStatus;
      return this;
    }

    /**
     * Set the runStatus.
     *
     * @param runStatus the runStatus
     * @return the BlueprintLiteState builder
     */
    public Builder runStatus(String runStatus) {
      this.runStatus = runStatus;
      return this;
    }

    /**
     * Set the resourceStatus.
     *
     * @param resourceStatus the resourceStatus
     * @return the BlueprintLiteState builder
     */
    public Builder resourceStatus(String resourceStatus) {
      this.resourceStatus = resourceStatus;
      return this;
    }
  }

  protected BlueprintLiteState() { }

  protected BlueprintLiteState(Builder builder) {
    statusCode = builder.statusCode;
    statusMessage = builder.statusMessage;
    summaryStatus = builder.summaryStatus;
    configStatus = builder.configStatus;
    planStatus = builder.planStatus;
    runStatus = builder.runStatus;
    resourceStatus = builder.resourceStatus;
  }

  /**
   * New builder.
   *
   * @return a BlueprintLiteState builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the statusCode.
   *
   * User-defined states
   *   * `Blueprint_Create_Init` When Create Blueprint POST API is invoked and CreateBlueprint process is initiated.
   *   * `Blueprint_Create_InProgress` When Create Blueprint process is in progress.
   *   * `Blueprint_Create_Success` Repos are downloaded and underlying objects are created
   *   * `Blueprint_Create_Failed` Failed to create Blueprint or underlying schematics objects.
   *
   * @return the statusCode
   */
  public String statusCode() {
    return statusCode;
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

  /**
   * Gets the summaryStatus.
   *
   * Status of overall Blueprint.
   *
   * @return the summaryStatus
   */
  public String summaryStatus() {
    return summaryStatus;
  }

  /**
   * Gets the configStatus.
   *
   * Status of Blueprint Spec.
   *
   * @return the configStatus
   */
  public String configStatus() {
    return configStatus;
  }

  /**
   * Gets the planStatus.
   *
   * Status of Blueprint Plan.
   *
   * @return the planStatus
   */
  public String planStatus() {
    return planStatus;
  }

  /**
   * Gets the runStatus.
   *
   * Status of Blueprint Run Job.
   *
   * @return the runStatus
   */
  public String runStatus() {
    return runStatus;
  }

  /**
   * Gets the resourceStatus.
   *
   * Status of Blueprint Resource.
   *
   * @return the resourceStatus
   */
  public String resourceStatus() {
    return resourceStatus;
  }
}

