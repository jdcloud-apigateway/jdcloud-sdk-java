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
 * McuTask
 * 混流任务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.openjrtc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.openjrtc.model.McuUser;
import com.jdcloud.sdk.service.openjrtc.model.OutputEncode;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 下发混流任务

 */
public class StartMcuTranscodeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 业务接入方定义的且在JRTC系统内注册过的房间号
     */
    private String userRoomId;

    /**
     * 布局模板-支持参数1
     */
    private Integer layoutTemplate;

    /**
     * 主人员userId
     */
    private String mainUserId;

    /**
     * 输出类型 1：录制 2：旁路转推
     */
    private Integer outputType;

    /**
     * 输出名称
     */
    private String outputName;

    /**
     * 参与混流人员参数
     */
    private List<McuUser> mcuUserInfos;

    /**
     * 输出格式
     */
    private OutputEncode outputEncode;


    /**
     * get 应用ID
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get 业务接入方定义的且在JRTC系统内注册过的房间号
     *
     * @return
     */
    public String getUserRoomId() {
        return userRoomId;
    }

    /**
     * set 业务接入方定义的且在JRTC系统内注册过的房间号
     *
     * @param userRoomId
     */
    public void setUserRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
    }

    /**
     * get 布局模板-支持参数1
     *
     * @return
     */
    public Integer getLayoutTemplate() {
        return layoutTemplate;
    }

    /**
     * set 布局模板-支持参数1
     *
     * @param layoutTemplate
     */
    public void setLayoutTemplate(Integer layoutTemplate) {
        this.layoutTemplate = layoutTemplate;
    }

    /**
     * get 主人员userId
     *
     * @return
     */
    public String getMainUserId() {
        return mainUserId;
    }

    /**
     * set 主人员userId
     *
     * @param mainUserId
     */
    public void setMainUserId(String mainUserId) {
        this.mainUserId = mainUserId;
    }

    /**
     * get 输出类型 1：录制 2：旁路转推
     *
     * @return
     */
    public Integer getOutputType() {
        return outputType;
    }

    /**
     * set 输出类型 1：录制 2：旁路转推
     *
     * @param outputType
     */
    public void setOutputType(Integer outputType) {
        this.outputType = outputType;
    }

    /**
     * get 输出名称
     *
     * @return
     */
    public String getOutputName() {
        return outputName;
    }

    /**
     * set 输出名称
     *
     * @param outputName
     */
    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    /**
     * get 参与混流人员参数
     *
     * @return
     */
    public List<McuUser> getMcuUserInfos() {
        return mcuUserInfos;
    }

    /**
     * set 参与混流人员参数
     *
     * @param mcuUserInfos
     */
    public void setMcuUserInfos(List<McuUser> mcuUserInfos) {
        this.mcuUserInfos = mcuUserInfos;
    }

    /**
     * get 输出格式
     *
     * @return
     */
    public OutputEncode getOutputEncode() {
        return outputEncode;
    }

    /**
     * set 输出格式
     *
     * @param outputEncode
     */
    public void setOutputEncode(OutputEncode outputEncode) {
        this.outputEncode = outputEncode;
    }


    /**
     * set 应用ID
     *
     * @param appId
     */
    public StartMcuTranscodeRequest appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 业务接入方定义的且在JRTC系统内注册过的房间号
     *
     * @param userRoomId
     */
    public StartMcuTranscodeRequest userRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
        return this;
    }

    /**
     * set 布局模板-支持参数1
     *
     * @param layoutTemplate
     */
    public StartMcuTranscodeRequest layoutTemplate(Integer layoutTemplate) {
        this.layoutTemplate = layoutTemplate;
        return this;
    }

    /**
     * set 主人员userId
     *
     * @param mainUserId
     */
    public StartMcuTranscodeRequest mainUserId(String mainUserId) {
        this.mainUserId = mainUserId;
        return this;
    }

    /**
     * set 输出类型 1：录制 2：旁路转推
     *
     * @param outputType
     */
    public StartMcuTranscodeRequest outputType(Integer outputType) {
        this.outputType = outputType;
        return this;
    }

    /**
     * set 输出名称
     *
     * @param outputName
     */
    public StartMcuTranscodeRequest outputName(String outputName) {
        this.outputName = outputName;
        return this;
    }

    /**
     * set 参与混流人员参数
     *
     * @param mcuUserInfos
     */
    public StartMcuTranscodeRequest mcuUserInfos(List<McuUser> mcuUserInfos) {
        this.mcuUserInfos = mcuUserInfos;
        return this;
    }

    /**
     * set 输出格式
     *
     * @param outputEncode
     */
    public StartMcuTranscodeRequest outputEncode(OutputEncode outputEncode) {
        this.outputEncode = outputEncode;
        return this;
    }


    /**
     * add item to 参与混流人员参数
     *
     * @param mcuUserInfo
     */
    public void addMcuUserInfo(McuUser mcuUserInfo) {
        if (this.mcuUserInfos == null) {
            this.mcuUserInfos = new ArrayList<>();
        }
        this.mcuUserInfos.add(mcuUserInfo);
    }

}