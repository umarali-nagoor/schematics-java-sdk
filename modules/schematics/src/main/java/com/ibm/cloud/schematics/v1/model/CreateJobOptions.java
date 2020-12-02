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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createJob options.
 */
public class CreateJobOptions extends GenericModel {

  /**
   * Name of the Schematics automation resource.
   */
  public interface CommandObject {
    /** workspace. */
    String WORKSPACE = "workspace";
    /** action. */
    String ACTION = "action";
  }

  /**
   * Schematics job command name.
   */
  public interface CommandName {
    /** workspace_init_flow. */
    String WORKSPACE_INIT_FLOW = "workspace_init_flow";
    /** workspace_plan_flow. */
    String WORKSPACE_PLAN_FLOW = "workspace_plan_flow";
    /** workspace_apply_flow. */
    String WORKSPACE_APPLY_FLOW = "workspace_apply_flow";
    /** workspace_destroy_flow. */
    String WORKSPACE_DESTROY_FLOW = "workspace_destroy_flow";
    /** workspace_refresh_flow. */
    String WORKSPACE_REFRESH_FLOW = "workspace_refresh_flow";
    /** workspace_show_flow. */
    String WORKSPACE_SHOW_FLOW = "workspace_show_flow";
    /** workspace_custom_flow. */
    String WORKSPACE_CUSTOM_FLOW = "workspace_custom_flow";
    /** terraform_init. */
    String TERRAFORM_INIT = "terraform_init";
    /** terrform_plan. */
    String TERRFORM_PLAN = "terrform_plan";
    /** terrform_apply. */
    String TERRFORM_APPLY = "terrform_apply";
    /** terrform_destroy. */
    String TERRFORM_DESTROY = "terrform_destroy";
    /** terrform_refresh. */
    String TERRFORM_REFRESH = "terrform_refresh";
    /** terrform_taint. */
    String TERRFORM_TAINT = "terrform_taint";
    /** terrform_show. */
    String TERRFORM_SHOW = "terrform_show";
    /** helm_install. */
    String HELM_INSTALL = "helm_install";
    /** helm_list. */
    String HELM_LIST = "helm_list";
    /** helm_show. */
    String HELM_SHOW = "helm_show";
    /** ansible_playbook_run. */
    String ANSIBLE_PLAYBOOK_RUN = "ansible_playbook_run";
    /** ansible_playbook_check. */
    String ANSIBLE_PLAYBOOK_CHECK = "ansible_playbook_check";
    /** opa_evaluate. */
    String OPA_EVALUATE = "opa_evaluate";
  }

  /**
   * List of workspace locations supported by IBM Cloud Schematics service.  Note, this does not limit the location of
   * the resources provisioned using Schematics.
   */
  public interface Location {
    /** us_south. */
    String US_SOUTH = "us_south";
    /** us_east. */
    String US_EAST = "us_east";
    /** eu_gb. */
    String EU_GB = "eu_gb";
    /** eu_de. */
    String EU_DE = "eu_de";
  }

  protected String refreshToken;
  protected String commandObject;
  protected String commandObjectId;
  protected String commandName;
  protected String commandParameter;
  protected List<String> commandOptions;
  protected List<VariableData> inputs;
  protected List<VariableData> settings;
  protected List<String> tags;
  protected String location;
  protected JobStatus status;
  protected JobData data;
  protected TargetResourceset bastion;
  protected JobLogSummary logSummary;

  /**
   * Builder.
   */
  public static class Builder {
    private String refreshToken;
    private String commandObject;
    private String commandObjectId;
    private String commandName;
    private String commandParameter;
    private List<String> commandOptions;
    private List<VariableData> inputs;
    private List<VariableData> settings;
    private List<String> tags;
    private String location;
    private JobStatus status;
    private JobData data;
    private TargetResourceset bastion;
    private JobLogSummary logSummary;

