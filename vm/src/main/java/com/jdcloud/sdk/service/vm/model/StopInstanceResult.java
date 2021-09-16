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

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 
停止云主机实例。

详细操作说明请参考帮助文档：[停止实例](https://docs.jdcloud.com/cn/virtual-machines/stop-instance)

## 接口说明
- 实例状态必须为运行 &#x60;running&#x60; 状态，同时实例没有正在进行中的任务时才可停止。
- 如果云主机实例属性 &#x60;chargeOnStopped&#x60; 的值为 &#x60;stopCharging&#x60;，实例关机之后，实例部分将停止计费，且释放实例自身包含的资源（CPU/内存/GPU/本地数据盘）。需要使用者注意的是，实例一旦释放自身资源，再次启动时有可能因为库存资源不足而导致无法启动。
- &#x60;chargeOnStopped&#x60; 该参数仅对按配置计费且系统盘为云硬盘的实例生效，并且不是专有宿主机中的实例。

 */
public class StopInstanceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}