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
 * 解析记录
 * 云解析OpenAPI自定义线路接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clouddnsservice.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.clouddnsservice.model.UserViewInput;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询主域名的自定义解析线路
 */
public class GetUserViewResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dataList
     */
    private List<UserViewInput> dataList;

    /**
     * 当前页的自定义线路列表里的个数
     */
    private Integer currentCount;

    /**
     * 所有自定义线路列表的个数
     */
    private Integer totalCount;

    /**
     * 所有自定义线路列表按照分页参数一共的页数
     */
    private Integer totalPage;


    /**
     * get dataList
     *
     * @return
     */
    public List<UserViewInput> getDataList() {
        return dataList;
    }

    /**
     * set dataList
     *
     * @param dataList
     */
    public void setDataList(List<UserViewInput> dataList) {
        this.dataList = dataList;
    }

    /**
     * get 当前页的自定义线路列表里的个数
     *
     * @return
     */
    public Integer getCurrentCount() {
        return currentCount;
    }

    /**
     * set 当前页的自定义线路列表里的个数
     *
     * @param currentCount
     */
    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    /**
     * get 所有自定义线路列表的个数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 所有自定义线路列表的个数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get 所有自定义线路列表按照分页参数一共的页数
     *
     * @return
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * set 所有自定义线路列表按照分页参数一共的页数
     *
     * @param totalPage
     */
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }


    /**
     * set dataList
     *
     * @param dataList
     */
    public GetUserViewResult dataList(List<UserViewInput> dataList) {
        this.dataList = dataList;
        return this;
    }

    /**
     * set 当前页的自定义线路列表里的个数
     *
     * @param currentCount
     */
    public GetUserViewResult currentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set 所有自定义线路列表的个数
     *
     * @param totalCount
     */
    public GetUserViewResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set 所有自定义线路列表按照分页参数一共的页数
     *
     * @param totalPage
     */
    public GetUserViewResult totalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }


    /**
     * add item to dataList
     *
     * @param dataList
     */
    public void addDataList(UserViewInput dataList) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataList);
    }

}