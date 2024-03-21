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
 * The connection details to the Git source repository.
 */
public class GitSourceLite extends GenericModel {

  @SerializedName("git_repo_url")
  protected String gitRepoUrl;
  @SerializedName("git_release")
  protected String gitRelease;
  @SerializedName("git_branch")
  protected String gitBranch;
  @SerializedName("git_repo_folder")
  protected String gitRepoFolder;

  protected GitSourceLite() { }

  /**
   * Gets the gitRepoUrl.
   *
   * The URL to the Git repository that can be used to clone the template.
   *
   * @return the gitRepoUrl
   */
  public String getGitRepoUrl() {
    return gitRepoUrl;
  }

  /**
   * Gets the gitRelease.
   *
   * The name of the release tag that are used to fetch the Git repository.
   *
   * @return the gitRelease
   */
  public String getGitRelease() {
    return gitRelease;
  }

  /**
   * Gets the gitBranch.
   *
   * The name of the branch that are used to fetch the Git repository.
   *
   * @return the gitBranch
   */
  public String getGitBranch() {
    return gitBranch;
  }

  /**
   * Gets the gitRepoFolder.
   *
   * The name of the folder in the Git repository, that contains the template.
   *
   * @return the gitRepoFolder
   */
  public String getGitRepoFolder() {
    return gitRepoFolder;
  }
}

