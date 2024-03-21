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
 * The updateAction options.
 */
public class UpdateActionOptions extends GenericModel {

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

  /**
   * Type of connection to be used when connecting to bastion host.  If the `inventory_connection_type=winrm`, then
   * `bastion_connection_type` is not supported.
   */
  public interface BastionConnectionType {
    /** ssh. */
    String SSH = "ssh";
  }

  /**
   * Type of connection to be used when connecting to remote host.  **Note** Currently, WinRM supports only Windows
   * system with the public IPs and do not support Bastion host.
   */
  public interface InventoryConnectionType {
    /** ssh. */
    String SSH = "ssh";
    /** winrm. */
    String WINRM = "winrm";
  }

  /**
   * Type of source for the Template.
   */
  public interface SourceType {
    /** local. */
    String LOCAL = "local";
    /** git_hub. */
    String GIT_HUB = "git_hub";
    /** git_hub_enterprise. */
    String GIT_HUB_ENTERPRISE = "git_hub_enterprise";
    /** git_lab. */
    String GIT_LAB = "git_lab";
    /** ibm_git_lab. */
    String IBM_GIT_LAB = "ibm_git_lab";
    /** ibm_cloud_catalog. */
    String IBM_CLOUD_CATALOG = "ibm_cloud_catalog";
  }

  protected String actionId;
  protected String name;
  protected String description;
  protected String location;
  protected String resourceGroup;
  protected String bastionConnectionType;
  protected String inventoryConnectionType;
  protected List<String> tags;
  protected UserState userState;
  protected String sourceReadmeUrl;
  protected ExternalSource source;
  protected String sourceType;
  protected String commandParameter;
  protected String inventory;
  protected List<CredentialVariableData> credentials;
  protected BastionResourceDefinition bastion;
  protected CredentialVariableData bastionCredential;
  protected String targetsIni;
  protected List<VariableData> inputs;
  protected List<VariableData> outputs;
  protected List<VariableData> settings;
  protected String xGithubToken;

  /**
   * Builder.
   */
  public static class Builder {
    private String actionId;
    private String name;
    private String description;
    private String location;
    private String resourceGroup;
    private String bastionConnectionType;
    private String inventoryConnectionType;
    private List<String> tags;
    private UserState userState;
    private String sourceReadmeUrl;
    private ExternalSource source;
    private String sourceType;
    private String commandParameter;
    private String inventory;
    private List<CredentialVariableData> credentials;
    private BastionResourceDefinition bastion;
    private CredentialVariableData bastionCredential;
    private String targetsIni;
    private List<VariableData> inputs;
    private List<VariableData> outputs;
    private List<VariableData> settings;
    private String xGithubToken;

