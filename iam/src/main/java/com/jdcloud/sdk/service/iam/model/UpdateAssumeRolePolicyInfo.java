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

package com.jdcloud.sdk.service.iam.model;


/**
 * updateAssumeRolePolicyInfo
 */
public class UpdateAssumeRolePolicyInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 信任实体信息
     */
    private String assumeRolePolicyDocument;



    /**
     * get 信任实体信息
     *
     * @return
     */
    public String getAssumeRolePolicyDocument() {
        return assumeRolePolicyDocument;
    }

    /**
     * set 信任实体信息
     *
     * @param assumeRolePolicyDocument
     */
    public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }



    /**
     * set 信任实体信息
     *
     * @param assumeRolePolicyDocument
     */
    public UpdateAssumeRolePolicyInfo assumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
        return this;
    }


}