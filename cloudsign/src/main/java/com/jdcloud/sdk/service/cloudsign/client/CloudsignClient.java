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
 * 京东云电子签章存取证-OpenAPI接口
 * 京东云电子签章存取证-OpenAPI接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudsign.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.cloudsign.model.GetMultiEvidenceRequest;
import com.jdcloud.sdk.service.cloudsign.model.GetMultiEvidenceResponse;
import com.jdcloud.sdk.service.cloudsign.client.GetMultiEvidenceExecutor;
import com.jdcloud.sdk.service.cloudsign.model.DescribeApplyStatusRequest;
import com.jdcloud.sdk.service.cloudsign.model.DescribeApplyStatusResponse;
import com.jdcloud.sdk.service.cloudsign.client.DescribeApplyStatusExecutor;
import com.jdcloud.sdk.service.cloudsign.model.EnableContractSaveRequest;
import com.jdcloud.sdk.service.cloudsign.model.EnableContractSaveResponse;
import com.jdcloud.sdk.service.cloudsign.client.EnableContractSaveExecutor;
import com.jdcloud.sdk.service.cloudsign.model.DescribeTemplateListRequest;
import com.jdcloud.sdk.service.cloudsign.model.DescribeTemplateListResponse;
import com.jdcloud.sdk.service.cloudsign.client.DescribeTemplateListExecutor;
import com.jdcloud.sdk.service.cloudsign.model.DescribeContractListRequest;
import com.jdcloud.sdk.service.cloudsign.model.DescribeContractListResponse;
import com.jdcloud.sdk.service.cloudsign.client.DescribeContractListExecutor;
import com.jdcloud.sdk.service.cloudsign.model.UploadStampRequest;
import com.jdcloud.sdk.service.cloudsign.model.UploadStampResponse;
import com.jdcloud.sdk.service.cloudsign.client.UploadStampExecutor;
import com.jdcloud.sdk.service.cloudsign.model.DownloadStampsRequest;
import com.jdcloud.sdk.service.cloudsign.model.DownloadStampsResponse;
import com.jdcloud.sdk.service.cloudsign.client.DownloadStampsExecutor;
import com.jdcloud.sdk.service.cloudsign.model.PaddingTemplateRequest;
import com.jdcloud.sdk.service.cloudsign.model.PaddingTemplateResponse;
import com.jdcloud.sdk.service.cloudsign.client.PaddingTemplateExecutor;
import com.jdcloud.sdk.service.cloudsign.model.SaveMultiEvidenceRequest;
import com.jdcloud.sdk.service.cloudsign.model.SaveMultiEvidenceResponse;
import com.jdcloud.sdk.service.cloudsign.client.SaveMultiEvidenceExecutor;
import com.jdcloud.sdk.service.cloudsign.model.SignContractRequest;
import com.jdcloud.sdk.service.cloudsign.model.SignContractResponse;
import com.jdcloud.sdk.service.cloudsign.client.SignContractExecutor;
import com.jdcloud.sdk.service.cloudsign.model.GetEvidenceRequest;
import com.jdcloud.sdk.service.cloudsign.model.GetEvidenceResponse;
import com.jdcloud.sdk.service.cloudsign.client.GetEvidenceExecutor;
import com.jdcloud.sdk.service.cloudsign.model.DownloadContractsRequest;
import com.jdcloud.sdk.service.cloudsign.model.DownloadContractsResponse;
import com.jdcloud.sdk.service.cloudsign.client.DownloadContractsExecutor;
import com.jdcloud.sdk.service.cloudsign.model.DownloadTemplatesRequest;
import com.jdcloud.sdk.service.cloudsign.model.DownloadTemplatesResponse;
import com.jdcloud.sdk.service.cloudsign.client.DownloadTemplatesExecutor;
import com.jdcloud.sdk.service.cloudsign.model.VerifyContractRequest;
import com.jdcloud.sdk.service.cloudsign.model.VerifyContractResponse;
import com.jdcloud.sdk.service.cloudsign.client.VerifyContractExecutor;
import com.jdcloud.sdk.service.cloudsign.model.UploadTemplateRequest;
import com.jdcloud.sdk.service.cloudsign.model.UploadTemplateResponse;
import com.jdcloud.sdk.service.cloudsign.client.UploadTemplateExecutor;
import com.jdcloud.sdk.service.cloudsign.model.DeleteTemplateRequest;
import com.jdcloud.sdk.service.cloudsign.model.DeleteTemplateResponse;
import com.jdcloud.sdk.service.cloudsign.client.DeleteTemplateExecutor;
import com.jdcloud.sdk.service.cloudsign.model.SaveEvidenceRequest;
import com.jdcloud.sdk.service.cloudsign.model.SaveEvidenceResponse;
import com.jdcloud.sdk.service.cloudsign.client.SaveEvidenceExecutor;
import com.jdcloud.sdk.service.cloudsign.model.DeleteContractRequest;
import com.jdcloud.sdk.service.cloudsign.model.DeleteContractResponse;
import com.jdcloud.sdk.service.cloudsign.client.DeleteContractExecutor;
import com.jdcloud.sdk.service.cloudsign.model.DisableContractSaveRequest;
import com.jdcloud.sdk.service.cloudsign.model.DisableContractSaveResponse;
import com.jdcloud.sdk.service.cloudsign.client.DisableContractSaveExecutor;
import com.jdcloud.sdk.service.cloudsign.model.SetKmsKeyIdRequest;
import com.jdcloud.sdk.service.cloudsign.model.SetKmsKeyIdResponse;
import com.jdcloud.sdk.service.cloudsign.client.SetKmsKeyIdExecutor;
import com.jdcloud.sdk.service.cloudsign.model.DeleteStampRequest;
import com.jdcloud.sdk.service.cloudsign.model.DeleteStampResponse;
import com.jdcloud.sdk.service.cloudsign.client.DeleteStampExecutor;
import com.jdcloud.sdk.service.cloudsign.model.DescribeStampListRequest;
import com.jdcloud.sdk.service.cloudsign.model.DescribeStampListResponse;
import com.jdcloud.sdk.service.cloudsign.client.DescribeStampListExecutor;

