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
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomUsersRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomUsersResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeRoomUsersExecutor;
import com.jdcloud.sdk.service.openjrtc.model.StartAsrTaskRequest;
import com.jdcloud.sdk.service.openjrtc.model.StartAsrTaskResponse;
import com.jdcloud.sdk.service.openjrtc.client.StartAsrTaskExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeStreamInfosByUserIdRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeStreamInfosByUserIdResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeStreamInfosByUserIdExecutor;
import com.jdcloud.sdk.service.openjrtc.model.StartMcuTranscodeRequest;
import com.jdcloud.sdk.service.openjrtc.model.StartMcuTranscodeResponse;
import com.jdcloud.sdk.service.openjrtc.client.StartMcuTranscodeExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomUsersNumRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomUsersNumResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeRoomUsersNumExecutor;
import com.jdcloud.sdk.service.openjrtc.model.CreateRoomRequest;
import com.jdcloud.sdk.service.openjrtc.model.CreateRoomResponse;
import com.jdcloud.sdk.service.openjrtc.client.CreateRoomExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRegisterUserRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRegisterUserResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeRegisterUserExecutor;
import com.jdcloud.sdk.service.openjrtc.model.UpdateUserRoomRequest;
import com.jdcloud.sdk.service.openjrtc.model.UpdateUserRoomResponse;
import com.jdcloud.sdk.service.openjrtc.client.UpdateUserRoomExecutor;
import com.jdcloud.sdk.service.openjrtc.model.AddRecordRuleRequest;
import com.jdcloud.sdk.service.openjrtc.model.AddRecordRuleResponse;
import com.jdcloud.sdk.service.openjrtc.client.AddRecordRuleExecutor;
import com.jdcloud.sdk.service.openjrtc.model.StopAsrTaskRequest;
import com.jdcloud.sdk.service.openjrtc.model.StopAsrTaskResponse;
import com.jdcloud.sdk.service.openjrtc.client.StopAsrTaskExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeUserRecordByRoomRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeUserRecordByRoomResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeUserRecordByRoomExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeUserRoomsRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeUserRoomsResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeUserRoomsExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeAppKeyRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeAppKeyResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeAppKeyExecutor;
import com.jdcloud.sdk.service.openjrtc.model.SendMessageToUserRequest;
import com.jdcloud.sdk.service.openjrtc.model.SendMessageToUserResponse;
import com.jdcloud.sdk.service.openjrtc.client.SendMessageToUserExecutor;
import com.jdcloud.sdk.service.openjrtc.model.UpdateRoomRequest;
import com.jdcloud.sdk.service.openjrtc.model.UpdateRoomResponse;
import com.jdcloud.sdk.service.openjrtc.client.UpdateRoomExecutor;
import com.jdcloud.sdk.service.openjrtc.model.CreateTokenRequest;
import com.jdcloud.sdk.service.openjrtc.model.CreateTokenResponse;
import com.jdcloud.sdk.service.openjrtc.client.CreateTokenExecutor;
import com.jdcloud.sdk.service.openjrtc.model.RegisterUserRoomRequest;
import com.jdcloud.sdk.service.openjrtc.model.RegisterUserRoomResponse;
import com.jdcloud.sdk.service.openjrtc.client.RegisterUserRoomExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeCallDurationByCodeRateRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeCallDurationByCodeRateResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeCallDurationByCodeRateExecutor;
import com.jdcloud.sdk.service.openjrtc.model.RegisterUserRequest;
import com.jdcloud.sdk.service.openjrtc.model.RegisterUserResponse;
import com.jdcloud.sdk.service.openjrtc.client.RegisterUserExecutor;
import com.jdcloud.sdk.service.openjrtc.model.CloseRoomUserStreamRequest;
import com.jdcloud.sdk.service.openjrtc.model.CloseRoomUserStreamResponse;
import com.jdcloud.sdk.service.openjrtc.client.CloseRoomUserStreamExecutor;
import com.jdcloud.sdk.service.openjrtc.model.SendMessageToRoomRequest;
import com.jdcloud.sdk.service.openjrtc.model.SendMessageToRoomResponse;
import com.jdcloud.sdk.service.openjrtc.client.SendMessageToRoomExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeUserByPeerRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeUserByPeerResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeUserByPeerExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomOnlineUserNumRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomOnlineUserNumResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeRoomOnlineUserNumExecutor;
import com.jdcloud.sdk.service.openjrtc.model.StopMcuTranscodeRequest;
import com.jdcloud.sdk.service.openjrtc.model.StopMcuTranscodeResponse;
import com.jdcloud.sdk.service.openjrtc.client.StopMcuTranscodeExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomUserRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomUserResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeRoomUserExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeStreamInfoByStreamIdRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeStreamInfoByStreamIdResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeStreamInfoByStreamIdExecutor;
import com.jdcloud.sdk.service.openjrtc.model.PostMessageToUserRequest;
import com.jdcloud.sdk.service.openjrtc.model.PostMessageToUserResponse;
import com.jdcloud.sdk.service.openjrtc.client.PostMessageToUserExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeStreamInfosByUserRoomIdRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeStreamInfosByUserRoomIdResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeStreamInfosByUserRoomIdExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeAppsRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeAppsResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeAppsExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DeleteRoomRequest;
import com.jdcloud.sdk.service.openjrtc.model.DeleteRoomResponse;
import com.jdcloud.sdk.service.openjrtc.client.DeleteRoomExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRegisterUsersRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRegisterUsersResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeRegisterUsersExecutor;
import com.jdcloud.sdk.service.openjrtc.model.PostMessageToUserRoomRequest;
import com.jdcloud.sdk.service.openjrtc.model.PostMessageToUserRoomResponse;
import com.jdcloud.sdk.service.openjrtc.client.PostMessageToUserRoomExecutor;
import com.jdcloud.sdk.service.openjrtc.model.RemoveAllUsersByUserRoomIdRequest;
import com.jdcloud.sdk.service.openjrtc.model.RemoveAllUsersByUserRoomIdResponse;
import com.jdcloud.sdk.service.openjrtc.client.RemoveAllUsersByUserRoomIdExecutor;
import com.jdcloud.sdk.service.openjrtc.model.RemoveRoomUserRequest;
import com.jdcloud.sdk.service.openjrtc.model.RemoveRoomUserResponse;
import com.jdcloud.sdk.service.openjrtc.client.RemoveRoomUserExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeStreamRecordsByStreamIdRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeStreamRecordsByStreamIdResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeStreamRecordsByStreamIdExecutor;
import com.jdcloud.sdk.service.openjrtc.model.RemoveUserByUserRoomIdRequest;
import com.jdcloud.sdk.service.openjrtc.model.RemoveUserByUserRoomIdResponse;
import com.jdcloud.sdk.service.openjrtc.client.RemoveUserByUserRoomIdExecutor;
import com.jdcloud.sdk.service.openjrtc.model.AddPushStreamRuleRequest;
import com.jdcloud.sdk.service.openjrtc.model.AddPushStreamRuleResponse;
import com.jdcloud.sdk.service.openjrtc.client.AddPushStreamRuleExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeOnlineUserNumRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeOnlineUserNumResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeOnlineUserNumExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomInfoRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeRoomInfoResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeRoomInfoExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeAppRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeAppResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeAppExecutor;
import com.jdcloud.sdk.service.openjrtc.model.RemoveAllRoomUsersRequest;
import com.jdcloud.sdk.service.openjrtc.model.RemoveAllRoomUsersResponse;
import com.jdcloud.sdk.service.openjrtc.client.RemoveAllRoomUsersExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeUserRoomRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeUserRoomResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeUserRoomExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeStreamRecordsByUserIdRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeStreamRecordsByUserIdResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeStreamRecordsByUserIdExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeDailyCallDurationRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeDailyCallDurationResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeDailyCallDurationExecutor;
import com.jdcloud.sdk.service.openjrtc.model.CreateUserRequest;
import com.jdcloud.sdk.service.openjrtc.model.CreateUserResponse;
import com.jdcloud.sdk.service.openjrtc.client.CreateUserExecutor;
import com.jdcloud.sdk.service.openjrtc.model.DescribeP2pStreamBitRateRequest;
import com.jdcloud.sdk.service.openjrtc.model.DescribeP2pStreamBitRateResponse;
import com.jdcloud.sdk.service.openjrtc.client.DescribeP2pStreamBitRateExecutor;

