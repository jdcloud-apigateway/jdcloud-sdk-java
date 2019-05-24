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
 * Instance APIs
 * Anti DDoS Protection Package Instance APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.antipro.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.antipro.model.AddProtectedIpResponse;

/**
 * 添加防护包防护 IP.
- 防护包仅能防护防护包实例所在区域的公网 IP, 且该公网 IP 未被其他防护包防护, 如果已经被其他防护包防护, 请先调用删除防护包防护 IP 接口删除防护 IP
- 防护包可添加的防护 IP 个数小于等于防护包的可防护 IP 数量减去已防护的 IP 数量
- 使用 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-protection-package/api/describeelasticipresources&quot;&gt;describeElasticIpResources&lt;/a&gt; 接口查询防护包可防护的弹性公网 IP
- 使用 &lt;a href&#x3D;&quot;http://docs.jdcloud.com/anti-ddos-protection-package/api/describecpsipresources&quot;&gt;describeCpsIpResources&lt;/a&gt; 接口查询防护包可防护的云物理服务器公网 IP

 */
class AddProtectedIpExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public String url() {
        return "/regions/{regionId}/instances/{instanceId}:addProtectedIp";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return AddProtectedIpResponse.class;
    }
}
