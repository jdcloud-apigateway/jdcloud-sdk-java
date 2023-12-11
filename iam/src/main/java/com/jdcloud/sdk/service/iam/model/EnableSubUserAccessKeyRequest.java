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
 * SubUser AccessKey Management
 * SubUser AccessKey Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 启用子用户AccessKey &lt;br&gt;, 启用后accessKey 的状态变成 1 &lt;b&gt;启用&lt;/b&gt;

 */
public class EnableSubUserAccessKeyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子用户名称
     * Required:true
     */
    @Required
    private String subUser;

    /**
     * accessKey
     * Required:true
     */
    @Required
    private String accessKey;



    /**
     * get 子用户名称
     *
     * @return
     */
    public String getSubUser() {
        return subUser;
    }

    /**
     * set 子用户名称
     *
     * @param subUser
     */
    public void setSubUser(String subUser) {
        this.subUser = subUser;
    }


    /**
     * get accessKey
     *
     * @return
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * set accessKey
     *
     * @param accessKey
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }



    /**
     * set 子用户名称
     *
     * @param subUser
     */
    public EnableSubUserAccessKeyRequest subUser(String subUser) {
        this.subUser = subUser;
        return this;
    }


    /**
     * set accessKey
     *
     * @param accessKey
     */
    public EnableSubUserAccessKeyRequest accessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }


}