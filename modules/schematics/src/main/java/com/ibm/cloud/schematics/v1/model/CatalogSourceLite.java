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
 * The connection details to the IBM Cloud Catalog source.
 */
public class CatalogSourceLite extends GenericModel {

  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("catalog_id")
  protected String catalogId;
  @SerializedName("offering_name")
  protected String offeringName;
  @SerializedName("offering_version")
  protected String offeringVersion;
  @SerializedName("offering_kind")
  protected String offeringKind;
  @SerializedName("offering_target_kind")
  protected String offeringTargetKind;
  @SerializedName("offering_id")
  protected String offeringId;
  @SerializedName("offering_version_id")
  protected String offeringVersionId;
  @SerializedName("offering_version_flavour_name")
  protected String offeringVersionFlavourName;
  @SerializedName("item_id")
  protected String itemId;
  @SerializedName("item_name")
  protected String itemName;

  protected CatalogSourceLite() { }

  /**
   * Gets the catalogName.
   *
   * The name of the private catalog.
   *
   * @return the catalogName
   */
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * Gets the catalogId.
   *
   * The ID of a private catalog.
   *
   * @return the catalogId
   */
  public String getCatalogId() {
    return catalogId;
  }

  /**
   * Gets the offeringName.
   *
   * The name of an offering in the IBM Cloud Catalog.
   *
   * @return the offeringName
   */
  public String getOfferingName() {
    return offeringName;
  }

  /**
   * Gets the offeringVersion.
   *
   * The version of the software template that you chose to install from the IBM Cloud catalog.
   *
   * @return the offeringVersion
   */
  public String getOfferingVersion() {
    return offeringVersion;
  }

  /**
   * Gets the offeringKind.
   *
   * The type of an offering, in the IBM Cloud Catalog.
   *
   * @return the offeringKind
   */
  public String getOfferingKind() {
    return offeringKind;
  }

  /**
   * Gets the offeringTargetKind.
   *
   * Offering Target Kind.
   *
   * @return the offeringTargetKind
   */
  public String getOfferingTargetKind() {
    return offeringTargetKind;
  }

  /**
   * Gets the offeringId.
   *
   * The ID of an offering in the IBM Cloud Catalog.
   *
   * @return the offeringId
   */
  public String getOfferingId() {
    return offeringId;
  }

  /**
   * Gets the offeringVersionId.
   *
   * The ID of an offering version the IBM Cloud Catalog.
   *
   * @return the offeringVersionId
   */
  public String getOfferingVersionId() {
    return offeringVersionId;
  }

  /**
   * Gets the offeringVersionFlavourName.
   *
   * Offering version flavour name.
   *
   * @return the offeringVersionFlavourName
   */
  public String getOfferingVersionFlavourName() {
    return offeringVersionFlavourName;
  }

  /**
   * Gets the itemId.
   *
   * The ID of the software template that you chose to install from the IBM Cloud catalog. This software is provisioned
   * with Schematics.
   *
   * @return the itemId
   */
  public String getItemId() {
    return itemId;
  }

  /**
   * Gets the itemName.
   *
   * The name of the software that you chose to install from the IBM Cloud catalog.
   *
   * @return the itemName
   */
  public String getItemName() {
    return itemName;
  }
}

