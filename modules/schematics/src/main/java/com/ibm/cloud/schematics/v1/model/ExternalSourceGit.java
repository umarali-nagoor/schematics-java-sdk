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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Connection details to Git source.
 */
public class ExternalSourceGit extends GenericModel {

  @SerializedName("git_repo_url")
  protected String gitRepoUrl;
  @SerializedName("git_token")
  protected String gitToken;
  @SerializedName("git_repo_folder")
  protected String gitRepoFolder;
  @SerializedName("git_release")
  protected String gitRelease;
  @SerializedName("git_branch")
  protected String gitBranch;

  /**
   * Builder.
   */
  public static class Builder {
    private String gitRepoUrl;
    private String gitToken;
    private String gitRepoFolder;
    private String gitRelease;
    private String gitBranch;

    private Builder(ExternalSourceGit externalSourceGit) {
      this.gitRepoUrl = externalSourceGit.gitRepoUrl;
      this.gitToken = externalSourceGit.gitToken;
      this.gitRepoFolder = externalSourceGit.gitRepoFolder;
      this.gitRelease = externalSourceGit.gitRelease;
      this.gitBranch = externalSourceGit.gitBranch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ExternalSourceGit.
     *
     * @return the new ExternalSourceGit instance
     */
    public ExternalSourceGit build() {
      return new ExternalSourceGit(this);
    }

    /**
     * Set the gitRepoUrl.
     *
     * @param gitRepoUrl the gitRepoUrl
     * @return the ExternalSourceGit builder
     */
    public Builder gitRepoUrl(String gitRepoUrl) {
      this.gitRepoUrl = gitRepoUrl;
      return this;
    }

    /**
     * Set the gitToken.
     *
     * @param gitToken the gitToken
     * @return the ExternalSourceGit builder
     */
    public Builder gitToken(String gitToken) {
      this.gitToken = gitToken;
      return this;
    }

    /**
     * Set the gitRepoFolder.
     *
     * @param gitRepoFolder the gitRepoFolder
     * @return the ExternalSourceGit builder
     */
    public Builder gitRepoFolder(String gitRepoFolder) {
      this.gitRepoFolder = gitRepoFolder;
      return this;
    }

    /**
     * Set the gitRelease.
     *
     * @param gitRelease the gitRelease
     * @return the ExternalSourceGit builder
     */
    public Builder gitRelease(String gitRelease) {
      this.gitRelease = gitRelease;
      return this;
    }

    /**
     * Set the gitBranch.
     *
     * @param gitBranch the gitBranch
     * @return the ExternalSourceGit builder
     */
    public Builder gitBranch(String gitBranch) {
      this.gitBranch = gitBranch;
      return this;
    }
  }

  protected ExternalSourceGit(Builder builder) {
    gitRepoUrl = builder.gitRepoUrl;
    gitToken = builder.gitToken;
    gitRepoFolder = builder.gitRepoFolder;
    gitRelease = builder.gitRelease;
    gitBranch = builder.gitBranch;
  }

  /**
   * New builder.
   *
   * @return a ExternalSourceGit builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the gitRepoUrl.
   *
   * URL to the GIT Repo that can be used to clone the template.
   *
   * @return the gitRepoUrl
   */
  public String gitRepoUrl() {
    return gitRepoUrl;
  }

  /**
   * Gets the gitToken.
   *
   * Personal Access Token to connect to Git URLs.
   *
   * @return the gitToken
   */
  public String gitToken() {
    return gitToken;
  }

  /**
   * Gets the gitRepoFolder.
   *
   * Name of the folder in the Git Repo, that contains the template.
   *
   * @return the gitRepoFolder
   */
  public String gitRepoFolder() {
    return gitRepoFolder;
  }

  /**
   * Gets the gitRelease.
   *
   * Name of the release tag, used to fetch the Git Repo.
   *
   * @return the gitRelease
   */
  public String gitRelease() {
    return gitRelease;
  }

  /**
   * Gets the gitBranch.
   *
   * Name of the branch, used to fetch the Git Repo.
   *
   * @return the gitBranch
   */
  public String gitBranch() {
    return gitBranch;
  }
}

