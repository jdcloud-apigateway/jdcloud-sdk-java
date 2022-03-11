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
 * Storage-Analysis
 * 总空间使用情况、空间趋势、索引情况等接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.smartdba.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取空间趋势
 */
public class DescribeStorageTrendRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询开始时间，格式为：2006-01-02T15:04:05Z
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 查询截止时间，格式为：2006-01-02T15:04:05Z
     * Required:true
     */
    @Required
    private String endTime;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS 实例ID，唯一标识一个RDS实例。
     * Required:true
     */
    @Required
    private String instanceGid;


    /**
     * get 查询开始时间，格式为：2006-01-02T15:04:05Z
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询开始时间，格式为：2006-01-02T15:04:05Z
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询截止时间，格式为：2006-01-02T15:04:05Z
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询截止时间，格式为：2006-01-02T15:04:05Z
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get RDS 实例ID，唯一标识一个RDS实例。
     *
     * @return
     */
    public String getInstanceGid() {
        return instanceGid;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例。
     *
     * @param instanceGid
     */
    public void setInstanceGid(String instanceGid) {
        this.instanceGid = instanceGid;
    }


    /**
     * set 查询开始时间，格式为：2006-01-02T15:04:05Z
     *
     * @param startTime
     */
    public DescribeStorageTrendRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询截止时间，格式为：2006-01-02T15:04:05Z
     *
     * @param endTime
     */
    public DescribeStorageTrendRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public DescribeStorageTrendRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例。
     *
     * @param instanceGid
     */
    public DescribeStorageTrendRequest instanceGid(String instanceGid) {
        this.instanceGid = instanceGid;
        return this;
    }


}