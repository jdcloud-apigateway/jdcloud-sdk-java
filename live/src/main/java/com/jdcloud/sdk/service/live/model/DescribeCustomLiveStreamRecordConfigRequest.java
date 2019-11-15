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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.live.model.Filter;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询直播直播录制配置
- 录制模板配置按照 域名,应用,流 3级配置添加,以最小的粒度配置生效
- 域名、应用、流 依次粒度递减 即: 域名&gt;应用&gt;流
- 该查询旨在查询域名、应用、流最终生效的录制模板配置,并非各级的模板绑定情况

 */
public class DescribeCustomLiveStreamRecordConfigRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码
- 取值范围 [1, 100000]

     */
    private Integer pageNum;

    /**
     * 分页大小
- 取值范围 [10, 100]

     */
    private Integer pageSize;

    /**
     * 录制配置查询过滤条件:
  - name:   publishDomain，必填(推流域名)
  - value:  参数
  - name:   appName，必填(应用名称)
  - value:  参数
  - name:   streamName，非必填(流名称)
  - value:  参数

     */
    private List<Filter> filters;


    /**
     * get 页码
- 取值范围 [1, 100000]

     *
     * @return
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * set 页码
- 取值范围 [1, 100000]

     *
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * get 分页大小
- 取值范围 [10, 100]

     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小
- 取值范围 [10, 100]

     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 录制配置查询过滤条件:
  - name:   publishDomain，必填(推流域名)
  - value:  参数
  - name:   appName，必填(应用名称)
  - value:  参数
  - name:   streamName，非必填(流名称)
  - value:  参数

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set 录制配置查询过滤条件:
  - name:   publishDomain，必填(推流域名)
  - value:  参数
  - name:   appName，必填(应用名称)
  - value:  参数
  - name:   streamName，非必填(流名称)
  - value:  参数

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
     * set 页码
- 取值范围 [1, 100000]

     *
     * @param pageNum
     */
    public DescribeCustomLiveStreamRecordConfigRequest pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * set 分页大小
- 取值范围 [10, 100]

     *
     * @param pageSize
     */
    public DescribeCustomLiveStreamRecordConfigRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 录制配置查询过滤条件:
  - name:   publishDomain，必填(推流域名)
  - value:  参数
  - name:   appName，必填(应用名称)
  - value:  参数
  - name:   streamName，非必填(流名称)
  - value:  参数

     *
     * @param filters
     */
    public DescribeCustomLiveStreamRecordConfigRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * add item to 录制配置查询过滤条件:
  - name:   publishDomain，必填(推流域名)
  - value:  参数
  - name:   appName，必填(应用名称)
  - value:  参数
  - name:   streamName，非必填(流名称)
  - value:  参数

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