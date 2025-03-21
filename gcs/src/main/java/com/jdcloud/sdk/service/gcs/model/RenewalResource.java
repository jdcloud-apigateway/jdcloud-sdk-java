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

package com.jdcloud.sdk.service.gcs.model;

import java.util.List;
import java.util.ArrayList;

/**
 * renewalResource
 */
public class RenewalResource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源ID
     */
    private String resourceId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 绑定资源列表
     */
    
    private List<RenewalResource> bind;


    /**
     * get 资源ID
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * get 资源名称
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }


    /**
     * get 备注
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 备注
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }


    /**
    * get 绑定资源列表
    *
    * @return
    */
    public List<RenewalResource> getBind() {
        return bind;
    }

    /**
    * set 绑定资源列表
    *
    * @param bind
    */
    public void setBind(List<RenewalResource> bind) {
        this.bind = bind;
    }



    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public RenewalResource resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public RenewalResource resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }


    /**
     * set 备注
     *
     * @param remark
     */
    public RenewalResource remark(String remark) {
        this.remark = remark;
        return this;
    }


    /**
    * set 绑定资源列表
    *
    * @param bind
    */
    public RenewalResource bind(List<RenewalResource> bind) {
        this.bind = bind;
        return this;
    }



    /**
     * add item to 绑定资源列表
     *
     * @param bind
     */
    public void addBind(RenewalResource bind) {
        if (this.bind == null) {
            this.bind = new ArrayList<>();
        }
        this.bind.add(bind);
    }
}