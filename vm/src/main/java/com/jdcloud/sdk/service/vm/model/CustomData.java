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
 * 用户自定义元数据。
 */
public class CustomData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云主机ID。
     */
    private String instanceId;

    /**
     * 用户自定义元数据。
以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
注意：key不要以连字符(-)结尾，否则此key不生效。

     */
    
    private List<Metadata> metadata;
    /**
     * 自定义脚本。
目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须 &#x60;base64&#x60; 编码且编码前数据长度不能超过16KB。
**linux系统**：支持 &#x60;bash&#x60; 和 &#x60;python&#x60;，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60;，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

     */
    
    private List<Userdata> userdata;


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
    * get 用户自定义元数据。
以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
注意：key不要以连字符(-)结尾，否则此key不生效。

    *
    * @return
    */
    public List<Metadata> getMetadata() {
        return metadata;
    }

    /**
    * set 用户自定义元数据。
以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
注意：key不要以连字符(-)结尾，否则此key不生效。

    *
    * @param metadata
    */
    public void setMetadata(List<Metadata> metadata) {
        this.metadata = metadata;
    }


    /**
    * get 自定义脚本。
目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须 &#x60;base64&#x60; 编码且编码前数据长度不能超过16KB。
**linux系统**：支持 &#x60;bash&#x60; 和 &#x60;python&#x60;，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60;，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

    *
    * @return
    */
    public List<Userdata> getUserdata() {
        return userdata;
    }

    /**
    * set 自定义脚本。
目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须 &#x60;base64&#x60; 编码且编码前数据长度不能超过16KB。
**linux系统**：支持 &#x60;bash&#x60; 和 &#x60;python&#x60;，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60;，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

    *
    * @param userdata
    */
    public void setUserdata(List<Userdata> userdata) {
        this.userdata = userdata;
    }



    /**
     * set 云主机ID。
     *
     * @param instanceId
     */
    public CustomData instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
    * set 用户自定义元数据。
以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
注意：key不要以连字符(-)结尾，否则此key不生效。

    *
    * @param metadata
    */
    public CustomData metadata(List<Metadata> metadata) {
        this.metadata = metadata;
        return this;
    }


    /**
    * set 自定义脚本。
目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须 &#x60;base64&#x60; 编码且编码前数据长度不能超过16KB。
**linux系统**：支持 &#x60;bash&#x60; 和 &#x60;python&#x60;，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60;，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

    *
    * @param userdata
    */
    public CustomData userdata(List<Userdata> userdata) {
        this.userdata = userdata;
        return this;
    }



    /**
     * add item to 用户自定义元数据。
以key-value键值对形式指定，可在实例系统内通过元数据服务查询获取。最多支持40对键值对，且key不超过256字符，value不超过16KB，不区分大小写。
注意：key不要以连字符(-)结尾，否则此key不生效。

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
目前仅支持启动脚本，即 &#x60;launch-script&#x60;，须 &#x60;base64&#x60; 编码且编码前数据长度不能超过16KB。
**linux系统**：支持 &#x60;bash&#x60; 和 &#x60;python&#x60;，编码前须分别以 &#x60;#!/bin/bash&#x60; 和 &#x60;#!/usr/bin/env python&#x60; 作为内容首行。
**Windows系统**：支持 &#x60;bat&#x60; 和 &#x60;powershell&#x60;，编码前须分别以 &#x60;&lt;cmd&gt;&lt;/cmd&gt;和&lt;powershell&gt;&lt;/powershell&gt;&#x60; 作为内容首、尾行。

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