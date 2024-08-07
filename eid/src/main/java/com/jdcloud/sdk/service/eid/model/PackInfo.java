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

package com.jdcloud.sdk.service.eid.model;


/**
 * packInfo
 */
public class PackInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源包类型
     */
    private String packageType;

    /**
     * 来源，1-免费，2-付费
     */
    private Integer from;

    /**
     * 总用量
     */
    private String totalAmount;

    /**
     * 剩余用量
     */
    private String balanceAmount;

    /**
     * 生效时间
     */
    private String startTime;

    /**
     * 失效时间
     */
    private String endTime;

    /**
     * 资源包id
     */
    private String packId;



    /**
     * get 资源包类型
     *
     * @return
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * set 资源包类型
     *
     * @param packageType
     */
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }


    /**
     * get 来源，1-免费，2-付费
     *
     * @return
     */
    public Integer getFrom() {
        return from;
    }

    /**
     * set 来源，1-免费，2-付费
     *
     * @param from
     */
    public void setFrom(Integer from) {
        this.from = from;
    }


    /**
     * get 总用量
     *
     * @return
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * set 总用量
     *
     * @param totalAmount
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * get 剩余用量
     *
     * @return
     */
    public String getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * set 剩余用量
     *
     * @param balanceAmount
     */
    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
    }


    /**
     * get 生效时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 生效时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 失效时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 失效时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * get 资源包id
     *
     * @return
     */
    public String getPackId() {
        return packId;
    }

    /**
     * set 资源包id
     *
     * @param packId
     */
    public void setPackId(String packId) {
        this.packId = packId;
    }



    /**
     * set 资源包类型
     *
     * @param packageType
     */
    public PackInfo packageType(String packageType) {
        this.packageType = packageType;
        return this;
    }


    /**
     * set 来源，1-免费，2-付费
     *
     * @param from
     */
    public PackInfo from(Integer from) {
        this.from = from;
        return this;
    }


    /**
     * set 总用量
     *
     * @param totalAmount
     */
    public PackInfo totalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }


    /**
     * set 剩余用量
     *
     * @param balanceAmount
     */
    public PackInfo balanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
        return this;
    }


    /**
     * set 生效时间
     *
     * @param startTime
     */
    public PackInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 失效时间
     *
     * @param endTime
     */
    public PackInfo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 资源包id
     *
     * @param packId
     */
    public PackInfo packId(String packId) {
        this.packId = packId;
        return this;
    }


}