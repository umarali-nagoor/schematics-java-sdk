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

import com.ibm.cloud.schematics.v1.model.ReplaceSharedDatasetOptions;
import com.ibm.cloud.schematics.v1.model.SharedDatasetData;
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
 * Unit test class for the ReplaceSharedDatasetOptions model.
 */
public class ReplaceSharedDatasetOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceSharedDatasetOptions() throws Throwable {
    SharedDatasetData sharedDatasetDataModel = new SharedDatasetData.Builder()
      .defaultValue("testString")
      .description("testString")
      .hidden(true)
      .immutable(true)
      .matches("testString")
      .maxValue("testString")
      .maxValueLen("testString")
      .minValue("testString")
      .minValueLen("testString")
      .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .overrideValue("testString")
      .secure(true)
      .varAliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .varName("testString")
      .varRef("testString")
      .varType("testString")
      .build();
    assertEquals(sharedDatasetDataModel.defaultValue(), "testString");
    assertEquals(sharedDatasetDataModel.description(), "testString");
    assertEquals(sharedDatasetDataModel.hidden(), Boolean.valueOf(true));
    assertEquals(sharedDatasetDataModel.immutable(), Boolean.valueOf(true));
    assertEquals(sharedDatasetDataModel.matches(), "testString");
    assertEquals(sharedDatasetDataModel.maxValue(), "testString");
    assertEquals(sharedDatasetDataModel.maxValueLen(), "testString");
    assertEquals(sharedDatasetDataModel.minValue(), "testString");
    assertEquals(sharedDatasetDataModel.minValueLen(), "testString");
    assertEquals(sharedDatasetDataModel.options(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(sharedDatasetDataModel.overrideValue(), "testString");
    assertEquals(sharedDatasetDataModel.secure(), Boolean.valueOf(true));
    assertEquals(sharedDatasetDataModel.varAliases(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(sharedDatasetDataModel.varName(), "testString");
    assertEquals(sharedDatasetDataModel.varRef(), "testString");
    assertEquals(sharedDatasetDataModel.varType(), "testString");

    ReplaceSharedDatasetOptions replaceSharedDatasetOptionsModel = new ReplaceSharedDatasetOptions.Builder()
      .sdId("testString")
      .autoPropagateChange(true)
      .description("testString")
      .effectedWorkspaceIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .resourceGroup("testString")
      .sharedDatasetData(new java.util.ArrayList<SharedDatasetData>(java.util.Arrays.asList(sharedDatasetDataModel)))
      .sharedDatasetName("testString")
      .sharedDatasetSourceName("testString")
      .sharedDatasetType(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .version("testString")
      .build();
    assertEquals(replaceSharedDatasetOptionsModel.sdId(), "testString");
    assertEquals(replaceSharedDatasetOptionsModel.autoPropagateChange(), Boolean.valueOf(true));
    assertEquals(replaceSharedDatasetOptionsModel.description(), "testString");
    assertEquals(replaceSharedDatasetOptionsModel.effectedWorkspaceIds(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(replaceSharedDatasetOptionsModel.resourceGroup(), "testString");
    assertEquals(replaceSharedDatasetOptionsModel.sharedDatasetData(), new java.util.ArrayList<SharedDatasetData>(java.util.Arrays.asList(sharedDatasetDataModel)));
    assertEquals(replaceSharedDatasetOptionsModel.sharedDatasetName(), "testString");
    assertEquals(replaceSharedDatasetOptionsModel.sharedDatasetSourceName(), "testString");
    assertEquals(replaceSharedDatasetOptionsModel.sharedDatasetType(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(replaceSharedDatasetOptionsModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(replaceSharedDatasetOptionsModel.version(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceSharedDatasetOptionsError() throws Throwable {
    new ReplaceSharedDatasetOptions.Builder().build();
  }

}