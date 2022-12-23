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
 * verifyInfo
 */
public class VerifyInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 验签是否成功，true 成功 false 失败
     */
    private Boolean success;

    /**
     * 验证消息
     */
    private String message;

    /**
     * 签章验证列表
     */
    
    private List<StampResult> results;


    /**
     * get 验签是否成功，true 成功 false 失败
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set 验签是否成功，true 成功 false 失败
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }


    /**
     * get 验证消息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 验证消息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
    * get 签章验证列表
    *
    * @return
    */
    public List<StampResult> getResults() {
        return results;
    }

    /**
    * set 签章验证列表
    *
    * @param results
    */
    public void setResults(List<StampResult> results) {
        this.results = results;
    }



    /**
     * set 验签是否成功，true 成功 false 失败
     *
     * @param success
     */
    public VerifyInfo success(Boolean success) {
        this.success = success;
        return this;
    }


    /**
     * set 验证消息
     *
     * @param message
     */
    public VerifyInfo message(String message) {
        this.message = message;
        return this;
    }


    /**
    * set 签章验证列表
    *
    * @param results
    */
    public VerifyInfo results(List<StampResult> results) {
        this.results = results;
        return this;
    }



    /**
     * add item to 签章验证列表
     *
     * @param result
     */
    public void addResult(StampResult result) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(result);
    }
}