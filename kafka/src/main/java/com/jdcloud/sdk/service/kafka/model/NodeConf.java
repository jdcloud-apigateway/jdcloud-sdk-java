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

package com.jdcloud.sdk.service.kafka.model;

import java.util.List;
import java.util.ArrayList;

/**
 * nodeConf
 */
public class NodeConf  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 磁盘类型
     */
    private List<String> storageType;

    /**
     * 限制条件
     */
    private ConstraintsConf constraints;


    /**
     * get 磁盘类型
     *
     * @return
     */
    public List<String> getStorageType() {
        return storageType;
    }

    /**
     * set 磁盘类型
     *
     * @param storageType
     */
    public void setStorageType(List<String> storageType) {
        this.storageType = storageType;
    }

    /**
     * get 限制条件
     *
     * @return
     */
    public ConstraintsConf getConstraints() {
        return constraints;
    }

    /**
     * set 限制条件
     *
     * @param constraints
     */
    public void setConstraints(ConstraintsConf constraints) {
        this.constraints = constraints;
    }


    /**
     * set 磁盘类型
     *
     * @param storageType
     */
    public NodeConf storageType(List<String> storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * set 限制条件
     *
     * @param constraints
     */
    public NodeConf constraints(ConstraintsConf constraints) {
        this.constraints = constraints;
        return this;
    }


    /**
     * add item to 磁盘类型
     *
     * @param storageType
     */
    public void addStorageType(String storageType) {
        if (this.storageType == null) {
            this.storageType = new ArrayList<>();
        }
        this.storageType.add(storageType);
    }

}