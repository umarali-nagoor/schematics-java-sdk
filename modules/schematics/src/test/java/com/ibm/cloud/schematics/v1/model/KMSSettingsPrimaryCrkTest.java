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

import com.ibm.cloud.schematics.v1.model.KMSSettingsPrimaryCrk;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the KMSSettingsPrimaryCrk model.
 */
public class KMSSettingsPrimaryCrkTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testKMSSettingsPrimaryCrk() throws Throwable {
    KMSSettingsPrimaryCrk kmsSettingsPrimaryCrkModel = new KMSSettingsPrimaryCrk.Builder()
      .kmsName("testString")
      .kmsPrivateEndpoint("testString")
      .keyCrn("testString")
      .build();
    assertEquals(kmsSettingsPrimaryCrkModel.kmsName(), "testString");
    assertEquals(kmsSettingsPrimaryCrkModel.kmsPrivateEndpoint(), "testString");
    assertEquals(kmsSettingsPrimaryCrkModel.keyCrn(), "testString");

    String json = TestUtilities.serialize(kmsSettingsPrimaryCrkModel);

    KMSSettingsPrimaryCrk kmsSettingsPrimaryCrkModelNew = TestUtilities.deserialize(json, KMSSettingsPrimaryCrk.class);
    assertTrue(kmsSettingsPrimaryCrkModelNew instanceof KMSSettingsPrimaryCrk);
    assertEquals(kmsSettingsPrimaryCrkModelNew.kmsName(), "testString");
    assertEquals(kmsSettingsPrimaryCrkModelNew.kmsPrivateEndpoint(), "testString");
    assertEquals(kmsSettingsPrimaryCrkModelNew.keyCrn(), "testString");
  }
}