    /**
     * Instantiates a new Builder from an existing UpdateActionOptions instance.
     *
     * @param updateActionOptions the instance to initialize the Builder with
     */
    private Builder(UpdateActionOptions updateActionOptions) {
      this.actionId = updateActionOptions.actionId;
      this.name = updateActionOptions.name;
      this.description = updateActionOptions.description;
      this.location = updateActionOptions.location;
      this.resourceGroup = updateActionOptions.resourceGroup;
      this.bastionConnectionType = updateActionOptions.bastionConnectionType;
      this.inventoryConnectionType = updateActionOptions.inventoryConnectionType;
      this.tags = updateActionOptions.tags;
      this.userState = updateActionOptions.userState;
      this.sourceReadmeUrl = updateActionOptions.sourceReadmeUrl;
      this.source = updateActionOptions.source;
      this.sourceType = updateActionOptions.sourceType;
      this.commandParameter = updateActionOptions.commandParameter;
      this.inventory = updateActionOptions.inventory;
      this.credentials = updateActionOptions.credentials;
      this.bastion = updateActionOptions.bastion;
      this.bastionCredential = updateActionOptions.bastionCredential;
      this.targetsIni = updateActionOptions.targetsIni;
      this.inputs = updateActionOptions.inputs;
      this.outputs = updateActionOptions.outputs;
      this.settings = updateActionOptions.settings;
      this.xGithubToken = updateActionOptions.xGithubToken;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param actionId the actionId
     */
    public Builder(String actionId) {
      this.actionId = actionId;
    }

    /**
     * Builds a UpdateActionOptions.
     *
     * @return the new UpdateActionOptions instance
     */
    public UpdateActionOptions build() {
      return new UpdateActionOptions(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the UpdateActionOptions builder
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
     * Adds a new element to credentials.
     *
     * @param credentials the new element to be added
     * @return the UpdateActionOptions builder
     */
    public Builder addCredentials(CredentialVariableData credentials) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(credentials,
        "credentials cannot be null");
      if (this.credentials == null) {
        this.credentials = new ArrayList<CredentialVariableData>();
      }
      this.credentials.add(credentials);
      return this;
    }

    /**
     * Adds a new element to inputs.
     *
     * @param inputs the new element to be added
     * @return the UpdateActionOptions builder
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
     * Adds a new element to outputs.
     *
     * @param outputs the new element to be added
     * @return the UpdateActionOptions builder
     */
    public Builder addOutputs(VariableData outputs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(outputs,
        "outputs cannot be null");
      if (this.outputs == null) {
        this.outputs = new ArrayList<VariableData>();
      }
      this.outputs.add(outputs);
      return this;
    }

    /**
     * Adds a new element to settings.
     *
     * @param settings the new element to be added
     * @return the UpdateActionOptions builder
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
     * Set the actionId.
     *
     * @param actionId the actionId
     * @return the UpdateActionOptions builder
     */
    public Builder actionId(String actionId) {
      this.actionId = actionId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateActionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the UpdateActionOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the UpdateActionOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the UpdateActionOptions builder
     */
    public Builder resourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the bastionConnectionType.
     *
     * @param bastionConnectionType the bastionConnectionType
     * @return the UpdateActionOptions builder
     */
    public Builder bastionConnectionType(String bastionConnectionType) {
      this.bastionConnectionType = bastionConnectionType;
      return this;
    }

    /**
     * Set the inventoryConnectionType.
     *
     * @param inventoryConnectionType the inventoryConnectionType
     * @return the UpdateActionOptions builder
     */
    public Builder inventoryConnectionType(String inventoryConnectionType) {
      this.inventoryConnectionType = inventoryConnectionType;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the UpdateActionOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the userState.
     *
     * @param userState the userState
     * @return the UpdateActionOptions builder
     */
    public Builder userState(UserState userState) {
      this.userState = userState;
      return this;
    }

    /**
     * Set the sourceReadmeUrl.
     *
     * @param sourceReadmeUrl the sourceReadmeUrl
     * @return the UpdateActionOptions builder
     */
    public Builder sourceReadmeUrl(String sourceReadmeUrl) {
      this.sourceReadmeUrl = sourceReadmeUrl;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the UpdateActionOptions builder
     */
    public Builder source(ExternalSource source) {
      this.source = source;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the UpdateActionOptions builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Set the commandParameter.
     *
     * @param commandParameter the commandParameter
     * @return the UpdateActionOptions builder
     */
    public Builder commandParameter(String commandParameter) {
      this.commandParameter = commandParameter;
      return this;
    }

    /**
     * Set the inventory.
     *
     * @param inventory the inventory
     * @return the UpdateActionOptions builder
     */
    public Builder inventory(String inventory) {
      this.inventory = inventory;
      return this;
    }

    /**
     * Set the credentials.
     * Existing credentials will be replaced.
     *
     * @param credentials the credentials
     * @return the UpdateActionOptions builder
     */
    public Builder credentials(List<CredentialVariableData> credentials) {
      this.credentials = credentials;
      return this;
    }

    /**
     * Set the bastion.
     *
     * @param bastion the bastion
     * @return the UpdateActionOptions builder
     */
    public Builder bastion(BastionResourceDefinition bastion) {
      this.bastion = bastion;
      return this;
    }

    /**
     * Set the bastionCredential.
     *
     * @param bastionCredential the bastionCredential
     * @return the UpdateActionOptions builder
     */
    public Builder bastionCredential(CredentialVariableData bastionCredential) {
      this.bastionCredential = bastionCredential;
      return this;
    }

    /**
     * Set the targetsIni.
     *
     * @param targetsIni the targetsIni
     * @return the UpdateActionOptions builder
     */
    public Builder targetsIni(String targetsIni) {
      this.targetsIni = targetsIni;
      return this;
    }

    /**
     * Set the inputs.
     * Existing inputs will be replaced.
     *
     * @param inputs the inputs
     * @return the UpdateActionOptions builder
     */
    public Builder inputs(List<VariableData> inputs) {
      this.inputs = inputs;
      return this;
    }

    /**
     * Set the outputs.
     * Existing outputs will be replaced.
     *
     * @param outputs the outputs
     * @return the UpdateActionOptions builder
     */
    public Builder outputs(List<VariableData> outputs) {
      this.outputs = outputs;
      return this;
    }

    /**
     * Set the settings.
     * Existing settings will be replaced.
     *
     * @param settings the settings
     * @return the UpdateActionOptions builder
     */
    public Builder settings(List<VariableData> settings) {
      this.settings = settings;
      return this;
    }

    /**
     * Set the xGithubToken.
     *
     * @param xGithubToken the xGithubToken
     * @return the UpdateActionOptions builder
     */
    public Builder xGithubToken(String xGithubToken) {
      this.xGithubToken = xGithubToken;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the UpdateActionOptions builder
     */
    public Builder action(Action action) {
      this.name = action.name();
      this.description = action.description();
      this.location = action.location();
      this.resourceGroup = action.resourceGroup();
      this.bastionConnectionType = action.bastionConnectionType();
      this.inventoryConnectionType = action.inventoryConnectionType();
      this.tags = action.tags();
      this.userState = action.userState();
      this.sourceReadmeUrl = action.sourceReadmeUrl();
      this.source = action.source();
      this.sourceType = action.sourceType();
      this.commandParameter = action.commandParameter();
      this.inventory = action.inventory();
      this.credentials = action.credentials();
      this.bastion = action.bastion();
      this.bastionCredential = action.bastionCredential();
      this.targetsIni = action.targetsIni();
      this.inputs = action.inputs();
      this.outputs = action.outputs();
      this.settings = action.settings();
      return this;
    }
  }

  protected UpdateActionOptions() { }

  protected UpdateActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.actionId,
      "actionId cannot be empty");
    actionId = builder.actionId;
    name = builder.name;
    description = builder.description;
    location = builder.location;
    resourceGroup = builder.resourceGroup;
    bastionConnectionType = builder.bastionConnectionType;
    inventoryConnectionType = builder.inventoryConnectionType;
    tags = builder.tags;
    userState = builder.userState;
    sourceReadmeUrl = builder.sourceReadmeUrl;
    source = builder.source;
    sourceType = builder.sourceType;
    commandParameter = builder.commandParameter;
    inventory = builder.inventory;
    credentials = builder.credentials;
    bastion = builder.bastion;
    bastionCredential = builder.bastionCredential;
    targetsIni = builder.targetsIni;
    inputs = builder.inputs;
    outputs = builder.outputs;
    settings = builder.settings;
    xGithubToken = builder.xGithubToken;
  }

  /**
   * New builder.
   *
   * @return a UpdateActionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the actionId.
   *
   * Action Id.  Use GET /actions API to look up the Action Ids in your IBM Cloud account.
   *
   * @return the actionId
   */
  public String actionId() {
    return actionId;
  }

  /**
   * Gets the name.
   *
   * The unique name of your action. The name can be up to 128 characters long and can include alphanumeric characters,
   * spaces, dashes, and underscores. **Example** you can use the name to stop action.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * Action description.
   *
   * @return the description
   */
  public String description() {
    return description;
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
   * Gets the resourceGroup.
   *
   * Resource-group name for an action. By default, an action is created in `Default` resource group.
   *
   * @return the resourceGroup
   */
  public String resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the bastionConnectionType.
   *
   * Type of connection to be used when connecting to bastion host.  If the `inventory_connection_type=winrm`, then
   * `bastion_connection_type` is not supported.
   *
   * @return the bastionConnectionType
   */
  public String bastionConnectionType() {
    return bastionConnectionType;
  }

  /**
   * Gets the inventoryConnectionType.
   *
   * Type of connection to be used when connecting to remote host.  **Note** Currently, WinRM supports only Windows
   * system with the public IPs and do not support Bastion host.
   *
   * @return the inventoryConnectionType
   */
  public String inventoryConnectionType() {
    return inventoryConnectionType;
  }

  /**
   * Gets the tags.
   *
   * Action tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }

  /**
   * Gets the userState.
   *
   * User defined status of the Schematics object.
   *
   * @return the userState
   */
  public UserState userState() {
    return userState;
  }

  /**
   * Gets the sourceReadmeUrl.
   *
   * URL of the `README` file, for the source URL.
   *
   * @return the sourceReadmeUrl
   */
  public String sourceReadmeUrl() {
    return sourceReadmeUrl;
  }

  /**
   * Gets the source.
   *
   * Source of templates, playbooks, or controls.
   *
   * @return the source
   */
  public ExternalSource source() {
    return source;
  }

  /**
   * Gets the sourceType.
   *
   * Type of source for the Template.
   *
   * @return the sourceType
   */
  public String sourceType() {
    return sourceType;
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
   * Gets the inventory.
   *
   * Target inventory record ID, used by the action or ansible playbook.
   *
   * @return the inventory
   */
  public String inventory() {
    return inventory;
  }

  /**
   * Gets the credentials.
   *
   * credentials of the Action.
   *
   * @return the credentials
   */
  public List<CredentialVariableData> credentials() {
    return credentials;
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
   * Gets the bastionCredential.
   *
   * User editable credential variable data and system generated reference to the value.
   *
   * @return the bastionCredential
   */
  public CredentialVariableData bastionCredential() {
    return bastionCredential;
  }

  /**
   * Gets the targetsIni.
   *
   * Inventory of host and host group for the playbook in `INI` file format. For example, `"targets_ini":
   * "[webserverhost]
   *  172.22.192.6
   *  [dbhost]
   *  172.22.192.5"`. For more information, about an inventory host group syntax, see [Inventory host
   * groups](https://cloud.ibm.com/docs/schematics?topic=schematics-schematics-cli-reference#schematics-inventory-host-grps).
   *
   * @return the targetsIni
   */
  public String targetsIni() {
    return targetsIni;
  }

  /**
   * Gets the inputs.
   *
   * Input variables for the Action.
   *
   * @return the inputs
   */
  public List<VariableData> inputs() {
    return inputs;
  }

  /**
   * Gets the outputs.
   *
   * Output variables for the Action.
   *
   * @return the outputs
   */
  public List<VariableData> outputs() {
    return outputs;
  }

  /**
   * Gets the settings.
   *
   * Environment variables for the Action.
   *
   * @return the settings
   */
  public List<VariableData> settings() {
    return settings;
  }

  /**
   * Gets the xGithubToken.
   *
   * The personal access token to authenticate with your private GitHub or GitLab repository and access your Terraform
   * template.
   *
   * @return the xGithubToken
   */
  public String xGithubToken() {
    return xGithubToken;
  }
}

