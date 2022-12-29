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

import java.util.List;
import java.util.ArrayList;

/**
 * getEvidenceResp
 */
public class GetEvidenceResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 存证编号
     */
    private String evidenceId;

    /**
     * 取证请求流水号（单证据链存证用户无需关心）
     */
    private String messageId;

    /**
     * 存证请求的流水号（单证据链存证用户无需关心）
     */
    private String evidenceMessageId;

    /**
     * 取证结果文件
     */
    
    private List<Object> evidenceFileList;


    /**
     * get 存证编号
     *
     * @return
     */
    public String getEvidenceId() {
        return evidenceId;
    }

    /**
     * set 存证编号
     *
     * @param evidenceId
     */
    public void setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
    }


    /**
     * get 取证请求流水号（单证据链存证用户无需关心）
     *
     * @return
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * set 取证请求流水号（单证据链存证用户无需关心）
     *
     * @param messageId
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }


    /**
     * get 存证请求的流水号（单证据链存证用户无需关心）
     *
     * @return
     */
    public String getEvidenceMessageId() {
        return evidenceMessageId;
    }

    /**
     * set 存证请求的流水号（单证据链存证用户无需关心）
     *
     * @param evidenceMessageId
     */
    public void setEvidenceMessageId(String evidenceMessageId) {
        this.evidenceMessageId = evidenceMessageId;
    }


    /**
    * get 取证结果文件
    *
    * @return
    */
    public List<Object> getEvidenceFileList() {
        return evidenceFileList;
    }

    /**
    * set 取证结果文件
    *
    * @param evidenceFileList
    */
    public void setEvidenceFileList(List<Object> evidenceFileList) {
        this.evidenceFileList = evidenceFileList;
    }



    /**
     * set 存证编号
     *
     * @param evidenceId
     */
    public GetEvidenceResp evidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }


    /**
     * set 取证请求流水号（单证据链存证用户无需关心）
     *
     * @param messageId
     */
    public GetEvidenceResp messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }


    /**
     * set 存证请求的流水号（单证据链存证用户无需关心）
     *
     * @param evidenceMessageId
     */
    public GetEvidenceResp evidenceMessageId(String evidenceMessageId) {
        this.evidenceMessageId = evidenceMessageId;
        return this;
    }


    /**
    * set 取证结果文件
    *
    * @param evidenceFileList
    */
    public GetEvidenceResp evidenceFileList(List<Object> evidenceFileList) {
        this.evidenceFileList = evidenceFileList;
        return this;
    }



    /**
     * add item to 取证结果文件
     *
     * @param evidenceFileList
     */
    public void addEvidenceFileList(Object evidenceFileList) {
        if (this.evidenceFileList == null) {
            this.evidenceFileList = new ArrayList<>();
        }
        this.evidenceFileList.add(evidenceFileList);
    }
}