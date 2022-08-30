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

package com.jdcloud.sdk.service.cdn.model;


/**
 * forbiddenStreamHistoryItem
 */
public class ForbiddenStreamHistoryItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 禁播流
     */
    private String stream;

    /**
     * 封禁推流的app
     */
    private String app;

    /**
     * 封禁的IP
     */
    private String publishIp;

    /**
     * 禁播类型:forever永不禁播limit限时禁播
     */
    private String forbiddenType;

    /**
     * 禁播时长
     */
    private Long ttl;

    /**
     * 开始禁播时间
     */
    private String startTime;

    /**
     * 结束禁播时间
     */
    private String endTime;

    /**
     * 禁播类型说明
     */
    private String forbiddenTypeDesc;



    /**
     * get 禁播流
     *
     * @return
     */
    public String getStream() {
        return stream;
    }

    /**
     * set 禁播流
     *
     * @param stream
     */
    public void setStream(String stream) {
        this.stream = stream;
    }


    /**
     * get 封禁推流的app
     *
     * @return
     */
    public String getApp() {
        return app;
    }

    /**
     * set 封禁推流的app
     *
     * @param app
     */
    public void setApp(String app) {
        this.app = app;
    }


    /**
     * get 封禁的IP
     *
     * @return
     */
    public String getPublishIp() {
        return publishIp;
    }

    /**
     * set 封禁的IP
     *
     * @param publishIp
     */
    public void setPublishIp(String publishIp) {
        this.publishIp = publishIp;
    }


    /**
     * get 禁播类型:forever永不禁播limit限时禁播
     *
     * @return
     */
    public String getForbiddenType() {
        return forbiddenType;
    }

    /**
     * set 禁播类型:forever永不禁播limit限时禁播
     *
     * @param forbiddenType
     */
    public void setForbiddenType(String forbiddenType) {
        this.forbiddenType = forbiddenType;
    }


    /**
     * get 禁播时长
     *
     * @return
     */
    public Long getTtl() {
        return ttl;
    }

    /**
     * set 禁播时长
     *
     * @param ttl
     */
    public void setTtl(Long ttl) {
        this.ttl = ttl;
    }


    /**
     * get 开始禁播时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始禁播时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 结束禁播时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束禁播时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * get 禁播类型说明
     *
     * @return
     */
    public String getForbiddenTypeDesc() {
        return forbiddenTypeDesc;
    }

    /**
     * set 禁播类型说明
     *
     * @param forbiddenTypeDesc
     */
    public void setForbiddenTypeDesc(String forbiddenTypeDesc) {
        this.forbiddenTypeDesc = forbiddenTypeDesc;
    }



    /**
     * set 禁播流
     *
     * @param stream
     */
    public ForbiddenStreamHistoryItem stream(String stream) {
        this.stream = stream;
        return this;
    }


    /**
     * set 封禁推流的app
     *
     * @param app
     */
    public ForbiddenStreamHistoryItem app(String app) {
        this.app = app;
        return this;
    }


    /**
     * set 封禁的IP
     *
     * @param publishIp
     */
    public ForbiddenStreamHistoryItem publishIp(String publishIp) {
        this.publishIp = publishIp;
        return this;
    }


    /**
     * set 禁播类型:forever永不禁播limit限时禁播
     *
     * @param forbiddenType
     */
    public ForbiddenStreamHistoryItem forbiddenType(String forbiddenType) {
        this.forbiddenType = forbiddenType;
        return this;
    }


    /**
     * set 禁播时长
     *
     * @param ttl
     */
    public ForbiddenStreamHistoryItem ttl(Long ttl) {
        this.ttl = ttl;
        return this;
    }


    /**
     * set 开始禁播时间
     *
     * @param startTime
     */
    public ForbiddenStreamHistoryItem startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 结束禁播时间
     *
     * @param endTime
     */
    public ForbiddenStreamHistoryItem endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 禁播类型说明
     *
     * @param forbiddenTypeDesc
     */
    public ForbiddenStreamHistoryItem forbiddenTypeDesc(String forbiddenTypeDesc) {
        this.forbiddenTypeDesc = forbiddenTypeDesc;
        return this;
    }


}