/**
 * cloudsignClient
 */
public class CloudsignClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.9";
    public final static String DefaultEndpoint = "cloudsign.jdcloud-api.com";
    public final static String ServiceName = "cloudsign";
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

    private CloudsignClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 带主体标记的取证接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetMultiEvidenceResponse getMultiEvidence(GetMultiEvidenceRequest request) throws JdcloudSdkException {
        return new GetMultiEvidenceExecutor().client(this).execute(request);
    }

    /**
     * 查询服务开通状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeApplyStatusResponse describeApplyStatus(DescribeApplyStatusRequest request) throws JdcloudSdkException {
        return new DescribeApplyStatusExecutor().client(this).execute(request);
    }

    /**
     * 启用合同存管
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EnableContractSaveResponse enableContractSave(EnableContractSaveRequest request) throws JdcloudSdkException {
        return new EnableContractSaveExecutor().client(this).execute(request);
    }

    /**
     * 获取合同模板列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeTemplateListResponse describeTemplateList(DescribeTemplateListRequest request) throws JdcloudSdkException {
        return new DescribeTemplateListExecutor().client(this).execute(request);
    }

    /**
     * 获取已签章合同列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeContractListResponse describeContractList(DescribeContractListRequest request) throws JdcloudSdkException {
        return new DescribeContractListExecutor().client(this).execute(request);
    }

    /**
     * 上传印章
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UploadStampResponse uploadStamp(UploadStampRequest request) throws JdcloudSdkException {
        return new UploadStampExecutor().client(this).execute(request);
    }

    /**
     * 1. 下载印章
2. 多个印章id用逗号分隔
 [MFA enabled]
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DownloadStampsResponse downloadStamps(DownloadStampsRequest request) throws JdcloudSdkException {
        return new DownloadStampsExecutor().client(this).execute(request);
    }

    /**
     * 填充合同模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public PaddingTemplateResponse paddingTemplate(PaddingTemplateRequest request) throws JdcloudSdkException {
        return new PaddingTemplateExecutor().client(this).execute(request);
    }

    /**
     * 多证据链存证接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SaveMultiEvidenceResponse saveMultiEvidence(SaveMultiEvidenceRequest request) throws JdcloudSdkException {
        return new SaveMultiEvidenceExecutor().client(this).execute(request);
    }

    /**
     * 合同签章四种方式：
1. 合同文件 + 印章文件：contractContent + stampContent
2. 合同文件 + 印章ID：contractContent + stampId
3. 模板ID + 印章文件：templateId + stampContent
4. 模板ID + 印章ID：templateId + stampId

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SignContractResponse signContract(SignContractRequest request) throws JdcloudSdkException {
        return new SignContractExecutor().client(this).execute(request);
    }

    /**
     * 单证据链取证接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetEvidenceResponse getEvidence(GetEvidenceRequest request) throws JdcloudSdkException {
        return new GetEvidenceExecutor().client(this).execute(request);
    }

    /**
     * 1. 下载已签章的合同
2. 多个合同id用逗号分隔
 [MFA enabled]
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DownloadContractsResponse downloadContracts(DownloadContractsRequest request) throws JdcloudSdkException {
        return new DownloadContractsExecutor().client(this).execute(request);
    }

    /**
     * 1. 下载合同模板
2. 多个合同id用逗号分隔
 [MFA enabled]
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DownloadTemplatesResponse downloadTemplates(DownloadTemplatesRequest request) throws JdcloudSdkException {
        return new DownloadTemplatesExecutor().client(this).execute(request);
    }

    /**
     * 验签已签章合同
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public VerifyContractResponse verifyContract(VerifyContractRequest request) throws JdcloudSdkException {
        return new VerifyContractExecutor().client(this).execute(request);
    }

    /**
     * 上传合同模板
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UploadTemplateResponse uploadTemplate(UploadTemplateRequest request) throws JdcloudSdkException {
        return new UploadTemplateExecutor().client(this).execute(request);
    }

    /**
     * 删除合同模板 [MFA enabled]
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws JdcloudSdkException {
        return new DeleteTemplateExecutor().client(this).execute(request);
    }

    /**
     * 单证据链存证接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SaveEvidenceResponse saveEvidence(SaveEvidenceRequest request) throws JdcloudSdkException {
        return new SaveEvidenceExecutor().client(this).execute(request);
    }

    /**
     * 删除已签章的合同 [MFA enabled]
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteContractResponse deleteContract(DeleteContractRequest request) throws JdcloudSdkException {
        return new DeleteContractExecutor().client(this).execute(request);
    }

    /**
     * 禁用合同存管
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisableContractSaveResponse disableContractSave(DisableContractSaveRequest request) throws JdcloudSdkException {
        return new DisableContractSaveExecutor().client(this).execute(request);
    }

    /**
     * 签章系统加密密钥 [MFA enabled]
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SetKmsKeyIdResponse setKmsKeyId(SetKmsKeyIdRequest request) throws JdcloudSdkException {
        return new SetKmsKeyIdExecutor().client(this).execute(request);
    }

    /**
     * 删除印章 [MFA enabled]
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteStampResponse deleteStamp(DeleteStampRequest request) throws JdcloudSdkException {
        return new DeleteStampExecutor().client(this).execute(request);
    }

    /**
     * 获取印章列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeStampListResponse describeStampList(DescribeStampListRequest request) throws JdcloudSdkException {
        return new DescribeStampListExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public CloudsignClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private CloudsignClient cloudsignClient;

        public DefaultBuilder() {
            cloudsignClient = new CloudsignClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            cloudsignClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            cloudsignClient.httpRequestConfig = config;
            return this;
        }

        public CloudsignClient build() throws JdcloudSdkException {

            if (cloudsignClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                cloudsignClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (cloudsignClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("CloudsignClient build error: jdcloud credentials provider not set");
                }
            }
            if (cloudsignClient.httpRequestConfig == null) {
                cloudsignClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (cloudsignClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("CloudsignClient build error: http request config not set");
                }
            }
            return cloudsignClient;
        }

        public Builder environment(Environment environment) {
            cloudsignClient.environment = environment;
            return this;
        }
    }
}
