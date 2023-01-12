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
 * Zone-Settings
 * A Zone setting changes how the Zone works in relation to caching, security, or other features of JDC StarShield
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.starshield.model.ChangeEnableQueryStringSortSettingResponse;

/**
 * 星盾将把具有相同查询字符串的文件视为缓存中的同一个文件，而不管查询字符串的顺序如何。这只限于企业级域。

 */
class ChangeEnableQueryStringSortSettingExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "PATCH";
    }

    @Override
    public String url() {
        return "/zones/{zone_identifier}/settings$$sort_query_string_for_cache";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return ChangeEnableQueryStringSortSettingResponse.class;
    }
}
