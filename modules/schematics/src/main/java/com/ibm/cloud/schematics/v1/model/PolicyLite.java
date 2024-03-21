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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The summary of Schematics policy.
 */
public class PolicyLite extends GenericModel {

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
   * Policy kind or categories for managing and deriving policy decision
   *   * `agent_assignment_policy` Agent assignment policy for job execution.
   */
  public interface PolicyKind {
    /** agent_assignment_policy. */
    String AGENT_ASSIGNMENT_POLICY = "agent_assignment_policy";
  }

  protected String name;
  protected String id;
  protected String crn;
  protected String account;
  protected String description;
  @SerializedName("resource_group")
  protected String resourceGroup;
  protected List<String> tags;
  protected String location;
  protected UserState state;
  @SerializedName("policy_kind")
  protected String policyKind;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("updated_by")
  protected String updatedBy;

  protected PolicyLite() { }

  /**
   * Gets the name.
   *
   * The name of Schematics customization policy.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the id.
   *
   * The system generated Policy Id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * The policy CRN.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the account.
   *
   * The Account id.
   *
   * @return the account
   */
  public String getAccount() {
    return account;
  }

  /**
   * Gets the description.
   *
   * The description of Schematics customization policy.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the resourceGroup.
   *
   * Resource-group name for the Policy.  By default, Policy will be created in Default Resource Group.
   *
   * @return the resourceGroup
   */
  public String getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the tags.
   *
   * Tags for the Schematics customization policy.
   *
   * @return the tags
   */
  public List<String> getTags() {
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
  public String getLocation() {
    return location;
  }

  /**
   * Gets the state.
   *
   * User defined status of the Schematics object.
   *
   * @return the state
   */
  public UserState getState() {
    return state;
  }

  /**
   * Gets the policyKind.
   *
   * Policy kind or categories for managing and deriving policy decision
   *   * `agent_assignment_policy` Agent assignment policy for job execution.
   *
   * @return the policyKind
   */
  public String getPolicyKind() {
    return policyKind;
  }

  /**
   * Gets the createdAt.
   *
   * The policy creation time.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * The user who created the Policy.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the updatedAt.
   *
   * The policy updation time.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the updatedBy.
   *
   * The user who updated the policy.
   *
   * @return the updatedBy
   */
  public String getUpdatedBy() {
    return updatedBy;
  }
}

