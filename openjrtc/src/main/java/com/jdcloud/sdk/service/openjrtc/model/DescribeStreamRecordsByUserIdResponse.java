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
 * RoomStream
 * 用户推流记录
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.openjrtc.model;

import com.jdcloud.sdk.service.JdcloudResponse;

/**
 * 查询指定用户在房间内的推流历史记录
允许通过条件过滤查询，支持的过滤字段如下：
           - kind[eq] 在线状态 1-音频流 2-视频流 100-数据流
           - startTime[eq] 用户推流开始时间-UTC时间  startTime,endTime同时指定时生效
           - endTime[eq]   用户推流结束时间-UTC时间  startTime,endTime同时指定时生效

 */
public class DescribeStreamRecordsByUserIdResponse extends JdcloudResponse<DescribeStreamRecordsByUserIdResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}