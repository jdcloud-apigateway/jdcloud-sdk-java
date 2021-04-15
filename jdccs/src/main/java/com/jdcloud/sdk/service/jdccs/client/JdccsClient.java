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
 * Cloud Cabinet Service API
 * 提供云托管服务的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdccs.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.jdccs.model.CreateAlarmRequest;
import com.jdcloud.sdk.service.jdccs.model.CreateAlarmResponse;
import com.jdcloud.sdk.service.jdccs.client.CreateAlarmExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeTicketsRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeTicketsResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeTicketsExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeAlarmHistoryRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeAlarmHistoryResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeAlarmHistoryExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeIdcsRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeIdcsResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeIdcsExecutor;
import com.jdcloud.sdk.service.jdccs.model.SwitchAlarmRequest;
import com.jdcloud.sdk.service.jdccs.model.SwitchAlarmResponse;
import com.jdcloud.sdk.service.jdccs.client.SwitchAlarmExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeOpenDevicesDataRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeOpenDevicesDataResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeOpenDevicesDataExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeBandwidthRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeBandwidthResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeBandwidthExecutor;
import com.jdcloud.sdk.service.jdccs.model.CreateGeneralServicesTicketRequest;
import com.jdcloud.sdk.service.jdccs.model.CreateGeneralServicesTicketResponse;
import com.jdcloud.sdk.service.jdccs.client.CreateGeneralServicesTicketExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeCabinetsRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeCabinetsResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeCabinetsExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeOpenDevicesRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeOpenDevicesResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeOpenDevicesExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeMetricDataRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeMetricDataResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeMetricDataExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeTicketRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeTicketResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeTicketExecutor;
import com.jdcloud.sdk.service.jdccs.model.LastDownsampleRequest;
import com.jdcloud.sdk.service.jdccs.model.LastDownsampleResponse;
import com.jdcloud.sdk.service.jdccs.client.LastDownsampleExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeRoomsRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeRoomsResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeRoomsExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeBandwidthTrafficRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeBandwidthTrafficResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeBandwidthTrafficExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeDeviceRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeDeviceResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeDeviceExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeBandwidthTrafficsRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeBandwidthTrafficsResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeBandwidthTrafficsExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeAlarmsRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeAlarmsResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeAlarmsExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeBandwidthsRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeBandwidthsResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeBandwidthsExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeDevicesRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeDevicesResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeDevicesExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeIpsRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeIpsResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeIpsExecutor;
import com.jdcloud.sdk.service.jdccs.model.UpdateAlarmRequest;
import com.jdcloud.sdk.service.jdccs.model.UpdateAlarmResponse;
import com.jdcloud.sdk.service.jdccs.client.UpdateAlarmExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeMetricsRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeMetricsResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeMetricsExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeTrafficSamplingRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeTrafficSamplingResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeTrafficSamplingExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeCabinetRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeCabinetResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeCabinetExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeIdcOverviewRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeIdcOverviewResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeIdcOverviewExecutor;
import com.jdcloud.sdk.service.jdccs.model.DescribeAlarmRequest;
import com.jdcloud.sdk.service.jdccs.model.DescribeAlarmResponse;
import com.jdcloud.sdk.service.jdccs.client.DescribeAlarmExecutor;
import com.jdcloud.sdk.service.jdccs.model.DeleteAlarmRequest;
import com.jdcloud.sdk.service.jdccs.model.DeleteAlarmResponse;
import com.jdcloud.sdk.service.jdccs.client.DeleteAlarmExecutor;

/**
 * jdccsClient
 */
