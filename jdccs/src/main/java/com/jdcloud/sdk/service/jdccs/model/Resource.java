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

package com.jdcloud.sdk.service.jdccs.model;


/**
 * 资源列表
 */
public class Resource  implements java.io.Serializable {

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
     * set 资源ID
     *
     * @param resourceId
     */
    public Resource resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public Resource resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }


}