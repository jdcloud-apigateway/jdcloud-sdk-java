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
 * ShenHaiPlatform Admin Manage APIs
 * 流程画布目录树管理
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取运行脚本结果
 */
public class UranusScriptGetScriptRunResultRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件名称 taskId_${结果集数字}  第一个结果就是：1_1,第二个结果集就是：1_2
     */
    private String fileName;

    /**
     * 文件业务code
     */
    private String fileCode;

    /**
     * 文件偏移量
     */
    private Long pos;

    /**
     * 读取结果条数
     */
    private Long lines;

    /**
     * 运行ID
     */
    private Integer historyId;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private String appName;



    /**
     * get 文件名称 taskId_${结果集数字}  第一个结果就是：1_1,第二个结果集就是：1_2
     *
     * @return
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * set 文件名称 taskId_${结果集数字}  第一个结果就是：1_1,第二个结果集就是：1_2
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * get 文件业务code
     *
     * @return
     */
    public String getFileCode() {
        return fileCode;
    }

    /**
     * set 文件业务code
     *
     * @param fileCode
     */
    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }


    /**
     * get 文件偏移量
     *
     * @return
     */
    public Long getPos() {
        return pos;
    }

    /**
     * set 文件偏移量
     *
     * @param pos
     */
    public void setPos(Long pos) {
        this.pos = pos;
    }


    /**
     * get 读取结果条数
     *
     * @return
     */
    public Long getLines() {
        return lines;
    }

    /**
     * set 读取结果条数
     *
     * @param lines
     */
    public void setLines(Long lines) {
        this.lines = lines;
    }


    /**
     * get 运行ID
     *
     * @return
     */
    public Integer getHistoryId() {
        return historyId;
    }

    /**
     * set 运行ID
     *
     * @param historyId
     */
    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }



    /**
     * set 文件名称 taskId_${结果集数字}  第一个结果就是：1_1,第二个结果集就是：1_2
     *
     * @param fileName
     */
    public UranusScriptGetScriptRunResultRequest fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }


    /**
     * set 文件业务code
     *
     * @param fileCode
     */
    public UranusScriptGetScriptRunResultRequest fileCode(String fileCode) {
        this.fileCode = fileCode;
        return this;
    }


    /**
     * set 文件偏移量
     *
     * @param pos
     */
    public UranusScriptGetScriptRunResultRequest pos(Long pos) {
        this.pos = pos;
        return this;
    }


    /**
     * set 读取结果条数
     *
     * @param lines
     */
    public UranusScriptGetScriptRunResultRequest lines(Long lines) {
        this.lines = lines;
        return this;
    }


    /**
     * set 运行ID
     *
     * @param historyId
     */
    public UranusScriptGetScriptRunResultRequest historyId(Integer historyId) {
        this.historyId = historyId;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public UranusScriptGetScriptRunResultRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public UranusScriptGetScriptRunResultRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}