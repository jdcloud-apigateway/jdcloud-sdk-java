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

package com.jdcloud.sdk.service.lb.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * disassElasticIpSpec
 */
public class DisassElasticIpSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 弹性公网IP ID
     * Required:true
     */
    @Required
    private String elasticIpId;

    /**
     * 解绑时是否同时删除弹性公网IP，取值范围：true、false，默认false。true表示解绑弹性公网IP时删除该弹性公网IP；false表示解绑弹性公网IP时不删除该弹性公网IP。包年包月和无计费信息的弹性公网IP不支持解绑时删除
     */
    private Boolean deleteElasticIp;



    /**
     * get 弹性公网IP ID
     *
     * @return
     */
    public String getElasticIpId() {
        return elasticIpId;
    }

    /**
     * set 弹性公网IP ID
     *
     * @param elasticIpId
     */
    public void setElasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
    }


    /**
     * get 解绑时是否同时删除弹性公网IP，取值范围：true、false，默认false。true表示解绑弹性公网IP时删除该弹性公网IP；false表示解绑弹性公网IP时不删除该弹性公网IP。包年包月和无计费信息的弹性公网IP不支持解绑时删除
     *
     * @return
     */
    public Boolean getDeleteElasticIp() {
        return deleteElasticIp;
    }

    /**
     * set 解绑时是否同时删除弹性公网IP，取值范围：true、false，默认false。true表示解绑弹性公网IP时删除该弹性公网IP；false表示解绑弹性公网IP时不删除该弹性公网IP。包年包月和无计费信息的弹性公网IP不支持解绑时删除
     *
     * @param deleteElasticIp
     */
    public void setDeleteElasticIp(Boolean deleteElasticIp) {
        this.deleteElasticIp = deleteElasticIp;
    }



    /**
     * set 弹性公网IP ID
     *
     * @param elasticIpId
     */
    public DisassElasticIpSpec elasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
        return this;
    }


    /**
     * set 解绑时是否同时删除弹性公网IP，取值范围：true、false，默认false。true表示解绑弹性公网IP时删除该弹性公网IP；false表示解绑弹性公网IP时不删除该弹性公网IP。包年包月和无计费信息的弹性公网IP不支持解绑时删除
     *
     * @param deleteElasticIp
     */
    public DisassElasticIpSpec deleteElasticIp(Boolean deleteElasticIp) {
        this.deleteElasticIp = deleteElasticIp;
        return this;
    }


}