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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * getChartReq
 */
public class GetChartReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例id，代表要查询的WAF实例，为空时表示当前用户下的所有实例
     */
    private String wafInstanceId;

    /**
     * 域名，为空时表示当前实例下的所有域名
     */
    private String domain;

    /**
     * 开始时间戳，单位秒，时间间隔要求大于5分钟，小于30天。
     * Required:true
     */
    @Required
    private Integer start;

    /**
     * 结束时间戳，单位秒，时间间隔要求大于5分钟，小于30天。
     * Required:true
     */
    @Required
    private Integer end;

    /**
     * true表示和值图，false表示均值图，仅getBpsData， getQpsData时有效。
     */
    private Boolean isSum;

    /**
     * true表示查找命中不同规则的waf攻击对应数目。
     */
    private Boolean isWafRule;

    /**
     * true表示源站返回给waf的异常响应，false表示waf返回给客户端的异常响应，仅getExceptionData时有效。
     */
    private Boolean isRs;

    /**
     * ua表示返回ua的饼图数据，仅getPieChart时有效。
     */
    private String pieItem;

    /**
     * 指定状态码，仅getStatusCodeInfo时有效
     */
    private List<String> statusCode;

    /**
     * true表示获取状态码统计图、占比图。
     */
    private Boolean isStaCode;


    /**
     * get 实例id，代表要查询的WAF实例，为空时表示当前用户下的所有实例
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set 实例id，代表要查询的WAF实例，为空时表示当前用户下的所有实例
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }

    /**
     * get 域名，为空时表示当前实例下的所有域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名，为空时表示当前实例下的所有域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get 开始时间戳，单位秒，时间间隔要求大于5分钟，小于30天。
     *
     * @return
     */
    public Integer getStart() {
        return start;
    }

    /**
     * set 开始时间戳，单位秒，时间间隔要求大于5分钟，小于30天。
     *
     * @param start
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * get 结束时间戳，单位秒，时间间隔要求大于5分钟，小于30天。
     *
     * @return
     */
    public Integer getEnd() {
        return end;
    }

    /**
     * set 结束时间戳，单位秒，时间间隔要求大于5分钟，小于30天。
     *
     * @param end
     */
    public void setEnd(Integer end) {
        this.end = end;
    }

    /**
     * get true表示和值图，false表示均值图，仅getBpsData， getQpsData时有效。
     *
     * @return
     */
    public Boolean getIsSum() {
        return isSum;
    }

    /**
     * set true表示和值图，false表示均值图，仅getBpsData， getQpsData时有效。
     *
     * @param isSum
     */
    public void setIsSum(Boolean isSum) {
        this.isSum = isSum;
    }

    /**
     * get true表示查找命中不同规则的waf攻击对应数目。
     *
     * @return
     */
    public Boolean getIsWafRule() {
        return isWafRule;
    }

    /**
     * set true表示查找命中不同规则的waf攻击对应数目。
     *
     * @param isWafRule
     */
    public void setIsWafRule(Boolean isWafRule) {
        this.isWafRule = isWafRule;
    }

    /**
     * get true表示源站返回给waf的异常响应，false表示waf返回给客户端的异常响应，仅getExceptionData时有效。
     *
     * @return
     */
    public Boolean getIsRs() {
        return isRs;
    }

    /**
     * set true表示源站返回给waf的异常响应，false表示waf返回给客户端的异常响应，仅getExceptionData时有效。
     *
     * @param isRs
     */
    public void setIsRs(Boolean isRs) {
        this.isRs = isRs;
    }

    /**
     * get ua表示返回ua的饼图数据，仅getPieChart时有效。
     *
     * @return
     */
    public String getPieItem() {
        return pieItem;
    }

    /**
     * set ua表示返回ua的饼图数据，仅getPieChart时有效。
     *
     * @param pieItem
     */
    public void setPieItem(String pieItem) {
        this.pieItem = pieItem;
    }

    /**
     * get 指定状态码，仅getStatusCodeInfo时有效
     *
     * @return
     */
    public List<String> getStatusCode() {
        return statusCode;
    }

    /**
     * set 指定状态码，仅getStatusCodeInfo时有效
     *
     * @param statusCode
     */
    public void setStatusCode(List<String> statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * get true表示获取状态码统计图、占比图。
     *
     * @return
     */
    public Boolean getIsStaCode() {
        return isStaCode;
    }

    /**
     * set true表示获取状态码统计图、占比图。
     *
     * @param isStaCode
     */
    public void setIsStaCode(Boolean isStaCode) {
        this.isStaCode = isStaCode;
    }


    /**
     * set 实例id，代表要查询的WAF实例，为空时表示当前用户下的所有实例
     *
     * @param wafInstanceId
     */
    public GetChartReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * set 域名，为空时表示当前实例下的所有域名
     *
     * @param domain
     */
    public GetChartReq domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 开始时间戳，单位秒，时间间隔要求大于5分钟，小于30天。
     *
     * @param start
     */
    public GetChartReq start(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * set 结束时间戳，单位秒，时间间隔要求大于5分钟，小于30天。
     *
     * @param end
     */
    public GetChartReq end(Integer end) {
        this.end = end;
        return this;
    }

    /**
     * set true表示和值图，false表示均值图，仅getBpsData， getQpsData时有效。
     *
     * @param isSum
     */
    public GetChartReq isSum(Boolean isSum) {
        this.isSum = isSum;
        return this;
    }

    /**
     * set true表示查找命中不同规则的waf攻击对应数目。
     *
     * @param isWafRule
     */
    public GetChartReq isWafRule(Boolean isWafRule) {
        this.isWafRule = isWafRule;
        return this;
    }

    /**
     * set true表示源站返回给waf的异常响应，false表示waf返回给客户端的异常响应，仅getExceptionData时有效。
     *
     * @param isRs
     */
    public GetChartReq isRs(Boolean isRs) {
        this.isRs = isRs;
        return this;
    }

    /**
     * set ua表示返回ua的饼图数据，仅getPieChart时有效。
     *
     * @param pieItem
     */
    public GetChartReq pieItem(String pieItem) {
        this.pieItem = pieItem;
        return this;
    }

    /**
     * set 指定状态码，仅getStatusCodeInfo时有效
     *
     * @param statusCode
     */
    public GetChartReq statusCode(List<String> statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * set true表示获取状态码统计图、占比图。
     *
     * @param isStaCode
     */
    public GetChartReq isStaCode(Boolean isStaCode) {
        this.isStaCode = isStaCode;
        return this;
    }


    /**
     * add item to 指定状态码，仅getStatusCodeInfo时有效
     *
     * @param statusCode
     */
    public void addStatusCode(String statusCode) {
        if (this.statusCode == null) {
            this.statusCode = new ArrayList<>();
        }
        this.statusCode.add(statusCode);
    }

}