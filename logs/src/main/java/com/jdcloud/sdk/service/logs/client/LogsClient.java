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
 * JCLOUD LOGS API
 * logs API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.logs.model.DescribeLogtopicRequest;
import com.jdcloud.sdk.service.logs.model.DescribeLogtopicResponse;
import com.jdcloud.sdk.service.logs.client.DescribeLogtopicExecutor;
import com.jdcloud.sdk.service.logs.model.DescribeCollectResourcesRequest;
import com.jdcloud.sdk.service.logs.model.DescribeCollectResourcesResponse;
import com.jdcloud.sdk.service.logs.client.DescribeCollectResourcesExecutor;
import com.jdcloud.sdk.service.logs.model.UpdateLogtopicRequest;
import com.jdcloud.sdk.service.logs.model.UpdateLogtopicResponse;
import com.jdcloud.sdk.service.logs.client.UpdateLogtopicExecutor;
import com.jdcloud.sdk.service.logs.model.DescribeLogsetsRequest;
import com.jdcloud.sdk.service.logs.model.DescribeLogsetsResponse;
import com.jdcloud.sdk.service.logs.client.DescribeLogsetsExecutor;
import com.jdcloud.sdk.service.logs.model.DescribeMetricTasksRequest;
import com.jdcloud.sdk.service.logs.model.DescribeMetricTasksResponse;
import com.jdcloud.sdk.service.logs.client.DescribeMetricTasksExecutor;
import com.jdcloud.sdk.service.logs.model.UpdateParserRequest;
import com.jdcloud.sdk.service.logs.model.UpdateParserResponse;
import com.jdcloud.sdk.service.logs.client.UpdateParserExecutor;
import com.jdcloud.sdk.service.logs.model.DescribeMetricTaskRequest;
import com.jdcloud.sdk.service.logs.model.DescribeMetricTaskResponse;
import com.jdcloud.sdk.service.logs.client.DescribeMetricTaskExecutor;
import com.jdcloud.sdk.service.logs.model.CreateSubscribeRequest;
import com.jdcloud.sdk.service.logs.model.CreateSubscribeResponse;
import com.jdcloud.sdk.service.logs.client.CreateSubscribeExecutor;
import com.jdcloud.sdk.service.logs.model.DeleteLogsetRequest;
import com.jdcloud.sdk.service.logs.model.DeleteLogsetResponse;
import com.jdcloud.sdk.service.logs.client.DeleteLogsetExecutor;
import com.jdcloud.sdk.service.logs.model.SearchRequest;
import com.jdcloud.sdk.service.logs.model.SearchResponse;
import com.jdcloud.sdk.service.logs.client.SearchExecutor;
import com.jdcloud.sdk.service.logs.model.TestMetricTaskRequest;
import com.jdcloud.sdk.service.logs.model.TestMetricTaskResponse;
import com.jdcloud.sdk.service.logs.client.TestMetricTaskExecutor;
import com.jdcloud.sdk.service.logs.model.DescribeLogsetRequest;
import com.jdcloud.sdk.service.logs.model.DescribeLogsetResponse;
import com.jdcloud.sdk.service.logs.client.DescribeLogsetExecutor;
import com.jdcloud.sdk.service.logs.model.UpdateSubscribeRequest;
import com.jdcloud.sdk.service.logs.model.UpdateSubscribeResponse;
import com.jdcloud.sdk.service.logs.client.UpdateSubscribeExecutor;
import com.jdcloud.sdk.service.logs.model.CreateParserRequest;
import com.jdcloud.sdk.service.logs.model.CreateParserResponse;
import com.jdcloud.sdk.service.logs.client.CreateParserExecutor;
import com.jdcloud.sdk.service.logs.model.DeleteLogtopicRequest;
import com.jdcloud.sdk.service.logs.model.DeleteLogtopicResponse;
import com.jdcloud.sdk.service.logs.client.DeleteLogtopicExecutor;
import com.jdcloud.sdk.service.logs.model.CreateMetricTaskRequest;
import com.jdcloud.sdk.service.logs.model.CreateMetricTaskResponse;
import com.jdcloud.sdk.service.logs.client.CreateMetricTaskExecutor;
import com.jdcloud.sdk.service.logs.model.HistogramsRequest;
import com.jdcloud.sdk.service.logs.model.HistogramsResponse;
import com.jdcloud.sdk.service.logs.client.HistogramsExecutor;
import com.jdcloud.sdk.service.logs.model.UpdateCollectInfoRequest;
import com.jdcloud.sdk.service.logs.model.UpdateCollectInfoResponse;
import com.jdcloud.sdk.service.logs.client.UpdateCollectInfoExecutor;
import com.jdcloud.sdk.service.logs.model.ValidateParserRequest;
import com.jdcloud.sdk.service.logs.model.ValidateParserResponse;
import com.jdcloud.sdk.service.logs.client.ValidateParserExecutor;
import com.jdcloud.sdk.service.logs.model.DescribeCollectInfoRequest;
import com.jdcloud.sdk.service.logs.model.DescribeCollectInfoResponse;
import com.jdcloud.sdk.service.logs.client.DescribeCollectInfoExecutor;
import com.jdcloud.sdk.service.logs.model.CreateLogsetRequest;
import com.jdcloud.sdk.service.logs.model.CreateLogsetResponse;
import com.jdcloud.sdk.service.logs.client.CreateLogsetExecutor;
import com.jdcloud.sdk.service.logs.model.UpdateLogsetRequest;
import com.jdcloud.sdk.service.logs.model.UpdateLogsetResponse;
import com.jdcloud.sdk.service.logs.client.UpdateLogsetExecutor;
import com.jdcloud.sdk.service.logs.model.DescribeLogtopicsRequest;
import com.jdcloud.sdk.service.logs.model.DescribeLogtopicsResponse;
import com.jdcloud.sdk.service.logs.client.DescribeLogtopicsExecutor;
import com.jdcloud.sdk.service.logs.model.DescribeSubscribeRequest;
import com.jdcloud.sdk.service.logs.model.DescribeSubscribeResponse;
import com.jdcloud.sdk.service.logs.client.DescribeSubscribeExecutor;
import com.jdcloud.sdk.service.logs.model.CreateCollectInfoRequest;
import com.jdcloud.sdk.service.logs.model.CreateCollectInfoResponse;
import com.jdcloud.sdk.service.logs.client.CreateCollectInfoExecutor;
import com.jdcloud.sdk.service.logs.model.DescribeParserRequest;
import com.jdcloud.sdk.service.logs.model.DescribeParserResponse;
import com.jdcloud.sdk.service.logs.client.DescribeParserExecutor;
import com.jdcloud.sdk.service.logs.model.UpdateMetricTaskRequest;
import com.jdcloud.sdk.service.logs.model.UpdateMetricTaskResponse;
import com.jdcloud.sdk.service.logs.client.UpdateMetricTaskExecutor;
import com.jdcloud.sdk.service.logs.model.DeleteMetricTaskRequest;
import com.jdcloud.sdk.service.logs.model.DeleteMetricTaskResponse;
import com.jdcloud.sdk.service.logs.client.DeleteMetricTaskExecutor;
import com.jdcloud.sdk.service.logs.model.GetLogsRequest;
import com.jdcloud.sdk.service.logs.model.GetLogsResponse;
import com.jdcloud.sdk.service.logs.client.GetLogsExecutor;
import com.jdcloud.sdk.service.logs.model.UpdateCollectResourcesRequest;
import com.jdcloud.sdk.service.logs.model.UpdateCollectResourcesResponse;
import com.jdcloud.sdk.service.logs.client.UpdateCollectResourcesExecutor;
import com.jdcloud.sdk.service.logs.model.CreateLogtopicRequest;
import com.jdcloud.sdk.service.logs.model.CreateLogtopicResponse;
import com.jdcloud.sdk.service.logs.client.CreateLogtopicExecutor;

