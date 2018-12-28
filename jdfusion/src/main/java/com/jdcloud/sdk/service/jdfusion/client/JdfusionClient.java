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
 * JD Fusion
 * 云主机、网卡、云硬盘、网络与相关、关系型数据库、对象存储等相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.jdfusion.model.GetVmInstanceTypesRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVmInstanceTypesResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVmInstanceTypesExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetTaskInfoHistoryByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetTaskInfoHistoryByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetTaskInfoHistoryByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcNetworkInterfacesRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcNetworkInterfacesResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVpcNetworkInterfacesExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcSlbsRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcSlbsResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVpcSlbsExecutor;
import com.jdcloud.sdk.service.jdfusion.model.AttachVpcNetworkInterfaceByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.AttachVpcNetworkInterfaceByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.AttachVpcNetworkInterfaceByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.CreateDiskRequest;
import com.jdcloud.sdk.service.jdfusion.model.CreateDiskResponse;
import com.jdcloud.sdk.service.jdfusion.client.CreateDiskExecutor;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcNetworkInterfaceRequest;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcNetworkInterfaceResponse;
import com.jdcloud.sdk.service.jdfusion.client.CreateVpcNetworkInterfaceExecutor;
import com.jdcloud.sdk.service.jdfusion.model.RebootVmInstanceByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.RebootVmInstanceByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.RebootVmInstanceByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetDiskByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetDiskByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetDiskByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVmInstancesByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVmInstancesByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVmInstancesByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcRequest;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcResponse;
import com.jdcloud.sdk.service.jdfusion.client.CreateVpcExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcNetworkInterfaceByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcNetworkInterfaceByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVpcNetworkInterfaceByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcSlbByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcSlbByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVpcSlbByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcSubnetRequest;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcSubnetResponse;
import com.jdcloud.sdk.service.jdfusion.client.CreateVpcSubnetExecutor;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVpcNetworkInterfaceByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVpcNetworkInterfaceByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.DeleteVpcNetworkInterfaceByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.DetachVpcNetworkInterfaceByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.DetachVpcNetworkInterfaceByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.DetachVpcNetworkInterfaceByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.RegistCloudInfoRequest;
import com.jdcloud.sdk.service.jdfusion.model.RegistCloudInfoResponse;
import com.jdcloud.sdk.service.jdfusion.client.RegistCloudInfoExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcEipByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcEipByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVpcEipByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVpcSecurityGroupByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVpcSecurityGroupByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.DeleteVpcSecurityGroupByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.RemoveDiskByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.RemoveDiskByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.RemoveDiskByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcEipRequest;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcEipResponse;
import com.jdcloud.sdk.service.jdfusion.client.CreateVpcEipExecutor;
import com.jdcloud.sdk.service.jdfusion.model.AssociateVpcEipByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.AssociateVpcEipByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.AssociateVpcEipByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.CreateVmInstanceRequest;
import com.jdcloud.sdk.service.jdfusion.model.CreateVmInstanceResponse;
import com.jdcloud.sdk.service.jdfusion.client.CreateVmInstanceExecutor;
import com.jdcloud.sdk.service.jdfusion.model.UnregistCloudInfoRequest;
import com.jdcloud.sdk.service.jdfusion.model.UnregistCloudInfoResponse;
import com.jdcloud.sdk.service.jdfusion.client.UnregistCloudInfoExecutor;
import com.jdcloud.sdk.service.jdfusion.model.DisassociateVpcEipByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.DisassociateVpcEipByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.DisassociateVpcEipByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcSecurityGroupByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcSecurityGroupByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVpcSecurityGroupByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVpcByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVpcByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.DeleteVpcByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.StartVmInstanceByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.StartVmInstanceByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.StartVmInstanceByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetCloudInfoByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetCloudInfoByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetCloudInfoByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.StopVmInstanceByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.StopVmInstanceByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.StopVmInstanceByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVmInstanceByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVmInstanceByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.DeleteVmInstanceByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVmKeypairByNameRequest;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVmKeypairByNameResponse;
import com.jdcloud.sdk.service.jdfusion.client.DeleteVmKeypairByNameExecutor;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVpcSubnetByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVpcSubnetByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.DeleteVpcSubnetByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVpcByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVmInstancesRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVmInstancesResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVmInstancesExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcSubnetByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcSubnetByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVpcSubnetByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.CreateVmKeypairRequest;
import com.jdcloud.sdk.service.jdfusion.model.CreateVmKeypairResponse;
import com.jdcloud.sdk.service.jdfusion.client.CreateVmKeypairExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcEipsRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcEipsResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVpcEipsExecutor;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcSlbRequest;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcSlbResponse;
import com.jdcloud.sdk.service.jdfusion.client.CreateVpcSlbExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcSecurityGroupsRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcSecurityGroupsResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVpcSecurityGroupsExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVmKeypairsByNameRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVmKeypairsByNameResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVmKeypairsByNameExecutor;
import com.jdcloud.sdk.service.jdfusion.model.AttachDiskToVmInstanceByDiskIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.AttachDiskToVmInstanceByDiskIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.AttachDiskToVmInstanceByDiskIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVpcEipByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVpcEipByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.DeleteVpcEipByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcSecurityGroupRequest;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcSecurityGroupResponse;
import com.jdcloud.sdk.service.jdfusion.client.CreateVpcSecurityGroupExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcSubnetsRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcSubnetsResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVpcSubnetsExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcVServerGroupsRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcVServerGroupsResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVpcVServerGroupsExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcsRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVpcsResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVpcsExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetTaskInfoByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetTaskInfoByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetTaskInfoByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetCloudInfosRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetCloudInfosResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetCloudInfosExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVmKeypairsRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVmKeypairsResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVmKeypairsExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetVmImagesRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetVmImagesResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetVmImagesExecutor;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVpcSlbByIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.DeleteVpcSlbByIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.DeleteVpcSlbByIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcVServerGroupRequest;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcVServerGroupResponse;
import com.jdcloud.sdk.service.jdfusion.client.CreateVpcVServerGroupExecutor;
import com.jdcloud.sdk.service.jdfusion.model.GetDisksRequest;
import com.jdcloud.sdk.service.jdfusion.model.GetDisksResponse;
import com.jdcloud.sdk.service.jdfusion.client.GetDisksExecutor;
import com.jdcloud.sdk.service.jdfusion.model.DetachDiskToVmInstanceByDiskIdRequest;
import com.jdcloud.sdk.service.jdfusion.model.DetachDiskToVmInstanceByDiskIdResponse;
import com.jdcloud.sdk.service.jdfusion.client.DetachDiskToVmInstanceByDiskIdExecutor;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcLBHttpListenerRequest;
import com.jdcloud.sdk.service.jdfusion.model.CreateVpcLBHttpListenerResponse;
import com.jdcloud.sdk.service.jdfusion.client.CreateVpcLBHttpListenerExecutor;

