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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.86.1-c3d7bcef-20240308-215042
 */

package com.ibm.cloud.schematics.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.schematics.common.SdkCommon;
import com.ibm.cloud.schematics.v1.model.Action;
import com.ibm.cloud.schematics.v1.model.ActionList;
import com.ibm.cloud.schematics.v1.model.Agent;
import com.ibm.cloud.schematics.v1.model.AgentData;
import com.ibm.cloud.schematics.v1.model.AgentDataList;
import com.ibm.cloud.schematics.v1.model.AgentDeployJob;
import com.ibm.cloud.schematics.v1.model.AgentHealthJob;
import com.ibm.cloud.schematics.v1.model.AgentList;
import com.ibm.cloud.schematics.v1.model.AgentPRSJob;
import com.ibm.cloud.schematics.v1.model.AgentVersions;
import com.ibm.cloud.schematics.v1.model.ApplyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.Blueprint;
import com.ibm.cloud.schematics.v1.model.BlueprintList;
import com.ibm.cloud.schematics.v1.model.BlueprintTemplateRepoTarUploadResponse;
import com.ibm.cloud.schematics.v1.model.CreateActionOptions;
import com.ibm.cloud.schematics.v1.model.CreateAgentDataOptions;
import com.ibm.cloud.schematics.v1.model.CreateBlueprintOptions;
import com.ibm.cloud.schematics.v1.model.CreateInventoryOptions;
import com.ibm.cloud.schematics.v1.model.CreateJobOptions;
import com.ibm.cloud.schematics.v1.model.CreatePolicyOptions;
import com.ibm.cloud.schematics.v1.model.CreateResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceDeletionJobOptions;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.DeleteActionOptions;
import com.ibm.cloud.schematics.v1.model.DeleteAgentDataOptions;
import com.ibm.cloud.schematics.v1.model.DeleteAgentOptions;
import com.ibm.cloud.schematics.v1.model.DeleteBlueprintOptions;
import com.ibm.cloud.schematics.v1.model.DeleteInventoryOptions;
import com.ibm.cloud.schematics.v1.model.DeleteJobOptions;
import com.ibm.cloud.schematics.v1.model.DeletePolicyOptions;
import com.ibm.cloud.schematics.v1.model.DeleteResourcesQueryOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceActivityOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.DeployAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.DestroyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.ExecuteResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.GetActionOptions;
import com.ibm.cloud.schematics.v1.model.GetAgentDataOptions;
import com.ibm.cloud.schematics.v1.model.GetAgentOptions;
import com.ibm.cloud.schematics.v1.model.GetAgentVersionsOptions;
import com.ibm.cloud.schematics.v1.model.GetAllWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.GetBlueprintOptions;
import com.ibm.cloud.schematics.v1.model.GetDeployAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.GetHealthCheckAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.GetInventoryOptions;
import com.ibm.cloud.schematics.v1.model.GetJobFilesOptions;
import com.ibm.cloud.schematics.v1.model.GetJobOptions;
import com.ibm.cloud.schematics.v1.model.GetKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.GetPolicyOptions;
import com.ibm.cloud.schematics.v1.model.GetPrsAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.GetResourcesQueryOptions;
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
import com.ibm.cloud.schematics.v1.model.HealthCheckAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecord;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecordList;
import com.ibm.cloud.schematics.v1.model.Job;
import com.ibm.cloud.schematics.v1.model.JobFileData;
import com.ibm.cloud.schematics.v1.model.JobList;
import com.ibm.cloud.schematics.v1.model.JobLog;
import com.ibm.cloud.schematics.v1.model.KMSDiscovery;
import com.ibm.cloud.schematics.v1.model.KMSSettings;
import com.ibm.cloud.schematics.v1.model.ListActionsOptions;
import com.ibm.cloud.schematics.v1.model.ListAgentDataOptions;
import com.ibm.cloud.schematics.v1.model.ListAgentOptions;
import com.ibm.cloud.schematics.v1.model.ListBlueprintOptions;
import com.ibm.cloud.schematics.v1.model.ListInventoriesOptions;
import com.ibm.cloud.schematics.v1.model.ListJobLogsOptions;
import com.ibm.cloud.schematics.v1.model.ListJobsOptions;
import com.ibm.cloud.schematics.v1.model.ListKmsOptions;
import com.ibm.cloud.schematics.v1.model.ListLocationsOptions;
import com.ibm.cloud.schematics.v1.model.ListPolicyOptions;
import com.ibm.cloud.schematics.v1.model.ListResourceGroupOptions;
import com.ibm.cloud.schematics.v1.model.ListResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.ListSchematicsLocationOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspaceActivitiesOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspacesOptions;
import com.ibm.cloud.schematics.v1.model.LogStoreResponseList;
import com.ibm.cloud.schematics.v1.model.OutputValuesInner;
import com.ibm.cloud.schematics.v1.model.PlanWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.Policy;
import com.ibm.cloud.schematics.v1.model.PolicyList;
import com.ibm.cloud.schematics.v1.model.ProcessTemplateMetaDataOptions;
import com.ibm.cloud.schematics.v1.model.PrsAgentJobOptions;
import com.ibm.cloud.schematics.v1.model.RefreshWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.RegisterAgentOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceBlueprintOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceInventoryOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceResourcesQueryOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.ResourceGroupResponse;
import com.ibm.cloud.schematics.v1.model.ResourceQueryRecord;
import com.ibm.cloud.schematics.v1.model.ResourceQueryRecordList;
import com.ibm.cloud.schematics.v1.model.ResourceQueryResponseRecord;
import com.ibm.cloud.schematics.v1.model.RunWorkspaceCommandsOptions;
import com.ibm.cloud.schematics.v1.model.SchematicsLocations;
import com.ibm.cloud.schematics.v1.model.SchematicsLocationsList;
import com.ibm.cloud.schematics.v1.model.StateStoreResponseList;
import com.ibm.cloud.schematics.v1.model.TemplateMetaDataResponse;
import com.ibm.cloud.schematics.v1.model.TemplateReadme;
import com.ibm.cloud.schematics.v1.model.TemplateRepoTarUploadResponse;
import com.ibm.cloud.schematics.v1.model.TemplateRepoUploadOptions;
import com.ibm.cloud.schematics.v1.model.TemplateResources;
import com.ibm.cloud.schematics.v1.model.TemplateStateStore;
import com.ibm.cloud.schematics.v1.model.TemplateValues;
import com.ibm.cloud.schematics.v1.model.UpdateActionOptions;
import com.ibm.cloud.schematics.v1.model.UpdateAgentDataOptions;
import com.ibm.cloud.schematics.v1.model.UpdateAgentRegistrationOptions;
import com.ibm.cloud.schematics.v1.model.UpdateJobOptions;
import com.ibm.cloud.schematics.v1.model.UpdateKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.UpdatePolicyOptions;
import com.ibm.cloud.schematics.v1.model.UpdateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.UploadTemplateTarActionOptions;
import com.ibm.cloud.schematics.v1.model.UploadTemplateTarBlueprintOptions;
import com.ibm.cloud.schematics.v1.model.UserValues;
import com.ibm.cloud.schematics.v1.model.VersionResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivities;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivity;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityApplyResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityCommandResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityDestroyResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityLogs;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityPlanResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityRefreshResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceBulkDeleteResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceJobResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceResponseList;
import com.ibm.cloud.schematics.v1.model.WorkspaceTemplateValuesResponse;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;
import okhttp3.MultipartBody;

/**
 * IBM Cloud Schematics service is to provide the capability to manage resources  of cloud provider infrastructure by
 * using file based configurations.  With the IBM Cloud Schematics service you can specify the  required set of
 * resources and the configuration in `config files`,  and then pass the config files to the service to fulfill it by
 * calling the necessary actions on the infrastructure.  This principle is known as Infrastructure as Code.  For more
 * information, refer to [Getting started with IBM Cloud Schematics]
 * (https://cloud.ibm.com/docs/schematics?topic=schematics-getting-started).
 *
 * API Version: 1.0
 */
public class Schematics extends BaseService {
  private static final Logger LOGGER = Logger.getLogger(Schematics.class.getName());