    private Builder(CreateJobOptions createJobOptions) {
      this.refreshToken = createJobOptions.refreshToken;
      this.commandObject = createJobOptions.commandObject;
      this.commandObjectId = createJobOptions.commandObjectId;
      this.commandName = createJobOptions.commandName;
      this.commandParameter = createJobOptions.commandParameter;
      this.commandOptions = createJobOptions.commandOptions;
      this.inputs = createJobOptions.inputs;
      this.settings = createJobOptions.settings;
      this.tags = createJobOptions.tags;
      this.location = createJobOptions.location;
      this.status = createJobOptions.status;
      this.data = createJobOptions.data;
      this.bastion = createJobOptions.bastion;
      this.logSummary = createJobOptions.logSummary;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param refreshToken the refreshToken
     */
    public Builder(String refreshToken) {
      this.refreshToken = refreshToken;
    }

    /**
     * Builds a CreateJobOptions.
     *
     * @return the new CreateJobOptions instance
     */
    public CreateJobOptions build() {
      return new CreateJobOptions(this);
    }

    /**
     * Adds an commandOptions to commandOptions.
     *
     * @param commandOptions the new commandOptions
     * @return the CreateJobOptions builder
     */
    public Builder addCommandOptions(String commandOptions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(commandOptions,
        "commandOptions cannot be null");
      if (this.commandOptions == null) {
        this.commandOptions = new ArrayList<String>();
      }
      this.commandOptions.add(commandOptions);
      return this;
    }

    /**
     * Adds an inputs to inputs.
     *
     * @param inputs the new inputs
     * @return the CreateJobOptions builder
     */
    public Builder addInputs(VariableData inputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(inputs,
        "inputs cannot be null");
      if (this.inputs == null) {
        this.inputs = new ArrayList<VariableData>();
      }
      this.inputs.add(inputs);
      return this;
    }

    /**
     * Adds an settings to settings.
     *
     * @param settings the new settings
     * @return the CreateJobOptions builder
     */
    public Builder addSettings(VariableData settings) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(settings,
        "settings cannot be null");
      if (this.settings == null) {
        this.settings = new ArrayList<VariableData>();
      }
      this.settings.add(settings);
      return this;
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the CreateJobOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the refreshToken.
     *
     * @param refreshToken the refreshToken
     * @return the CreateJobOptions builder
     */
    public Builder refreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }

    /**
     * Set the commandObject.
     *
     * @param commandObject the commandObject
     * @return the CreateJobOptions builder
     */
    public Builder commandObject(String commandObject) {
      this.commandObject = commandObject;
      return this;
    }

    /**
     * Set the commandObjectId.
     *
     * @param commandObjectId the commandObjectId
     * @return the CreateJobOptions builder
     */
    public Builder commandObjectId(String commandObjectId) {
      this.commandObjectId = commandObjectId;
      return this;
    }

    /**
     * Set the commandName.
     *
     * @param commandName the commandName
     * @return the CreateJobOptions builder
     */
    public Builder commandName(String commandName) {
      this.commandName = commandName;
      return this;
    }

    /**
     * Set the commandParameter.
     *
     * @param commandParameter the commandParameter
     * @return the CreateJobOptions builder
     */
    public Builder commandParameter(String commandParameter) {
      this.commandParameter = commandParameter;
      return this;
    }

