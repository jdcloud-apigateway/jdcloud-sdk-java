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
 * PodTemplate
 * Pod模板相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建Pod模板
 */
public class CreatePodTemplateResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Pod模板ID。
     */
    private String podTemplateId;



    /**
     * get Pod模板ID。
     *
     * @return
     */
    public String getPodTemplateId() {
        return podTemplateId;
    }

    /**
     * set Pod模板ID。
     *
     * @param podTemplateId
     */
    public void setPodTemplateId(String podTemplateId) {
        this.podTemplateId = podTemplateId;
    }



    /**
     * set Pod模板ID。
     *
     * @param podTemplateId
     */
    public CreatePodTemplateResult podTemplateId(String podTemplateId) {
        this.podTemplateId = podTemplateId;
        return this;
    }


}