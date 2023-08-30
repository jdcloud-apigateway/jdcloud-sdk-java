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
 * Invocation
 * 云助手相关命令操作接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.assistant.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.assistant.model.StopInvocationResponse;

/**
 * 
停止执行命令。

详细操作说明请参考帮助文档：[用户自定义命令概述](https://docs.jdcloud.com/cn/virtual-machines/assistant-overview)

## 接口说明
- 该接口用于停止执行命令。
- 对于已经开始执行的命令，有可能会停止失败

 */
class StopInvocationExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/stopInvocation";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return StopInvocationResponse.class;
    }
}
