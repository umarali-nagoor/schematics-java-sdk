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
 * The secondary kms instance details.
 */
public class KMSSettingsSecondaryCrk extends GenericModel {

  @SerializedName("kms_name")
  protected String kmsName;
  @SerializedName("kms_private_endpoint")
  protected String kmsPrivateEndpoint;
  @SerializedName("key_crn")
  protected String keyCrn;

  /**
   * Builder.
   */
  public static class Builder {
    private String kmsName;
    private String kmsPrivateEndpoint;
    private String keyCrn;

    /**
     * Instantiates a new Builder from an existing KMSSettingsSecondaryCrk instance.
     *
     * @param kmsSettingsSecondaryCrk the instance to initialize the Builder with
     */
    private Builder(KMSSettingsSecondaryCrk kmsSettingsSecondaryCrk) {
      this.kmsName = kmsSettingsSecondaryCrk.kmsName;
      this.kmsPrivateEndpoint = kmsSettingsSecondaryCrk.kmsPrivateEndpoint;
      this.keyCrn = kmsSettingsSecondaryCrk.keyCrn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a KMSSettingsSecondaryCrk.
     *
     * @return the new KMSSettingsSecondaryCrk instance
     */
    public KMSSettingsSecondaryCrk build() {
      return new KMSSettingsSecondaryCrk(this);
    }

    /**
     * Set the kmsName.
     *
     * @param kmsName the kmsName
     * @return the KMSSettingsSecondaryCrk builder
     */
    public Builder kmsName(String kmsName) {
      this.kmsName = kmsName;
      return this;
    }

    /**
     * Set the kmsPrivateEndpoint.
     *
     * @param kmsPrivateEndpoint the kmsPrivateEndpoint
     * @return the KMSSettingsSecondaryCrk builder
     */
    public Builder kmsPrivateEndpoint(String kmsPrivateEndpoint) {
      this.kmsPrivateEndpoint = kmsPrivateEndpoint;
      return this;
    }

    /**
     * Set the keyCrn.
     *
     * @param keyCrn the keyCrn
     * @return the KMSSettingsSecondaryCrk builder
     */
    public Builder keyCrn(String keyCrn) {
      this.keyCrn = keyCrn;
      return this;
    }
  }

  protected KMSSettingsSecondaryCrk() { }

  protected KMSSettingsSecondaryCrk(Builder builder) {
    kmsName = builder.kmsName;
    kmsPrivateEndpoint = builder.kmsPrivateEndpoint;
    keyCrn = builder.keyCrn;
  }

  /**
   * New builder.
   *
   * @return a KMSSettingsSecondaryCrk builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the kmsName.
   *
   * The secondary kms instance name.
   *
   * @return the kmsName
   */
  public String kmsName() {
    return kmsName;
  }

  /**
   * Gets the kmsPrivateEndpoint.
   *
   * The secondary kms instance private endpoint.
   *
   * @return the kmsPrivateEndpoint
   */
  public String kmsPrivateEndpoint() {
    return kmsPrivateEndpoint;
  }

  /**
   * Gets the keyCrn.
   *
   * The CRN of the secondary key.
   *
   * @return the keyCrn
   */
  public String keyCrn() {
    return keyCrn;
  }
}

