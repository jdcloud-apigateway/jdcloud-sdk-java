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
 * 比特率
 */
public class BitRate  implements java.io.Serializable {

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
     * 比特率 bps
     */
    private Double bitrate;



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
     * get 比特率 bps
     *
     * @return
     */
    public Double getBitrate() {
        return bitrate;
    }

    /**
     * set 比特率 bps
     *
     * @param bitrate
     */
    public void setBitrate(Double bitrate) {
        this.bitrate = bitrate;
    }



    /**
     * set 业务接入方用户体系定义的且在JRTC系统内注册过的userId
     *
     * @param userId
     */
    public BitRate userId(String userId) {
        this.userId = userId;
        return this;
    }


    /**
     * set 时间戳-毫秒
     *
     * @param date
     */
    public BitRate date(Long date) {
        this.date = date;
        return this;
    }


    /**
     * set 比特率 bps
     *
     * @param bitrate
     */
    public BitRate bitrate(Double bitrate) {
        this.bitrate = bitrate;
        return this;
    }


}