/**
 * jdfusionClient
 */
public class JdfusionClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.8";
    public final static String DefaultEndpoint = "jdfusion.jdcloud-api.com";
    public final static String ServiceName = "jdfusion";
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

    private JdfusionClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 虚拟机规格列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVmInstanceTypesResponse getVmInstanceTypes(GetVmInstanceTypesRequest request) throws JdcloudSdkException {
        return new GetVmInstanceTypesExecutor().client(this).execute(request);
    }

    /**
     * 读取指定ID的运行结果和运行状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetTaskInfoHistoryByIdResponse getTaskInfoHistoryById(GetTaskInfoHistoryByIdRequest request) throws JdcloudSdkException {
        return new GetTaskInfoHistoryByIdExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的网卡资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVpcNetworkInterfacesResponse getVpcNetworkInterfaces(GetVpcNetworkInterfacesRequest request) throws JdcloudSdkException {
        return new GetVpcNetworkInterfacesExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的负载均衡资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVpcSlbsResponse getVpcSlbs(GetVpcSlbsRequest request) throws JdcloudSdkException {
        return new GetVpcSlbsExecutor().client(this).execute(request);
    }

    /**
     * 网卡挂载虚拟机
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AttachVpcNetworkInterfaceByIdResponse attachVpcNetworkInterfaceById(AttachVpcNetworkInterfaceByIdRequest request) throws JdcloudSdkException {
        return new AttachVpcNetworkInterfaceByIdExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商创建云硬盘
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateDiskResponse createDisk(CreateDiskRequest request) throws JdcloudSdkException {
        return new CreateDiskExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商创建网卡
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVpcNetworkInterfaceResponse createVpcNetworkInterface(CreateVpcNetworkInterfaceRequest request) throws JdcloudSdkException {
        return new CreateVpcNetworkInterfaceExecutor().client(this).execute(request);
    }

    /**
     * 只能重启状态为 运行中（Running）的实例。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RebootVmInstanceByIdResponse rebootVmInstanceById(RebootVmInstanceByIdRequest request) throws JdcloudSdkException {
        return new RebootVmInstanceByIdExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的云硬盘资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetDiskByIdResponse getDiskById(GetDiskByIdRequest request) throws JdcloudSdkException {
        return new GetDiskByIdExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的VM资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVmInstancesByIdResponse getVmInstancesById(GetVmInstancesByIdRequest request) throws JdcloudSdkException {
        return new GetVmInstancesByIdExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商创建私有网络
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVpcResponse createVpc(CreateVpcRequest request) throws JdcloudSdkException {
        return new CreateVpcExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的网卡资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVpcNetworkInterfaceByIdResponse getVpcNetworkInterfaceById(GetVpcNetworkInterfaceByIdRequest request) throws JdcloudSdkException {
        return new GetVpcNetworkInterfaceByIdExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的SLB资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVpcSlbByIdResponse getVpcSlbById(GetVpcSlbByIdRequest request) throws JdcloudSdkException {
        return new GetVpcSlbByIdExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商创建子网
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVpcSubnetResponse createVpcSubnet(CreateVpcSubnetRequest request) throws JdcloudSdkException {
        return new CreateVpcSubnetExecutor().client(this).execute(request);
    }

    /**
     * 删除弹性网卡
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVpcNetworkInterfaceByIdResponse deleteVpcNetworkInterfaceById(DeleteVpcNetworkInterfaceByIdRequest request) throws JdcloudSdkException {
        return new DeleteVpcNetworkInterfaceByIdExecutor().client(this).execute(request);
    }

    /**
     * 卸载网卡
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DetachVpcNetworkInterfaceByIdResponse detachVpcNetworkInterfaceById(DetachVpcNetworkInterfaceByIdRequest request) throws JdcloudSdkException {
        return new DetachVpcNetworkInterfaceByIdExecutor().client(this).execute(request);
    }

    /**
     * 为指定用户关联云
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RegistCloudInfoResponse registCloudInfo(RegistCloudInfoRequest request) throws JdcloudSdkException {
        return new RegistCloudInfoExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的公网IP资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVpcEipByIdResponse getVpcEipById(GetVpcEipByIdRequest request) throws JdcloudSdkException {
        return new GetVpcEipByIdExecutor().client(this).execute(request);
    }

    /**
     * 删除安全组
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVpcSecurityGroupByIdResponse deleteVpcSecurityGroupById(DeleteVpcSecurityGroupByIdRequest request) throws JdcloudSdkException {
        return new DeleteVpcSecurityGroupByIdExecutor().client(this).execute(request);
    }

    /**
     * 删除云硬盘
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public RemoveDiskByIdResponse removeDiskById(RemoveDiskByIdRequest request) throws JdcloudSdkException {
        return new RemoveDiskByIdExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商分配公网IP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVpcEipResponse createVpcEip(CreateVpcEipRequest request) throws JdcloudSdkException {
        return new CreateVpcEipExecutor().client(this).execute(request);
    }

    /**
     * 弹性公网IP绑定到虚拟机
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AssociateVpcEipByIdResponse associateVpcEipById(AssociateVpcEipByIdRequest request) throws JdcloudSdkException {
        return new AssociateVpcEipByIdExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商创建虚拟机
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVmInstanceResponse createVmInstance(CreateVmInstanceRequest request) throws JdcloudSdkException {
        return new CreateVmInstanceExecutor().client(this).execute(request);
    }

    /**
     * 获取指定云信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UnregistCloudInfoResponse unregistCloudInfo(UnregistCloudInfoRequest request) throws JdcloudSdkException {
        return new UnregistCloudInfoExecutor().client(this).execute(request);
    }

    /**
     * 解绑公网IP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DisassociateVpcEipByIdResponse disassociateVpcEipById(DisassociateVpcEipByIdRequest request) throws JdcloudSdkException {
        return new DisassociateVpcEipByIdExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的安全组资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVpcSecurityGroupByIdResponse getVpcSecurityGroupById(GetVpcSecurityGroupByIdRequest request) throws JdcloudSdkException {
        return new GetVpcSecurityGroupByIdExecutor().client(this).execute(request);
    }

    /**
     * 删除VPC
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVpcByIdResponse deleteVpcById(DeleteVpcByIdRequest request) throws JdcloudSdkException {
        return new DeleteVpcByIdExecutor().client(this).execute(request);
    }

    /**
     * 启动一台实例。实例状态必须为 已停止（Stopped），才可以调用该接口。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StartVmInstanceByIdResponse startVmInstanceById(StartVmInstanceByIdRequest request) throws JdcloudSdkException {
        return new StartVmInstanceByIdExecutor().client(this).execute(request);
    }

    /**
     * 获取指定云信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetCloudInfoByIdResponse getCloudInfoById(GetCloudInfoByIdRequest request) throws JdcloudSdkException {
        return new GetCloudInfoByIdExecutor().client(this).execute(request);
    }

    /**
     * 停止运行一台实例。只有状态为 运行中（Running）的实例才可以进行此操作。
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public StopVmInstanceByIdResponse stopVmInstanceById(StopVmInstanceByIdRequest request) throws JdcloudSdkException {
        return new StopVmInstanceByIdExecutor().client(this).execute(request);
    }

    /**
     * 通过虚拟机id删除虚拟机
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVmInstanceByIdResponse deleteVmInstanceById(DeleteVmInstanceByIdRequest request) throws JdcloudSdkException {
        return new DeleteVmInstanceByIdExecutor().client(this).execute(request);
    }

    /**
     * 删除密钥对
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVmKeypairByNameResponse deleteVmKeypairByName(DeleteVmKeypairByNameRequest request) throws JdcloudSdkException {
        return new DeleteVmKeypairByNameExecutor().client(this).execute(request);
    }

    /**
     * 删除子网
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVpcSubnetByIdResponse deleteVpcSubnetById(DeleteVpcSubnetByIdRequest request) throws JdcloudSdkException {
        return new DeleteVpcSubnetByIdExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的VPC资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVpcByIdResponse getVpcById(GetVpcByIdRequest request) throws JdcloudSdkException {
        return new GetVpcByIdExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的虚拟机资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVmInstancesResponse getVmInstances(GetVmInstancesRequest request) throws JdcloudSdkException {
        return new GetVmInstancesExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的subnet资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVpcSubnetByIdResponse getVpcSubnetById(GetVpcSubnetByIdRequest request) throws JdcloudSdkException {
        return new GetVpcSubnetByIdExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商创建密钥对
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVmKeypairResponse createVmKeypair(CreateVmKeypairRequest request) throws JdcloudSdkException {
        return new CreateVmKeypairExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的公网IP资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVpcEipsResponse getVpcEips(GetVpcEipsRequest request) throws JdcloudSdkException {
        return new GetVpcEipsExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商创建负载均衡
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVpcSlbResponse createVpcSlb(CreateVpcSlbRequest request) throws JdcloudSdkException {
        return new CreateVpcSlbExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的安全组资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVpcSecurityGroupsResponse getVpcSecurityGroups(GetVpcSecurityGroupsRequest request) throws JdcloudSdkException {
        return new GetVpcSecurityGroupsExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的密钥对资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVmKeypairsByNameResponse getVmKeypairsByName(GetVmKeypairsByNameRequest request) throws JdcloudSdkException {
        return new GetVmKeypairsByNameExecutor().client(this).execute(request);
    }

    /**
     * 云硬盘挂载至虚拟机
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AttachDiskToVmInstanceByDiskIdResponse attachDiskToVmInstanceByDiskId(AttachDiskToVmInstanceByDiskIdRequest request) throws JdcloudSdkException {
        return new AttachDiskToVmInstanceByDiskIdExecutor().client(this).execute(request);
    }

    /**
     * 释放公网IP
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVpcEipByIdResponse deleteVpcEipById(DeleteVpcEipByIdRequest request) throws JdcloudSdkException {
        return new DeleteVpcEipByIdExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商创建安全组
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVpcSecurityGroupResponse createVpcSecurityGroup(CreateVpcSecurityGroupRequest request) throws JdcloudSdkException {
        return new CreateVpcSecurityGroupExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的subnet资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVpcSubnetsResponse getVpcSubnets(GetVpcSubnetsRequest request) throws JdcloudSdkException {
        return new GetVpcSubnetsExecutor().client(this).execute(request);
    }

    /**
     * 根据过滤条件，取得服务器组的信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVpcVServerGroupsResponse getVpcVServerGroups(GetVpcVServerGroupsRequest request) throws JdcloudSdkException {
        return new GetVpcVServerGroupsExecutor().client(this).execute(request);
    }

    /**
     * 查询私有网络资源列表
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVpcsResponse getVpcs(GetVpcsRequest request) throws JdcloudSdkException {
        return new GetVpcsExecutor().client(this).execute(request);
    }

    /**
     * 读取指定ID的运行结果和运行状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetTaskInfoByIdResponse getTaskInfoById(GetTaskInfoByIdRequest request) throws JdcloudSdkException {
        return new GetTaskInfoByIdExecutor().client(this).execute(request);
    }

    /**
     * 获取当前用户的云注册信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetCloudInfosResponse getCloudInfos(GetCloudInfosRequest request) throws JdcloudSdkException {
        return new GetCloudInfosExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的密钥对资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVmKeypairsResponse getVmKeypairs(GetVmKeypairsRequest request) throws JdcloudSdkException {
        return new GetVmKeypairsExecutor().client(this).execute(request);
    }

    /**
     * 根据过滤条件，取得镜像资源的信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetVmImagesResponse getVmImages(GetVmImagesRequest request) throws JdcloudSdkException {
        return new GetVmImagesExecutor().client(this).execute(request);
    }

    /**
     * 删除SLB
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DeleteVpcSlbByIdResponse deleteVpcSlbById(DeleteVpcSlbByIdRequest request) throws JdcloudSdkException {
        return new DeleteVpcSlbByIdExecutor().client(this).execute(request);
    }

    /**
     * 创建虚拟服务器组，并添加后端服务器
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVpcVServerGroupResponse createVpcVServerGroup(CreateVpcVServerGroupRequest request) throws JdcloudSdkException {
        return new CreateVpcVServerGroupExecutor().client(this).execute(request);
    }

    /**
     * 根据云提供商查询对应的云硬盘资源信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetDisksResponse getDisks(GetDisksRequest request) throws JdcloudSdkException {
        return new GetDisksExecutor().client(this).execute(request);
    }

    /**
     * 从虚拟机卸载云硬盘
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DetachDiskToVmInstanceByDiskIdResponse detachDiskToVmInstanceByDiskId(DetachDiskToVmInstanceByDiskIdRequest request) throws JdcloudSdkException {
        return new DetachDiskToVmInstanceByDiskIdExecutor().client(this).execute(request);
    }

    /**
     * 创建HTTP监听器
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public CreateVpcLBHttpListenerResponse createVpcLBHttpListener(CreateVpcLBHttpListenerRequest request) throws JdcloudSdkException {
        return new CreateVpcLBHttpListenerExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public JdfusionClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private JdfusionClient jdfusionClient;

        public DefaultBuilder() {
            jdfusionClient = new JdfusionClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            jdfusionClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            jdfusionClient.httpRequestConfig = config;
            return this;
        }

        public JdfusionClient build() throws JdcloudSdkException {

            if (jdfusionClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                jdfusionClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (jdfusionClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("JdfusionClient build error: jdcloud credentials provider not set");
                }
            }
            if (jdfusionClient.httpRequestConfig == null) {
                jdfusionClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (jdfusionClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("JdfusionClient build error: http request config not set");
                }
            }
            return jdfusionClient;
        }

        public Builder environment(Environment environment) {
            jdfusionClient.environment = environment;
            return this;
        }
    }
}
