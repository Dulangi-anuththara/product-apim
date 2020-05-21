/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store. It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1;

import org.wso2.am.integration.clients.store.api.ApiCallback;
import org.wso2.am.integration.clients.store.api.ApiClient;
import org.wso2.am.integration.clients.store.api.ApiException;
import org.wso2.am.integration.clients.store.api.ApiResponse;
import org.wso2.am.integration.clients.store.api.Configuration;
import org.wso2.am.integration.clients.store.api.Pair;
import org.wso2.am.integration.clients.store.api.ProgressRequestBody;
import org.wso2.am.integration.clients.store.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.wso2.am.integration.clients.store.api.v1.dto.ApplicationTokenDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.ApplicationTokenGenerateRequestDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.ErrorDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationTokensApi {
    private ApiClient apiClient;

    public ApplicationTokensApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationTokensApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for applicationsApplicationIdKeysKeyTypeGenerateTokenPost
     * @param applicationId Application Identifier consisting of the UUID of the Application.  (required)
     * @param keyType **Application Key Type** standing for the type of the keys (i.e. Production or Sandbox).  (required)
     * @param body Application token generation request object  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call applicationsApplicationIdKeysKeyTypeGenerateTokenPostCall(String applicationId, String keyType, ApplicationTokenGenerateRequestDTO body, String ifMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/applications/{applicationId}/keys/{keyType}/generate-token"
            .replaceAll("\\{" + "applicationId" + "\\}", apiClient.escapeString(applicationId.toString()))
            .replaceAll("\\{" + "keyType" + "\\}", apiClient.escapeString(keyType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifMatch != null)
        localVarHeaderParams.put("If-Match", apiClient.parameterToString(ifMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2Security" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call applicationsApplicationIdKeysKeyTypeGenerateTokenPostValidateBeforeCall(String applicationId, String keyType, ApplicationTokenGenerateRequestDTO body, String ifMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling applicationsApplicationIdKeysKeyTypeGenerateTokenPost(Async)");
        }
        
        // verify the required parameter 'keyType' is set
        if (keyType == null) {
            throw new ApiException("Missing the required parameter 'keyType' when calling applicationsApplicationIdKeysKeyTypeGenerateTokenPost(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling applicationsApplicationIdKeysKeyTypeGenerateTokenPost(Async)");
        }
        

        com.squareup.okhttp.Call call = applicationsApplicationIdKeysKeyTypeGenerateTokenPostCall(applicationId, keyType, body, ifMatch, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Generate application token
     * Generate an access token for application by client_credentials grant type 
     * @param applicationId Application Identifier consisting of the UUID of the Application.  (required)
     * @param keyType **Application Key Type** standing for the type of the keys (i.e. Production or Sandbox).  (required)
     * @param body Application token generation request object  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @return ApplicationTokenDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApplicationTokenDTO applicationsApplicationIdKeysKeyTypeGenerateTokenPost(String applicationId, String keyType, ApplicationTokenGenerateRequestDTO body, String ifMatch) throws ApiException {
        ApiResponse<ApplicationTokenDTO> resp = applicationsApplicationIdKeysKeyTypeGenerateTokenPostWithHttpInfo(applicationId, keyType, body, ifMatch);
        return resp.getData();
    }

    /**
     * Generate application token
     * Generate an access token for application by client_credentials grant type 
     * @param applicationId Application Identifier consisting of the UUID of the Application.  (required)
     * @param keyType **Application Key Type** standing for the type of the keys (i.e. Production or Sandbox).  (required)
     * @param body Application token generation request object  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @return ApiResponse&lt;ApplicationTokenDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApplicationTokenDTO> applicationsApplicationIdKeysKeyTypeGenerateTokenPostWithHttpInfo(String applicationId, String keyType, ApplicationTokenGenerateRequestDTO body, String ifMatch) throws ApiException {
        com.squareup.okhttp.Call call = applicationsApplicationIdKeysKeyTypeGenerateTokenPostValidateBeforeCall(applicationId, keyType, body, ifMatch, null, null);
        Type localVarReturnType = new TypeToken<ApplicationTokenDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate application token (asynchronously)
     * Generate an access token for application by client_credentials grant type 
     * @param applicationId Application Identifier consisting of the UUID of the Application.  (required)
     * @param keyType **Application Key Type** standing for the type of the keys (i.e. Production or Sandbox).  (required)
     * @param body Application token generation request object  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call applicationsApplicationIdKeysKeyTypeGenerateTokenPostAsync(String applicationId, String keyType, ApplicationTokenGenerateRequestDTO body, String ifMatch, final ApiCallback<ApplicationTokenDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = applicationsApplicationIdKeysKeyTypeGenerateTokenPostValidateBeforeCall(applicationId, keyType, body, ifMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApplicationTokenDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}