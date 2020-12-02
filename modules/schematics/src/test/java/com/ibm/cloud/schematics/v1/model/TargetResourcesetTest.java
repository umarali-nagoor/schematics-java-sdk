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

import com.ibm.cloud.schematics.v1.model.SystemLock;
import com.ibm.cloud.schematics.v1.model.TargetResourceset;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TargetResourceset model.
 */
public class TargetResourcesetTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTargetResourceset() throws Throwable {
    SystemLock systemLockModel = new SystemLock.Builder()
      .sysLocked(true)
      .sysLockedBy("testString")
      .sysLockedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();
    assertEquals(systemLockModel.sysLocked(), Boolean.valueOf(true));
    assertEquals(systemLockModel.sysLockedBy(), "testString");
    assertEquals(systemLockModel.sysLockedAt(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));

    TargetResourceset targetResourcesetModel = new TargetResourceset.Builder()
      .name("testString")
      .type("testString")
      .description("testString")
      .resourceQuery("testString")
      .credential("testString")
      .sysLock(systemLockModel)
      .build();
    assertEquals(targetResourcesetModel.name(), "testString");
    assertEquals(targetResourcesetModel.type(), "testString");
    assertEquals(targetResourcesetModel.description(), "testString");
    assertEquals(targetResourcesetModel.resourceQuery(), "testString");
    assertEquals(targetResourcesetModel.credential(), "testString");
    assertEquals(targetResourcesetModel.sysLock(), systemLockModel);

    String json = TestUtilities.serialize(targetResourcesetModel);

    TargetResourceset targetResourcesetModelNew = TestUtilities.deserialize(json, TargetResourceset.class);
    assertTrue(targetResourcesetModelNew instanceof TargetResourceset);
    assertEquals(targetResourcesetModelNew.name(), "testString");
    assertEquals(targetResourcesetModelNew.type(), "testString");
    assertEquals(targetResourcesetModelNew.description(), "testString");
    assertEquals(targetResourcesetModelNew.resourceQuery(), "testString");
    assertEquals(targetResourcesetModelNew.credential(), "testString");
    assertEquals(targetResourcesetModelNew.sysLock().toString(), systemLockModel.toString());
  }
}