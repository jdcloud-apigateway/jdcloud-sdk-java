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
 * flexibleStorageLimit
 */
public class FlexibleStorageLimit  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云盘最小值
     */
    private Integer minStorage;

    /**
     * 云盘最大值
     */
    private Integer maxStorage;

    /**
     * 云盘默认值
     */
    private Integer defaultStorage;

    /**
     * 云盘步长
     */
    private Integer stepStorage;



    /**
     * get 云盘最小值
     *
     * @return
     */
    public Integer getMinStorage() {
        return minStorage;
    }

    /**
     * set 云盘最小值
     *
     * @param minStorage
     */
    public void setMinStorage(Integer minStorage) {
        this.minStorage = minStorage;
    }


    /**
     * get 云盘最大值
     *
     * @return
     */
    public Integer getMaxStorage() {
        return maxStorage;
    }

    /**
     * set 云盘最大值
     *
     * @param maxStorage
     */
    public void setMaxStorage(Integer maxStorage) {
        this.maxStorage = maxStorage;
    }


    /**
     * get 云盘默认值
     *
     * @return
     */
    public Integer getDefaultStorage() {
        return defaultStorage;
    }

    /**
     * set 云盘默认值
     *
     * @param defaultStorage
     */
    public void setDefaultStorage(Integer defaultStorage) {
        this.defaultStorage = defaultStorage;
    }


    /**
     * get 云盘步长
     *
     * @return
     */
    public Integer getStepStorage() {
        return stepStorage;
    }

    /**
     * set 云盘步长
     *
     * @param stepStorage
     */
    public void setStepStorage(Integer stepStorage) {
        this.stepStorage = stepStorage;
    }



    /**
     * set 云盘最小值
     *
     * @param minStorage
     */
    public FlexibleStorageLimit minStorage(Integer minStorage) {
        this.minStorage = minStorage;
        return this;
    }


    /**
     * set 云盘最大值
     *
     * @param maxStorage
     */
    public FlexibleStorageLimit maxStorage(Integer maxStorage) {
        this.maxStorage = maxStorage;
        return this;
    }


    /**
     * set 云盘默认值
     *
     * @param defaultStorage
     */
    public FlexibleStorageLimit defaultStorage(Integer defaultStorage) {
        this.defaultStorage = defaultStorage;
        return this;
    }


    /**
     * set 云盘步长
     *
     * @param stepStorage
     */
    public FlexibleStorageLimit stepStorage(Integer stepStorage) {
        this.stepStorage = stepStorage;
        return this;
    }


}