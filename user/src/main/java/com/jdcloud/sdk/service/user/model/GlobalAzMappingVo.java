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

/**
 * globalAzMappingVo
 */
public class GlobalAzMappingVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 别名
     */
    private String alias;

    /**
     * 地域
     */
    private String region;

    /**
     * Az Mapping
     */
    
    private List<AzMappingVo> mapping;


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
    * get Az Mapping
    *
    * @return
    */
    public List<AzMappingVo> getMapping() {
        return mapping;
    }

    /**
    * set Az Mapping
    *
    * @param mapping
    */
    public void setMapping(List<AzMappingVo> mapping) {
        this.mapping = mapping;
    }



    /**
     * set 别名
     *
     * @param alias
     */
    public GlobalAzMappingVo alias(String alias) {
        this.alias = alias;
        return this;
    }


    /**
     * set 地域
     *
     * @param region
     */
    public GlobalAzMappingVo region(String region) {
        this.region = region;
        return this;
    }


    /**
    * set Az Mapping
    *
    * @param mapping
    */
    public GlobalAzMappingVo mapping(List<AzMappingVo> mapping) {
        this.mapping = mapping;
        return this;
    }



    /**
     * add item to Az Mapping
     *
     * @param mapping
     */
    public void addMapping(AzMappingVo mapping) {
        if (this.mapping == null) {
            this.mapping = new ArrayList<>();
        }
        this.mapping.add(mapping);
    }
}