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
 * Resource-Tag-APIs
 * 资源标签接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.resourcetag.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.resourcetag.model.TagKeysReqVo;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取标签键
 */
public class DescribeKeysRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签键参数
     * Required:true
     */
    @Required
    private TagKeysReqVo tagKeysVo;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 标签键参数
     *
     * @return
     */
    public TagKeysReqVo getTagKeysVo() {
        return tagKeysVo;
    }

    /**
     * set 标签键参数
     *
     * @param tagKeysVo
     */
    public void setTagKeysVo(TagKeysReqVo tagKeysVo) {
        this.tagKeysVo = tagKeysVo;
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
     * set 标签键参数
     *
     * @param tagKeysVo
     */
    public DescribeKeysRequest tagKeysVo(TagKeysReqVo tagKeysVo) {
        this.tagKeysVo = tagKeysVo;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public DescribeKeysRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}