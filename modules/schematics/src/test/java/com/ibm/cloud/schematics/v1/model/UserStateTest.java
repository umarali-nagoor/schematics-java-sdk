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

import com.ibm.cloud.schematics.v1.model.UserState;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UserState model.
 */
public class UserStateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUserState() throws Throwable {
    UserState userStateModel = new UserState.Builder()
      .state("draft")
      .setBy("testString")
      .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .build();
    assertEquals(userStateModel.state(), "draft");
    assertEquals(userStateModel.setBy(), "testString");
    assertEquals(userStateModel.setAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));

    String json = TestUtilities.serialize(userStateModel);

    UserState userStateModelNew = TestUtilities.deserialize(json, UserState.class);
    assertTrue(userStateModelNew instanceof UserState);
    assertEquals(userStateModelNew.state(), "draft");
    assertEquals(userStateModelNew.setBy(), "testString");
    assertEquals(userStateModelNew.setAt(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
  }
}