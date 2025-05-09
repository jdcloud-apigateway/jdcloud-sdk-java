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
 * ProductCollectionConfig New APIs
 * 产品日志采集配置
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * k8s日志采集配置下发
 */
public class K8sDispatchConfNewResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 配置下发结果true：成功；false：失败；
     */
    private Boolean result;



    /**
     * get 配置下发结果true：成功；false：失败；
     *
     * @return
     */
    public Boolean getResult() {
        return result;
    }

    /**
     * set 配置下发结果true：成功；false：失败；
     *
     * @param result
     */
    public void setResult(Boolean result) {
        this.result = result;
    }



    /**
     * set 配置下发结果true：成功；false：失败；
     *
     * @param result
     */
    public K8sDispatchConfNewResult result(Boolean result) {
        this.result = result;
        return this;
    }


}