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

package com.jdcloud.sdk.service.bgw.model;


/**
 * propagateCidrInfo
 */
public class PropagateCidrInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * vpc接口中的一个传播网段,格式如：172.10.2.15/16,
     */
    private String subnetCidr;

    /**
     * 传播网段对应的subnetId
     */
    private String subnetId;



    /**
     * get vpc接口中的一个传播网段,格式如：172.10.2.15/16,
     *
     * @return
     */
    public String getSubnetCidr() {
        return subnetCidr;
    }

    /**
     * set vpc接口中的一个传播网段,格式如：172.10.2.15/16,
     *
     * @param subnetCidr
     */
    public void setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
    }


    /**
     * get 传播网段对应的subnetId
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 传播网段对应的subnetId
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }



    /**
     * set vpc接口中的一个传播网段,格式如：172.10.2.15/16,
     *
     * @param subnetCidr
     */
    public PropagateCidrInfo subnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }


    /**
     * set 传播网段对应的subnetId
     *
     * @param subnetId
     */
    public PropagateCidrInfo subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }


}