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

package com.jdcloud.sdk.service.user.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * regionRequestVo
 */
public class RegionRequestVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域
     * Required:true
     */
    @Required
    private String region;

    /**
     * 别名
     * Required:true
     */
    @Required
    private String alias;

    /**
     * mapping
     * Required:true
     */
    @Required
    
    private List<AzRequest> mapping;


    /**
     * get 地域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * get 别名
     *
     * @return
     */
    public String getAlias() {
        return alias;
    }

    /**
     * set 别名
     *
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }


    /**
    * get mapping
    *
    * @return
    */
    public List<AzRequest> getMapping() {
        return mapping;
    }

    /**
    * set mapping
    *
    * @param mapping
    */
    public void setMapping(List<AzRequest> mapping) {
        this.mapping = mapping;
    }



    /**
     * set 地域
     *
     * @param region
     */
    public RegionRequestVo region(String region) {
        this.region = region;
        return this;
    }


    /**
     * set 别名
     *
     * @param alias
     */
    public RegionRequestVo alias(String alias) {
        this.alias = alias;
        return this;
    }


    /**
    * set mapping
    *
    * @param mapping
    */
    public RegionRequestVo mapping(List<AzRequest> mapping) {
        this.mapping = mapping;
        return this;
    }



    /**
     * add item to mapping
     *
     * @param mapping
     */
    public void addMapping(AzRequest mapping) {
        if (this.mapping == null) {
            this.mapping = new ArrayList<>();
        }
        this.mapping.add(mapping);
    }
}