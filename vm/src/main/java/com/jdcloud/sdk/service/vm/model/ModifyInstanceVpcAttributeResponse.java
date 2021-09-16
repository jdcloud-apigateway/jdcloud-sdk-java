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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.service.JdcloudResponse;

/**
 * 
修改一台云主机的子网或内网IP地址。

详细操作说明请参考帮助文档：[修改网络配置](https://docs.jdcloud.com/cn/virtual-machines/modify-vpc-attribute)

## 接口说明
- 调该接口之前实例必须处于停止 &#x60;stopped&#x60; 状态。
- 修改VPC及子网
  - 内网IPv4：可指定或由系统分配。
  - IPv6：如新子网支持IPv6，可选是否分配，如分配仅支持系统分配。
  - 安全组：须指定新VPC下的安全组。
- 不修改VPC，仅修改子网
  - 内网IPv4：可指定或由系统分配。
  - IPv6：如新子网支持IPv6，可选是否分配，如分配仅支持系统分配。
  - 安全组：不支持绑定新安全组。
- 不修改VPC及子网，仅更换内网IP
  - 内网IPv4：须指定IP地址。
  - IPv6：不支持修改。
  - 安全组：不支持绑定新安全组。
- 一些限制及注意事项：
  - 已加入负载均衡-后端服务器组中的实例不允许修改。
  - 绑定弹性网卡的实例不支持修改VPC，仅支持在同VPC下修改子网和内网IP。
  - 主网卡分配了辅助内网IP的实例不支持修改VPC和子网，仅支持在同子网下修改内网IP。
  - 如实例在高可用组内，则不允许修改VPC，仅可在同VPC内修改子网或内网IPv4地址。
  - 仅在更换VPC时传入安全组ID才有效，且安全组须隶属于目标VPC。
  - 如指定内网IPv4，须确保IP地址在子网网段内且未被占用；如不指定则随机分配，须确保子网可用IP充足。

 */
public class ModifyInstanceVpcAttributeResponse extends JdcloudResponse<ModifyInstanceVpcAttributeResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}