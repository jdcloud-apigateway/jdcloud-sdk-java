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
 * 弹性伸缩告警任务管理
 * 弹性伸缩告警任务管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ag.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除告警任务
- 所有参数取值为字符串类型的都严格区分大小写
- 伸缩功能开启或者关闭的情况下，都支持调用此接口
- 目标跟踪规则生成的告警任务不允许删除
- 告警任务关联简单规则，告警任务可以删除
- 告警任务关联步进规则，告警任务不允许删除，但是可以删除步进规则，删除步进规则后，关联的告警任务会保留

 */
public class DeleteAsAlarmRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 告警任务ID
     * Required:true
     */
    @Required
    private String asAlarmId;



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
     * get 告警任务ID
     *
     * @return
     */
    public String getAsAlarmId() {
        return asAlarmId;
    }

    /**
     * set 告警任务ID
     *
     * @param asAlarmId
     */
    public void setAsAlarmId(String asAlarmId) {
        this.asAlarmId = asAlarmId;
    }



    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DeleteAsAlarmRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 告警任务ID
     *
     * @param asAlarmId
     */
    public DeleteAsAlarmRequest asAlarmId(String asAlarmId) {
        this.asAlarmId = asAlarmId;
        return this;
    }


}