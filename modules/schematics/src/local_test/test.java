package sdktesting;
import com.ibm.cloud.schematics.v1.Schematics;
import com.ibm.cloud.schematics.v1.model.WorkspaceBulkDeleteResponse;
//import com.ibm.cloud.schematics.v1.model.ExternalSource;
//import com.ibm.cloud.schematics.v1.model.ExternalSourceGit;
//import com.ibm.cloud.schematics.v1.model.ProcessTemplateMetaDataOptions;
//import com.ibm.cloud.schematics.v1.model.TemplateMetaDataResponse;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import java.util.List;
public final class test {
    public static void main(String[] args)throws Exception
      {
        Schematics service = null;
        IamAuthenticator authenticator = new IamAuthenticator("zOeEu5LbhtROPfwz7H6swWaM5CRy5CGAYpHASS28xqha");
        service = new Schematics(Schematics.DEFAULT_SERVICE_NAME, authenticator);
        service.setServiceUrl("https://schematics.cloud.ibm.com");
        System.out.println("Welcome");
    try {
        List list = new ArrayList();
        list.add("us-east.workspace.new-13-03.0e399db3");
        list.add(1,"us-east.workspace.s9s-07-03.d7b84193");
    CreateWorkspaceDeletionJobOptions createWorkspaceDeletionJobOptions = new CreateWorkspaceDeletionJobOptions.Builder()
        .newWorkspaces(list)
        .refreshToken("testString")
        .build();
      Response<WorkspaceBulkDeleteResponse> response = service.createWorkspaceDeletionJob(createWorkspaceDeletionJobOptions).execute();
      WorkspaceBulkDeleteResponse workspaceBulkDeleteResponse = response.getResult();
      System.out.println(workspaceBulkDeleteResponse);
      // end-create_workspace_deletion_job
    } catch (ServiceResponseException e) {
          System.out.println(e);
    }
    }
}
