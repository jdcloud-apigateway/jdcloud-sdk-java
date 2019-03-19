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
 * 京东云sms接口
 * sms相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.sms.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.sms.model.PullMoMsgRequest;
import com.jdcloud.sdk.service.sms.model.PullMoMsgResponse;
import com.jdcloud.sdk.service.sms.client.PullMoMsgExecutor;
import com.jdcloud.sdk.service.sms.model.DeleteSdkSmsSignRequest;
import com.jdcloud.sdk.service.sms.model.DeleteSdkSmsSignResponse;
import com.jdcloud.sdk.service.sms.client.DeleteSdkSmsSignExecutor;
import com.jdcloud.sdk.service.sms.model.AddSdkSmsTemplateRequest;
import com.jdcloud.sdk.service.sms.model.AddSdkSmsTemplateResponse;
import com.jdcloud.sdk.service.sms.client.AddSdkSmsTemplateExecutor;
import com.jdcloud.sdk.service.sms.model.DeleteSdkSmsTemplateRequest;
import com.jdcloud.sdk.service.sms.model.DeleteSdkSmsTemplateResponse;
import com.jdcloud.sdk.service.sms.client.DeleteSdkSmsTemplateExecutor;
import com.jdcloud.sdk.service.sms.model.PullMtMsgRequest;
import com.jdcloud.sdk.service.sms.model.PullMtMsgResponse;
import com.jdcloud.sdk.service.sms.client.PullMtMsgExecutor;
import com.jdcloud.sdk.service.sms.model.QuerySdkSmsSignStatusRequest;
import com.jdcloud.sdk.service.sms.model.QuerySdkSmsSignStatusResponse;
import com.jdcloud.sdk.service.sms.client.QuerySdkSmsSignStatusExecutor;
import com.jdcloud.sdk.service.sms.model.AggSendStatusRequest;
import com.jdcloud.sdk.service.sms.model.AggSendStatusResponse;
import com.jdcloud.sdk.service.sms.client.AggSendStatusExecutor;
import com.jdcloud.sdk.service.sms.model.SendSingleSmsRequest;
import com.jdcloud.sdk.service.sms.model.SendSingleSmsResponse;
import com.jdcloud.sdk.service.sms.client.SendSingleSmsExecutor;
import com.jdcloud.sdk.service.sms.model.SendBatchSmsRequest;
import com.jdcloud.sdk.service.sms.model.SendBatchSmsResponse;
import com.jdcloud.sdk.service.sms.client.SendBatchSmsExecutor;
import com.jdcloud.sdk.service.sms.model.QuerySdkSmsTemplateStatusRequest;
import com.jdcloud.sdk.service.sms.model.QuerySdkSmsTemplateStatusResponse;
import com.jdcloud.sdk.service.sms.client.QuerySdkSmsTemplateStatusExecutor;
import com.jdcloud.sdk.service.sms.model.AggReceiptStatusRequest;
import com.jdcloud.sdk.service.sms.model.AggReceiptStatusResponse;
import com.jdcloud.sdk.service.sms.client.AggReceiptStatusExecutor;
import com.jdcloud.sdk.service.sms.model.PullMoMsgByMobileRequest;
import com.jdcloud.sdk.service.sms.model.PullMoMsgByMobileResponse;
import com.jdcloud.sdk.service.sms.client.PullMoMsgByMobileExecutor;
import com.jdcloud.sdk.service.sms.model.AddSdkSmsSignRequest;
import com.jdcloud.sdk.service.sms.model.AddSdkSmsSignResponse;
import com.jdcloud.sdk.service.sms.client.AddSdkSmsSignExecutor;
import com.jdcloud.sdk.service.sms.model.PullMtMsgByMobileRequest;
import com.jdcloud.sdk.service.sms.model.PullMtMsgByMobileResponse;
import com.jdcloud.sdk.service.sms.client.PullMtMsgByMobileExecutor;
import com.jdcloud.sdk.service.sms.model.EditSdkSmsTemplateRequest;
import com.jdcloud.sdk.service.sms.model.EditSdkSmsTemplateResponse;
import com.jdcloud.sdk.service.sms.client.EditSdkSmsTemplateExecutor;
import com.jdcloud.sdk.service.sms.model.EditSdkSmsSignRequest;
import com.jdcloud.sdk.service.sms.model.EditSdkSmsSignResponse;
import com.jdcloud.sdk.service.sms.client.EditSdkSmsSignExecutor;

/**
 * smsClient
 */
