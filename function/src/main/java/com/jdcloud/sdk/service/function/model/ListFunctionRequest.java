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
 * Function OpenAPI
 * 
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.function.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询函数列表
 */
public class ListFunctionRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * functionId -函数ID，精确匹配，支持多个
functionName  - 函数名称，模糊匹配，支持单个

     */
    private List<Filter> filters;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get functionId -函数ID，精确匹配，支持多个
functionName  - 函数名称，模糊匹配，支持单个

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set functionId -函数ID，精确匹配，支持多个
functionName  - 函数名称，模糊匹配，支持单个

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set functionId -函数ID，精确匹配，支持多个
functionName  - 函数名称，模糊匹配，支持单个

     *
     * @param filters
     */
    public ListFunctionRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ListFunctionRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to functionId -函数ID，精确匹配，支持多个
functionName  - 函数名称，模糊匹配，支持单个

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}