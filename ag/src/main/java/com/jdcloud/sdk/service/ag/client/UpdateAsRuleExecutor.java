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
 * 弹性伸缩规则管理
 * 弹性伸缩规则管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ag.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.ag.model.UpdateAsRuleResponse;

/**
 * 修改伸缩规则
- 所有参数取值为字符串类型的都严格区分大小写
- 所有伸缩规则不允许更换高可用组
- 所有伸缩规则不允许修改伸缩规则类型
- 步进规则不允许修改监控类型
- 所有参数都为非必传，但是至少需要传入一个参数，否则报错
- 伸缩功能开启或者关闭的情况下，都支持调用此接口

 */
class UpdateAsRuleExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/asRules/{asRuleId}";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return UpdateAsRuleResponse.class;
    }
}
