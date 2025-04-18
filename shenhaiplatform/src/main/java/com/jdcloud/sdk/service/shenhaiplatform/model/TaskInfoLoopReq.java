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
 * 循环节点的信息内容
 */
public class TaskInfoLoopReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 循环节点类型 ITERATION：迭代, LIST：列表
     */
    private String loopType;

    /**
     * 循环参数列表，只对应LIST类型
     */
    
    private List<LoopParam> loopParamList;
    /**
     * 迭代次数，只对应ITERATION类型
     */
    private Integer loopTimes;

    /**
     * 每次循环批次
     */
    private Integer loopBatchSize;

    /**
     * 每批次执行的时间间隔，单位秒
     */
    private Integer loopBatchInterval;



    /**
     * get 循环节点类型 ITERATION：迭代, LIST：列表
     *
     * @return
     */
    public String getLoopType() {
        return loopType;
    }

    /**
     * set 循环节点类型 ITERATION：迭代, LIST：列表
     *
     * @param loopType
     */
    public void setLoopType(String loopType) {
        this.loopType = loopType;
    }


    /**
    * get 循环参数列表，只对应LIST类型
    *
    * @return
    */
    public List<LoopParam> getLoopParamList() {
        return loopParamList;
    }

    /**
    * set 循环参数列表，只对应LIST类型
    *
    * @param loopParamList
    */
    public void setLoopParamList(List<LoopParam> loopParamList) {
        this.loopParamList = loopParamList;
    }


    /**
     * get 迭代次数，只对应ITERATION类型
     *
     * @return
     */
    public Integer getLoopTimes() {
        return loopTimes;
    }

    /**
     * set 迭代次数，只对应ITERATION类型
     *
     * @param loopTimes
     */
    public void setLoopTimes(Integer loopTimes) {
        this.loopTimes = loopTimes;
    }


    /**
     * get 每次循环批次
     *
     * @return
     */
    public Integer getLoopBatchSize() {
        return loopBatchSize;
    }

    /**
     * set 每次循环批次
     *
     * @param loopBatchSize
     */
    public void setLoopBatchSize(Integer loopBatchSize) {
        this.loopBatchSize = loopBatchSize;
    }


    /**
     * get 每批次执行的时间间隔，单位秒
     *
     * @return
     */
    public Integer getLoopBatchInterval() {
        return loopBatchInterval;
    }

    /**
     * set 每批次执行的时间间隔，单位秒
     *
     * @param loopBatchInterval
     */
    public void setLoopBatchInterval(Integer loopBatchInterval) {
        this.loopBatchInterval = loopBatchInterval;
    }



    /**
     * set 循环节点类型 ITERATION：迭代, LIST：列表
     *
     * @param loopType
     */
    public TaskInfoLoopReq loopType(String loopType) {
        this.loopType = loopType;
        return this;
    }


    /**
    * set 循环参数列表，只对应LIST类型
    *
    * @param loopParamList
    */
    public TaskInfoLoopReq loopParamList(List<LoopParam> loopParamList) {
        this.loopParamList = loopParamList;
        return this;
    }


    /**
     * set 迭代次数，只对应ITERATION类型
     *
     * @param loopTimes
     */
    public TaskInfoLoopReq loopTimes(Integer loopTimes) {
        this.loopTimes = loopTimes;
        return this;
    }


    /**
     * set 每次循环批次
     *
     * @param loopBatchSize
     */
    public TaskInfoLoopReq loopBatchSize(Integer loopBatchSize) {
        this.loopBatchSize = loopBatchSize;
        return this;
    }


    /**
     * set 每批次执行的时间间隔，单位秒
     *
     * @param loopBatchInterval
     */
    public TaskInfoLoopReq loopBatchInterval(Integer loopBatchInterval) {
        this.loopBatchInterval = loopBatchInterval;
        return this;
    }



    /**
     * add item to 循环参数列表，只对应LIST类型
     *
     * @param loopParamList
     */
    public void addLoopParamList(LoopParam loopParamList) {
        if (this.loopParamList == null) {
            this.loopParamList = new ArrayList<>();
        }
        this.loopParamList.add(loopParamList);
    }
}