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
 * WAF-Rule-Packages
 * Web application firewall rule package applied to a zone
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import com.jdcloud.sdk.service.starshield.model.WAFRulePackage;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 更改异常检测类型WAF规则包的灵敏度和操作
 */
public class EditFirewallPackageResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private WAFRulePackage data;



    /**
     * get data
     *
     * @return
     */
    public WAFRulePackage getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(WAFRulePackage data) {
        this.data = data;
    }



    /**
     * set data
     *
     * @param data
     */
    public EditFirewallPackageResult data(WAFRulePackage data) {
        this.data = data;
        return this;
    }


}