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


/**
 * accessWafStatus
 */
public class AccessWafStatus  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名
     */
    private String domain;

    /**
     * 接入状态 0代表既没有cname，也没有流量，1代表有cname接入，没有流量，2代表两者都有
     */
    private Integer statusCode;

    /**
     * 接入状态描述
     */
    private String statusMsg;



    /**
     * get 域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * get 接入状态 0代表既没有cname，也没有流量，1代表有cname接入，没有流量，2代表两者都有
     *
     * @return
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * set 接入状态 0代表既没有cname，也没有流量，1代表有cname接入，没有流量，2代表两者都有
     *
     * @param statusCode
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * get 接入状态描述
     *
     * @return
     */
    public String getStatusMsg() {
        return statusMsg;
    }

    /**
     * set 接入状态描述
     *
     * @param statusMsg
     */
    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }



    /**
     * set 域名
     *
     * @param domain
     */
    public AccessWafStatus domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 接入状态 0代表既没有cname，也没有流量，1代表有cname接入，没有流量，2代表两者都有
     *
     * @param statusCode
     */
    public AccessWafStatus statusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }


    /**
     * set 接入状态描述
     *
     * @param statusMsg
     */
    public AccessWafStatus statusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
        return this;
    }


}