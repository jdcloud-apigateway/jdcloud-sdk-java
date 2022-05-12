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

package com.jdcloud.sdk.service.openjrtc.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.openjrtc.model.DescribeStreamInfosByUserRoomIdResponse;

/**
 * 查询房间内推流信息列表
允许通过条件过滤查询，支持的过滤字段如下：
           - status[eq] 在线状态 1-在线 2-离线
           - kind[eq] 在线状态 1-音频流 2-视频流 100-数据流
           - startTime[eq] 用户推流开始时间-UTC时间  startTime,endTime同时指定时生效
           - endTime[eq]   用户推流结束时间-UTC时间  startTime,endTime同时指定时生效

 */
class DescribeStreamInfosByUserRoomIdExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String url() {
        return "/describeStreamInfosByUserRoomId/{appId}";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return DescribeStreamInfosByUserRoomIdResponse.class;
    }
}