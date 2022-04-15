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
 * Bandwidth-Package
 * 共享带宽包相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.service.JdcloudResponse;

/**
 * 指定地域创建共享带宽包实例。

## 接口说明

- 需要接口完成实名认证、支付方式确认、计费类型选择等准备工作。

- 各地域下包年包月和按配置计费的共享带宽包不受配额限制，按用量计费的共享带宽包可创建数量受配额限制，创建前请通过 [DescribeQuotas](https://docs.jdcloud.com/cn/shared-bandwidth-package/api/describequotas?content&#x3D;API) 确认配额，如须提升请[提交工单](https://ticket.jdcloud.com/applyorder/submit)或联系京东云客服。

- 通过本接口创建包年包月资源时将自动从账户扣款（代金券优先），如需使用第三方支付方式请通过控制台创建。

- 按用量计费模式需提工单申请使用权限，默认支持增强95消峰计费。

 */
public class CreateBandwidthPackageResponse extends JdcloudResponse<CreateBandwidthPackageResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}