public class JdccsClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.3";
    public final static String DefaultEndpoint = "jdccs.jdcloud-api.com";
    public final static String ServiceName = "jdccs";
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

    private JdccsClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 创建报警
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateAlarmResponse createAlarm(CreateAlarmRequest request) throws JdcloudSdkException {
        return new CreateAlarmExecutor().client(this).execute(request);
    }

    /**
     * 查询工单列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeTicketsResponse describeTickets(DescribeTicketsRequest request) throws JdcloudSdkException {
        return new DescribeTicketsExecutor().client(this).execute(request);
    }

    /**
     * 报警历史列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAlarmHistoryResponse describeAlarmHistory(DescribeAlarmHistoryRequest request) throws JdcloudSdkException {
        return new DescribeAlarmHistoryExecutor().client(this).execute(request);
    }

    /**
     * 查询IDC机房列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeIdcsResponse describeIdcs(DescribeIdcsRequest request) throws JdcloudSdkException {
        return new DescribeIdcsExecutor().client(this).execute(request);
    }

    /**
     * 启用、禁用报警
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SwitchAlarmResponse switchAlarm(SwitchAlarmRequest request) throws JdcloudSdkException {
        return new SwitchAlarmExecutor().client(this).execute(request);
    }

    /**
     * 查询开放设备数据信息接口
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeOpenDevicesDataResponse describeOpenDevicesData(DescribeOpenDevicesDataRequest request) throws JdcloudSdkException {
        return new DescribeOpenDevicesDataExecutor().client(this).execute(request);
    }

    /**
     * 查询带宽（出口）详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeBandwidthResponse describeBandwidth(DescribeBandwidthRequest request) throws JdcloudSdkException {
        return new DescribeBandwidthExecutor().client(this).execute(request);
    }

    /**
     * 提交通用服务工单
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateGeneralServicesTicketResponse createGeneralServicesTicket(CreateGeneralServicesTicketRequest request) throws JdcloudSdkException {
        return new CreateGeneralServicesTicketExecutor().client(this).execute(request);
    }

    /**
     * 查询机柜列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCabinetsResponse describeCabinets(DescribeCabinetsRequest request) throws JdcloudSdkException {
        return new DescribeCabinetsExecutor().client(this).execute(request);
    }

    /**
     * 查询开放设备列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeOpenDevicesResponse describeOpenDevices(DescribeOpenDevicesRequest request) throws JdcloudSdkException {
        return new DescribeOpenDevicesExecutor().client(this).execute(request);
    }

    /**
     * 查看某资源单个监控项数据
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeMetricDataResponse describeMetricData(DescribeMetricDataRequest request) throws JdcloudSdkException {
        return new DescribeMetricDataExecutor().client(this).execute(request);
    }

    /**
     * 查询工单详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeTicketResponse describeTicket(DescribeTicketRequest request) throws JdcloudSdkException {
        return new DescribeTicketExecutor().client(this).execute(request);
    }

    /**
     * 查看某资源的最后一个监控数据点（目前只支持机柜电流）
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public LastDownsampleResponse lastDownsample(LastDownsampleRequest request) throws JdcloudSdkException {
        return new LastDownsampleExecutor().client(this).execute(request);
    }

    /**
     * 查询机房房间号列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeRoomsResponse describeRooms(DescribeRoomsRequest request) throws JdcloudSdkException {
        return new DescribeRoomsExecutor().client(this).execute(request);
    }

    /**
     * 查询带宽（出口）流量（资源）详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeBandwidthTrafficResponse describeBandwidthTraffic(DescribeBandwidthTrafficRequest request) throws JdcloudSdkException {
        return new DescribeBandwidthTrafficExecutor().client(this).execute(request);
    }

    /**
     * 查询设备详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDeviceResponse describeDevice(DescribeDeviceRequest request) throws JdcloudSdkException {
        return new DescribeDeviceExecutor().client(this).execute(request);
    }

    /**
     * 查询带宽（出口）流量列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeBandwidthTrafficsResponse describeBandwidthTraffics(DescribeBandwidthTrafficsRequest request) throws JdcloudSdkException {
        return new DescribeBandwidthTrafficsExecutor().client(this).execute(request);
    }

    /**
     * 查询报警规则列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAlarmsResponse describeAlarms(DescribeAlarmsRequest request) throws JdcloudSdkException {
        return new DescribeAlarmsExecutor().client(this).execute(request);
    }

    /**
     * 查询带宽（出口）列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeBandwidthsResponse describeBandwidths(DescribeBandwidthsRequest request) throws JdcloudSdkException {
        return new DescribeBandwidthsExecutor().client(this).execute(request);
    }

    /**
     * 查询设备列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeDevicesResponse describeDevices(DescribeDevicesRequest request) throws JdcloudSdkException {
        return new DescribeDevicesExecutor().client(this).execute(request);
    }

    /**
     * 查询公网IP列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeIpsResponse describeIps(DescribeIpsRequest request) throws JdcloudSdkException {
        return new DescribeIpsExecutor().client(this).execute(request);
    }

    /**
     * 修改报警规则
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateAlarmResponse updateAlarm(UpdateAlarmRequest request) throws JdcloudSdkException {
        return new UpdateAlarmExecutor().client(this).execute(request);
    }

    /**
     * 查询可用监控项列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeMetricsResponse describeMetrics(DescribeMetricsRequest request) throws JdcloudSdkException {
        return new DescribeMetricsExecutor().client(this).execute(request);
    }

    /**
     * 根据IP网段查询流量采样数据
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeTrafficSamplingResponse describeTrafficSampling(DescribeTrafficSamplingRequest request) throws JdcloudSdkException {
        return new DescribeTrafficSamplingExecutor().client(this).execute(request);
    }

    /**
     * 查询机柜详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeCabinetResponse describeCabinet(DescribeCabinetRequest request) throws JdcloudSdkException {
        return new DescribeCabinetExecutor().client(this).execute(request);
    }

    /**
     * 查询机房资源概览
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeIdcOverviewResponse describeIdcOverview(DescribeIdcOverviewRequest request) throws JdcloudSdkException {
        return new DescribeIdcOverviewExecutor().client(this).execute(request);
    }

    /**
     * 查询报警规则详情
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeAlarmResponse describeAlarm(DescribeAlarmRequest request) throws JdcloudSdkException {
        return new DescribeAlarmExecutor().client(this).execute(request);
    }

    /**
     * 删除报警
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteAlarmResponse deleteAlarm(DeleteAlarmRequest request) throws JdcloudSdkException {
        return new DeleteAlarmExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public JdccsClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private JdccsClient jdccsClient;

        public DefaultBuilder() {
            jdccsClient = new JdccsClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            jdccsClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            jdccsClient.httpRequestConfig = config;
            return this;
        }

        public JdccsClient build() throws JdcloudSdkException {

            if (jdccsClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                jdccsClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (jdccsClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("JdccsClient build error: jdcloud credentials provider not set");
                }
            }
            if (jdccsClient.httpRequestConfig == null) {
                jdccsClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (jdccsClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("JdccsClient build error: http request config not set");
                }
            }
            return jdccsClient;
        }

        public Builder environment(Environment environment) {
            jdccsClient.environment = environment;
            return this;
        }
    }
}
