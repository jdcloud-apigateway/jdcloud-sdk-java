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
 * assetDataOverview
 */
public class AssetDataOverview  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片检测总数
     */
    private Long imageCount;

    /**
     * 图片违规总数
     */
    private Long imageBlockCount;

    /**
     * 图片疑似违规总数
     */
    private Long imageReviewCount;

    /**
     * 文本总数
     */
    private Long textCount;

    /**
     * 文本违规总数
     */
    private Long textBlockCount;

    /**
     * 文本疑似违规总数
     */
    private Long textReviewCount;


    /**
     * get 图片检测总数
     *
     * @return
     */
    public Long getImageCount() {
        return imageCount;
    }

    /**
     * set 图片检测总数
     *
     * @param imageCount
     */
    public void setImageCount(Long imageCount) {
        this.imageCount = imageCount;
    }

    /**
     * get 图片违规总数
     *
     * @return
     */
    public Long getImageBlockCount() {
        return imageBlockCount;
    }

    /**
     * set 图片违规总数
     *
     * @param imageBlockCount
     */
    public void setImageBlockCount(Long imageBlockCount) {
        this.imageBlockCount = imageBlockCount;
    }

    /**
     * get 图片疑似违规总数
     *
     * @return
     */
    public Long getImageReviewCount() {
        return imageReviewCount;
    }

    /**
     * set 图片疑似违规总数
     *
     * @param imageReviewCount
     */
    public void setImageReviewCount(Long imageReviewCount) {
        this.imageReviewCount = imageReviewCount;
    }

    /**
     * get 文本总数
     *
     * @return
     */
    public Long getTextCount() {
        return textCount;
    }

    /**
     * set 文本总数
     *
     * @param textCount
     */
    public void setTextCount(Long textCount) {
        this.textCount = textCount;
    }

    /**
     * get 文本违规总数
     *
     * @return
     */
    public Long getTextBlockCount() {
        return textBlockCount;
    }

    /**
     * set 文本违规总数
     *
     * @param textBlockCount
     */
    public void setTextBlockCount(Long textBlockCount) {
        this.textBlockCount = textBlockCount;
    }

    /**
     * get 文本疑似违规总数
     *
     * @return
     */
    public Long getTextReviewCount() {
        return textReviewCount;
    }

    /**
     * set 文本疑似违规总数
     *
     * @param textReviewCount
     */
    public void setTextReviewCount(Long textReviewCount) {
        this.textReviewCount = textReviewCount;
    }


    /**
     * set 图片检测总数
     *
     * @param imageCount
     */
    public AssetDataOverview imageCount(Long imageCount) {
        this.imageCount = imageCount;
        return this;
    }

    /**
     * set 图片违规总数
     *
     * @param imageBlockCount
     */
    public AssetDataOverview imageBlockCount(Long imageBlockCount) {
        this.imageBlockCount = imageBlockCount;
        return this;
    }

    /**
     * set 图片疑似违规总数
     *
     * @param imageReviewCount
     */
    public AssetDataOverview imageReviewCount(Long imageReviewCount) {
        this.imageReviewCount = imageReviewCount;
        return this;
    }

    /**
     * set 文本总数
     *
     * @param textCount
     */
    public AssetDataOverview textCount(Long textCount) {
        this.textCount = textCount;
        return this;
    }

    /**
     * set 文本违规总数
     *
     * @param textBlockCount
     */
    public AssetDataOverview textBlockCount(Long textBlockCount) {
        this.textBlockCount = textBlockCount;
        return this;
    }

    /**
     * set 文本疑似违规总数
     *
     * @param textReviewCount
     */
    public AssetDataOverview textReviewCount(Long textReviewCount) {
        this.textReviewCount = textReviewCount;
        return this;
    }


}