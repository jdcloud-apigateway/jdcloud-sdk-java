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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vm.model.Metadata;
import com.jdcloud.sdk.service.vm.model.Userdata;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
修改一台云主机的属性。

详细操作说明请参考帮助文档：
[修改实例名称](https://docs.jdcloud.com/cn/virtual-machines/modify-instance-name)
[自定义数据](https://docs.jdcloud.com/cn/virtual-machines/userdata)
[实例元数据](https://docs.jdcloud.com/cn/virtual-machines/instance-metadata)

## 接口说明
- 支持修改实例的名称、描述、hostname、自定义数据、实例元数据。

 */
public class ModifyInstanceAttributeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例名称。长度为2\~128个字符，只允许中文、数字、大小写字母、英文下划线（\_）、连字符（-）及点（.），不能以（.）作为首尾。

     */
    private String name;

    /**
     * 实例描述。256字符以内。

     */
    private String description;

    /**
     * 实例hostname。
**Windows系统**：长度为2\~15个字符，允许大小写字母、数字或连字符（-），不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能全部使用数字。不支持点号（.）。
**Linux系统**：长度为2-64个字符，允许支持多个点号，点之间为一段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾。

     */
    private String hostname;

    /**
     * 用户自定义元数据。
以 &#x60;key-value&#x60; 键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且 &#x60;key&#x60; 不超过256字符，&#x60;value&#x60; 不超过16KB，不区分大小写。
注意：&#x60;key&#x60; 不要以连字符(-)结尾，否则此 &#x60;key&#x60; 不生效。

     */
    
    private List<Metadata> metadata;
    /**
     * 自定义脚本。
目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须Base64编码且编码前数据长度不能超过16KB。
**linux系统**：支持bash和python，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60; ，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

     */
    
    private List<Userdata> userdata;
    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云主机ID。
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get 实例名称。长度为2\~128个字符，只允许中文、数字、大小写字母、英文下划线（\_）、连字符（-）及点（.），不能以（.）作为首尾。

     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 实例名称。长度为2\~128个字符，只允许中文、数字、大小写字母、英文下划线（\_）、连字符（-）及点（.），不能以（.）作为首尾。

     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 实例描述。256字符以内。

     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 实例描述。256字符以内。

     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 实例hostname。
**Windows系统**：长度为2\~15个字符，允许大小写字母、数字或连字符（-），不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能全部使用数字。不支持点号（.）。
**Linux系统**：长度为2-64个字符，允许支持多个点号，点之间为一段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾。

     *
     * @return
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * set 实例hostname。
**Windows系统**：长度为2\~15个字符，允许大小写字母、数字或连字符（-），不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能全部使用数字。不支持点号（.）。
**Linux系统**：长度为2-64个字符，允许支持多个点号，点之间为一段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾。

     *
     * @param hostname
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }


    /**
    * get 用户自定义元数据。
以 &#x60;key-value&#x60; 键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且 &#x60;key&#x60; 不超过256字符，&#x60;value&#x60; 不超过16KB，不区分大小写。
注意：&#x60;key&#x60; 不要以连字符(-)结尾，否则此 &#x60;key&#x60; 不生效。

    *
    * @return
    */
    public List<Metadata> getMetadata() {
        return metadata;
    }

    /**
    * set 用户自定义元数据。
以 &#x60;key-value&#x60; 键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且 &#x60;key&#x60; 不超过256字符，&#x60;value&#x60; 不超过16KB，不区分大小写。
注意：&#x60;key&#x60; 不要以连字符(-)结尾，否则此 &#x60;key&#x60; 不生效。

    *
    * @param metadata
    */
    public void setMetadata(List<Metadata> metadata) {
        this.metadata = metadata;
    }


    /**
    * get 自定义脚本。
目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须Base64编码且编码前数据长度不能超过16KB。
**linux系统**：支持bash和python，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60; ，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

    *
    * @return
    */
    public List<Userdata> getUserdata() {
        return userdata;
    }

    /**
    * set 自定义脚本。
目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须Base64编码且编码前数据长度不能超过16KB。
**linux系统**：支持bash和python，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60; ，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

    *
    * @param userdata
    */
    public void setUserdata(List<Userdata> userdata) {
        this.userdata = userdata;
    }


    /**
     * get 地域ID。
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 云主机ID。
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云主机ID。
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set 实例名称。长度为2\~128个字符，只允许中文、数字、大小写字母、英文下划线（\_）、连字符（-）及点（.），不能以（.）作为首尾。

     *
     * @param name
     */
    public ModifyInstanceAttributeRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 实例描述。256字符以内。

     *
     * @param description
     */
    public ModifyInstanceAttributeRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 实例hostname。
**Windows系统**：长度为2\~15个字符，允许大小写字母、数字或连字符（-），不能以连字符（-）开头或结尾，不能连续使用连字符（-），也不能全部使用数字。不支持点号（.）。
**Linux系统**：长度为2-64个字符，允许支持多个点号，点之间为一段，每段允许使用大小写字母、数字或连字符（-），但不能连续使用点号（.）或连字符（-），不能以点号（.）或连字符（-）开头或结尾。

     *
     * @param hostname
     */
    public ModifyInstanceAttributeRequest hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }


    /**
    * set 用户自定义元数据。
以 &#x60;key-value&#x60; 键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且 &#x60;key&#x60; 不超过256字符，&#x60;value&#x60; 不超过16KB，不区分大小写。
注意：&#x60;key&#x60; 不要以连字符(-)结尾，否则此 &#x60;key&#x60; 不生效。

    *
    * @param metadata
    */
    public ModifyInstanceAttributeRequest metadata(List<Metadata> metadata) {
        this.metadata = metadata;
        return this;
    }


    /**
    * set 自定义脚本。
目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须Base64编码且编码前数据长度不能超过16KB。
**linux系统**：支持bash和python，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60; ，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

    *
    * @param userdata
    */
    public ModifyInstanceAttributeRequest userdata(List<Userdata> userdata) {
        this.userdata = userdata;
        return this;
    }


    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public ModifyInstanceAttributeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 云主机ID。
     *
     * @param instanceId
     */
    public ModifyInstanceAttributeRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }



    /**
     * add item to 用户自定义元数据。
以 &#x60;key-value&#x60; 键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且 &#x60;key&#x60; 不超过256字符，&#x60;value&#x60; 不超过16KB，不区分大小写。
注意：&#x60;key&#x60; 不要以连字符(-)结尾，否则此 &#x60;key&#x60; 不生效。

     *
     * @param metadata
     */
    public void addMetadata(Metadata metadata) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadata);
    }

    /**
     * add item to 自定义脚本。
目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须Base64编码且编码前数据长度不能超过16KB。
**linux系统**：支持bash和python，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60; ，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

     *
     * @param userdata
     */
    public void addUserdata(Userdata userdata) {
        if (this.userdata == null) {
            this.userdata = new ArrayList<>();
        }
        this.userdata.add(userdata);
    }
}