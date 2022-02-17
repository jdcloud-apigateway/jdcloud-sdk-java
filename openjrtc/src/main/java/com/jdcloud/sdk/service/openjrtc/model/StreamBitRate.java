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
 * 码率
 */
public class StreamBitRate  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 时间戳-毫秒
     */
    private Long date;

    /**
     * 码率
     */
    private Long bitrate;


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
     * get 码率
     *
     * @return
     */
    public Long getBitrate() {
        return bitrate;
    }

    /**
     * set 码率
     *
     * @param bitrate
     */
    public void setBitrate(Long bitrate) {
        this.bitrate = bitrate;
    }


    /**
     * set 时间戳-毫秒
     *
     * @param date
     */
    public StreamBitRate date(Long date) {
        this.date = date;
        return this;
    }

    /**
     * set 码率
     *
     * @param bitrate
     */
    public StreamBitRate bitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }


}