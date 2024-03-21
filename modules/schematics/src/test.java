package com.ibm.cloud.schematics.v1;

import com.ibm.cloud.schematics.v1.model.*;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;


public class sampledatasktest {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        Schematics service = null;
        IamAuthenticator authenticator = new IamAuthenticator("kMWqK2fazcgow-err0H_2W6uXnOaEdp1PxJz_aZJQtkh");
        service = new Schematics(Schematics.DEFAULT_SERVICE_NAME, authenticator);
        service.setServiceUrl("https://schematics.cloud.ibm.com");
        GetActionOptions getActionOptions = new GetActionOptions.Builder()
        .actionId("f3889ba15869e3e999877c57db697ed4")
        .build();
        Response<Action> response = service.getAction(getActionOptions).execute();
        Action action = response.getResult();
        System.out.println(action);
    }
}
