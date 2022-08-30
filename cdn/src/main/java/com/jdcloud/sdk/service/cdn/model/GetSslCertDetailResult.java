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
 * CDN对接SSL相关接口
 * SSL数字证书相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看证书详情
 */
public class GetSslCertDetailResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 证书Id
     */
    private String sslCertId;

    /**
     * 证书名称
     */
    private String certName;

    /**
     * 主域名
     */
    private String commonName;

    /**
     * 证书类型
     */
    private String certType;

    /**
     * 开始时间
     */
    private String sslCertStartTime;

    /**
     * 结束时间
     */
    private String sslCertEndTime;

    /**
     * 对私钥文件使用sha256算法计算的摘要信息
     */
    private String digest;

    /**
     * 备用域名
     */
    
    private List<String> relatedDomains;
    /**
     * 绑定的资源
     */
    
    private List<String> bindResources;


    /**
     * get 证书Id
     *
     * @return
     */
    public String getSslCertId() {
        return sslCertId;
    }

    /**
     * set 证书Id
     *
     * @param sslCertId
     */
    public void setSslCertId(String sslCertId) {
        this.sslCertId = sslCertId;
    }


    /**
     * get 证书名称
     *
     * @return
     */
    public String getCertName() {
        return certName;
    }

    /**
     * set 证书名称
     *
     * @param certName
     */
    public void setCertName(String certName) {
        this.certName = certName;
    }


    /**
     * get 主域名
     *
     * @return
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * set 主域名
     *
     * @param commonName
     */
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }


    /**
     * get 证书类型
     *
     * @return
     */
    public String getCertType() {
        return certType;
    }

    /**
     * set 证书类型
     *
     * @param certType
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }


    /**
     * get 开始时间
     *
     * @return
     */
    public String getSslCertStartTime() {
        return sslCertStartTime;
    }

    /**
     * set 开始时间
     *
     * @param sslCertStartTime
     */
    public void setSslCertStartTime(String sslCertStartTime) {
        this.sslCertStartTime = sslCertStartTime;
    }


    /**
     * get 结束时间
     *
     * @return
     */
    public String getSslCertEndTime() {
        return sslCertEndTime;
    }

    /**
     * set 结束时间
     *
     * @param sslCertEndTime
     */
    public void setSslCertEndTime(String sslCertEndTime) {
        this.sslCertEndTime = sslCertEndTime;
    }


    /**
     * get 对私钥文件使用sha256算法计算的摘要信息
     *
     * @return
     */
    public String getDigest() {
        return digest;
    }

    /**
     * set 对私钥文件使用sha256算法计算的摘要信息
     *
     * @param digest
     */
    public void setDigest(String digest) {
        this.digest = digest;
    }


    /**
    * get 备用域名
    *
    * @return
    */
    public List<String> getRelatedDomains() {
        return relatedDomains;
    }

    /**
    * set 备用域名
    *
    * @param relatedDomains
    */
    public void setRelatedDomains(List<String> relatedDomains) {
        this.relatedDomains = relatedDomains;
    }


    /**
    * get 绑定的资源
    *
    * @return
    */
    public List<String> getBindResources() {
        return bindResources;
    }

    /**
    * set 绑定的资源
    *
    * @param bindResources
    */
    public void setBindResources(List<String> bindResources) {
        this.bindResources = bindResources;
    }



    /**
     * set 证书Id
     *
     * @param sslCertId
     */
    public GetSslCertDetailResult sslCertId(String sslCertId) {
        this.sslCertId = sslCertId;
        return this;
    }


    /**
     * set 证书名称
     *
     * @param certName
     */
    public GetSslCertDetailResult certName(String certName) {
        this.certName = certName;
        return this;
    }


    /**
     * set 主域名
     *
     * @param commonName
     */
    public GetSslCertDetailResult commonName(String commonName) {
        this.commonName = commonName;
        return this;
    }


    /**
     * set 证书类型
     *
     * @param certType
     */
    public GetSslCertDetailResult certType(String certType) {
        this.certType = certType;
        return this;
    }


    /**
     * set 开始时间
     *
     * @param sslCertStartTime
     */
    public GetSslCertDetailResult sslCertStartTime(String sslCertStartTime) {
        this.sslCertStartTime = sslCertStartTime;
        return this;
    }


    /**
     * set 结束时间
     *
     * @param sslCertEndTime
     */
    public GetSslCertDetailResult sslCertEndTime(String sslCertEndTime) {
        this.sslCertEndTime = sslCertEndTime;
        return this;
    }


    /**
     * set 对私钥文件使用sha256算法计算的摘要信息
     *
     * @param digest
     */
    public GetSslCertDetailResult digest(String digest) {
        this.digest = digest;
        return this;
    }


    /**
    * set 备用域名
    *
    * @param relatedDomains
    */
    public GetSslCertDetailResult relatedDomains(List<String> relatedDomains) {
        this.relatedDomains = relatedDomains;
        return this;
    }


    /**
    * set 绑定的资源
    *
    * @param bindResources
    */
    public GetSslCertDetailResult bindResources(List<String> bindResources) {
        this.bindResources = bindResources;
        return this;
    }



    /**
     * add item to 备用域名
     *
     * @param relatedDomain
     */
    public void addRelatedDomain(String relatedDomain) {
        if (this.relatedDomains == null) {
            this.relatedDomains = new ArrayList<>();
        }
        this.relatedDomains.add(relatedDomain);
    }

    /**
     * add item to 绑定的资源
     *
     * @param bindResource
     */
    public void addBindResource(String bindResource) {
        if (this.bindResources == null) {
            this.bindResources = new ArrayList<>();
        }
        this.bindResources.add(bindResource);
    }
}