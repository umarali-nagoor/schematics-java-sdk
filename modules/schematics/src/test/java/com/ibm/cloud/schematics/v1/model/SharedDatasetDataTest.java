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
 * Unit test class for the SharedDatasetData model.
 */
public class SharedDatasetDataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSharedDatasetData() throws Throwable {
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

    String json = TestUtilities.serialize(sharedDatasetDataModel);

    SharedDatasetData sharedDatasetDataModelNew = TestUtilities.deserialize(json, SharedDatasetData.class);
    assertTrue(sharedDatasetDataModelNew instanceof SharedDatasetData);
    assertEquals(sharedDatasetDataModelNew.defaultValue(), "testString");
    assertEquals(sharedDatasetDataModelNew.description(), "testString");
    assertEquals(sharedDatasetDataModelNew.hidden(), Boolean.valueOf(true));
    assertEquals(sharedDatasetDataModelNew.immutable(), Boolean.valueOf(true));
    assertEquals(sharedDatasetDataModelNew.matches(), "testString");
    assertEquals(sharedDatasetDataModelNew.maxValue(), "testString");
    assertEquals(sharedDatasetDataModelNew.maxValueLen(), "testString");
    assertEquals(sharedDatasetDataModelNew.minValue(), "testString");
    assertEquals(sharedDatasetDataModelNew.minValueLen(), "testString");
    assertEquals(sharedDatasetDataModelNew.overrideValue(), "testString");
    assertEquals(sharedDatasetDataModelNew.secure(), Boolean.valueOf(true));
    assertEquals(sharedDatasetDataModelNew.varName(), "testString");
    assertEquals(sharedDatasetDataModelNew.varRef(), "testString");
    assertEquals(sharedDatasetDataModelNew.varType(), "testString");
  }
}