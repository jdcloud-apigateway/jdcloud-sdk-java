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
 * imageInstanceTypeConstraint
 */
public class ImageInstanceTypeConstraint  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 受限制的规格类型。excludes：排除指定的实例类型；includes：只包含指定的实例类型，暂不支持includes
     */
    private String constraintsType;

    /**
     * 规格类型列表
     */
    private List<String> instanceTypes;


    /**
     * get 受限制的规格类型。excludes：排除指定的实例类型；includes：只包含指定的实例类型，暂不支持includes
     *
     * @return
     */
    public String getConstraintsType() {
        return constraintsType;
    }

    /**
     * set 受限制的规格类型。excludes：排除指定的实例类型；includes：只包含指定的实例类型，暂不支持includes
     *
     * @param constraintsType
     */
    public void setConstraintsType(String constraintsType) {
        this.constraintsType = constraintsType;
    }

    /**
     * get 规格类型列表
     *
     * @return
     */
    public List<String> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * set 规格类型列表
     *
     * @param instanceTypes
     */
    public void setInstanceTypes(List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
    }


    /**
     * set 受限制的规格类型。excludes：排除指定的实例类型；includes：只包含指定的实例类型，暂不支持includes
     *
     * @param constraintsType
     */
    public ImageInstanceTypeConstraint constraintsType(String constraintsType) {
        this.constraintsType = constraintsType;
        return this;
    }

    /**
     * set 规格类型列表
     *
     * @param instanceTypes
     */
    public ImageInstanceTypeConstraint instanceTypes(List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }


    /**
     * add item to 规格类型列表
     *
     * @param instanceType
     */
    public void addInstanceType(String instanceType) {
        if (this.instanceTypes == null) {
            this.instanceTypes = new ArrayList<>();
        }
        this.instanceTypes.add(instanceType);
    }

}