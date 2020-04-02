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
 * ES Instance API
 * es实例的创建、变配、删除、查询接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.es.model;

import com.jdcloud.sdk.service.JdcloudResponse;

/**
 * 变更es实例的配置，实例为running状态才可变更配置，每次只能变更一种且不可与原来的相同。
实例配置（cpu核数、内存、磁盘容量、节点数量）目前只允许变大

 */
public class ModifyInstanceSpecResponse extends JdcloudResponse<ModifyInstanceSpecResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}