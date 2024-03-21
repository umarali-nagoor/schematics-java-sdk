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

import com.ibm.cloud.schematics.v1.model.ActionState;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ActionState model.
 */
public class ActionStateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testActionState() throws Throwable {
    ActionState actionStateModel = new ActionState.Builder()
      .statusCode("normal")
      .statusJobId("testString")
      .statusMessage("testString")
      .build();
    assertEquals(actionStateModel.statusCode(), "normal");
    assertEquals(actionStateModel.statusJobId(), "testString");
    assertEquals(actionStateModel.statusMessage(), "testString");

    String json = TestUtilities.serialize(actionStateModel);

    ActionState actionStateModelNew = TestUtilities.deserialize(json, ActionState.class);
    assertTrue(actionStateModelNew instanceof ActionState);
    assertEquals(actionStateModelNew.statusCode(), "normal");
    assertEquals(actionStateModelNew.statusJobId(), "testString");
    assertEquals(actionStateModelNew.statusMessage(), "testString");
  }
}