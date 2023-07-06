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
 * 弹性伸缩规则管理
 * 弹性伸缩规则管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ag.model;

import com.jdcloud.sdk.service.ag.model.UpdateSimpleAsRuleSpec;
import com.jdcloud.sdk.service.ag.model.UpdateTargetAsRuleSpec;
import com.jdcloud.sdk.service.ag.model.UpdateStepAsRuleSpec;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改伸缩规则
- 所有参数取值为字符串类型的都严格区分大小写
- 所有伸缩规则不允许更换高可用组
- 所有伸缩规则不允许修改伸缩规则类型
- 步进规则不允许修改监控类型
- 所有参数都为非必传，但是至少需要传入一个参数，否则报错
- 伸缩功能开启或者关闭的情况下，都支持调用此接口

 */
public class UpdateAsRuleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 伸缩规则名称，长度为1~32个字符，只允许中文、数字、大小写字母、英文下划线（_）、连字符（-）
     */
    private String name;

    /**
     * 伸缩规则描述，最大长度为256个字符
     */
    private String description;

    /**
     * 简单规则相关参数，当待修改的规则类型为&#x60;Simple&#x60;时，填写此参数才有效
     */
    private UpdateSimpleAsRuleSpec simpleAsRuleSpec;

    /**
     * 目标跟踪规则相关参数，当待修改的规则类型为&#x60;Target&#x60;时，填写此参数才有效
     */
    private UpdateTargetAsRuleSpec targetAsRuleSpec;

    /**
     * 步进规则相关参数，当待修改的规则类型为&#x60;Step&#x60;时，填写此参数才有效
     */
    private UpdateStepAsRuleSpec stepAsRuleSpec;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 伸缩规则ID
     * Required:true
     */
    @Required
    private String asRuleId;



    /**
     * get 伸缩规则名称，长度为1~32个字符，只允许中文、数字、大小写字母、英文下划线（_）、连字符（-）
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 伸缩规则名称，长度为1~32个字符，只允许中文、数字、大小写字母、英文下划线（_）、连字符（-）
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 伸缩规则描述，最大长度为256个字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 伸缩规则描述，最大长度为256个字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 简单规则相关参数，当待修改的规则类型为&#x60;Simple&#x60;时，填写此参数才有效
     *
     * @return
     */
    public UpdateSimpleAsRuleSpec getSimpleAsRuleSpec() {
        return simpleAsRuleSpec;
    }

    /**
     * set 简单规则相关参数，当待修改的规则类型为&#x60;Simple&#x60;时，填写此参数才有效
     *
     * @param simpleAsRuleSpec
     */
    public void setSimpleAsRuleSpec(UpdateSimpleAsRuleSpec simpleAsRuleSpec) {
        this.simpleAsRuleSpec = simpleAsRuleSpec;
    }


    /**
     * get 目标跟踪规则相关参数，当待修改的规则类型为&#x60;Target&#x60;时，填写此参数才有效
     *
     * @return
     */
    public UpdateTargetAsRuleSpec getTargetAsRuleSpec() {
        return targetAsRuleSpec;
    }

    /**
     * set 目标跟踪规则相关参数，当待修改的规则类型为&#x60;Target&#x60;时，填写此参数才有效
     *
     * @param targetAsRuleSpec
     */
    public void setTargetAsRuleSpec(UpdateTargetAsRuleSpec targetAsRuleSpec) {
        this.targetAsRuleSpec = targetAsRuleSpec;
    }


    /**
     * get 步进规则相关参数，当待修改的规则类型为&#x60;Step&#x60;时，填写此参数才有效
     *
     * @return
     */
    public UpdateStepAsRuleSpec getStepAsRuleSpec() {
        return stepAsRuleSpec;
    }

    /**
     * set 步进规则相关参数，当待修改的规则类型为&#x60;Step&#x60;时，填写此参数才有效
     *
     * @param stepAsRuleSpec
     */
    public void setStepAsRuleSpec(UpdateStepAsRuleSpec stepAsRuleSpec) {
        this.stepAsRuleSpec = stepAsRuleSpec;
    }


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 伸缩规则ID
     *
     * @return
     */
    public String getAsRuleId() {
        return asRuleId;
    }

    /**
     * set 伸缩规则ID
     *
     * @param asRuleId
     */
    public void setAsRuleId(String asRuleId) {
        this.asRuleId = asRuleId;
    }



    /**
     * set 伸缩规则名称，长度为1~32个字符，只允许中文、数字、大小写字母、英文下划线（_）、连字符（-）
     *
     * @param name
     */
    public UpdateAsRuleRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 伸缩规则描述，最大长度为256个字符
     *
     * @param description
     */
    public UpdateAsRuleRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 简单规则相关参数，当待修改的规则类型为&#x60;Simple&#x60;时，填写此参数才有效
     *
     * @param simpleAsRuleSpec
     */
    public UpdateAsRuleRequest simpleAsRuleSpec(UpdateSimpleAsRuleSpec simpleAsRuleSpec) {
        this.simpleAsRuleSpec = simpleAsRuleSpec;
        return this;
    }


    /**
     * set 目标跟踪规则相关参数，当待修改的规则类型为&#x60;Target&#x60;时，填写此参数才有效
     *
     * @param targetAsRuleSpec
     */
    public UpdateAsRuleRequest targetAsRuleSpec(UpdateTargetAsRuleSpec targetAsRuleSpec) {
        this.targetAsRuleSpec = targetAsRuleSpec;
        return this;
    }


    /**
     * set 步进规则相关参数，当待修改的规则类型为&#x60;Step&#x60;时，填写此参数才有效
     *
     * @param stepAsRuleSpec
     */
    public UpdateAsRuleRequest stepAsRuleSpec(UpdateStepAsRuleSpec stepAsRuleSpec) {
        this.stepAsRuleSpec = stepAsRuleSpec;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public UpdateAsRuleRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 伸缩规则ID
     *
     * @param asRuleId
     */
    public UpdateAsRuleRequest asRuleId(String asRuleId) {
        this.asRuleId = asRuleId;
        return this;
    }


}