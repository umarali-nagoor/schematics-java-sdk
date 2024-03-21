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
 * Source of templates, playbooks, or controls.
 */
public class ExternalSourceLite extends GenericModel {

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

  @SerializedName("source_type")
  protected String sourceType;
  protected GitSourceLite git;
  protected CatalogSourceLite catalog;

  protected ExternalSourceLite() { }

  /**
   * Gets the sourceType.
   *
   * Type of source for the Template.
   *
   * @return the sourceType
   */
  public String getSourceType() {
    return sourceType;
  }

  /**
   * Gets the git.
   *
   * The connection details to the Git source repository.
   *
   * @return the git
   */
  public GitSourceLite getGit() {
    return git;
  }

  /**
   * Gets the catalog.
   *
   * The connection details to the IBM Cloud Catalog source.
   *
   * @return the catalog
   */
  public CatalogSourceLite getCatalog() {
    return catalog;
  }
}

