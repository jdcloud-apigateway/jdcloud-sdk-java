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
 * SSH密钥对
 * 关于SSH密钥对的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lavm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
导入密钥。

与创建密钥不同的是，导入的密钥是由用户生成的。生成之后将公钥部分导入到京东云。

详细操作说明请参考帮助文档：[创建密钥](https://docs.jdcloud.com/cn/virtual-machines/create-keypair)

## 接口说明
- 调用该接口导入由其他工具生成的密钥对的公钥部分。

 */
public class ImportKeypairRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 密钥对名称，需要全局唯一。
只允许数字、大小写字母、下划线“_”及中划线“-”，不超过32个字符。

     * Required:true
     */
    @Required
    private String keyName;

    /**
     * 密钥对的公钥部分。
     * Required:true
     */
    @Required
    private String publicKey;

    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 密钥对名称，需要全局唯一。
只允许数字、大小写字母、下划线“_”及中划线“-”，不超过32个字符。

     *
     * @return
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * set 密钥对名称，需要全局唯一。
只允许数字、大小写字母、下划线“_”及中划线“-”，不超过32个字符。

     *
     * @param keyName
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }


    /**
     * get 密钥对的公钥部分。
     *
     * @return
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * set 密钥对的公钥部分。
     *
     * @param publicKey
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }


    /**
     * get 地域ID。
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 密钥对名称，需要全局唯一。
只允许数字、大小写字母、下划线“_”及中划线“-”，不超过32个字符。

     *
     * @param keyName
     */
    public ImportKeypairRequest keyName(String keyName) {
        this.keyName = keyName;
        return this;
    }


    /**
     * set 密钥对的公钥部分。
     *
     * @param publicKey
     */
    public ImportKeypairRequest publicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }


    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public ImportKeypairRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}