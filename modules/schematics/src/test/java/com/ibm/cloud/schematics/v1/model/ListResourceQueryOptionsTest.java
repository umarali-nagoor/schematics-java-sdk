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

import com.ibm.cloud.schematics.v1.model.ListResourceQueryOptions;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListResourceQueryOptions model.
 */
public class ListResourceQueryOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListResourceQueryOptions() throws Throwable {
    ListResourceQueryOptions listResourceQueryOptionsModel = new ListResourceQueryOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("100"))
      .sort("testString")
      .profile("ids")
      .build();
    assertEquals(listResourceQueryOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(listResourceQueryOptionsModel.limit(), Long.valueOf("100"));
    assertEquals(listResourceQueryOptionsModel.sort(), "testString");
    assertEquals(listResourceQueryOptionsModel.profile(), "ids");
  }
}