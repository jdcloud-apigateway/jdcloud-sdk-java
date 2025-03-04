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

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * systemLogHistorySpec
 */
public class SystemLogHistorySpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * appName
     * Required:true
     */
    @Required
    private String appName;

    /**
     * 精确匹配，true 或者 false
     */
    private Boolean exactMatch;

    /**
     * instance
     * Required:true
     */
    @Required
    private String instance;

    /**
     * 查询关键字
     */
    private String keyword;

    /**
     * logType
     * Required:true
     */
    @Required
    private String logType;

    /**
     * 排序，取值&quot;ASC&quot;或&quot;DESC&quot;，默认&quot;ASC&quot;
     */
    private String order;

    /**
     * 页数，从1开始
     */
    private Long page;

    /**
     * 每页日志条数
     */
    private Long size;

    /**
     * time
     * Required:true
     */
    @Required
    private TimestampRange time;



    /**
     * get appName
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set appName
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }


    /**
     * get 精确匹配，true 或者 false
     *
     * @return
     */
    public Boolean getExactMatch() {
        return exactMatch;
    }

    /**
     * set 精确匹配，true 或者 false
     *
     * @param exactMatch
     */
    public void setExactMatch(Boolean exactMatch) {
        this.exactMatch = exactMatch;
    }


    /**
     * get instance
     *
     * @return
     */
    public String getInstance() {
        return instance;
    }

    /**
     * set instance
     *
     * @param instance
     */
    public void setInstance(String instance) {
        this.instance = instance;
    }


    /**
     * get 查询关键字
     *
     * @return
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * set 查询关键字
     *
     * @param keyword
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }


    /**
     * get logType
     *
     * @return
     */
    public String getLogType() {
        return logType;
    }

    /**
     * set logType
     *
     * @param logType
     */
    public void setLogType(String logType) {
        this.logType = logType;
    }


    /**
     * get 排序，取值&quot;ASC&quot;或&quot;DESC&quot;，默认&quot;ASC&quot;
     *
     * @return
     */
    public String getOrder() {
        return order;
    }

    /**
     * set 排序，取值&quot;ASC&quot;或&quot;DESC&quot;，默认&quot;ASC&quot;
     *
     * @param order
     */
    public void setOrder(String order) {
        this.order = order;
    }


    /**
     * get 页数，从1开始
     *
     * @return
     */
    public Long getPage() {
        return page;
    }

    /**
     * set 页数，从1开始
     *
     * @param page
     */
    public void setPage(Long page) {
        this.page = page;
    }


    /**
     * get 每页日志条数
     *
     * @return
     */
    public Long getSize() {
        return size;
    }

    /**
     * set 每页日志条数
     *
     * @param size
     */
    public void setSize(Long size) {
        this.size = size;
    }


    /**
     * get time
     *
     * @return
     */
    public TimestampRange getTime() {
        return time;
    }

    /**
     * set time
     *
     * @param time
     */
    public void setTime(TimestampRange time) {
        this.time = time;
    }



    /**
     * set appName
     *
     * @param appName
     */
    public SystemLogHistorySpec appName(String appName) {
        this.appName = appName;
        return this;
    }


    /**
     * set 精确匹配，true 或者 false
     *
     * @param exactMatch
     */
    public SystemLogHistorySpec exactMatch(Boolean exactMatch) {
        this.exactMatch = exactMatch;
        return this;
    }


    /**
     * set instance
     *
     * @param instance
     */
    public SystemLogHistorySpec instance(String instance) {
        this.instance = instance;
        return this;
    }


    /**
     * set 查询关键字
     *
     * @param keyword
     */
    public SystemLogHistorySpec keyword(String keyword) {
        this.keyword = keyword;
        return this;
    }


    /**
     * set logType
     *
     * @param logType
     */
    public SystemLogHistorySpec logType(String logType) {
        this.logType = logType;
        return this;
    }


    /**
     * set 排序，取值&quot;ASC&quot;或&quot;DESC&quot;，默认&quot;ASC&quot;
     *
     * @param order
     */
    public SystemLogHistorySpec order(String order) {
        this.order = order;
        return this;
    }


    /**
     * set 页数，从1开始
     *
     * @param page
     */
    public SystemLogHistorySpec page(Long page) {
        this.page = page;
        return this;
    }


    /**
     * set 每页日志条数
     *
     * @param size
     */
    public SystemLogHistorySpec size(Long size) {
        this.size = size;
        return this;
    }


    /**
     * set time
     *
     * @param time
     */
    public SystemLogHistorySpec time(TimestampRange time) {
        this.time = time;
        return this;
    }


}