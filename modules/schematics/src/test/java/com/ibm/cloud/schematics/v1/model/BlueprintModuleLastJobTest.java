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

import com.ibm.cloud.schematics.v1.model.BlueprintModuleLastJob;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BlueprintModuleLastJob model.
 */
public class BlueprintModuleLastJobTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBlueprintModuleLastJob() throws Throwable {
    BlueprintModuleLastJob blueprintModuleLastJobModel = new BlueprintModuleLastJob.Builder()
      .commandObject("workspace")
      .commandObjectName("testString")
      .commandObjectId("testString")
      .commandName("workspace_plan")
      .jobStatus("job_pending")
      .build();
    assertEquals(blueprintModuleLastJobModel.commandObject(), "workspace");
    assertEquals(blueprintModuleLastJobModel.commandObjectName(), "testString");
    assertEquals(blueprintModuleLastJobModel.commandObjectId(), "testString");
    assertEquals(blueprintModuleLastJobModel.commandName(), "workspace_plan");
    assertEquals(blueprintModuleLastJobModel.jobStatus(), "job_pending");

    String json = TestUtilities.serialize(blueprintModuleLastJobModel);

    BlueprintModuleLastJob blueprintModuleLastJobModelNew = TestUtilities.deserialize(json, BlueprintModuleLastJob.class);
    assertTrue(blueprintModuleLastJobModelNew instanceof BlueprintModuleLastJob);
    assertEquals(blueprintModuleLastJobModelNew.commandObject(), "workspace");
    assertEquals(blueprintModuleLastJobModelNew.commandObjectName(), "testString");
    assertEquals(blueprintModuleLastJobModelNew.commandObjectId(), "testString");
    assertEquals(blueprintModuleLastJobModelNew.commandName(), "workspace_plan");
    assertEquals(blueprintModuleLastJobModelNew.jobStatus(), "job_pending");
  }
}