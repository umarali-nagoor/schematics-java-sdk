/*
 * (C) Copyright IBM Corp. 2021.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SharedDatasetData ...
 */
public class SharedDatasetData extends GenericModel {

  @SerializedName("default_value")
  protected String defaultValue;
  protected String description;
  protected Boolean hidden;
  protected Boolean immutable;
  protected String matches;
  @SerializedName("max_value")
  protected String maxValue;
  @SerializedName("max_value_len")
  protected String maxValueLen;
  @SerializedName("min_value")
  protected String minValue;
  @SerializedName("min_value_len")
  protected String minValueLen;
  protected List<String> options;
  @SerializedName("override_value")
  protected String overrideValue;
  protected Boolean secure;
  @SerializedName("var_aliases")
  protected List<String> varAliases;
  @SerializedName("var_name")
  protected String varName;
  @SerializedName("var_ref")
  protected String varRef;
  @SerializedName("var_type")
  protected String varType;

  /**
   * Builder.
   */
  public static class Builder {
    private String defaultValue;
    private String description;
    private Boolean hidden;
    private Boolean immutable;
    private String matches;
    private String maxValue;
    private String maxValueLen;
    private String minValue;
    private String minValueLen;
    private List<String> options;
    private String overrideValue;
    private Boolean secure;
    private List<String> varAliases;
    private String varName;
    private String varRef;
    private String varType;

    private Builder(SharedDatasetData sharedDatasetData) {
      this.defaultValue = sharedDatasetData.defaultValue;
      this.description = sharedDatasetData.description;
      this.hidden = sharedDatasetData.hidden;
      this.immutable = sharedDatasetData.immutable;
      this.matches = sharedDatasetData.matches;
      this.maxValue = sharedDatasetData.maxValue;
      this.maxValueLen = sharedDatasetData.maxValueLen;
      this.minValue = sharedDatasetData.minValue;
      this.minValueLen = sharedDatasetData.minValueLen;
      this.options = sharedDatasetData.options;
      this.overrideValue = sharedDatasetData.overrideValue;
      this.secure = sharedDatasetData.secure;
      this.varAliases = sharedDatasetData.varAliases;
      this.varName = sharedDatasetData.varName;
      this.varRef = sharedDatasetData.varRef;
      this.varType = sharedDatasetData.varType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SharedDatasetData.
     *
     * @return the new SharedDatasetData instance
     */
    public SharedDatasetData build() {
      return new SharedDatasetData(this);
    }

    /**
     * Adds an options to options.
     *
     * @param options the new options
     * @return the SharedDatasetData builder
     */
    public Builder addOptions(String options) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(options,
        "options cannot be null");
      if (this.options == null) {
        this.options = new ArrayList<String>();
      }
      this.options.add(options);
      return this;
    }

    /**
     * Adds an varAliases to varAliases.
     *
     * @param varAliases the new varAliases
     * @return the SharedDatasetData builder
     */
    public Builder addVarAliases(String varAliases) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(varAliases,
        "varAliases cannot be null");
      if (this.varAliases == null) {
        this.varAliases = new ArrayList<String>();
      }
      this.varAliases.add(varAliases);
      return this;
    }

