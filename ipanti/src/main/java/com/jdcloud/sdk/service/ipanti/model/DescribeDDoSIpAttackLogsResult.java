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
 * Anti DDoS Pro Attack Log APIs
 * Anti DDoS Pro Attack Log APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.ipanti.model.DDoSIpAttackLog;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询高防IP的 DDoS 攻击日志, 仅BGP实例返回的是IP级别的攻击记录, 非BGP实例返回的仍是实例级别的攻击记录(serviceIp 字段为空)
参数 serviceIp 优先级大于 instanceId.
- 指定 serviceIp 参数时, 忽略 instanceId 参数, 查询 ip 相关攻击记录.
- 未指定 serviceIp 时, 查询 instanceId 指定实例相关攻击记录.
- serviceIp 和 instanceId 均未指定时, 查询用户所有攻击记录

 */
public class DescribeDDoSIpAttackLogsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dataList
     */
    private List<DDoSIpAttackLog> dataList;

    /**
     * 当前页数量
     */
    private Integer currentCount;

    /**
     * 实例总数
     */
    private Integer totalCount;

    /**
     * 总页数
     */
    private Integer totalPage;


    /**
     * get dataList
     *
     * @return
     */
    public List<DDoSIpAttackLog> getDataList() {
        return dataList;
    }

    /**
     * set dataList
     *
     * @param dataList
     */
    public void setDataList(List<DDoSIpAttackLog> dataList) {
        this.dataList = dataList;
    }

    /**
     * get 当前页数量
     *
     * @return
     */
    public Integer getCurrentCount() {
        return currentCount;
    }

    /**
     * set 当前页数量
     *
     * @param currentCount
     */
    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    /**
     * get 实例总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 实例总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get 总页数
     *
     * @return
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * set 总页数
     *
     * @param totalPage
     */
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }


    /**
     * set dataList
     *
     * @param dataList
     */
    public DescribeDDoSIpAttackLogsResult dataList(List<DDoSIpAttackLog> dataList) {
        this.dataList = dataList;
        return this;
    }

    /**
     * set 当前页数量
     *
     * @param currentCount
     */
    public DescribeDDoSIpAttackLogsResult currentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set 实例总数
     *
     * @param totalCount
     */
    public DescribeDDoSIpAttackLogsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set 总页数
     *
     * @param totalPage
     */
    public DescribeDDoSIpAttackLogsResult totalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }


    /**
     * add item to dataList
     *
     * @param dataList
     */
    public void addDataList(DDoSIpAttackLog dataList) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataList);
    }

}