/**
 * openjrtcClient
 */
public class OpenjrtcClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.11";
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
     * 查询房间内人员列表
允许通过条件过滤查询，支持的过滤字段如下：
           - status[eq] 在线状态 1-在线 2-离线
           - startTime[eq] 用户加入时间段开始时间-UTC时间  startTime,endTime同时有值时生效
           - endTime[eq] 用户加入时间段结束时间-UTC时间    startTime,endTime同时有值时生效

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRoomUsersResponse describeRoomUsers(DescribeRoomUsersRequest request) throws JdcloudSdkException {
        return new DescribeRoomUsersExecutor().client(this).execute(request);
    }

    /**
     * 开启语音识别功能

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StartAsrTaskResponse startAsrTask(StartAsrTaskRequest request) throws JdcloudSdkException {
        return new StartAsrTaskExecutor().client(this).execute(request);
    }

    /**
     * 查询指定用户在房间内的推流信息

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeStreamInfosByUserIdResponse describeStreamInfosByUserId(DescribeStreamInfosByUserIdRequest request) throws JdcloudSdkException {
        return new DescribeStreamInfosByUserIdExecutor().client(this).execute(request);
    }

    /**
     * 下发混流任务

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StartMcuTranscodeResponse startMcuTranscode(StartMcuTranscodeRequest request) throws JdcloudSdkException {
        return new StartMcuTranscodeExecutor().client(this).execute(request);
    }

    /**
     * 统计房间内人数

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRoomUsersNumResponse describeRoomUsersNum(DescribeRoomUsersNumRequest request) throws JdcloudSdkException {
        return new DescribeRoomUsersNumExecutor().client(this).execute(request);
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
     * 查询注册用户

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRegisterUserResponse describeRegisterUser(DescribeRegisterUserRequest request) throws JdcloudSdkException {
        return new DescribeRegisterUserExecutor().client(this).execute(request);
    }

    /**
     * 修改房间

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateUserRoomResponse updateUserRoom(UpdateUserRoomRequest request) throws JdcloudSdkException {
        return new UpdateUserRoomExecutor().client(this).execute(request);
    }

    /**
     * 添加录制规则

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddRecordRuleResponse addRecordRule(AddRecordRuleRequest request) throws JdcloudSdkException {
        return new AddRecordRuleExecutor().client(this).execute(request);
    }

    /**
     * 关闭语音识别功能

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StopAsrTaskResponse stopAsrTask(StopAsrTaskRequest request) throws JdcloudSdkException {
        return new StopAsrTaskExecutor().client(this).execute(request);
    }

    /**
     * 查询房间用户记录,最大支持查询7天的数据
允许通过条件过滤查询，支持的过滤字段如下：
           - appId[eq] 按应用ID精确查询 (必填)
           - startTime[eq] 开始时间 UTC格式 (必填)
           - endTime[eq] 截止时间 UTC格式 (必填)
           - userRoomId[eq] 按房间ID精确查询(必填)
           - userId[eq] 按用户ID精确查询

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeUserRecordByRoomResponse describeUserRecordByRoom(DescribeUserRecordByRoomRequest request) throws JdcloudSdkException {
        return new DescribeUserRecordByRoomExecutor().client(this).execute(request);
    }

    /**
     * 查询注册房间号列表
允许通过条件过滤查询，支持的过滤字段如下：
           - startTime[eq] 房间注册时间段开始时间-UTC时间 startTime,endTime同时有值时生效
           - endTime[eq] 房间注册时间段结束时间-UTC时间   startTime,endTime同时有值时生效

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeUserRoomsResponse describeUserRooms(DescribeUserRoomsRequest request) throws JdcloudSdkException {
        return new DescribeUserRoomsExecutor().client(this).execute(request);
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
     * 发送自定义信令给房间内的人员
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SendMessageToUserResponse sendMessageToUser(SendMessageToUserRequest request) throws JdcloudSdkException {
        return new SendMessageToUserExecutor().client(this).execute(request);
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
     * 生成token-用户加入房间时携带token校验通过后方能加入

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateTokenResponse createToken(CreateTokenRequest request) throws JdcloudSdkException {
        return new CreateTokenExecutor().client(this).execute(request);
    }

    /**
     * 注册用户房间号-将业务接入方定义的userRoomId注册为jrtc系统内可识别和流转的房间号

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RegisterUserRoomResponse registerUserRoom(RegisterUserRoomRequest request) throws JdcloudSdkException {
        return new RegisterUserRoomExecutor().client(this).execute(request);
    }

    /**
     * 获取历史音频、区分视频码率通讯时长(分钟)

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCallDurationByCodeRateResponse describeCallDurationByCodeRate(DescribeCallDurationByCodeRateRequest request) throws JdcloudSdkException {
        return new DescribeCallDurationByCodeRateExecutor().client(this).execute(request);
    }

    /**
     * 注册用户-将业务接入方用户体系的userId注册为jrtc系统内可识别和流转的用户id

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RegisterUserResponse registerUser(RegisterUserRequest request) throws JdcloudSdkException {
        return new RegisterUserExecutor().client(this).execute(request);
    }

    /**
     * 关闭房间内的指定流

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CloseRoomUserStreamResponse closeRoomUserStream(CloseRoomUserStreamRequest request) throws JdcloudSdkException {
        return new CloseRoomUserStreamExecutor().client(this).execute(request);
    }

    /**
     * 发送自定义信令给房间
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SendMessageToRoomResponse sendMessageToRoom(SendMessageToRoomRequest request) throws JdcloudSdkException {
        return new SendMessageToRoomExecutor().client(this).execute(request);
    }

    /**
     * 查询peer对应的用户信息

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeUserByPeerResponse describeUserByPeer(DescribeUserByPeerRequest request) throws JdcloudSdkException {
        return new DescribeUserByPeerExecutor().client(this).execute(request);
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
     * 中止混流任务

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StopMcuTranscodeResponse stopMcuTranscode(StopMcuTranscodeRequest request) throws JdcloudSdkException {
        return new StopMcuTranscodeExecutor().client(this).execute(request);
    }

    /**
     * 查询房间内的人员信息

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRoomUserResponse describeRoomUser(DescribeRoomUserRequest request) throws JdcloudSdkException {
        return new DescribeRoomUserExecutor().client(this).execute(request);
    }

    /**
     * 根据流ID查询推流信息

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeStreamInfoByStreamIdResponse describeStreamInfoByStreamId(DescribeStreamInfoByStreamIdRequest request) throws JdcloudSdkException {
        return new DescribeStreamInfoByStreamIdExecutor().client(this).execute(request);
    }

    /**
     * 发送自定义信令给房间内的人员
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public PostMessageToUserResponse postMessageToUser(PostMessageToUserRequest request) throws JdcloudSdkException {
        return new PostMessageToUserExecutor().client(this).execute(request);
    }

    /**
     * 查询房间内推流信息列表
允许通过条件过滤查询，支持的过滤字段如下：
           - status[eq] 在线状态 1-在线 2-离线
           - kind[eq] 在线状态 1-音频流 2-视频流 100-数据流
           - deviceType[eq]  推流设备类型 kind&#x3D;1时,取值: 1-默认音频 2-蓝牙 3-手机音频 4-文件音频; kind&#x3D;2时,取值: 1-前置摄像头 2-后置摄像头 3-屏幕共享 4-文件视频;
           - userIds[eq] 业务接入方用户体系定义的且在JRTC系统内注册过的userId,userId个数上限为50
           - startTime[eq] 用户推流开始时间-UTC时间  startTime,endTime同时指定时生效
           - endTime[eq]   用户推流结束时间-UTC时间  startTime,endTime同时指定时生效

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeStreamInfosByUserRoomIdResponse describeStreamInfosByUserRoomId(DescribeStreamInfosByUserRoomIdRequest request) throws JdcloudSdkException {
        return new DescribeStreamInfosByUserRoomIdExecutor().client(this).execute(request);
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
     * 查询注册用户列表
允许通过条件过滤查询，支持的过滤字段如下：
           - startTime[eq] 用户注册时间段开始时间-UTC时间 startTime,endTime同时有值时生效
           - endTime[eq] 用户注册时间段结束时间-UTC时间 startTime,endTime同时有值时生效

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRegisterUsersResponse describeRegisterUsers(DescribeRegisterUsersRequest request) throws JdcloudSdkException {
        return new DescribeRegisterUsersExecutor().client(this).execute(request);
    }

    /**
     * 发送自定义信令给房间
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public PostMessageToUserRoomResponse postMessageToUserRoom(PostMessageToUserRoomRequest request) throws JdcloudSdkException {
        return new PostMessageToUserRoomExecutor().client(this).execute(request);
    }

    /**
     * 移除房间内所有人员

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RemoveAllUsersByUserRoomIdResponse removeAllUsersByUserRoomId(RemoveAllUsersByUserRoomIdRequest request) throws JdcloudSdkException {
        return new RemoveAllUsersByUserRoomIdExecutor().client(this).execute(request);
    }

    /**
     * 移除房间内人员

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RemoveRoomUserResponse removeRoomUser(RemoveRoomUserRequest request) throws JdcloudSdkException {
        return new RemoveRoomUserExecutor().client(this).execute(request);
    }

    /**
     * 根据流ID查询推流历史记录
允许通过条件过滤查询，支持的过滤字段如下：
           - startTime[eq] 用户推流开始时间-UTC时间  startTime,endTime同时指定时生效
           - endTime[eq]   用户推流结束时间-UTC时间  startTime,endTime同时指定时生效

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeStreamRecordsByStreamIdResponse describeStreamRecordsByStreamId(DescribeStreamRecordsByStreamIdRequest request) throws JdcloudSdkException {
        return new DescribeStreamRecordsByStreamIdExecutor().client(this).execute(request);
    }

    /**
     * 移除房间内人员

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RemoveUserByUserRoomIdResponse removeUserByUserRoomId(RemoveUserByUserRoomIdRequest request) throws JdcloudSdkException {
        return new RemoveUserByUserRoomIdExecutor().client(this).execute(request);
    }

    /**
     * 添加推流规则

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddPushStreamRuleResponse addPushStreamRule(AddPushStreamRuleRequest request) throws JdcloudSdkException {
        return new AddPushStreamRuleExecutor().client(this).execute(request);
    }

    /**
     * 查询房间人数，通讯时长，最大支持查询7天的数据
允许通过条件过滤查询，支持的过滤字段如下：
           - appId[eq] 按应用ID精确查询(必填)
           - userRoomId[eq] 按房间ID精确查询(必填)
           - startTime[eq] 开始时间 UTC格式(必填)
           - endTime[eq] 截止时间 UTC格式 (必填)

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeOnlineUserNumResponse describeOnlineUserNum(DescribeOnlineUserNumRequest request) throws JdcloudSdkException {
        return new DescribeOnlineUserNumExecutor().client(this).execute(request);
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
     * 移除房间内所有人员

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RemoveAllRoomUsersResponse removeAllRoomUsers(RemoveAllRoomUsersRequest request) throws JdcloudSdkException {
        return new RemoveAllRoomUsersExecutor().client(this).execute(request);
    }

    /**
     * 查询注册房间号

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeUserRoomResponse describeUserRoom(DescribeUserRoomRequest request) throws JdcloudSdkException {
        return new DescribeUserRoomExecutor().client(this).execute(request);
    }

    /**
     * 查询指定用户在房间内的推流历史记录
允许通过条件过滤查询，支持的过滤字段如下：
           - kind[eq] 在线状态 1-音频流 2-视频流 100-数据流
           - startTime[eq] 用户推流开始时间-UTC时间  startTime,endTime同时指定时生效
           - endTime[eq]   用户推流结束时间-UTC时间  startTime,endTime同时指定时生效

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeStreamRecordsByUserIdResponse describeStreamRecordsByUserId(DescribeStreamRecordsByUserIdRequest request) throws JdcloudSdkException {
        return new DescribeStreamRecordsByUserIdExecutor().client(this).execute(request);
    }

    /**
     * 获取近7天通讯时长

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDailyCallDurationResponse describeDailyCallDuration(DescribeDailyCallDurationRequest request) throws JdcloudSdkException {
        return new DescribeDailyCallDurationExecutor().client(this).execute(request);
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

    /**
     * 查询用户端到端推流码率

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeP2pStreamBitRateResponse describeP2pStreamBitRate(DescribeP2pStreamBitRateRequest request) throws JdcloudSdkException {
        return new DescribeP2pStreamBitRateExecutor().client(this).execute(request);
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
