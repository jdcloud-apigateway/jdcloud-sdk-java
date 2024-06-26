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

package com.jdcloud.sdk.service.jdccs.model;


/**
 * 时点数据
 */
public class DataPoint  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * UNIX时间戳
     */
    private Integer timestamp;

    /**
     * 采样值
     */
    private Double value;



    /**
     * get UNIX时间戳
     *
     * @return
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * set UNIX时间戳
     *
     * @param timestamp
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * get 采样值
     *
     * @return
     */
    public Double getValue() {
        return value;
    }

    /**
     * set 采样值
     *
     * @param value
     */
    public void setValue(Double value) {
        this.value = value;
    }



    /**
     * set UNIX时间戳
     *
     * @param timestamp
     */
    public DataPoint timestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }


    /**
     * set 采样值
     *
     * @param value
     */
    public DataPoint value(Double value) {
        this.value = value;
        return this;
    }


}