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

import com.ibm.cloud.schematics.v1.model.ActionState;
import com.ibm.cloud.schematics.v1.model.CreateActionOptions;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.ExternalSourceGit;
import com.ibm.cloud.schematics.v1.model.SystemLock;
import com.ibm.cloud.schematics.v1.model.TargetResourceset;
import com.ibm.cloud.schematics.v1.model.UserState;
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
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
 * Unit test class for the CreateActionOptions model.
 */
public class CreateActionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateActionOptions() throws Throwable {
    UserState userStateModel = new UserState.Builder()
      .state("draft")
      .setBy("testString")
      .setAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();
    assertEquals(userStateModel.state(), "draft");
    assertEquals(userStateModel.setBy(), "testString");
    assertEquals(userStateModel.setAt(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));

    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
      .gitRepoUrl("testString")
      .gitToken("testString")
      .gitRepoFolder("testString")
      .gitRelease("testString")
      .gitBranch("testString")
      .build();
    assertEquals(externalSourceGitModel.gitRepoUrl(), "testString");
    assertEquals(externalSourceGitModel.gitToken(), "testString");
    assertEquals(externalSourceGitModel.gitRepoFolder(), "testString");
    assertEquals(externalSourceGitModel.gitRelease(), "testString");
    assertEquals(externalSourceGitModel.gitBranch(), "testString");

    ExternalSource externalSourceModel = new ExternalSource.Builder()
      .sourceType("local")
      .git(externalSourceGitModel)
      .build();
    assertEquals(externalSourceModel.sourceType(), "local");
    assertEquals(externalSourceModel.git(), externalSourceGitModel);

    SystemLock systemLockModel = new SystemLock.Builder()
      .sysLocked(true)
      .sysLockedBy("testString")
      .sysLockedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();
    assertEquals(systemLockModel.sysLocked(), Boolean.valueOf(true));
    assertEquals(systemLockModel.sysLockedBy(), "testString");
    assertEquals(systemLockModel.sysLockedAt(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));

    TargetResourceset targetResourcesetModel = new TargetResourceset.Builder()
      .name("testString")
      .type("testString")
      .description("testString")
      .resourceQuery("testString")
      .credential("testString")
      .sysLock(systemLockModel)
      .build();
    assertEquals(targetResourcesetModel.name(), "testString");
    assertEquals(targetResourcesetModel.type(), "testString");
    assertEquals(targetResourcesetModel.description(), "testString");
    assertEquals(targetResourcesetModel.resourceQuery(), "testString");
    assertEquals(targetResourcesetModel.credential(), "testString");
    assertEquals(targetResourcesetModel.sysLock(), systemLockModel);

    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
      .type("boolean")
      .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .defaultValue("testString")
      .secure(true)
      .immutable(true)
      .hidden(true)
      .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .minValue(Long.valueOf("26"))
      .maxValue(Long.valueOf("26"))
      .minLength(Long.valueOf("26"))
      .maxLength(Long.valueOf("26"))
      .matches("testString")
      .position(Long.valueOf("26"))
      .groupBy("testString")
      .source("testString")
      .build();
    assertEquals(variableMetadataModel.type(), "boolean");
    assertEquals(variableMetadataModel.aliases(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.description(), "testString");
    assertEquals(variableMetadataModel.defaultValue(), "testString");
    assertEquals(variableMetadataModel.secure(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.immutable(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.options(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.minValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.minLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.matches(), "testString");
    assertEquals(variableMetadataModel.position(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.groupBy(), "testString");
    assertEquals(variableMetadataModel.source(), "testString");

    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .build();
    assertEquals(variableDataModel.name(), "testString");
    assertEquals(variableDataModel.value(), "testString");
    assertEquals(variableDataModel.metadata(), variableMetadataModel);

    ActionState actionStateModel = new ActionState.Builder()
      .statusCode("normal")
      .statusMessage("testString")
      .build();
    assertEquals(actionStateModel.statusCode(), "normal");
    assertEquals(actionStateModel.statusMessage(), "testString");

    CreateActionOptions createActionOptionsModel = new CreateActionOptions.Builder()
      .name("Stop Action")
      .description("This Action can be used to Stop the targets")
      .location("us_south")
      .resourceGroup("testString")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .userState(userStateModel)
      .sourceReadmeUrl("testString")
      .source(externalSourceModel)
      .sourceType("local")
      .commandParameter("testString")
      .bastion(targetResourcesetModel)
      .targets(new java.util.ArrayList<TargetResourceset>(java.util.Arrays.asList(targetResourcesetModel)))
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .triggerRecordId("testString")
      .state(actionStateModel)
      .sysLock(systemLockModel)
      .xGithubToken("testString")
      .build();
    assertEquals(createActionOptionsModel.name(), "Stop Action");
    assertEquals(createActionOptionsModel.description(), "This Action can be used to Stop the targets");
    assertEquals(createActionOptionsModel.location(), "us_south");
    assertEquals(createActionOptionsModel.resourceGroup(), "testString");
    assertEquals(createActionOptionsModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(createActionOptionsModel.userState(), userStateModel);
    assertEquals(createActionOptionsModel.sourceReadmeUrl(), "testString");
    assertEquals(createActionOptionsModel.source(), externalSourceModel);
    assertEquals(createActionOptionsModel.sourceType(), "local");
    assertEquals(createActionOptionsModel.commandParameter(), "testString");
    assertEquals(createActionOptionsModel.bastion(), targetResourcesetModel);
    assertEquals(createActionOptionsModel.targets(), new java.util.ArrayList<TargetResourceset>(java.util.Arrays.asList(targetResourcesetModel)));
    assertEquals(createActionOptionsModel.inputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(createActionOptionsModel.outputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(createActionOptionsModel.settings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(createActionOptionsModel.triggerRecordId(), "testString");
    assertEquals(createActionOptionsModel.state(), actionStateModel);
    assertEquals(createActionOptionsModel.sysLock(), systemLockModel);
    assertEquals(createActionOptionsModel.xGithubToken(), "testString");
  }
}