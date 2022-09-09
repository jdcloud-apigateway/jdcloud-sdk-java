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
 * DmsProcedure
 * 存储过程相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 执行存储过程，支持Mysql
 */
public class ProcedureInvokeResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 格式：{key:value}
     */
    
    private List<Object> returnValue;


    /**
    * get 格式：{key:value}
    *
    * @return
    */
    public List<Object> getReturnValue() {
        return returnValue;
    }

    /**
    * set 格式：{key:value}
    *
    * @param returnValue
    */
    public void setReturnValue(List<Object> returnValue) {
        this.returnValue = returnValue;
    }



    /**
    * set 格式：{key:value}
    *
    * @param returnValue
    */
    public ProcedureInvokeResult returnValue(List<Object> returnValue) {
        this.returnValue = returnValue;
        return this;
    }



    /**
     * add item to 格式：{key:value}
     *
     * @param returnValue
     */
    public void addReturnValue(Object returnValue) {
        if (this.returnValue == null) {
            this.returnValue = new ArrayList<>();
        }
        this.returnValue.add(returnValue);
    }
}