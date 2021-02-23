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

import com.ibm.cloud.schematics.v1.model.GetDiscoveredKmsInstancesOptions;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetDiscoveredKmsInstancesOptions model.
 */
public class GetDiscoveredKmsInstancesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetDiscoveredKmsInstancesOptions() throws Throwable {
    GetDiscoveredKmsInstancesOptions getDiscoveredKmsInstancesOptionsModel = new GetDiscoveredKmsInstancesOptions.Builder()
      .encryptionScheme("testString")
      .location("testString")
      .resourceGroup("testString")
      .limit(Long.valueOf("1"))
      .sort("testString")
      .build();
    assertEquals(getDiscoveredKmsInstancesOptionsModel.encryptionScheme(), "testString");
    assertEquals(getDiscoveredKmsInstancesOptionsModel.location(), "testString");
    assertEquals(getDiscoveredKmsInstancesOptionsModel.resourceGroup(), "testString");
    assertEquals(getDiscoveredKmsInstancesOptionsModel.limit(), Long.valueOf("1"));
    assertEquals(getDiscoveredKmsInstancesOptionsModel.sort(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDiscoveredKmsInstancesOptionsError() throws Throwable {
    new GetDiscoveredKmsInstancesOptions.Builder().build();
  }

}