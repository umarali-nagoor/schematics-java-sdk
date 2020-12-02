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

package com.ibm.cloud.schematics.v1;

import com.ibm.cloud.schematics.v1.model.Action;
import com.ibm.cloud.schematics.v1.model.ActionList;
import com.ibm.cloud.schematics.v1.model.ActionLite;
import com.ibm.cloud.schematics.v1.model.ActionLiteState;
import com.ibm.cloud.schematics.v1.model.ActionState;
import com.ibm.cloud.schematics.v1.model.ApplyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.CatalogRef;
import com.ibm.cloud.schematics.v1.model.CreateActionOptions;
import com.ibm.cloud.schematics.v1.model.CreateJobOptions;
import com.ibm.cloud.schematics.v1.model.CreateSharedDatasetOptions;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceDeletionJobOptions;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.DeleteActionOptions;
import com.ibm.cloud.schematics.v1.model.DeleteJobOptions;
import com.ibm.cloud.schematics.v1.model.DeleteSharedDatasetOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceActivityOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.DestroyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.EnvVariableResponse;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.ExternalSourceGit;
import com.ibm.cloud.schematics.v1.model.GetActionOptions;
import com.ibm.cloud.schematics.v1.model.GetAllWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.GetDiscoveredKmsInstancesOptions;
import com.ibm.cloud.schematics.v1.model.GetJobOptions;
import com.ibm.cloud.schematics.v1.model.GetKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.GetSchematicsVersionOptions;
import com.ibm.cloud.schematics.v1.model.GetSharedDatasetOptions;
import com.ibm.cloud.schematics.v1.model.GetTemplateActivityLogOptions;
import com.ibm.cloud.schematics.v1.model.GetTemplateLogsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceActivityLogsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceActivityOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceDeletionJobStatusOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceInputMetadataOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceLogUrlsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceOutputsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceReadmeOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceResourcesOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceStateOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceTemplateStateOptions;
import com.ibm.cloud.schematics.v1.model.Job;
import com.ibm.cloud.schematics.v1.model.JobData;
import com.ibm.cloud.schematics.v1.model.JobDataAction;
import com.ibm.cloud.schematics.v1.model.JobList;
import com.ibm.cloud.schematics.v1.model.JobLite;
import com.ibm.cloud.schematics.v1.model.JobLog;
import com.ibm.cloud.schematics.v1.model.JobLogSummary;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJobRecap;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryLogErrorsItem;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryRepoDownloadJob;
import com.ibm.cloud.schematics.v1.model.JobStateData;
import com.ibm.cloud.schematics.v1.model.JobStateDataSummaryItem;
import com.ibm.cloud.schematics.v1.model.JobStatus;
import com.ibm.cloud.schematics.v1.model.JobStatusAction;
import com.ibm.cloud.schematics.v1.model.JobStatusType;
import com.ibm.cloud.schematics.v1.model.KMSDiscovery;
import com.ibm.cloud.schematics.v1.model.KMSInstances;
import com.ibm.cloud.schematics.v1.model.KMSInstancesKeysItem;
import com.ibm.cloud.schematics.v1.model.KMSSettings;
import com.ibm.cloud.schematics.v1.model.KMSSettingsPrimaryCrk;
import com.ibm.cloud.schematics.v1.model.KMSSettingsSecondaryCrk;
import com.ibm.cloud.schematics.v1.model.ListActionsOptions;
import com.ibm.cloud.schematics.v1.model.ListJobLogsOptions;
import com.ibm.cloud.schematics.v1.model.ListJobStatesOptions;
import com.ibm.cloud.schematics.v1.model.ListJobsOptions;
import com.ibm.cloud.schematics.v1.model.ListResourceGroupOptions;
import com.ibm.cloud.schematics.v1.model.ListSchematicsLocationOptions;
import com.ibm.cloud.schematics.v1.model.ListSharedDatasetsOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspaceActivitiesOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspacesOptions;
import com.ibm.cloud.schematics.v1.model.LogStoreResponse;
import com.ibm.cloud.schematics.v1.model.LogStoreResponseList;
import com.ibm.cloud.schematics.v1.model.LogSummary;
import com.ibm.cloud.schematics.v1.model.OutputValuesItem;
import com.ibm.cloud.schematics.v1.model.PlanWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.RefreshWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceJobOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceSharedDatasetOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.ResourceGroupResponse;
import com.ibm.cloud.schematics.v1.model.SchematicsLocations;
import com.ibm.cloud.schematics.v1.model.SharedDatasetData;
import com.ibm.cloud.schematics.v1.model.SharedDatasetResponse;
import com.ibm.cloud.schematics.v1.model.SharedDatasetResponseList;
import com.ibm.cloud.schematics.v1.model.SharedTargetData;
import com.ibm.cloud.schematics.v1.model.SharedTargetDataResponse;
import com.ibm.cloud.schematics.v1.model.StateStoreResponse;
import com.ibm.cloud.schematics.v1.model.StateStoreResponseList;
import com.ibm.cloud.schematics.v1.model.SystemLock;
import com.ibm.cloud.schematics.v1.model.TargetResourceset;
import com.ibm.cloud.schematics.v1.model.TemplateReadme;
import com.ibm.cloud.schematics.v1.model.TemplateRepoRequest;
import com.ibm.cloud.schematics.v1.model.TemplateRepoResponse;
import com.ibm.cloud.schematics.v1.model.TemplateRepoTarUploadResponse;
import com.ibm.cloud.schematics.v1.model.TemplateRepoUpdateRequest;
import com.ibm.cloud.schematics.v1.model.TemplateResources;
import com.ibm.cloud.schematics.v1.model.TemplateRunTimeDataResponse;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataRequest;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataResponse;
import com.ibm.cloud.schematics.v1.model.TemplateStateStore;
import com.ibm.cloud.schematics.v1.model.TemplateValues;
import com.ibm.cloud.schematics.v1.model.UpdateActionOptions;
import com.ibm.cloud.schematics.v1.model.UpdateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.UploadTemplateTarOptions;
import com.ibm.cloud.schematics.v1.model.UserState;
import com.ibm.cloud.schematics.v1.model.UserValues;
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
import com.ibm.cloud.schematics.v1.model.VersionResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivities;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivity;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityApplyResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityDestroyResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityLogs;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityOptionsTemplate;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityPlanResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityRefreshResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityTemplate;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityTemplateLogs;
import com.ibm.cloud.schematics.v1.model.WorkspaceBulkDeleteResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceJobResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceResponseList;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusMessage;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusRequest;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusUpdateRequest;
import com.ibm.cloud.schematics.v1.model.WorkspaceTemplateValuesResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceVariableRequest;
import com.ibm.cloud.schematics.v1.model.WorkspaceVariableResponse;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.schematics.test.SdkIntegrationTestBase;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the Schematics service.
 */
