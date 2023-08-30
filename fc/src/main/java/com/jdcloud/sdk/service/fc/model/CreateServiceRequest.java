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
 * 服务
 * 服务 相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.fc.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.fc.model.ServiceSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建服务

 */
public class CreateServiceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 服务 创建参数
     * Required:true
     */
    @Required
    private ServiceSpec serviceSpec;

    /**
     * 保证请求幂等性的字符串；最大长度64个ASCII字符
     */
    private String clientToken;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 服务 创建参数
     *
     * @return
     */
    public ServiceSpec getServiceSpec() {
        return serviceSpec;
    }

    /**
     * set 服务 创建参数
     *
     * @param serviceSpec
     */
    public void setServiceSpec(ServiceSpec serviceSpec) {
        this.serviceSpec = serviceSpec;
    }


    /**
     * get 保证请求幂等性的字符串；最大长度64个ASCII字符
     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 保证请求幂等性的字符串；最大长度64个ASCII字符
     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }


    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 服务 创建参数
     *
     * @param serviceSpec
     */
    public CreateServiceRequest serviceSpec(ServiceSpec serviceSpec) {
        this.serviceSpec = serviceSpec;
        return this;
    }


    /**
     * set 保证请求幂等性的字符串；最大长度64个ASCII字符
     *
     * @param clientToken
     */
    public CreateServiceRequest clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public CreateServiceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}