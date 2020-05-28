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
 * CoreWebConsoleAPI
 * 控制台开放API
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotcore.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.iotcore.model.ThingTypeInfoVO;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询物类型列表
 */
public class ThingTypeListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pageSize
     */
    private Integer pageSize;

    /**
     * currentPage
     */
    private Integer currentPage;

    /**
     * totalSize
     */
    private Integer totalSize;

    /**
     * totalPage
     */
    private Integer totalPage;

    /**
     * data
     */
    private List<ThingTypeInfoVO> data;


    /**
     * get pageSize
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set pageSize
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get currentPage
     *
     * @return
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * set currentPage
     *
     * @param currentPage
     */
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * get totalSize
     *
     * @return
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    /**
     * set totalSize
     *
     * @param totalSize
     */
    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    /**
     * get totalPage
     *
     * @return
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * set totalPage
     *
     * @param totalPage
     */
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * get data
     *
     * @return
     */
    public List<ThingTypeInfoVO> getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(List<ThingTypeInfoVO> data) {
        this.data = data;
    }


    /**
     * set pageSize
     *
     * @param pageSize
     */
    public ThingTypeListResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set currentPage
     *
     * @param currentPage
     */
    public ThingTypeListResult currentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    /**
     * set totalSize
     *
     * @param totalSize
     */
    public ThingTypeListResult totalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * set totalPage
     *
     * @param totalPage
     */
    public ThingTypeListResult totalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * set data
     *
     * @param data
     */
    public ThingTypeListResult data(List<ThingTypeInfoVO> data) {
        this.data = data;
        return this;
    }


    /**
     * add item to data
     *
     * @param data
     */
    public void addData(ThingTypeInfoVO data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}