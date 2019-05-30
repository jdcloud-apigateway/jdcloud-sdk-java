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

package com.jdcloud.sdk.service.sts.model;


/**
 * assumedRoleUser
 */
public class AssumedRoleUser  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 代入角色id
     */
    private String assumedRoleId;

    /**
     * 京东云资源标识(jrn)
     */
    private String jrn;


    /**
     * get 代入角色id
     *
     * @return
     */
    public String getAssumedRoleId() {
        return assumedRoleId;
    }

    /**
     * set 代入角色id
     *
     * @param assumedRoleId
     */
    public void setAssumedRoleId(String assumedRoleId) {
        this.assumedRoleId = assumedRoleId;
    }

    /**
     * get 京东云资源标识(jrn)
     *
     * @return
     */
    public String getJrn() {
        return jrn;
    }

    /**
     * set 京东云资源标识(jrn)
     *
     * @param jrn
     */
    public void setJrn(String jrn) {
        this.jrn = jrn;
    }


    /**
     * set 代入角色id
     *
     * @param assumedRoleId
     */
    public AssumedRoleUser assumedRoleId(String assumedRoleId) {
        this.assumedRoleId = assumedRoleId;
        return this;
    }

    /**
     * set 京东云资源标识(jrn)
     *
     * @param jrn
     */
    public AssumedRoleUser jrn(String jrn) {
        this.jrn = jrn;
        return this;
    }


}