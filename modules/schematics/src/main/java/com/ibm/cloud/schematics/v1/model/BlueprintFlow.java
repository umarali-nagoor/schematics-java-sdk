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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Flow definitions for all the blueprint command.
 */
public class BlueprintFlow extends GenericModel {

  protected List<BlueprintFlowSpecs> specs;

  /**
   * Builder.
   */
  public static class Builder {

    /**
     * Instantiates a new Builder from an existing BlueprintFlow instance.
     *
     * @param blueprintFlow the instance to initialize the Builder with
     */
    private Builder(BlueprintFlow blueprintFlow) {
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BlueprintFlow.
     *
     * @return the new BlueprintFlow instance
     */
    public BlueprintFlow build() {
      return new BlueprintFlow(this);
    }
  }

  protected BlueprintFlow() { }

  protected BlueprintFlow(Builder builder) {
  }

  /**
   * New builder.
   *
   * @return a BlueprintFlow builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the specs.
   *
   * Blueprint flow specification.
   *
   * @return the specs
   */
  public List<BlueprintFlowSpecs> specs() {
    return specs;
  }
}

