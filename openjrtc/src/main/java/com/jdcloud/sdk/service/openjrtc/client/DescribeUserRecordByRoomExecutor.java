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
 * JrtcStatistic
 * 数据统计
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.openjrtc.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.openjrtc.model.DescribeUserRecordByRoomResponse;

/**
 * 查询房间用户记录,最大支持查询7天的数据
允许通过条件过滤查询，支持的过滤字段如下：
           - appId[eq] 按应用ID精确查询 (必填)
           - startTime[eq] 开始时间 UTC格式 (必填)
           - endTime[eq] 截止时间 UTC格式 (必填)
           - userRoomId[eq] 按房间ID精确查询(必填)
           - userId[eq] 按用户ID精确查询

 */
class DescribeUserRecordByRoomExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String url() {
        return "/describeUserRecordByRoom";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return DescribeUserRecordByRoomResponse.class;
    }
}
