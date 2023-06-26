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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * addDomain
 */
public class AddDomain  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例id，代表要设置的WAF实例
     * Required:true
     */
    @Required
    private String wafInstanceId;

    /**
     * 域名，单个
     * Required:true
     */
    @Required
    private String domain;

    /**
     * 域名数组
     */
    
    private List<String> domains;
    /**
     * 使用协议，eg:[&quot;http&quot;,&quot;https&quot;]
     * Required:true
     */
    @Required
    
    private List<String> protocols;
    /**
     * ssl协议，eg:[&quot;TLSv1&quot;,&quot;TLSv1.1&quot;,&quot;TLSv1.2&quot;,&quot;SSLv2&quot;,&quot;SSLv3&quot;,&quot;TLSv1.3&quot;]
     */
    
    private List<String> sslProtocols;
    /**
     * 负载均衡算法，eg:&quot;rr&quot;，&quot;ip_hash&quot;,&quot;weight_rr&quot;
     * Required:true
     */
    @Required
    private String lbType;

    /**
     * 回源配置
     * Required:true
     */
    @Required
    private RsConfig rsConfig;

    /**
     * 是否使用前置代理，0为未使用，1为使用
     */
    private Integer pureClient;

    /**
     * 1为跳转 0为不跳转
     */
    private Integer httpsRedirect;

    /**
     * 用户服务器是否只能http回源，1为是，0为否
     */
    private Integer rsOnlySupportHttp;

    /**
     * 是否支持国密证书
     */
    private Integer gmCertSupport;

    /**
     * Waf侧支持http版本，不传时默认值为http1.1,传&quot;http2&quot;为http2
     */
    private String httpVersion;

    /**
     * 回源是否支持长链接，0为否
     */
    private Integer enableKeepalive;

    /**
     * 加密套件等级，0表示默认为中级，1表示高级，2表示低级, 3表示自定义
     */
    private Integer suiteLevel;

    /**
     * 自定义加密套件
     */
    
    private List<String> userSuiteLevel;
    /**
     * 请求头是否支持下划线，0-否，1-是。缺省为0
     */
    private Integer enableUnderscores;

    /**
     * 禁用被动健康检查，缺省为0-否
     */
    private Integer disableHealthCheck;

    /**
     * 连接超时时间，3-60s
     */
    private Integer proxyConnectTimeout;



    /**
     * get 实例id，代表要设置的WAF实例
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set 实例id，代表要设置的WAF实例
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }


    /**
     * get 域名，单个
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名，单个
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
    * get 域名数组
    *
    * @return
    */
    public List<String> getDomains() {
        return domains;
    }

    /**
    * set 域名数组
    *
    * @param domains
    */
    public void setDomains(List<String> domains) {
        this.domains = domains;
    }


    /**
    * get 使用协议，eg:[&quot;http&quot;,&quot;https&quot;]
    *
    * @return
    */
    public List<String> getProtocols() {
        return protocols;
    }

    /**
    * set 使用协议，eg:[&quot;http&quot;,&quot;https&quot;]
    *
    * @param protocols
    */
    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }


    /**
    * get ssl协议，eg:[&quot;TLSv1&quot;,&quot;TLSv1.1&quot;,&quot;TLSv1.2&quot;,&quot;SSLv2&quot;,&quot;SSLv3&quot;,&quot;TLSv1.3&quot;]
    *
    * @return
    */
    public List<String> getSslProtocols() {
        return sslProtocols;
    }

    /**
    * set ssl协议，eg:[&quot;TLSv1&quot;,&quot;TLSv1.1&quot;,&quot;TLSv1.2&quot;,&quot;SSLv2&quot;,&quot;SSLv3&quot;,&quot;TLSv1.3&quot;]
    *
    * @param sslProtocols
    */
    public void setSslProtocols(List<String> sslProtocols) {
        this.sslProtocols = sslProtocols;
    }


    /**
     * get 负载均衡算法，eg:&quot;rr&quot;，&quot;ip_hash&quot;,&quot;weight_rr&quot;
     *
     * @return
     */
    public String getLbType() {
        return lbType;
    }

    /**
     * set 负载均衡算法，eg:&quot;rr&quot;，&quot;ip_hash&quot;,&quot;weight_rr&quot;
     *
     * @param lbType
     */
    public void setLbType(String lbType) {
        this.lbType = lbType;
    }


    /**
     * get 回源配置
     *
     * @return
     */
    public RsConfig getRsConfig() {
        return rsConfig;
    }

    /**
     * set 回源配置
     *
     * @param rsConfig
     */
    public void setRsConfig(RsConfig rsConfig) {
        this.rsConfig = rsConfig;
    }


    /**
     * get 是否使用前置代理，0为未使用，1为使用
     *
     * @return
     */
    public Integer getPureClient() {
        return pureClient;
    }

    /**
     * set 是否使用前置代理，0为未使用，1为使用
     *
     * @param pureClient
     */
    public void setPureClient(Integer pureClient) {
        this.pureClient = pureClient;
    }


    /**
     * get 1为跳转 0为不跳转
     *
     * @return
     */
    public Integer getHttpsRedirect() {
        return httpsRedirect;
    }

    /**
     * set 1为跳转 0为不跳转
     *
     * @param httpsRedirect
     */
    public void setHttpsRedirect(Integer httpsRedirect) {
        this.httpsRedirect = httpsRedirect;
    }


    /**
     * get 用户服务器是否只能http回源，1为是，0为否
     *
     * @return
     */
    public Integer getRsOnlySupportHttp() {
        return rsOnlySupportHttp;
    }

    /**
     * set 用户服务器是否只能http回源，1为是，0为否
     *
     * @param rsOnlySupportHttp
     */
    public void setRsOnlySupportHttp(Integer rsOnlySupportHttp) {
        this.rsOnlySupportHttp = rsOnlySupportHttp;
    }


    /**
     * get 是否支持国密证书
     *
     * @return
     */
    public Integer getGmCertSupport() {
        return gmCertSupport;
    }

    /**
     * set 是否支持国密证书
     *
     * @param gmCertSupport
     */
    public void setGmCertSupport(Integer gmCertSupport) {
        this.gmCertSupport = gmCertSupport;
    }


    /**
     * get Waf侧支持http版本，不传时默认值为http1.1,传&quot;http2&quot;为http2
     *
     * @return
     */
    public String getHttpVersion() {
        return httpVersion;
    }

    /**
     * set Waf侧支持http版本，不传时默认值为http1.1,传&quot;http2&quot;为http2
     *
     * @param httpVersion
     */
    public void setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
    }


    /**
     * get 回源是否支持长链接，0为否
     *
     * @return
     */
    public Integer getEnableKeepalive() {
        return enableKeepalive;
    }

    /**
     * set 回源是否支持长链接，0为否
     *
     * @param enableKeepalive
     */
    public void setEnableKeepalive(Integer enableKeepalive) {
        this.enableKeepalive = enableKeepalive;
    }


    /**
     * get 加密套件等级，0表示默认为中级，1表示高级，2表示低级, 3表示自定义
     *
     * @return
     */
    public Integer getSuiteLevel() {
        return suiteLevel;
    }

    /**
     * set 加密套件等级，0表示默认为中级，1表示高级，2表示低级, 3表示自定义
     *
     * @param suiteLevel
     */
    public void setSuiteLevel(Integer suiteLevel) {
        this.suiteLevel = suiteLevel;
    }


    /**
    * get 自定义加密套件
    *
    * @return
    */
    public List<String> getUserSuiteLevel() {
        return userSuiteLevel;
    }

    /**
    * set 自定义加密套件
    *
    * @param userSuiteLevel
    */
    public void setUserSuiteLevel(List<String> userSuiteLevel) {
        this.userSuiteLevel = userSuiteLevel;
    }


    /**
     * get 请求头是否支持下划线，0-否，1-是。缺省为0
     *
     * @return
     */
    public Integer getEnableUnderscores() {
        return enableUnderscores;
    }

    /**
     * set 请求头是否支持下划线，0-否，1-是。缺省为0
     *
     * @param enableUnderscores
     */
    public void setEnableUnderscores(Integer enableUnderscores) {
        this.enableUnderscores = enableUnderscores;
    }


    /**
     * get 禁用被动健康检查，缺省为0-否
     *
     * @return
     */
    public Integer getDisableHealthCheck() {
        return disableHealthCheck;
    }

    /**
     * set 禁用被动健康检查，缺省为0-否
     *
     * @param disableHealthCheck
     */
    public void setDisableHealthCheck(Integer disableHealthCheck) {
        this.disableHealthCheck = disableHealthCheck;
    }


    /**
     * get 连接超时时间，3-60s
     *
     * @return
     */
    public Integer getProxyConnectTimeout() {
        return proxyConnectTimeout;
    }

    /**
     * set 连接超时时间，3-60s
     *
     * @param proxyConnectTimeout
     */
    public void setProxyConnectTimeout(Integer proxyConnectTimeout) {
        this.proxyConnectTimeout = proxyConnectTimeout;
    }



    /**
     * set 实例id，代表要设置的WAF实例
     *
     * @param wafInstanceId
     */
    public AddDomain wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }


    /**
     * set 域名，单个
     *
     * @param domain
     */
    public AddDomain domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
    * set 域名数组
    *
    * @param domains
    */
    public AddDomain domains(List<String> domains) {
        this.domains = domains;
        return this;
    }


    /**
    * set 使用协议，eg:[&quot;http&quot;,&quot;https&quot;]
    *
    * @param protocols
    */
    public AddDomain protocols(List<String> protocols) {
        this.protocols = protocols;
        return this;
    }


    /**
    * set ssl协议，eg:[&quot;TLSv1&quot;,&quot;TLSv1.1&quot;,&quot;TLSv1.2&quot;,&quot;SSLv2&quot;,&quot;SSLv3&quot;,&quot;TLSv1.3&quot;]
    *
    * @param sslProtocols
    */
    public AddDomain sslProtocols(List<String> sslProtocols) {
        this.sslProtocols = sslProtocols;
        return this;
    }


    /**
     * set 负载均衡算法，eg:&quot;rr&quot;，&quot;ip_hash&quot;,&quot;weight_rr&quot;
     *
     * @param lbType
     */
    public AddDomain lbType(String lbType) {
        this.lbType = lbType;
        return this;
    }


    /**
     * set 回源配置
     *
     * @param rsConfig
     */
    public AddDomain rsConfig(RsConfig rsConfig) {
        this.rsConfig = rsConfig;
        return this;
    }


    /**
     * set 是否使用前置代理，0为未使用，1为使用
     *
     * @param pureClient
     */
    public AddDomain pureClient(Integer pureClient) {
        this.pureClient = pureClient;
        return this;
    }


    /**
     * set 1为跳转 0为不跳转
     *
     * @param httpsRedirect
     */
    public AddDomain httpsRedirect(Integer httpsRedirect) {
        this.httpsRedirect = httpsRedirect;
        return this;
    }


    /**
     * set 用户服务器是否只能http回源，1为是，0为否
     *
     * @param rsOnlySupportHttp
     */
    public AddDomain rsOnlySupportHttp(Integer rsOnlySupportHttp) {
        this.rsOnlySupportHttp = rsOnlySupportHttp;
        return this;
    }


    /**
     * set 是否支持国密证书
     *
     * @param gmCertSupport
     */
    public AddDomain gmCertSupport(Integer gmCertSupport) {
        this.gmCertSupport = gmCertSupport;
        return this;
    }


    /**
     * set Waf侧支持http版本，不传时默认值为http1.1,传&quot;http2&quot;为http2
     *
     * @param httpVersion
     */
    public AddDomain httpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
        return this;
    }


    /**
     * set 回源是否支持长链接，0为否
     *
     * @param enableKeepalive
     */
    public AddDomain enableKeepalive(Integer enableKeepalive) {
        this.enableKeepalive = enableKeepalive;
        return this;
    }


    /**
     * set 加密套件等级，0表示默认为中级，1表示高级，2表示低级, 3表示自定义
     *
     * @param suiteLevel
     */
    public AddDomain suiteLevel(Integer suiteLevel) {
        this.suiteLevel = suiteLevel;
        return this;
    }


    /**
    * set 自定义加密套件
    *
    * @param userSuiteLevel
    */
    public AddDomain userSuiteLevel(List<String> userSuiteLevel) {
        this.userSuiteLevel = userSuiteLevel;
        return this;
    }


    /**
     * set 请求头是否支持下划线，0-否，1-是。缺省为0
     *
     * @param enableUnderscores
     */
    public AddDomain enableUnderscores(Integer enableUnderscores) {
        this.enableUnderscores = enableUnderscores;
        return this;
    }


    /**
     * set 禁用被动健康检查，缺省为0-否
     *
     * @param disableHealthCheck
     */
    public AddDomain disableHealthCheck(Integer disableHealthCheck) {
        this.disableHealthCheck = disableHealthCheck;
        return this;
    }


    /**
     * set 连接超时时间，3-60s
     *
     * @param proxyConnectTimeout
     */
    public AddDomain proxyConnectTimeout(Integer proxyConnectTimeout) {
        this.proxyConnectTimeout = proxyConnectTimeout;
        return this;
    }



    /**
     * add item to 域名数组
     *
     * @param domain
     */
    public void addDomain(String domain) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domain);
    }

    /**
     * add item to 使用协议，eg:[&quot;http&quot;,&quot;https&quot;]
     *
     * @param protocol
     */
    public void addProtocol(String protocol) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        this.protocols.add(protocol);
    }

    /**
     * add item to ssl协议，eg:[&quot;TLSv1&quot;,&quot;TLSv1.1&quot;,&quot;TLSv1.2&quot;,&quot;SSLv2&quot;,&quot;SSLv3&quot;,&quot;TLSv1.3&quot;]
     *
     * @param sslProtocol
     */
    public void addSslProtocol(String sslProtocol) {
        if (this.sslProtocols == null) {
            this.sslProtocols = new ArrayList<>();
        }
        this.sslProtocols.add(sslProtocol);
    }

    /**
     * add item to 自定义加密套件
     *
     * @param userSuiteLevel
     */
    public void addUserSuiteLevel(String userSuiteLevel) {
        if (this.userSuiteLevel == null) {
            this.userSuiteLevel = new ArrayList<>();
        }
        this.userSuiteLevel.add(userSuiteLevel);
    }
}