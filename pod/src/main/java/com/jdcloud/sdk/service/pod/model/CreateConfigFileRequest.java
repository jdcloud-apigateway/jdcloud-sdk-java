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
 * 镜像仓库认证信息
 * 关于镜像仓库认证信息的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.pod.model.FileToPath;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建一个 configFile，存放文件内容（键值对）。

 */
public class CreateConfigFileRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * configFile名字，不能重复

     * Required:true
     */
    @Required
    private String name;

    /**
     * key 的有效字符包括字母、数字、-、_和.; &lt;br&gt;
value 每个value长度上限为32KB，整个data的长度不能超过1M; &lt;br&gt;

     * Required:true
     */
    @Required
    private List<FileToPath> data;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get configFile名字，不能重复

     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set configFile名字，不能重复

     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get key 的有效字符包括字母、数字、-、_和.; &lt;br&gt;
value 每个value长度上限为32KB，整个data的长度不能超过1M; &lt;br&gt;

     *
     * @return
     */
    public List<FileToPath> getData() {
        return data;
    }

    /**
     * set key 的有效字符包括字母、数字、-、_和.; &lt;br&gt;
value 每个value长度上限为32KB，整个data的长度不能超过1M; &lt;br&gt;

     *
     * @param data
     */
    public void setData(List<FileToPath> data) {
        this.data = data;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set configFile名字，不能重复

     *
     * @param name
     */
    public CreateConfigFileRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set key 的有效字符包括字母、数字、-、_和.; &lt;br&gt;
value 每个value长度上限为32KB，整个data的长度不能超过1M; &lt;br&gt;

     *
     * @param data
     */
    public CreateConfigFileRequest data(List<FileToPath> data) {
        this.data = data;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public CreateConfigFileRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to key 的有效字符包括字母、数字、-、_和.; &lt;br&gt;
value 每个value长度上限为32KB，整个data的长度不能超过1M; &lt;br&gt;

     *
     * @param data
     */
    public void addData(FileToPath data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}