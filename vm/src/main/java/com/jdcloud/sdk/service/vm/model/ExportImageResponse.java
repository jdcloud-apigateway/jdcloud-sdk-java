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
 * 镜像
 * 关于主机镜像操作的相关接口
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
导出私有镜像。

将京东云私有镜像导出至京东云以外环境。

详细操作说明请参考帮助文档：[导出私有镜像](https://docs.jdcloud.com/cn/virtual-machines/export-private-image)

## 接口说明
- 调用此接口将私有镜像导出到京东云对象存储空间中。
- 仅支持系统盘镜像导出，即使镜像有关联的数据盘快照，也仅会导出系统盘镜像文件。
- 导出的镜像文件格式为QCOW2。
- &#x60;Windows Server&#x60; 操作系统的镜像不支持导出（若镜像来源为导入镜像，则无此限制）。
- 镜像必须为 &#x60;云硬盘系统盘&#x60; 镜像，如您的镜像是 &#x60;本地盘系统盘&#x60; 镜像，可以通过镜像类型转换功能转换为云盘系统盘镜像后再导出。

 */
public class ExportImageResponse extends JdcloudResponse<ExportImageResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}