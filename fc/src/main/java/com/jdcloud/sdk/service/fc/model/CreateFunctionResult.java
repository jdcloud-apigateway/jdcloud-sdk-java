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
 * Function
 * 函数 相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.fc.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建函数

 */
public class CreateFunctionResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * functionName
     */
    private String functionName;



    /**
     * get functionName
     *
     * @return
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * set functionName
     *
     * @param functionName
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }



    /**
     * set functionName
     *
     * @param functionName
     */
    public CreateFunctionResult functionName(String functionName) {
        this.functionName = functionName;
        return this;
    }


}