public class SmsClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.9";
    public final static String DefaultEndpoint = "sms.jdcloud-api.com";
    public final static String ServiceName = "sms";
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

    private SmsClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 拉取回复短信
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public PullMoMsgResponse pullMoMsg(PullMoMsgRequest request) throws JdcloudSdkException {
        return new PullMoMsgExecutor().client(this).execute(request);
    }

    /**
     * 删除短信签名接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteSdkSmsSignResponse deleteSdkSmsSign(DeleteSdkSmsSignRequest request) throws JdcloudSdkException {
        return new DeleteSdkSmsSignExecutor().client(this).execute(request);
    }

    /**
     * 新增短信模板接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddSdkSmsTemplateResponse addSdkSmsTemplate(AddSdkSmsTemplateRequest request) throws JdcloudSdkException {
        return new AddSdkSmsTemplateExecutor().client(this).execute(request);
    }

    /**
     * 删除短信模板接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteSdkSmsTemplateResponse deleteSdkSmsTemplate(DeleteSdkSmsTemplateRequest request) throws JdcloudSdkException {
        return new DeleteSdkSmsTemplateExecutor().client(this).execute(request);
    }

    /**
     * 拉取短信状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public PullMtMsgResponse pullMtMsg(PullMtMsgRequest request) throws JdcloudSdkException {
        return new PullMtMsgExecutor().client(this).execute(request);
    }

    /**
     * 查询短信签名接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QuerySdkSmsSignStatusResponse querySdkSmsSignStatus(QuerySdkSmsSignStatusRequest request) throws JdcloudSdkException {
        return new QuerySdkSmsSignStatusExecutor().client(this).execute(request);
    }

    /**
     * 发送数据统计
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AggSendStatusResponse aggSendStatus(AggSendStatusRequest request) throws JdcloudSdkException {
        return new AggSendStatusExecutor().client(this).execute(request);
    }

    /**
     * 指定模板单发短信
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SendSingleSmsResponse sendSingleSms(SendSingleSmsRequest request) throws JdcloudSdkException {
        return new SendSingleSmsExecutor().client(this).execute(request);
    }

    /**
     * 指定模板群发短信
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SendBatchSmsResponse sendBatchSms(SendBatchSmsRequest request) throws JdcloudSdkException {
        return new SendBatchSmsExecutor().client(this).execute(request);
    }

    /**
     * 查询短信模板接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QuerySdkSmsTemplateStatusResponse querySdkSmsTemplateStatus(QuerySdkSmsTemplateStatusRequest request) throws JdcloudSdkException {
        return new QuerySdkSmsTemplateStatusExecutor().client(this).execute(request);
    }

    /**
     * 回执数据统计
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AggReceiptStatusResponse aggReceiptStatus(AggReceiptStatusRequest request) throws JdcloudSdkException {
        return new AggReceiptStatusExecutor().client(this).execute(request);
    }

    /**
     * 拉取单个手机的回复短信
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public PullMoMsgByMobileResponse pullMoMsgByMobile(PullMoMsgByMobileRequest request) throws JdcloudSdkException {
        return new PullMoMsgByMobileExecutor().client(this).execute(request);
    }

    /**
     * 新增短信签名接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddSdkSmsSignResponse addSdkSmsSign(AddSdkSmsSignRequest request) throws JdcloudSdkException {
        return new AddSdkSmsSignExecutor().client(this).execute(request);
    }

    /**
     * 拉取单个手机短信状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public PullMtMsgByMobileResponse pullMtMsgByMobile(PullMtMsgByMobileRequest request) throws JdcloudSdkException {
        return new PullMtMsgByMobileExecutor().client(this).execute(request);
    }

    /**
     * 编辑短信模板接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EditSdkSmsTemplateResponse editSdkSmsTemplate(EditSdkSmsTemplateRequest request) throws JdcloudSdkException {
        return new EditSdkSmsTemplateExecutor().client(this).execute(request);
    }

    /**
     * 编辑短信签名接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public EditSdkSmsSignResponse editSdkSmsSign(EditSdkSmsSignRequest request) throws JdcloudSdkException {
        return new EditSdkSmsSignExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public SmsClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private SmsClient smsClient;

        public DefaultBuilder() {
            smsClient = new SmsClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            smsClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            smsClient.httpRequestConfig = config;
            return this;
        }

        public SmsClient build() throws JdcloudSdkException {

            if (smsClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                smsClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (smsClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("SmsClient build error: jdcloud credentials provider not set");
                }
            }
            if (smsClient.httpRequestConfig == null) {
                smsClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (smsClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("SmsClient build error: http request config not set");
                }
            }
            return smsClient;
        }

        public Builder environment(Environment environment) {
            smsClient.environment = environment;
            return this;
        }
    }
}