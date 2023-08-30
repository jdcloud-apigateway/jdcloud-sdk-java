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
 * Command
 * 云助手相关命令操作接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.assistant.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
修改用户自定义命令。

详细操作说明请参考帮助文档：[用户自定义命令概述](https://docs.jdcloud.com/cn/virtual-machines/assistant-overview)

## 接口说明
- 该接口用于修改用户自定义命令。

 */
public class ModifyCommandRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 命令Id

     * Required:true
     */
    @Required
    private String commandId;

    /**
     * 命令名称，长度为1\~128个字符，只允许中文、数字、大小写字母、英文下划线（\_）、连字符（-）及点（.）。

     */
    private String commandName;

    /**
     * 命令类型，可选值：shell和powershell。默认shell

     */
    private String commandType;

    /**
     * 以base64编码的命令内容，编码后长度小于16KB

     */
    private String commandContent;

    /**
     * 命令描述，描述该命令详细信息，如功能、使用注意事项等。长度小于256。

     */
    private String commandDescription;

    /**
     * 命令执行路径，在linux上默认为用户的home目录：/root, 在windows上默认为：C:\Windows\system32

     */
    private String workdir;

    /**
     * 超时时间，取值范围：[10, 86400], 超过该时间后，尚未执行完的命令会置为失败。默认60s

     */
    private Integer timeout;

    /**
     * 用户名，执行该命令时的用户身份。在linux上默认是root，windows上默认是administrator。长度小于256

     */
    private String username;

    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 命令Id

     *
     * @return
     */
    public String getCommandId() {
        return commandId;
    }

    /**
     * set 命令Id

     *
     * @param commandId
     */
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }


    /**
     * get 命令名称，长度为1\~128个字符，只允许中文、数字、大小写字母、英文下划线（\_）、连字符（-）及点（.）。

     *
     * @return
     */
    public String getCommandName() {
        return commandName;
    }

    /**
     * set 命令名称，长度为1\~128个字符，只允许中文、数字、大小写字母、英文下划线（\_）、连字符（-）及点（.）。

     *
     * @param commandName
     */
    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }


    /**
     * get 命令类型，可选值：shell和powershell。默认shell

     *
     * @return
     */
    public String getCommandType() {
        return commandType;
    }

    /**
     * set 命令类型，可选值：shell和powershell。默认shell

     *
     * @param commandType
     */
    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }


    /**
     * get 以base64编码的命令内容，编码后长度小于16KB

     *
     * @return
     */
    public String getCommandContent() {
        return commandContent;
    }

    /**
     * set 以base64编码的命令内容，编码后长度小于16KB

     *
     * @param commandContent
     */
    public void setCommandContent(String commandContent) {
        this.commandContent = commandContent;
    }


    /**
     * get 命令描述，描述该命令详细信息，如功能、使用注意事项等。长度小于256。

     *
     * @return
     */
    public String getCommandDescription() {
        return commandDescription;
    }

    /**
     * set 命令描述，描述该命令详细信息，如功能、使用注意事项等。长度小于256。

     *
     * @param commandDescription
     */
    public void setCommandDescription(String commandDescription) {
        this.commandDescription = commandDescription;
    }


    /**
     * get 命令执行路径，在linux上默认为用户的home目录：/root, 在windows上默认为：C:\Windows\system32

     *
     * @return
     */
    public String getWorkdir() {
        return workdir;
    }

    /**
     * set 命令执行路径，在linux上默认为用户的home目录：/root, 在windows上默认为：C:\Windows\system32

     *
     * @param workdir
     */
    public void setWorkdir(String workdir) {
        this.workdir = workdir;
    }


    /**
     * get 超时时间，取值范围：[10, 86400], 超过该时间后，尚未执行完的命令会置为失败。默认60s

     *
     * @return
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * set 超时时间，取值范围：[10, 86400], 超过该时间后，尚未执行完的命令会置为失败。默认60s

     *
     * @param timeout
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }


    /**
     * get 用户名，执行该命令时的用户身份。在linux上默认是root，windows上默认是administrator。长度小于256

     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * set 用户名，执行该命令时的用户身份。在linux上默认是root，windows上默认是administrator。长度小于256

     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
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
     * set 命令Id

     *
     * @param commandId
     */
    public ModifyCommandRequest commandId(String commandId) {
        this.commandId = commandId;
        return this;
    }


    /**
     * set 命令名称，长度为1\~128个字符，只允许中文、数字、大小写字母、英文下划线（\_）、连字符（-）及点（.）。

     *
     * @param commandName
     */
    public ModifyCommandRequest commandName(String commandName) {
        this.commandName = commandName;
        return this;
    }


    /**
     * set 命令类型，可选值：shell和powershell。默认shell

     *
     * @param commandType
     */
    public ModifyCommandRequest commandType(String commandType) {
        this.commandType = commandType;
        return this;
    }


    /**
     * set 以base64编码的命令内容，编码后长度小于16KB

     *
     * @param commandContent
     */
    public ModifyCommandRequest commandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }


    /**
     * set 命令描述，描述该命令详细信息，如功能、使用注意事项等。长度小于256。

     *
     * @param commandDescription
     */
    public ModifyCommandRequest commandDescription(String commandDescription) {
        this.commandDescription = commandDescription;
        return this;
    }


    /**
     * set 命令执行路径，在linux上默认为用户的home目录：/root, 在windows上默认为：C:\Windows\system32

     *
     * @param workdir
     */
    public ModifyCommandRequest workdir(String workdir) {
        this.workdir = workdir;
        return this;
    }


    /**
     * set 超时时间，取值范围：[10, 86400], 超过该时间后，尚未执行完的命令会置为失败。默认60s

     *
     * @param timeout
     */
    public ModifyCommandRequest timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }


    /**
     * set 用户名，执行该命令时的用户身份。在linux上默认是root，windows上默认是administrator。长度小于256

     *
     * @param username
     */
    public ModifyCommandRequest username(String username) {
        this.username = username;
        return this;
    }


    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public ModifyCommandRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}