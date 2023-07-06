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
 * 弹性伸缩规则管理
 * 弹性伸缩规则管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ag.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.ag.model.Filter;
import com.jdcloud.sdk.service.ag.model.Sort;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查看伸缩规则
- 所有参数取值为字符串类型的都严格区分大小写
- 伸缩功能开启或者关闭的情况下，都支持调用此接口

 */
public class DescribeAsRulesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 高可用组ID
     * Required:true
     */
    @Required
    private String agId;

    /**
     * 页码，默认为&#x60;1&#x60;，最小值必须大于0
     */
    private Integer pageNumber;

    /**
     * 分页大小，默认为&#x60;20&#x60;，取值范围[&#x60;10&#x60; ~ &#x60;100&#x60;]
     */
    private Integer pageSize;

    /**
     * 支持使用以下关键字进行过滤查询
- &#x60;asRuleId&#x60;: 伸缩规则ID，精确匹配，支持多个
- &#x60;name&#x60;: 伸缩规则名称，模糊匹配，支持单个
- &#x60;asRuleType&#x60;: 伸缩规则类型，精确匹配，支持多个，取值范围：[&#x60;Simple&#x60;,&#x60;Target&#x60;,&#x60;Step&#x60;]

     */
    
    private List<Filter> filters;
    /**
     * 排序条件列表，目前只支持单个排序条件，不支持多个排序条件，默认按照 &#x60;createTime&#x60; 降序排序
支持使用以下关键字进行排序
- &#x60;createTime&#x60;: 创建时间

     */
    
    private List<Sort> sorts;
    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 高可用组ID
     *
     * @return
     */
    public String getAgId() {
        return agId;
    }

    /**
     * set 高可用组ID
     *
     * @param agId
     */
    public void setAgId(String agId) {
        this.agId = agId;
    }


    /**
     * get 页码，默认为&#x60;1&#x60;，最小值必须大于0
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码，默认为&#x60;1&#x60;，最小值必须大于0
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 分页大小，默认为&#x60;20&#x60;，取值范围[&#x60;10&#x60; ~ &#x60;100&#x60;]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小，默认为&#x60;20&#x60;，取值范围[&#x60;10&#x60; ~ &#x60;100&#x60;]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
    * get 支持使用以下关键字进行过滤查询
- &#x60;asRuleId&#x60;: 伸缩规则ID，精确匹配，支持多个
- &#x60;name&#x60;: 伸缩规则名称，模糊匹配，支持单个
- &#x60;asRuleType&#x60;: 伸缩规则类型，精确匹配，支持多个，取值范围：[&#x60;Simple&#x60;,&#x60;Target&#x60;,&#x60;Step&#x60;]

    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set 支持使用以下关键字进行过滤查询
- &#x60;asRuleId&#x60;: 伸缩规则ID，精确匹配，支持多个
- &#x60;name&#x60;: 伸缩规则名称，模糊匹配，支持单个
- &#x60;asRuleType&#x60;: 伸缩规则类型，精确匹配，支持多个，取值范围：[&#x60;Simple&#x60;,&#x60;Target&#x60;,&#x60;Step&#x60;]

    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
    * get 排序条件列表，目前只支持单个排序条件，不支持多个排序条件，默认按照 &#x60;createTime&#x60; 降序排序
支持使用以下关键字进行排序
- &#x60;createTime&#x60;: 创建时间

    *
    * @return
    */
    public List<Sort> getSorts() {
        return sorts;
    }

    /**
    * set 排序条件列表，目前只支持单个排序条件，不支持多个排序条件，默认按照 &#x60;createTime&#x60; 降序排序
支持使用以下关键字进行排序
- &#x60;createTime&#x60;: 创建时间

    *
    * @param sorts
    */
    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
    }


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 高可用组ID
     *
     * @param agId
     */
    public DescribeAsRulesRequest agId(String agId) {
        this.agId = agId;
        return this;
    }


    /**
     * set 页码，默认为&#x60;1&#x60;，最小值必须大于0
     *
     * @param pageNumber
     */
    public DescribeAsRulesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小，默认为&#x60;20&#x60;，取值范围[&#x60;10&#x60; ~ &#x60;100&#x60;]
     *
     * @param pageSize
     */
    public DescribeAsRulesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
    * set 支持使用以下关键字进行过滤查询
- &#x60;asRuleId&#x60;: 伸缩规则ID，精确匹配，支持多个
- &#x60;name&#x60;: 伸缩规则名称，模糊匹配，支持单个
- &#x60;asRuleType&#x60;: 伸缩规则类型，精确匹配，支持多个，取值范围：[&#x60;Simple&#x60;,&#x60;Target&#x60;,&#x60;Step&#x60;]

    *
    * @param filters
    */
    public DescribeAsRulesRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
    * set 排序条件列表，目前只支持单个排序条件，不支持多个排序条件，默认按照 &#x60;createTime&#x60; 降序排序
支持使用以下关键字进行排序
- &#x60;createTime&#x60;: 创建时间

    *
    * @param sorts
    */
    public DescribeAsRulesRequest sorts(List<Sort> sorts) {
        this.sorts = sorts;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DescribeAsRulesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 支持使用以下关键字进行过滤查询
- &#x60;asRuleId&#x60;: 伸缩规则ID，精确匹配，支持多个
- &#x60;name&#x60;: 伸缩规则名称，模糊匹配，支持单个
- &#x60;asRuleType&#x60;: 伸缩规则类型，精确匹配，支持多个，取值范围：[&#x60;Simple&#x60;,&#x60;Target&#x60;,&#x60;Step&#x60;]

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

    /**
     * add item to 排序条件列表，目前只支持单个排序条件，不支持多个排序条件，默认按照 &#x60;createTime&#x60; 降序排序
支持使用以下关键字进行排序
- &#x60;createTime&#x60;: 创建时间

     *
     * @param sort
     */
    public void addSort(Sort sort) {
        if (this.sorts == null) {
            this.sorts = new ArrayList<>();
        }
        this.sorts.add(sort);
    }
}