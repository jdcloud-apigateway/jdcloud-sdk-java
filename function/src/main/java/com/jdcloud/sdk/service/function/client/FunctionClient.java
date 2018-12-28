/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 京东云function接口
 * function相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.function.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.function.model.ListFunctionRequest;
import com.jdcloud.sdk.service.function.model.ListFunctionResponse;
import com.jdcloud.sdk.service.function.client.ListFunctionExecutor;
import com.jdcloud.sdk.service.function.model.ListTriggerRequest;
import com.jdcloud.sdk.service.function.model.ListTriggerResponse;
import com.jdcloud.sdk.service.function.client.ListTriggerExecutor;
import com.jdcloud.sdk.service.function.model.DeleteVersionRequest;
import com.jdcloud.sdk.service.function.model.DeleteVersionResponse;
import com.jdcloud.sdk.service.function.client.DeleteVersionExecutor;
import com.jdcloud.sdk.service.function.model.GetVersionRequest;
import com.jdcloud.sdk.service.function.model.GetVersionResponse;
import com.jdcloud.sdk.service.function.client.GetVersionExecutor;
import com.jdcloud.sdk.service.function.model.DeleteAliasRequest;
import com.jdcloud.sdk.service.function.model.DeleteAliasResponse;
import com.jdcloud.sdk.service.function.client.DeleteAliasExecutor;
import com.jdcloud.sdk.service.function.model.ListVersionRequest;
import com.jdcloud.sdk.service.function.model.ListVersionResponse;
import com.jdcloud.sdk.service.function.client.ListVersionExecutor;
import com.jdcloud.sdk.service.function.model.GetFunctionRequest;
import com.jdcloud.sdk.service.function.model.GetFunctionResponse;
import com.jdcloud.sdk.service.function.client.GetFunctionExecutor;
import com.jdcloud.sdk.service.function.model.CreateFunctionRequest;
import com.jdcloud.sdk.service.function.model.CreateFunctionResponse;
import com.jdcloud.sdk.service.function.client.CreateFunctionExecutor;
import com.jdcloud.sdk.service.function.model.UpdateAliasRequest;
import com.jdcloud.sdk.service.function.model.UpdateAliasResponse;
import com.jdcloud.sdk.service.function.client.UpdateAliasExecutor;
import com.jdcloud.sdk.service.function.model.GetAliasRequest;
import com.jdcloud.sdk.service.function.model.GetAliasResponse;
import com.jdcloud.sdk.service.function.client.GetAliasExecutor;
import com.jdcloud.sdk.service.function.model.DeleteFunctionRequest;
import com.jdcloud.sdk.service.function.model.DeleteFunctionResponse;
import com.jdcloud.sdk.service.function.client.DeleteFunctionExecutor;
import com.jdcloud.sdk.service.function.model.CreateVersionRequest;
import com.jdcloud.sdk.service.function.model.CreateVersionResponse;
import com.jdcloud.sdk.service.function.client.CreateVersionExecutor;
import com.jdcloud.sdk.service.function.model.CreateAliasRequest;
import com.jdcloud.sdk.service.function.model.CreateAliasResponse;
import com.jdcloud.sdk.service.function.client.CreateAliasExecutor;
import com.jdcloud.sdk.service.function.model.GetTriggerRequest;
import com.jdcloud.sdk.service.function.model.GetTriggerResponse;
import com.jdcloud.sdk.service.function.client.GetTriggerExecutor;
import com.jdcloud.sdk.service.function.model.UpdateFunctionRequest;
import com.jdcloud.sdk.service.function.model.UpdateFunctionResponse;
import com.jdcloud.sdk.service.function.client.UpdateFunctionExecutor;
import com.jdcloud.sdk.service.function.model.TestInvokeRequest;
import com.jdcloud.sdk.service.function.model.TestInvokeResponse;
import com.jdcloud.sdk.service.function.client.TestInvokeExecutor;
import com.jdcloud.sdk.service.function.model.ListAliasRequest;
import com.jdcloud.sdk.service.function.model.ListAliasResponse;
import com.jdcloud.sdk.service.function.client.ListAliasExecutor;

