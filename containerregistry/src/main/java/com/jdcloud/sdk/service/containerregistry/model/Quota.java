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

package com.jdcloud.sdk.service.containerregistry.model;


/**
 * quota
 */
public class Quota  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源类型 [registry/repository]
     */
    private String resourceType;

    /**
     * 可用资源上限
     */
    private Integer limit;

    /**
     * 已用资源数量
     */
    private Integer used;


    /**
     * get 资源类型 [registry/repository]
     *
     * @return
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * set 资源类型 [registry/repository]
     *
     * @param resourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * get 可用资源上限
     *
     * @return
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * set 可用资源上限
     *
     * @param limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * get 已用资源数量
     *
     * @return
     */
    public Integer getUsed() {
        return used;
    }

    /**
     * set 已用资源数量
     *
     * @param used
     */
    public void setUsed(Integer used) {
        this.used = used;
    }


    /**
     * set 资源类型 [registry/repository]
     *
     * @param resourceType
     */
    public Quota resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set 可用资源上限
     *
     * @param limit
     */
    public Quota limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * set 已用资源数量
     *
     * @param used
     */
    public Quota used(Integer used) {
        this.used = used;
        return this;
    }


}