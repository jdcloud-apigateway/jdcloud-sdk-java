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

package com.jdcloud.sdk.service.yunding.model;


/**
 * ydSnapfeeState
 */
public class YdSnapfeeState  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云鼎pin
     */
    private String ydPin;

    /**
     * 云鼎资源id（产研侧）
     */
    private String resourceId;

    /**
     * 状态 1：正常，3：欠费停服，4：欠费删除，13：到期停服/退款删除，14：到期删除，24：运营删除，34:用户删除
     */
    private Integer state;



    /**
     * get 云鼎pin
     *
     * @return
     */
    public String getYdPin() {
        return ydPin;
    }

    /**
     * set 云鼎pin
     *
     * @param ydPin
     */
    public void setYdPin(String ydPin) {
        this.ydPin = ydPin;
    }


    /**
     * get 云鼎资源id（产研侧）
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 云鼎资源id（产研侧）
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * get 状态 1：正常，3：欠费停服，4：欠费删除，13：到期停服/退款删除，14：到期删除，24：运营删除，34:用户删除
     *
     * @return
     */
    public Integer getState() {
        return state;
    }

    /**
     * set 状态 1：正常，3：欠费停服，4：欠费删除，13：到期停服/退款删除，14：到期删除，24：运营删除，34:用户删除
     *
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }



    /**
     * set 云鼎pin
     *
     * @param ydPin
     */
    public YdSnapfeeState ydPin(String ydPin) {
        this.ydPin = ydPin;
        return this;
    }


    /**
     * set 云鼎资源id（产研侧）
     *
     * @param resourceId
     */
    public YdSnapfeeState resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 状态 1：正常，3：欠费停服，4：欠费删除，13：到期停服/退款删除，14：到期删除，24：运营删除，34:用户删除
     *
     * @param state
     */
    public YdSnapfeeState state(Integer state) {
        this.state = state;
        return this;
    }


}