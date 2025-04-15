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

package com.jdcloud.sdk.service.rocketmq.model;


/**
 * message
 */
public class Message  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 消息id
     */
    private String msgId;

    /**
     * topic名称
     */
    private String topic;

    /**
     * 消息体
     */
    private String messageBody;

    /**
     * 消息tag
     */
    private String tags;

    /**
     * 消息key
     */
    private String key;

    /**
     * 消息的存储时间
     */
    private String storeTime;

    /**
     * 消息的生产时间
     */
    private String bornTime;



    /**
     * get 消息id
     *
     * @return
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * set 消息id
     *
     * @param msgId
     */
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }


    /**
     * get topic名称
     *
     * @return
     */
    public String getTopic() {
        return topic;
    }

    /**
     * set topic名称
     *
     * @param topic
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }


    /**
     * get 消息体
     *
     * @return
     */
    public String getMessageBody() {
        return messageBody;
    }

    /**
     * set 消息体
     *
     * @param messageBody
     */
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }


    /**
     * get 消息tag
     *
     * @return
     */
    public String getTags() {
        return tags;
    }

    /**
     * set 消息tag
     *
     * @param tags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }


    /**
     * get 消息key
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set 消息key
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }


    /**
     * get 消息的存储时间
     *
     * @return
     */
    public String getStoreTime() {
        return storeTime;
    }

    /**
     * set 消息的存储时间
     *
     * @param storeTime
     */
    public void setStoreTime(String storeTime) {
        this.storeTime = storeTime;
    }


    /**
     * get 消息的生产时间
     *
     * @return
     */
    public String getBornTime() {
        return bornTime;
    }

    /**
     * set 消息的生产时间
     *
     * @param bornTime
     */
    public void setBornTime(String bornTime) {
        this.bornTime = bornTime;
    }



    /**
     * set 消息id
     *
     * @param msgId
     */
    public Message msgId(String msgId) {
        this.msgId = msgId;
        return this;
    }


    /**
     * set topic名称
     *
     * @param topic
     */
    public Message topic(String topic) {
        this.topic = topic;
        return this;
    }


    /**
     * set 消息体
     *
     * @param messageBody
     */
    public Message messageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }


    /**
     * set 消息tag
     *
     * @param tags
     */
    public Message tags(String tags) {
        this.tags = tags;
        return this;
    }


    /**
     * set 消息key
     *
     * @param key
     */
    public Message key(String key) {
        this.key = key;
        return this;
    }


    /**
     * set 消息的存储时间
     *
     * @param storeTime
     */
    public Message storeTime(String storeTime) {
        this.storeTime = storeTime;
        return this;
    }


    /**
     * set 消息的生产时间
     *
     * @param bornTime
     */
    public Message bornTime(String bornTime) {
        this.bornTime = bornTime;
        return this;
    }


}