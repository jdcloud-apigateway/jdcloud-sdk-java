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
 * Live API
 * 视频直播相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.live.model.AddLiveStreamRecordNotifyConfigRequest;
import com.jdcloud.sdk.service.live.model.AddLiveStreamRecordNotifyConfigResponse;
import com.jdcloud.sdk.service.live.client.AddLiveStreamRecordNotifyConfigExecutor;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamSnapshotConfigRequest;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamSnapshotConfigResponse;
import com.jdcloud.sdk.service.live.client.DescribeCustomLiveStreamSnapshotConfigExecutor;
import com.jdcloud.sdk.service.live.model.AddLiveStreamDomainRecordRequest;
import com.jdcloud.sdk.service.live.model.AddLiveStreamDomainRecordResponse;
import com.jdcloud.sdk.service.live.client.AddLiveStreamDomainRecordExecutor;
import com.jdcloud.sdk.service.live.model.AddCustomLiveStreamRecordTemplateRequest;
import com.jdcloud.sdk.service.live.model.AddCustomLiveStreamRecordTemplateResponse;
import com.jdcloud.sdk.service.live.client.AddCustomLiveStreamRecordTemplateExecutor;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamRecordNotifyConfigRequest;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamRecordNotifyConfigResponse;
import com.jdcloud.sdk.service.live.client.DeleteLiveStreamRecordNotifyConfigExecutor;
import com.jdcloud.sdk.service.live.model.AddCustomLiveStreamSnapshotTemplateRequest;
import com.jdcloud.sdk.service.live.model.AddCustomLiveStreamSnapshotTemplateResponse;
import com.jdcloud.sdk.service.live.client.AddCustomLiveStreamSnapshotTemplateExecutor;
import com.jdcloud.sdk.service.live.model.AddLiveDomainRequest;
import com.jdcloud.sdk.service.live.model.AddLiveDomainResponse;
import com.jdcloud.sdk.service.live.client.AddLiveDomainExecutor;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamDomainTranscodeRequest;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamDomainTranscodeResponse;
import com.jdcloud.sdk.service.live.client.DeleteLiveStreamDomainTranscodeExecutor;
import com.jdcloud.sdk.service.live.model.DescribeLiveStreamRecordNotifyConfigRequest;
import com.jdcloud.sdk.service.live.model.DescribeLiveStreamRecordNotifyConfigResponse;
import com.jdcloud.sdk.service.live.client.DescribeLiveStreamRecordNotifyConfigExecutor;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamTranscodesRequest;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamTranscodesResponse;
import com.jdcloud.sdk.service.live.client.DescribeCustomLiveStreamTranscodesExecutor;
import com.jdcloud.sdk.service.live.model.DescribeLiveStreamTranscodeConfigRequest;
import com.jdcloud.sdk.service.live.model.DescribeLiveStreamTranscodeConfigResponse;
import com.jdcloud.sdk.service.live.client.DescribeLiveStreamTranscodeConfigExecutor;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamTranscodeRequest;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamTranscodeResponse;
import com.jdcloud.sdk.service.live.client.DescribeCustomLiveStreamTranscodeExecutor;
import com.jdcloud.sdk.service.live.model.AddLiveStreamAppTranscodeRequest;
import com.jdcloud.sdk.service.live.model.AddLiveStreamAppTranscodeResponse;
import com.jdcloud.sdk.service.live.client.AddLiveStreamAppTranscodeExecutor;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamDomainSnapshotRequest;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamDomainSnapshotResponse;
import com.jdcloud.sdk.service.live.client.DeleteLiveStreamDomainSnapshotExecutor;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamSnapshotNotifyConfigRequest;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamSnapshotNotifyConfigResponse;
import com.jdcloud.sdk.service.live.client.DeleteLiveStreamSnapshotNotifyConfigExecutor;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamWatermarkConfigRequest;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamWatermarkConfigResponse;
import com.jdcloud.sdk.service.live.client.DescribeCustomLiveStreamWatermarkConfigExecutor;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamWatermarkTemplatesRequest;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamWatermarkTemplatesResponse;
import com.jdcloud.sdk.service.live.client.DescribeCustomLiveStreamWatermarkTemplatesExecutor;
import com.jdcloud.sdk.service.live.model.AddLiveStreamAppSnapshotRequest;
import com.jdcloud.sdk.service.live.model.AddLiveStreamAppSnapshotResponse;
import com.jdcloud.sdk.service.live.client.AddLiveStreamAppSnapshotExecutor;
import com.jdcloud.sdk.service.live.model.DeleteCustomLiveStreamRecordTemplateRequest;
import com.jdcloud.sdk.service.live.model.DeleteCustomLiveStreamRecordTemplateResponse;
import com.jdcloud.sdk.service.live.client.DeleteCustomLiveStreamRecordTemplateExecutor;
import com.jdcloud.sdk.service.live.model.StartLiveDomainRequest;
import com.jdcloud.sdk.service.live.model.StartLiveDomainResponse;
import com.jdcloud.sdk.service.live.client.StartLiveDomainExecutor;
import com.jdcloud.sdk.service.live.model.AddLiveStreamAppRecordRequest;
import com.jdcloud.sdk.service.live.model.AddLiveStreamAppRecordResponse;
import com.jdcloud.sdk.service.live.client.AddLiveStreamAppRecordExecutor;
import com.jdcloud.sdk.service.live.model.DeleteLiveAppRequest;
import com.jdcloud.sdk.service.live.model.DeleteLiveAppResponse;
import com.jdcloud.sdk.service.live.client.DeleteLiveAppExecutor;
import com.jdcloud.sdk.service.live.model.AddLiveStreamDomainTranscodeRequest;
import com.jdcloud.sdk.service.live.model.AddLiveStreamDomainTranscodeResponse;
import com.jdcloud.sdk.service.live.client.AddLiveStreamDomainTranscodeExecutor;
import com.jdcloud.sdk.service.live.model.DescribeLiveDomainDetailRequest;
import com.jdcloud.sdk.service.live.model.DescribeLiveDomainDetailResponse;
import com.jdcloud.sdk.service.live.client.DescribeLiveDomainDetailExecutor;
import com.jdcloud.sdk.service.live.model.DeleteCustomLiveStreamTranscodeRequest;
import com.jdcloud.sdk.service.live.model.DeleteCustomLiveStreamTranscodeResponse;
import com.jdcloud.sdk.service.live.client.DeleteCustomLiveStreamTranscodeExecutor;
import com.jdcloud.sdk.service.live.model.DescribeLiveStreamSnapshotNotifyConfigRequest;
import com.jdcloud.sdk.service.live.model.DescribeLiveStreamSnapshotNotifyConfigResponse;
import com.jdcloud.sdk.service.live.client.DescribeLiveStreamSnapshotNotifyConfigExecutor;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamSnapshotTemplatesRequest;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamSnapshotTemplatesResponse;
import com.jdcloud.sdk.service.live.client.DescribeCustomLiveStreamSnapshotTemplatesExecutor;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamDomainWatermarkRequest;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamDomainWatermarkResponse;
import com.jdcloud.sdk.service.live.client.DeleteLiveStreamDomainWatermarkExecutor;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamRecordConfigRequest;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamRecordConfigResponse;
import com.jdcloud.sdk.service.live.client.DescribeCustomLiveStreamRecordConfigExecutor;
import com.jdcloud.sdk.service.live.model.ForbidLiveStreamRequest;
import com.jdcloud.sdk.service.live.model.ForbidLiveStreamResponse;
import com.jdcloud.sdk.service.live.client.ForbidLiveStreamExecutor;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamAppRecordRequest;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamAppRecordResponse;
import com.jdcloud.sdk.service.live.client.DeleteLiveStreamAppRecordExecutor;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamAppWatermarkRequest;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamAppWatermarkResponse;
import com.jdcloud.sdk.service.live.client.DeleteLiveStreamAppWatermarkExecutor;
import com.jdcloud.sdk.service.live.model.DeleteCustomLiveStreamWatermarkTemplateRequest;
import com.jdcloud.sdk.service.live.model.DeleteCustomLiveStreamWatermarkTemplateResponse;
import com.jdcloud.sdk.service.live.client.DeleteCustomLiveStreamWatermarkTemplateExecutor;
import com.jdcloud.sdk.service.live.model.StartLiveAppRequest;
import com.jdcloud.sdk.service.live.model.StartLiveAppResponse;
import com.jdcloud.sdk.service.live.client.StartLiveAppExecutor;
import com.jdcloud.sdk.service.live.model.SetLiveStreamNotifyUrlConfigRequest;
import com.jdcloud.sdk.service.live.model.SetLiveStreamNotifyUrlConfigResponse;
import com.jdcloud.sdk.service.live.client.SetLiveStreamNotifyUrlConfigExecutor;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamRecordTemplatesRequest;
import com.jdcloud.sdk.service.live.model.DescribeCustomLiveStreamRecordTemplatesResponse;
import com.jdcloud.sdk.service.live.client.DescribeCustomLiveStreamRecordTemplatesExecutor;
import com.jdcloud.sdk.service.live.model.AddCustomLiveStreamTranscodeRequest;
import com.jdcloud.sdk.service.live.model.AddCustomLiveStreamTranscodeResponse;
import com.jdcloud.sdk.service.live.client.AddCustomLiveStreamTranscodeExecutor;
import com.jdcloud.sdk.service.live.model.AddCustomLiveStreamWatermarkTemplateRequest;
import com.jdcloud.sdk.service.live.model.AddCustomLiveStreamWatermarkTemplateResponse;
import com.jdcloud.sdk.service.live.client.AddCustomLiveStreamWatermarkTemplateExecutor;
import com.jdcloud.sdk.service.live.model.AddLiveStreamSnapshotNotifyConfigRequest;
import com.jdcloud.sdk.service.live.model.AddLiveStreamSnapshotNotifyConfigResponse;
import com.jdcloud.sdk.service.live.client.AddLiveStreamSnapshotNotifyConfigExecutor;
import com.jdcloud.sdk.service.live.model.AddLiveStreamAppWatermarkRequest;
import com.jdcloud.sdk.service.live.model.AddLiveStreamAppWatermarkResponse;
import com.jdcloud.sdk.service.live.client.AddLiveStreamAppWatermarkExecutor;
import com.jdcloud.sdk.service.live.model.DeleteCustomLiveStreamSnapshotTemplateRequest;
import com.jdcloud.sdk.service.live.model.DeleteCustomLiveStreamSnapshotTemplateResponse;
import com.jdcloud.sdk.service.live.client.DeleteCustomLiveStreamSnapshotTemplateExecutor;
import com.jdcloud.sdk.service.live.model.ResumeLiveStreamRequest;
import com.jdcloud.sdk.service.live.model.ResumeLiveStreamResponse;
import com.jdcloud.sdk.service.live.client.ResumeLiveStreamExecutor;
import com.jdcloud.sdk.service.live.model.DeleteLiveDomainRequest;
import com.jdcloud.sdk.service.live.model.DeleteLiveDomainResponse;
import com.jdcloud.sdk.service.live.client.DeleteLiveDomainExecutor;
import com.jdcloud.sdk.service.live.model.DescribeLiveStreamNotifyUrlConfigRequest;
import com.jdcloud.sdk.service.live.model.DescribeLiveStreamNotifyUrlConfigResponse;
import com.jdcloud.sdk.service.live.client.DescribeLiveStreamNotifyUrlConfigExecutor;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamAppSnapshotRequest;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamAppSnapshotResponse;
import com.jdcloud.sdk.service.live.client.DeleteLiveStreamAppSnapshotExecutor;
import com.jdcloud.sdk.service.live.model.AddLiveStreamDomainWatermarkRequest;
import com.jdcloud.sdk.service.live.model.AddLiveStreamDomainWatermarkResponse;
import com.jdcloud.sdk.service.live.client.AddLiveStreamDomainWatermarkExecutor;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamDomainRecordRequest;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamDomainRecordResponse;
import com.jdcloud.sdk.service.live.client.DeleteLiveStreamDomainRecordExecutor;
import com.jdcloud.sdk.service.live.model.StopLiveDomainRequest;
import com.jdcloud.sdk.service.live.model.StopLiveDomainResponse;
import com.jdcloud.sdk.service.live.client.StopLiveDomainExecutor;
import com.jdcloud.sdk.service.live.model.AddLiveAppRequest;
import com.jdcloud.sdk.service.live.model.AddLiveAppResponse;
import com.jdcloud.sdk.service.live.client.AddLiveAppExecutor;
import com.jdcloud.sdk.service.live.model.StopLiveAppRequest;
import com.jdcloud.sdk.service.live.model.StopLiveAppResponse;
import com.jdcloud.sdk.service.live.client.StopLiveAppExecutor;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamAppTranscodeRequest;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamAppTranscodeResponse;
import com.jdcloud.sdk.service.live.client.DeleteLiveStreamAppTranscodeExecutor;
import com.jdcloud.sdk.service.live.model.DescribeLiveAppRequest;
import com.jdcloud.sdk.service.live.model.DescribeLiveAppResponse;
import com.jdcloud.sdk.service.live.client.DescribeLiveAppExecutor;
import com.jdcloud.sdk.service.live.model.DescribeLiveDomainRequest;
import com.jdcloud.sdk.service.live.model.DescribeLiveDomainResponse;
import com.jdcloud.sdk.service.live.client.DescribeLiveDomainExecutor;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamNotifyUrlConfigRequest;
import com.jdcloud.sdk.service.live.model.DeleteLiveStreamNotifyUrlConfigResponse;
import com.jdcloud.sdk.service.live.client.DeleteLiveStreamNotifyUrlConfigExecutor;
import com.jdcloud.sdk.service.live.model.AddLiveStreamDomainSnapshotRequest;
import com.jdcloud.sdk.service.live.model.AddLiveStreamDomainSnapshotResponse;
import com.jdcloud.sdk.service.live.client.AddLiveStreamDomainSnapshotExecutor;
import com.jdcloud.sdk.service.live.model.AddLiveRecordRequest;
import com.jdcloud.sdk.service.live.model.AddLiveRecordResponse;
import com.jdcloud.sdk.service.live.client.AddLiveRecordExecutor;

