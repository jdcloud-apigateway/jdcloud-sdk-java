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
 * RegisterUser
 * 用户管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.openjrtc.model;

import com.jdcloud.sdk.service.JdcloudResponse;

/**
 * 查询注册用户列表
允许通过条件过滤查询，支持的过滤字段如下：
           - startTime[eq] 用户注册时间段开始时间-UTC时间 startTime,endTime同时有值时生效
           - endTime[eq] 用户注册时间段结束时间-UTC时间 startTime,endTime同时有值时生效

 */
public class DescribeRegisterUsersResponse extends JdcloudResponse<DescribeRegisterUsersResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}