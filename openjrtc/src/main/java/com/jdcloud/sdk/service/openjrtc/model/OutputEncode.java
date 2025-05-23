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
 * outputEncode
 */
public class OutputEncode  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 混流类型：1：音频 2：视频  3：音视频
     */
    private Integer outputKind;

    /**
     * 混流-输出流音频采样率。取值为[48000, 44100, 32000, 24000, 16000, 8000]，单位Hz。
     */
    private Integer audioSampleRate;

    /**
     * 音频比特率：取值范围[8,500]
     */
    private Integer audioBitrate;

    /**
     * 通道：取值范围[1,2]
     */
    private Integer audioChannels;

    /**
     * 视频比特率：取值范围[1,10000]
     */
    private Integer videoBitrate;

    /**
     * 视频帧率：取值范围[1,60]
     */
    private Integer videoFrame;

    /**
     * 视频宽：取值范围[1,1920]
     */
    private Integer videoWidth;

    /**
     * 视频高：取值范围[1,1080]
     */
    private Integer videoHeight;

    /**
     * 取值范围[1,5]
     */
    private Integer videoGop;



    /**
     * get 混流类型：1：音频 2：视频  3：音视频
     *
     * @return
     */
    public Integer getOutputKind() {
        return outputKind;
    }

    /**
     * set 混流类型：1：音频 2：视频  3：音视频
     *
     * @param outputKind
     */
    public void setOutputKind(Integer outputKind) {
        this.outputKind = outputKind;
    }


    /**
     * get 混流-输出流音频采样率。取值为[48000, 44100, 32000, 24000, 16000, 8000]，单位Hz。
     *
     * @return
     */
    public Integer getAudioSampleRate() {
        return audioSampleRate;
    }

    /**
     * set 混流-输出流音频采样率。取值为[48000, 44100, 32000, 24000, 16000, 8000]，单位Hz。
     *
     * @param audioSampleRate
     */
    public void setAudioSampleRate(Integer audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
    }


    /**
     * get 音频比特率：取值范围[8,500]
     *
     * @return
     */
    public Integer getAudioBitrate() {
        return audioBitrate;
    }

    /**
     * set 音频比特率：取值范围[8,500]
     *
     * @param audioBitrate
     */
    public void setAudioBitrate(Integer audioBitrate) {
        this.audioBitrate = audioBitrate;
    }


    /**
     * get 通道：取值范围[1,2]
     *
     * @return
     */
    public Integer getAudioChannels() {
        return audioChannels;
    }

    /**
     * set 通道：取值范围[1,2]
     *
     * @param audioChannels
     */
    public void setAudioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
    }


    /**
     * get 视频比特率：取值范围[1,10000]
     *
     * @return
     */
    public Integer getVideoBitrate() {
        return videoBitrate;
    }

    /**
     * set 视频比特率：取值范围[1,10000]
     *
     * @param videoBitrate
     */
    public void setVideoBitrate(Integer videoBitrate) {
        this.videoBitrate = videoBitrate;
    }


    /**
     * get 视频帧率：取值范围[1,60]
     *
     * @return
     */
    public Integer getVideoFrame() {
        return videoFrame;
    }

    /**
     * set 视频帧率：取值范围[1,60]
     *
     * @param videoFrame
     */
    public void setVideoFrame(Integer videoFrame) {
        this.videoFrame = videoFrame;
    }


    /**
     * get 视频宽：取值范围[1,1920]
     *
     * @return
     */
    public Integer getVideoWidth() {
        return videoWidth;
    }

    /**
     * set 视频宽：取值范围[1,1920]
     *
     * @param videoWidth
     */
    public void setVideoWidth(Integer videoWidth) {
        this.videoWidth = videoWidth;
    }


    /**
     * get 视频高：取值范围[1,1080]
     *
     * @return
     */
    public Integer getVideoHeight() {
        return videoHeight;
    }

    /**
     * set 视频高：取值范围[1,1080]
     *
     * @param videoHeight
     */
    public void setVideoHeight(Integer videoHeight) {
        this.videoHeight = videoHeight;
    }


    /**
     * get 取值范围[1,5]
     *
     * @return
     */
    public Integer getVideoGop() {
        return videoGop;
    }

    /**
     * set 取值范围[1,5]
     *
     * @param videoGop
     */
    public void setVideoGop(Integer videoGop) {
        this.videoGop = videoGop;
    }



    /**
     * set 混流类型：1：音频 2：视频  3：音视频
     *
     * @param outputKind
     */
    public OutputEncode outputKind(Integer outputKind) {
        this.outputKind = outputKind;
        return this;
    }


    /**
     * set 混流-输出流音频采样率。取值为[48000, 44100, 32000, 24000, 16000, 8000]，单位Hz。
     *
     * @param audioSampleRate
     */
    public OutputEncode audioSampleRate(Integer audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
        return this;
    }


    /**
     * set 音频比特率：取值范围[8,500]
     *
     * @param audioBitrate
     */
    public OutputEncode audioBitrate(Integer audioBitrate) {
        this.audioBitrate = audioBitrate;
        return this;
    }


    /**
     * set 通道：取值范围[1,2]
     *
     * @param audioChannels
     */
    public OutputEncode audioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
        return this;
    }


    /**
     * set 视频比特率：取值范围[1,10000]
     *
     * @param videoBitrate
     */
    public OutputEncode videoBitrate(Integer videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }


    /**
     * set 视频帧率：取值范围[1,60]
     *
     * @param videoFrame
     */
    public OutputEncode videoFrame(Integer videoFrame) {
        this.videoFrame = videoFrame;
        return this;
    }


    /**
     * set 视频宽：取值范围[1,1920]
     *
     * @param videoWidth
     */
    public OutputEncode videoWidth(Integer videoWidth) {
        this.videoWidth = videoWidth;
        return this;
    }


    /**
     * set 视频高：取值范围[1,1080]
     *
     * @param videoHeight
     */
    public OutputEncode videoHeight(Integer videoHeight) {
        this.videoHeight = videoHeight;
        return this;
    }


    /**
     * set 取值范围[1,5]
     *
     * @param videoGop
     */
    public OutputEncode videoGop(Integer videoGop) {
        this.videoGop = videoGop;
        return this;
    }


}