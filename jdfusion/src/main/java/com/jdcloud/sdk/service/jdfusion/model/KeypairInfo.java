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

package com.jdcloud.sdk.service.jdfusion.model;


/**
 * 秘钥对信息
 */
public class KeypairInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 密钥名称
     */
    private String name;

    /**
     * 密钥指纹
     */
    private String keyFingerprint;

    /**
     * 云注册信息ID
     */
    private String cloudID;


    /**
     * get 密钥名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 密钥名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 密钥指纹
     *
     * @return
     */
    public String getKeyFingerprint() {
        return keyFingerprint;
    }

    /**
     * set 密钥指纹
     *
     * @param keyFingerprint
     */
    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }

    /**
     * get 云注册信息ID
     *
     * @return
     */
    public String getCloudID() {
        return cloudID;
    }

    /**
     * set 云注册信息ID
     *
     * @param cloudID
     */
    public void setCloudID(String cloudID) {
        this.cloudID = cloudID;
    }


    /**
     * set 密钥名称
     *
     * @param name
     */
    public KeypairInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 密钥指纹
     *
     * @param keyFingerprint
     */
    public KeypairInfo keyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
        return this;
    }

    /**
     * set 云注册信息ID
     *
     * @param cloudID
     */
    public KeypairInfo cloudID(String cloudID) {
        this.cloudID = cloudID;
        return this;
    }


}