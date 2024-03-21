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
 * BlueprintFlowSequenceFlow.
 */
public class BlueprintFlowSequenceFlow extends GenericModel {

  @SerializedName("sequence_number")
  protected Long sequenceNumber;
  @SerializedName("item_name")
  protected String itemName;

  /**
   * Builder.
   */
  public static class Builder {
    private Long sequenceNumber;
    private String itemName;

    /**
     * Instantiates a new Builder from an existing BlueprintFlowSequenceFlow instance.
     *
     * @param blueprintFlowSequenceFlow the instance to initialize the Builder with
     */
    private Builder(BlueprintFlowSequenceFlow blueprintFlowSequenceFlow) {
      this.sequenceNumber = blueprintFlowSequenceFlow.sequenceNumber;
      this.itemName = blueprintFlowSequenceFlow.itemName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BlueprintFlowSequenceFlow.
     *
     * @return the new BlueprintFlowSequenceFlow instance
     */
    public BlueprintFlowSequenceFlow build() {
      return new BlueprintFlowSequenceFlow(this);
    }

    /**
     * Set the sequenceNumber.
     *
     * @param sequenceNumber the sequenceNumber
     * @return the BlueprintFlowSequenceFlow builder
     */
    public Builder sequenceNumber(long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
    }

    /**
     * Set the itemName.
     *
     * @param itemName the itemName
     * @return the BlueprintFlowSequenceFlow builder
     */
    public Builder itemName(String itemName) {
      this.itemName = itemName;
      return this;
    }
  }

  protected BlueprintFlowSequenceFlow() { }

  protected BlueprintFlowSequenceFlow(Builder builder) {
    sequenceNumber = builder.sequenceNumber;
    itemName = builder.itemName;
  }

  /**
   * New builder.
   *
   * @return a BlueprintFlowSequenceFlow builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sequenceNumber.
   *
   * Sequence number in the order or execution.
   *
   * @return the sequenceNumber
   */
  public Long sequenceNumber() {
    return sequenceNumber;
  }

  /**
   * Gets the itemName.
   *
   * Name of the layer or module to run this command.
   *
   * @return the itemName
   */
  public String itemName() {
    return itemName;
  }
}

