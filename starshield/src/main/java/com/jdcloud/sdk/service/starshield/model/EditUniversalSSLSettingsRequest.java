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
 * Universal-SSL-Settings-for-a-Zone
 * Universal SSL Settings for a Zone
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修补域的通用SSL设置
 */
public class EditUniversalSSLSettingsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 禁用通用SSL将从边缘上删除域的所有当前激活的通用SSL证书并且防止将来订购任何通用SSL证书。如果没有为域上载专用证书或自定义证书，访问者将无法通过HTTPS访问域。
通过禁用通用SSL，您知道以下星盾设置和首选项将导致访问者无法访问您的域，除非您上载了自定义证书或购买了专用证书。
  * HSTS
  * Always Use HTTPS
  * Opportunistic Encryption
  * Onion Routing
  * Any Page Rules redirecting traffic to HTTPS
类似地，在启用星盾代理时，在源站将任何HTTP重定向到HTTPS将导致用户在星盾的边缘没有有效证书的情况下无法访问您的站点。
如果您在星盾的边缘没有有效的自定义或专用证书，并且不确定是否启用了上述任何星盾设置，或者如果您的源站存在任何HTTP重定向，我们建议您的域保持启用通用SSL。

     */
    private Boolean enabled;

    /**
     * zone_identifier
     * Required:true
     */
    @Required
    private String zone_identifier;



    /**
     * get 禁用通用SSL将从边缘上删除域的所有当前激活的通用SSL证书并且防止将来订购任何通用SSL证书。如果没有为域上载专用证书或自定义证书，访问者将无法通过HTTPS访问域。
通过禁用通用SSL，您知道以下星盾设置和首选项将导致访问者无法访问您的域，除非您上载了自定义证书或购买了专用证书。
  * HSTS
  * Always Use HTTPS
  * Opportunistic Encryption
  * Onion Routing
  * Any Page Rules redirecting traffic to HTTPS
类似地，在启用星盾代理时，在源站将任何HTTP重定向到HTTPS将导致用户在星盾的边缘没有有效证书的情况下无法访问您的站点。
如果您在星盾的边缘没有有效的自定义或专用证书，并且不确定是否启用了上述任何星盾设置，或者如果您的源站存在任何HTTP重定向，我们建议您的域保持启用通用SSL。

     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set 禁用通用SSL将从边缘上删除域的所有当前激活的通用SSL证书并且防止将来订购任何通用SSL证书。如果没有为域上载专用证书或自定义证书，访问者将无法通过HTTPS访问域。
通过禁用通用SSL，您知道以下星盾设置和首选项将导致访问者无法访问您的域，除非您上载了自定义证书或购买了专用证书。
  * HSTS
  * Always Use HTTPS
  * Opportunistic Encryption
  * Onion Routing
  * Any Page Rules redirecting traffic to HTTPS
类似地，在启用星盾代理时，在源站将任何HTTP重定向到HTTPS将导致用户在星盾的边缘没有有效证书的情况下无法访问您的站点。
如果您在星盾的边缘没有有效的自定义或专用证书，并且不确定是否启用了上述任何星盾设置，或者如果您的源站存在任何HTTP重定向，我们建议您的域保持启用通用SSL。

     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * get zone_identifier
     *
     * @return
     */
    public String getZone_identifier() {
        return zone_identifier;
    }

    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public void setZone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
    }



    /**
     * set 禁用通用SSL将从边缘上删除域的所有当前激活的通用SSL证书并且防止将来订购任何通用SSL证书。如果没有为域上载专用证书或自定义证书，访问者将无法通过HTTPS访问域。
通过禁用通用SSL，您知道以下星盾设置和首选项将导致访问者无法访问您的域，除非您上载了自定义证书或购买了专用证书。
  * HSTS
  * Always Use HTTPS
  * Opportunistic Encryption
  * Onion Routing
  * Any Page Rules redirecting traffic to HTTPS
类似地，在启用星盾代理时，在源站将任何HTTP重定向到HTTPS将导致用户在星盾的边缘没有有效证书的情况下无法访问您的站点。
如果您在星盾的边缘没有有效的自定义或专用证书，并且不确定是否启用了上述任何星盾设置，或者如果您的源站存在任何HTTP重定向，我们建议您的域保持启用通用SSL。

     *
     * @param enabled
     */
    public EditUniversalSSLSettingsRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }


    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public EditUniversalSSLSettingsRequest zone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
        return this;
    }


}