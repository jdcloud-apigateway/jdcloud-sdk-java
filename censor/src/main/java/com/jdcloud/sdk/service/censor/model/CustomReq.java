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

package com.jdcloud.sdk.service.censor.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * customReq
 */
public class CustomReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 检测类型，api/oss/website,默认api
     */
    private String censorType;

    /**
     * 站点检查实例Id，多个以 , 分割；当censorType为website时，该参数必填
     */
    private String websiteInstanceId;

    /**
     * 文件类型，text-文本，image-图片，audio-音频，video-视频
     * Required:true
     */
    @Required
    private String resourceType;

    /**
     * 匹配方式，exact:精确匹配，fuzzy:模糊匹配；仅限文本类型,默认exact
     */
    private String matchType;

    /**
     * 敏感库名
     * Required:true
     */
    @Required
    private String name;

    /**
     * 文本/语音支持 antispam-反垃圾，视频/图片支持 porn-涉黄，terrorism-涉政暴恐，ad-图文广告
     * Required:true
     */
    @Required
    private String scenes;

    /**
     * pass 白名单，block 黑名单，review 疑似名单
     * Required:true
     */
    @Required
    private String suggestion;

    /**
     * 状态 1启用，0禁用,默认 1启用
     */
    private Integer status;

    /**
     * 敏感库id，更新时该参数必填
     */
    private String libId;

    /**
     * 敏感库来源：custom自定义，feedback系统库，更新时该参数必填
     */
    private String source;


    /**
     * get 检测类型，api/oss/website,默认api
     *
     * @return
     */
    public String getCensorType() {
        return censorType;
    }

    /**
     * set 检测类型，api/oss/website,默认api
     *
     * @param censorType
     */
    public void setCensorType(String censorType) {
        this.censorType = censorType;
    }

    /**
     * get 站点检查实例Id，多个以 , 分割；当censorType为website时，该参数必填
     *
     * @return
     */
    public String getWebsiteInstanceId() {
        return websiteInstanceId;
    }

    /**
     * set 站点检查实例Id，多个以 , 分割；当censorType为website时，该参数必填
     *
     * @param websiteInstanceId
     */
    public void setWebsiteInstanceId(String websiteInstanceId) {
        this.websiteInstanceId = websiteInstanceId;
    }

    /**
     * get 文件类型，text-文本，image-图片，audio-音频，video-视频
     *
     * @return
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * set 文件类型，text-文本，image-图片，audio-音频，video-视频
     *
     * @param resourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * get 匹配方式，exact:精确匹配，fuzzy:模糊匹配；仅限文本类型,默认exact
     *
     * @return
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * set 匹配方式，exact:精确匹配，fuzzy:模糊匹配；仅限文本类型,默认exact
     *
     * @param matchType
     */
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    /**
     * get 敏感库名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 敏感库名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 文本/语音支持 antispam-反垃圾，视频/图片支持 porn-涉黄，terrorism-涉政暴恐，ad-图文广告
     *
     * @return
     */
    public String getScenes() {
        return scenes;
    }

    /**
     * set 文本/语音支持 antispam-反垃圾，视频/图片支持 porn-涉黄，terrorism-涉政暴恐，ad-图文广告
     *
     * @param scenes
     */
    public void setScenes(String scenes) {
        this.scenes = scenes;
    }

    /**
     * get pass 白名单，block 黑名单，review 疑似名单
     *
     * @return
     */
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * set pass 白名单，block 黑名单，review 疑似名单
     *
     * @param suggestion
     */
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    /**
     * get 状态 1启用，0禁用,默认 1启用
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态 1启用，0禁用,默认 1启用
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 敏感库id，更新时该参数必填
     *
     * @return
     */
    public String getLibId() {
        return libId;
    }

    /**
     * set 敏感库id，更新时该参数必填
     *
     * @param libId
     */
    public void setLibId(String libId) {
        this.libId = libId;
    }

    /**
     * get 敏感库来源：custom自定义，feedback系统库，更新时该参数必填
     *
     * @return
     */
    public String getSource() {
        return source;
    }

    /**
     * set 敏感库来源：custom自定义，feedback系统库，更新时该参数必填
     *
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }


    /**
     * set 检测类型，api/oss/website,默认api
     *
     * @param censorType
     */
    public CustomReq censorType(String censorType) {
        this.censorType = censorType;
        return this;
    }

    /**
     * set 站点检查实例Id，多个以 , 分割；当censorType为website时，该参数必填
     *
     * @param websiteInstanceId
     */
    public CustomReq websiteInstanceId(String websiteInstanceId) {
        this.websiteInstanceId = websiteInstanceId;
        return this;
    }

    /**
     * set 文件类型，text-文本，image-图片，audio-音频，video-视频
     *
     * @param resourceType
     */
    public CustomReq resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set 匹配方式，exact:精确匹配，fuzzy:模糊匹配；仅限文本类型,默认exact
     *
     * @param matchType
     */
    public CustomReq matchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * set 敏感库名
     *
     * @param name
     */
    public CustomReq name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 文本/语音支持 antispam-反垃圾，视频/图片支持 porn-涉黄，terrorism-涉政暴恐，ad-图文广告
     *
     * @param scenes
     */
    public CustomReq scenes(String scenes) {
        this.scenes = scenes;
        return this;
    }

    /**
     * set pass 白名单，block 黑名单，review 疑似名单
     *
     * @param suggestion
     */
    public CustomReq suggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * set 状态 1启用，0禁用,默认 1启用
     *
     * @param status
     */
    public CustomReq status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 敏感库id，更新时该参数必填
     *
     * @param libId
     */
    public CustomReq libId(String libId) {
        this.libId = libId;
        return this;
    }

    /**
     * set 敏感库来源：custom自定义，feedback系统库，更新时该参数必填
     *
     * @param source
     */
    public CustomReq source(String source) {
        this.source = source;
        return this;
    }


}