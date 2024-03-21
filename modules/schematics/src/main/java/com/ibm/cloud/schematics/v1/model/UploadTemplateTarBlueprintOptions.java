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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The uploadTemplateTarBlueprint options.
 */
public class UploadTemplateTarBlueprintOptions extends GenericModel {

  protected String blueprintId;
  protected InputStream file;
  protected String fileContentType;

  /**
   * Builder.
   */
  public static class Builder {
    private String blueprintId;
    private InputStream file;
    private String fileContentType;

    /**
     * Instantiates a new Builder from an existing UploadTemplateTarBlueprintOptions instance.
     *
     * @param uploadTemplateTarBlueprintOptions the instance to initialize the Builder with
     */
    private Builder(UploadTemplateTarBlueprintOptions uploadTemplateTarBlueprintOptions) {
      this.blueprintId = uploadTemplateTarBlueprintOptions.blueprintId;
      this.file = uploadTemplateTarBlueprintOptions.file;
      this.fileContentType = uploadTemplateTarBlueprintOptions.fileContentType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param blueprintId the blueprintId
     */
    public Builder(String blueprintId) {
      this.blueprintId = blueprintId;
    }

    /**
     * Builds a UploadTemplateTarBlueprintOptions.
     *
     * @return the new UploadTemplateTarBlueprintOptions instance
     */
    public UploadTemplateTarBlueprintOptions build() {
      return new UploadTemplateTarBlueprintOptions(this);
    }

    /**
     * Set the blueprintId.
     *
     * @param blueprintId the blueprintId
     * @return the UploadTemplateTarBlueprintOptions builder
     */
    public Builder blueprintId(String blueprintId) {
      this.blueprintId = blueprintId;
      return this;
    }

    /**
     * Set the file.
     *
     * @param file the file
     * @return the UploadTemplateTarBlueprintOptions builder
     */
    public Builder file(InputStream file) {
      this.file = file;
      return this;
    }

    /**
     * Set the fileContentType.
     *
     * @param fileContentType the fileContentType
     * @return the UploadTemplateTarBlueprintOptions builder
     */
    public Builder fileContentType(String fileContentType) {
      this.fileContentType = fileContentType;
      return this;
    }

    /**
     * Set the file.
     *
     * @param file the file
     * @return the UploadTemplateTarBlueprintOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder file(File file) throws FileNotFoundException {
      this.file = new FileInputStream(file);
      return this;
    }
  }

  protected UploadTemplateTarBlueprintOptions() { }

  protected UploadTemplateTarBlueprintOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.blueprintId,
      "blueprintId cannot be empty");
    blueprintId = builder.blueprintId;
    file = builder.file;
    fileContentType = builder.fileContentType;
  }

  /**
   * New builder.
   *
   * @return a UploadTemplateTarBlueprintOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the blueprintId.
   *
   * Environment Id.  Use `GET /v2/blueprints` API to look up the order ids in your IBM Cloud account.
   *
   * @return the blueprintId
   */
  public String blueprintId() {
    return blueprintId;
  }

  /**
   * Gets the file.
   *
   * Template tar file.
   *
   * @return the file
   */
  public InputStream file() {
    return file;
  }

  /**
   * Gets the fileContentType.
   *
   * The content type of file. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the fileContentType
   */
  public String fileContentType() {
    return fileContentType;
  }
}

