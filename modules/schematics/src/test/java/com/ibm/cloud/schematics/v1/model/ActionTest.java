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

import com.ibm.cloud.schematics.v1.model.Action;
import com.ibm.cloud.schematics.v1.model.ActionState;
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
 * Unit test class for the Action model.
 */
public class ActionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAction() throws Throwable {
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
      .credentialRef("testString")
      .sysLock(systemLockModel)
      .build();
    assertEquals(targetResourcesetModel.name(), "testString");
    assertEquals(targetResourcesetModel.type(), "testString");
    assertEquals(targetResourcesetModel.description(), "testString");
    assertEquals(targetResourcesetModel.resourceQuery(), "testString");
    assertEquals(targetResourcesetModel.credentialRef(), "testString");
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
      .statusJobId("testString")
      .statusMessage("testString")
      .build();
    assertEquals(actionStateModel.statusCode(), "normal");
    assertEquals(actionStateModel.statusJobId(), "testString");
    assertEquals(actionStateModel.statusMessage(), "testString");

    Action actionModel = new Action.Builder()
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
      .targetsIni("testString")
      .credentials(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .triggerRecordId("testString")
      .state(actionStateModel)
      .sysLock(systemLockModel)
      .build();
    assertEquals(actionModel.name(), "Stop Action");
    assertEquals(actionModel.description(), "This Action can be used to Stop the targets");
    assertEquals(actionModel.location(), "us_south");
    assertEquals(actionModel.resourceGroup(), "testString");
    assertEquals(actionModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(actionModel.userState(), userStateModel);
    assertEquals(actionModel.sourceReadmeUrl(), "testString");
    assertEquals(actionModel.source(), externalSourceModel);
    assertEquals(actionModel.sourceType(), "local");
    assertEquals(actionModel.commandParameter(), "testString");
    assertEquals(actionModel.bastion(), targetResourcesetModel);
    assertEquals(actionModel.targetsIni(), "testString");
    assertEquals(actionModel.credentials(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(actionModel.inputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(actionModel.outputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(actionModel.settings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(actionModel.triggerRecordId(), "testString");
    assertEquals(actionModel.state(), actionStateModel);
    assertEquals(actionModel.sysLock(), systemLockModel);

    String json = TestUtilities.serialize(actionModel);

    Action actionModelNew = TestUtilities.deserialize(json, Action.class);
    assertTrue(actionModelNew instanceof Action);
    assertEquals(actionModelNew.name(), "Stop Action");
    assertEquals(actionModelNew.description(), "This Action can be used to Stop the targets");
    assertEquals(actionModelNew.location(), "us_south");
    assertEquals(actionModelNew.resourceGroup(), "testString");
    assertEquals(actionModelNew.userState().toString(), userStateModel.toString());
    assertEquals(actionModelNew.sourceReadmeUrl(), "testString");
    assertEquals(actionModelNew.source().toString(), externalSourceModel.toString());
    assertEquals(actionModelNew.sourceType(), "local");
    assertEquals(actionModelNew.commandParameter(), "testString");
    assertEquals(actionModelNew.bastion().toString(), targetResourcesetModel.toString());
    assertEquals(actionModelNew.targetsIni(), "testString");
    assertEquals(actionModelNew.triggerRecordId(), "testString");
    assertEquals(actionModelNew.state().toString(), actionStateModel.toString());
    assertEquals(actionModelNew.sysLock().toString(), systemLockModel.toString());
  }
}