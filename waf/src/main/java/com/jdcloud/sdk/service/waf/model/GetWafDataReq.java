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

package com.jdcloud.sdk.service.waf.model;

import java.util.List;
import java.util.ArrayList;

/**
 * getWafDataReq
 */
public class GetWafDataReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * userPins
     */
    
    private List<String> userPin;
    /**
     * 起始时间, utc时间戳
     */
    private Long startTime;

    /**
     * 结束时间, utc时间戳，必须大于起始时间
     */
    private Long endTime;



    /**
    * get userPins
    *
    * @return
    */
    public List<String> getUserPin() {
        return userPin;
    }

    /**
    * set userPins
    *
    * @param userPin
    */
    public void setUserPin(List<String> userPin) {
        this.userPin = userPin;
    }


    /**
     * get 起始时间, utc时间戳
     *
     * @return
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * set 起始时间, utc时间戳
     *
     * @param startTime
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }


    /**
     * get 结束时间, utc时间戳，必须大于起始时间
     *
     * @return
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间, utc时间戳，必须大于起始时间
     *
     * @param endTime
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }



    /**
    * set userPins
    *
    * @param userPin
    */
    public GetWafDataReq userPin(List<String> userPin) {
        this.userPin = userPin;
        return this;
    }


    /**
     * set 起始时间, utc时间戳
     *
     * @param startTime
     */
    public GetWafDataReq startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 结束时间, utc时间戳，必须大于起始时间
     *
     * @param endTime
     */
    public GetWafDataReq endTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }



    /**
     * add item to userPins
     *
     * @param userPin
     */
    public void addUserPin(String userPin) {
        if (this.userPin == null) {
            this.userPin = new ArrayList<>();
        }
        this.userPin.add(userPin);
    }
}