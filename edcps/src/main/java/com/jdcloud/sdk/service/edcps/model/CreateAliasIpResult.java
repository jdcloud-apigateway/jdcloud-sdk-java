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
 * Distributed-Cloud-Physical-Server
 * 分布式云物理服务器别名IP操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.edcps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.edcps.model.AliasIpSuccessInfo;
import com.jdcloud.sdk.service.edcps.model.AliasIpErrorInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 添加别名IP
 */
public class CreateAliasIpResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * successList
     */
    private List<AliasIpSuccessInfo> successList;

    /**
     * errorList
     */
    private List<AliasIpErrorInfo> errorList;


    /**
     * get successList
     *
     * @return
     */
    public List<AliasIpSuccessInfo> getSuccessList() {
        return successList;
    }

    /**
     * set successList
     *
     * @param successList
     */
    public void setSuccessList(List<AliasIpSuccessInfo> successList) {
        this.successList = successList;
    }

    /**
     * get errorList
     *
     * @return
     */
    public List<AliasIpErrorInfo> getErrorList() {
        return errorList;
    }

    /**
     * set errorList
     *
     * @param errorList
     */
    public void setErrorList(List<AliasIpErrorInfo> errorList) {
        this.errorList = errorList;
    }


    /**
     * set successList
     *
     * @param successList
     */
    public CreateAliasIpResult successList(List<AliasIpSuccessInfo> successList) {
        this.successList = successList;
        return this;
    }

    /**
     * set errorList
     *
     * @param errorList
     */
    public CreateAliasIpResult errorList(List<AliasIpErrorInfo> errorList) {
        this.errorList = errorList;
        return this;
    }


    /**
     * add item to successList
     *
     * @param successList
     */
    public void addSuccessList(AliasIpSuccessInfo successList) {
        if (this.successList == null) {
            this.successList = new ArrayList<>();
        }
        this.successList.add(successList);
    }

    /**
     * add item to errorList
     *
     * @param errorList
     */
    public void addErrorList(AliasIpErrorInfo errorList) {
        if (this.errorList == null) {
            this.errorList = new ArrayList<>();
        }
        this.errorList.add(errorList);
    }

}