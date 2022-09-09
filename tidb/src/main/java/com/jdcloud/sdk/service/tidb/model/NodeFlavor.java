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

package com.jdcloud.sdk.service.tidb.model;

import java.util.List;
import java.util.ArrayList;

/**
 * nodeFlavor
 */
public class NodeFlavor  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 允许的最大节点数
     */
    private Integer maxNum;

    /**
     * 允许的最小节点数
     */
    private Integer minNum;

    /**
     * flavors
     */
    
    private List<Flavor> flavors;


    /**
     * get 允许的最大节点数
     *
     * @return
     */
    public Integer getMaxNum() {
        return maxNum;
    }

    /**
     * set 允许的最大节点数
     *
     * @param maxNum
     */
    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }


    /**
     * get 允许的最小节点数
     *
     * @return
     */
    public Integer getMinNum() {
        return minNum;
    }

    /**
     * set 允许的最小节点数
     *
     * @param minNum
     */
    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }


    /**
    * get flavors
    *
    * @return
    */
    public List<Flavor> getFlavors() {
        return flavors;
    }

    /**
    * set flavors
    *
    * @param flavors
    */
    public void setFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
    }



    /**
     * set 允许的最大节点数
     *
     * @param maxNum
     */
    public NodeFlavor maxNum(Integer maxNum) {
        this.maxNum = maxNum;
        return this;
    }


    /**
     * set 允许的最小节点数
     *
     * @param minNum
     */
    public NodeFlavor minNum(Integer minNum) {
        this.minNum = minNum;
        return this;
    }


    /**
    * set flavors
    *
    * @param flavors
    */
    public NodeFlavor flavors(List<Flavor> flavors) {
        this.flavors = flavors;
        return this;
    }



    /**
     * add item to flavors
     *
     * @param flavor
     */
    public void addFlavor(Flavor flavor) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavor);
    }
}