    /**
     * Set the commandOptions.
     * Existing commandOptions will be replaced.
     *
     * @param commandOptions the commandOptions
     * @return the CreateJobOptions builder
     */
    public Builder commandOptions(List<String> commandOptions) {
      this.commandOptions = commandOptions;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the CreateJobOptions builder
     */
    public Builder inputs(List<VariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the settings.
     * Existing settings will be replaced.
     *
     * @param settings the settings
     * @return the CreateJobOptions builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateJobOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the CreateJobOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the CreateJobOptions builder
     */
    public Builder status(JobStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Set the data.
     *
     * @param data the data
     * @return the CreateJobOptions builder
     */
    public Builder data(JobData data) {
      this.data = data;
      return this;
    }

    /**
     * Set the bastion.
     *
     * @param bastion the bastion
     * @return the CreateJobOptions builder
     */
    public Builder bastion(TargetResourceset bastion) {
      this.bastion = bastion;
      return this;
    }

    /**
     * Set the logSummary.
     *
     * @param logSummary the logSummary
     * @return the CreateJobOptions builder
     */
    public Builder logSummary(JobLogSummary logSummary) {
      this.logSummary = logSummary;
      return this;
    }

    /**
     * Set the job.
     *
     * @param job the job
     * @return the CreateJobOptions builder
     */
    public Builder job(Job job) {
      this.commandObject = job.commandObject();
      this.commandObjectId = job.commandObjectId();
      this.commandName = job.commandName();
      this.commandParameter = job.commandParameter();
      this.commandOptions = job.commandOptions();
      this.inputs = job.inputs();
      this.settings = job.settings();
      this.tags = job.tags();
      this.location = job.location();
      this.status = job.status();
      this.data = job.data();
      this.bastion = job.bastion();
      this.logSummary = job.logSummary();
      return this;
    }
  }

  protected CreateJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.refreshToken,
      "refreshToken cannot be null");
    refreshToken = builder.refreshToken;
    commandObject = builder.commandObject;
    commandObjectId = builder.commandObjectId;
    commandName = builder.commandName;
    commandParameter = builder.commandParameter;
    commandOptions = builder.commandOptions;
    inputs = builder.inputs;
    settings = builder.settings;
    tags = builder.tags;
    location = builder.location;
    status = builder.status;
    data = builder.data;
    bastion = builder.bastion;
    logSummary = builder.logSummary;
  }

  /**
   * New builder.
   *
   * @return a CreateJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the refreshToken.
   *
   * The IAM refresh token associated with the IBM Cloud account.
   *
   * @return the refreshToken
   */
  public String refreshToken() {
    return refreshToken;
  }

  /**
   * Gets the commandObject.
   *
   * Name of the Schematics automation resource.
   *
   * @return the commandObject
   */
  public String commandObject() {
    return commandObject;
  }

  /**
   * Gets the commandObjectId.
   *
   * Job command object id (workspace-id, action-id or control-id).
   *
   * @return the commandObjectId
   */
  public String commandObjectId() {
    return commandObjectId;
  }

  /**
   * Gets the commandName.
   *
   * Schematics job command name.
   *
   * @return the commandName
   */
  public String commandName() {
    return commandName;
  }

  /**
   * Gets the commandParameter.
   *
   * Schematics job command parameter (playbook-name, capsule-name or flow-name).
   *
   * @return the commandParameter
   */
  public String commandParameter() {
    return commandParameter;
  }

  /**
   * Gets the commandOptions.
   *
   * Command line options for the command.
   *
   * @return the commandOptions
   */
  public List<String> commandOptions() {
    return commandOptions;
  }

  /**
   * Gets the inputs.
   *
   * Job inputs used by Action.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the settings.
   *
   * Environment variables used by the Job while performing Action.
   *
   * @return the settings
   */
  public List<VariableData> settings() {
    return settings;
  }

  /**
   * Gets the tags.
   *
   * User defined tags, while running the job.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the location.
   *
   * List of workspace locations supported by IBM Cloud Schematics service.  Note, this does not limit the location of
   * the resources provisioned using Schematics.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the status.
   *
   * Job Status.
   *
   * @return the status
   */
  public JobStatus status() {
    return status;
  }

  /**
   * Gets the data.
   *
   * Job data.
   *
   * @return the data
   */
  public JobData data() {
    return data;
  }

  /**
   * Gets the bastion.
   *
   * Complete Target details with user inputs and system generated data.
   *
   * @return the bastion
   */
  public TargetResourceset bastion() {
    return bastion;
  }

  /**
   * Gets the logSummary.
   *
   * Job log summary record.
   *
   * @return the logSummary
   */
  public JobLogSummary logSummary() {
    return logSummary;
  }
}

