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
 * instance
 * 轻量应用云主机实例的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lavm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 为轻量云主机解绑域名。

 */
public class DisassociateDomainsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名名称，最多20个，例如: &#x60;[\&quot;name-1\&quot;, \&quot;name-2\&quot;]&#x60;, json array 字串。

     * Required:true
     */
    @Required
    
    private List<String> domainNames;
    /**
     * regionId

     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 轻量云主机的实例ID。

     * Required:true
     */
    @Required
    private String instanceId;



    /**
    * get 域名名称，最多20个，例如: &#x60;[\&quot;name-1\&quot;, \&quot;name-2\&quot;]&#x60;, json array 字串。

    *
    * @return
    */
    public List<String> getDomainNames() {
        return domainNames;
    }

    /**
    * set 域名名称，最多20个，例如: &#x60;[\&quot;name-1\&quot;, \&quot;name-2\&quot;]&#x60;, json array 字串。

    *
    * @param domainNames
    */
    public void setDomainNames(List<String> domainNames) {
        this.domainNames = domainNames;
    }


    /**
     * get regionId

     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId

     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 轻量云主机的实例ID。

     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 轻量云主机的实例ID。

     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
    * set 域名名称，最多20个，例如: &#x60;[\&quot;name-1\&quot;, \&quot;name-2\&quot;]&#x60;, json array 字串。

    *
    * @param domainNames
    */
    public DisassociateDomainsRequest domainNames(List<String> domainNames) {
        this.domainNames = domainNames;
        return this;
    }


    /**
     * set regionId

     *
     * @param regionId
     */
    public DisassociateDomainsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 轻量云主机的实例ID。

     *
     * @param instanceId
     */
    public DisassociateDomainsRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }



    /**
     * add item to 域名名称，最多20个，例如: &#x60;[\&quot;name-1\&quot;, \&quot;name-2\&quot;]&#x60;, json array 字串。

     *
     * @param domainName
     */
    public void addDomainName(String domainName) {
        if (this.domainNames == null) {
            this.domainNames = new ArrayList<>();
        }
        this.domainNames.add(domainName);
    }
}