  /**
   * Default service name used when configuring the `Schematics` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "schematics";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://schematics.cloud.ibm.com";

 /**
   * Class method which constructs an instance of the `Schematics` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `Schematics` client using external configuration
   */
  public static Schematics newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Schematics` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Schematics` client using external configuration
   */
  public static Schematics newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Schematics service = new Schematics(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Schematics` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Schematics(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * List supported schematics locations.
   *
   * Retrieve a list of IBM Cloud locations where you can create the Schematics workspace or action. workspaces.
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions,
   *   see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listSchematicsLocationOptions the {@link ListSchematicsLocationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<SchematicsLocations>> listSchematicsLocation(ListSchematicsLocationOptions listSchematicsLocationOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/locations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listSchematicsLocation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<List<SchematicsLocations>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<SchematicsLocations>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List supported schematics locations.
   *
   * Retrieve a list of IBM Cloud locations where you can create the Schematics workspace or action. workspaces.
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions,
   *   see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<SchematicsLocations>> listSchematicsLocation() {
    return listSchematicsLocation(null);
  }

  /**
   * List supported locations.
   *
   * Retrieve a list of IBM Cloud locations where you can work with the Schematics objects.
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions,
   *   see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listLocationsOptions the {@link ListLocationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SchematicsLocationsList}
   */
  public ServiceCall<SchematicsLocationsList> listLocations(ListLocationsOptions listLocationsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/locations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listLocations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SchematicsLocationsList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SchematicsLocationsList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List supported locations.
   *
   * Retrieve a list of IBM Cloud locations where you can work with the Schematics objects.
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions,
   *   see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link SchematicsLocationsList}
   */
  public ServiceCall<SchematicsLocationsList> listLocations() {
    return listLocations(null);
  }

  /**
   * List resource groups.
   *
   * Retrieve a list of IBM Cloud resource groups that your account has access to.
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions,
   *   see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listResourceGroupOptions the {@link ListResourceGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<ResourceGroupResponse>> listResourceGroup(ListResourceGroupOptions listResourceGroupOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/resource_groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listResourceGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<List<ResourceGroupResponse>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<ResourceGroupResponse>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List resource groups.
   *
   * Retrieve a list of IBM Cloud resource groups that your account has access to.
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions,
   *   see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<ResourceGroupResponse>> listResourceGroup() {
    return listResourceGroup(null);
  }

  /**
   * Get Schematics API information.
   *
   * Retrieve detailed information about the IBM Cloud Schematics API version and the version of the provider plug-ins
   * that the API uses.
   *
   * @param getSchematicsVersionOptions the {@link GetSchematicsVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VersionResponse}
   */
  public ServiceCall<VersionResponse> getSchematicsVersion(GetSchematicsVersionOptions getSchematicsVersionOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/version"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getSchematicsVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<VersionResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VersionResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Schematics API information.
   *
   * Retrieve detailed information about the IBM Cloud Schematics API version and the version of the provider plug-ins
   * that the API uses.
   *
   * @return a {@link ServiceCall} with a result of type {@link VersionResponse}
   */
  public ServiceCall<VersionResponse> getSchematicsVersion() {
    return getSchematicsVersion(null);
  }

  /**
   * Get variable metadata by parsing the template.
   *
   * Get the variable metadata from the template. This metadata can be passed in the payload during Schematics workspace
   * create or update API call.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param processTemplateMetaDataOptions the {@link ProcessTemplateMetaDataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateMetaDataResponse}
   */
  public ServiceCall<TemplateMetaDataResponse> processTemplateMetaData(ProcessTemplateMetaDataOptions processTemplateMetaDataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(processTemplateMetaDataOptions,
      "processTemplateMetaDataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/template_metadata_processor"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "processTemplateMetaData");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (processTemplateMetaDataOptions.xGithubToken() != null) {
      builder.header("X-Github-token", processTemplateMetaDataOptions.xGithubToken());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("template_type", processTemplateMetaDataOptions.templateType());
    contentJson.add("source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(processTemplateMetaDataOptions.source()));
    if (processTemplateMetaDataOptions.region() != null) {
      contentJson.addProperty("region", processTemplateMetaDataOptions.region());
    }
    if (processTemplateMetaDataOptions.sourceType() != null) {
      contentJson.addProperty("source_type", processTemplateMetaDataOptions.sourceType());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<TemplateMetaDataResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateMetaDataResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List workspaces.
   *
   * Retrieve a list of Schematics workspaces from your IBM Cloud account that you have access to. The list of
   * workspaces that is returned depends on the API endpoint that you use. For example, if you use an API endpoint for a
   * geography, such as North America, only workspaces that are created in `us-south` or `us-east` are returned.
   *
   *  For more information about supported API endpoints, see [API endpoints](/apidocs/schematics#api-endpoints).
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions,
   *   see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listWorkspacesOptions the {@link ListWorkspacesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceResponseList}
   */
  public ServiceCall<WorkspaceResponseList> listWorkspaces(ListWorkspacesOptions listWorkspacesOptions) {
    if (listWorkspacesOptions == null) {
      listWorkspacesOptions = new ListWorkspacesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listWorkspaces");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listWorkspacesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listWorkspacesOptions.offset()));
    }
    if (listWorkspacesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listWorkspacesOptions.limit()));
    }
    if (listWorkspacesOptions.profile() != null) {
      builder.query("profile", String.valueOf(listWorkspacesOptions.profile()));
    }
    if (listWorkspacesOptions.resourceGroup() != null) {
      builder.query("resource_group", String.valueOf(listWorkspacesOptions.resourceGroup()));
    }
    ResponseConverter<WorkspaceResponseList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceResponseList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List workspaces.
   *
   * Retrieve a list of Schematics workspaces from your IBM Cloud account that you have access to. The list of
   * workspaces that is returned depends on the API endpoint that you use. For example, if you use an API endpoint for a
   * geography, such as North America, only workspaces that are created in `us-south` or `us-east` are returned.
   *
   *  For more information about supported API endpoints, see [API endpoints](/apidocs/schematics#api-endpoints).
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions,
   *   see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceResponseList}
   */
  public ServiceCall<WorkspaceResponseList> listWorkspaces() {
    return listWorkspaces(null);
  }

  /**
   * Create a workspace.
   *
   * Create an IBM Cloud Schematics workspace that points to the source repository where your Terraform template or the
   * IBM Cloud software template is stored. You can decide to create your workspace without connecting it to a GitHub or
   * GitLab repository. Your workspace is then created with a **Draft** state. To later connect your workspace to a
   * GitHub or GitLab repository, you must use the `PUT /v1/workspaces/{id}` API to update the workspace or use the
   * `/v1/workspaces/{id}/templates/{template_id}/template_repo_upload` API to upload a TAR file instead.
   *
   *  **Getting API endpoint**:-
   *
   *  * The Schematics API endpoint that you use to create the workspace determines where your Schematics actions run
   * and your data is stored. See [API endpoints](/apidocs/schematics#api-endpoints) for more information.
   *  * If you use the API endpoint for a geography and not a specific location, such as North America, you can specify
   * the location in your API request body.
   *  * If you do not specify the location in the request body, Schematics determines your workspace location based on
   * availability.
   *  * If you use an API endpoint for a specific location, such as Frankfurt, the location that you enter in your API
   * request body must match your API endpoint.
   *  * You also have the option to not specify a location in your API request body if you use a location-specific API
   * endpoint.
   *
   *  **Getting IAM access token** :-
   *  * Before you create Schematics workspace, you need to create the IAM access token for your IBM Cloud Account.
   *  * To create IAM access token, use `export IBMCLOUD_API_KEY=&lt;ibmcloud_api_key&gt;` and execute `curl -X POST
   * "https://iam.cloud.ibm.com/identity/token" -H "Content-Type= application/x-www-form-urlencoded" -d
   * "grant_type=urn:ibm:params:oauth:grant-type:apikey&amp;apikey=$IBMCLOUD_API_KEY" -u bx:bx`. For more information,
   * about creating IAM access token and API Docs, see [IAM access
   * token](/apidocs/iam-identity-token-api#gettoken-password) and [Create API
   * key](/apidocs/iam-identity-token-api#create-api-key).
   *  * You can set the environment values  `export ACCESS_TOKEN=&lt;access_token&gt;` and `export
   * REFRESH_TOKEN=&lt;refresh_token&gt;`.
   *  * You can use the obtained IAM access token in create workspace `curl` command.
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions,
   *   see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param createWorkspaceOptions the {@link CreateWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceResponse}
   */
  public ServiceCall<WorkspaceResponse> createWorkspace(CreateWorkspaceOptions createWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createWorkspaceOptions,
      "createWorkspaceOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createWorkspaceOptions.xGithubToken() != null) {
      builder.header("X-Github-token", createWorkspaceOptions.xGithubToken());
    }
    final JsonObject contentJson = new JsonObject();
    if (createWorkspaceOptions.appliedShareddataIds() != null) {
      contentJson.add("applied_shareddata_ids", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.appliedShareddataIds()));
    }
    if (createWorkspaceOptions.catalogRef() != null) {
      contentJson.add("catalog_ref", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.catalogRef()));
    }
    if (createWorkspaceOptions.dependencies() != null) {
      contentJson.add("dependencies", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.dependencies()));
    }
    if (createWorkspaceOptions.description() != null) {
      contentJson.addProperty("description", createWorkspaceOptions.description());
    }
    if (createWorkspaceOptions.location() != null) {
      contentJson.addProperty("location", createWorkspaceOptions.location());
    }
    if (createWorkspaceOptions.name() != null) {
      contentJson.addProperty("name", createWorkspaceOptions.name());
    }
    if (createWorkspaceOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", createWorkspaceOptions.resourceGroup());
    }
    if (createWorkspaceOptions.sharedData() != null) {
      contentJson.add("shared_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.sharedData()));
    }
    if (createWorkspaceOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.tags()));
    }
    if (createWorkspaceOptions.templateData() != null) {
      contentJson.add("template_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.templateData()));
    }
    if (createWorkspaceOptions.templateRef() != null) {
      contentJson.addProperty("template_ref", createWorkspaceOptions.templateRef());
    }
    if (createWorkspaceOptions.templateRepo() != null) {
      contentJson.add("template_repo", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.templateRepo()));
    }
    if (createWorkspaceOptions.type() != null) {
      contentJson.add("type", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.type()));
    }
    if (createWorkspaceOptions.workspaceStatus() != null) {
      contentJson.add("workspace_status", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceOptions.workspaceStatus()));
    }
    if (createWorkspaceOptions.agentId() != null) {
      contentJson.addProperty("agent_id", createWorkspaceOptions.agentId());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a workspace.
   *
   * Create an IBM Cloud Schematics workspace that points to the source repository where your Terraform template or the
   * IBM Cloud software template is stored. You can decide to create your workspace without connecting it to a GitHub or
   * GitLab repository. Your workspace is then created with a **Draft** state. To later connect your workspace to a
   * GitHub or GitLab repository, you must use the `PUT /v1/workspaces/{id}` API to update the workspace or use the
   * `/v1/workspaces/{id}/templates/{template_id}/template_repo_upload` API to upload a TAR file instead.
   *
   *  **Getting API endpoint**:-
   *
   *  * The Schematics API endpoint that you use to create the workspace determines where your Schematics actions run
   * and your data is stored. See [API endpoints](/apidocs/schematics#api-endpoints) for more information.
   *  * If you use the API endpoint for a geography and not a specific location, such as North America, you can specify
   * the location in your API request body.
   *  * If you do not specify the location in the request body, Schematics determines your workspace location based on
   * availability.
   *  * If you use an API endpoint for a specific location, such as Frankfurt, the location that you enter in your API
   * request body must match your API endpoint.
   *  * You also have the option to not specify a location in your API request body if you use a location-specific API
   * endpoint.
   *
   *  **Getting IAM access token** :-
   *  * Before you create Schematics workspace, you need to create the IAM access token for your IBM Cloud Account.
   *  * To create IAM access token, use `export IBMCLOUD_API_KEY=&lt;ibmcloud_api_key&gt;` and execute `curl -X POST
   * "https://iam.cloud.ibm.com/identity/token" -H "Content-Type= application/x-www-form-urlencoded" -d
   * "grant_type=urn:ibm:params:oauth:grant-type:apikey&amp;apikey=$IBMCLOUD_API_KEY" -u bx:bx`. For more information,
   * about creating IAM access token and API Docs, see [IAM access
   * token](/apidocs/iam-identity-token-api#gettoken-password) and [Create API
   * key](/apidocs/iam-identity-token-api#create-api-key).
   *  * You can set the environment values  `export ACCESS_TOKEN=&lt;access_token&gt;` and `export
   * REFRESH_TOKEN=&lt;refresh_token&gt;`.
   *  * You can use the obtained IAM access token in create workspace `curl` command.
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions,
   *   see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceResponse}
   */
  public ServiceCall<WorkspaceResponse> createWorkspace() {
    return createWorkspace(null);
  }

  /**
   * Get workspace details.
   *
   * Retrieve detailed information for a workspace in your IBM Cloud account.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see [Schematics service access
   *  roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getWorkspaceOptions the {@link GetWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceResponse}
   */
  public ServiceCall<WorkspaceResponse> getWorkspace(GetWorkspaceOptions getWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceOptions,
      "getWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WorkspaceResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update workspace.
   *
   * Use this API to update or replace the entire workspace, including the Terraform template (`template_repo`) or IBM
   * Cloud catalog software template (`catalog_ref`) that your workspace points to.
   *
   *  **Tip**:- If you want to update workspace metadata, use the `PATCH /v1/workspaces/{id}` API.
   *  To update workspace variables, use the `PUT /v1/workspaces/{id}/template_data/{template_id}/values` API.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param replaceWorkspaceOptions the {@link ReplaceWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceResponse}
   */
  public ServiceCall<WorkspaceResponse> replaceWorkspace(ReplaceWorkspaceOptions replaceWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceWorkspaceOptions,
      "replaceWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", replaceWorkspaceOptions.wId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "replaceWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (replaceWorkspaceOptions.xGithubToken() != null) {
      builder.header("X-Github-token", replaceWorkspaceOptions.xGithubToken());
    }
    final JsonObject contentJson = new JsonObject();
    if (replaceWorkspaceOptions.catalogRef() != null) {
      contentJson.add("catalog_ref", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.catalogRef()));
    }
    if (replaceWorkspaceOptions.description() != null) {
      contentJson.addProperty("description", replaceWorkspaceOptions.description());
    }
    if (replaceWorkspaceOptions.dependencies() != null) {
      contentJson.add("dependencies", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.dependencies()));
    }
    if (replaceWorkspaceOptions.name() != null) {
      contentJson.addProperty("name", replaceWorkspaceOptions.name());
    }
    if (replaceWorkspaceOptions.sharedData() != null) {
      contentJson.add("shared_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.sharedData()));
    }
    if (replaceWorkspaceOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.tags()));
    }
    if (replaceWorkspaceOptions.templateData() != null) {
      contentJson.add("template_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.templateData()));
    }
    if (replaceWorkspaceOptions.templateRepo() != null) {
      contentJson.add("template_repo", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.templateRepo()));
    }
    if (replaceWorkspaceOptions.type() != null) {
      contentJson.add("type", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.type()));
    }
    if (replaceWorkspaceOptions.workspaceStatus() != null) {
      contentJson.add("workspace_status", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.workspaceStatus()));
    }
    if (replaceWorkspaceOptions.workspaceStatusMsg() != null) {
      contentJson.add("workspace_status_msg", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceOptions.workspaceStatusMsg()));
    }
    if (replaceWorkspaceOptions.agentId() != null) {
      contentJson.addProperty("agent_id", replaceWorkspaceOptions.agentId());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a workspace.
   *
   * Deletes a workspace from IBM Cloud Schematics. Deleting a workspace does not automatically remove the IBM Cloud
   * resources that the workspace manages. To remove all resources that are associated with the workspace, use the
   * `DELETE /v1/workspaces/{id}?destroy_resources=true` API.
   *
   *  **Note**: If you delete a workspace without deleting the resources,
   *  you must manage your resources with the resource dashboard or CLI afterwards.
   *  You cannot use IBM Cloud Schematics anymore to manage your resources.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param deleteWorkspaceOptions the {@link DeleteWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link String}
   */
  public ServiceCall<String> deleteWorkspace(DeleteWorkspaceOptions deleteWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteWorkspaceOptions,
      "deleteWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", deleteWorkspaceOptions.wId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", deleteWorkspaceOptions.refreshToken());
    if (deleteWorkspaceOptions.destroyResources() != null) {
      builder.query("destroy_resources", String.valueOf(deleteWorkspaceOptions.destroyResources()));
    }
    ResponseConverter<String> responseConverter = ResponseConverterUtils.getString();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update workspace metadata.
   *
   * Use this API to update the following workspace metadata:
   *
   *  * Workspace name (`name`) - **Note**: Updating the workspace name does not update the ID of the workspace.
   *  * Workspace description (`description`)
   *  * Tags (`tags[]`)
   *  * Resource group (`resource_group`)
   *  * Workspace status (`workspace_status.frozen`)
   *
   *
   *  **Tip**: If you want to update information about the Terraform template
   *  or IBM Cloud catalog software template that your workspace points to,
   *  use the `PUT /v1/workspaces/{id}` API. To update workspace variables,
   *  use the `PUT /v1/workspaces/{id}/template_data/{template_id}/values` API.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param updateWorkspaceOptions the {@link UpdateWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceResponse}
   */
  public ServiceCall<WorkspaceResponse> updateWorkspace(UpdateWorkspaceOptions updateWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateWorkspaceOptions,
      "updateWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", updateWorkspaceOptions.wId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "updateWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateWorkspaceOptions.catalogRef() != null) {
      contentJson.add("catalog_ref", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.catalogRef()));
    }
    if (updateWorkspaceOptions.description() != null) {
      contentJson.addProperty("description", updateWorkspaceOptions.description());
    }
    if (updateWorkspaceOptions.dependencies() != null) {
      contentJson.add("dependencies", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.dependencies()));
    }
    if (updateWorkspaceOptions.name() != null) {
      contentJson.addProperty("name", updateWorkspaceOptions.name());
    }
    if (updateWorkspaceOptions.sharedData() != null) {
      contentJson.add("shared_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.sharedData()));
    }
    if (updateWorkspaceOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.tags()));
    }
    if (updateWorkspaceOptions.templateData() != null) {
      contentJson.add("template_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.templateData()));
    }
    if (updateWorkspaceOptions.templateRepo() != null) {
      contentJson.add("template_repo", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.templateRepo()));
    }
    if (updateWorkspaceOptions.type() != null) {
      contentJson.add("type", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.type()));
    }
    if (updateWorkspaceOptions.workspaceStatus() != null) {
      contentJson.add("workspace_status", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.workspaceStatus()));
    }
    if (updateWorkspaceOptions.workspaceStatusMsg() != null) {
      contentJson.add("workspace_status_msg", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateWorkspaceOptions.workspaceStatusMsg()));
    }
    if (updateWorkspaceOptions.agentId() != null) {
      contentJson.addProperty("agent_id", updateWorkspaceOptions.agentId());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Show workspace template readme.
   *
   * Retrieve the `README.md` file of the Terraform of IBM Cloud catalog template that your workspace points to.
   *
   * @param getWorkspaceReadmeOptions the {@link GetWorkspaceReadmeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateReadme}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<TemplateReadme> getWorkspaceReadme(GetWorkspaceReadmeOptions getWorkspaceReadmeOptions) {
    LOGGER.warning("A deprecated operation has been invoked: getWorkspaceReadme");
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceReadmeOptions,
      "getWorkspaceReadmeOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceReadmeOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/templates/readme", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceReadme");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getWorkspaceReadmeOptions.ref() != null) {
      builder.query("ref", String.valueOf(getWorkspaceReadmeOptions.ref()));
    }
    if (getWorkspaceReadmeOptions.formatted() != null) {
      builder.query("formatted", String.valueOf(getWorkspaceReadmeOptions.formatted()));
    }
    ResponseConverter<TemplateReadme> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateReadme>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Upload a TAR file to your workspace.
   *
   * Provide your Terraform template by uploading a TAR file from your local machine. Before you use this API, you must
   * create a workspace without a link to a GitHub or GitLab repository with the `POST /v1/workspaces` API.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param templateRepoUploadOptions the {@link TemplateRepoUploadOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateRepoTarUploadResponse}
   */
  public ServiceCall<TemplateRepoTarUploadResponse> templateRepoUpload(TemplateRepoUploadOptions templateRepoUploadOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(templateRepoUploadOptions,
      "templateRepoUploadOptions cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.isTrue((templateRepoUploadOptions.file() != null),
      "At least one of  or file must be supplied.");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", templateRepoUploadOptions.wId());
    pathParamsMap.put("t_id", templateRepoUploadOptions.tId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/template_data/{t_id}/template_repo_upload", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "templateRepoUpload");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    if (templateRepoUploadOptions.file() != null) {
      okhttp3.RequestBody fileBody = RequestUtils.inputStreamBody(templateRepoUploadOptions.file(), templateRepoUploadOptions.fileContentType());
      multipartBuilder.addFormDataPart("file", "filename", fileBody);
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<TemplateRepoTarUploadResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateRepoTarUploadResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List workspace input variables.
   *
   * Retrieve a list of input variables that are declared in your Terraform or IBM Cloud catalog template.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getWorkspaceInputsOptions the {@link GetWorkspaceInputsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateValues}
   */
  public ServiceCall<TemplateValues> getWorkspaceInputs(GetWorkspaceInputsOptions getWorkspaceInputsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceInputsOptions,
      "getWorkspaceInputsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceInputsOptions.wId());
    pathParamsMap.put("t_id", getWorkspaceInputsOptions.tId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/template_data/{t_id}/values", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceInputs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<TemplateValues> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateValues>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace workspace input variables.
   *
   * Replace or Update the input variables for the template that your workspace points to.
   *
   * @param replaceWorkspaceInputsOptions the {@link ReplaceWorkspaceInputsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link UserValues}
   */
  public ServiceCall<UserValues> replaceWorkspaceInputs(ReplaceWorkspaceInputsOptions replaceWorkspaceInputsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceWorkspaceInputsOptions,
      "replaceWorkspaceInputsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", replaceWorkspaceInputsOptions.wId());
    pathParamsMap.put("t_id", replaceWorkspaceInputsOptions.tId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/template_data/{t_id}/values", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "replaceWorkspaceInputs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (replaceWorkspaceInputsOptions.envValues() != null) {
      contentJson.add("env_values", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceInputsOptions.envValues()));
    }
    if (replaceWorkspaceInputsOptions.values() != null) {
      contentJson.addProperty("values", replaceWorkspaceInputsOptions.values());
    }
    if (replaceWorkspaceInputsOptions.variablestore() != null) {
      contentJson.add("variablestore", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceWorkspaceInputsOptions.variablestore()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<UserValues> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<UserValues>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get workspace template details.
   *
   * Retrieve detailed information about the Terraform template that your workspace points to.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getAllWorkspaceInputsOptions the {@link GetAllWorkspaceInputsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceTemplateValuesResponse}
   */
  public ServiceCall<WorkspaceTemplateValuesResponse> getAllWorkspaceInputs(GetAllWorkspaceInputsOptions getAllWorkspaceInputsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAllWorkspaceInputsOptions,
      "getAllWorkspaceInputsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getAllWorkspaceInputsOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/templates/values", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getAllWorkspaceInputs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WorkspaceTemplateValuesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceTemplateValuesResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List workspace variable metadata.
   *
   * Retrieve the metadata for all the workspace input variables that are declared in the template that your workspace
   * points to.
   *
   * @param getWorkspaceInputMetadataOptions the {@link GetWorkspaceInputMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<Map<String, Object>>> getWorkspaceInputMetadata(GetWorkspaceInputMetadataOptions getWorkspaceInputMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceInputMetadataOptions,
      "getWorkspaceInputMetadataOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceInputMetadataOptions.wId());
    pathParamsMap.put("t_id", getWorkspaceInputMetadataOptions.tId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/template_data/{t_id}/values_metadata", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceInputMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<List<Map<String, Object>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<Map<String, Object>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List workspace output values.
   *
   * Retrieve a list of Terraform output variables. You define output values in your Terraform template to include
   * information that you want to make accessible for other Terraform templates.
   *
   * @param getWorkspaceOutputsOptions the {@link GetWorkspaceOutputsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<OutputValuesInner>> getWorkspaceOutputs(GetWorkspaceOutputsOptions getWorkspaceOutputsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceOutputsOptions,
      "getWorkspaceOutputsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceOutputsOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/output_values", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceOutputs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<List<OutputValuesInner>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<OutputValuesInner>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List workspace resources.
   *
   * Retrieve a list of IBM Cloud resources that you created with your workspace.
   *
   * @param getWorkspaceResourcesOptions the {@link GetWorkspaceResourcesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<TemplateResources>> getWorkspaceResources(GetWorkspaceResourcesOptions getWorkspaceResourcesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceResourcesOptions,
      "getWorkspaceResourcesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceResourcesOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/resources", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceResources");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<List<TemplateResources>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<TemplateResources>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Terraform statefile URL.
   *
   * This API is deprecated, and is replaced by the `GET /v2/jobs/{job_id}/files`, with `file_type` equal `state_file`.
   * Retrieve the URL to the Terraform statefile (`terraform.tfstate`). You use the URL to access the Terraform
   * statefile. The Terraform statefile includes detailed information about the IBM Cloud resources that you provisioned
   * with IBM Cloud Schematics and Schematics uses the file to determine future create, modify, or delete actions for
   * your resources. To show the content of the Terraform statefile, use the `GET
   * /v1/workspaces/{id}/runtime_data/{template_id}/state_store` API.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getWorkspaceStateOptions the {@link GetWorkspaceStateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link StateStoreResponseList}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<StateStoreResponseList> getWorkspaceState(GetWorkspaceStateOptions getWorkspaceStateOptions) {
    LOGGER.warning("A deprecated operation has been invoked: getWorkspaceState");
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceStateOptions,
      "getWorkspaceStateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceStateOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/state_stores", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceState");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<StateStoreResponseList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<StateStoreResponseList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Show Terraform statefile content.
   *
   * This API is deprecated, and is replaced by the `GET /v2/jobs/{job_id}/files`, with `file_type` equal `state_file`.
   * Show the content of the Terraform statefile (`terraform.tfstate`) that was created when your Terraform template was
   * applied in IBM Cloud. The statefile holds detailed information about the IBM Cloud resources that were created by
   * IBM Cloud Schematics and Schematics uses the file to determine future create, modify, or delete actions for your
   * resources.
   *
   * @param getWorkspaceTemplateStateOptions the {@link GetWorkspaceTemplateStateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateStateStore}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<TemplateStateStore> getWorkspaceTemplateState(GetWorkspaceTemplateStateOptions getWorkspaceTemplateStateOptions) {
    LOGGER.warning("A deprecated operation has been invoked: getWorkspaceTemplateState");
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceTemplateStateOptions,
      "getWorkspaceTemplateStateOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceTemplateStateOptions.wId());
    pathParamsMap.put("t_id", getWorkspaceTemplateStateOptions.tId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/runtime_data/{t_id}/state_store", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceTemplateState");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<TemplateStateStore> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateStateStore>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get workspace job log URL.
   *
   * Get the Terraform log file URL for a workspace job. You can retrieve the log URL for jobs that were created with
   * the `PUT /v1/workspaces/{id}/apply`, `POST /v1/workspaces/{id}/plan`, or `DELETE /v1/workspaces/{id}/destroy` API.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getWorkspaceActivityLogsOptions the {@link GetWorkspaceActivityLogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivityLogs}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<WorkspaceActivityLogs> getWorkspaceActivityLogs(GetWorkspaceActivityLogsOptions getWorkspaceActivityLogsOptions) {
    LOGGER.warning("A deprecated operation has been invoked: getWorkspaceActivityLogs");
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceActivityLogsOptions,
      "getWorkspaceActivityLogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceActivityLogsOptions.wId());
    pathParamsMap.put("activity_id", getWorkspaceActivityLogsOptions.activityId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/actions/{activity_id}/logs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceActivityLogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WorkspaceActivityLogs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivityLogs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get latest workspace job log URL for all workspace templates.
   *
   * Retrieve the log file URL for the latest job of a template that ran against your workspace. You use this URL to
   * retrieve detailed logs for the latest job.
   *
   * @param getWorkspaceLogUrlsOptions the {@link GetWorkspaceLogUrlsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link LogStoreResponseList}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<LogStoreResponseList> getWorkspaceLogUrls(GetWorkspaceLogUrlsOptions getWorkspaceLogUrlsOptions) {
    LOGGER.warning("A deprecated operation has been invoked: getWorkspaceLogUrls");
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceLogUrlsOptions,
      "getWorkspaceLogUrlsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceLogUrlsOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/log_stores", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceLogUrls");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<LogStoreResponseList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<LogStoreResponseList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Show latest logs for a workspace template.
   *
   * Show the Terraform logs for the most recent job of a template that ran against your workspace.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getTemplateLogsOptions the {@link GetTemplateLogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link String}
   */
  public ServiceCall<String> getTemplateLogs(GetTemplateLogsOptions getTemplateLogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTemplateLogsOptions,
      "getTemplateLogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getTemplateLogsOptions.wId());
    pathParamsMap.put("t_id", getTemplateLogsOptions.tId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/runtime_data/{t_id}/log_store", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getTemplateLogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTemplateLogsOptions.logTfCmd() != null) {
      builder.query("log_tf_cmd", String.valueOf(getTemplateLogsOptions.logTfCmd()));
    }
    if (getTemplateLogsOptions.logTfPrefix() != null) {
      builder.query("log_tf_prefix", String.valueOf(getTemplateLogsOptions.logTfPrefix()));
    }
    if (getTemplateLogsOptions.logTfNullResource() != null) {
      builder.query("log_tf_null_resource", String.valueOf(getTemplateLogsOptions.logTfNullResource()));
    }
    if (getTemplateLogsOptions.logTfAnsible() != null) {
      builder.query("log_tf_ansible", String.valueOf(getTemplateLogsOptions.logTfAnsible()));
    }
    ResponseConverter<String> responseConverter = ResponseConverterUtils.getString();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Show logs for a workspace job.
   *
   * Show the Terraform logs for an job that ran against your workspace.
   *
   * @param getTemplateActivityLogOptions the {@link GetTemplateActivityLogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link String}
   */
  public ServiceCall<String> getTemplateActivityLog(GetTemplateActivityLogOptions getTemplateActivityLogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTemplateActivityLogOptions,
      "getTemplateActivityLogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getTemplateActivityLogOptions.wId());
    pathParamsMap.put("t_id", getTemplateActivityLogOptions.tId());
    pathParamsMap.put("activity_id", getTemplateActivityLogOptions.activityId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/runtime_data/{t_id}/log_store/actions/{activity_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getTemplateActivityLog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTemplateActivityLogOptions.logTfCmd() != null) {
      builder.query("log_tf_cmd", String.valueOf(getTemplateActivityLogOptions.logTfCmd()));
    }
    if (getTemplateActivityLogOptions.logTfPrefix() != null) {
      builder.query("log_tf_prefix", String.valueOf(getTemplateActivityLogOptions.logTfPrefix()));
    }
    if (getTemplateActivityLogOptions.logTfNullResource() != null) {
      builder.query("log_tf_null_resource", String.valueOf(getTemplateActivityLogOptions.logTfNullResource()));
    }
    if (getTemplateActivityLogOptions.logTfAnsible() != null) {
      builder.query("log_tf_ansible", String.valueOf(getTemplateActivityLogOptions.logTfAnsible()));
    }
    ResponseConverter<String> responseConverter = ResponseConverterUtils.getString();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List actions.
   *
   * Retrieve a list of all Schematics actions that depends on the API endpoint that you have access. For example, if
   * you use an API endpoint for a geography, such as North America, only actions that are created in `us-south` or
   * `us-east` are retrieved.
   *
   *  For more information, about supported API endpoints, see
   * [API endpoints](/apidocs/schematics#api-endpoints).
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listActionsOptions the {@link ListActionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionList}
   */
  public ServiceCall<ActionList> listActions(ListActionsOptions listActionsOptions) {
    if (listActionsOptions == null) {
      listActionsOptions = new ListActionsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listActions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listActionsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listActionsOptions.offset()));
    }
    if (listActionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listActionsOptions.limit()));
    }
    if (listActionsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listActionsOptions.sort()));
    }
    if (listActionsOptions.profile() != null) {
      builder.query("profile", String.valueOf(listActionsOptions.profile()));
    }
    ResponseConverter<ActionList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List actions.
   *
   * Retrieve a list of all Schematics actions that depends on the API endpoint that you have access. For example, if
   * you use an API endpoint for a geography, such as North America, only actions that are created in `us-south` or
   * `us-east` are retrieved.
   *
   *  For more information, about supported API endpoints, see
   * [API endpoints](/apidocs/schematics#api-endpoints).
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link ActionList}
   */
  public ServiceCall<ActionList> listActions() {
    return listActions(null);
  }

  /**
   * Create an action.
   *
   * Create an IBM Cloud Schematics action to run on a single target or groups of target hosts, roles, policies, or
   * steps to deploy your resources in the target hosts. You can run the IBM Cloud resources the order in which you want
   * to execute them. **Note** If your Git repository already contains a host file. Schematics does not overwrite the
   * host file already present in your Git repository. For sample templates, see IBM Cloud Automation
   * [templates](https://github.com/Cloud-Schematics).
   *
   *  The Schematics action API now supports bastion host connection with `non-root` user, and bastion connection type
   * is marked as optional, when inventory connection type is set as [Windows Remote
   * Management](https://www.ibm.com/docs/en/license-metric-tool?topic=v-configuring-winrm-hyper-hosts)(`winrm`).
   *
   *  For more information, about the Schematics create action,
   *  see [ibmcloud schematics action
   * create](https://cloud.ibm.com/docs/schematics?topic=schematics-schematics-cli-reference#schematics-create-action).
   *  **Note** you cannot update the location and region once an action is created.
   *  Also, make sure your IP addresses are in the
   * [allowlist](https://cloud.ibm.com/docs/schematics?topic=schematics-allowed-ipaddresses).
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param createActionOptions the {@link CreateActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Action}
   */
  public ServiceCall<Action> createAction(CreateActionOptions createActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createActionOptions,
      "createActionOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createActionOptions.xGithubToken() != null) {
      builder.header("X-Github-token", createActionOptions.xGithubToken());
    }
    final JsonObject contentJson = new JsonObject();
    if (createActionOptions.name() != null) {
      contentJson.addProperty("name", createActionOptions.name());
    }
    if (createActionOptions.description() != null) {
      contentJson.addProperty("description", createActionOptions.description());
    }
    if (createActionOptions.location() != null) {
      contentJson.addProperty("location", createActionOptions.location());
    }
    if (createActionOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", createActionOptions.resourceGroup());
    }
    if (createActionOptions.bastionConnectionType() != null) {
      contentJson.addProperty("bastion_connection_type", createActionOptions.bastionConnectionType());
    }
    if (createActionOptions.inventoryConnectionType() != null) {
      contentJson.addProperty("inventory_connection_type", createActionOptions.inventoryConnectionType());
    }
    if (createActionOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.tags()));
    }
    if (createActionOptions.userState() != null) {
      contentJson.add("user_state", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.userState()));
    }
    if (createActionOptions.sourceReadmeUrl() != null) {
      contentJson.addProperty("source_readme_url", createActionOptions.sourceReadmeUrl());
    }
    if (createActionOptions.source() != null) {
      contentJson.add("source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.source()));
    }
    if (createActionOptions.sourceType() != null) {
      contentJson.addProperty("source_type", createActionOptions.sourceType());
    }
    if (createActionOptions.commandParameter() != null) {
      contentJson.addProperty("command_parameter", createActionOptions.commandParameter());
    }
    if (createActionOptions.inventory() != null) {
      contentJson.addProperty("inventory", createActionOptions.inventory());
    }
    if (createActionOptions.credentials() != null) {
      contentJson.add("credentials", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.credentials()));
    }
    if (createActionOptions.bastion() != null) {
      contentJson.add("bastion", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.bastion()));
    }
    if (createActionOptions.bastionCredential() != null) {
      contentJson.add("bastion_credential", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.bastionCredential()));
    }
    if (createActionOptions.targetsIni() != null) {
      contentJson.addProperty("targets_ini", createActionOptions.targetsIni());
    }
    if (createActionOptions.inputs() != null) {
      contentJson.add("inputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.inputs()));
    }
    if (createActionOptions.outputs() != null) {
      contentJson.add("outputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.outputs()));
    }
    if (createActionOptions.settings() != null) {
      contentJson.add("settings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createActionOptions.settings()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Action> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Action>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an action.
   *
   * Create an IBM Cloud Schematics action to run on a single target or groups of target hosts, roles, policies, or
   * steps to deploy your resources in the target hosts. You can run the IBM Cloud resources the order in which you want
   * to execute them. **Note** If your Git repository already contains a host file. Schematics does not overwrite the
   * host file already present in your Git repository. For sample templates, see IBM Cloud Automation
   * [templates](https://github.com/Cloud-Schematics).
   *
   *  The Schematics action API now supports bastion host connection with `non-root` user, and bastion connection type
   * is marked as optional, when inventory connection type is set as [Windows Remote
   * Management](https://www.ibm.com/docs/en/license-metric-tool?topic=v-configuring-winrm-hyper-hosts)(`winrm`).
   *
   *  For more information, about the Schematics create action,
   *  see [ibmcloud schematics action
   * create](https://cloud.ibm.com/docs/schematics?topic=schematics-schematics-cli-reference#schematics-create-action).
   *  **Note** you cannot update the location and region once an action is created.
   *  Also, make sure your IP addresses are in the
   * [allowlist](https://cloud.ibm.com/docs/schematics?topic=schematics-allowed-ipaddresses).
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @return a {@link ServiceCall} with a result of type {@link Action}
   */
  public ServiceCall<Action> createAction() {
    return createAction(null);
  }

  /**
   * Get action details.
   *
   * Retrieve the detailed information of an actions from your IBM Cloud account.  This API returns a URL to the log
   * file that you can retrieve by using  the `GET /v2/actions/{action_id}/logs` API.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param getActionOptions the {@link GetActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Action}
   */
  public ServiceCall<Action> getAction(GetActionOptions getActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getActionOptions,
      "getActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_id", getActionOptions.actionId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions/{action_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getActionOptions.profile() != null) {
      builder.query("profile", String.valueOf(getActionOptions.profile()));
    }
    ResponseConverter<Action> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Action>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an action.
   *
   * Delete a Schematics action and specify the Ansible playbook that you want to run against your IBM Cloud resources.
   * **Note** you cannot delete or stop the job activity from an ongoing execution of an action defined in the playbook.
   * You can repeat the execution of same job, whenever you patch the actions. For more information, about the
   * Schematics action state, see  [Schematics action state
   * diagram](https://cloud.ibm.com/docs/schematics?topic=schematics-action-setup#action-state-diagram).
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param deleteActionOptions the {@link DeleteActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteAction(DeleteActionOptions deleteActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteActionOptions,
      "deleteActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_id", deleteActionOptions.actionId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions/{action_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteActionOptions.force() != null) {
      builder.header("force", deleteActionOptions.force());
    }
    if (deleteActionOptions.propagate() != null) {
      builder.header("propagate", deleteActionOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an action.
   *
   * Update or replace an action to change the action state from the critical state to normal state, or pending state to
   * the normal state for a successful execution.  For more information, about the Schematics action state, see
   * [Schematics action state
   * diagram](https://cloud.ibm.com/docs/schematics?topic=schematics-action-setup#action-state-diagram).
   *
   *  The Schematics action API now supports bastion host connection with `non-root` user, and bastion connection type
   * is marked as optional, when inventory connection type is set as [Windows Remote
   * Management](https://www.ibm.com/docs/en/license-metric-tool?topic=v-configuring-winrm-hyper-hosts)(`winrm`).
   *
   *  **Note** you cannot update the location and region once an action is created. Also, make sure your IP addresses
   * are in the [allowlist](https://cloud.ibm.com/docs/schematics?topic=schematics-allowed-ipaddresses].
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param updateActionOptions the {@link UpdateActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Action}
   */
  public ServiceCall<Action> updateAction(UpdateActionOptions updateActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateActionOptions,
      "updateActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_id", updateActionOptions.actionId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions/{action_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "updateAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateActionOptions.xGithubToken() != null) {
      builder.header("X-Github-token", updateActionOptions.xGithubToken());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateActionOptions.name() != null) {
      contentJson.addProperty("name", updateActionOptions.name());
    }
    if (updateActionOptions.description() != null) {
      contentJson.addProperty("description", updateActionOptions.description());
    }
    if (updateActionOptions.location() != null) {
      contentJson.addProperty("location", updateActionOptions.location());
    }
    if (updateActionOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", updateActionOptions.resourceGroup());
    }
    if (updateActionOptions.bastionConnectionType() != null) {
      contentJson.addProperty("bastion_connection_type", updateActionOptions.bastionConnectionType());
    }
    if (updateActionOptions.inventoryConnectionType() != null) {
      contentJson.addProperty("inventory_connection_type", updateActionOptions.inventoryConnectionType());
    }
    if (updateActionOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.tags()));
    }
    if (updateActionOptions.userState() != null) {
      contentJson.add("user_state", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.userState()));
    }
    if (updateActionOptions.sourceReadmeUrl() != null) {
      contentJson.addProperty("source_readme_url", updateActionOptions.sourceReadmeUrl());
    }
    if (updateActionOptions.source() != null) {
      contentJson.add("source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.source()));
    }
    if (updateActionOptions.sourceType() != null) {
      contentJson.addProperty("source_type", updateActionOptions.sourceType());
    }
    if (updateActionOptions.commandParameter() != null) {
      contentJson.addProperty("command_parameter", updateActionOptions.commandParameter());
    }
    if (updateActionOptions.inventory() != null) {
      contentJson.addProperty("inventory", updateActionOptions.inventory());
    }
    if (updateActionOptions.credentials() != null) {
      contentJson.add("credentials", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.credentials()));
    }
    if (updateActionOptions.bastion() != null) {
      contentJson.add("bastion", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.bastion()));
    }
    if (updateActionOptions.bastionCredential() != null) {
      contentJson.add("bastion_credential", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.bastionCredential()));
    }
    if (updateActionOptions.targetsIni() != null) {
      contentJson.addProperty("targets_ini", updateActionOptions.targetsIni());
    }
    if (updateActionOptions.inputs() != null) {
      contentJson.add("inputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.inputs()));
    }
    if (updateActionOptions.outputs() != null) {
      contentJson.add("outputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.outputs()));
    }
    if (updateActionOptions.settings() != null) {
      contentJson.add("settings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateActionOptions.settings()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Action> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Action>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Upload a TAR file to an action.
   *
   * Update your template by uploading tape archive file (.tar) file from  your local machine. Before you use this API,
   * you must create an action  without a link to a GitHub or GitLab repository with the `POST /v2/actions` API.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param uploadTemplateTarActionOptions the {@link UploadTemplateTarActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateRepoTarUploadResponse}
   */
  public ServiceCall<TemplateRepoTarUploadResponse> uploadTemplateTarAction(UploadTemplateTarActionOptions uploadTemplateTarActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(uploadTemplateTarActionOptions,
      "uploadTemplateTarActionOptions cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.isTrue((uploadTemplateTarActionOptions.file() != null),
      "At least one of  or file must be supplied.");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_id", uploadTemplateTarActionOptions.actionId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions/{action_id}/template_repo_upload", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "uploadTemplateTarAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    if (uploadTemplateTarActionOptions.file() != null) {
      okhttp3.RequestBody fileBody = RequestUtils.inputStreamBody(uploadTemplateTarActionOptions.file(), uploadTemplateTarActionOptions.fileContentType());
      multipartBuilder.addFormDataPart("file", "filename", fileBody);
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<TemplateRepoTarUploadResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateRepoTarUploadResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List workspace jobs.
   *
   * Retrieve a list of all jobs that ran against a workspace. Jobs are generated when you use the `apply`, `plan`,
   * `destroy`, and `refresh`,   command API.
   *
   * @param listWorkspaceActivitiesOptions the {@link ListWorkspaceActivitiesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivities}
   */
  public ServiceCall<WorkspaceActivities> listWorkspaceActivities(ListWorkspaceActivitiesOptions listWorkspaceActivitiesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listWorkspaceActivitiesOptions,
      "listWorkspaceActivitiesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", listWorkspaceActivitiesOptions.wId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/actions", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listWorkspaceActivities");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listWorkspaceActivitiesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listWorkspaceActivitiesOptions.offset()));
    }
    if (listWorkspaceActivitiesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listWorkspaceActivitiesOptions.limit()));
    }
    ResponseConverter<WorkspaceActivities> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivities>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get workspace job details.
   *
   * Get the details for a workspace job that ran against the workspace. This API returns the job status and a URL to
   * the log file that you can  retrieve by using the `GET /v1/workspaces/{id}/actions/{action_id}/logs` API.
   *
   * @param getWorkspaceActivityOptions the {@link GetWorkspaceActivityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivity}
   */
  public ServiceCall<WorkspaceActivity> getWorkspaceActivity(GetWorkspaceActivityOptions getWorkspaceActivityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceActivityOptions,
      "getWorkspaceActivityOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", getWorkspaceActivityOptions.wId());
    pathParamsMap.put("activity_id", getWorkspaceActivityOptions.activityId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/actions/{activity_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceActivity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WorkspaceActivity> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivity>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Stop the workspace job.
   *
   * Stop an ongoing schematics job that runs against your workspace.
   * **Note**: If you remove the Schematics apply job that runs against your workspace,  any changes to your IBM Cloud
   * resources that are already applied are not reverted.  If a creation, update, or deletion is currently in progress,
   * Schematics waits for  the job to be completed first. Then, any other resource creations, updates, or  deletions
   * that are included in your Terraform template file are ignored.
   * &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param deleteWorkspaceActivityOptions the {@link DeleteWorkspaceActivityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivityApplyResult}
   */
  public ServiceCall<WorkspaceActivityApplyResult> deleteWorkspaceActivity(DeleteWorkspaceActivityOptions deleteWorkspaceActivityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteWorkspaceActivityOptions,
      "deleteWorkspaceActivityOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", deleteWorkspaceActivityOptions.wId());
    pathParamsMap.put("activity_id", deleteWorkspaceActivityOptions.activityId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/actions/{activity_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteWorkspaceActivity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WorkspaceActivityApplyResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivityApplyResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Run Terraform Commands.
   *
   * Run Terraform state commands to modify the workspace state file, by using the IBM Cloud Schematics API.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param runWorkspaceCommandsOptions the {@link RunWorkspaceCommandsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivityCommandResult}
   */
  public ServiceCall<WorkspaceActivityCommandResult> runWorkspaceCommands(RunWorkspaceCommandsOptions runWorkspaceCommandsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(runWorkspaceCommandsOptions,
      "runWorkspaceCommandsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", runWorkspaceCommandsOptions.wId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/commands", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "runWorkspaceCommands");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", runWorkspaceCommandsOptions.refreshToken());
    final JsonObject contentJson = new JsonObject();
    if (runWorkspaceCommandsOptions.commands() != null) {
      contentJson.add("commands", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(runWorkspaceCommandsOptions.commands()));
    }
    if (runWorkspaceCommandsOptions.operationName() != null) {
      contentJson.addProperty("operation_name", runWorkspaceCommandsOptions.operationName());
    }
    if (runWorkspaceCommandsOptions.description() != null) {
      contentJson.addProperty("description", runWorkspaceCommandsOptions.description());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceActivityCommandResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivityCommandResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Perform a Schematics `apply` job.
   *
   * Run a Schematics `apply` job against your workspace. An `apply` job provisions, modifies, or removes the IBM Cloud
   * resources that you described in the Terraform template that your workspace points to. Depending on the type and
   * number of resources that you want to provision or modify, this process might take a few minutes, or even up to
   * hours to complete. During this time, you cannot make changes to your workspace. After all updates are applied, the
   * state of the files is [persisted](https://cloud.ibm.com/docs/schematics?topic=schematics-persist-files) to
   * determine what resources exist in your IBM Cloud account.
   *
   *
   *  **Important**: Your workspace must be in an `Inactive`, `Active`, `Failed`, or
   *  `Stopped` state to perform a Schematics `apply` job. After all updates are applied,
   *  the state of the files is [persisted](https://cloud.ibm.com/docs/schematics?topic=schematics-persist-files)
   *  to determine what resources exist in your IBM Cloud account.
   *
   *
   *  **Note**: This API returns an activity or job ID that you use to retrieve the
   *  log URL with the `GET /v1/workspaces/{id}/actions/{action_id}/logs` API.
   *
   *
   *  **Important:** Applying a template might incur costs. Make sure to review
   *  the pricing information for the resources that you specified in your
   *  templates before you apply the template in IBM Cloud.
   *  To find a summary of job that Schematics is about to perform,
   *  create a Terraform execution plan with the `POST /v1/workspaces/{id}/plan` API.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param applyWorkspaceCommandOptions the {@link ApplyWorkspaceCommandOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivityApplyResult}
   */
  public ServiceCall<WorkspaceActivityApplyResult> applyWorkspaceCommand(ApplyWorkspaceCommandOptions applyWorkspaceCommandOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(applyWorkspaceCommandOptions,
      "applyWorkspaceCommandOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", applyWorkspaceCommandOptions.wId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/apply", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "applyWorkspaceCommand");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", applyWorkspaceCommandOptions.refreshToken());
    if (applyWorkspaceCommandOptions.delegatedToken() != null) {
      builder.header("delegated_token", applyWorkspaceCommandOptions.delegatedToken());
    }
    final JsonObject contentJson = new JsonObject();
    if (applyWorkspaceCommandOptions.actionOptions() != null) {
      contentJson.add("action_options", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(applyWorkspaceCommandOptions.actionOptions()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceActivityApplyResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivityApplyResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Perform a Schematics `destroy` job.
   *
   * Run a Schematics `destroy` job against your workspace. A `destroy` job removes all IBM Cloud resources that are
   * associated with your workspace. Removing your resources does not delete the Schematics workspace. To delete the
   * workspace, use the `DELETE /v1/workspaces/{id}` API. This API returns an activity or job ID that you use to
   * retrieve the URL to the log file with the `GET /v1/workspaces/{id}/actions/{action_id}/logs` API.
   *
   *
   *  **Important**: Your workspace must be in an `Active`, `Failed`, or `Stopped` state to perform a Schematics
   * `destroy` job.
   *
   *
   *  **Note**: Deleting IBM Cloud resources cannot be undone. Make sure that you back up any required data before you
   * remove your resources.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param destroyWorkspaceCommandOptions the {@link DestroyWorkspaceCommandOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivityDestroyResult}
   */
  public ServiceCall<WorkspaceActivityDestroyResult> destroyWorkspaceCommand(DestroyWorkspaceCommandOptions destroyWorkspaceCommandOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(destroyWorkspaceCommandOptions,
      "destroyWorkspaceCommandOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", destroyWorkspaceCommandOptions.wId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/destroy", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "destroyWorkspaceCommand");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", destroyWorkspaceCommandOptions.refreshToken());
    if (destroyWorkspaceCommandOptions.delegatedToken() != null) {
      builder.header("delegated_token", destroyWorkspaceCommandOptions.delegatedToken());
    }
    final JsonObject contentJson = new JsonObject();
    if (destroyWorkspaceCommandOptions.actionOptions() != null) {
      contentJson.add("action_options", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(destroyWorkspaceCommandOptions.actionOptions()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceActivityDestroyResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivityDestroyResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Perform a Schematics `plan` job.
   *
   * Run a Schematics `plan` job against your workspace. The `plan` job creates a summary of IBM Cloud resources that
   * must be created, modified, or deleted to achieve the state that is described in the Terraform or IBM Cloud catalog
   * template that your workspace points to. During this time, you cannot make changes to your workspace. You can use
   * the summary to verify your changes before you apply the template in IBM Cloud.
   *
   *
   *  **Important**: Your workspace must be in an `Inactive`, `Active`, `Failed`, or `Stopped` state to perform a
   * Schematics `plan` job.
   *
   *
   *  **Note**: This API returns an activity or job ID that you use to retrieve the URL to the log file with the `GET
   * /v1/workspaces/{id}/actions/{action_id}/logs` API.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param planWorkspaceCommandOptions the {@link PlanWorkspaceCommandOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivityPlanResult}
   */
  public ServiceCall<WorkspaceActivityPlanResult> planWorkspaceCommand(PlanWorkspaceCommandOptions planWorkspaceCommandOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(planWorkspaceCommandOptions,
      "planWorkspaceCommandOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", planWorkspaceCommandOptions.wId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/plan", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "planWorkspaceCommand");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", planWorkspaceCommandOptions.refreshToken());
    if (planWorkspaceCommandOptions.delegatedToken() != null) {
      builder.header("delegated_token", planWorkspaceCommandOptions.delegatedToken());
    }
    final JsonObject contentJson = new JsonObject();
    if (planWorkspaceCommandOptions.actionOptions() != null) {
      contentJson.add("action_options", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(planWorkspaceCommandOptions.actionOptions()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceActivityPlanResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivityPlanResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Perform a Schematics `refresh` job.
   *
   * Run a Schematics `refresh` job against your workspace. A `refresh` job validates the IBM Cloud resources in your
   * account against the state that is stored in the Terraform statefile of your workspace. If differences are found,
   * the Terraform statefile is updated accordingly. This API returns an activity or job ID that you use to retrieve the
   * URL to the log file with the `GET /v1/workspaces/{id}/actions/{action_id}/logs` API.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions,
   *  see [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param refreshWorkspaceCommandOptions the {@link RefreshWorkspaceCommandOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceActivityRefreshResult}
   */
  public ServiceCall<WorkspaceActivityRefreshResult> refreshWorkspaceCommand(RefreshWorkspaceCommandOptions refreshWorkspaceCommandOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(refreshWorkspaceCommandOptions,
      "refreshWorkspaceCommandOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("w_id", refreshWorkspaceCommandOptions.wId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspaces/{w_id}/refresh", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "refreshWorkspaceCommand");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", refreshWorkspaceCommandOptions.refreshToken());
    if (refreshWorkspaceCommandOptions.delegatedToken() != null) {
      builder.header("delegated_token", refreshWorkspaceCommandOptions.delegatedToken());
    }
    ResponseConverter<WorkspaceActivityRefreshResult> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceActivityRefreshResult>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List jobs.
   *
   * Retrieve a list of all Schematics jobs.  The job displays a list of jobs with the status as `pending`,
   * `in_progess`,  `success`, or `failed`. Jobs are generated when you use the  `POST /v2/jobs`, `PUT
   * /v2/jobs/{job_id}`, or `DELETE /v2/jobs/{job_id}`.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listJobsOptions the {@link ListJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobList}
   */
  public ServiceCall<JobList> listJobs(ListJobsOptions listJobsOptions) {
    if (listJobsOptions == null) {
      listJobsOptions = new ListJobsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listJobsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listJobsOptions.offset()));
    }
    if (listJobsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listJobsOptions.limit()));
    }
    if (listJobsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listJobsOptions.sort()));
    }
    if (listJobsOptions.profile() != null) {
      builder.query("profile", String.valueOf(listJobsOptions.profile()));
    }
    if (listJobsOptions.resource() != null) {
      builder.query("resource", String.valueOf(listJobsOptions.resource()));
    }
    if (listJobsOptions.resourceId() != null) {
      builder.query("resource_id", String.valueOf(listJobsOptions.resourceId()));
    }
    if (listJobsOptions.actionId() != null) {
      builder.query("action_id", String.valueOf(listJobsOptions.actionId()));
    }
    if (listJobsOptions.workspaceId() != null) {
      builder.query("workspace_id", String.valueOf(listJobsOptions.workspaceId()));
    }
    if (listJobsOptions.list() != null) {
      builder.query("list", String.valueOf(listJobsOptions.list()));
    }
    ResponseConverter<JobList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List jobs.
   *
   * Retrieve a list of all Schematics jobs.  The job displays a list of jobs with the status as `pending`,
   * `in_progess`,  `success`, or `failed`. Jobs are generated when you use the  `POST /v2/jobs`, `PUT
   * /v2/jobs/{job_id}`, or `DELETE /v2/jobs/{job_id}`.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link JobList}
   */
  public ServiceCall<JobList> listJobs() {
    return listJobs(null);
  }

  /**
   * Create a job.
   *
   * Create &amp; launch the Schematics job. It can be used to launch an Ansible playbook against a target hosts.  The
   * job displays a list of jobs with the status as `pending`, `in_progess`, `success`, or `failed`.
   *
   * @param createJobOptions the {@link CreateJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Job}
   */
  public ServiceCall<Job> createJob(CreateJobOptions createJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createJobOptions,
      "createJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", createJobOptions.refreshToken());
    final JsonObject contentJson = new JsonObject();
    if (createJobOptions.commandObject() != null) {
      contentJson.addProperty("command_object", createJobOptions.commandObject());
    }
    if (createJobOptions.commandObjectId() != null) {
      contentJson.addProperty("command_object_id", createJobOptions.commandObjectId());
    }
    if (createJobOptions.commandName() != null) {
      contentJson.addProperty("command_name", createJobOptions.commandName());
    }
    if (createJobOptions.commandParameter() != null) {
      contentJson.addProperty("command_parameter", createJobOptions.commandParameter());
    }
    if (createJobOptions.commandOptions() != null) {
      contentJson.add("command_options", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.commandOptions()));
    }
    if (createJobOptions.inputs() != null) {
      contentJson.add("inputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.inputs()));
    }
    if (createJobOptions.settings() != null) {
      contentJson.add("settings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.settings()));
    }
    if (createJobOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.tags()));
    }
    if (createJobOptions.location() != null) {
      contentJson.addProperty("location", createJobOptions.location());
    }
    if (createJobOptions.status() != null) {
      contentJson.add("status", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.status()));
    }
    if (createJobOptions.cartOrderData() != null) {
      contentJson.add("cart_order_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.cartOrderData()));
    }
    if (createJobOptions.data() != null) {
      contentJson.add("data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.data()));
    }
    if (createJobOptions.bastion() != null) {
      contentJson.add("bastion", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.bastion()));
    }
    if (createJobOptions.logSummary() != null) {
      contentJson.add("log_summary", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.logSummary()));
    }
    if (createJobOptions.agent() != null) {
      contentJson.add("agent", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createJobOptions.agent()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Job> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Job>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a job.
   *
   * Retrieve the detailed information of Job
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getJobOptions the {@link GetJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Job}
   */
  public ServiceCall<Job> getJob(GetJobOptions getJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getJobOptions,
      "getJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", getJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getJobOptions.profile() != null) {
      builder.query("profile", String.valueOf(getJobOptions.profile()));
    }
    ResponseConverter<Job> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Job>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a job.
   *
   * Creates a copy of the Schematics job and relaunches an existing job  by updating the information of an existing
   * Schematics job.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param updateJobOptions the {@link UpdateJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Job}
   */
  public ServiceCall<Job> updateJob(UpdateJobOptions updateJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateJobOptions,
      "updateJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", updateJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "updateJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", updateJobOptions.refreshToken());
    final JsonObject contentJson = new JsonObject();
    if (updateJobOptions.commandObject() != null) {
      contentJson.addProperty("command_object", updateJobOptions.commandObject());
    }
    if (updateJobOptions.commandObjectId() != null) {
      contentJson.addProperty("command_object_id", updateJobOptions.commandObjectId());
    }
    if (updateJobOptions.commandName() != null) {
      contentJson.addProperty("command_name", updateJobOptions.commandName());
    }
    if (updateJobOptions.commandParameter() != null) {
      contentJson.addProperty("command_parameter", updateJobOptions.commandParameter());
    }
    if (updateJobOptions.commandOptions() != null) {
      contentJson.add("command_options", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateJobOptions.commandOptions()));
    }
    if (updateJobOptions.inputs() != null) {
      contentJson.add("inputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateJobOptions.inputs()));
    }
    if (updateJobOptions.settings() != null) {
      contentJson.add("settings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateJobOptions.settings()));
    }
    if (updateJobOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateJobOptions.tags()));
    }
    if (updateJobOptions.location() != null) {
      contentJson.addProperty("location", updateJobOptions.location());
    }
    if (updateJobOptions.status() != null) {
      contentJson.add("status", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateJobOptions.status()));
    }
    if (updateJobOptions.cartOrderData() != null) {
      contentJson.add("cart_order_data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateJobOptions.cartOrderData()));
    }
    if (updateJobOptions.data() != null) {
      contentJson.add("data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateJobOptions.data()));
    }
    if (updateJobOptions.bastion() != null) {
      contentJson.add("bastion", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateJobOptions.bastion()));
    }
    if (updateJobOptions.logSummary() != null) {
      contentJson.add("log_summary", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateJobOptions.logSummary()));
    }
    if (updateJobOptions.agent() != null) {
      contentJson.add("agent", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateJobOptions.agent()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Job> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Job>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Stop the running Job, and delete the Job.
   *
   * Stop the running Job, and delete the Job.  **Note** You cannot delete or stop the job activity from an ongoing
   * execution of an action defined in the playbook.  You can repeat the execution of same job, whenever you patch or
   * update the action or workspace.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param deleteJobOptions the {@link DeleteJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteJob(DeleteJobOptions deleteJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteJobOptions,
      "deleteJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", deleteJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("refresh_token", deleteJobOptions.refreshToken());
    if (deleteJobOptions.force() != null) {
      builder.header("force", deleteJobOptions.force());
    }
    if (deleteJobOptions.propagate() != null) {
      builder.header("propagate", deleteJobOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get job logs.
   *
   * Retrieve the job logs &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization for its
   * resources. For more information, about Schematics access and permissions, see [Schematics service access roles and
   * required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listJobLogsOptions the {@link ListJobLogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobLog}
   */
  public ServiceCall<JobLog> listJobLogs(ListJobLogsOptions listJobLogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listJobLogsOptions,
      "listJobLogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", listJobLogsOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}/logs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listJobLogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<JobLog> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobLog>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get output files from the Job record.
   *
   * Get output files from the Job record. For more information, about the Schematics job status, download job logs, and
   * download the output files, see [Download Schematics
   * Job](https://cloud.ibm.com/docs/schematics?topic=schematics-job-download).
   *
   * @param getJobFilesOptions the {@link GetJobFilesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobFileData}
   */
  public ServiceCall<JobFileData> getJobFiles(GetJobFilesOptions getJobFilesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getJobFilesOptions,
      "getJobFilesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", getJobFilesOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}/files", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getJobFiles");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("file_type", String.valueOf(getJobFilesOptions.fileType()));
    ResponseConverter<JobFileData> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobFileData>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete one or more workspace.
   *
   * Delete one or multiple Schematics workspace. Deleting a workspace does not destroy the resources from the
   * Schematics workspace.
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see
   *    [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param createWorkspaceDeletionJobOptions the {@link CreateWorkspaceDeletionJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceBulkDeleteResponse}
   */
  public ServiceCall<WorkspaceBulkDeleteResponse> createWorkspaceDeletionJob(CreateWorkspaceDeletionJobOptions createWorkspaceDeletionJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createWorkspaceDeletionJobOptions,
      "createWorkspaceDeletionJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspace_jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createWorkspaceDeletionJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", createWorkspaceDeletionJobOptions.refreshToken());
    final JsonObject contentJson = new JsonObject();
    if (createWorkspaceDeletionJobOptions.job() != null) {
      contentJson.addProperty("job", createWorkspaceDeletionJobOptions.job());
    }
    if (createWorkspaceDeletionJobOptions.version() != null) {
      contentJson.addProperty("version", createWorkspaceDeletionJobOptions.version());
    }
    if (createWorkspaceDeletionJobOptions.workspaces() != null) {
      contentJson.add("workspaces", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createWorkspaceDeletionJobOptions.workspaces()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkspaceBulkDeleteResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceBulkDeleteResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the workspace deletion job status.
   *
   * Retrieve detailed information for a workspace deletion job status.
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see
   *    [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getWorkspaceDeletionJobStatusOptions the {@link GetWorkspaceDeletionJobStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceJobResponse}
   */
  public ServiceCall<WorkspaceJobResponse> getWorkspaceDeletionJobStatus(GetWorkspaceDeletionJobStatusOptions getWorkspaceDeletionJobStatusOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceDeletionJobStatusOptions,
      "getWorkspaceDeletionJobStatusOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("wj_id", getWorkspaceDeletionJobStatusOptions.wjId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/workspace_jobs/{wj_id}/status", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getWorkspaceDeletionJobStatus");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WorkspaceJobResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceJobResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List blueprint.
   *
   * Retrieve a list of Schematics Blueprints from your IBM Cloud account that you have access to. The list of
   * blueprints that is returned depends on the API endpoint that you use. For example, if you use an API endpoint for a
   * geography, such as North America, only blueprints that are created in us-south or us-east are returned. &lt;/b&gt;
   * &lt;/b&gt; For more information about supported API endpoints, see [API
   * endpoints](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions, see [Schematics service access
   *   roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listBlueprintOptions the {@link ListBlueprintOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BlueprintList}
   */
  public ServiceCall<BlueprintList> listBlueprint(ListBlueprintOptions listBlueprintOptions) {
    if (listBlueprintOptions == null) {
      listBlueprintOptions = new ListBlueprintOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/blueprints"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listBlueprint");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listBlueprintOptions.offset() != null) {
      builder.query("offset", String.valueOf(listBlueprintOptions.offset()));
    }
    if (listBlueprintOptions.limit() != null) {
      builder.query("limit", String.valueOf(listBlueprintOptions.limit()));
    }
    ResponseConverter<BlueprintList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BlueprintList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List blueprint.
   *
   * Retrieve a list of Schematics Blueprints from your IBM Cloud account that you have access to. The list of
   * blueprints that is returned depends on the API endpoint that you use. For example, if you use an API endpoint for a
   * geography, such as North America, only blueprints that are created in us-south or us-east are returned. &lt;/b&gt;
   * &lt;/b&gt; For more information about supported API endpoints, see [API
   * endpoints](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions, see [Schematics service access
   *   roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link BlueprintList}
   */
  public ServiceCall<BlueprintList> listBlueprint() {
    return listBlueprint(null);
  }

  /**
   * Create a blueprint.
   *
   * Deploying an IBM Cloud Schematics Blueprint environment and cloud resources by using a blueprint template is a
   * two-step process. The first step is create a blueprint configuration in Schematics, the second step deploys the
   * configuration by using blueprint apply operation. &lt;/br&gt;&lt;/br&gt; Create an IBM Cloud Schematics Blueprint
   * that points to the blueprint configuration where your blueprint template are stored. The blueprint config specifies
   * the Git source and release of the blueprint template, input files, and any input values that are used to create
   * cloud resources. Blueprint creates a blueprint module resource in Schematics for each module definition in the
   * template. Blueprint module resources are initialized with the Terraform module source from the Git repository
   * specified in the module definition, and module inputs. &lt;/br&gt;&lt;/br&gt;Blueprint apply create, or update
   * resources in a blueprint environment. For more information about apply blueprint configuration changes to an
   * environment, see [blueprint
   * apply](https://cloud.ibm.com/docs/schematics?topic=schematics-apply-blueprint&amp;interface=api).
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions, see [Schematics service access
   *   roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param createBlueprintOptions the {@link CreateBlueprintOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Blueprint}
   */
  public ServiceCall<Blueprint> createBlueprint(CreateBlueprintOptions createBlueprintOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createBlueprintOptions,
      "createBlueprintOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/blueprints"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createBlueprint");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createBlueprintOptions.name());
    if (createBlueprintOptions.schemaVersion() != null) {
      contentJson.addProperty("schema_version", createBlueprintOptions.schemaVersion());
    }
    if (createBlueprintOptions.source() != null) {
      contentJson.add("source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBlueprintOptions.source()));
    }
    if (createBlueprintOptions.config() != null) {
      contentJson.add("config", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBlueprintOptions.config()));
    }
    if (createBlueprintOptions.description() != null) {
      contentJson.addProperty("description", createBlueprintOptions.description());
    }
    if (createBlueprintOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", createBlueprintOptions.resourceGroup());
    }
    if (createBlueprintOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBlueprintOptions.tags()));
    }
    if (createBlueprintOptions.location() != null) {
      contentJson.addProperty("location", createBlueprintOptions.location());
    }
    if (createBlueprintOptions.inputs() != null) {
      contentJson.add("inputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBlueprintOptions.inputs()));
    }
    if (createBlueprintOptions.settings() != null) {
      contentJson.add("settings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBlueprintOptions.settings()));
    }
    if (createBlueprintOptions.flow() != null) {
      contentJson.add("flow", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBlueprintOptions.flow()));
    }
    if (createBlueprintOptions.userState() != null) {
      contentJson.add("user_state", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBlueprintOptions.userState()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Blueprint> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Blueprint>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a blueprint.
   *
   * Retrieve detailed information for a blueprint in your IBM Cloud account. For more information about displaying
   * blueprint example, see [displaying
   * blueprint](https://cloud.ibm.com/docs/schematics?topic=schematics-list-blueprint&amp;interface=api).
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions, see [Schematics service access
   *   roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getBlueprintOptions the {@link GetBlueprintOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Blueprint}
   */
  public ServiceCall<Blueprint> getBlueprint(GetBlueprintOptions getBlueprintOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBlueprintOptions,
      "getBlueprintOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("blueprint_id", getBlueprintOptions.blueprintId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/blueprints/{blueprint_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getBlueprint");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getBlueprintOptions.profile() != null) {
      builder.query("profile", String.valueOf(getBlueprintOptions.profile()));
    }
    ResponseConverter<Blueprint> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Blueprint>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a blueprint.
   *
   * Use this API to update or replace the entire blueprint, including the blueprint configuration or module resources
   * that your blueprint points to. For more information about update blueprint example, see [Update blueprint
   * configuration](https://cloud.ibm.com/docs/schematics?topic=schematics-update-blueprint&amp;interface=api).
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions, see [Schematics service access
   *   roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param replaceBlueprintOptions the {@link ReplaceBlueprintOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Blueprint}
   */
  public ServiceCall<Blueprint> replaceBlueprint(ReplaceBlueprintOptions replaceBlueprintOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceBlueprintOptions,
      "replaceBlueprintOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("blueprint_id", replaceBlueprintOptions.blueprintId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/blueprints/{blueprint_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "replaceBlueprint");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (replaceBlueprintOptions.profile() != null) {
      builder.query("profile", String.valueOf(replaceBlueprintOptions.profile()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", replaceBlueprintOptions.name());
    if (replaceBlueprintOptions.schemaVersion() != null) {
      contentJson.addProperty("schema_version", replaceBlueprintOptions.schemaVersion());
    }
    if (replaceBlueprintOptions.source() != null) {
      contentJson.add("source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceBlueprintOptions.source()));
    }
    if (replaceBlueprintOptions.config() != null) {
      contentJson.add("config", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceBlueprintOptions.config()));
    }
    if (replaceBlueprintOptions.description() != null) {
      contentJson.addProperty("description", replaceBlueprintOptions.description());
    }
    if (replaceBlueprintOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", replaceBlueprintOptions.resourceGroup());
    }
    if (replaceBlueprintOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceBlueprintOptions.tags()));
    }
    if (replaceBlueprintOptions.location() != null) {
      contentJson.addProperty("location", replaceBlueprintOptions.location());
    }
    if (replaceBlueprintOptions.inputs() != null) {
      contentJson.add("inputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceBlueprintOptions.inputs()));
    }
    if (replaceBlueprintOptions.settings() != null) {
      contentJson.add("settings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceBlueprintOptions.settings()));
    }
    if (replaceBlueprintOptions.flow() != null) {
      contentJson.add("flow", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceBlueprintOptions.flow()));
    }
    if (replaceBlueprintOptions.userState() != null) {
      contentJson.add("user_state", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceBlueprintOptions.userState()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Blueprint> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Blueprint>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a blueprint.
   *
   * Deleting a blueprint environment is a two stage process that first destroys all the associated cloud resources and
   * second deletes the blueprint configuration in IBM Cloud Schematics. &lt;/br&gt; &lt;/br&gt;For more information
   * about destroy blueprint and delete blueprint, see [destroying blueprint
   * environment](https://cloud.ibm.com/docs/schematics?topic=schematics-destroy-blueprint&amp;interface=api) and
   * [deleting blueprint
   * configuration](https://cloud.ibm.com/docs/schematics?topic=schematics-delete-blueprint&amp;interface=api).
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions, see [Schematics service access
   *   roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param deleteBlueprintOptions the {@link DeleteBlueprintOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteBlueprint(DeleteBlueprintOptions deleteBlueprintOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteBlueprintOptions,
      "deleteBlueprintOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("blueprint_id", deleteBlueprintOptions.blueprintId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/blueprints/{blueprint_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteBlueprint");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deleteBlueprintOptions.profile() != null) {
      builder.query("profile", String.valueOf(deleteBlueprintOptions.profile()));
    }
    if (deleteBlueprintOptions.destroy() != null) {
      builder.query("destroy", String.valueOf(deleteBlueprintOptions.destroy()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Upload a TAR file to a blueprint.
   *
   * Update your blueprint configuration by uploading tape archive file (.tar) file from your local machine.
   *
   *   &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources.
   *   For more information, about Schematics access and permissions, see [Schematics service access
   *   roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param uploadTemplateTarBlueprintOptions the {@link UploadTemplateTarBlueprintOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BlueprintTemplateRepoTarUploadResponse}
   */
  public ServiceCall<BlueprintTemplateRepoTarUploadResponse> uploadTemplateTarBlueprint(UploadTemplateTarBlueprintOptions uploadTemplateTarBlueprintOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(uploadTemplateTarBlueprintOptions,
      "uploadTemplateTarBlueprintOptions cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.isTrue((uploadTemplateTarBlueprintOptions.file() != null),
      "At least one of  or file must be supplied.");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("blueprint_id", uploadTemplateTarBlueprintOptions.blueprintId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/blueprints/{blueprint_id}/template_repo_upload", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "uploadTemplateTarBlueprint");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    if (uploadTemplateTarBlueprintOptions.file() != null) {
      okhttp3.RequestBody fileBody = RequestUtils.inputStreamBody(uploadTemplateTarBlueprintOptions.file(), uploadTemplateTarBlueprintOptions.fileContentType());
      multipartBuilder.addFormDataPart("file", "filename", fileBody);
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<BlueprintTemplateRepoTarUploadResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BlueprintTemplateRepoTarUploadResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List inventory definitions.
   *
   * Retrieve a list of all Schematics inventories that depends on the API endpoint that you have access. For example,
   * if you use an API endpoint for a geography, such as North America, only inventories that are created in `us-south`
   * or `us-east` are retrieved. For more information, about supported API endpoints, see
   * [APIendpoints](/apidocs/schematics#api-endpoints).
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listInventoriesOptions the {@link ListInventoriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecordList}
   */
  public ServiceCall<InventoryResourceRecordList> listInventories(ListInventoriesOptions listInventoriesOptions) {
    if (listInventoriesOptions == null) {
      listInventoriesOptions = new ListInventoriesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listInventories");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listInventoriesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listInventoriesOptions.offset()));
    }
    if (listInventoriesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listInventoriesOptions.limit()));
    }
    if (listInventoriesOptions.sort() != null) {
      builder.query("sort", String.valueOf(listInventoriesOptions.sort()));
    }
    if (listInventoriesOptions.profile() != null) {
      builder.query("profile", String.valueOf(listInventoriesOptions.profile()));
    }
    ResponseConverter<InventoryResourceRecordList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecordList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List inventory definitions.
   *
   * Retrieve a list of all Schematics inventories that depends on the API endpoint that you have access. For example,
   * if you use an API endpoint for a geography, such as North America, only inventories that are created in `us-south`
   * or `us-east` are retrieved. For more information, about supported API endpoints, see
   * [APIendpoints](/apidocs/schematics#api-endpoints).
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecordList}
   */
  public ServiceCall<InventoryResourceRecordList> listInventories() {
    return listInventories(null);
  }

  /**
   * Create an inventory definition.
   *
   * Create an IBM Cloud Schematics inventory as a single IBM Cloud resource where you want to run Ansible playbook by
   * using Schematics actions. For more information, about inventory host groups, refer to [creating static and dynamic
   * inventory for Schematics actions](https://cloud.ibm.com/docs/schematics?topic=schematics-inventories-setup).
   *
   *  **Note** you cannot update the location and region, resource group once an action is created. Also, make sure your
   * IP addresses are in the [allowlist](https://cloud.ibm.com/docs/schematics?topic=schematics-allowed-ipaddresses).
   *  If your Git repository already contains a host file. Schematics does not overwrite the host file already present
   * in your Git repository.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param createInventoryOptions the {@link CreateInventoryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecord}
   */
  public ServiceCall<InventoryResourceRecord> createInventory(CreateInventoryOptions createInventoryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInventoryOptions,
      "createInventoryOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createInventory");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createInventoryOptions.name() != null) {
      contentJson.addProperty("name", createInventoryOptions.name());
    }
    if (createInventoryOptions.description() != null) {
      contentJson.addProperty("description", createInventoryOptions.description());
    }
    if (createInventoryOptions.location() != null) {
      contentJson.addProperty("location", createInventoryOptions.location());
    }
    if (createInventoryOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", createInventoryOptions.resourceGroup());
    }
    if (createInventoryOptions.inventoriesIni() != null) {
      contentJson.addProperty("inventories_ini", createInventoryOptions.inventoriesIni());
    }
    if (createInventoryOptions.resourceQueries() != null) {
      contentJson.add("resource_queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createInventoryOptions.resourceQueries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InventoryResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create an inventory definition.
   *
   * Create an IBM Cloud Schematics inventory as a single IBM Cloud resource where you want to run Ansible playbook by
   * using Schematics actions. For more information, about inventory host groups, refer to [creating static and dynamic
   * inventory for Schematics actions](https://cloud.ibm.com/docs/schematics?topic=schematics-inventories-setup).
   *
   *  **Note** you cannot update the location and region, resource group once an action is created. Also, make sure your
   * IP addresses are in the [allowlist](https://cloud.ibm.com/docs/schematics?topic=schematics-allowed-ipaddresses).
   *  If your Git repository already contains a host file. Schematics does not overwrite the host file already present
   * in your Git repository.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecord}
   */
  public ServiceCall<InventoryResourceRecord> createInventory() {
    return createInventory(null);
  }

  /**
   * Get an inventory definition.
   *
   * Use this API to retrieve the detailed information for a resource inventory definition used to target an action in
   * your IBM Cloud account. For more information, about inventory get, refer to [ibmcloud schematics inventory
   * get](https://cloud.ibm.com/docs/schematics?topic=schematics-schematics-cli-reference#schematics-get-inv).
   *
   *  **Note** you can fetch only the location and region, resource group from where your inventory is created.
   *  Also, make sure your IP addresses are in the
   * [allowlist](https://cloud.ibm.com/docs/schematics?topic=schematics-allowed-ipaddresses).
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getInventoryOptions the {@link GetInventoryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecord}
   */
  public ServiceCall<InventoryResourceRecord> getInventory(GetInventoryOptions getInventoryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInventoryOptions,
      "getInventoryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("inventory_id", getInventoryOptions.inventoryId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories/{inventory_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getInventory");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getInventoryOptions.profile() != null) {
      builder.query("profile", String.valueOf(getInventoryOptions.profile()));
    }
    ResponseConverter<InventoryResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an inventory definition.
   *
   * Use this API to update the inventory definition resource used to target an action. For more information, about
   * inventory update, refer to [ibmcloud schematics inventory
   * update](https://cloud.ibm.com/docs/schematics?topic=schematics-schematics-cli-reference#schematics-update-inv).
   *
   *  **Note** you cannot update the location and region, resource group once an action is created.
   *  Also, make sure your IP addresses are in the
   * [allowlist](https://cloud.ibm.com/docs/schematics?topic=schematics-allowed-ipaddresses).
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param replaceInventoryOptions the {@link ReplaceInventoryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecord}
   */
  public ServiceCall<InventoryResourceRecord> replaceInventory(ReplaceInventoryOptions replaceInventoryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceInventoryOptions,
      "replaceInventoryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("inventory_id", replaceInventoryOptions.inventoryId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories/{inventory_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "replaceInventory");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (replaceInventoryOptions.name() != null) {
      contentJson.addProperty("name", replaceInventoryOptions.name());
    }
    if (replaceInventoryOptions.description() != null) {
      contentJson.addProperty("description", replaceInventoryOptions.description());
    }
    if (replaceInventoryOptions.location() != null) {
      contentJson.addProperty("location", replaceInventoryOptions.location());
    }
    if (replaceInventoryOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", replaceInventoryOptions.resourceGroup());
    }
    if (replaceInventoryOptions.inventoriesIni() != null) {
      contentJson.addProperty("inventories_ini", replaceInventoryOptions.inventoriesIni());
    }
    if (replaceInventoryOptions.resourceQueries() != null) {
      contentJson.add("resource_queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceInventoryOptions.resourceQueries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InventoryResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an inventory definition.
   *
   * Use this API to delete the resource inventory definition by using the inventory ID that you want to run against.
   * For more information, about inventory delete, refer to [ibmcloud schematics inventory
   * delete](https://cloud.ibm.com/docs/schematics?topic=schematics-schematics-cli-reference#schematics-delete-inventory).
   *
   *  **Note** you cannot delete the location and region, resource group from where your inventory is created. Also,
   * make sure your IP addresses are in the
   * [allowlist](https://cloud.ibm.com/docs/schematics?topic=schematics-allowed-ipaddresses).
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param deleteInventoryOptions the {@link DeleteInventoryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInventory(DeleteInventoryOptions deleteInventoryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInventoryOptions,
      "deleteInventoryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("inventory_id", deleteInventoryOptions.inventoryId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories/{inventory_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteInventory");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteInventoryOptions.force() != null) {
      builder.header("force", deleteInventoryOptions.force());
    }
    if (deleteInventoryOptions.propagate() != null) {
      builder.header("propagate", deleteInventoryOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List resource queries.
   *
   * Retrieve the list of resource query definitions that you have access to.  The list of resource queries that is
   * returned depends on the API  endpoint that you use. For example, if you use an API endpoint for a geography, such
   * as North America, only resource query definitions that are created in `us-south` or `us-east` are retrieved. For
   * more information, about supported API endpoints, see [API endpoints](/apidocs/schematics#api-endpoints).
   * &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listResourceQueryOptions the {@link ListResourceQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecordList}
   */
  public ServiceCall<ResourceQueryRecordList> listResourceQuery(ListResourceQueryOptions listResourceQueryOptions) {
    if (listResourceQueryOptions == null) {
      listResourceQueryOptions = new ListResourceQueryOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listResourceQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listResourceQueryOptions.offset() != null) {
      builder.query("offset", String.valueOf(listResourceQueryOptions.offset()));
    }
    if (listResourceQueryOptions.limit() != null) {
      builder.query("limit", String.valueOf(listResourceQueryOptions.limit()));
    }
    if (listResourceQueryOptions.sort() != null) {
      builder.query("sort", String.valueOf(listResourceQueryOptions.sort()));
    }
    if (listResourceQueryOptions.profile() != null) {
      builder.query("profile", String.valueOf(listResourceQueryOptions.profile()));
    }
    ResponseConverter<ResourceQueryRecordList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryRecordList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List resource queries.
   *
   * Retrieve the list of resource query definitions that you have access to.  The list of resource queries that is
   * returned depends on the API  endpoint that you use. For example, if you use an API endpoint for a geography, such
   * as North America, only resource query definitions that are created in `us-south` or `us-east` are retrieved. For
   * more information, about supported API endpoints, see [API endpoints](/apidocs/schematics#api-endpoints).
   * &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecordList}
   */
  public ServiceCall<ResourceQueryRecordList> listResourceQuery() {
    return listResourceQuery(null);
  }

  /**
   * Create resource query.
   *
   * Use this API to create a resource query definition that will be used to select an IBM Cloud resource or a group of
   * resources as the dynamic inventory for the Schematics Actions.  For more information, about resource query
   * commands, refer to  [ibmcloud schematics resource query
   * create](https://cloud.ibm.com/docs/schematics?topic=schematics-schematics-cli-reference#schematics-create-rq).
   * **Note** you cannot update the location and region, resource group  once an action is created. Also, make sure your
   * IP addresses are  in the [allowlist](https://cloud.ibm.com/docs/schematics?topic=schematics-allowed-ipaddresses).
   * If your Git repository already contains a host file.  Schematics does not overwrite the host file already present
   * in your Git repository.
   * &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param createResourceQueryOptions the {@link CreateResourceQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecord}
   */
  public ServiceCall<ResourceQueryRecord> createResourceQuery(CreateResourceQueryOptions createResourceQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createResourceQueryOptions,
      "createResourceQueryOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createResourceQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createResourceQueryOptions.type() != null) {
      contentJson.addProperty("type", createResourceQueryOptions.type());
    }
    if (createResourceQueryOptions.name() != null) {
      contentJson.addProperty("name", createResourceQueryOptions.name());
    }
    if (createResourceQueryOptions.queries() != null) {
      contentJson.add("queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createResourceQueryOptions.queries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ResourceQueryRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create resource query.
   *
   * Use this API to create a resource query definition that will be used to select an IBM Cloud resource or a group of
   * resources as the dynamic inventory for the Schematics Actions.  For more information, about resource query
   * commands, refer to  [ibmcloud schematics resource query
   * create](https://cloud.ibm.com/docs/schematics?topic=schematics-schematics-cli-reference#schematics-create-rq).
   * **Note** you cannot update the location and region, resource group  once an action is created. Also, make sure your
   * IP addresses are  in the [allowlist](https://cloud.ibm.com/docs/schematics?topic=schematics-allowed-ipaddresses).
   * If your Git repository already contains a host file.  Schematics does not overwrite the host file already present
   * in your Git repository.
   * &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecord}
   */
  public ServiceCall<ResourceQueryRecord> createResourceQuery() {
    return createResourceQuery(null);
  }

  /**
   * Get resources query.
   *
   * Use this API to retrieve the information resource query by Id.  For more information, about resource query
   * commands, refer to  [ibmcloud schematics resource query
   * get](https://cloud.ibm.com/docs/schematics?topic=schematics-schematics-cli-reference#schematics-get-rq).
   * &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getResourcesQueryOptions the {@link GetResourcesQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecord}
   */
  public ServiceCall<ResourceQueryRecord> getResourcesQuery(GetResourcesQueryOptions getResourcesQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getResourcesQueryOptions,
      "getResourcesQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_id", getResourcesQueryOptions.queryId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query/{query_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getResourcesQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ResourceQueryRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update resources query definition.
   *
   * Use this API to update the resource query definition used to build  the dynamic inventory for the Schematics
   * Action.  For more information, about resource query commands, refer to [ibmcloud schematics resource query
   * update](https://cloud.ibm.com/docs/schematics?topic=schematics-schematics-cli-reference#schematics-update-rq).
   * **Note** you cannot update the location and region, resource group  once a resource query is created. Also, make
   * sure your IP addresses  are in the
   * [allowlist](https://cloud.ibm.com/docs/schematics?topic=schematics-allowed-ipaddresses).
   * &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param replaceResourcesQueryOptions the {@link ReplaceResourcesQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecord}
   */
  public ServiceCall<ResourceQueryRecord> replaceResourcesQuery(ReplaceResourcesQueryOptions replaceResourcesQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceResourcesQueryOptions,
      "replaceResourcesQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_id", replaceResourcesQueryOptions.queryId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query/{query_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "replaceResourcesQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (replaceResourcesQueryOptions.type() != null) {
      contentJson.addProperty("type", replaceResourcesQueryOptions.type());
    }
    if (replaceResourcesQueryOptions.name() != null) {
      contentJson.addProperty("name", replaceResourcesQueryOptions.name());
    }
    if (replaceResourcesQueryOptions.queries() != null) {
      contentJson.add("queries", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceResourcesQueryOptions.queries()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ResourceQueryRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Run the resource query.
   *
   * Run the resource query.
   *
   * @param executeResourceQueryOptions the {@link ExecuteResourceQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryResponseRecord}
   */
  public ServiceCall<ResourceQueryResponseRecord> executeResourceQuery(ExecuteResourceQueryOptions executeResourceQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(executeResourceQueryOptions,
      "executeResourceQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_id", executeResourceQueryOptions.queryId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query/{query_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "executeResourceQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ResourceQueryResponseRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryResponseRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete resources query.
   *
   * Use this API to delete the resource query definition by Id.  For more information, about resource query commands,
   * refer to  [ibmcloud schematics resource query
   * delete](https://cloud.ibm.com/docs/schematics?topic=schematics-schematics-cli-reference#schematics-delete-resource-query).
   *
   * &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param deleteResourcesQueryOptions the {@link DeleteResourcesQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteResourcesQuery(DeleteResourcesQueryOptions deleteResourcesQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteResourcesQueryOptions,
      "deleteResourcesQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_id", deleteResourcesQueryOptions.queryId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query/{query_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteResourcesQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteResourcesQueryOptions.force() != null) {
      builder.header("force", deleteResourcesQueryOptions.force());
    }
    if (deleteResourcesQueryOptions.propagate() != null) {
      builder.header("propagate", deleteResourcesQueryOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all registered/unregistered agents in the Account.
   *
   * Get all registered or unregistered agents, in the Account.
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listAgentOptions the {@link ListAgentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AgentList}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<AgentList> listAgent(ListAgentOptions listAgentOptions) {
    LOGGER.warning("A deprecated operation has been invoked: listAgent");
    if (listAgentOptions == null) {
      listAgentOptions = new ListAgentOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/agents"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listAgent");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAgentOptions.offset() != null) {
      builder.query("offset", String.valueOf(listAgentOptions.offset()));
    }
    if (listAgentOptions.limit() != null) {
      builder.query("limit", String.valueOf(listAgentOptions.limit()));
    }
    if (listAgentOptions.profile() != null) {
      builder.query("profile", String.valueOf(listAgentOptions.profile()));
    }
    if (listAgentOptions.filter() != null) {
      builder.query("filter", String.valueOf(listAgentOptions.filter()));
    }
    ResponseConverter<AgentList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AgentList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all registered/unregistered agents in the Account.
   *
   * Get all registered or unregistered agents, in the Account.
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link AgentList}
   * @deprecated this method is deprecated and may be removed in a future release
   */
  @Deprecated
  public ServiceCall<AgentList> listAgent() {
    return listAgent(null);
  }

  /**
   * Register the agent with schematics.
   *
   * Register the agent with schematics
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param registerAgentOptions the {@link RegisterAgentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Agent}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<Agent> registerAgent(RegisterAgentOptions registerAgentOptions) {
    LOGGER.warning("A deprecated operation has been invoked: registerAgent");
    com.ibm.cloud.sdk.core.util.Validator.notNull(registerAgentOptions,
      "registerAgentOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/agents"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "registerAgent");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", registerAgentOptions.name());
    contentJson.addProperty("agent_location", registerAgentOptions.agentLocation());
    contentJson.addProperty("location", registerAgentOptions.location());
    contentJson.addProperty("profile_id", registerAgentOptions.profileId());
    if (registerAgentOptions.description() != null) {
      contentJson.addProperty("description", registerAgentOptions.description());
    }
    if (registerAgentOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", registerAgentOptions.resourceGroup());
    }
    if (registerAgentOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(registerAgentOptions.tags()));
    }
    if (registerAgentOptions.userState() != null) {
      contentJson.add("user_state", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(registerAgentOptions.userState()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Agent> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Agent>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the registered agent details.
   *
   * Reterive list the registered agent details
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getAgentOptions the {@link GetAgentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Agent}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<Agent> getAgent(GetAgentOptions getAgentOptions) {
    LOGGER.warning("A deprecated operation has been invoked: getAgent");
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAgentOptions,
      "getAgentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("agent_id", getAgentOptions.agentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/agents/{agent_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getAgent");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getAgentOptions.profile() != null) {
      builder.query("profile", String.valueOf(getAgentOptions.profile()));
    }
    ResponseConverter<Agent> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Agent>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Deregister the agent.
   *
   * Deregistering an agent.
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param deleteAgentOptions the {@link DeleteAgentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<Void> deleteAgent(DeleteAgentOptions deleteAgentOptions) {
    LOGGER.warning("A deprecated operation has been invoked: deleteAgent");
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteAgentOptions,
      "deleteAgentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("agent_id", deleteAgentOptions.agentId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/agents/{agent_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteAgent");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the agent registration.
   *
   * Update the agent registeration.
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param updateAgentRegistrationOptions the {@link UpdateAgentRegistrationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Agent}
   * @deprecated this method is deprecated and may be removed in a future release
   */
   @Deprecated
  public ServiceCall<Agent> updateAgentRegistration(UpdateAgentRegistrationOptions updateAgentRegistrationOptions) {
    LOGGER.warning("A deprecated operation has been invoked: updateAgentRegistration");
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateAgentRegistrationOptions,
      "updateAgentRegistrationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("agent_id", updateAgentRegistrationOptions.agentId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/agents/{agent_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "updateAgentRegistration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", updateAgentRegistrationOptions.name());
    contentJson.addProperty("agent_location", updateAgentRegistrationOptions.agentLocation());
    contentJson.addProperty("location", updateAgentRegistrationOptions.location());
    contentJson.addProperty("profile_id", updateAgentRegistrationOptions.profileId());
    if (updateAgentRegistrationOptions.description() != null) {
      contentJson.addProperty("description", updateAgentRegistrationOptions.description());
    }
    if (updateAgentRegistrationOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", updateAgentRegistrationOptions.resourceGroup());
    }
    if (updateAgentRegistrationOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateAgentRegistrationOptions.tags()));
    }
    if (updateAgentRegistrationOptions.userState() != null) {
      contentJson.add("user_state", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateAgentRegistrationOptions.userState()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Agent> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Agent>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List agents.
   *
   * Retrieve a list of Schematics agents from your IBM Cloud account that you have access to. The list of agents that
   * is returned depends on the API endpoint that you use. For example, if you use an API endpoint for a geography, such
   * as North America, only agents that are created in `us-south or `us-east` are returned. For more information about
   * frequently asked questions, see [FAQ](https://cloud.ibm.com/docs/schematics?topic=schematics-faqs-agent) and
   * [Troubleshooting guide](https://cloud.ibm.com/docs/schematics?topic=schematics-agent-crn-not-found). For more
   * information about supported API endpoints, see [API
   * endpoint](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listAgentDataOptions the {@link ListAgentDataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AgentDataList}
   */
  public ServiceCall<AgentDataList> listAgentData(ListAgentDataOptions listAgentDataOptions) {
    if (listAgentDataOptions == null) {
      listAgentDataOptions = new ListAgentDataOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/agents"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listAgentData");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAgentDataOptions.offset() != null) {
      builder.query("offset", String.valueOf(listAgentDataOptions.offset()));
    }
    if (listAgentDataOptions.limit() != null) {
      builder.query("limit", String.valueOf(listAgentDataOptions.limit()));
    }
    if (listAgentDataOptions.profile() != null) {
      builder.query("profile", String.valueOf(listAgentDataOptions.profile()));
    }
    if (listAgentDataOptions.filter() != null) {
      builder.query("filter", String.valueOf(listAgentDataOptions.filter()));
    }
    ResponseConverter<AgentDataList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AgentDataList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List agents.
   *
   * Retrieve a list of Schematics agents from your IBM Cloud account that you have access to. The list of agents that
   * is returned depends on the API endpoint that you use. For example, if you use an API endpoint for a geography, such
   * as North America, only agents that are created in `us-south or `us-east` are returned. For more information about
   * frequently asked questions, see [FAQ](https://cloud.ibm.com/docs/schematics?topic=schematics-faqs-agent) and
   * [Troubleshooting guide](https://cloud.ibm.com/docs/schematics?topic=schematics-agent-crn-not-found). For more
   * information about supported API endpoints, see [API
   * endpoint](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link AgentDataList}
   */
  public ServiceCall<AgentDataList> listAgentData() {
    return listAgentData(null);
  }

  /**
   * Create an agent.
   *
   * Subsequently, create an agent definition to manage the agent deployment with the agent configuration that will be
   * used to deploy your agent to its target location.
   * **Getting API endpoint**:-
   * * The Schematics API endpoint that you use to create the agent determines where your Schematics agent run and your
   * data is stored. For more information about supported API endpoints, see [API
   * endpoints](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints). * If you use the API endpoint for a
   * geography and not a specific location, such as North America, you can specify the location in your API request
   * body. * If you do not specify the location in the request body, Schematics determines your agent location based on
   * availability. * If you use an API endpoint for a specific location, such as Frankfurt, the location that you enter
   * in your API request body must match your API endpoint. * You also have the option to not specify a location in your
   * API request body if you use a location-specific API endpoint. * Follow the
   * [steps](https://cloud.ibm.com/docs/schematics?topic=schematics-setup-api#cs_api) to retrieve your IAM access token
   * and authenticate with IBM Cloud Schematics by using the API. * For more information about frequently asked
   * questions, see [FAQ](https://cloud.ibm.com/docs/schematics?topic=schematics-faqs-agent) and [Troubleshooting
   * guide](https://cloud.ibm.com/docs/schematics?topic=schematics-agent-crn-not-found).
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param createAgentDataOptions the {@link CreateAgentDataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AgentData}
   */
  public ServiceCall<AgentData> createAgentData(CreateAgentDataOptions createAgentDataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createAgentDataOptions,
      "createAgentDataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/agents"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createAgentData");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", createAgentDataOptions.name());
    contentJson.addProperty("resource_group", createAgentDataOptions.resourceGroup());
    contentJson.addProperty("version", createAgentDataOptions.version());
    contentJson.addProperty("schematics_location", createAgentDataOptions.schematicsLocation());
    contentJson.addProperty("agent_location", createAgentDataOptions.agentLocation());
    contentJson.add("agent_infrastructure", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAgentDataOptions.agentInfrastructure()));
    if (createAgentDataOptions.description() != null) {
      contentJson.addProperty("description", createAgentDataOptions.description());
    }
    if (createAgentDataOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAgentDataOptions.tags()));
    }
    if (createAgentDataOptions.agentMetadata() != null) {
      contentJson.add("agent_metadata", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAgentDataOptions.agentMetadata()));
    }
    if (createAgentDataOptions.agentInputs() != null) {
      contentJson.add("agent_inputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAgentDataOptions.agentInputs()));
    }
    if (createAgentDataOptions.userState() != null) {
      contentJson.add("user_state", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAgentDataOptions.userState()));
    }
    if (createAgentDataOptions.agentKpi() != null) {
      contentJson.add("agent_kpi", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createAgentDataOptions.agentKpi()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AgentData> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AgentData>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get agent details.
   *
   * Retrieve a detailed configuration of an agent with a specific agent ID. The agent that is returned depends on the
   * API endpoint that you use. For example, if you use an API endpoint for a geography, such as North America, only
   * agents that are created in `us-south or `us-east` are returned. For more information about frequently asked
   * questions, see [FAQ](https://cloud.ibm.com/docs/schematics?topic=schematics-faqs-agent) and [Troubleshooting
   * guide](https://cloud.ibm.com/docs/schematics?topic=schematics-agent-crn-not-found). For more information about
   * supported API endpoints, see [API endpoint](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getAgentDataOptions the {@link GetAgentDataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AgentData}
   */
  public ServiceCall<AgentData> getAgentData(GetAgentDataOptions getAgentDataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAgentDataOptions,
      "getAgentDataOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("agent_id", getAgentDataOptions.agentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/agents/{agent_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getAgentData");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getAgentDataOptions.profile() != null) {
      builder.query("profile", String.valueOf(getAgentDataOptions.profile()));
    }
    ResponseConverter<AgentData> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AgentData>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update agent.
   *
   * Use update agent API to update or replace the entire agent. For more information about steps to apply `UPDATE` and
   * `PUT` command, see [Deploying
   * agent](https://cloud.ibm.com/docs/schematics?topic=schematics-deploy-agent-overview&amp;interface=api). For more
   * information about supported API endpoints, see [API
   * endpoint](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param updateAgentDataOptions the {@link UpdateAgentDataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AgentData}
   */
  public ServiceCall<AgentData> updateAgentData(UpdateAgentDataOptions updateAgentDataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateAgentDataOptions,
      "updateAgentDataOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("agent_id", updateAgentDataOptions.agentId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/agents/{agent_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "updateAgentData");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", updateAgentDataOptions.name());
    contentJson.addProperty("resource_group", updateAgentDataOptions.resourceGroup());
    contentJson.addProperty("version", updateAgentDataOptions.version());
    contentJson.addProperty("schematics_location", updateAgentDataOptions.schematicsLocation());
    contentJson.addProperty("agent_location", updateAgentDataOptions.agentLocation());
    contentJson.add("agent_infrastructure", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateAgentDataOptions.agentInfrastructure()));
    if (updateAgentDataOptions.description() != null) {
      contentJson.addProperty("description", updateAgentDataOptions.description());
    }
    if (updateAgentDataOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateAgentDataOptions.tags()));
    }
    if (updateAgentDataOptions.agentMetadata() != null) {
      contentJson.add("agent_metadata", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateAgentDataOptions.agentMetadata()));
    }
    if (updateAgentDataOptions.agentInputs() != null) {
      contentJson.add("agent_inputs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateAgentDataOptions.agentInputs()));
    }
    if (updateAgentDataOptions.userState() != null) {
      contentJson.add("user_state", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateAgentDataOptions.userState()));
    }
    if (updateAgentDataOptions.agentKpi() != null) {
      contentJson.add("agent_kpi", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateAgentDataOptions.agentKpi()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AgentData> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AgentData>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete agent.
   *
   * Use this API to disable and delete the agent. Follow the
   * [steps](https://cloud.ibm.com/docs/schematics?topic=schematics-setup-api#cs_api) to retrieve your IAM access token
   * and authenticate with IBM Cloud Schematics by using the API. For more information about frequently asked questions,
   * see [FAQ](/docs/schematics?topic=schematics-faqs-agent) and [Troubleshooting
   * guide](https://cloud.ibm.com/docs/schematics?topic=schematics-agent-crn-not-found).
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param deleteAgentDataOptions the {@link DeleteAgentDataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteAgentData(DeleteAgentDataOptions deleteAgentDataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteAgentDataOptions,
      "deleteAgentDataOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("agent_id", deleteAgentDataOptions.agentId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/agents/{agent_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deleteAgentData");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get agent versions.
   *
   * Retrieve the list of agent version's available to be deployed. For more information about supported API endpoints,
   * see [API endpoint](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getAgentVersionsOptions the {@link GetAgentVersionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AgentVersions}
   */
  public ServiceCall<AgentVersions> getAgentVersions(GetAgentVersionsOptions getAgentVersionsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/agents/versions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getAgentVersions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AgentVersions> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AgentVersions>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get agent versions.
   *
   * Retrieve the list of agent version's available to be deployed. For more information about supported API endpoints,
   * see [API endpoint](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link AgentVersions}
   */
  public ServiceCall<AgentVersions> getAgentVersions() {
    return getAgentVersions(null);
  }

  /**
   * Get pre-requisite scanner job status.
   *
   * Use get pre-requisite scanner job status API for deploying an agent by using the `agent_id`, `job_id`. The API
   * results the status as **pending**, **in-progress**, **success**, or **failed** in a string format. For more
   * information about supported API endpoints, see [API
   * endpoint](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   * &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *   Schematics support generic authorization for its resources. For more information, about Schematics access and
   * permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getPrsAgentJobOptions the {@link GetPrsAgentJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AgentPRSJob}
   */
  public ServiceCall<AgentPRSJob> getPrsAgentJob(GetPrsAgentJobOptions getPrsAgentJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPrsAgentJobOptions,
      "getPrsAgentJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("agent_id", getPrsAgentJobOptions.agentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/agents/{agent_id}/prs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getPrsAgentJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AgentPRSJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AgentPRSJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Run pre-requisite scanner job.
   *
   * Use run pre-requisite scanner job API before deploying an agent. The API results the agent `prs` job updation time
   * with the E-mail address and the status in a string format. For more information about supported API endpoints, see
   * [API endpoint](/apidocs/schematics/schematics#api-endpoints).
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization for its resources. For more
   * information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param prsAgentJobOptions the {@link PrsAgentJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AgentPRSJob}
   */
  public ServiceCall<AgentPRSJob> prsAgentJob(PrsAgentJobOptions prsAgentJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(prsAgentJobOptions,
      "prsAgentJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("agent_id", prsAgentJobOptions.agentId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/agents/{agent_id}/prs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "prsAgentJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (prsAgentJobOptions.force() != null) {
      builder.query("force", String.valueOf(prsAgentJobOptions.force()));
    }
    ResponseConverter<AgentPRSJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AgentPRSJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get agent health check job.
   *
   * Use get agent health check job API to retrieve the agent health check job status based on the agent ID. For more
   * information about supported API endpoints, see [API endpoint](/apidocs/schematics/schematics#api-endpoints).
   * &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources. For more information, about Schematics access and
   * permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getHealthCheckAgentJobOptions the {@link GetHealthCheckAgentJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AgentHealthJob}
   */
  public ServiceCall<AgentHealthJob> getHealthCheckAgentJob(GetHealthCheckAgentJobOptions getHealthCheckAgentJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getHealthCheckAgentJobOptions,
      "getHealthCheckAgentJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("agent_id", getHealthCheckAgentJobOptions.agentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/agents/{agent_id}/health", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getHealthCheckAgentJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AgentHealthJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AgentHealthJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Run agent health check.
   *
   * Use run agent health check job API to execute an agent health check job based on the agent ID. For more information
   * about supported API endpoints, see [API
   * endpoint](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization for its resources. For more
   * information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param healthCheckAgentJobOptions the {@link HealthCheckAgentJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AgentHealthJob}
   */
  public ServiceCall<AgentHealthJob> healthCheckAgentJob(HealthCheckAgentJobOptions healthCheckAgentJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(healthCheckAgentJobOptions,
      "healthCheckAgentJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("agent_id", healthCheckAgentJobOptions.agentId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/agents/{agent_id}/health", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "healthCheckAgentJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (healthCheckAgentJobOptions.force() != null) {
      builder.query("force", String.valueOf(healthCheckAgentJobOptions.force()));
    }
    ResponseConverter<AgentHealthJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AgentHealthJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get agent deployment job.
   *
   * Use get agent deployment job API to retrieve the agent deployment job status based on the agent ID. For more
   * information about supported API endpoints, see [API
   * endpoint](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization for its resources. For more
   * information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getDeployAgentJobOptions the {@link GetDeployAgentJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AgentDeployJob}
   */
  public ServiceCall<AgentDeployJob> getDeployAgentJob(GetDeployAgentJobOptions getDeployAgentJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDeployAgentJobOptions,
      "getDeployAgentJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("agent_id", getDeployAgentJobOptions.agentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/agents/{agent_id}/deploy", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getDeployAgentJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<AgentDeployJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AgentDeployJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Run the agent deployment job.
   *
   * Use run agent deployment job API to execute the agent deployment job based on the agent ID. For more information
   * about supported API endpoints, see [API
   * endpoint](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization for its resources. For more
   * information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param deployAgentJobOptions the {@link DeployAgentJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AgentDeployJob}
   */
  public ServiceCall<AgentDeployJob> deployAgentJob(DeployAgentJobOptions deployAgentJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deployAgentJobOptions,
      "deployAgentJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("agent_id", deployAgentJobOptions.agentId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/agents/{agent_id}/deploy", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deployAgentJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (deployAgentJobOptions.force() != null) {
      builder.query("force", String.valueOf(deployAgentJobOptions.force()));
    }
    ResponseConverter<AgentDeployJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AgentDeployJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a KMS settings.
   *
   * Retrieve the kms instance that is integrated with Schematics for the **byok** and **kyok**. For each geographic
   * location supported in Schematics we can have different kms settings. For example `US` and `EU` will have different
   * kms settings.
   * &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getKmsSettingsOptions the {@link GetKmsSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link KMSSettings}
   */
  public ServiceCall<KMSSettings> getKmsSettings(GetKmsSettingsOptions getKmsSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getKmsSettingsOptions,
      "getKmsSettingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/kms"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getKmsSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("location", String.valueOf(getKmsSettingsOptions.location()));
    ResponseConverter<KMSSettings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<KMSSettings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a KMS settings.
   *
   * Replace or Update kms settings for a given location can be updated.
   * **Note** you can update the kms settings only once. For example, if you use an API endpoint for a geography, such
   * as North America, only kms settings for that region can be retrieved.
   * &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param updateKmsSettingsOptions the {@link UpdateKmsSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link KMSSettings}
   */
  public ServiceCall<KMSSettings> updateKmsSettings(UpdateKmsSettingsOptions updateKmsSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateKmsSettingsOptions,
      "updateKmsSettingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/kms"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "updateKmsSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updateKmsSettingsOptions.location() != null) {
      contentJson.addProperty("location", updateKmsSettingsOptions.location());
    }
    if (updateKmsSettingsOptions.encryptionScheme() != null) {
      contentJson.addProperty("encryption_scheme", updateKmsSettingsOptions.encryptionScheme());
    }
    if (updateKmsSettingsOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", updateKmsSettingsOptions.resourceGroup());
    }
    if (updateKmsSettingsOptions.primaryCrk() != null) {
      contentJson.add("primary_crk", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateKmsSettingsOptions.primaryCrk()));
    }
    if (updateKmsSettingsOptions.secondaryCrk() != null) {
      contentJson.add("secondary_crk", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateKmsSettingsOptions.secondaryCrk()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<KMSSettings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<KMSSettings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a KMS settings.
   *
   * Replace or Update kms settings for a given location can be updated.
   * **Note** you can update the kms settings only once. For example, if you use an API endpoint for a geography, such
   * as North America, only kms settings for that region can be retrieved.
   * &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link KMSSettings}
   */
  public ServiceCall<KMSSettings> updateKmsSettings() {
    return updateKmsSettings(null);
  }

  /**
   * List KMS instances.
   *
   * Lists the kms instances of your IBM Cloud account to find your Key Protect or Hyper Protect Crypto Services by
   * using the location and encrypted scheme.
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization for its resources.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listKmsOptions the {@link ListKmsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link KMSDiscovery}
   */
  public ServiceCall<KMSDiscovery> listKms(ListKmsOptions listKmsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listKmsOptions,
      "listKmsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/kms_instances"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listKms");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("encryption_scheme", String.valueOf(listKmsOptions.encryptionScheme()));
    builder.query("location", String.valueOf(listKmsOptions.location()));
    if (listKmsOptions.resourceGroup() != null) {
      builder.query("resource_group", String.valueOf(listKmsOptions.resourceGroup()));
    }
    if (listKmsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listKmsOptions.limit()));
    }
    if (listKmsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listKmsOptions.sort()));
    }
    ResponseConverter<KMSDiscovery> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<KMSDiscovery>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List policies.
   *
   * Retrieve a list of all policies from the account that you have access. the list of policies that is returned
   * depends on the API endpoint that you use. For example, if you use an API endpoint for a geography, such as North
   * America, only policies that are created in `us-south` or `us-east` are returned. For more information about
   * supported API endpoints, see [API endpoint](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listPolicyOptions the {@link ListPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyList}
   */
  public ServiceCall<PolicyList> listPolicy(ListPolicyOptions listPolicyOptions) {
    if (listPolicyOptions == null) {
      listPolicyOptions = new ListPolicyOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "listPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listPolicyOptions.offset() != null) {
      builder.query("offset", String.valueOf(listPolicyOptions.offset()));
    }
    if (listPolicyOptions.limit() != null) {
      builder.query("limit", String.valueOf(listPolicyOptions.limit()));
    }
    if (listPolicyOptions.profile() != null) {
      builder.query("profile", String.valueOf(listPolicyOptions.profile()));
    }
    ResponseConverter<PolicyList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List policies.
   *
   * Retrieve a list of all policies from the account that you have access. the list of policies that is returned
   * depends on the API endpoint that you use. For example, if you use an API endpoint for a geography, such as North
   * America, only policies that are created in `us-south` or `us-east` are returned. For more information about
   * supported API endpoints, see [API endpoint](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link PolicyList}
   */
  public ServiceCall<PolicyList> listPolicy() {
    return listPolicy(null);
  }

  /**
   * Create a policy account.
   *
   * Use this API to create a policy using Schematics to select one or more Schematics objects (such as, Workspaces,
   * Action, Blueprint) to deliver targeted Schematics feature. For more information about frequently asked questions,
   * see [FAQ](https://cloud.ibm.com/docs/schematics?topic=schematics-faqs-agent) and [Troubleshooting
   * guide](https://cloud.ibm.com/docs/schematics?topic=schematics-agent-crn-not-found).
   *
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param createPolicyOptions the {@link CreatePolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Policy}
   */
  public ServiceCall<Policy> createPolicy(CreatePolicyOptions createPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPolicyOptions,
      "createPolicyOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "createPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (createPolicyOptions.name() != null) {
      contentJson.addProperty("name", createPolicyOptions.name());
    }
    if (createPolicyOptions.description() != null) {
      contentJson.addProperty("description", createPolicyOptions.description());
    }
    if (createPolicyOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", createPolicyOptions.resourceGroup());
    }
    if (createPolicyOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPolicyOptions.tags()));
    }
    if (createPolicyOptions.location() != null) {
      contentJson.addProperty("location", createPolicyOptions.location());
    }
    if (createPolicyOptions.state() != null) {
      contentJson.add("state", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPolicyOptions.state()));
    }
    if (createPolicyOptions.kind() != null) {
      contentJson.addProperty("kind", createPolicyOptions.kind());
    }
    if (createPolicyOptions.target() != null) {
      contentJson.add("target", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPolicyOptions.target()));
    }
    if (createPolicyOptions.parameter() != null) {
      contentJson.add("parameter", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPolicyOptions.parameter()));
    }
    if (createPolicyOptions.scopedResources() != null) {
      contentJson.add("scoped_resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createPolicyOptions.scopedResources()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Policy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Policy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a policy account.
   *
   * Use this API to create a policy using Schematics to select one or more Schematics objects (such as, Workspaces,
   * Action, Blueprint) to deliver targeted Schematics feature. For more information about frequently asked questions,
   * see [FAQ](https://cloud.ibm.com/docs/schematics?topic=schematics-faqs-agent) and [Troubleshooting
   * guide](https://cloud.ibm.com/docs/schematics?topic=schematics-agent-crn-not-found).
   *
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link Policy}
   */
  public ServiceCall<Policy> createPolicy() {
    return createPolicy(null);
  }

  /**
   * Get policy.
   *
   * Retrieve the detailed information of a policy details identified by `policy_id`. For more information about
   * frequently asked questions, see [FAQ](https://cloud.ibm.com/docs/schematics?topic=schematics-faqs-agent) and
   * [Troubleshooting guide](https://cloud.ibm.com/docs/schematics?topic=schematics-agent-crn-not-found). For more
   * information about supported API endpoints, see [API
   * endpoint](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getPolicyOptions the {@link GetPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Policy}
   */
  public ServiceCall<Policy> getPolicy(GetPolicyOptions getPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getPolicyOptions,
      "getPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_id", getPolicyOptions.policyId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/policies/{policy_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "getPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getPolicyOptions.profile() != null) {
      builder.query("profile", String.valueOf(getPolicyOptions.profile()));
    }
    ResponseConverter<Policy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Policy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete policy.
   *
   * Use this API to delete the policy. Follow the
   * [steps](https://cloud.ibm.com/docs/schematics?topic=schematics-setup-api#cs_api) to retrieve your IAM access token
   * and authenticate with IBM Cloud Schematics by using the API. For more information about frequently asked questions,
   * see [FAQ](https://cloud.ibm.com/docs/schematics?topic=schematics-faqs-agent) and [Troubleshooting
   * guide](https://cloud.ibm.com/docs/schematics?topic=schematics-agent-crn-not-found).
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param deletePolicyOptions the {@link DeletePolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePolicy(DeletePolicyOptions deletePolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deletePolicyOptions,
      "deletePolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_id", deletePolicyOptions.policyId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/policies/{policy_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "deletePolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update policy.
   *
   * Use update policy API to update or replace the policy details by using policy ID. For more information about
   * supported API endpoints, see [API endpoint](https://cloud.ibm.com/apidocs/schematics/schematics#api-endpoints).
   * Follow the [steps](https://cloud.ibm.com/docs/schematics?topic=schematics-setup-api#cs_api) to retrieve your IAM
   * access token and authenticate with IBM Cloud Schematics by using the API. For more information about frequently
   * asked questions, see [FAQ](https://cloud.ibm.com/docs/schematics?topic=schematics-faqs-agent) and [Troubleshooting
   * guide](https://cloud.ibm.com/docs/schematics?topic=schematics-agent-crn-not-found).
   *
   *
   *    &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *    Schematics support generic authorization for its resources.
   *    For more information, about Schematics access and permissions, see [Schematics service access
   *    roles and required permissions](https://cloud.ibm.com/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param updatePolicyOptions the {@link UpdatePolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Policy}
   */
  public ServiceCall<Policy> updatePolicy(UpdatePolicyOptions updatePolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updatePolicyOptions,
      "updatePolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_id", updatePolicyOptions.policyId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/policies/{policy_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics", "v1", "updatePolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    final JsonObject contentJson = new JsonObject();
    if (updatePolicyOptions.name() != null) {
      contentJson.addProperty("name", updatePolicyOptions.name());
    }
    if (updatePolicyOptions.description() != null) {
      contentJson.addProperty("description", updatePolicyOptions.description());
    }
    if (updatePolicyOptions.resourceGroup() != null) {
      contentJson.addProperty("resource_group", updatePolicyOptions.resourceGroup());
    }
    if (updatePolicyOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updatePolicyOptions.tags()));
    }
    if (updatePolicyOptions.location() != null) {
      contentJson.addProperty("location", updatePolicyOptions.location());
    }
    if (updatePolicyOptions.state() != null) {
      contentJson.add("state", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updatePolicyOptions.state()));
    }
    if (updatePolicyOptions.kind() != null) {
      contentJson.addProperty("kind", updatePolicyOptions.kind());
    }
    if (updatePolicyOptions.target() != null) {
      contentJson.add("target", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updatePolicyOptions.target()));
    }
    if (updatePolicyOptions.parameter() != null) {
      contentJson.add("parameter", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updatePolicyOptions.parameter()));
    }
    if (updatePolicyOptions.scopedResources() != null) {
      contentJson.add("scoped_resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updatePolicyOptions.scopedResources()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Policy> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Policy>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