/**
 * liveClient
 */
public class LiveClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.8";
    public final static String DefaultEndpoint = "live.jdcloud-api.com";
    public final static String ServiceName = "live";
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

    private LiveClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 添加录制回调配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddLiveStreamRecordNotifyConfigResponse addLiveStreamRecordNotifyConfig(AddLiveStreamRecordNotifyConfigRequest request) throws JdcloudSdkException {
        return new AddLiveStreamRecordNotifyConfigExecutor().client(this).execute(request);
    }

    /**
     * 查询直播截图配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCustomLiveStreamSnapshotConfigResponse describeCustomLiveStreamSnapshotConfig(DescribeCustomLiveStreamSnapshotConfigRequest request) throws JdcloudSdkException {
        return new DescribeCustomLiveStreamSnapshotConfigExecutor().client(this).execute(request);
    }

    /**
     * 添加域名录制配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddLiveStreamDomainRecordResponse addLiveStreamDomainRecord(AddLiveStreamDomainRecordRequest request) throws JdcloudSdkException {
        return new AddLiveStreamDomainRecordExecutor().client(this).execute(request);
    }

    /**
     * 添加录制模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddCustomLiveStreamRecordTemplateResponse addCustomLiveStreamRecordTemplate(AddCustomLiveStreamRecordTemplateRequest request) throws JdcloudSdkException {
        return new AddCustomLiveStreamRecordTemplateExecutor().client(this).execute(request);
    }

    /**
     * 删除录制回调配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLiveStreamRecordNotifyConfigResponse deleteLiveStreamRecordNotifyConfig(DeleteLiveStreamRecordNotifyConfigRequest request) throws JdcloudSdkException {
        return new DeleteLiveStreamRecordNotifyConfigExecutor().client(this).execute(request);
    }

    /**
     * 添加直播截图模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddCustomLiveStreamSnapshotTemplateResponse addCustomLiveStreamSnapshotTemplate(AddCustomLiveStreamSnapshotTemplateRequest request) throws JdcloudSdkException {
        return new AddCustomLiveStreamSnapshotTemplateExecutor().client(this).execute(request);
    }

    /**
     * 查询直播域名网络带宽监控数据
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddLiveDomainResponse addLiveDomain(AddLiveDomainRequest request) throws JdcloudSdkException {
        return new AddLiveDomainExecutor().client(this).execute(request);
    }

    /**
     * 删除域名转码配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLiveStreamDomainTranscodeResponse deleteLiveStreamDomainTranscode(DeleteLiveStreamDomainTranscodeRequest request) throws JdcloudSdkException {
        return new DeleteLiveStreamDomainTranscodeExecutor().client(this).execute(request);
    }

    /**
     * 查询录制回调配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeLiveStreamRecordNotifyConfigResponse describeLiveStreamRecordNotifyConfig(DescribeLiveStreamRecordNotifyConfigRequest request) throws JdcloudSdkException {
        return new DescribeLiveStreamRecordNotifyConfigExecutor().client(this).execute(request);
    }

    /**
     * 查询转码模板列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCustomLiveStreamTranscodesResponse describeCustomLiveStreamTranscodes(DescribeCustomLiveStreamTranscodesRequest request) throws JdcloudSdkException {
        return new DescribeCustomLiveStreamTranscodesExecutor().client(this).execute(request);
    }

    /**
     * 查询转码模板配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeLiveStreamTranscodeConfigResponse describeLiveStreamTranscodeConfig(DescribeLiveStreamTranscodeConfigRequest request) throws JdcloudSdkException {
        return new DescribeLiveStreamTranscodeConfigExecutor().client(this).execute(request);
    }

    /**
     * 查询转码模板详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCustomLiveStreamTranscodeResponse describeCustomLiveStreamTranscode(DescribeCustomLiveStreamTranscodeRequest request) throws JdcloudSdkException {
        return new DescribeCustomLiveStreamTranscodeExecutor().client(this).execute(request);
    }

    /**
     * 添加app转码配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddLiveStreamAppTranscodeResponse addLiveStreamAppTranscode(AddLiveStreamAppTranscodeRequest request) throws JdcloudSdkException {
        return new AddLiveStreamAppTranscodeExecutor().client(this).execute(request);
    }

    /**
     * 删除域名直播截图配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLiveStreamDomainSnapshotResponse deleteLiveStreamDomainSnapshot(DeleteLiveStreamDomainSnapshotRequest request) throws JdcloudSdkException {
        return new DeleteLiveStreamDomainSnapshotExecutor().client(this).execute(request);
    }

    /**
     * 删除截图回调配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLiveStreamSnapshotNotifyConfigResponse deleteLiveStreamSnapshotNotifyConfig(DeleteLiveStreamSnapshotNotifyConfigRequest request) throws JdcloudSdkException {
        return new DeleteLiveStreamSnapshotNotifyConfigExecutor().client(this).execute(request);
    }

    /**
     * 查询水印配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCustomLiveStreamWatermarkConfigResponse describeCustomLiveStreamWatermarkConfig(DescribeCustomLiveStreamWatermarkConfigRequest request) throws JdcloudSdkException {
        return new DescribeCustomLiveStreamWatermarkConfigExecutor().client(this).execute(request);
    }

    /**
     * 查询录制模板列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCustomLiveStreamWatermarkTemplatesResponse describeCustomLiveStreamWatermarkTemplates(DescribeCustomLiveStreamWatermarkTemplatesRequest request) throws JdcloudSdkException {
        return new DescribeCustomLiveStreamWatermarkTemplatesExecutor().client(this).execute(request);
    }

    /**
     * 添加app直播截图配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddLiveStreamAppSnapshotResponse addLiveStreamAppSnapshot(AddLiveStreamAppSnapshotRequest request) throws JdcloudSdkException {
        return new AddLiveStreamAppSnapshotExecutor().client(this).execute(request);
    }

    /**
     * 删除录制模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteCustomLiveStreamRecordTemplateResponse deleteCustomLiveStreamRecordTemplate(DeleteCustomLiveStreamRecordTemplateRequest request) throws JdcloudSdkException {
        return new DeleteCustomLiveStreamRecordTemplateExecutor().client(this).execute(request);
    }

    /**
     * 启动域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StartLiveDomainResponse startLiveDomain(StartLiveDomainRequest request) throws JdcloudSdkException {
        return new StartLiveDomainExecutor().client(this).execute(request);
    }

    /**
     * 添加app录制配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddLiveStreamAppRecordResponse addLiveStreamAppRecord(AddLiveStreamAppRecordRequest request) throws JdcloudSdkException {
        return new AddLiveStreamAppRecordExecutor().client(this).execute(request);
    }

    /**
     * 删除app
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLiveAppResponse deleteLiveApp(DeleteLiveAppRequest request) throws JdcloudSdkException {
        return new DeleteLiveAppExecutor().client(this).execute(request);
    }

    /**
     * 添加域名转码配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddLiveStreamDomainTranscodeResponse addLiveStreamDomainTranscode(AddLiveStreamDomainTranscodeRequest request) throws JdcloudSdkException {
        return new AddLiveStreamDomainTranscodeExecutor().client(this).execute(request);
    }

    /**
     * 查询指定域名相关信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeLiveDomainDetailResponse describeLiveDomainDetail(DescribeLiveDomainDetailRequest request) throws JdcloudSdkException {
        return new DescribeLiveDomainDetailExecutor().client(this).execute(request);
    }

    /**
     * 删除自定义转码模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteCustomLiveStreamTranscodeResponse deleteCustomLiveStreamTranscode(DeleteCustomLiveStreamTranscodeRequest request) throws JdcloudSdkException {
        return new DeleteCustomLiveStreamTranscodeExecutor().client(this).execute(request);
    }

    /**
     * 查询截图信息回调配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeLiveStreamSnapshotNotifyConfigResponse describeLiveStreamSnapshotNotifyConfig(DescribeLiveStreamSnapshotNotifyConfigRequest request) throws JdcloudSdkException {
        return new DescribeLiveStreamSnapshotNotifyConfigExecutor().client(this).execute(request);
    }

    /**
     * 查询直播截图模板列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCustomLiveStreamSnapshotTemplatesResponse describeCustomLiveStreamSnapshotTemplates(DescribeCustomLiveStreamSnapshotTemplatesRequest request) throws JdcloudSdkException {
        return new DescribeCustomLiveStreamSnapshotTemplatesExecutor().client(this).execute(request);
    }

    /**
     * 删除域名水印配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLiveStreamDomainWatermarkResponse deleteLiveStreamDomainWatermark(DeleteLiveStreamDomainWatermarkRequest request) throws JdcloudSdkException {
        return new DeleteLiveStreamDomainWatermarkExecutor().client(this).execute(request);
    }

    /**
     * 查询录制配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCustomLiveStreamRecordConfigResponse describeCustomLiveStreamRecordConfig(DescribeCustomLiveStreamRecordConfigRequest request) throws JdcloudSdkException {
        return new DescribeCustomLiveStreamRecordConfigExecutor().client(this).execute(request);
    }

    /**
     * 禁止直播流推送
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ForbidLiveStreamResponse forbidLiveStream(ForbidLiveStreamRequest request) throws JdcloudSdkException {
        return new ForbidLiveStreamExecutor().client(this).execute(request);
    }

    /**
     * 删除app录制配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLiveStreamAppRecordResponse deleteLiveStreamAppRecord(DeleteLiveStreamAppRecordRequest request) throws JdcloudSdkException {
        return new DeleteLiveStreamAppRecordExecutor().client(this).execute(request);
    }

    /**
     * 删除app水印配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLiveStreamAppWatermarkResponse deleteLiveStreamAppWatermark(DeleteLiveStreamAppWatermarkRequest request) throws JdcloudSdkException {
        return new DeleteLiveStreamAppWatermarkExecutor().client(this).execute(request);
    }

    /**
     * 删除直播水印模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteCustomLiveStreamWatermarkTemplateResponse deleteCustomLiveStreamWatermarkTemplate(DeleteCustomLiveStreamWatermarkTemplateRequest request) throws JdcloudSdkException {
        return new DeleteCustomLiveStreamWatermarkTemplateExecutor().client(this).execute(request);
    }

    /**
     * 启用APP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StartLiveAppResponse startLiveApp(StartLiveAppRequest request) throws JdcloudSdkException {
        return new StartLiveAppExecutor().client(this).execute(request);
    }

    /**
     * 设置NotifyURL
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SetLiveStreamNotifyUrlConfigResponse setLiveStreamNotifyUrlConfig(SetLiveStreamNotifyUrlConfigRequest request) throws JdcloudSdkException {
        return new SetLiveStreamNotifyUrlConfigExecutor().client(this).execute(request);
    }

    /**
     * 查询录制模板列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCustomLiveStreamRecordTemplatesResponse describeCustomLiveStreamRecordTemplates(DescribeCustomLiveStreamRecordTemplatesRequest request) throws JdcloudSdkException {
        return new DescribeCustomLiveStreamRecordTemplatesExecutor().client(this).execute(request);
    }

    /**
     * 添加自定义转码模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddCustomLiveStreamTranscodeResponse addCustomLiveStreamTranscode(AddCustomLiveStreamTranscodeRequest request) throws JdcloudSdkException {
        return new AddCustomLiveStreamTranscodeExecutor().client(this).execute(request);
    }

    /**
     * 添加直播水印模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddCustomLiveStreamWatermarkTemplateResponse addCustomLiveStreamWatermarkTemplate(AddCustomLiveStreamWatermarkTemplateRequest request) throws JdcloudSdkException {
        return new AddCustomLiveStreamWatermarkTemplateExecutor().client(this).execute(request);
    }

    /**
     * 添加截图回调配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddLiveStreamSnapshotNotifyConfigResponse addLiveStreamSnapshotNotifyConfig(AddLiveStreamSnapshotNotifyConfigRequest request) throws JdcloudSdkException {
        return new AddLiveStreamSnapshotNotifyConfigExecutor().client(this).execute(request);
    }

    /**
     * 添加app水印配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddLiveStreamAppWatermarkResponse addLiveStreamAppWatermark(AddLiveStreamAppWatermarkRequest request) throws JdcloudSdkException {
        return new AddLiveStreamAppWatermarkExecutor().client(this).execute(request);
    }

    /**
     * 删除直播截图模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteCustomLiveStreamSnapshotTemplateResponse deleteCustomLiveStreamSnapshotTemplate(DeleteCustomLiveStreamSnapshotTemplateRequest request) throws JdcloudSdkException {
        return new DeleteCustomLiveStreamSnapshotTemplateExecutor().client(this).execute(request);
    }

    /**
     * 恢复直播流推送
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ResumeLiveStreamResponse resumeLiveStream(ResumeLiveStreamRequest request) throws JdcloudSdkException {
        return new ResumeLiveStreamExecutor().client(this).execute(request);
    }

    /**
     * 删除域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLiveDomainResponse deleteLiveDomain(DeleteLiveDomainRequest request) throws JdcloudSdkException {
        return new DeleteLiveDomainExecutor().client(this).execute(request);
    }

    /**
     * 查询NotifyURL
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeLiveStreamNotifyUrlConfigResponse describeLiveStreamNotifyUrlConfig(DescribeLiveStreamNotifyUrlConfigRequest request) throws JdcloudSdkException {
        return new DescribeLiveStreamNotifyUrlConfigExecutor().client(this).execute(request);
    }

    /**
     * 删除app直播截图配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLiveStreamAppSnapshotResponse deleteLiveStreamAppSnapshot(DeleteLiveStreamAppSnapshotRequest request) throws JdcloudSdkException {
        return new DeleteLiveStreamAppSnapshotExecutor().client(this).execute(request);
    }

    /**
     * 添加域名水印配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddLiveStreamDomainWatermarkResponse addLiveStreamDomainWatermark(AddLiveStreamDomainWatermarkRequest request) throws JdcloudSdkException {
        return new AddLiveStreamDomainWatermarkExecutor().client(this).execute(request);
    }

    /**
     * 删除域名录制配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLiveStreamDomainRecordResponse deleteLiveStreamDomainRecord(DeleteLiveStreamDomainRecordRequest request) throws JdcloudSdkException {
        return new DeleteLiveStreamDomainRecordExecutor().client(this).execute(request);
    }

    /**
     * 停止域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StopLiveDomainResponse stopLiveDomain(StopLiveDomainRequest request) throws JdcloudSdkException {
        return new StopLiveDomainExecutor().client(this).execute(request);
    }

    /**
     * 添加 app 模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddLiveAppResponse addLiveApp(AddLiveAppRequest request) throws JdcloudSdkException {
        return new AddLiveAppExecutor().client(this).execute(request);
    }

    /**
     * 停用APP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StopLiveAppResponse stopLiveApp(StopLiveAppRequest request) throws JdcloudSdkException {
        return new StopLiveAppExecutor().client(this).execute(request);
    }

    /**
     * 删除app转码配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLiveStreamAppTranscodeResponse deleteLiveStreamAppTranscode(DeleteLiveStreamAppTranscodeRequest request) throws JdcloudSdkException {
        return new DeleteLiveStreamAppTranscodeExecutor().client(this).execute(request);
    }

    /**
     * 查询域名下的app列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeLiveAppResponse describeLiveApp(DescribeLiveAppRequest request) throws JdcloudSdkException {
        return new DescribeLiveAppExecutor().client(this).execute(request);
    }

    /**
     * 查询域名列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeLiveDomainResponse describeLiveDomain(DescribeLiveDomainRequest request) throws JdcloudSdkException {
        return new DescribeLiveDomainExecutor().client(this).execute(request);
    }

    /**
     * 删除NotifyURL
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLiveStreamNotifyUrlConfigResponse deleteLiveStreamNotifyUrlConfig(DeleteLiveStreamNotifyUrlConfigRequest request) throws JdcloudSdkException {
        return new DeleteLiveStreamNotifyUrlConfigExecutor().client(this).execute(request);
    }

    /**
     * 添加域名直播截图配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddLiveStreamDomainSnapshotResponse addLiveStreamDomainSnapshot(AddLiveStreamDomainSnapshotRequest request) throws JdcloudSdkException {
        return new AddLiveStreamDomainSnapshotExecutor().client(this).execute(request);
    }

    /**
     * 查询直播域名录制时长数据
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddLiveRecordResponse addLiveRecord(AddLiveRecordRequest request) throws JdcloudSdkException {
        return new AddLiveRecordExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public LiveClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private LiveClient liveClient;

        public DefaultBuilder() {
            liveClient = new LiveClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            liveClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            liveClient.httpRequestConfig = config;
            return this;
        }

        public LiveClient build() throws JdcloudSdkException {

            if (liveClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                liveClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (liveClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("LiveClient build error: jdcloud credentials provider not set");
                }
            }
            if (liveClient.httpRequestConfig == null) {
                liveClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (liveClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("LiveClient build error: http request config not set");
                }
            }
            return liveClient;
        }

        public Builder environment(Environment environment) {
            liveClient.environment = environment;
            return this;
        }
    }
}
