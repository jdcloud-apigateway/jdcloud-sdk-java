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

package com.jdcloud.sdk.service.vm.model;


/**
 * 云主机实例GPU信息。
 */
public class Gpu  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * GPU卡型号。
     */
    private String model;

    /**
     * GPU卡数量。
     */
    private Integer number;



    /**
     * get GPU卡型号。
     *
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     * set GPU卡型号。
     *
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }


    /**
     * get GPU卡数量。
     *
     * @return
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * set GPU卡数量。
     *
     * @param number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }



    /**
     * set GPU卡型号。
     *
     * @param model
     */
    public Gpu model(String model) {
        this.model = model;
        return this;
    }


    /**
     * set GPU卡数量。
     *
     * @param number
     */
    public Gpu number(Integer number) {
        this.number = number;
        return this;
    }


}