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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SharedTargetDataResponse -.
 */
public class SharedTargetDataResponse extends GenericModel {

  @SerializedName("cluster_id")
  protected String clusterId;
  @SerializedName("cluster_name")
  protected String clusterName;
  @SerializedName("entitlement_keys")
  protected List<Object> entitlementKeys;
  protected String namespace;
  protected String region;
  @SerializedName("resource_group_id")
  protected String resourceGroupId;

  /**
   * Gets the clusterId.
   *
   * Target cluster id.
   *
   * @return the clusterId
   */
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Gets the clusterName.
   *
   * Target cluster name.
   *
   * @return the clusterName
   */
  public String getClusterName() {
    return clusterName;
  }

  /**
   * Gets the entitlementKeys.
   *
   * Entitlement keys.
   *
   * @return the entitlementKeys
   */
  public List<Object> getEntitlementKeys() {
    return entitlementKeys;
  }

  /**
   * Gets the namespace.
   *
   * Target namespace.
   *
   * @return the namespace
   */
  public String getNamespace() {
    return namespace;
  }

  /**
   * Gets the region.
   *
   * Target region.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the resourceGroupId.
   *
   * Target resource group id.
   *
   * @return the resourceGroupId
   */
  public String getResourceGroupId() {
    return resourceGroupId;
  }
}

