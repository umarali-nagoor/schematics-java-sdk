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

import com.ibm.cloud.schematics.v1.model.BlueprintLiteState;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BlueprintLiteState model.
 */
public class BlueprintLiteStateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBlueprintLiteState() throws Throwable {
    BlueprintLiteState blueprintLiteStateModel = new BlueprintLiteState.Builder()
      .statusCode("Blueprint_Create_Init")
      .statusMessage("testString")
      .summaryStatus("Blueprint_Normal")
      .configStatus("Blueprint_Config_Draft")
      .planStatus("Blueprint_Plan_None")
      .runStatus("Blueprint_Run_Plan")
      .resourceStatus("Blueprint_Resource_Drifted")
      .build();
    assertEquals(blueprintLiteStateModel.statusCode(), "Blueprint_Create_Init");
    assertEquals(blueprintLiteStateModel.statusMessage(), "testString");
    assertEquals(blueprintLiteStateModel.summaryStatus(), "Blueprint_Normal");
    assertEquals(blueprintLiteStateModel.configStatus(), "Blueprint_Config_Draft");
    assertEquals(blueprintLiteStateModel.planStatus(), "Blueprint_Plan_None");
    assertEquals(blueprintLiteStateModel.runStatus(), "Blueprint_Run_Plan");
    assertEquals(blueprintLiteStateModel.resourceStatus(), "Blueprint_Resource_Drifted");

    String json = TestUtilities.serialize(blueprintLiteStateModel);

    BlueprintLiteState blueprintLiteStateModelNew = TestUtilities.deserialize(json, BlueprintLiteState.class);
    assertTrue(blueprintLiteStateModelNew instanceof BlueprintLiteState);
    assertEquals(blueprintLiteStateModelNew.statusCode(), "Blueprint_Create_Init");
    assertEquals(blueprintLiteStateModelNew.statusMessage(), "testString");
    assertEquals(blueprintLiteStateModelNew.summaryStatus(), "Blueprint_Normal");
    assertEquals(blueprintLiteStateModelNew.configStatus(), "Blueprint_Config_Draft");
    assertEquals(blueprintLiteStateModelNew.planStatus(), "Blueprint_Plan_None");
    assertEquals(blueprintLiteStateModelNew.runStatus(), "Blueprint_Run_Plan");
    assertEquals(blueprintLiteStateModelNew.resourceStatus(), "Blueprint_Resource_Drifted");
  }
}