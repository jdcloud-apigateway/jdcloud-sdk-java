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
 * JrtcRoom
 * 房间号管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.openjrtc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.openjrtc.model.Filter;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询应用下的房间列表
允许通过条件过滤查询，支持的过滤字段如下：
           - appId[eq] 按应用ID查询

 */
public class DescribeRoomsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认值为 1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认值为 10；取值范围 [10, 100]
     */
    private Integer pageSize;

    /**
     * 传参字段描述:
  appId:   应用ID

     */
    
    private List<Filter> filters;


    /**
     * get 页码；默认值为 1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认值为 1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 分页大小；默认值为 10；取值范围 [10, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认值为 10；取值范围 [10, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
    * get 传参字段描述:
  appId:   应用ID

    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set 传参字段描述:
  appId:   应用ID

    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }



    /**
     * set 页码；默认值为 1
     *
     * @param pageNumber
     */
    public DescribeRoomsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小；默认值为 10；取值范围 [10, 100]
     *
     * @param pageSize
     */
    public DescribeRoomsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
    * set 传参字段描述:
  appId:   应用ID

    *
    * @param filters
    */
    public DescribeRoomsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }



    /**
     * add item to 传参字段描述:
  appId:   应用ID

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