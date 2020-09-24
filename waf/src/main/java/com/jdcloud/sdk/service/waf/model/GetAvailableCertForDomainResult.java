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
 * Cert
 * Cert API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取域名可用证书列表
 */
public class GetAvailableCertForDomainResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 现绑定证书id
     */
    private String bindCertId;

    /**
     * 现绑定证书名称
     */
    private String bindCertName;

    /**
     * certIds
     */
    private List<String> certIds;

    /**
     * certNames
     */
    private List<String> certNames;

    /**
     * 可用证书个数
     */
    private Integer count;

    /**
     * 域名
     */
    private String domain;


    /**
     * get 现绑定证书id
     *
     * @return
     */
    public String getBindCertId() {
        return bindCertId;
    }

    /**
     * set 现绑定证书id
     *
     * @param bindCertId
     */
    public void setBindCertId(String bindCertId) {
        this.bindCertId = bindCertId;
    }

    /**
     * get 现绑定证书名称
     *
     * @return
     */
    public String getBindCertName() {
        return bindCertName;
    }

    /**
     * set 现绑定证书名称
     *
     * @param bindCertName
     */
    public void setBindCertName(String bindCertName) {
        this.bindCertName = bindCertName;
    }

    /**
     * get certIds
     *
     * @return
     */
    public List<String> getCertIds() {
        return certIds;
    }

    /**
     * set certIds
     *
     * @param certIds
     */
    public void setCertIds(List<String> certIds) {
        this.certIds = certIds;
    }

    /**
     * get certNames
     *
     * @return
     */
    public List<String> getCertNames() {
        return certNames;
    }

    /**
     * set certNames
     *
     * @param certNames
     */
    public void setCertNames(List<String> certNames) {
        this.certNames = certNames;
    }

    /**
     * get 可用证书个数
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set 可用证书个数
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

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
     * set 现绑定证书id
     *
     * @param bindCertId
     */
    public GetAvailableCertForDomainResult bindCertId(String bindCertId) {
        this.bindCertId = bindCertId;
        return this;
    }

    /**
     * set 现绑定证书名称
     *
     * @param bindCertName
     */
    public GetAvailableCertForDomainResult bindCertName(String bindCertName) {
        this.bindCertName = bindCertName;
        return this;
    }

    /**
     * set certIds
     *
     * @param certIds
     */
    public GetAvailableCertForDomainResult certIds(List<String> certIds) {
        this.certIds = certIds;
        return this;
    }

    /**
     * set certNames
     *
     * @param certNames
     */
    public GetAvailableCertForDomainResult certNames(List<String> certNames) {
        this.certNames = certNames;
        return this;
    }

    /**
     * set 可用证书个数
     *
     * @param count
     */
    public GetAvailableCertForDomainResult count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public GetAvailableCertForDomainResult domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * add item to certIds
     *
     * @param certId
     */
    public void addCertId(String certId) {
        if (this.certIds == null) {
            this.certIds = new ArrayList<>();
        }
        this.certIds.add(certId);
    }

    /**
     * add item to certNames
     *
     * @param certName
     */
    public void addCertName(String certName) {
        if (this.certNames == null) {
            this.certNames = new ArrayList<>();
        }
        this.certNames.add(certName);
    }

}