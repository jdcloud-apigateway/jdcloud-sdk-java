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

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 镜像计费信息，包含ServiceCode和Formula。
 */
public class ImageChargeInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像配置的资源类型，用于交易计费。
     */
    private String serviceCode;

    /**
     * 镜像配置的计费项，用于交易计费。
     */
    
    private List<String> formula;


    /**
     * get 镜像配置的资源类型，用于交易计费。
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 镜像配置的资源类型，用于交易计费。
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
    * get 镜像配置的计费项，用于交易计费。
    *
    * @return
    */
    public List<String> getFormula() {
        return formula;
    }

    /**
    * set 镜像配置的计费项，用于交易计费。
    *
    * @param formula
    */
    public void setFormula(List<String> formula) {
        this.formula = formula;
    }



    /**
     * set 镜像配置的资源类型，用于交易计费。
     *
     * @param serviceCode
     */
    public ImageChargeInfo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
    * set 镜像配置的计费项，用于交易计费。
    *
    * @param formula
    */
    public ImageChargeInfo formula(List<String> formula) {
        this.formula = formula;
        return this;
    }



    /**
     * add item to 镜像配置的计费项，用于交易计费。
     *
     * @param formula
     */
    public void addFormula(String formula) {
        if (this.formula == null) {
            this.formula = new ArrayList<>();
        }
        this.formula.add(formula);
    }
}