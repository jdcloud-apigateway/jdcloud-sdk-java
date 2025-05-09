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


/**
 * Pod模板存储详情
 */
public class PodTemplateVolume  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * volume名称
     */
    private String name;

    /**
     * 云盘配置。
     */
    private PodTemplateCloudDisk jdcloudDisk;



    /**
     * get volume名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set volume名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 云盘配置。
     *
     * @return
     */
    public PodTemplateCloudDisk getJdcloudDisk() {
        return jdcloudDisk;
    }

    /**
     * set 云盘配置。
     *
     * @param jdcloudDisk
     */
    public void setJdcloudDisk(PodTemplateCloudDisk jdcloudDisk) {
        this.jdcloudDisk = jdcloudDisk;
    }



    /**
     * set volume名称
     *
     * @param name
     */
    public PodTemplateVolume name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 云盘配置。
     *
     * @param jdcloudDisk
     */
    public PodTemplateVolume jdcloudDisk(PodTemplateCloudDisk jdcloudDisk) {
        this.jdcloudDisk = jdcloudDisk;
        return this;
    }


}