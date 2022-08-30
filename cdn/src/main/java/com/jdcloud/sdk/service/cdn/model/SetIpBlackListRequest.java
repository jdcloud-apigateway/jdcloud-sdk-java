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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置ip黑名白单
 */
public class SetIpBlackListRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ip名单,ips中url不能超过50条，中国境外/全球加速域名暂不支持传IP段
     */
    
    private List<String> ips;
    /**
     * ip黑白名单类型，black:黑名单,white:白名单
     */
    private String ipListType;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;



    /**
    * get ip名单,ips中url不能超过50条，中国境外/全球加速域名暂不支持传IP段
    *
    * @return
    */
    public List<String> getIps() {
        return ips;
    }

    /**
    * set ip名单,ips中url不能超过50条，中国境外/全球加速域名暂不支持传IP段
    *
    * @param ips
    */
    public void setIps(List<String> ips) {
        this.ips = ips;
    }


    /**
     * get ip黑白名单类型，black:黑名单,white:白名单
     *
     * @return
     */
    public String getIpListType() {
        return ipListType;
    }

    /**
     * set ip黑白名单类型，black:黑名单,white:白名单
     *
     * @param ipListType
     */
    public void setIpListType(String ipListType) {
        this.ipListType = ipListType;
    }


    /**
     * get 用户域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }



    /**
    * set ip名单,ips中url不能超过50条，中国境外/全球加速域名暂不支持传IP段
    *
    * @param ips
    */
    public SetIpBlackListRequest ips(List<String> ips) {
        this.ips = ips;
        return this;
    }


    /**
     * set ip黑白名单类型，black:黑名单,white:白名单
     *
     * @param ipListType
     */
    public SetIpBlackListRequest ipListType(String ipListType) {
        this.ipListType = ipListType;
        return this;
    }


    /**
     * set 用户域名
     *
     * @param domain
     */
    public SetIpBlackListRequest domain(String domain) {
        this.domain = domain;
        return this;
    }



    /**
     * add item to ip名单,ips中url不能超过50条，中国境外/全球加速域名暂不支持传IP段
     *
     * @param ip
     */
    public void addIp(String ip) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ip);
    }
}