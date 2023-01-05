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
 * Instance-Template
 * 与实例模板相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
查询实例模板上的自定义元数据。

详细操作说明请参考帮助文档：[实例模板](https://docs.jdcloud.com/cn/virtual-machines/instance-template-overview)

## 接口说明
- 一般情况下由于自定义元数据比较大，所以限制每次最多查询10个实例模板。

 */
public class DescribeInstanceTemplatesCustomdataRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceTemplateId&#x60;: 实例模板ID，精确匹配，最多支持10个

     */
    
    private List<Filter> filters;
    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;



    /**
    * get &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceTemplateId&#x60;: 实例模板ID，精确匹配，最多支持10个

    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceTemplateId&#x60;: 实例模板ID，精确匹配，最多支持10个

    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
     * get 地域ID。
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
    * set &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceTemplateId&#x60;: 实例模板ID，精确匹配，最多支持10个

    *
    * @param filters
    */
    public DescribeInstanceTemplatesCustomdataRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public DescribeInstanceTemplatesCustomdataRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceTemplateId&#x60;: 实例模板ID，精确匹配，最多支持10个

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