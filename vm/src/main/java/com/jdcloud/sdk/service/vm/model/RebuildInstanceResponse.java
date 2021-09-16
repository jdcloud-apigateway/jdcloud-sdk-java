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
重置云主机系统。

需要注意的是，重装系统会导致系统盘的内容全部丢失，数据盘的数据不受影响（但需要重新识别）。因此，在需要保留系统运行数据的情况下，强烈建议您在重置系统前制作私有镜像，之后重置时选择该私有镜像即可实现保留系统运行数据。

详细操作说明请参考帮助文档：[重置系统](https://docs.jdcloud.com/cn/virtual-machines/rebuild-instance)

## 接口说明
- 云主机的状态必须为 &#x60;stopped&#x60; 状态。
- 若实例基于私有镜像创建，而私有镜像已被删除，则无法使用原镜像重置系统，即无法恢复至刚创建时的系统状态，建议保留被实例引用的私有镜像。
- 重置系统需要重新指定密码，对于 &#x60;Linux&#x60; 系统您还可以重新指定 &#x60;SSH密钥&#x60;。
- 对于云盘作系统盘的实例，当前系统盘大小不能超过目标镜像对应系统盘快照的容量。
- 云主机系统盘类型必须与待更换镜像支持的系统盘类型保持一致，若当前云主机系统盘为 &#x60;local&#x60; 类型，则更换镜像的系统盘类型必须为 &#x60;loaclDisk&#x60; 类型；同理，若当前云主机系统盘为 &#x60;cloud&#x60; 类型，则更换镜像的系统盘类型必须为 &#x60;cloudDisk&#x60; 类型。可查询 [DescribeImages](https://docs.jdcloud.com/virtual-machines/api/describeimages) 接口获得指定地域的镜像信息。
- 指定的镜像必须能够支持当前主机的实例规格 &#x60;instanceType&#x60;，否则会返回错误。可查询 [DescribeImageConstraints](docs.jdcloud.com/virtual-machines/api/describeimageconstraints) 接口获得指定镜像支持的系统盘类型信息。

 */
public class RebuildInstanceResponse extends JdcloudResponse<RebuildInstanceResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}