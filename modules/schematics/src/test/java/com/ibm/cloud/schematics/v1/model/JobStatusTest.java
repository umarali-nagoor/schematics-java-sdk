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

import com.ibm.cloud.schematics.v1.model.JobStatus;
import com.ibm.cloud.schematics.v1.model.JobStatusAction;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JobStatus model.
 */
public class JobStatusTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJobStatus() throws Throwable {
    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
      .actionName("testString")
      .statusCode("job_pending")
      .statusMessage("testString")
      .bastionStatusCode("none")
      .bastionStatusMessage("testString")
      .targetsStatusCode("none")
      .targetsStatusMessage("testString")
      .updatedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();
    assertEquals(jobStatusActionModel.actionName(), "testString");
    assertEquals(jobStatusActionModel.statusCode(), "job_pending");
    assertEquals(jobStatusActionModel.statusMessage(), "testString");
    assertEquals(jobStatusActionModel.bastionStatusCode(), "none");
    assertEquals(jobStatusActionModel.bastionStatusMessage(), "testString");
    assertEquals(jobStatusActionModel.targetsStatusCode(), "none");
    assertEquals(jobStatusActionModel.targetsStatusMessage(), "testString");
    assertEquals(jobStatusActionModel.updatedAt(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));

    JobStatus jobStatusModel = new JobStatus.Builder()
      .actionJobStatus(jobStatusActionModel)
      .build();
    assertEquals(jobStatusModel.actionJobStatus(), jobStatusActionModel);

    String json = TestUtilities.serialize(jobStatusModel);

    JobStatus jobStatusModelNew = TestUtilities.deserialize(json, JobStatus.class);
    assertTrue(jobStatusModelNew instanceof JobStatus);
    assertEquals(jobStatusModelNew.actionJobStatus().toString(), jobStatusActionModel.toString());
  }
}