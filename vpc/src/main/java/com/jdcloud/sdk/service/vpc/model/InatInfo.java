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

package com.jdcloud.sdk.service.vpc.model;


/**
 * inatInfo
 */
public class InatInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * inat属于的vpc的ID
     */
    private String vpcId;

    /**
     * inat的出口IP或natgaway替换inat的出口IP(100段)
     */
    private String elasticIp;


    /**
     * get inat属于的vpc的ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set inat属于的vpc的ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get inat的出口IP或natgaway替换inat的出口IP(100段)
     *
     * @return
     */
    public String getElasticIp() {
        return elasticIp;
    }

    /**
     * set inat的出口IP或natgaway替换inat的出口IP(100段)
     *
     * @param elasticIp
     */
    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }


    /**
     * set inat属于的vpc的ID
     *
     * @param vpcId
     */
    public InatInfo vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set inat的出口IP或natgaway替换inat的出口IP(100段)
     *
     * @param elasticIp
     */
    public InatInfo elasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }


}