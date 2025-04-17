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

package com.jdcloud.sdk.service.openjrtc.model;


/**
 * 网络丢包
 */
public class PacketLoss  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 业务接入方用户体系定义的且在JRTC系统内注册过的userId
     */
    private String userId;

    /**
     * 时间戳-毫秒
     */
    private Long date;

    /**
     * 最大丢包
     */
    private Double maxPacketLoss;

    /**
     * 平均丢包
     */
    private Double avgPacketLoss;



    /**
     * get 业务接入方用户体系定义的且在JRTC系统内注册过的userId
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set 业务接入方用户体系定义的且在JRTC系统内注册过的userId
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * get 时间戳-毫秒
     *
     * @return
     */
    public Long getDate() {
        return date;
    }

    /**
     * set 时间戳-毫秒
     *
     * @param date
     */
    public void setDate(Long date) {
        this.date = date;
    }


    /**
     * get 最大丢包
     *
     * @return
     */
    public Double getMaxPacketLoss() {
        return maxPacketLoss;
    }

    /**
     * set 最大丢包
     *
     * @param maxPacketLoss
     */
    public void setMaxPacketLoss(Double maxPacketLoss) {
        this.maxPacketLoss = maxPacketLoss;
    }


    /**
     * get 平均丢包
     *
     * @return
     */
    public Double getAvgPacketLoss() {
        return avgPacketLoss;
    }

    /**
     * set 平均丢包
     *
     * @param avgPacketLoss
     */
    public void setAvgPacketLoss(Double avgPacketLoss) {
        this.avgPacketLoss = avgPacketLoss;
    }



    /**
     * set 业务接入方用户体系定义的且在JRTC系统内注册过的userId
     *
     * @param userId
     */
    public PacketLoss userId(String userId) {
        this.userId = userId;
        return this;
    }


    /**
     * set 时间戳-毫秒
     *
     * @param date
     */
    public PacketLoss date(Long date) {
        this.date = date;
        return this;
    }


    /**
     * set 最大丢包
     *
     * @param maxPacketLoss
     */
    public PacketLoss maxPacketLoss(Double maxPacketLoss) {
        this.maxPacketLoss = maxPacketLoss;
        return this;
    }


    /**
     * set 平均丢包
     *
     * @param avgPacketLoss
     */
    public PacketLoss avgPacketLoss(Double avgPacketLoss) {
        this.avgPacketLoss = avgPacketLoss;
        return this;
    }


}