public class SchematicsIT extends SdkIntegrationTestBase {
  public Schematics service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../schematics_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = Schematics.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(Schematics.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    System.out.println("Setup complete.");
  }

  @Test
  public void testListSchematicsLocation() throws Exception {
    try {
      ListSchematicsLocationOptions listSchematicsLocationOptions = new ListSchematicsLocationOptions();

      // Invoke operation
      Response<List<SchematicsLocations>> response = service.listSchematicsLocation(listSchematicsLocationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      List<SchematicsLocations> listSchematicsLocationsResult = response.getResult();

      assertNotNull(listSchematicsLocationsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListResourceGroup() throws Exception {
    try {
      ListResourceGroupOptions listResourceGroupOptions = new ListResourceGroupOptions();

      // Invoke operation
      Response<List<ResourceGroupResponse>> response = service.listResourceGroup(listResourceGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      List<ResourceGroupResponse> listResourceGroupResponseResult = response.getResult();

      assertNotNull(listResourceGroupResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetSchematicsVersion() throws Exception {
    try {
      GetSchematicsVersionOptions getSchematicsVersionOptions = new GetSchematicsVersionOptions();

      // Invoke operation
      Response<VersionResponse> response = service.getSchematicsVersion(getSchematicsVersionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      VersionResponse versionResponseResult = response.getResult();

      assertNotNull(versionResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListWorkspaces() throws Exception {
    try {
      ListWorkspacesOptions listWorkspacesOptions = new ListWorkspacesOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("1"))
      .build();

      // Invoke operation
      Response<WorkspaceResponseList> response = service.listWorkspaces(listWorkspacesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WorkspaceResponseList workspaceResponseListResult = response.getResult();

      assertNotNull(workspaceResponseListResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateWorkspace() throws Exception {
    try {
      CatalogRef catalogRefModel = new CatalogRef.Builder()
      .dryRun(true)
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .offeringVersion("testString")
      .build();

      SharedTargetData sharedTargetDataModel = new SharedTargetData.Builder()
      .clusterCreatedOn("testString")
      .clusterId("testString")
      .clusterName("testString")
      .clusterType("testString")
      .entitlementKeys(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .namespace("testString")
      .region("testString")
      .resourceGroupId("testString")
      .workerCount(Long.valueOf("26"))
      .workerMachineType("testString")
      .build();

      WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .description("testString")
      .name("testString")
      .secure(true)
      .type("testString")
      .useDefault(true)
      .value("testString")
      .build();

      TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
      .envValues(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .folder("testString")
      .initStateFile("testString")
      .type("testString")
      .uninstallScriptName("testString")
      .values("testString")
      .valuesMetadata(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .variablestore(new java.util.ArrayList<WorkspaceVariableRequest>(java.util.Arrays.asList(workspaceVariableRequestModel)))
      .build();

      TemplateRepoRequest templateRepoRequestModel = new TemplateRepoRequest.Builder()
      .branch("testString")
      .release("testString")
      .repoShaValue("testString")
      .repoUrl("testString")
      .url("testString")
      .build();

      WorkspaceStatusRequest workspaceStatusRequestModel = new WorkspaceStatusRequest.Builder()
      .frozen(true)
      .frozenAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .frozenBy("testString")
      .locked(true)
      .lockedBy("testString")
      .lockedTime(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();

      CreateWorkspaceOptions createWorkspaceOptions = new CreateWorkspaceOptions.Builder()
      .appliedShareddataIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .catalogRef(catalogRefModel)
      .description("testString")
      .location("testString")
      .name("testString")
      .resourceGroup("testString")
      .sharedData(sharedTargetDataModel)
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .templateData(new java.util.ArrayList<TemplateSourceDataRequest>(java.util.Arrays.asList(templateSourceDataRequestModel)))
      .templateRef("testString")
      .templateRepo(templateRepoRequestModel)
      .type(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .workspaceStatus(workspaceStatusRequestModel)
      .xGithubToken("testString")
      .build();

      // Invoke operation
      Response<WorkspaceResponse> response = service.createWorkspace(createWorkspaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      WorkspaceResponse workspaceResponseResult = response.getResult();

      assertNotNull(workspaceResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetWorkspace() throws Exception {
    try {
      GetWorkspaceOptions getWorkspaceOptions = new GetWorkspaceOptions.Builder()
      .wId("testString")
      .build();

      // Invoke operation
      Response<WorkspaceResponse> response = service.getWorkspace(getWorkspaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WorkspaceResponse workspaceResponseResult = response.getResult();

      assertNotNull(workspaceResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceWorkspace() throws Exception {
    try {
      CatalogRef catalogRefModel = new CatalogRef.Builder()
      .dryRun(true)
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .offeringVersion("testString")
      .build();

      SharedTargetData sharedTargetDataModel = new SharedTargetData.Builder()
      .clusterCreatedOn("testString")
      .clusterId("testString")
      .clusterName("testString")
      .clusterType("testString")
      .entitlementKeys(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .namespace("testString")
      .region("testString")
      .resourceGroupId("testString")
      .workerCount(Long.valueOf("26"))
      .workerMachineType("testString")
      .build();

      WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .description("testString")
      .name("testString")
      .secure(true)
      .type("testString")
      .useDefault(true)
      .value("testString")
      .build();

      TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
      .envValues(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .folder("testString")
      .initStateFile("testString")
      .type("testString")
      .uninstallScriptName("testString")
      .values("testString")
      .valuesMetadata(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .variablestore(new java.util.ArrayList<WorkspaceVariableRequest>(java.util.Arrays.asList(workspaceVariableRequestModel)))
      .build();

      TemplateRepoUpdateRequest templateRepoUpdateRequestModel = new TemplateRepoUpdateRequest.Builder()
      .branch("testString")
      .release("testString")
      .repoShaValue("testString")
      .repoUrl("testString")
      .url("testString")
      .build();

      WorkspaceStatusUpdateRequest workspaceStatusUpdateRequestModel = new WorkspaceStatusUpdateRequest.Builder()
      .frozen(true)
      .frozenAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .frozenBy("testString")
      .locked(true)
      .lockedBy("testString")
      .lockedTime(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();

      WorkspaceStatusMessage workspaceStatusMessageModel = new WorkspaceStatusMessage.Builder()
      .statusCode("testString")
      .statusMsg("testString")
      .build();

      ReplaceWorkspaceOptions replaceWorkspaceOptions = new ReplaceWorkspaceOptions.Builder()
      .wId("testString")
      .catalogRef(catalogRefModel)
      .description("testString")
      .name("testString")
      .sharedData(sharedTargetDataModel)
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .templateData(new java.util.ArrayList<TemplateSourceDataRequest>(java.util.Arrays.asList(templateSourceDataRequestModel)))
      .templateRepo(templateRepoUpdateRequestModel)
      .type(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .workspaceStatus(workspaceStatusUpdateRequestModel)
      .workspaceStatusMsg(workspaceStatusMessageModel)
      .build();

      // Invoke operation
      Response<WorkspaceResponse> response = service.replaceWorkspace(replaceWorkspaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WorkspaceResponse workspaceResponseResult = response.getResult();

      assertNotNull(workspaceResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateWorkspace() throws Exception {
    try {
      CatalogRef catalogRefModel = new CatalogRef.Builder()
      .dryRun(true)
      .itemIconUrl("testString")
      .itemId("testString")
      .itemName("testString")
      .itemReadmeUrl("testString")
      .itemUrl("testString")
      .launchUrl("testString")
      .offeringVersion("testString")
      .build();

      SharedTargetData sharedTargetDataModel = new SharedTargetData.Builder()
      .clusterCreatedOn("testString")
      .clusterId("testString")
      .clusterName("testString")
      .clusterType("testString")
      .entitlementKeys(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .namespace("testString")
      .region("testString")
      .resourceGroupId("testString")
      .workerCount(Long.valueOf("26"))
      .workerMachineType("testString")
      .build();

      WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .description("testString")
      .name("testString")
      .secure(true)
      .type("testString")
      .useDefault(true)
      .value("testString")
      .build();

      TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
      .envValues(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .folder("testString")
      .initStateFile("testString")
      .type("testString")
      .uninstallScriptName("testString")
      .values("testString")
      .valuesMetadata(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .variablestore(new java.util.ArrayList<WorkspaceVariableRequest>(java.util.Arrays.asList(workspaceVariableRequestModel)))
      .build();

      TemplateRepoUpdateRequest templateRepoUpdateRequestModel = new TemplateRepoUpdateRequest.Builder()
      .branch("testString")
      .release("testString")
      .repoShaValue("testString")
      .repoUrl("testString")
      .url("testString")
      .build();

      WorkspaceStatusUpdateRequest workspaceStatusUpdateRequestModel = new WorkspaceStatusUpdateRequest.Builder()
      .frozen(true)
      .frozenAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .frozenBy("testString")
      .locked(true)
      .lockedBy("testString")
      .lockedTime(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();

      WorkspaceStatusMessage workspaceStatusMessageModel = new WorkspaceStatusMessage.Builder()
      .statusCode("testString")
      .statusMsg("testString")
      .build();

      UpdateWorkspaceOptions updateWorkspaceOptions = new UpdateWorkspaceOptions.Builder()
      .wId("testString")
      .catalogRef(catalogRefModel)
      .description("testString")
      .name("testString")
      .sharedData(sharedTargetDataModel)
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .templateData(new java.util.ArrayList<TemplateSourceDataRequest>(java.util.Arrays.asList(templateSourceDataRequestModel)))
      .templateRepo(templateRepoUpdateRequestModel)
      .type(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .workspaceStatus(workspaceStatusUpdateRequestModel)
      .workspaceStatusMsg(workspaceStatusMessageModel)
      .build();

      // Invoke operation
      Response<WorkspaceResponse> response = service.updateWorkspace(updateWorkspaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WorkspaceResponse workspaceResponseResult = response.getResult();

      assertNotNull(workspaceResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUploadTemplateTar() throws Exception {
    try {
      UploadTemplateTarOptions uploadTemplateTarOptions = new UploadTemplateTarOptions.Builder()
      .wId("testString")
      .tId("testString")
      .file(TestUtilities.createMockStream("This is a mock file."))
      .fileContentType("testString")
      .build();

      // Invoke operation
      Response<TemplateRepoTarUploadResponse> response = service.uploadTemplateTar(uploadTemplateTarOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TemplateRepoTarUploadResponse templateRepoTarUploadResponseResult = response.getResult();

      assertNotNull(templateRepoTarUploadResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetWorkspaceReadme() throws Exception {
    try {
      GetWorkspaceReadmeOptions getWorkspaceReadmeOptions = new GetWorkspaceReadmeOptions.Builder()
      .wId("testString")
      .ref("testString")
      .formatted("markdown")
      .build();

      // Invoke operation
      Response<TemplateReadme> response = service.getWorkspaceReadme(getWorkspaceReadmeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TemplateReadme templateReadmeResult = response.getResult();

      assertNotNull(templateReadmeResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListWorkspaceActivities() throws Exception {
    try {
      ListWorkspaceActivitiesOptions listWorkspaceActivitiesOptions = new ListWorkspaceActivitiesOptions.Builder()
      .wId("testString")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("1"))
      .build();

      // Invoke operation
      Response<WorkspaceActivities> response = service.listWorkspaceActivities(listWorkspaceActivitiesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WorkspaceActivities workspaceActivitiesResult = response.getResult();

      assertNotNull(workspaceActivitiesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetWorkspaceActivity() throws Exception {
    try {
      GetWorkspaceActivityOptions getWorkspaceActivityOptions = new GetWorkspaceActivityOptions.Builder()
      .wId("testString")
      .activityId("testString")
      .build();

      // Invoke operation
      Response<WorkspaceActivity> response = service.getWorkspaceActivity(getWorkspaceActivityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WorkspaceActivity workspaceActivityResult = response.getResult();

      assertNotNull(workspaceActivityResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testApplyWorkspaceCommand() throws Exception {
    try {
      WorkspaceActivityOptionsTemplate workspaceActivityOptionsTemplateModel = new WorkspaceActivityOptionsTemplate.Builder()
      .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .tfVars(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      ApplyWorkspaceCommandOptions applyWorkspaceCommandOptions = new ApplyWorkspaceCommandOptions.Builder()
      .wId("testString")
      .refreshToken("testString")
      .actionOptions(workspaceActivityOptionsTemplateModel)
      .build();

      // Invoke operation
      Response<WorkspaceActivityApplyResult> response = service.applyWorkspaceCommand(applyWorkspaceCommandOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      WorkspaceActivityApplyResult workspaceActivityApplyResultResult = response.getResult();

      assertNotNull(workspaceActivityApplyResultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDestroyWorkspaceCommand() throws Exception {
    try {
      WorkspaceActivityOptionsTemplate workspaceActivityOptionsTemplateModel = new WorkspaceActivityOptionsTemplate.Builder()
      .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .tfVars(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      DestroyWorkspaceCommandOptions destroyWorkspaceCommandOptions = new DestroyWorkspaceCommandOptions.Builder()
      .wId("testString")
      .refreshToken("testString")
      .actionOptions(workspaceActivityOptionsTemplateModel)
      .build();

      // Invoke operation
      Response<WorkspaceActivityDestroyResult> response = service.destroyWorkspaceCommand(destroyWorkspaceCommandOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      WorkspaceActivityDestroyResult workspaceActivityDestroyResultResult = response.getResult();

      assertNotNull(workspaceActivityDestroyResultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPlanWorkspaceCommand() throws Exception {
    try {
      PlanWorkspaceCommandOptions planWorkspaceCommandOptions = new PlanWorkspaceCommandOptions.Builder()
      .wId("testString")
      .refreshToken("testString")
      .build();

      // Invoke operation
      Response<WorkspaceActivityPlanResult> response = service.planWorkspaceCommand(planWorkspaceCommandOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      WorkspaceActivityPlanResult workspaceActivityPlanResultResult = response.getResult();

      assertNotNull(workspaceActivityPlanResultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRefreshWorkspaceCommand() throws Exception {
    try {
      RefreshWorkspaceCommandOptions refreshWorkspaceCommandOptions = new RefreshWorkspaceCommandOptions.Builder()
      .wId("testString")
      .refreshToken("testString")
      .build();

      // Invoke operation
      Response<WorkspaceActivityRefreshResult> response = service.refreshWorkspaceCommand(refreshWorkspaceCommandOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      WorkspaceActivityRefreshResult workspaceActivityRefreshResultResult = response.getResult();

      assertNotNull(workspaceActivityRefreshResultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetWorkspaceInputs() throws Exception {
    try {
      GetWorkspaceInputsOptions getWorkspaceInputsOptions = new GetWorkspaceInputsOptions.Builder()
      .wId("testString")
      .tId("testString")
      .build();

      // Invoke operation
      Response<TemplateValues> response = service.getWorkspaceInputs(getWorkspaceInputsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TemplateValues templateValuesResult = response.getResult();

      assertNotNull(templateValuesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceWorkspaceInputs() throws Exception {
    try {
      WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .description("testString")
      .name("testString")
      .secure(true)
      .type("testString")
      .useDefault(true)
      .value("testString")
      .build();

      ReplaceWorkspaceInputsOptions replaceWorkspaceInputsOptions = new ReplaceWorkspaceInputsOptions.Builder()
      .wId("testString")
      .tId("testString")
      .envValues(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .values("testString")
      .variablestore(new java.util.ArrayList<WorkspaceVariableRequest>(java.util.Arrays.asList(workspaceVariableRequestModel)))
      .build();

      // Invoke operation
      Response<UserValues> response = service.replaceWorkspaceInputs(replaceWorkspaceInputsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UserValues userValuesResult = response.getResult();

      assertNotNull(userValuesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetAllWorkspaceInputs() throws Exception {
    try {
      GetAllWorkspaceInputsOptions getAllWorkspaceInputsOptions = new GetAllWorkspaceInputsOptions.Builder()
      .wId("testString")
      .build();

      // Invoke operation
      Response<WorkspaceTemplateValuesResponse> response = service.getAllWorkspaceInputs(getAllWorkspaceInputsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WorkspaceTemplateValuesResponse workspaceTemplateValuesResponseResult = response.getResult();

      assertNotNull(workspaceTemplateValuesResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetWorkspaceInputMetadata() throws Exception {
    try {
      GetWorkspaceInputMetadataOptions getWorkspaceInputMetadataOptions = new GetWorkspaceInputMetadataOptions.Builder()
      .wId("testString")
      .tId("testString")
      .build();

      // Invoke operation
      Response<List<Object>> response = service.getWorkspaceInputMetadata(getWorkspaceInputMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      List<Object> resultResult = response.getResult();

      assertNotNull(resultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetWorkspaceOutputs() throws Exception {
    try {
      GetWorkspaceOutputsOptions getWorkspaceOutputsOptions = new GetWorkspaceOutputsOptions.Builder()
      .wId("testString")
      .build();

      // Invoke operation
      Response<List<OutputValuesItem>> response = service.getWorkspaceOutputs(getWorkspaceOutputsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      List<OutputValuesItem> listOutputValuesItemResult = response.getResult();

      assertNotNull(listOutputValuesItemResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetWorkspaceResources() throws Exception {
    try {
      GetWorkspaceResourcesOptions getWorkspaceResourcesOptions = new GetWorkspaceResourcesOptions.Builder()
      .wId("testString")
      .build();

      // Invoke operation
      Response<List<TemplateResources>> response = service.getWorkspaceResources(getWorkspaceResourcesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      List<TemplateResources> listTemplateResourcesResult = response.getResult();

      assertNotNull(listTemplateResourcesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetWorkspaceState() throws Exception {
    try {
      GetWorkspaceStateOptions getWorkspaceStateOptions = new GetWorkspaceStateOptions.Builder()
      .wId("testString")
      .build();

      // Invoke operation
      Response<StateStoreResponseList> response = service.getWorkspaceState(getWorkspaceStateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      StateStoreResponseList stateStoreResponseListResult = response.getResult();

      assertNotNull(stateStoreResponseListResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetWorkspaceTemplateState() throws Exception {
    try {
      GetWorkspaceTemplateStateOptions getWorkspaceTemplateStateOptions = new GetWorkspaceTemplateStateOptions.Builder()
      .wId("testString")
      .tId("testString")
      .build();

      // Invoke operation
      Response<TemplateStateStore> response = service.getWorkspaceTemplateState(getWorkspaceTemplateStateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TemplateStateStore templateStateStoreResult = response.getResult();

      assertNotNull(templateStateStoreResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetWorkspaceActivityLogs() throws Exception {
    try {
      GetWorkspaceActivityLogsOptions getWorkspaceActivityLogsOptions = new GetWorkspaceActivityLogsOptions.Builder()
      .wId("testString")
      .activityId("testString")
      .build();

      // Invoke operation
      Response<WorkspaceActivityLogs> response = service.getWorkspaceActivityLogs(getWorkspaceActivityLogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WorkspaceActivityLogs workspaceActivityLogsResult = response.getResult();

      assertNotNull(workspaceActivityLogsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetWorkspaceLogUrls() throws Exception {
    try {
      GetWorkspaceLogUrlsOptions getWorkspaceLogUrlsOptions = new GetWorkspaceLogUrlsOptions.Builder()
      .wId("testString")
      .build();

      // Invoke operation
      Response<LogStoreResponseList> response = service.getWorkspaceLogUrls(getWorkspaceLogUrlsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      LogStoreResponseList logStoreResponseListResult = response.getResult();

      assertNotNull(logStoreResponseListResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetTemplateLogs() throws Exception {
    try {
      GetTemplateLogsOptions getTemplateLogsOptions = new GetTemplateLogsOptions.Builder()
      .wId("testString")
      .tId("testString")
      .logTfCmd(true)
      .logTfPrefix(true)
      .logTfNullResource(true)
      .logTfAnsible(true)
      .build();

      // Invoke operation
      Response<String> response = service.getTemplateLogs(getTemplateLogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      String resultResult = response.getResult();

      assertNotNull(resultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetTemplateActivityLog() throws Exception {
    try {
      GetTemplateActivityLogOptions getTemplateActivityLogOptions = new GetTemplateActivityLogOptions.Builder()
      .wId("testString")
      .tId("testString")
      .activityId("testString")
      .logTfCmd(true)
      .logTfPrefix(true)
      .logTfNullResource(true)
      .logTfAnsible(true)
      .build();

      // Invoke operation
      Response<String> response = service.getTemplateActivityLog(getTemplateActivityLogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      String resultResult = response.getResult();

      assertNotNull(resultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateWorkspaceDeletionJob() throws Exception {
    try {
      CreateWorkspaceDeletionJobOptions createWorkspaceDeletionJobOptions = new CreateWorkspaceDeletionJobOptions.Builder()
      .refreshToken("testString")
      .newDeleteWorkspaces(true)
      .newDestroyResources(true)
      .newJob("testString")
      .newVersion("testString")
      .newWorkspaces(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .destroyResources("testString")
      .build();

      // Invoke operation
      Response<WorkspaceBulkDeleteResponse> response = service.createWorkspaceDeletionJob(createWorkspaceDeletionJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WorkspaceBulkDeleteResponse workspaceBulkDeleteResponseResult = response.getResult();

      assertNotNull(workspaceBulkDeleteResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetWorkspaceDeletionJobStatus() throws Exception {
    try {
      GetWorkspaceDeletionJobStatusOptions getWorkspaceDeletionJobStatusOptions = new GetWorkspaceDeletionJobStatusOptions.Builder()
      .wjId("testString")
      .build();

      // Invoke operation
      Response<WorkspaceJobResponse> response = service.getWorkspaceDeletionJobStatus(getWorkspaceDeletionJobStatusOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WorkspaceJobResponse workspaceJobResponseResult = response.getResult();

      assertNotNull(workspaceJobResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateAction() throws Exception {
    try {
      UserState userStateModel = new UserState.Builder()
      .state("draft")
      .setBy("testString")
      .setAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();

      ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
      .gitRepoUrl("testString")
      .gitToken("testString")
      .gitRepoFolder("testString")
      .gitRelease("testString")
      .gitBranch("testString")
      .build();

      ExternalSource externalSourceModel = new ExternalSource.Builder()
      .sourceType("local")
      .git(externalSourceGitModel)
      .build();

      SystemLock systemLockModel = new SystemLock.Builder()
      .sysLocked(true)
      .sysLockedBy("testString")
      .sysLockedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();

      TargetResourceset targetResourcesetModel = new TargetResourceset.Builder()
      .name("testString")
      .type("testString")
      .description("testString")
      .resourceQuery("testString")
      .credential("testString")
      .sysLock(systemLockModel)
      .build();

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

      VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .build();

      ActionState actionStateModel = new ActionState.Builder()
      .statusCode("normal")
      .statusMessage("testString")
      .build();

      CreateActionOptions createActionOptions = new CreateActionOptions.Builder()
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

      // Invoke operation
      Response<Action> response = service.createAction(createActionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Action actionResult = response.getResult();

      assertNotNull(actionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListActions() throws Exception {
    try {
      ListActionsOptions listActionsOptions = new ListActionsOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("1"))
      .sort("testString")
      .profile("ids")
      .build();

      // Invoke operation
      Response<ActionList> response = service.listActions(listActionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ActionList actionListResult = response.getResult();

      assertNotNull(actionListResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetAction() throws Exception {
    try {
      GetActionOptions getActionOptions = new GetActionOptions.Builder()
      .actionId("testString")
      .profile("summary")
      .build();

      // Invoke operation
      Response<Action> response = service.getAction(getActionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Action actionResult = response.getResult();

      assertNotNull(actionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateAction() throws Exception {
    try {
      UserState userStateModel = new UserState.Builder()
      .state("draft")
      .setBy("testString")
      .setAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();

      ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
      .gitRepoUrl("testString")
      .gitToken("testString")
      .gitRepoFolder("testString")
      .gitRelease("testString")
      .gitBranch("testString")
      .build();

      ExternalSource externalSourceModel = new ExternalSource.Builder()
      .sourceType("local")
      .git(externalSourceGitModel)
      .build();

      SystemLock systemLockModel = new SystemLock.Builder()
      .sysLocked(true)
      .sysLockedBy("testString")
      .sysLockedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();

      TargetResourceset targetResourcesetModel = new TargetResourceset.Builder()
      .name("testString")
      .type("testString")
      .description("testString")
      .resourceQuery("testString")
      .credential("testString")
      .sysLock(systemLockModel)
      .build();

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

      VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .build();

      ActionState actionStateModel = new ActionState.Builder()
      .statusCode("normal")
      .statusMessage("testString")
      .build();

      UpdateActionOptions updateActionOptions = new UpdateActionOptions.Builder()
      .actionId("testString")
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

      // Invoke operation
      Response<Action> response = service.updateAction(updateActionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Action actionResult = response.getResult();

      assertNotNull(actionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateJob() throws Exception {
    try {
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

      VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .build();

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

      JobStatus jobStatusModel = new JobStatus.Builder()
      .actionJobStatus(jobStatusActionModel)
      .build();

      JobDataAction jobDataActionModel = new JobDataAction.Builder()
      .actionName("testString")
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .updatedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();

      JobData jobDataModel = new JobData.Builder()
      .jobType("repo_download_job")
      .actionJobData(jobDataActionModel)
      .build();

      SystemLock systemLockModel = new SystemLock.Builder()
      .sysLocked(true)
      .sysLockedBy("testString")
      .sysLockedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();

      TargetResourceset targetResourcesetModel = new TargetResourceset.Builder()
      .name("testString")
      .type("testString")
      .description("testString")
      .resourceQuery("testString")
      .credential("testString")
      .sysLock(systemLockModel)
      .build();

      JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
      .build();

      JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
      .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .ok(Double.valueOf("72.5"))
      .changed(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .skipped(Double.valueOf("72.5"))
      .unreachable(Double.valueOf("72.5"))
      .build();

      JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
      .recap(jobLogSummaryActionJobRecapModel)
      .build();

      JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
      .jobType("repo_download_job")
      .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
      .actionJob(jobLogSummaryActionJobModel)
      .build();

      CreateJobOptions createJobOptions = new CreateJobOptions.Builder()
      .refreshToken("testString")
      .commandObject("workspace")
      .commandObjectId("testString")
      .commandName("workspace_init_flow")
      .commandParameter("testString")
      .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .location("us_south")
      .status(jobStatusModel)
      .data(jobDataModel)
      .bastion(targetResourcesetModel)
      .logSummary(jobLogSummaryModel)
      .build();

      // Invoke operation
      Response<Job> response = service.createJob(createJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      Job jobResult = response.getResult();

      assertNotNull(jobResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListJobs() throws Exception {
    try {
      ListJobsOptions listJobsOptions = new ListJobsOptions.Builder()
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("1"))
      .sort("testString")
      .profile("ids")
      .resource("workspaces")
      .actionId("testString")
      .list("all")
      .build();

      // Invoke operation
      Response<JobList> response = service.listJobs(listJobsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      JobList jobListResult = response.getResult();

      assertNotNull(jobListResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceJob() throws Exception {
    try {
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

      VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .build();

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

      JobStatus jobStatusModel = new JobStatus.Builder()
      .actionJobStatus(jobStatusActionModel)
      .build();

      JobDataAction jobDataActionModel = new JobDataAction.Builder()
      .actionName("testString")
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .updatedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();

      JobData jobDataModel = new JobData.Builder()
      .jobType("repo_download_job")
      .actionJobData(jobDataActionModel)
      .build();

      SystemLock systemLockModel = new SystemLock.Builder()
      .sysLocked(true)
      .sysLockedBy("testString")
      .sysLockedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();

      TargetResourceset targetResourcesetModel = new TargetResourceset.Builder()
      .name("testString")
      .type("testString")
      .description("testString")
      .resourceQuery("testString")
      .credential("testString")
      .sysLock(systemLockModel)
      .build();

      JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
      .build();

      JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
      .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .ok(Double.valueOf("72.5"))
      .changed(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .skipped(Double.valueOf("72.5"))
      .unreachable(Double.valueOf("72.5"))
      .build();

      JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
      .recap(jobLogSummaryActionJobRecapModel)
      .build();

      JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
      .jobType("repo_download_job")
      .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
      .actionJob(jobLogSummaryActionJobModel)
      .build();

      ReplaceJobOptions replaceJobOptions = new ReplaceJobOptions.Builder()
      .jobId("testString")
      .refreshToken("testString")
      .commandObject("workspace")
      .commandObjectId("testString")
      .commandName("workspace_init_flow")
      .commandParameter("testString")
      .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .location("us_south")
      .status(jobStatusModel)
      .data(jobDataModel)
      .bastion(targetResourcesetModel)
      .logSummary(jobLogSummaryModel)
      .build();

      // Invoke operation
      Response<Job> response = service.replaceJob(replaceJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      Job jobResult = response.getResult();

      assertNotNull(jobResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetJob() throws Exception {
    try {
      GetJobOptions getJobOptions = new GetJobOptions.Builder()
      .jobId("testString")
      .profile("summary")
      .build();

      // Invoke operation
      Response<Job> response = service.getJob(getJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Job jobResult = response.getResult();

      assertNotNull(jobResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListJobLogs() throws Exception {
    try {
      ListJobLogsOptions listJobLogsOptions = new ListJobLogsOptions.Builder()
      .jobId("testString")
      .build();

      // Invoke operation
      Response<JobLog> response = service.listJobLogs(listJobLogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      JobLog jobLogResult = response.getResult();

      assertNotNull(jobLogResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListJobStates() throws Exception {
    try {
      ListJobStatesOptions listJobStatesOptions = new ListJobStatesOptions.Builder()
      .jobId("testString")
      .build();

      // Invoke operation
      Response<JobStateData> response = service.listJobStates(listJobStatesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      JobStateData jobStateDataResult = response.getResult();

      assertNotNull(jobStateDataResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListSharedDatasets() throws Exception {
    try {
      ListSharedDatasetsOptions listSharedDatasetsOptions = new ListSharedDatasetsOptions();

      // Invoke operation
      Response<SharedDatasetResponseList> response = service.listSharedDatasets(listSharedDatasetsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SharedDatasetResponseList sharedDatasetResponseListResult = response.getResult();

      assertNotNull(sharedDatasetResponseListResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateSharedDataset() throws Exception {
    try {
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

      CreateSharedDatasetOptions createSharedDatasetOptions = new CreateSharedDatasetOptions.Builder()
      .autoPropagateChange(true)
      .description("testString")
      .effectedWorkspaceIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .resourceGroup("testString")
      .sharedDatasetData(new java.util.ArrayList<SharedDatasetData>(java.util.Arrays.asList(sharedDatasetDataModel)))
      .sharedDatasetName("testString")
      .sharedDatasetSourceName("testString")
      .sharedDatasetType(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .version("testString")
      .build();

      // Invoke operation
      Response<SharedDatasetResponse> response = service.createSharedDataset(createSharedDatasetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SharedDatasetResponse sharedDatasetResponseResult = response.getResult();

      assertNotNull(sharedDatasetResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetSharedDataset() throws Exception {
    try {
      GetSharedDatasetOptions getSharedDatasetOptions = new GetSharedDatasetOptions.Builder()
      .sdId("testString")
      .build();

      // Invoke operation
      Response<SharedDatasetResponse> response = service.getSharedDataset(getSharedDatasetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SharedDatasetResponse sharedDatasetResponseResult = response.getResult();

      assertNotNull(sharedDatasetResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceSharedDataset() throws Exception {
    try {
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

      ReplaceSharedDatasetOptions replaceSharedDatasetOptions = new ReplaceSharedDatasetOptions.Builder()
      .sdId("testString")
      .autoPropagateChange(true)
      .description("testString")
      .effectedWorkspaceIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .resourceGroup("testString")
      .sharedDatasetData(new java.util.ArrayList<SharedDatasetData>(java.util.Arrays.asList(sharedDatasetDataModel)))
      .sharedDatasetName("testString")
      .sharedDatasetSourceName("testString")
      .sharedDatasetType(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .version("testString")
      .build();

      // Invoke operation
      Response<SharedDatasetResponse> response = service.replaceSharedDataset(replaceSharedDatasetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SharedDatasetResponse sharedDatasetResponseResult = response.getResult();

      assertNotNull(sharedDatasetResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetKmsSettings() throws Exception {
    try {
      GetKmsSettingsOptions getKmsSettingsOptions = new GetKmsSettingsOptions.Builder()
      .location("testString")
      .build();

      // Invoke operation
      Response<KMSSettings> response = service.getKmsSettings(getKmsSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      KMSSettings kmsSettingsResult = response.getResult();

      assertNotNull(kmsSettingsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceKmsSettings() throws Exception {
    try {
      KMSSettingsPrimaryCrk kmsSettingsPrimaryCrkModel = new KMSSettingsPrimaryCrk.Builder()
      .kmsName("testString")
      .kmsPrivateEndpoint("testString")
      .keyCrn("testString")
      .build();

      KMSSettingsSecondaryCrk kmsSettingsSecondaryCrkModel = new KMSSettingsSecondaryCrk.Builder()
      .kmsName("testString")
      .kmsPrivateEndpoint("testString")
      .keyCrn("testString")
      .build();

      ReplaceKmsSettingsOptions replaceKmsSettingsOptions = new ReplaceKmsSettingsOptions.Builder()
      .location("testString")
      .encryptionScheme("testString")
      .resourceGroup("testString")
      .primaryCrk(kmsSettingsPrimaryCrkModel)
      .secondaryCrk(kmsSettingsSecondaryCrkModel)
      .build();

      // Invoke operation
      Response<KMSSettings> response = service.replaceKmsSettings(replaceKmsSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      KMSSettings kmsSettingsResult = response.getResult();

      assertNotNull(kmsSettingsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDiscoveredKmsInstances() throws Exception {
    try {
      GetDiscoveredKmsInstancesOptions getDiscoveredKmsInstancesOptions = new GetDiscoveredKmsInstancesOptions.Builder()
      .encryptionScheme("testString")
      .location("testString")
      .resourceGroup("testString")
      .limit(Long.valueOf("1"))
      .sort("testString")
      .build();

      // Invoke operation
      Response<KMSDiscovery> response = service.getDiscoveredKmsInstances(getDiscoveredKmsInstancesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      KMSDiscovery kmsDiscoveryResult = response.getResult();

      assertNotNull(kmsDiscoveryResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteWorkspaceActivity() throws Exception {
    try {
      DeleteWorkspaceActivityOptions deleteWorkspaceActivityOptions = new DeleteWorkspaceActivityOptions.Builder()
      .wId("testString")
      .activityId("testString")
      .build();

      // Invoke operation
      Response<WorkspaceActivityApplyResult> response = service.deleteWorkspaceActivity(deleteWorkspaceActivityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      WorkspaceActivityApplyResult workspaceActivityApplyResultResult = response.getResult();

      assertNotNull(workspaceActivityApplyResultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteWorkspace() throws Exception {
    try {
      DeleteWorkspaceOptions deleteWorkspaceOptions = new DeleteWorkspaceOptions.Builder()
      .wId("testString")
      .refreshToken("testString")
      .destroyResources("testString")
      .build();

      // Invoke operation
      Response<String> response = service.deleteWorkspace(deleteWorkspaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      String resultResult = response.getResult();

      assertNotNull(resultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteSharedDataset() throws Exception {
    try {
      DeleteSharedDatasetOptions deleteSharedDatasetOptions = new DeleteSharedDatasetOptions.Builder()
      .sdId("testString")
      .build();

      // Invoke operation
      Response<SharedDatasetResponse> response = service.deleteSharedDataset(deleteSharedDatasetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SharedDatasetResponse sharedDatasetResponseResult = response.getResult();

      assertNotNull(sharedDatasetResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteJob() throws Exception {
    try {
      DeleteJobOptions deleteJobOptions = new DeleteJobOptions.Builder()
      .jobId("testString")
      .refreshToken("testString")
      .force(true)
      .propagate(true)
      .build();

      // Invoke operation
      Response<Void> response = service.deleteJob(deleteJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteAction() throws Exception {
    try {
      DeleteActionOptions deleteActionOptions = new DeleteActionOptions.Builder()
      .actionId("testString")
      .force(true)
      .propagate(true)
      .build();

      // Invoke operation
      Response<Void> response = service.deleteAction(deleteActionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
