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
 * 司马签印章管理接口
 * 电子签章-印章管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudsign.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取印章列表
 */
public class DescribeStampListRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码, 默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小, 默认为10, 取值范围[10, 100]
     */
    private Integer pageSize;

    /**
     * 印章名称
     */
    private String stampName;



    /**
     * get 页码, 默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码, 默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 分页大小, 默认为10, 取值范围[10, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小, 默认为10, 取值范围[10, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get 印章名称
     *
     * @return
     */
    public String getStampName() {
        return stampName;
    }

    /**
     * set 印章名称
     *
     * @param stampName
     */
    public void setStampName(String stampName) {
        this.stampName = stampName;
    }



    /**
     * set 页码, 默认为1
     *
     * @param pageNumber
     */
    public DescribeStampListRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小, 默认为10, 取值范围[10, 100]
     *
     * @param pageSize
     */
    public DescribeStampListRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 印章名称
     *
     * @param stampName
     */
    public DescribeStampListRequest stampName(String stampName) {
        this.stampName = stampName;
        return this;
    }


}