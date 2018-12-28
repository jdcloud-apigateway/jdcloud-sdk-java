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

package com.jdcloud.sdk.service.vod.model;


/**
 * transcodeTemplate
 */
public class TranscodeTemplate  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板ID
     */
    private Number coderateId;

    /**
     * 模板名称
     */
    private String name;

    /**
     * 封装格式
     */
    private String format;

    /**
     * 宽
     */
    private Integer width;

    /**
     * 高
     */
    private Integer height;

    /**
     * 视频码率
     */
    private Integer videoCodeRate;

    /**
     * 视频编码
     */
    private String videoCodec;

    /**
     * 音频编码
     */
    private String audioCodec;

    /**
     * 是否系统默认
     */
    private Integer type;

    /**
     * 修改时间
     */
    private String updateTime;


    /**
     * get 模板ID
     *
     * @return
     */
    public Number getCoderateId() {
        return coderateId;
    }

    /**
     * set 模板ID
     *
     * @param coderateId
     */
    public void setCoderateId(Number coderateId) {
        this.coderateId = coderateId;
    }

    /**
     * get 模板名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 模板名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 封装格式
     *
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * set 封装格式
     *
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * get 宽
     *
     * @return
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * set 宽
     *
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * get 高
     *
     * @return
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * set 高
     *
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * get 视频码率
     *
     * @return
     */
    public Integer getVideoCodeRate() {
        return videoCodeRate;
    }

    /**
     * set 视频码率
     *
     * @param videoCodeRate
     */
    public void setVideoCodeRate(Integer videoCodeRate) {
        this.videoCodeRate = videoCodeRate;
    }

    /**
     * get 视频编码
     *
     * @return
     */
    public String getVideoCodec() {
        return videoCodec;
    }

    /**
     * set 视频编码
     *
     * @param videoCodec
     */
    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    /**
     * get 音频编码
     *
     * @return
     */
    public String getAudioCodec() {
        return audioCodec;
    }

    /**
     * set 音频编码
     *
     * @param audioCodec
     */
    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    /**
     * get 是否系统默认
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 是否系统默认
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 模板ID
     *
     * @param coderateId
     */
    public TranscodeTemplate coderateId(Number coderateId) {
        this.coderateId = coderateId;
        return this;
    }

    /**
     * set 模板名称
     *
     * @param name
     */
    public TranscodeTemplate name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 封装格式
     *
     * @param format
     */
    public TranscodeTemplate format(String format) {
        this.format = format;
        return this;
    }

    /**
     * set 宽
     *
     * @param width
     */
    public TranscodeTemplate width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * set 高
     *
     * @param height
     */
    public TranscodeTemplate height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * set 视频码率
     *
     * @param videoCodeRate
     */
    public TranscodeTemplate videoCodeRate(Integer videoCodeRate) {
        this.videoCodeRate = videoCodeRate;
        return this;
    }

    /**
     * set 视频编码
     *
     * @param videoCodec
     */
    public TranscodeTemplate videoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }

    /**
     * set 音频编码
     *
     * @param audioCodec
     */
    public TranscodeTemplate audioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }

    /**
     * set 是否系统默认
     *
     * @param type
     */
    public TranscodeTemplate type(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public TranscodeTemplate updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}