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
 * dosage monitoring openapi
 * dosage monitoring openapi
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ossopenapi.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * bucketSpaceStatisticQueryResult
 */
public class BucketSpaceStatisticQueryResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询结果总数
     */
    private Integer totalCount;

    /**
     * bucket 统计列表
     */
    
    private List<BucketSpaceStatistic> queryList;


    /**
     * get 查询结果总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 查询结果总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
    * get bucket 统计列表
    *
    * @return
    */
    public List<BucketSpaceStatistic> getQueryList() {
        return queryList;
    }

    /**
    * set bucket 统计列表
    *
    * @param queryList
    */
    public void setQueryList(List<BucketSpaceStatistic> queryList) {
        this.queryList = queryList;
    }



    /**
     * set 查询结果总数
     *
     * @param totalCount
     */
    public BucketSpaceStatisticQueryResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
    * set bucket 统计列表
    *
    * @param queryList
    */
    public BucketSpaceStatisticQueryResult queryList(List<BucketSpaceStatistic> queryList) {
        this.queryList = queryList;
        return this;
    }



    /**
     * add item to bucket 统计列表
     *
     * @param queryList
     */
    public void addQueryList(BucketSpaceStatistic queryList) {
        if (this.queryList == null) {
            this.queryList = new ArrayList<>();
        }
        this.queryList.add(queryList);
    }
}