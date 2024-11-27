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
 * 
查询私有镜像共享给哪些京东云帐户。

详细操作说明请参考帮助文档：[共享私有镜像](https://docs.jdcloud.com/cn/virtual-machines/share-image)

## 接口说明
- 只允许查询用户的私有镜像。

 */
public class DescribeImageMembersResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pins
     */
    
    private List<String> pins;
    /**
     * loginNames
     */
    
    private List<String> loginNames;


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
    * get loginNames
    *
    * @return
    */
    public List<String> getLoginNames() {
        return loginNames;
    }

    /**
    * set loginNames
    *
    * @param loginNames
    */
    public void setLoginNames(List<String> loginNames) {
        this.loginNames = loginNames;
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
    * set loginNames
    *
    * @param loginNames
    */
    public DescribeImageMembersResult loginNames(List<String> loginNames) {
        this.loginNames = loginNames;
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

    /**
     * add item to loginNames
     *
     * @param loginName
     */
    public void addLoginName(String loginName) {
        if (this.loginNames == null) {
            this.loginNames = new ArrayList<>();
        }
        this.loginNames.add(loginName);
    }
}