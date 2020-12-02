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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * WorkspaceStatusResponse -.
 */
public class WorkspaceStatusResponse extends GenericModel {

  protected Boolean frozen;
  @SerializedName("frozen_at")
  protected Date frozenAt;
  @SerializedName("frozen_by")
  protected String frozenBy;
  protected Boolean locked;
  @SerializedName("locked_by")
  protected String lockedBy;
  @SerializedName("locked_time")
  protected Date lockedTime;

  /**
   * Gets the frozen.
   *
   * Frozen status.
   *
   * @return the frozen
   */
  public Boolean isFrozen() {
    return frozen;
  }

  /**
   * Gets the frozenAt.
   *
   * Frozen at.
   *
   * @return the frozenAt
   */
  public Date getFrozenAt() {
    return frozenAt;
  }

  /**
   * Gets the frozenBy.
   *
   * Frozen by.
   *
   * @return the frozenBy
   */
  public String getFrozenBy() {
    return frozenBy;
  }

  /**
   * Gets the locked.
   *
   * Locked status.
   *
   * @return the locked
   */
  public Boolean isLocked() {
    return locked;
  }

  /**
   * Gets the lockedBy.
   *
   * Locked by.
   *
   * @return the lockedBy
   */
  public String getLockedBy() {
    return lockedBy;
  }

  /**
   * Gets the lockedTime.
   *
   * Locked at.
   *
   * @return the lockedTime
   */
  public Date getLockedTime() {
    return lockedTime;
  }
}

