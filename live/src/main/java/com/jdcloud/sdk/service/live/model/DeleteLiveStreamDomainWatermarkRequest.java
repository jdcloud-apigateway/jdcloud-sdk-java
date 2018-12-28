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
 * Live API
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除域名水印配置
 */
public class DeleteLiveStreamDomainWatermarkRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 推流加速域名
     * Required:true
     */
    @Required
    private String publishDomain;

    /**
     * 转码模版
     * Required:true
     */
    @Required
    private String template;


    /**
     * get 推流加速域名
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 推流加速域名
     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    /**
     * get 转码模版
     *
     * @return
     */
    public String getTemplate() {
        return template;
    }

    /**
     * set 转码模版
     *
     * @param template
     */
    public void setTemplate(String template) {
        this.template = template;
    }


    /**
     * set 推流加速域名
     *
     * @param publishDomain
     */
    public DeleteLiveStreamDomainWatermarkRequest publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 转码模版
     *
     * @param template
     */
    public DeleteLiveStreamDomainWatermarkRequest template(String template) {
        this.template = template;
        return this;
    }


}