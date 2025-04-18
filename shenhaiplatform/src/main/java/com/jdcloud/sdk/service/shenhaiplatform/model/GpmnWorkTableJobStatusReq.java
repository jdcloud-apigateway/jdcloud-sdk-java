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

package com.jdcloud.sdk.service.shenhaiplatform.model;


/**
 * 工作台作业状态请求对象
 */
public class GpmnWorkTableJobStatusReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 处理类型
     */
    private String processType;

    /**
     * 查询数据
     */
    private String date;



    /**
     * get 处理类型
     *
     * @return
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * set 处理类型
     *
     * @param processType
     */
    public void setProcessType(String processType) {
        this.processType = processType;
    }


    /**
     * get 查询数据
     *
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     * set 查询数据
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }



    /**
     * set 处理类型
     *
     * @param processType
     */
    public GpmnWorkTableJobStatusReq processType(String processType) {
        this.processType = processType;
        return this;
    }


    /**
     * set 查询数据
     *
     * @param date
     */
    public GpmnWorkTableJobStatusReq date(String date) {
        this.date = date;
        return this;
    }


}