/**
 * logsClient
 */
public class LogsClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.8";
    public final static String DefaultEndpoint = "logs.jdcloud-api.com";
    public final static String ServiceName = "logs";
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

    private LogsClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 查询日志主题基本信息。如配置了采集配置，将返回采集配置的UID
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeLogtopicResponse describeLogtopic(DescribeLogtopicRequest request) throws JdcloudSdkException {
        return new DescribeLogtopicExecutor().client(this).execute(request);
    }

    /**
     * 查询采集配置的实例列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCollectResourcesResponse describeCollectResources(DescribeCollectResourcesRequest request) throws JdcloudSdkException {
        return new DescribeCollectResourcesExecutor().client(this).execute(request);
    }

    /**
     * 更新日志主题。日志主题名称不可更新。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateLogtopicResponse updateLogtopic(UpdateLogtopicRequest request) throws JdcloudSdkException {
        return new UpdateLogtopicExecutor().client(this).execute(request);
    }

    /**
     * 查询日志集列表。支持按照名称进行模糊查询。结果中包含了该日志集是否存在日志主题的信息。存在日志主题的日志集不允许删除。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeLogsetsResponse describeLogsets(DescribeLogsetsRequest request) throws JdcloudSdkException {
        return new DescribeLogsetsExecutor().client(this).execute(request);
    }

    /**
     * 查询监控任务列表，返回该主题下的所有监控任务信息。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeMetricTasksResponse describeMetricTasks(DescribeMetricTasksRequest request) throws JdcloudSdkException {
        return new DescribeMetricTasksExecutor().client(this).execute(request);
    }

    /**
     * 更新解析配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateParserResponse updateParser(UpdateParserRequest request) throws JdcloudSdkException {
        return new UpdateParserExecutor().client(this).execute(request);
    }

    /**
     * 查询指定监控任务的详情信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeMetricTaskResponse describeMetricTask(DescribeMetricTaskRequest request) throws JdcloudSdkException {
        return new DescribeMetricTaskExecutor().client(this).execute(request);
    }

    /**
     * 创建日志消费
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateSubscribeResponse createSubscribe(CreateSubscribeRequest request) throws JdcloudSdkException {
        return new CreateSubscribeExecutor().client(this).execute(request);
    }

    /**
     * 删除日志集,删除多个日志集时，任意的日志集包含了日志主题的，将导致全部删除失败。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLogsetResponse deleteLogset(DeleteLogsetRequest request) throws JdcloudSdkException {
        return new DeleteLogsetExecutor().client(this).execute(request);
    }

    /**
     * 搜索日志
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SearchResponse search(SearchRequest request) throws JdcloudSdkException {
        return new SearchExecutor().client(this).execute(request);
    }

    /**
     * 日志测试，根据用户输入的日志筛选条件以及监控指标设置进行模拟监控统计
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public TestMetricTaskResponse testMetricTask(TestMetricTaskRequest request) throws JdcloudSdkException {
        return new TestMetricTaskExecutor().client(this).execute(request);
    }

    /**
     * 查询日志集详情。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeLogsetResponse describeLogset(DescribeLogsetRequest request) throws JdcloudSdkException {
        return new DescribeLogsetExecutor().client(this).execute(request);
    }

    /**
     * 更新日志消费
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateSubscribeResponse updateSubscribe(UpdateSubscribeRequest request) throws JdcloudSdkException {
        return new UpdateSubscribeExecutor().client(this).execute(request);
    }

    /**
     * 创建日志的解析配置。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateParserResponse createParser(CreateParserRequest request) throws JdcloudSdkException {
        return new CreateParserExecutor().client(this).execute(request);
    }

    /**
     * 删除日志主题。其采集配置与采集实例配置将一并删除。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteLogtopicResponse deleteLogtopic(DeleteLogtopicRequest request) throws JdcloudSdkException {
        return new DeleteLogtopicExecutor().client(this).execute(request);
    }

    /**
     * 创建监控任务，不可与当前日志主题下现有日志监控任务重名。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateMetricTaskResponse createMetricTask(CreateMetricTaskRequest request) throws JdcloudSdkException {
        return new CreateMetricTaskExecutor().client(this).execute(request);
    }

    /**
     * 日志检索结果直方图
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public HistogramsResponse histograms(HistogramsRequest request) throws JdcloudSdkException {
        return new HistogramsExecutor().client(this).execute(request);
    }

    /**
     * 更新采集配置。若传入的实例列表不为空，将覆盖之前的所有实例，而非新增。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateCollectInfoResponse updateCollectInfo(UpdateCollectInfoRequest request) throws JdcloudSdkException {
        return new UpdateCollectInfoExecutor().client(this).execute(request);
    }

    /**
     * 验证日志解析语法
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public ValidateParserResponse validateParser(ValidateParserRequest request) throws JdcloudSdkException {
        return new ValidateParserExecutor().client(this).execute(request);
    }

    /**
     * 采集配置的基本信息。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCollectInfoResponse describeCollectInfo(DescribeCollectInfoRequest request) throws JdcloudSdkException {
        return new DescribeCollectInfoExecutor().client(this).execute(request);
    }

    /**
     * 创建日志集。名称不可重复。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateLogsetResponse createLogset(CreateLogsetRequest request) throws JdcloudSdkException {
        return new CreateLogsetExecutor().client(this).execute(request);
    }

    /**
     * 更新日志集。日志集名称不可更新。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateLogsetResponse updateLogset(UpdateLogsetRequest request) throws JdcloudSdkException {
        return new UpdateLogsetExecutor().client(this).execute(request);
    }

    /**
     * 查询日志主题列表，支持按照名称模糊查询。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeLogtopicsResponse describeLogtopics(DescribeLogtopicsRequest request) throws JdcloudSdkException {
        return new DescribeLogtopicsExecutor().client(this).execute(request);
    }

    /**
     * 日志消费信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeSubscribeResponse describeSubscribe(DescribeSubscribeRequest request) throws JdcloudSdkException {
        return new DescribeSubscribeExecutor().client(this).execute(request);
    }

    /**
     * 创建采集配置，支持基于云产品模板生成采集模板；支持用于自定义采集配置。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateCollectInfoResponse createCollectInfo(CreateCollectInfoRequest request) throws JdcloudSdkException {
        return new CreateCollectInfoExecutor().client(this).execute(request);
    }

    /**
     * 获取解析配置
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeParserResponse describeParser(DescribeParserRequest request) throws JdcloudSdkException {
        return new DescribeParserExecutor().client(this).execute(request);
    }

    /**
     * 更新监控任务，日志监控任务不许重名。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateMetricTaskResponse updateMetricTask(UpdateMetricTaskRequest request) throws JdcloudSdkException {
        return new UpdateMetricTaskExecutor().client(this).execute(request);
    }

    /**
     * 删除指定监控任务。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteMetricTaskResponse deleteMetricTask(DeleteMetricTaskRequest request) throws JdcloudSdkException {
        return new DeleteMetricTaskExecutor().client(this).execute(request);
    }

    /**
     * 扫描日志
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetLogsResponse getLogs(GetLogsRequest request) throws JdcloudSdkException {
        return new GetLogsExecutor().client(this).execute(request);
    }

    /**
     * 增量更新采集实例列表。更新的动作支持 add 、 remove
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateCollectResourcesResponse updateCollectResources(UpdateCollectResourcesRequest request) throws JdcloudSdkException {
        return new UpdateCollectResourcesExecutor().client(this).execute(request);
    }

    /**
     * 创建日志主题，不可与当前日志集下现有日志主题重名。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateLogtopicResponse createLogtopic(CreateLogtopicRequest request) throws JdcloudSdkException {
        return new CreateLogtopicExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public LogsClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private LogsClient logsClient;

        public DefaultBuilder() {
            logsClient = new LogsClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            logsClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            logsClient.httpRequestConfig = config;
            return this;
        }

        public LogsClient build() throws JdcloudSdkException {

            if (logsClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                logsClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (logsClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("LogsClient build error: jdcloud credentials provider not set");
                }
            }
            if (logsClient.httpRequestConfig == null) {
                logsClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (logsClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("LogsClient build error: http request config not set");
                }
            }
            return logsClient;
        }

        public Builder environment(Environment environment) {
            logsClient.environment = environment;
            return this;
        }
    }
}
