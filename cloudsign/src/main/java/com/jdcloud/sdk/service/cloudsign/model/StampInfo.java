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

package com.jdcloud.sdk.service.cloudsign.model;


/**
 * stampInfo
 */
public class StampInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 印章ID
     */
    private String stampId;

    /**
     * 印章名称
     */
    private String stampName;

    /**
     * 印章图片（base64）
     */
    private String stampContent;

    /**
     * 印章摘要
     */
    private String stampDigest;

    /**
     * 印章上传时间
     */
    private String createTime;

    /**
     * 印章下载地址
     */
    private String stampUrl;

    /**
     * 印章属性
     */
    private String stampAttributes;



    /**
     * get 印章ID
     *
     * @return
     */
    public String getStampId() {
        return stampId;
    }

    /**
     * set 印章ID
     *
     * @param stampId
     */
    public void setStampId(String stampId) {
        this.stampId = stampId;
    }


    /**
     * get 印章名称
     *
     * @return
     */
    public String getStampName() {
        return stampName;
    }

    /**
     * set 印章名称
     *
     * @param stampName
     */
    public void setStampName(String stampName) {
        this.stampName = stampName;
    }


    /**
     * get 印章图片（base64）
     *
     * @return
     */
    public String getStampContent() {
        return stampContent;
    }

    /**
     * set 印章图片（base64）
     *
     * @param stampContent
     */
    public void setStampContent(String stampContent) {
        this.stampContent = stampContent;
    }


    /**
     * get 印章摘要
     *
     * @return
     */
    public String getStampDigest() {
        return stampDigest;
    }

    /**
     * set 印章摘要
     *
     * @param stampDigest
     */
    public void setStampDigest(String stampDigest) {
        this.stampDigest = stampDigest;
    }


    /**
     * get 印章上传时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 印章上传时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 印章下载地址
     *
     * @return
     */
    public String getStampUrl() {
        return stampUrl;
    }

    /**
     * set 印章下载地址
     *
     * @param stampUrl
     */
    public void setStampUrl(String stampUrl) {
        this.stampUrl = stampUrl;
    }


    /**
     * get 印章属性
     *
     * @return
     */
    public String getStampAttributes() {
        return stampAttributes;
    }

    /**
     * set 印章属性
     *
     * @param stampAttributes
     */
    public void setStampAttributes(String stampAttributes) {
        this.stampAttributes = stampAttributes;
    }



    /**
     * set 印章ID
     *
     * @param stampId
     */
    public StampInfo stampId(String stampId) {
        this.stampId = stampId;
        return this;
    }


    /**
     * set 印章名称
     *
     * @param stampName
     */
    public StampInfo stampName(String stampName) {
        this.stampName = stampName;
        return this;
    }


    /**
     * set 印章图片（base64）
     *
     * @param stampContent
     */
    public StampInfo stampContent(String stampContent) {
        this.stampContent = stampContent;
        return this;
    }


    /**
     * set 印章摘要
     *
     * @param stampDigest
     */
    public StampInfo stampDigest(String stampDigest) {
        this.stampDigest = stampDigest;
        return this;
    }


    /**
     * set 印章上传时间
     *
     * @param createTime
     */
    public StampInfo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 印章下载地址
     *
     * @param stampUrl
     */
    public StampInfo stampUrl(String stampUrl) {
        this.stampUrl = stampUrl;
        return this;
    }


    /**
     * set 印章属性
     *
     * @param stampAttributes
     */
    public StampInfo stampAttributes(String stampAttributes) {
        this.stampAttributes = stampAttributes;
        return this;
    }


}