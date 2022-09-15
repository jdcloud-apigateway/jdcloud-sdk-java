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

package com.jdcloud.sdk.service.redis.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 规格信息
 */
public class AvailableFlavor  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分片数
     */
    private Integer shardNumber;

    /**
     * IP数
     */
    private Integer ipNumber;

    /**
     * 是否推荐
     */
    private Boolean recommended;

    /**
     * 规格代码，标准版为实例的规格代码；集群版为单分片规格代码
     */
    
    private List<String> instanceClasses;
    /**
     * 规格详情
     */
    private FlavorDetail detail;



    /**
     * get 分片数
     *
     * @return
     */
    public Integer getShardNumber() {
        return shardNumber;
    }

    /**
     * set 分片数
     *
     * @param shardNumber
     */
    public void setShardNumber(Integer shardNumber) {
        this.shardNumber = shardNumber;
    }


    /**
     * get IP数
     *
     * @return
     */
    public Integer getIpNumber() {
        return ipNumber;
    }

    /**
     * set IP数
     *
     * @param ipNumber
     */
    public void setIpNumber(Integer ipNumber) {
        this.ipNumber = ipNumber;
    }


    /**
     * get 是否推荐
     *
     * @return
     */
    public Boolean getRecommended() {
        return recommended;
    }

    /**
     * set 是否推荐
     *
     * @param recommended
     */
    public void setRecommended(Boolean recommended) {
        this.recommended = recommended;
    }


    /**
    * get 规格代码，标准版为实例的规格代码；集群版为单分片规格代码
    *
    * @return
    */
    public List<String> getInstanceClasses() {
        return instanceClasses;
    }

    /**
    * set 规格代码，标准版为实例的规格代码；集群版为单分片规格代码
    *
    * @param instanceClasses
    */
    public void setInstanceClasses(List<String> instanceClasses) {
        this.instanceClasses = instanceClasses;
    }


    /**
     * get 规格详情
     *
     * @return
     */
    public FlavorDetail getDetail() {
        return detail;
    }

    /**
     * set 规格详情
     *
     * @param detail
     */
    public void setDetail(FlavorDetail detail) {
        this.detail = detail;
    }



    /**
     * set 分片数
     *
     * @param shardNumber
     */
    public AvailableFlavor shardNumber(Integer shardNumber) {
        this.shardNumber = shardNumber;
        return this;
    }


    /**
     * set IP数
     *
     * @param ipNumber
     */
    public AvailableFlavor ipNumber(Integer ipNumber) {
        this.ipNumber = ipNumber;
        return this;
    }


    /**
     * set 是否推荐
     *
     * @param recommended
     */
    public AvailableFlavor recommended(Boolean recommended) {
        this.recommended = recommended;
        return this;
    }


    /**
    * set 规格代码，标准版为实例的规格代码；集群版为单分片规格代码
    *
    * @param instanceClasses
    */
    public AvailableFlavor instanceClasses(List<String> instanceClasses) {
        this.instanceClasses = instanceClasses;
        return this;
    }


    /**
     * set 规格详情
     *
     * @param detail
     */
    public AvailableFlavor detail(FlavorDetail detail) {
        this.detail = detail;
        return this;
    }



    /**
     * add item to 规格代码，标准版为实例的规格代码；集群版为单分片规格代码
     *
     * @param instanceClasse
     */
    public void addInstanceClasse(String instanceClasse) {
        if (this.instanceClasses == null) {
            this.instanceClasses = new ArrayList<>();
        }
        this.instanceClasses.add(instanceClasse);
    }
}