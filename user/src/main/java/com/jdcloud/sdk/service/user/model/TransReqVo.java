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

package com.jdcloud.sdk.service.user.model;


/**
 * transReqVo
 */
public class TransReqVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 离职人erp
     */
    private String sourceErp;

    /**
     * 接收人erp
     */
    private String targetErp;

    /**
     * 交接项id
     */
    private String itemId;

    /**
     * 交接项名称，如果交接项ID为空则交接项名称必须确保唯⼀
     */
    private String itemName;

    /**
     * 时间戳，请求时间与系统时间不得超过10分钟，否则返回403
     */
    private String timestamp;

    /**
     * 鉴权签名，md5加密（32位小写）
     */
    private String signature;



    /**
     * get 离职人erp
     *
     * @return
     */
    public String getSourceErp() {
        return sourceErp;
    }

    /**
     * set 离职人erp
     *
     * @param sourceErp
     */
    public void setSourceErp(String sourceErp) {
        this.sourceErp = sourceErp;
    }


    /**
     * get 接收人erp
     *
     * @return
     */
    public String getTargetErp() {
        return targetErp;
    }

    /**
     * set 接收人erp
     *
     * @param targetErp
     */
    public void setTargetErp(String targetErp) {
        this.targetErp = targetErp;
    }


    /**
     * get 交接项id
     *
     * @return
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * set 交接项id
     *
     * @param itemId
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }


    /**
     * get 交接项名称，如果交接项ID为空则交接项名称必须确保唯⼀
     *
     * @return
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * set 交接项名称，如果交接项ID为空则交接项名称必须确保唯⼀
     *
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    /**
     * get 时间戳，请求时间与系统时间不得超过10分钟，否则返回403
     *
     * @return
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * set 时间戳，请求时间与系统时间不得超过10分钟，否则返回403
     *
     * @param timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * get 鉴权签名，md5加密（32位小写）
     *
     * @return
     */
    public String getSignature() {
        return signature;
    }

    /**
     * set 鉴权签名，md5加密（32位小写）
     *
     * @param signature
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }



    /**
     * set 离职人erp
     *
     * @param sourceErp
     */
    public TransReqVo sourceErp(String sourceErp) {
        this.sourceErp = sourceErp;
        return this;
    }


    /**
     * set 接收人erp
     *
     * @param targetErp
     */
    public TransReqVo targetErp(String targetErp) {
        this.targetErp = targetErp;
        return this;
    }


    /**
     * set 交接项id
     *
     * @param itemId
     */
    public TransReqVo itemId(String itemId) {
        this.itemId = itemId;
        return this;
    }


    /**
     * set 交接项名称，如果交接项ID为空则交接项名称必须确保唯⼀
     *
     * @param itemName
     */
    public TransReqVo itemName(String itemName) {
        this.itemName = itemName;
        return this;
    }


    /**
     * set 时间戳，请求时间与系统时间不得超过10分钟，否则返回403
     *
     * @param timestamp
     */
    public TransReqVo timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }


    /**
     * set 鉴权签名，md5加密（32位小写）
     *
     * @param signature
     */
    public TransReqVo signature(String signature) {
        this.signature = signature;
        return this;
    }


}