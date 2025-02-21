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
 * PodTemplate
 * Pod模板相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import com.jdcloud.sdk.service.pod.model.UpdatePodTemplateSpec;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改Pod模板的配置
 */
public class UpdatePodTemplateRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pod模板的名称，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     */
    private String name;

    /**
     * pod模板描述，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     */
    private String description;

    /**
     * pod模板修改参。如果没有指定，那么就意味着不进行修改。在不特殊说明的情况下，这个规则也适用于此结构体内的其他字段。
     */
    private UpdatePodTemplateSpec podTemplateSpec;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Pod模板ID
     * Required:true
     */
    @Required
    private String podTemplateId;



    /**
     * get pod模板的名称，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set pod模板的名称，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get pod模板描述，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set pod模板描述，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get pod模板修改参。如果没有指定，那么就意味着不进行修改。在不特殊说明的情况下，这个规则也适用于此结构体内的其他字段。
     *
     * @return
     */
    public UpdatePodTemplateSpec getPodTemplateSpec() {
        return podTemplateSpec;
    }

    /**
     * set pod模板修改参。如果没有指定，那么就意味着不进行修改。在不特殊说明的情况下，这个规则也适用于此结构体内的其他字段。
     *
     * @param podTemplateSpec
     */
    public void setPodTemplateSpec(UpdatePodTemplateSpec podTemplateSpec) {
        this.podTemplateSpec = podTemplateSpec;
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
     * get Pod模板ID
     *
     * @return
     */
    public String getPodTemplateId() {
        return podTemplateId;
    }

    /**
     * set Pod模板ID
     *
     * @param podTemplateId
     */
    public void setPodTemplateId(String podTemplateId) {
        this.podTemplateId = podTemplateId;
    }



    /**
     * set pod模板的名称，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @param name
     */
    public UpdatePodTemplateRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set pod模板描述，参考 [公共参数规范](https://docs.jdcloud.com/virtual-machines/api/general_parameters)。
     *
     * @param description
     */
    public UpdatePodTemplateRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set pod模板修改参。如果没有指定，那么就意味着不进行修改。在不特殊说明的情况下，这个规则也适用于此结构体内的其他字段。
     *
     * @param podTemplateSpec
     */
    public UpdatePodTemplateRequest podTemplateSpec(UpdatePodTemplateSpec podTemplateSpec) {
        this.podTemplateSpec = podTemplateSpec;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public UpdatePodTemplateRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set Pod模板ID
     *
     * @param podTemplateId
     */
    public UpdatePodTemplateRequest podTemplateId(String podTemplateId) {
        this.podTemplateId = podTemplateId;
        return this;
    }


}