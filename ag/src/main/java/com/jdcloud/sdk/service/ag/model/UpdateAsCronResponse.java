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
 * 弹性伸缩定时任务管理
 * 弹性伸缩定时任务管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ag.model;

import com.jdcloud.sdk.service.JdcloudResponse;

/**
 * 修改定时任务
- 所有参数取值为字符串类型的都严格区分大小写
- 定时任务换绑高可用组，如果目前伸缩方式是执行简单规则，那么需要重新从新的高可用组中选择一个简单规则
- 伸缩功能开启或者关闭的情况下，都支持调用此接口

 */
public class UpdateAsCronResponse extends JdcloudResponse<UpdateAsCronResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}