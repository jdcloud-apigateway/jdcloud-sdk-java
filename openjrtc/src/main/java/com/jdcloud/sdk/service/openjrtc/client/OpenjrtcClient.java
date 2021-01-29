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
 * JRTC
 * 低延迟音视频通信服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.openjrtc.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomsRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomsResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeRoomsExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomInfoRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomInfoResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeRoomInfoExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeAppKeyRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeAppKeyResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeAppKeyExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeAppRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeAppResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeAppExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomOnlineUserNumRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomOnlineUserNumResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeRoomOnlineUserNumExecutor;
import com.jdcloud.sdk.service.openjrtc.model.UpdateRoomRequest;
import com.jdcloud.sdk.service.openjrtc.model.UpdateRoomResponse;
import com.jdcloud.sdk.service.openjrtc.client.UpdateRoomExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeAppsRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeAppsResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeAppsExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DeleteRoomRequest;
import com.jdcloud.sdk.service.openjrtc.model.DeleteRoomResponse;
import com.jdcloud.sdk.service.openjrtc.client.DeleteRoomExecutor;
import com.jdcloud.sdk.service.openjrtc.model.CreateRoomRequest;
import com.jdcloud.sdk.service.openjrtc.model.CreateRoomResponse;
import com.jdcloud.sdk.service.openjrtc.client.CreateRoomExecutor;
import com.jdcloud.sdk.service.openjrtc.model.CreateUserRequest;
import com.jdcloud.sdk.service.openjrtc.model.CreateUserResponse;
import com.jdcloud.sdk.service.openjrtc.client.CreateUserExecutor;

/**
 * openjrtcClient
 */
public class OpenjrtcClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.3";
    public final static String DefaultEndpoint = "openjrtc.jdcloud-api.com";
    public final static String ServiceName = "openjrtc";
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

    private OpenjrtcClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询应用下的房间列表
允许通过条件过滤查询，支持的过滤字段如下：
           - appId[eq] 按应用ID查询

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRoomsResponse describeRooms(DescribeRoomsRequest request) throws JdcloudSdkException {
        return new DescribeRoomsExecutor().client(this).execute(request);
    }

    /**
     * 获取房间信息

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRoomInfoResponse describeRoomInfo(DescribeRoomInfoRequest request) throws JdcloudSdkException {
        return new DescribeRoomInfoExecutor().client(this).execute(request);
    }

    /**
     * 查询应用appKey

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAppKeyResponse describeAppKey(DescribeAppKeyRequest request) throws JdcloudSdkException {
        return new DescribeAppKeyExecutor().client(this).execute(request);
    }

    /**
     * 查询应用信息:

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAppResponse describeApp(DescribeAppRequest request) throws JdcloudSdkException {
        return new DescribeAppExecutor().client(this).execute(request);
    }

    /**
     * 查询房间实时在线人数

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRoomOnlineUserNumResponse describeRoomOnlineUserNum(DescribeRoomOnlineUserNumRequest request) throws JdcloudSdkException {
        return new DescribeRoomOnlineUserNumExecutor().client(this).execute(request);
    }

    /**
     * 修改房间

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateRoomResponse updateRoom(UpdateRoomRequest request) throws JdcloudSdkException {
        return new UpdateRoomExecutor().client(this).execute(request);
    }

    /**
     * 查询用户应用列表信息

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAppsResponse describeApps(DescribeAppsRequest request) throws JdcloudSdkException {
        return new DescribeAppsExecutor().client(this).execute(request);
    }

    /**
     * 删除房间

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteRoomResponse deleteRoom(DeleteRoomRequest request) throws JdcloudSdkException {
        return new DeleteRoomExecutor().client(this).execute(request);
    }

    /**
     * 创建房间

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateRoomResponse createRoom(CreateRoomRequest request) throws JdcloudSdkException {
        return new CreateRoomExecutor().client(this).execute(request);
    }

    /**
     * 创建用户

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws JdcloudSdkException {
        return new CreateUserExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public OpenjrtcClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private OpenjrtcClient openjrtcClient;

        public DefaultBuilder() {
            openjrtcClient = new OpenjrtcClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            openjrtcClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            openjrtcClient.httpRequestConfig = config;
            return this;
        }

        public OpenjrtcClient build() throws JdcloudSdkException {

            if (openjrtcClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                openjrtcClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (openjrtcClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("OpenjrtcClient build error: jdcloud credentials provider not set");
                }
            }
            if (openjrtcClient.httpRequestConfig == null) {
                openjrtcClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (openjrtcClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("OpenjrtcClient build error: http request config not set");
                }
            }
            return openjrtcClient;
        }

        public Builder environment(Environment environment) {
            openjrtcClient.environment = environment;
            return this;
        }
    }
}
