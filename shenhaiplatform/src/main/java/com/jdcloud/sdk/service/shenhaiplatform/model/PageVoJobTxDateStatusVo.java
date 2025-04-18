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

package com.jdcloud.sdk.service.shenhaiplatform.model;

import java.util.List;
import java.util.ArrayList;

/**
 * pageVoJobTxDateStatusVo
 */
public class PageVoJobTxDateStatusVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总条数
     */
    private Long total;

    /**
     * 每页条数
     */
    private Integer pageSize;

    /**
     * 当前页
     */
    private Integer pageNum;

    /**
     * 数据列表
     */
    
    private List<JobTxDateStatusVo> list;


    /**
     * get 总条数
     *
     * @return
     */
    public Long getTotal() {
        return total;
    }

    /**
     * set 总条数
     *
     * @param total
     */
    public void setTotal(Long total) {
        this.total = total;
    }


    /**
     * get 每页条数
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页条数
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get 当前页
     *
     * @return
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * set 当前页
     *
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }


    /**
    * get 数据列表
    *
    * @return
    */
    public List<JobTxDateStatusVo> getList() {
        return list;
    }

    /**
    * set 数据列表
    *
    * @param list
    */
    public void setList(List<JobTxDateStatusVo> list) {
        this.list = list;
    }



    /**
     * set 总条数
     *
     * @param total
     */
    public PageVoJobTxDateStatusVo total(Long total) {
        this.total = total;
        return this;
    }


    /**
     * set 每页条数
     *
     * @param pageSize
     */
    public PageVoJobTxDateStatusVo pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 当前页
     *
     * @param pageNum
     */
    public PageVoJobTxDateStatusVo pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }


    /**
    * set 数据列表
    *
    * @param list
    */
    public PageVoJobTxDateStatusVo list(List<JobTxDateStatusVo> list) {
        this.list = list;
        return this;
    }



    /**
     * add item to 数据列表
     *
     * @param list
     */
    public void addList(JobTxDateStatusVo list) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(list);
    }
}