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
 * 售卖内存规格
 */
public class AvailableMemorySpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 售卖内存（GB）
     */
    private Integer memoryGB;

    /**
     * 是否售罄
     */
    private Boolean soldOut;

    /**
     * 可用区列表
     */
    private List<AzInfo> availableZones;

    /**
     * 规格列表
     */
    private List<AvailableFlavor> availableFlavors;


    /**
     * get 售卖内存（GB）
     *
     * @return
     */
    public Integer getMemoryGB() {
        return memoryGB;
    }

    /**
     * set 售卖内存（GB）
     *
     * @param memoryGB
     */
    public void setMemoryGB(Integer memoryGB) {
        this.memoryGB = memoryGB;
    }

    /**
     * get 是否售罄
     *
     * @return
     */
    public Boolean getSoldOut() {
        return soldOut;
    }

    /**
     * set 是否售罄
     *
     * @param soldOut
     */
    public void setSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
    }

    /**
     * get 可用区列表
     *
     * @return
     */
    public List<AzInfo> getAvailableZones() {
        return availableZones;
    }

    /**
     * set 可用区列表
     *
     * @param availableZones
     */
    public void setAvailableZones(List<AzInfo> availableZones) {
        this.availableZones = availableZones;
    }

    /**
     * get 规格列表
     *
     * @return
     */
    public List<AvailableFlavor> getAvailableFlavors() {
        return availableFlavors;
    }

    /**
     * set 规格列表
     *
     * @param availableFlavors
     */
    public void setAvailableFlavors(List<AvailableFlavor> availableFlavors) {
        this.availableFlavors = availableFlavors;
    }


    /**
     * set 售卖内存（GB）
     *
     * @param memoryGB
     */
    public AvailableMemorySpec memoryGB(Integer memoryGB) {
        this.memoryGB = memoryGB;
        return this;
    }

    /**
     * set 是否售罄
     *
     * @param soldOut
     */
    public AvailableMemorySpec soldOut(Boolean soldOut) {
        this.soldOut = soldOut;
        return this;
    }

    /**
     * set 可用区列表
     *
     * @param availableZones
     */
    public AvailableMemorySpec availableZones(List<AzInfo> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    /**
     * set 规格列表
     *
     * @param availableFlavors
     */
    public AvailableMemorySpec availableFlavors(List<AvailableFlavor> availableFlavors) {
        this.availableFlavors = availableFlavors;
        return this;
    }


    /**
     * add item to 可用区列表
     *
     * @param availableZone
     */
    public void addAvailableZone(AzInfo availableZone) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZone);
    }

    /**
     * add item to 规格列表
     *
     * @param availableFlavor
     */
    public void addAvailableFlavor(AvailableFlavor availableFlavor) {
        if (this.availableFlavors == null) {
            this.availableFlavors = new ArrayList<>();
        }
        this.availableFlavors.add(availableFlavor);
    }

}