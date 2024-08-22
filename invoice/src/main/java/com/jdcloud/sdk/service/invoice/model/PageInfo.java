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

package com.jdcloud.sdk.service.invoice.model;


/**
 * pageInfo
 */
public class PageInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pageIndex
     */
    private Integer pageIndex;

    /**
     * pageSize
     */
    private Integer pageSize;

    /**
     * totalCount
     */
    private Long totalCount;

    /**
     * totalPage
     */
    private Integer totalPage;



    /**
     * get pageIndex
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set pageIndex
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }


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
     * get totalCount
     *
     * @return
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
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
     * set pageIndex
     *
     * @param pageIndex
     */
    public PageInfo pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }


    /**
     * set pageSize
     *
     * @param pageSize
     */
    public PageInfo pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set totalCount
     *
     * @param totalCount
     */
    public PageInfo totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * set totalPage
     *
     * @param totalPage
     */
    public PageInfo totalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }


}