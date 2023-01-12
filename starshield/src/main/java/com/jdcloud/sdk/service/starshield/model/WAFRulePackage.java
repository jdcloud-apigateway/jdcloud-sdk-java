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

package com.jdcloud.sdk.service.starshield.model;


/**
 * wAFRulePackage
 */
public class WAFRulePackage  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * WAF包标识符标签
     */
    private String id;

    /**
     * 防火墙包的名称
     */
    private String name;

    /**
     * 防火墙包的目的/功能摘要
     */
    private String description;

    /**
     * detection_mode
     */
    private String detection_mode;

    /**
     * 区标识符标签
     */
    private String zone_id;

    /**
     * 指示对域应用防火墙包。
     */
    private String status;

    /**
     * 防火墙包的敏感度。
     */
    private String sensitivity;

    /**
     * 将对防火墙包下的规则执行的默认操作。
     */
    private String action_mode;



    /**
     * get WAF包标识符标签
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set WAF包标识符标签
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * get 防火墙包的名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 防火墙包的名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 防火墙包的目的/功能摘要
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 防火墙包的目的/功能摘要
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get detection_mode
     *
     * @return
     */
    public String getDetection_mode() {
        return detection_mode;
    }

    /**
     * set detection_mode
     *
     * @param detection_mode
     */
    public void setDetection_mode(String detection_mode) {
        this.detection_mode = detection_mode;
    }


    /**
     * get 区标识符标签
     *
     * @return
     */
    public String getZone_id() {
        return zone_id;
    }

    /**
     * set 区标识符标签
     *
     * @param zone_id
     */
    public void setZone_id(String zone_id) {
        this.zone_id = zone_id;
    }


    /**
     * get 指示对域应用防火墙包。
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 指示对域应用防火墙包。
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 防火墙包的敏感度。
     *
     * @return
     */
    public String getSensitivity() {
        return sensitivity;
    }

    /**
     * set 防火墙包的敏感度。
     *
     * @param sensitivity
     */
    public void setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
    }


    /**
     * get 将对防火墙包下的规则执行的默认操作。
     *
     * @return
     */
    public String getAction_mode() {
        return action_mode;
    }

    /**
     * set 将对防火墙包下的规则执行的默认操作。
     *
     * @param action_mode
     */
    public void setAction_mode(String action_mode) {
        this.action_mode = action_mode;
    }



    /**
     * set WAF包标识符标签
     *
     * @param id
     */
    public WAFRulePackage id(String id) {
        this.id = id;
        return this;
    }


    /**
     * set 防火墙包的名称
     *
     * @param name
     */
    public WAFRulePackage name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 防火墙包的目的/功能摘要
     *
     * @param description
     */
    public WAFRulePackage description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set detection_mode
     *
     * @param detection_mode
     */
    public WAFRulePackage detection_mode(String detection_mode) {
        this.detection_mode = detection_mode;
        return this;
    }


    /**
     * set 区标识符标签
     *
     * @param zone_id
     */
    public WAFRulePackage zone_id(String zone_id) {
        this.zone_id = zone_id;
        return this;
    }


    /**
     * set 指示对域应用防火墙包。
     *
     * @param status
     */
    public WAFRulePackage status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 防火墙包的敏感度。
     *
     * @param sensitivity
     */
    public WAFRulePackage sensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
        return this;
    }


    /**
     * set 将对防火墙包下的规则执行的默认操作。
     *
     * @param action_mode
     */
    public WAFRulePackage action_mode(String action_mode) {
        this.action_mode = action_mode;
        return this;
    }


}