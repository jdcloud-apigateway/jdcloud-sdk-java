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
 * 合同管理接口
 * 电子签章-合同管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudsign.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.cloudsign.model.ContractSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 合同签章四种方式：
1. 合同文件 + 印章文件：contractContent + stampContent
2. 合同文件 + 印章ID：contractContent + stampId
3. 模板ID + 印章文件：templateId + stampContent
4. 模板ID + 印章ID：templateId + stampId

 */
public class SignContractRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * contractSpec
     * Required:true
     */
    @Required
    private ContractSpec contractSpec;



    /**
     * get contractSpec
     *
     * @return
     */
    public ContractSpec getContractSpec() {
        return contractSpec;
    }

    /**
     * set contractSpec
     *
     * @param contractSpec
     */
    public void setContractSpec(ContractSpec contractSpec) {
        this.contractSpec = contractSpec;
    }



    /**
     * set contractSpec
     *
     * @param contractSpec
     */
    public SignContractRequest contractSpec(ContractSpec contractSpec) {
        this.contractSpec = contractSpec;
        return this;
    }


}