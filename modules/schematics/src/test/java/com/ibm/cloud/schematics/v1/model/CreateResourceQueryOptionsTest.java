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

import com.ibm.cloud.schematics.v1.model.CreateResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.ResourceQuery;
import com.ibm.cloud.schematics.v1.model.ResourceQueryParam;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateResourceQueryOptions model.
 */
public class CreateResourceQueryOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateResourceQueryOptions() throws Throwable {
    ResourceQueryParam resourceQueryParamModel = new ResourceQueryParam.Builder()
      .name("testString")
      .value("testString")
      .description("testString")
      .build();
    assertEquals(resourceQueryParamModel.name(), "testString");
    assertEquals(resourceQueryParamModel.value(), "testString");
    assertEquals(resourceQueryParamModel.description(), "testString");

    ResourceQuery resourceQueryModel = new ResourceQuery.Builder()
      .queryType("workspaces")
      .queryCondition(java.util.Arrays.asList(resourceQueryParamModel))
      .querySelect(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(resourceQueryModel.queryType(), "workspaces");
    assertEquals(resourceQueryModel.queryCondition(), java.util.Arrays.asList(resourceQueryParamModel));
    assertEquals(resourceQueryModel.querySelect(), java.util.Arrays.asList("testString"));

    CreateResourceQueryOptions createResourceQueryOptionsModel = new CreateResourceQueryOptions.Builder()
      .type("vsi")
      .name("testString")
      .queries(java.util.Arrays.asList(resourceQueryModel))
      .build();
    assertEquals(createResourceQueryOptionsModel.type(), "vsi");
    assertEquals(createResourceQueryOptionsModel.name(), "testString");
    assertEquals(createResourceQueryOptionsModel.queries(), java.util.Arrays.asList(resourceQueryModel));
  }
}