/**
 * functionClient
 */
public class FunctionClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.8";
    public final static String DefaultEndpoint = "function.jdcloud-api.com";
    public final static String ServiceName = "function";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private FunctionClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询函数列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListFunctionResponse listFunction(ListFunctionRequest request) throws JdcloudSdkException {
        return new ListFunctionExecutor().client(this).execute(request);
    }

    /**
     * 查询触发器列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListTriggerResponse listTrigger(ListTriggerRequest request) throws JdcloudSdkException {
        return new ListTriggerExecutor().client(this).execute(request);
    }

    /**
     * 删除版本
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVersionResponse deleteVersion(DeleteVersionRequest request) throws JdcloudSdkException {
        return new DeleteVersionExecutor().client(this).execute(request);
    }

    /**
     * 获取版本详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVersionResponse getVersion(GetVersionRequest request) throws JdcloudSdkException {
        return new GetVersionExecutor().client(this).execute(request);
    }

    /**
     * 删除别名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteAliasResponse deleteAlias(DeleteAliasRequest request) throws JdcloudSdkException {
        return new DeleteAliasExecutor().client(this).execute(request);
    }

    /**
     * 查询版本列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListVersionResponse listVersion(ListVersionRequest request) throws JdcloudSdkException {
        return new ListVersionExecutor().client(this).execute(request);
    }

    /**
     * 查询函数详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetFunctionResponse getFunction(GetFunctionRequest request) throws JdcloudSdkException {
        return new GetFunctionExecutor().client(this).execute(request);
    }

    /**
     * 创建函数
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateFunctionResponse createFunction(CreateFunctionRequest request) throws JdcloudSdkException {
        return new CreateFunctionExecutor().client(this).execute(request);
    }

    /**
     * 更新别名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateAliasResponse updateAlias(UpdateAliasRequest request) throws JdcloudSdkException {
        return new UpdateAliasExecutor().client(this).execute(request);
    }

    /**
     * 查询别名详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetAliasResponse getAlias(GetAliasRequest request) throws JdcloudSdkException {
        return new GetAliasExecutor().client(this).execute(request);
    }

    /**
     * 删除函数
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteFunctionResponse deleteFunction(DeleteFunctionRequest request) throws JdcloudSdkException {
        return new DeleteFunctionExecutor().client(this).execute(request);
    }

    /**
     * 创建版本
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVersionResponse createVersion(CreateVersionRequest request) throws JdcloudSdkException {
        return new CreateVersionExecutor().client(this).execute(request);
    }

    /**
     * 创建别名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateAliasResponse createAlias(CreateAliasRequest request) throws JdcloudSdkException {
        return new CreateAliasExecutor().client(this).execute(request);
    }

    /**
     * 获取触发器详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetTriggerResponse getTrigger(GetTriggerRequest request) throws JdcloudSdkException {
        return new GetTriggerExecutor().client(this).execute(request);
    }

    /**
     * 更新函数
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateFunctionResponse updateFunction(UpdateFunctionRequest request) throws JdcloudSdkException {
        return new UpdateFunctionExecutor().client(this).execute(request);
    }

    /**
     * 控制台测试执行函数
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public TestInvokeResponse testInvoke(TestInvokeRequest request) throws JdcloudSdkException {
        return new TestInvokeExecutor().client(this).execute(request);
    }

    /**
     * 查询别名列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ListAliasResponse listAlias(ListAliasRequest request) throws JdcloudSdkException {
        return new ListAliasExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public FunctionClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private FunctionClient functionClient;

        public DefaultBuilder() {
            functionClient = new FunctionClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            functionClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            functionClient.httpRequestConfig = config;
            return this;
        }

        public FunctionClient build() throws JdcloudSdkException {

            if (functionClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                functionClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (functionClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("FunctionClient build error: jdcloud credentials provider not set");
                }
            }
            if (functionClient.httpRequestConfig == null) {
                functionClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (functionClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("FunctionClient build error: http request config not set");
                }
            }
            return functionClient;
        }

        public Builder environment(Environment environment) {
            functionClient.environment = environment;
            return this;
        }
    }
}
