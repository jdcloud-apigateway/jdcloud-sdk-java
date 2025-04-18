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


/**
 * listPublishPkgByPageParam
 */
public class ListPublishPkgByPageParam  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页面容量
     */
    private Integer pageSize;

    /**
     * 页号
     */
    private Integer pageNum;

    /**
     * 发布包名称
     */
    private String pkgName;

    /**
     * 发布包ID
     */
    private Long pkgId;

    /**
     * 发布人
     */
    private String publisher;

    /**
     * 发布包状态
     */
    private String pkgStatus;

    /**
     * 发布时间开始
     */
    private Long pkgPublishTimeStart;

    /**
     * 发布时间结束
     */
    private Long pkgPublishTimeEnd;

    /**
     * 打包人
     */
    private String pkgCreator;

    /**
     * 打包时间开始
     */
    private Long pkgCreateTimeStart;

    /**
     * 打包时间结束
     */
    private Long pkgCreateTimeEnd;



    /**
     * get 页面容量
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页面容量
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get 页号
     *
     * @return
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * set 页号
     *
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }


    /**
     * get 发布包名称
     *
     * @return
     */
    public String getPkgName() {
        return pkgName;
    }

    /**
     * set 发布包名称
     *
     * @param pkgName
     */
    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }


    /**
     * get 发布包ID
     *
     * @return
     */
    public Long getPkgId() {
        return pkgId;
    }

    /**
     * set 发布包ID
     *
     * @param pkgId
     */
    public void setPkgId(Long pkgId) {
        this.pkgId = pkgId;
    }


    /**
     * get 发布人
     *
     * @return
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * set 发布人
     *
     * @param publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    /**
     * get 发布包状态
     *
     * @return
     */
    public String getPkgStatus() {
        return pkgStatus;
    }

    /**
     * set 发布包状态
     *
     * @param pkgStatus
     */
    public void setPkgStatus(String pkgStatus) {
        this.pkgStatus = pkgStatus;
    }


    /**
     * get 发布时间开始
     *
     * @return
     */
    public Long getPkgPublishTimeStart() {
        return pkgPublishTimeStart;
    }

    /**
     * set 发布时间开始
     *
     * @param pkgPublishTimeStart
     */
    public void setPkgPublishTimeStart(Long pkgPublishTimeStart) {
        this.pkgPublishTimeStart = pkgPublishTimeStart;
    }


    /**
     * get 发布时间结束
     *
     * @return
     */
    public Long getPkgPublishTimeEnd() {
        return pkgPublishTimeEnd;
    }

    /**
     * set 发布时间结束
     *
     * @param pkgPublishTimeEnd
     */
    public void setPkgPublishTimeEnd(Long pkgPublishTimeEnd) {
        this.pkgPublishTimeEnd = pkgPublishTimeEnd;
    }


    /**
     * get 打包人
     *
     * @return
     */
    public String getPkgCreator() {
        return pkgCreator;
    }

    /**
     * set 打包人
     *
     * @param pkgCreator
     */
    public void setPkgCreator(String pkgCreator) {
        this.pkgCreator = pkgCreator;
    }


    /**
     * get 打包时间开始
     *
     * @return
     */
    public Long getPkgCreateTimeStart() {
        return pkgCreateTimeStart;
    }

    /**
     * set 打包时间开始
     *
     * @param pkgCreateTimeStart
     */
    public void setPkgCreateTimeStart(Long pkgCreateTimeStart) {
        this.pkgCreateTimeStart = pkgCreateTimeStart;
    }


    /**
     * get 打包时间结束
     *
     * @return
     */
    public Long getPkgCreateTimeEnd() {
        return pkgCreateTimeEnd;
    }

    /**
     * set 打包时间结束
     *
     * @param pkgCreateTimeEnd
     */
    public void setPkgCreateTimeEnd(Long pkgCreateTimeEnd) {
        this.pkgCreateTimeEnd = pkgCreateTimeEnd;
    }



    /**
     * set 页面容量
     *
     * @param pageSize
     */
    public ListPublishPkgByPageParam pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 页号
     *
     * @param pageNum
     */
    public ListPublishPkgByPageParam pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }


    /**
     * set 发布包名称
     *
     * @param pkgName
     */
    public ListPublishPkgByPageParam pkgName(String pkgName) {
        this.pkgName = pkgName;
        return this;
    }


    /**
     * set 发布包ID
     *
     * @param pkgId
     */
    public ListPublishPkgByPageParam pkgId(Long pkgId) {
        this.pkgId = pkgId;
        return this;
    }


    /**
     * set 发布人
     *
     * @param publisher
     */
    public ListPublishPkgByPageParam publisher(String publisher) {
        this.publisher = publisher;
        return this;
    }


    /**
     * set 发布包状态
     *
     * @param pkgStatus
     */
    public ListPublishPkgByPageParam pkgStatus(String pkgStatus) {
        this.pkgStatus = pkgStatus;
        return this;
    }


    /**
     * set 发布时间开始
     *
     * @param pkgPublishTimeStart
     */
    public ListPublishPkgByPageParam pkgPublishTimeStart(Long pkgPublishTimeStart) {
        this.pkgPublishTimeStart = pkgPublishTimeStart;
        return this;
    }


    /**
     * set 发布时间结束
     *
     * @param pkgPublishTimeEnd
     */
    public ListPublishPkgByPageParam pkgPublishTimeEnd(Long pkgPublishTimeEnd) {
        this.pkgPublishTimeEnd = pkgPublishTimeEnd;
        return this;
    }


    /**
     * set 打包人
     *
     * @param pkgCreator
     */
    public ListPublishPkgByPageParam pkgCreator(String pkgCreator) {
        this.pkgCreator = pkgCreator;
        return this;
    }


    /**
     * set 打包时间开始
     *
     * @param pkgCreateTimeStart
     */
    public ListPublishPkgByPageParam pkgCreateTimeStart(Long pkgCreateTimeStart) {
        this.pkgCreateTimeStart = pkgCreateTimeStart;
        return this;
    }


    /**
     * set 打包时间结束
     *
     * @param pkgCreateTimeEnd
     */
    public ListPublishPkgByPageParam pkgCreateTimeEnd(Long pkgCreateTimeEnd) {
        this.pkgCreateTimeEnd = pkgCreateTimeEnd;
        return this;
    }


}