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
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceDeletionJobOptions;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.DeleteActionOptions;
import com.ibm.cloud.schematics.v1.model.DeleteJobOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceActivityOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.DestroyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.EnvVariableResponse;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.ExternalSourceGit;
import com.ibm.cloud.schematics.v1.model.GetActionOptions;
import com.ibm.cloud.schematics.v1.model.GetAllWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.GetJobOptions;
import com.ibm.cloud.schematics.v1.model.GetKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.GetSchematicsVersionOptions;
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
import com.ibm.cloud.schematics.v1.model.JobLogSummaryLogErrors;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryRepoDownloadJob;
import com.ibm.cloud.schematics.v1.model.JobStatus;
import com.ibm.cloud.schematics.v1.model.JobStatusAction;
import com.ibm.cloud.schematics.v1.model.KMSDiscovery;
import com.ibm.cloud.schematics.v1.model.KMSInstances;
import com.ibm.cloud.schematics.v1.model.KMSInstancesKeys;
import com.ibm.cloud.schematics.v1.model.KMSSettings;
import com.ibm.cloud.schematics.v1.model.KMSSettingsPrimaryCrk;
import com.ibm.cloud.schematics.v1.model.KMSSettingsSecondaryCrk;
import com.ibm.cloud.schematics.v1.model.ListActionsOptions;
import com.ibm.cloud.schematics.v1.model.ListJobLogsOptions;
import com.ibm.cloud.schematics.v1.model.ListJobsOptions;
import com.ibm.cloud.schematics.v1.model.ListResourceGroupOptions;
import com.ibm.cloud.schematics.v1.model.ListSchematicsLocationOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspaceActivitiesOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspacesOptions;
import com.ibm.cloud.schematics.v1.model.LogStoreResponse;
import com.ibm.cloud.schematics.v1.model.LogStoreResponseList;
import com.ibm.cloud.schematics.v1.model.LogSummary;
import com.ibm.cloud.schematics.v1.model.OutputValuesInner;
import com.ibm.cloud.schematics.v1.model.PlanWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.RefreshWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.ResourceGroupResponse;
import com.ibm.cloud.schematics.v1.model.RunWorkspaceCommandsOptions;
import com.ibm.cloud.schematics.v1.model.SchematicsLocations;
import com.ibm.cloud.schematics.v1.model.SharedTargetData;
import com.ibm.cloud.schematics.v1.model.SharedTargetDataResponse;
import com.ibm.cloud.schematics.v1.model.StateStoreResponse;
import com.ibm.cloud.schematics.v1.model.StateStoreResponseList;
import com.ibm.cloud.schematics.v1.model.SystemLock;
import com.ibm.cloud.schematics.v1.model.TemplateReadme;
import com.ibm.cloud.schematics.v1.model.TemplateRepoRequest;
import com.ibm.cloud.schematics.v1.model.TemplateRepoResponse;
import com.ibm.cloud.schematics.v1.model.TemplateRepoTarUploadResponse;
import com.ibm.cloud.schematics.v1.model.TemplateRepoUpdateRequest;
import com.ibm.cloud.schematics.v1.model.TemplateResources;
import com.ibm.cloud.schematics.v1.model.TemplateRunTimeDataResponse;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataRequest;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataResponse;
import com.ibm.cloud.schematics.v1.model.TemplateValues;
import com.ibm.cloud.schematics.v1.model.TerraformCommand;
import com.ibm.cloud.schematics.v1.model.UpdateActionOptions;
import com.ibm.cloud.schematics.v1.model.UpdateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.TemplateRepoUploadOptions;
import com.ibm.cloud.schematics.v1.model.UserState;
import com.ibm.cloud.schematics.v1.model.UserValues;
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
import com.ibm.cloud.schematics.v1.model.VersionResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivities;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivity;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityApplyResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityCommandResult;
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
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.sdk.core.security.IamToken;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.schematics.test.SdkIntegrationTestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
  public String refresh_token = "";
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

    IamAuthenticator auth = new IamAuthenticator(
      config.get(Authenticator.PROPNAME_APIKEY),
      config.get(Authenticator.PROPNAME_URL),
      config.get(Authenticator.PROPNAME_CLIENT_ID),
      config.get(Authenticator.PROPNAME_CLIENT_SECRET),
      false, null);

    IamToken token = auth.requestToken();

    refresh_token = token.getRefreshToken();

    System.out.println("Setup complete.");
  }

  public WorkspaceResponse getWorkspaceById(String wid) {

    GetWorkspaceOptions getWorkspaceOptions = new GetWorkspaceOptions.Builder()
    .wId(wid)
    .build();

    Response<WorkspaceResponse> workspaceResponse = service.getWorkspace(getWorkspaceOptions).execute();

    return workspaceResponse.getResult();
  }

  public void waitForWorkspaceStatus(String wid, String status) {
    String workspaceStatus = "";
    while (!workspaceStatus.equals(status)) {
      workspaceStatus = getWorkspaceById(wid).getStatus();
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void waitForWorkspaceActivityStatus(String wid, String activityid, String status) {
    String workspaceActivityStatus = "";
    while (!workspaceActivityStatus.equals(status)) {
      workspaceActivityStatus = getWorkspaceActivityById(wid, activityid).getStatus();
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public WorkspaceActivity getWorkspaceActivityById(String wid, String activityid) {
    GetWorkspaceActivityOptions getWorkspaceActivityOptions = new GetWorkspaceActivityOptions.Builder()
    .wId(wid)
    .activityId(activityid)
    .build();

    Response<WorkspaceActivity> workspaceActivity = service.getWorkspaceActivity(getWorkspaceActivityOptions).execute();

    return workspaceActivity.getResult();
  }


  public WorkspaceResponse createSampleWorkspaceWithoutRepoURL() throws Exception {
    try {
      WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .name("variable_name1")
      .type("string")
      .value("variable_value1")
      .build();

      TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
      .folder(".")
      .type("terraform_v0.11.14")
      .variablestore(new java.util.ArrayList<WorkspaceVariableRequest>(java.util.Arrays.asList(workspaceVariableRequestModel)))
      .build();

      CreateWorkspaceOptions createWorkspaceOptions = new CreateWorkspaceOptions.Builder()
      .description("Sample Workspace for SDK Integration Tests")
      .name("myworkspace")
      .templateData(new java.util.ArrayList<TemplateSourceDataRequest>(java.util.Arrays.asList(templateSourceDataRequestModel)))
      .type(new java.util.ArrayList<String>(java.util.Arrays.asList("terraform_v0.11.14")))
      .build();

      // Invoke operation
      Response<WorkspaceResponse> response = service.createWorkspace(createWorkspaceOptions).execute();
      // Validate response
      WorkspaceResponse workspaceResponseResult = response.getResult();

      return workspaceResponseResult;

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }

    return null;
  }

  public WorkspaceResponse createWorkspaceWithEmptyRepoURL() {
    try {
      com.ibm.cloud.schematics.v1.model.WorkspaceVariableRequest v1 = new WorkspaceVariableRequest.Builder()
      .name("variables_name1")
      .value("variables_value1")
      .build();

      com.ibm.cloud.schematics.v1.model.WorkspaceVariableRequest v2 = new WorkspaceVariableRequest.Builder()
      .name("variables_name2")
      .value("variables_value2")
      .build();

      com.ibm.cloud.schematics.v1.model.TemplateSourceDataRequest templateSourceDataRequest = new TemplateSourceDataRequest.Builder()
      .folder(".")
      .type("terraform_v0.11.14")
      .variablestore(Arrays.asList(v1, v2))
      .build();

      CreateWorkspaceOptions createWorkspaceOptions = new CreateWorkspaceOptions.Builder()
      .description("Sample Workspace for SDK Integration Tests")
      .location("us-east")
      .name("myworkspace")
      .addTemplateData(templateSourceDataRequest)
      .type(Arrays.asList("terraform_v0.11.14"))
      .tags(Arrays.asList("test"))
      .build();

      Response<WorkspaceResponse> response = service.createWorkspace(createWorkspaceOptions).execute();

      WorkspaceResponse workspaceResponseList = response.getResult();

      return workspaceResponseList;

    } catch (ServiceResponseException e) {
      System.out.println(e);
    }
    return null;
  }

  public WorkspaceResponse uploadTarFile() {
    try {
      WorkspaceResponse ws = createWorkspaceWithEmptyRepoURL();
      waitForWorkspaceStatus(ws.getId(), "DRAFT");

      String currentDir = System.getProperty("user.dir");

      TemplateRepoUploadOptions uploadTemplateTarOptions = new TemplateRepoUploadOptions.Builder()
      .wId(ws.getId())
      .tId(ws.getTemplateData().get(0).getId())
      .fileContentType("multipart/form-data")
      .file(new File(currentDir + "/testfiles/tf_cloudless_sleepy_git_archive.tar"))
      .build();

      Response<TemplateRepoTarUploadResponse> response = service.templateRepoUpload(uploadTemplateTarOptions).execute();

      TemplateRepoTarUploadResponse workspaceResponseList = response.getResult();

      return ws;

    } catch (ServiceResponseException e) {
      System.out.println(e);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return null;
  }

  public Object[] refreshWorkspaceActionById(String wid) {
    try {
      RefreshWorkspaceCommandOptions refreshWorkspaceCommandOptions = new RefreshWorkspaceCommandOptions.Builder()
      .wId(wid)
      .refreshToken(refresh_token)
      .build();

      Response<WorkspaceActivityRefreshResult> response = service
          .refreshWorkspaceCommand(refreshWorkspaceCommandOptions)
          .execute();

      WorkspaceActivityRefreshResult workspaceActivityRefreshResult = response.getResult();

      waitForWorkspaceActivityStatus(wid, workspaceActivityRefreshResult.getActivityid(), "COMPLETED");

      Object[] ret = new Object[2];

      ret[0] = wid;
      ret[1] = workspaceActivityRefreshResult.getActivityid();

      return ret;

    } catch (ServiceResponseException e) {
      System.out.println(e);
    } 

    return null;
  }

  public Object[] applyWorkspaceAction() {
    try {
      WorkspaceResponse ws = uploadTarFile();
      waitForWorkspaceStatus(ws.getId(), "INACTIVE");

      ApplyWorkspaceCommandOptions applyWorkspaceCommandOptions = new ApplyWorkspaceCommandOptions.Builder()
      .wId(ws.getId())
      .refreshToken(refresh_token)
      .build();

      Response<WorkspaceActivityApplyResult> response = service.applyWorkspaceCommand(applyWorkspaceCommandOptions)
          .execute();

      WorkspaceActivityApplyResult workspaceActivityApplyResult = response.getResult();

      waitForWorkspaceActivityStatus(ws.getId(), workspaceActivityApplyResult.getActivityid(), "COMPLETED");

      Object[] ret = new Object[2];

      ret[0] = ws;
      ret[1] = workspaceActivityApplyResult.getActivityid();

      return ret;

    } catch (ServiceResponseException e) {
      System.out.println(e);
    } 

    return null;
  }

  public class DeleteFailedException extends Exception {

    public DeleteFailedException(String message){
       super(message);
    }
  
  }

  public void deleteWorkspaceByID(String wid) {
    try {

      DeleteWorkspaceOptions deleteWorkspaceOptions = new DeleteWorkspaceOptions.Builder()
      .wId(wid)
      .refreshToken(refresh_token)
      .build();

      Response<String> response = service.deleteWorkspace(deleteWorkspaceOptions).execute();

      if(response.getStatusCode() != 200 ) {
        throw new DeleteFailedException("Delete workspace failed");
      }

    } catch (ServiceResponseException e) {
      System.out.println(e);
    } catch (DeleteFailedException e) {
      System.out.println(e);
    }
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
    String wid = "";
    try {
      WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .name("variablename1")
      .type("string")
      .value("variablevalue1")
      .build();

      TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
      .folder(".")
      .type("terraform_v0.11.14")
      .variablestore(new java.util.ArrayList<WorkspaceVariableRequest>(java.util.Arrays.asList(workspaceVariableRequestModel)))
      .build();

      CreateWorkspaceOptions createWorkspaceOptions = new CreateWorkspaceOptions.Builder()
      .description("Sample Workspace for Integration Tests")
      .name("myworkspace")
      .templateData(new java.util.ArrayList<TemplateSourceDataRequest>(java.util.Arrays.asList(templateSourceDataRequestModel)))
      .type(new java.util.ArrayList<String>(java.util.Arrays.asList("terraform_v0.11.14")))
      .build();

      // Invoke operation
      Response<WorkspaceResponse> response = service.createWorkspace(createWorkspaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      WorkspaceResponse workspaceResponseResult = response.getResult();
      wid = workspaceResponseResult.getId();

      assertNotNull(workspaceResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    } finally {
      deleteWorkspaceByID(wid);
    }
  }

  @Test
  public void testGetWorkspace() throws Exception {

    WorkspaceResponse ws = createSampleWorkspaceWithoutRepoURL();

    try {
      GetWorkspaceOptions getWorkspaceOptions = new GetWorkspaceOptions.Builder()
      .wId(ws.getId())
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
    } finally {
      deleteWorkspaceByID(ws.getId());
    }
  }

  @Test
  public void testReplaceWorkspace() throws Exception {
    
    WorkspaceResponse ws = createSampleWorkspaceWithoutRepoURL();

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

      TemplateRepoUpdateRequest templateRepoUpdateRequestModel = new TemplateRepoUpdateRequest.Builder()
      .url("https://github.com/ptaube/tf_cloudless_sleepy")
      .build();

      ReplaceWorkspaceOptions replaceWorkspaceOptions = new ReplaceWorkspaceOptions.Builder()
      .wId(ws.getId())
      .description("Sample Workspace for SDK Integration Tests -- updated")
      .name("myworkspace")
      .templateRepo(templateRepoUpdateRequestModel)
      .type(new java.util.ArrayList<String>(java.util.Arrays.asList("terraform_v0.12.20")))
      .build();

      // Invoke operation
      Response<WorkspaceResponse> response = service.replaceWorkspace(replaceWorkspaceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WorkspaceResponse workspaceResponseResult = response.getResult();

      waitForWorkspaceStatus(workspaceResponseResult.getId(), "INACTIVE");

      assertNotNull(workspaceResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    } finally {
      deleteWorkspaceByID(ws.getId());
    }
  }

  @Test
  public void testUpdateWorkspace() throws Exception {
    
    WorkspaceResponse ws = createSampleWorkspaceWithoutRepoURL();

    try {
      UpdateWorkspaceOptions updateWorkspaceOptions = new UpdateWorkspaceOptions.Builder()
      .wId(ws.getId())
      .description("Sample Workspace for SDK Integration Tests -- updated")
      .name("myworkspace updated")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .type(new java.util.ArrayList<String>(java.util.Arrays.asList("terraform_v0.12.20")))
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
    } finally {
      deleteWorkspaceByID(ws.getId());
    }
  }

  @Test
  public void testUploadTemplateTar() throws Exception {
    
    WorkspaceResponse ws = createSampleWorkspaceWithoutRepoURL();

    try {

      TemplateRepoUploadOptions uploadTemplateTarOptions = new TemplateRepoUploadOptions.Builder()
      .wId(ws.getId())
      .tId(ws.getTemplateData().get(0).getId())
      .file(new FileInputStream(new File("testfiles/tf_cloudless_sleepy_git_archive.tar")))
      .fileContentType("multipart/form-data")
      .build();

      // Invoke operation
      Response<TemplateRepoTarUploadResponse> response = service.templateRepoUpload(uploadTemplateTarOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TemplateRepoTarUploadResponse templateRepoTarUploadResponseResult = response.getResult();

      assertNotNull(templateRepoTarUploadResponseResult);

      waitForWorkspaceStatus(ws.getId(), "INACTIVE");

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    } finally {
      deleteWorkspaceByID(ws.getId());
    }
  }

  @Test
  public void testGetWorkspaceReadme() throws Exception {
    
    WorkspaceResponse ws = uploadTarFile();
    waitForWorkspaceStatus(ws.getId(), "INACTIVE");

    try {
      GetWorkspaceReadmeOptions getWorkspaceReadmeOptions = new GetWorkspaceReadmeOptions.Builder()
      .wId(ws.getId())
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
    } finally {
      deleteWorkspaceByID(ws.getId());
    }
  }

  @Test
  public void testListWorkspaceActivities() throws Exception {

    WorkspaceResponse ws = uploadTarFile();
    waitForWorkspaceStatus(ws.getId(), "INACTIVE");
    
    //Refresh action
    refreshWorkspaceActionById(ws.getId());

    try {
      ListWorkspaceActivitiesOptions listWorkspaceActivitiesOptions = new ListWorkspaceActivitiesOptions.Builder()
      .wId(ws.getId())
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
    } finally {
      deleteWorkspaceByID(ws.getId());
    }
  }

  @Test
  public void testGetWorkspaceActivity() throws Exception {

    WorkspaceResponse ws = uploadTarFile();
    waitForWorkspaceStatus(ws.getId(), "INACTIVE");
    
    Object[] res = refreshWorkspaceActionById(ws.getId());

    try {
      GetWorkspaceActivityOptions getWorkspaceActivityOptions = new GetWorkspaceActivityOptions.Builder()
      .wId(ws.getId())
      .activityId((String)res[1])
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
    } finally {
      deleteWorkspaceByID(ws.getId());
    }
  }

  @Test
  public void testRunWorkspaceCommands() throws Exception {

    Object res[] = applyWorkspaceAction();

    try {
      TerraformCommand terraformCommandModel = new TerraformCommand.Builder()
      .command("state show")
      .commandParams("data.template_file.test")
      .commandName("Test Command")
      .commandDesc("Check command execution")
      .commandOnError("continue")
      .commandDependsOn("")
      .build();

      RunWorkspaceCommandsOptions runWorkspaceCommandsOptions = new RunWorkspaceCommandsOptions.Builder()
      .wId(((WorkspaceResponse)res[0]).getId())
      .refreshToken(refresh_token)
      .commands(new java.util.ArrayList<TerraformCommand>(java.util.Arrays.asList(terraformCommandModel)))
      .operationName("testString")
      .description("testString")
      .build();

      // Invoke operation
      Response<WorkspaceActivityCommandResult> response = service.runWorkspaceCommands(runWorkspaceCommandsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      WorkspaceActivityCommandResult workspaceActivityCommandResultResult = response.getResult();

      waitForWorkspaceActivityStatus(((WorkspaceResponse)res[0]).getId(), workspaceActivityCommandResultResult.getActivityid(), "COMPLETED");

      assertNotNull(workspaceActivityCommandResultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    } finally {
      deleteWorkspaceByID(((WorkspaceResponse)res[0]).getId());
    }
  }

  @Test
  public void testApplyWorkspaceCommand() throws Exception {

    WorkspaceResponse ws = uploadTarFile();
    waitForWorkspaceStatus(ws.getId(), "INACTIVE");

    try {
      ApplyWorkspaceCommandOptions applyWorkspaceCommandOptions = new ApplyWorkspaceCommandOptions.Builder()
      .wId(ws.getId())
      .refreshToken(refresh_token)
      .build();

      // Invoke operation
      Response<WorkspaceActivityApplyResult> response = service.applyWorkspaceCommand(applyWorkspaceCommandOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      WorkspaceActivityApplyResult workspaceActivityApplyResultResult = response.getResult();

      waitForWorkspaceActivityStatus(ws.getId(), workspaceActivityApplyResultResult.getActivityid(), "COMPLETED");

      assertNotNull(workspaceActivityApplyResultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    } finally {
      deleteWorkspaceByID(ws.getId());
    }
  }

  @Test
  public void testDestroyWorkspaceCommand() throws Exception {

    WorkspaceResponse ws = createWorkspaceWithEmptyRepoURL();

    try {
      DestroyWorkspaceCommandOptions destroyWorkspaceCommandOptions = new DestroyWorkspaceCommandOptions.Builder()
      .wId(ws.getId())
      .refreshToken(refresh_token)
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

    WorkspaceResponse ws = uploadTarFile();
    waitForWorkspaceStatus(ws.getId(), "INACTIVE");

    try {
      PlanWorkspaceCommandOptions planWorkspaceCommandOptions = new PlanWorkspaceCommandOptions.Builder()
      .wId(ws.getId())
      .refreshToken(refresh_token)
      .build();

      // Invoke operation
      Response<WorkspaceActivityPlanResult> response = service.planWorkspaceCommand(planWorkspaceCommandOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      WorkspaceActivityPlanResult workspaceActivityPlanResultResult = response.getResult();

      waitForWorkspaceActivityStatus(ws.getId(), workspaceActivityPlanResultResult.getActivityid(), "COMPLETED");

      assertNotNull(workspaceActivityPlanResultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    } finally {
      deleteWorkspaceByID(ws.getId());
    }
  }

  @Test
  public void testRefreshWorkspaceCommand() throws Exception {

    WorkspaceResponse ws = uploadTarFile();
    waitForWorkspaceStatus(ws.getId(), "INACTIVE");

    try {
      RefreshWorkspaceCommandOptions refreshWorkspaceCommandOptions = new RefreshWorkspaceCommandOptions.Builder()
      .wId(ws.getId())
      .refreshToken(refresh_token)
      .build();

      // Invoke operation
      Response<WorkspaceActivityRefreshResult> response = service.refreshWorkspaceCommand(refreshWorkspaceCommandOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      WorkspaceActivityRefreshResult workspaceActivityRefreshResultResult = response.getResult();

      waitForWorkspaceActivityStatus(ws.getId(), workspaceActivityRefreshResultResult.getActivityid(), "COMPLETED");

      assertNotNull(workspaceActivityRefreshResultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    } finally {
      deleteWorkspaceByID(ws.getId());
    }
  }

  @Test
  public void testGetWorkspaceInputs() throws Exception {

    WorkspaceResponse ws = uploadTarFile();
    waitForWorkspaceStatus(ws.getId(), "INACTIVE");

    try {
      GetWorkspaceInputsOptions getWorkspaceInputsOptions = new GetWorkspaceInputsOptions.Builder()
      .wId(ws.getId())
      .tId(ws.getTemplateData().get(0).getId())
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
    } finally {
      deleteWorkspaceByID(ws.getId());
    }
  }

  @Test
  public void testReplaceWorkspaceInputs() throws Exception {

    WorkspaceResponse ws = uploadTarFile();
    waitForWorkspaceStatus(ws.getId(), "INACTIVE");

    try {
      WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
      .description("testString")
      .name("testString")
      .secure(true)
      .type("string")
      .useDefault(true)
      .value("testString")
      .build();

      ReplaceWorkspaceInputsOptions replaceWorkspaceInputsOptions = new ReplaceWorkspaceInputsOptions.Builder()
      .wId(ws.getId())
      .tId(ws.getTemplateData().get(0).getId())
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
    } finally {
      deleteWorkspaceByID(ws.getId());
    }
  }

  @Test
  public void testGetAllWorkspaceInputs() throws Exception {
    
    WorkspaceResponse ws = uploadTarFile();
    waitForWorkspaceStatus(ws.getId(), "INACTIVE");

    try {
      GetAllWorkspaceInputsOptions getAllWorkspaceInputsOptions = new GetAllWorkspaceInputsOptions.Builder()
      .wId(ws.getId())
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
    } finally {
      deleteWorkspaceByID(ws.getId());
    }
  }

  @Test
  public void testGetWorkspaceInputMetadata() throws Exception {

    WorkspaceResponse ws = uploadTarFile();
    waitForWorkspaceStatus(ws.getId(), "INACTIVE");

    try {
      GetWorkspaceInputMetadataOptions getWorkspaceInputMetadataOptions = new GetWorkspaceInputMetadataOptions.Builder()
      .wId(ws.getId())
      .tId(ws.getTemplateData().get(0).getId())
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
    } finally {
      deleteWorkspaceByID(ws.getId());
    }
  }

  @Test
  public void testGetWorkspaceOutputs() throws Exception {

    Object res[] = applyWorkspaceAction();

    try {
      GetWorkspaceOutputsOptions getWorkspaceOutputsOptions = new GetWorkspaceOutputsOptions.Builder()
      .wId(((WorkspaceResponse)res[0]).getId())
      .build();

      // Invoke operation
      Response<List<OutputValuesInner>> response = service.getWorkspaceOutputs(getWorkspaceOutputsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      List<OutputValuesInner> listOutputValuesItemResult = response.getResult();

      assertNotNull(listOutputValuesItemResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    } finally {
      deleteWorkspaceByID(((WorkspaceResponse)res[0]).getId());
    }
  }

  @Test
  public void testGetWorkspaceResources() throws Exception {

    Object res[] = applyWorkspaceAction();

    try {
      GetWorkspaceResourcesOptions getWorkspaceResourcesOptions = new GetWorkspaceResourcesOptions.Builder()
      .wId(((WorkspaceResponse)res[0]).getId())
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
    } finally {
      deleteWorkspaceByID(((WorkspaceResponse)res[0]).getId());
    }
  }

  @Test
  public void testGetWorkspaceState() throws Exception {

    Object res[] = applyWorkspaceAction();

    try {
      GetWorkspaceStateOptions getWorkspaceStateOptions = new GetWorkspaceStateOptions.Builder()
      .wId(((WorkspaceResponse)res[0]).getId())
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
    } finally {
      deleteWorkspaceByID(((WorkspaceResponse)res[0]).getId());
    }
  }

  @Test
  public void testGetWorkspaceTemplateState() throws Exception {

    Object res[] = applyWorkspaceAction();

    try {
      GetWorkspaceTemplateStateOptions getWorkspaceTemplateStateOptions = new GetWorkspaceTemplateStateOptions.Builder()
      .wId(((WorkspaceResponse)res[0]).getId())
      .tId(((WorkspaceResponse)res[0]).getTemplateData().get(0).getId())
      .build();

      // Invoke operation
      Response<Object> response = service.getWorkspaceTemplateState(getWorkspaceTemplateStateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Object templateStateStoreResult = response.getResult();

      assertNotNull(templateStateStoreResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    } finally {
      deleteWorkspaceByID(((WorkspaceResponse)res[0]).getId());
    }
  }

  @Test
  public void testGetWorkspaceActivityLogs() throws Exception {

    Object res[] = applyWorkspaceAction();

    try {
      GetWorkspaceActivityLogsOptions getWorkspaceActivityLogsOptions = new GetWorkspaceActivityLogsOptions.Builder()
      .wId(((WorkspaceResponse)res[0]).getId())
      .activityId((String)res[1])
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
    } finally {
      deleteWorkspaceByID(((WorkspaceResponse)res[0]).getId());
    }
  }

  @Test
  public void testGetWorkspaceLogUrls() throws Exception {

    Object res[] = applyWorkspaceAction();

    try {
      GetWorkspaceLogUrlsOptions getWorkspaceLogUrlsOptions = new GetWorkspaceLogUrlsOptions.Builder()
      .wId(((WorkspaceResponse)res[0]).getId())
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
    } finally {
      deleteWorkspaceByID(((WorkspaceResponse)res[0]).getId());
    }
  }

  @Test
  public void testGetTemplateLogs() throws Exception {

    Object res[] = applyWorkspaceAction();

    try {
      GetTemplateLogsOptions getTemplateLogsOptions = new GetTemplateLogsOptions.Builder()
      .wId(((WorkspaceResponse)res[0]).getId())
      .tId(((WorkspaceResponse)res[0]).getTemplateData().get(0).getId())
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
    } finally {
      deleteWorkspaceByID(((WorkspaceResponse)res[0]).getId());
    }
  }

  @Test
  public void testGetTemplateActivityLog() throws Exception {
    
    Object res[] = applyWorkspaceAction();

    try {
      GetTemplateActivityLogOptions getTemplateActivityLogOptions = new GetTemplateActivityLogOptions.Builder()
      .wId(((WorkspaceResponse)res[0]).getId())
      .tId(((WorkspaceResponse)res[0]).getTemplateData().get(0).getId())
      .activityId((String)res[1])
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
    } finally {
      deleteWorkspaceByID(((WorkspaceResponse)res[0]).getId());
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
