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

import com.ibm.cloud.schematics.v1.model.GetBlueprintOptions;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetBlueprintOptions model.
 */
public class GetBlueprintOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetBlueprintOptions() throws Throwable {
    GetBlueprintOptions getBlueprintOptionsModel = new GetBlueprintOptions.Builder()
      .blueprintId("testString")
      .profile("ids")
      .build();
    assertEquals(getBlueprintOptionsModel.blueprintId(), "testString");
    assertEquals(getBlueprintOptionsModel.profile(), "ids");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetBlueprintOptionsError() throws Throwable {
    new GetBlueprintOptions.Builder().build();
  }

}