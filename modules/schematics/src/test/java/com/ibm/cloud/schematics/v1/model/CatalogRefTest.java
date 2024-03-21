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

import com.ibm.cloud.schematics.v1.model.CatalogRef;
import com.ibm.cloud.schematics.v1.model.ServiceExtensions;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CatalogRef model.
 */
public class CatalogRefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCatalogRef() throws Throwable {
    ServiceExtensions serviceExtensionsModel = new ServiceExtensions.Builder()
      .name("flavor")
      .value("testString")
      .type("string")
      .build();
    assertEquals(serviceExtensionsModel.name(), "flavor");
    assertEquals(serviceExtensionsModel.value(), "testString");
    assertEquals(serviceExtensionsModel.type(), "string");

    CatalogRef catalogRefModel = new CatalogRef.Builder()
      .dryRun(true)
      .owningAccount("testString")
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .offeringVersion("testString")
      .serviceExtensions(java.util.Arrays.asList(serviceExtensionsModel))
      .build();
    assertEquals(catalogRefModel.dryRun(), Boolean.valueOf(true));
    assertEquals(catalogRefModel.owningAccount(), "testString");
    assertEquals(catalogRefModel.itemIconUrl(), "testString");
    assertEquals(catalogRefModel.itemId(), "testString");
    assertEquals(catalogRefModel.itemName(), "testString");
    assertEquals(catalogRefModel.itemReadmeUrl(), "testString");
    assertEquals(catalogRefModel.itemUrl(), "testString");
    assertEquals(catalogRefModel.launchUrl(), "testString");
    assertEquals(catalogRefModel.offeringVersion(), "testString");
    assertEquals(catalogRefModel.serviceExtensions(), java.util.Arrays.asList(serviceExtensionsModel));

    String json = TestUtilities.serialize(catalogRefModel);

    CatalogRef catalogRefModelNew = TestUtilities.deserialize(json, CatalogRef.class);
    assertTrue(catalogRefModelNew instanceof CatalogRef);
    assertEquals(catalogRefModelNew.dryRun(), Boolean.valueOf(true));
    assertEquals(catalogRefModelNew.owningAccount(), "testString");
    assertEquals(catalogRefModelNew.itemIconUrl(), "testString");
    assertEquals(catalogRefModelNew.itemId(), "testString");
    assertEquals(catalogRefModelNew.itemName(), "testString");
    assertEquals(catalogRefModelNew.itemReadmeUrl(), "testString");
    assertEquals(catalogRefModelNew.itemUrl(), "testString");
    assertEquals(catalogRefModelNew.launchUrl(), "testString");
    assertEquals(catalogRefModelNew.offeringVersion(), "testString");
  }
}