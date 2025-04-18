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
import com.jdcloud.sdk.annotation.Required;

/**
 * 目录请求实体
 */
public class UranusCatalogInfoList  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 前端排序唯一ID
     */
    private String unrealId;

    /**
     * 目录code
     * Required:true
     */
    @Required
    private String catalogCode;

    /**
     * 目录名称
     */
    private String catalogName;

    /**
     * 0：非叶子目录， 1：叶子目录
     */
    private Integer catalogType;

    /**
     * 父目录code
     */
    private String parentCode;

    /**
     * 子节点数量
     */
    private Integer childrenNum;

    /**
     * 流程列表
     */
    
    private List<UranusTaskFlowListRes> taskFlowList;


    /**
     * get 前端排序唯一ID
     *
     * @return
     */
    public String getUnrealId() {
        return unrealId;
    }

    /**
     * set 前端排序唯一ID
     *
     * @param unrealId
     */
    public void setUnrealId(String unrealId) {
        this.unrealId = unrealId;
    }


    /**
     * get 目录code
     *
     * @return
     */
    public String getCatalogCode() {
        return catalogCode;
    }

    /**
     * set 目录code
     *
     * @param catalogCode
     */
    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }


    /**
     * get 目录名称
     *
     * @return
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * set 目录名称
     *
     * @param catalogName
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }


    /**
     * get 0：非叶子目录， 1：叶子目录
     *
     * @return
     */
    public Integer getCatalogType() {
        return catalogType;
    }

    /**
     * set 0：非叶子目录， 1：叶子目录
     *
     * @param catalogType
     */
    public void setCatalogType(Integer catalogType) {
        this.catalogType = catalogType;
    }


    /**
     * get 父目录code
     *
     * @return
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * set 父目录code
     *
     * @param parentCode
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }


    /**
     * get 子节点数量
     *
     * @return
     */
    public Integer getChildrenNum() {
        return childrenNum;
    }

    /**
     * set 子节点数量
     *
     * @param childrenNum
     */
    public void setChildrenNum(Integer childrenNum) {
        this.childrenNum = childrenNum;
    }


    /**
    * get 流程列表
    *
    * @return
    */
    public List<UranusTaskFlowListRes> getTaskFlowList() {
        return taskFlowList;
    }

    /**
    * set 流程列表
    *
    * @param taskFlowList
    */
    public void setTaskFlowList(List<UranusTaskFlowListRes> taskFlowList) {
        this.taskFlowList = taskFlowList;
    }



    /**
     * set 前端排序唯一ID
     *
     * @param unrealId
     */
    public UranusCatalogInfoList unrealId(String unrealId) {
        this.unrealId = unrealId;
        return this;
    }


    /**
     * set 目录code
     *
     * @param catalogCode
     */
    public UranusCatalogInfoList catalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
        return this;
    }


    /**
     * set 目录名称
     *
     * @param catalogName
     */
    public UranusCatalogInfoList catalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }


    /**
     * set 0：非叶子目录， 1：叶子目录
     *
     * @param catalogType
     */
    public UranusCatalogInfoList catalogType(Integer catalogType) {
        this.catalogType = catalogType;
        return this;
    }


    /**
     * set 父目录code
     *
     * @param parentCode
     */
    public UranusCatalogInfoList parentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }


    /**
     * set 子节点数量
     *
     * @param childrenNum
     */
    public UranusCatalogInfoList childrenNum(Integer childrenNum) {
        this.childrenNum = childrenNum;
        return this;
    }


    /**
    * set 流程列表
    *
    * @param taskFlowList
    */
    public UranusCatalogInfoList taskFlowList(List<UranusTaskFlowListRes> taskFlowList) {
        this.taskFlowList = taskFlowList;
        return this;
    }



    /**
     * add item to 流程列表
     *
     * @param taskFlowList
     */
    public void addTaskFlowList(UranusTaskFlowListRes taskFlowList) {
        if (this.taskFlowList == null) {
            this.taskFlowList = new ArrayList<>();
        }
        this.taskFlowList.add(taskFlowList);
    }
}