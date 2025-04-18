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

package com.jdcloud.sdk.service.shenhaiplatform.model;


/**
 * publishObjDetailVo
 */
public class PublishObjDetailVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Long objId;

    /**
     * 发布对象类型
     */
    private String objType;

    /**
     * 对象名称
     */
    private String objName;

    /**
     * 对象ID
     */
    private String objUk;

    /**
     * 提交人
     */
    private String submitter;

    /**
     * 版本号
     */
    private String versionPretty;

    /**
     * 提交时间
     */
    private Long submitTimestamp;

    /**
     * 脚本内容，[数据开发]和[数据表]类型有该值
     */
    private String scriptContent;

    /**
     * 配置内容，[数据开发]和[数据集成]类型有该值
     */
    private String configContent;



    /**
     * get ID
     *
     * @return
     */
    public Long getObjId() {
        return objId;
    }

    /**
     * set ID
     *
     * @param objId
     */
    public void setObjId(Long objId) {
        this.objId = objId;
    }


    /**
     * get 发布对象类型
     *
     * @return
     */
    public String getObjType() {
        return objType;
    }

    /**
     * set 发布对象类型
     *
     * @param objType
     */
    public void setObjType(String objType) {
        this.objType = objType;
    }


    /**
     * get 对象名称
     *
     * @return
     */
    public String getObjName() {
        return objName;
    }

    /**
     * set 对象名称
     *
     * @param objName
     */
    public void setObjName(String objName) {
        this.objName = objName;
    }


    /**
     * get 对象ID
     *
     * @return
     */
    public String getObjUk() {
        return objUk;
    }

    /**
     * set 对象ID
     *
     * @param objUk
     */
    public void setObjUk(String objUk) {
        this.objUk = objUk;
    }


    /**
     * get 提交人
     *
     * @return
     */
    public String getSubmitter() {
        return submitter;
    }

    /**
     * set 提交人
     *
     * @param submitter
     */
    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }


    /**
     * get 版本号
     *
     * @return
     */
    public String getVersionPretty() {
        return versionPretty;
    }

    /**
     * set 版本号
     *
     * @param versionPretty
     */
    public void setVersionPretty(String versionPretty) {
        this.versionPretty = versionPretty;
    }


    /**
     * get 提交时间
     *
     * @return
     */
    public Long getSubmitTimestamp() {
        return submitTimestamp;
    }

    /**
     * set 提交时间
     *
     * @param submitTimestamp
     */
    public void setSubmitTimestamp(Long submitTimestamp) {
        this.submitTimestamp = submitTimestamp;
    }


    /**
     * get 脚本内容，[数据开发]和[数据表]类型有该值
     *
     * @return
     */
    public String getScriptContent() {
        return scriptContent;
    }

    /**
     * set 脚本内容，[数据开发]和[数据表]类型有该值
     *
     * @param scriptContent
     */
    public void setScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
    }


    /**
     * get 配置内容，[数据开发]和[数据集成]类型有该值
     *
     * @return
     */
    public String getConfigContent() {
        return configContent;
    }

    /**
     * set 配置内容，[数据开发]和[数据集成]类型有该值
     *
     * @param configContent
     */
    public void setConfigContent(String configContent) {
        this.configContent = configContent;
    }



    /**
     * set ID
     *
     * @param objId
     */
    public PublishObjDetailVo objId(Long objId) {
        this.objId = objId;
        return this;
    }


    /**
     * set 发布对象类型
     *
     * @param objType
     */
    public PublishObjDetailVo objType(String objType) {
        this.objType = objType;
        return this;
    }


    /**
     * set 对象名称
     *
     * @param objName
     */
    public PublishObjDetailVo objName(String objName) {
        this.objName = objName;
        return this;
    }


    /**
     * set 对象ID
     *
     * @param objUk
     */
    public PublishObjDetailVo objUk(String objUk) {
        this.objUk = objUk;
        return this;
    }


    /**
     * set 提交人
     *
     * @param submitter
     */
    public PublishObjDetailVo submitter(String submitter) {
        this.submitter = submitter;
        return this;
    }


    /**
     * set 版本号
     *
     * @param versionPretty
     */
    public PublishObjDetailVo versionPretty(String versionPretty) {
        this.versionPretty = versionPretty;
        return this;
    }


    /**
     * set 提交时间
     *
     * @param submitTimestamp
     */
    public PublishObjDetailVo submitTimestamp(Long submitTimestamp) {
        this.submitTimestamp = submitTimestamp;
        return this;
    }


    /**
     * set 脚本内容，[数据开发]和[数据表]类型有该值
     *
     * @param scriptContent
     */
    public PublishObjDetailVo scriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }


    /**
     * set 配置内容，[数据开发]和[数据集成]类型有该值
     *
     * @param configContent
     */
    public PublishObjDetailVo configContent(String configContent) {
        this.configContent = configContent;
        return this;
    }


}