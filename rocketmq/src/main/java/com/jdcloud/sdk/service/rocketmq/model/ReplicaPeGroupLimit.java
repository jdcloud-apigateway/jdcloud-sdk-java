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

package com.jdcloud.sdk.service.rocketmq.model;


/**
 * replicaPeGroupLimit
 */
public class ReplicaPeGroupLimit  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 副本个数最大值
     */
    private Integer availableCount;

    /**
     * 副本个数最小值
     */
    private Integer minCount;

    /**
     * 副本个数默认值
     */
    private Integer defaultCount;

    /**
     * 副本个数步长
     */
    private Integer stepCount;



    /**
     * get 副本个数最大值
     *
     * @return
     */
    public Integer getAvailableCount() {
        return availableCount;
    }

    /**
     * set 副本个数最大值
     *
     * @param availableCount
     */
    public void setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
    }


    /**
     * get 副本个数最小值
     *
     * @return
     */
    public Integer getMinCount() {
        return minCount;
    }

    /**
     * set 副本个数最小值
     *
     * @param minCount
     */
    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
    }


    /**
     * get 副本个数默认值
     *
     * @return
     */
    public Integer getDefaultCount() {
        return defaultCount;
    }

    /**
     * set 副本个数默认值
     *
     * @param defaultCount
     */
    public void setDefaultCount(Integer defaultCount) {
        this.defaultCount = defaultCount;
    }


    /**
     * get 副本个数步长
     *
     * @return
     */
    public Integer getStepCount() {
        return stepCount;
    }

    /**
     * set 副本个数步长
     *
     * @param stepCount
     */
    public void setStepCount(Integer stepCount) {
        this.stepCount = stepCount;
    }



    /**
     * set 副本个数最大值
     *
     * @param availableCount
     */
    public ReplicaPeGroupLimit availableCount(Integer availableCount) {
        this.availableCount = availableCount;
        return this;
    }


    /**
     * set 副本个数最小值
     *
     * @param minCount
     */
    public ReplicaPeGroupLimit minCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }


    /**
     * set 副本个数默认值
     *
     * @param defaultCount
     */
    public ReplicaPeGroupLimit defaultCount(Integer defaultCount) {
        this.defaultCount = defaultCount;
        return this;
    }


    /**
     * set 副本个数步长
     *
     * @param stepCount
     */
    public ReplicaPeGroupLimit stepCount(Integer stepCount) {
        this.stepCount = stepCount;
        return this;
    }


}