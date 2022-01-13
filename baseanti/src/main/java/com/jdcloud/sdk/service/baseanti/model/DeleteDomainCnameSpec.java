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

package com.jdcloud.sdk.service.baseanti.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * deleteDomainCnameSpec
 */
public class DeleteDomainCnameSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * NP系统中的域名
     * Required:true
     */
    @Required
    private String domain;


    /**
     * get NP系统中的域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set NP系统中的域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * set NP系统中的域名
     *
     * @param domain
     */
    public DeleteDomainCnameSpec domain(String domain) {
        this.domain = domain;
        return this;
    }


}