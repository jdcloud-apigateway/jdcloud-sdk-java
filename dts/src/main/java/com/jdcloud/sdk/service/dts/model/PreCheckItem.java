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

package com.jdcloud.sdk.service.dts.model;


/**
 * preCheckItem
 */
public class PreCheckItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 预检查项目名称
     */
    private String item;

    /**
     * 预检查项目描述
     */
    private String description;

    /**
     * 预检查结果
     */
    private String status;

    /**
     * 预检查结果详情
     */
    private String message;

    /**
     * 预检查项修复建议
     */
    private String advice;

    /**
     * 该预检查项是否支持跳过
     */
    private String canSkip;

    /**
     * 该预检查项是否已跳过
     */
    private String isSkip;



    /**
     * get 预检查项目名称
     *
     * @return
     */
    public String getItem() {
        return item;
    }

    /**
     * set 预检查项目名称
     *
     * @param item
     */
    public void setItem(String item) {
        this.item = item;
    }


    /**
     * get 预检查项目描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 预检查项目描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 预检查结果
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 预检查结果
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 预检查结果详情
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 预检查结果详情
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * get 预检查项修复建议
     *
     * @return
     */
    public String getAdvice() {
        return advice;
    }

    /**
     * set 预检查项修复建议
     *
     * @param advice
     */
    public void setAdvice(String advice) {
        this.advice = advice;
    }


    /**
     * get 该预检查项是否支持跳过
     *
     * @return
     */
    public String getCanSkip() {
        return canSkip;
    }

    /**
     * set 该预检查项是否支持跳过
     *
     * @param canSkip
     */
    public void setCanSkip(String canSkip) {
        this.canSkip = canSkip;
    }


    /**
     * get 该预检查项是否已跳过
     *
     * @return
     */
    public String getIsSkip() {
        return isSkip;
    }

    /**
     * set 该预检查项是否已跳过
     *
     * @param isSkip
     */
    public void setIsSkip(String isSkip) {
        this.isSkip = isSkip;
    }



    /**
     * set 预检查项目名称
     *
     * @param item
     */
    public PreCheckItem item(String item) {
        this.item = item;
        return this;
    }


    /**
     * set 预检查项目描述
     *
     * @param description
     */
    public PreCheckItem description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 预检查结果
     *
     * @param status
     */
    public PreCheckItem status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 预检查结果详情
     *
     * @param message
     */
    public PreCheckItem message(String message) {
        this.message = message;
        return this;
    }


    /**
     * set 预检查项修复建议
     *
     * @param advice
     */
    public PreCheckItem advice(String advice) {
        this.advice = advice;
        return this;
    }


    /**
     * set 该预检查项是否支持跳过
     *
     * @param canSkip
     */
    public PreCheckItem canSkip(String canSkip) {
        this.canSkip = canSkip;
        return this;
    }


    /**
     * set 该预检查项是否已跳过
     *
     * @param isSkip
     */
    public PreCheckItem isSkip(String isSkip) {
        this.isSkip = isSkip;
        return this;
    }


}