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

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 
保存用户自定义命令。

详细操作说明请参考帮助文档：[用户自定义命令概述](https://docs.jdcloud.com/cn/virtual-machines/assistant-overview)

## 接口说明
- 该接口用于保存用户自定义命令。

 */
public class CreateCommandResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 命令Id。
     */
    private String commandId;



    /**
     * get 命令Id。
     *
     * @return
     */
    public String getCommandId() {
        return commandId;
    }

    /**
     * set 命令Id。
     *
     * @param commandId
     */
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }



    /**
     * set 命令Id。
     *
     * @param commandId
     */
    public CreateCommandResult commandId(String commandId) {
        this.commandId = commandId;
        return this;
    }


}