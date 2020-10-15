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


/**
 * customInfo
 */
public class CustomInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 敏感库id
     */
    private String libId;

    /**
     * 站点检查实例Id，多个以 , 分割
     */
    private String websiteInstanceId;

    /**
     * 文件类型，text-文本，image-图片，audio-音频，video-视频
     */
    private String resourceType;

    /**
     * 匹配方式，exact:精确匹配，fuzzy:模糊匹配；仅限文本类型
     */
    private String matchType;

    /**
     * 敏感库名
     */
    private String name;

    /**
     * 文本/语音支持 antispam-反垃圾，视频/图片支持 porn-涉黄，terrorism-涉政暴恐
     */
    private String scenes;

    /**
     * white 白名单，black 黑名单，suspect 疑似名单
     */
    private String suggestion;

    /**
     * 状态 1启用，0禁用
     */
    private Integer status;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 该敏感库下包含的item条数
     */
    private Integer itemNumber;


    /**
     * get 敏感库id
     *
     * @return
     */
    public String getLibId() {
        return libId;
    }

    /**
     * set 敏感库id
     *
     * @param libId
     */
    public void setLibId(String libId) {
        this.libId = libId;
    }

    /**
     * get 站点检查实例Id，多个以 , 分割
     *
     * @return
     */
    public String getWebsiteInstanceId() {
        return websiteInstanceId;
    }

    /**
     * set 站点检查实例Id，多个以 , 分割
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
     * get 匹配方式，exact:精确匹配，fuzzy:模糊匹配；仅限文本类型
     *
     * @return
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * set 匹配方式，exact:精确匹配，fuzzy:模糊匹配；仅限文本类型
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
     * get 文本/语音支持 antispam-反垃圾，视频/图片支持 porn-涉黄，terrorism-涉政暴恐
     *
     * @return
     */
    public String getScenes() {
        return scenes;
    }

    /**
     * set 文本/语音支持 antispam-反垃圾，视频/图片支持 porn-涉黄，terrorism-涉政暴恐
     *
     * @param scenes
     */
    public void setScenes(String scenes) {
        this.scenes = scenes;
    }

    /**
     * get white 白名单，black 黑名单，suspect 疑似名单
     *
     * @return
     */
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * set white 白名单，black 黑名单，suspect 疑似名单
     *
     * @param suggestion
     */
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    /**
     * get 状态 1启用，0禁用
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态 1启用，0禁用
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get 该敏感库下包含的item条数
     *
     * @return
     */
    public Integer getItemNumber() {
        return itemNumber;
    }

    /**
     * set 该敏感库下包含的item条数
     *
     * @param itemNumber
     */
    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }


    /**
     * set 敏感库id
     *
     * @param libId
     */
    public CustomInfo libId(String libId) {
        this.libId = libId;
        return this;
    }

    /**
     * set 站点检查实例Id，多个以 , 分割
     *
     * @param websiteInstanceId
     */
    public CustomInfo websiteInstanceId(String websiteInstanceId) {
        this.websiteInstanceId = websiteInstanceId;
        return this;
    }

    /**
     * set 文件类型，text-文本，image-图片，audio-音频，video-视频
     *
     * @param resourceType
     */
    public CustomInfo resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set 匹配方式，exact:精确匹配，fuzzy:模糊匹配；仅限文本类型
     *
     * @param matchType
     */
    public CustomInfo matchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * set 敏感库名
     *
     * @param name
     */
    public CustomInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 文本/语音支持 antispam-反垃圾，视频/图片支持 porn-涉黄，terrorism-涉政暴恐
     *
     * @param scenes
     */
    public CustomInfo scenes(String scenes) {
        this.scenes = scenes;
        return this;
    }

    /**
     * set white 白名单，black 黑名单，suspect 疑似名单
     *
     * @param suggestion
     */
    public CustomInfo suggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * set 状态 1启用，0禁用
     *
     * @param status
     */
    public CustomInfo status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public CustomInfo updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 该敏感库下包含的item条数
     *
     * @param itemNumber
     */
    public CustomInfo itemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
        return this;
    }


}