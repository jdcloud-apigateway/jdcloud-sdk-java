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
 * 镜像
 * 关于主机镜像操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询镜像共享帐户列表，只允许操作您的个人私有镜像。

 */
public class DescribeImageMembersResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pins
     */
    private List<String> pins;


    /**
     * get pins
     *
     * @return
     */
    public List<String> getPins() {
        return pins;
    }

    /**
     * set pins
     *
     * @param pins
     */
    public void setPins(List<String> pins) {
        this.pins = pins;
    }


    /**
     * set pins
     *
     * @param pins
     */
    public DescribeImageMembersResult pins(List<String> pins) {
        this.pins = pins;
        return this;
    }


    /**
     * add item to pins
     *
     * @param pin
     */
    public void addPin(String pin) {
        if (this.pins == null) {
            this.pins = new ArrayList<>();
        }
        this.pins.add(pin);
    }

}