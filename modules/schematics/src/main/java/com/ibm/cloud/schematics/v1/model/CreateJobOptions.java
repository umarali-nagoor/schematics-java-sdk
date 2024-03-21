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
    /** system. */
    String SYSTEM = "system";
    /** environment. */
    String ENVIRONMENT = "environment";
    /** blueprint. */
    String BLUEPRINT = "blueprint";
  }

  /**
   * Schematics job command name.
   */
  public interface CommandName {
    /** workspace_plan. */
    String WORKSPACE_PLAN = "workspace_plan";
    /** workspace_apply. */
    String WORKSPACE_APPLY = "workspace_apply";
    /** workspace_destroy. */
    String WORKSPACE_DESTROY = "workspace_destroy";
    /** workspace_refresh. */
    String WORKSPACE_REFRESH = "workspace_refresh";
    /** ansible_playbook_run. */
    String ANSIBLE_PLAYBOOK_RUN = "ansible_playbook_run";
    /** ansible_playbook_check. */
    String ANSIBLE_PLAYBOOK_CHECK = "ansible_playbook_check";
    /** create_action. */
    String CREATE_ACTION = "create_action";
    /** put_action. */
    String PUT_ACTION = "put_action";
    /** patch_action. */
    String PATCH_ACTION = "patch_action";
    /** delete_action. */
    String DELETE_ACTION = "delete_action";
    /** system_key_enable. */
    String SYSTEM_KEY_ENABLE = "system_key_enable";
    /** system_key_delete. */
    String SYSTEM_KEY_DELETE = "system_key_delete";
    /** system_key_disable. */
    String SYSTEM_KEY_DISABLE = "system_key_disable";
    /** system_key_rotate. */
    String SYSTEM_KEY_ROTATE = "system_key_rotate";
    /** system_key_restore. */
    String SYSTEM_KEY_RESTORE = "system_key_restore";
    /** create_workspace. */
    String CREATE_WORKSPACE = "create_workspace";
    /** put_workspace. */
    String PUT_WORKSPACE = "put_workspace";
    /** patch_workspace. */
    String PATCH_WORKSPACE = "patch_workspace";
    /** delete_workspace. */
    String DELETE_WORKSPACE = "delete_workspace";
    /** create_cart. */
    String CREATE_CART = "create_cart";
    /** create_environment. */
    String CREATE_ENVIRONMENT = "create_environment";
    /** put_environment. */
    String PUT_ENVIRONMENT = "put_environment";
    /** delete_environment. */
    String DELETE_ENVIRONMENT = "delete_environment";
    /** environment_create_init. */
    String ENVIRONMENT_CREATE_INIT = "environment_create_init";
    /** environment_update_init. */
    String ENVIRONMENT_UPDATE_INIT = "environment_update_init";
    /** environment_install. */
    String ENVIRONMENT_INSTALL = "environment_install";
    /** environment_uninstall. */
    String ENVIRONMENT_UNINSTALL = "environment_uninstall";
    /** blueprint_create_init. */
    String BLUEPRINT_CREATE_INIT = "blueprint_create_init";
    /** blueprint_update_init. */
    String BLUEPRINT_UPDATE_INIT = "blueprint_update_init";
    /** blueprint_install. */
    String BLUEPRINT_INSTALL = "blueprint_install";
    /** blueprint_destroy. */
    String BLUEPRINT_DESTROY = "blueprint_destroy";
    /** blueprint_delete. */
    String BLUEPRINT_DELETE = "blueprint_delete";
    /** blueprint_plan_init. */
    String BLUEPRINT_PLAN_INIT = "blueprint_plan_init";
    /** blueprint_plan_apply. */
    String BLUEPRINT_PLAN_APPLY = "blueprint_plan_apply";
    /** blueprint_plan_destroy. */
    String BLUEPRINT_PLAN_DESTROY = "blueprint_plan_destroy";
    /** blueprint_run_plan. */
    String BLUEPRINT_RUN_PLAN = "blueprint_run_plan";
    /** blueprint_run_apply. */
    String BLUEPRINT_RUN_APPLY = "blueprint_run_apply";
    /** blueprint_run_destroy. */
    String BLUEPRINT_RUN_DESTROY = "blueprint_run_destroy";
    /** repository_process. */
    String REPOSITORY_PROCESS = "repository_process";
    /** terraform_commands. */
    String TERRAFORM_COMMANDS = "terraform_commands";
  }

  /**
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
   */
  public interface Location {
    /** us-south. */
    String US_SOUTH = "us-south";
    /** us-east. */
    String US_EAST = "us-east";
    /** eu-gb. */
    String EU_GB = "eu-gb";
    /** eu-de. */
    String EU_DE = "eu-de";
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
  protected List<CartOrderData> cartOrderData;
  protected JobData data;
  protected BastionResourceDefinition bastion;
  protected JobLogSummary logSummary;
  protected AgentInfo agent;

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
    private List<CartOrderData> cartOrderData;
    private JobData data;
    private BastionResourceDefinition bastion;
    private JobLogSummary logSummary;
    private AgentInfo agent;

    /**
     * Instantiates a new Builder from an existing CreateJobOptions instance.
     *
     * @param createJobOptions the instance to initialize the Builder with
     */
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
      this.cartOrderData = createJobOptions.cartOrderData;
      this.data = createJobOptions.data;
      this.bastion = createJobOptions.bastion;
      this.logSummary = createJobOptions.logSummary;
      this.agent = createJobOptions.agent;
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
     * Adds a new element to commandOptions.
     *
     * @param commandOptions the new element to be added
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
     * Adds a new element to inputs.
     *
     * @param inputs the new element to be added
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
     * Adds a new element to settings.
     *
     * @param settings the new element to be added
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
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
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
     * Adds a new element to cartOrderData.
     *
     * @param cartOrderData the new element to be added
     * @return the CreateJobOptions builder
     */
    public Builder addCartOrderData(CartOrderData cartOrderData) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(cartOrderData,
        "cartOrderData cannot be null");
      if (this.cartOrderData == null) {
        this.cartOrderData = new ArrayList<CartOrderData>();
      }
      this.cartOrderData.add(cartOrderData);
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
     * Set the cartOrderData.
     * Existing cartOrderData will be replaced.
     *
     * @param cartOrderData the cartOrderData
     * @return the CreateJobOptions builder
     */
    public Builder cartOrderData(List<CartOrderData> cartOrderData) {
      this.cartOrderData = cartOrderData;
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
    public Builder bastion(BastionResourceDefinition bastion) {
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
     * Set the agent.
     *
     * @param agent the agent
     * @return the CreateJobOptions builder
     */
    public Builder agent(AgentInfo agent) {
      this.agent = agent;
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
      this.cartOrderData = job.cartOrderData();
      this.data = job.data();
      this.bastion = job.bastion();
      this.logSummary = job.logSummary();
      this.agent = job.agent();
      return this;
    }
  }

  protected CreateJobOptions() { }

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
    cartOrderData = builder.cartOrderData;
    data = builder.data;
    bastion = builder.bastion;
    logSummary = builder.logSummary;
    agent = builder.agent;
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
   * The IAM refresh token for the user or service identity.
   *
   *   **Retrieving refresh token**:
   *   * Use `export IBMCLOUD_API_KEY=&lt;ibmcloud_api_key&gt;`, and execute `curl -X POST
   * "https://iam.cloud.ibm.com/identity/token" -H "Content-Type: application/x-www-form-urlencoded" -d
   * "grant_type=urn:ibm:params:oauth:grant-type:apikey&amp;apikey=$IBMCLOUD_API_KEY" -u bx:bx`.
   *   * For more information, about creating IAM access token and API Docs, refer, [IAM access
   * token](/apidocs/iam-identity-token-api#gettoken-password) and [Create API
   * key](/apidocs/iam-identity-token-api#create-api-key).
   *
   *   **Limitation**:
   *   * If the token is expired, you can use `refresh token` to get a new IAM access token.
   *   * The `refresh_token` parameter cannot be used to retrieve a new IAM access token.
   *   * When the IAM access token is about to expire, use the API key to create a new access token.
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
   * Job command object id (workspace-id, action-id).
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
   * Schematics job command parameter (playbook-name).
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
   * Job inputs used by Action or Workspace.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the settings.
   *
   * Environment variables used by the Job while performing Action or Workspace.
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
   * List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action, choose the
   * right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud resources,
   * provisioned using Schematics.
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
   * Gets the cartOrderData.
   *
   * Contains the cart order data which can be used for different purpose for eg. service tagging.
   *
   * @return the cartOrderData
   */
  public List<CartOrderData> cartOrderData() {
    return cartOrderData;
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
   * Describes a bastion resource.
   *
   * @return the bastion
   */
  public BastionResourceDefinition bastion() {
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

  /**
   * Gets the agent.
   *
   * Agent name, Agent id and associated policy ID information.
   *
   * @return the agent
   */
  public AgentInfo agent() {
    return agent;
  }
}