    /**
     * Set the defaultValue.
     *
     * @param defaultValue the defaultValue
     * @return the SharedDatasetData builder
     */
    public Builder defaultValue(String defaultValue) {
      this.defaultValue = defaultValue;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the SharedDatasetData builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the hidden.
     *
     * @param hidden the hidden
     * @return the SharedDatasetData builder
     */
    public Builder hidden(Boolean hidden) {
      this.hidden = hidden;
      return this;
    }

    /**
     * Set the immutable.
     *
     * @param immutable the immutable
     * @return the SharedDatasetData builder
     */
    public Builder immutable(Boolean immutable) {
      this.immutable = immutable;
      return this;
    }

    /**
     * Set the matches.
     *
     * @param matches the matches
     * @return the SharedDatasetData builder
     */
    public Builder matches(String matches) {
      this.matches = matches;
      return this;
    }

    /**
     * Set the maxValue.
     *
     * @param maxValue the maxValue
     * @return the SharedDatasetData builder
     */
    public Builder maxValue(String maxValue) {
      this.maxValue = maxValue;
      return this;
    }

    /**
     * Set the maxValueLen.
     *
     * @param maxValueLen the maxValueLen
     * @return the SharedDatasetData builder
     */
    public Builder maxValueLen(String maxValueLen) {
      this.maxValueLen = maxValueLen;
      return this;
    }

    /**
     * Set the minValue.
     *
     * @param minValue the minValue
     * @return the SharedDatasetData builder
     */
    public Builder minValue(String minValue) {
      this.minValue = minValue;
      return this;
    }

    /**
     * Set the minValueLen.
     *
     * @param minValueLen the minValueLen
     * @return the SharedDatasetData builder
     */
    public Builder minValueLen(String minValueLen) {
      this.minValueLen = minValueLen;
      return this;
    }

    /**
     * Set the options.
     * Existing options will be replaced.
     *
     * @param options the options
     * @return the SharedDatasetData builder
     */
    public Builder options(List<String> options) {
      this.options = options;
      return this;
    }

    /**
     * Set the overrideValue.
     *
     * @param overrideValue the overrideValue
     * @return the SharedDatasetData builder
     */
    public Builder overrideValue(String overrideValue) {
      this.overrideValue = overrideValue;
      return this;
    }

    /**
     * Set the secure.
     *
     * @param secure the secure
     * @return the SharedDatasetData builder
     */
    public Builder secure(Boolean secure) {
      this.secure = secure;
      return this;
    }

    /**
     * Set the varAliases.
     * Existing varAliases will be replaced.
     *
     * @param varAliases the varAliases
     * @return the SharedDatasetData builder
     */
    public Builder varAliases(List<String> varAliases) {
      this.varAliases = varAliases;
      return this;
    }

    /**
     * Set the varName.
     *
     * @param varName the varName
     * @return the SharedDatasetData builder
     */
    public Builder varName(String varName) {
      this.varName = varName;
      return this;
    }

    /**
     * Set the varRef.
     *
     * @param varRef the varRef
     * @return the SharedDatasetData builder
     */
    public Builder varRef(String varRef) {
      this.varRef = varRef;
      return this;
    }

    /**
     * Set the varType.
     *
     * @param varType the varType
     * @return the SharedDatasetData builder
     */
    public Builder varType(String varType) {
      this.varType = varType;
      return this;
    }
  }

  protected SharedDatasetData(Builder builder) {
    defaultValue = builder.defaultValue;
    description = builder.description;
    hidden = builder.hidden;
    immutable = builder.immutable;
    matches = builder.matches;
    maxValue = builder.maxValue;
    maxValueLen = builder.maxValueLen;
    minValue = builder.minValue;
    minValueLen = builder.minValueLen;
    options = builder.options;
    overrideValue = builder.overrideValue;
    secure = builder.secure;
    varAliases = builder.varAliases;
    varName = builder.varName;
    varRef = builder.varRef;
    varType = builder.varType;
  }

  /**
   * New builder.
   *
   * @return a SharedDatasetData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the defaultValue.
   *
   * Default values.
   *
   * @return the defaultValue
   */
  public String defaultValue() {
    return defaultValue;
  }

  /**
   * Gets the description.
   *
   * Data description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the hidden.
   *
   * Data is hidden.
   *
   * @return the hidden
   */
  public Boolean hidden() {
    return hidden;
  }

  /**
   * Gets the immutable.
   *
   * Data is readonly.
   *
   * @return the immutable
   */
  public Boolean immutable() {
    return immutable;
  }

  /**
   * Gets the matches.
   *
   * Data is matches regular expression.
   *
   * @return the matches
   */
  public String matches() {
    return matches;
  }

  /**
   * Gets the maxValue.
   *
   * Max value of the data.
   *
   * @return the maxValue
   */
  public String maxValue() {
    return maxValue;
  }

  /**
   * Gets the maxValueLen.
   *
   * Max string length of the data.
   *
   * @return the maxValueLen
   */
  public String maxValueLen() {
    return maxValueLen;
  }

  /**
   * Gets the minValue.
   *
   * Min value of the data.
   *
   * @return the minValue
   */
  public String minValue() {
    return minValue;
  }

  /**
   * Gets the minValueLen.
   *
   * Min string length of the data.
   *
   * @return the minValueLen
   */
  public String minValueLen() {
    return minValueLen;
  }

  /**
   * Gets the options.
   *
   * Possible options for the Data.
   *
   * @return the options
   */
  public List<String> options() {
    return options;
  }

  /**
   * Gets the overrideValue.
   *
   * Override value for the Data.
   *
   * @return the overrideValue
   */
  public String overrideValue() {
    return overrideValue;
  }

  /**
   * Gets the secure.
   *
   * Data is secure.
   *
   * @return the secure
   */
  public Boolean secure() {
    return secure;
  }

  /**
   * Gets the varAliases.
   *
   * Alias strings for the variable names.
   *
   * @return the varAliases
   */
  public List<String> varAliases() {
    return varAliases;
  }

  /**
   * Gets the varName.
   *
   * Variable name.
   *
   * @return the varName
   */
  public String varName() {
    return varName;
  }

  /**
   * Gets the varRef.
   *
   * Variable reference.
   *
   * @return the varRef
   */
  public String varRef() {
    return varRef;
  }

  /**
   * Gets the varType.
   *
   * Variable type.
   *
   * @return the varType
   */
  public String varType() {
    return varType;
  }
}

