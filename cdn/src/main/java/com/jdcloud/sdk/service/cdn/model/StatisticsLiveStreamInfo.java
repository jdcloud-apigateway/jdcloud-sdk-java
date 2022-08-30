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

package com.jdcloud.sdk.service.cdn.model;


/**
 * statisticsLiveStreamInfo
 */
public class StatisticsLiveStreamInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 流起始时间
     */
    private String startTime;

    /**
     * app名
     */
    private String appName;

    /**
     * 流名
     */
    private String streamName;

    /**
     * 上行码率
     */
    private Double avgupSpeed;

    /**
     * 上行帧率
     */
    private Double avgupframerate;

    /**
     * 观看人数
     */
    private Long playerCount;



    /**
     * get 流起始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 流起始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get app名
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set app名
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }


    /**
     * get 流名
     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set 流名
     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }


    /**
     * get 上行码率
     *
     * @return
     */
    public Double getAvgupSpeed() {
        return avgupSpeed;
    }

    /**
     * set 上行码率
     *
     * @param avgupSpeed
     */
    public void setAvgupSpeed(Double avgupSpeed) {
        this.avgupSpeed = avgupSpeed;
    }


    /**
     * get 上行帧率
     *
     * @return
     */
    public Double getAvgupframerate() {
        return avgupframerate;
    }

    /**
     * set 上行帧率
     *
     * @param avgupframerate
     */
    public void setAvgupframerate(Double avgupframerate) {
        this.avgupframerate = avgupframerate;
    }


    /**
     * get 观看人数
     *
     * @return
     */
    public Long getPlayerCount() {
        return playerCount;
    }

    /**
     * set 观看人数
     *
     * @param playerCount
     */
    public void setPlayerCount(Long playerCount) {
        this.playerCount = playerCount;
    }



    /**
     * set 流起始时间
     *
     * @param startTime
     */
    public StatisticsLiveStreamInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set app名
     *
     * @param appName
     */
    public StatisticsLiveStreamInfo appName(String appName) {
        this.appName = appName;
        return this;
    }


    /**
     * set 流名
     *
     * @param streamName
     */
    public StatisticsLiveStreamInfo streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }


    /**
     * set 上行码率
     *
     * @param avgupSpeed
     */
    public StatisticsLiveStreamInfo avgupSpeed(Double avgupSpeed) {
        this.avgupSpeed = avgupSpeed;
        return this;
    }


    /**
     * set 上行帧率
     *
     * @param avgupframerate
     */
    public StatisticsLiveStreamInfo avgupframerate(Double avgupframerate) {
        this.avgupframerate = avgupframerate;
        return this;
    }


    /**
     * set 观看人数
     *
     * @param playerCount
     */
    public StatisticsLiveStreamInfo playerCount(Long playerCount) {
        this.playerCount = playerCount;
        return this;
    }


}