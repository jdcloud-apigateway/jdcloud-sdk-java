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

package com.jdcloud.sdk.service.ydsms.model;


/**
 * replyRecord
 */
public class ReplyRecord  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 手机号码
     */
    private String sendNumber;

    /**
     * 回复内容
     */
    private String replyContent;

    /**
     * 回复时间
     */
    private String replyTime;


    /**
     * get 手机号码
     *
     * @return
     */
    public String getSendNumber() {
        return sendNumber;
    }

    /**
     * set 手机号码
     *
     * @param sendNumber
     */
    public void setSendNumber(String sendNumber) {
        this.sendNumber = sendNumber;
    }

    /**
     * get 回复内容
     *
     * @return
     */
    public String getReplyContent() {
        return replyContent;
    }

    /**
     * set 回复内容
     *
     * @param replyContent
     */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    /**
     * get 回复时间
     *
     * @return
     */
    public String getReplyTime() {
        return replyTime;
    }

    /**
     * set 回复时间
     *
     * @param replyTime
     */
    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }


    /**
     * set 手机号码
     *
     * @param sendNumber
     */
    public ReplyRecord sendNumber(String sendNumber) {
        this.sendNumber = sendNumber;
        return this;
    }

    /**
     * set 回复内容
     *
     * @param replyContent
     */
    public ReplyRecord replyContent(String replyContent) {
        this.replyContent = replyContent;
        return this;
    }

    /**
     * set 回复时间
     *
     * @param replyTime
     */
    public ReplyRecord replyTime(String replyTime) {
        this.replyTime = replyTime;
        return this;
    }


}