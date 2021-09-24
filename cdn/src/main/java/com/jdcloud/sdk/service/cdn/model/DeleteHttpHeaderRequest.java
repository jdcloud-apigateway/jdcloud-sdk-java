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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除httpHeader
 */
public class DeleteHttpHeaderRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 0表示header在边缘生效，1表示header回源生效，2表示在边缘和回源都生效，该字段不传时默认header在边缘和回源都生效
     */
    private Integer edgeType;

    /**
     * header类型[resp,req]
     */
    private String headerType;

    /**
     * header名
     */
    private String headerName;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;


    /**
     * get 0表示header在边缘生效，1表示header回源生效，2表示在边缘和回源都生效，该字段不传时默认header在边缘和回源都生效
     *
     * @return
     */
    public Integer getEdgeType() {
        return edgeType;
    }

    /**
     * set 0表示header在边缘生效，1表示header回源生效，2表示在边缘和回源都生效，该字段不传时默认header在边缘和回源都生效
     *
     * @param edgeType
     */
    public void setEdgeType(Integer edgeType) {
        this.edgeType = edgeType;
    }

    /**
     * get header类型[resp,req]
     *
     * @return
     */
    public String getHeaderType() {
        return headerType;
    }

    /**
     * set header类型[resp,req]
     *
     * @param headerType
     */
    public void setHeaderType(String headerType) {
        this.headerType = headerType;
    }

    /**
     * get header名
     *
     * @return
     */
    public String getHeaderName() {
        return headerName;
    }

    /**
     * set header名
     *
     * @param headerName
     */
    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    /**
     * get 用户域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * set 0表示header在边缘生效，1表示header回源生效，2表示在边缘和回源都生效，该字段不传时默认header在边缘和回源都生效
     *
     * @param edgeType
     */
    public DeleteHttpHeaderRequest edgeType(Integer edgeType) {
        this.edgeType = edgeType;
        return this;
    }

    /**
     * set header类型[resp,req]
     *
     * @param headerType
     */
    public DeleteHttpHeaderRequest headerType(String headerType) {
        this.headerType = headerType;
        return this;
    }

    /**
     * set header名
     *
     * @param headerName
     */
    public DeleteHttpHeaderRequest headerName(String headerName) {
        this.headerName = headerName;
        return this;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public DeleteHttpHeaderRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


}