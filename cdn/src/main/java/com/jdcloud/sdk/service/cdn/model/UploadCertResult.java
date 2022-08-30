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

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 上传证书
 */
public class UploadCertResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * certId
     */
    private String certId;

    /**
     * 对私钥文件使用sha256算法计算的摘要信息
     */
    private String digest;



    /**
     * get certId
     *
     * @return
     */
    public String getCertId() {
        return certId;
    }

    /**
     * set certId
     *
     * @param certId
     */
    public void setCertId(String certId) {
        this.certId = certId;
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
     * set certId
     *
     * @param certId
     */
    public UploadCertResult certId(String certId) {
        this.certId = certId;
        return this;
    }


    /**
     * set 对私钥文件使用sha256算法计算的摘要信息
     *
     * @param digest
     */
    public UploadCertResult digest(String digest) {
        this.digest = digest;
        return this;
    }


}