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
 * Domain
 * Domain API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import com.jdcloud.sdk.service.waf.model.AclConf;
import com.jdcloud.sdk.service.waf.model.EnableConf;
import com.jdcloud.sdk.service.waf.model.CcConf;
import com.jdcloud.sdk.service.waf.model.DenyConf;
import com.jdcloud.sdk.service.waf.model.IntSemConf;
import com.jdcloud.sdk.service.waf.model.IpbanConf;
import com.jdcloud.sdk.service.waf.model.RatelimitConf;
import com.jdcloud.sdk.service.waf.model.UserDefPageConf;
import com.jdcloud.sdk.service.waf.model.WafConf;
import com.jdcloud.sdk.service.waf.model.WebUserdefConf;
import com.jdcloud.sdk.service.waf.model.SkipConf;
import com.jdcloud.sdk.service.waf.model.FilterHeaderConf;
import com.jdcloud.sdk.service.waf.model.FilterSenseConf;
import com.jdcloud.sdk.service.waf.model.StatusConf;
import com.jdcloud.sdk.service.waf.model.UriRewriteConf;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取域名防护配置
 */
public class GetDomainAntiConfigResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名
     */
    private String domain;

    /**
     * waf状态 1表示关闭waf
     */
    private Integer disableWaf;

    /**
     * 网站waf防护配置
     */
    private AclConf aclConf;

    /**
     * 网站防爬虫防护配置
     */
    private EnableConf antispiderConf;

    /**
     * 网站cc防护配置
     */
    private CcConf ccConf;

    /**
     * 网站黑名单防护配置
     */
    private DenyConf denyConf;

    /**
     * 网站智能语义引擎防护配置
     */
    private IntSemConf intSemConf;

    /**
     * 网站恶意ip防护配置
     */
    private IpbanConf ipbanConf;

    /**
     * 网站限速规则防护配置
     */
    private RatelimitConf ratelimitConf;

    /**
     * 网站威胁情报防护配置
     */
    private EnableConf threatinfoConf;

    /**
     * 网站自定义页面配置
     */
    private UserDefPageConf userDefPageConf;

    /**
     * 网站waf防护配置
     */
    private WafConf wafConf;

    /**
     * 网站web自定义规则防护配置
     */
    private WebUserdefConf webUserdefConf;

    /**
     * 网站防篡改防护配置
     */
    private EnableConf webcacheConf;

    /**
     * 网站白名单防护配置
     */
    private SkipConf skipConf;

    /**
     * 网站请求头管理防护配置
     */
    private FilterHeaderConf filterHeaderConf;

    /**
     * 网站敏感信息防护配置
     */
    private FilterSenseConf filterSenseConf;

    /**
     * 状态码修改配置
     */
    private StatusConf statusConf;

    /**
     * 网站uri重写规则配置
     */
    private UriRewriteConf uriRewriteConf;

    /**
     * proxy缓存配置
     */
    private EnableConf proxycacheConf;

    /**
     * risk配置
     */
    private EnableConf riskConf;


    /**
     * get 域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get waf状态 1表示关闭waf
     *
     * @return
     */
    public Integer getDisableWaf() {
        return disableWaf;
    }

    /**
     * set waf状态 1表示关闭waf
     *
     * @param disableWaf
     */
    public void setDisableWaf(Integer disableWaf) {
        this.disableWaf = disableWaf;
    }

    /**
     * get 网站waf防护配置
     *
     * @return
     */
    public AclConf getAclConf() {
        return aclConf;
    }

    /**
     * set 网站waf防护配置
     *
     * @param aclConf
     */
    public void setAclConf(AclConf aclConf) {
        this.aclConf = aclConf;
    }

    /**
     * get 网站防爬虫防护配置
     *
     * @return
     */
    public EnableConf getAntispiderConf() {
        return antispiderConf;
    }

    /**
     * set 网站防爬虫防护配置
     *
     * @param antispiderConf
     */
    public void setAntispiderConf(EnableConf antispiderConf) {
        this.antispiderConf = antispiderConf;
    }

    /**
     * get 网站cc防护配置
     *
     * @return
     */
    public CcConf getCcConf() {
        return ccConf;
    }

    /**
     * set 网站cc防护配置
     *
     * @param ccConf
     */
    public void setCcConf(CcConf ccConf) {
        this.ccConf = ccConf;
    }

    /**
     * get 网站黑名单防护配置
     *
     * @return
     */
    public DenyConf getDenyConf() {
        return denyConf;
    }

    /**
     * set 网站黑名单防护配置
     *
     * @param denyConf
     */
    public void setDenyConf(DenyConf denyConf) {
        this.denyConf = denyConf;
    }

    /**
     * get 网站智能语义引擎防护配置
     *
     * @return
     */
    public IntSemConf getIntSemConf() {
        return intSemConf;
    }

    /**
     * set 网站智能语义引擎防护配置
     *
     * @param intSemConf
     */
    public void setIntSemConf(IntSemConf intSemConf) {
        this.intSemConf = intSemConf;
    }

    /**
     * get 网站恶意ip防护配置
     *
     * @return
     */
    public IpbanConf getIpbanConf() {
        return ipbanConf;
    }

    /**
     * set 网站恶意ip防护配置
     *
     * @param ipbanConf
     */
    public void setIpbanConf(IpbanConf ipbanConf) {
        this.ipbanConf = ipbanConf;
    }

    /**
     * get 网站限速规则防护配置
     *
     * @return
     */
    public RatelimitConf getRatelimitConf() {
        return ratelimitConf;
    }

    /**
     * set 网站限速规则防护配置
     *
     * @param ratelimitConf
     */
    public void setRatelimitConf(RatelimitConf ratelimitConf) {
        this.ratelimitConf = ratelimitConf;
    }

    /**
     * get 网站威胁情报防护配置
     *
     * @return
     */
    public EnableConf getThreatinfoConf() {
        return threatinfoConf;
    }

    /**
     * set 网站威胁情报防护配置
     *
     * @param threatinfoConf
     */
    public void setThreatinfoConf(EnableConf threatinfoConf) {
        this.threatinfoConf = threatinfoConf;
    }

    /**
     * get 网站自定义页面配置
     *
     * @return
     */
    public UserDefPageConf getUserDefPageConf() {
        return userDefPageConf;
    }

    /**
     * set 网站自定义页面配置
     *
     * @param userDefPageConf
     */
    public void setUserDefPageConf(UserDefPageConf userDefPageConf) {
        this.userDefPageConf = userDefPageConf;
    }

    /**
     * get 网站waf防护配置
     *
     * @return
     */
    public WafConf getWafConf() {
        return wafConf;
    }

    /**
     * set 网站waf防护配置
     *
     * @param wafConf
     */
    public void setWafConf(WafConf wafConf) {
        this.wafConf = wafConf;
    }

    /**
     * get 网站web自定义规则防护配置
     *
     * @return
     */
    public WebUserdefConf getWebUserdefConf() {
        return webUserdefConf;
    }

    /**
     * set 网站web自定义规则防护配置
     *
     * @param webUserdefConf
     */
    public void setWebUserdefConf(WebUserdefConf webUserdefConf) {
        this.webUserdefConf = webUserdefConf;
    }

    /**
     * get 网站防篡改防护配置
     *
     * @return
     */
    public EnableConf getWebcacheConf() {
        return webcacheConf;
    }

    /**
     * set 网站防篡改防护配置
     *
     * @param webcacheConf
     */
    public void setWebcacheConf(EnableConf webcacheConf) {
        this.webcacheConf = webcacheConf;
    }

    /**
     * get 网站白名单防护配置
     *
     * @return
     */
    public SkipConf getSkipConf() {
        return skipConf;
    }

    /**
     * set 网站白名单防护配置
     *
     * @param skipConf
     */
    public void setSkipConf(SkipConf skipConf) {
        this.skipConf = skipConf;
    }

    /**
     * get 网站请求头管理防护配置
     *
     * @return
     */
    public FilterHeaderConf getFilterHeaderConf() {
        return filterHeaderConf;
    }

    /**
     * set 网站请求头管理防护配置
     *
     * @param filterHeaderConf
     */
    public void setFilterHeaderConf(FilterHeaderConf filterHeaderConf) {
        this.filterHeaderConf = filterHeaderConf;
    }

    /**
     * get 网站敏感信息防护配置
     *
     * @return
     */
    public FilterSenseConf getFilterSenseConf() {
        return filterSenseConf;
    }

    /**
     * set 网站敏感信息防护配置
     *
     * @param filterSenseConf
     */
    public void setFilterSenseConf(FilterSenseConf filterSenseConf) {
        this.filterSenseConf = filterSenseConf;
    }

    /**
     * get 状态码修改配置
     *
     * @return
     */
    public StatusConf getStatusConf() {
        return statusConf;
    }

    /**
     * set 状态码修改配置
     *
     * @param statusConf
     */
    public void setStatusConf(StatusConf statusConf) {
        this.statusConf = statusConf;
    }

    /**
     * get 网站uri重写规则配置
     *
     * @return
     */
    public UriRewriteConf getUriRewriteConf() {
        return uriRewriteConf;
    }

    /**
     * set 网站uri重写规则配置
     *
     * @param uriRewriteConf
     */
    public void setUriRewriteConf(UriRewriteConf uriRewriteConf) {
        this.uriRewriteConf = uriRewriteConf;
    }

    /**
     * get proxy缓存配置
     *
     * @return
     */
    public EnableConf getProxycacheConf() {
        return proxycacheConf;
    }

    /**
     * set proxy缓存配置
     *
     * @param proxycacheConf
     */
    public void setProxycacheConf(EnableConf proxycacheConf) {
        this.proxycacheConf = proxycacheConf;
    }

    /**
     * get risk配置
     *
     * @return
     */
    public EnableConf getRiskConf() {
        return riskConf;
    }

    /**
     * set risk配置
     *
     * @param riskConf
     */
    public void setRiskConf(EnableConf riskConf) {
        this.riskConf = riskConf;
    }


    /**
     * set 域名
     *
     * @param domain
     */
    public GetDomainAntiConfigResult domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set waf状态 1表示关闭waf
     *
     * @param disableWaf
     */
    public GetDomainAntiConfigResult disableWaf(Integer disableWaf) {
        this.disableWaf = disableWaf;
        return this;
    }

    /**
     * set 网站waf防护配置
     *
     * @param aclConf
     */
    public GetDomainAntiConfigResult aclConf(AclConf aclConf) {
        this.aclConf = aclConf;
        return this;
    }

    /**
     * set 网站防爬虫防护配置
     *
     * @param antispiderConf
     */
    public GetDomainAntiConfigResult antispiderConf(EnableConf antispiderConf) {
        this.antispiderConf = antispiderConf;
        return this;
    }

    /**
     * set 网站cc防护配置
     *
     * @param ccConf
     */
    public GetDomainAntiConfigResult ccConf(CcConf ccConf) {
        this.ccConf = ccConf;
        return this;
    }

    /**
     * set 网站黑名单防护配置
     *
     * @param denyConf
     */
    public GetDomainAntiConfigResult denyConf(DenyConf denyConf) {
        this.denyConf = denyConf;
        return this;
    }

    /**
     * set 网站智能语义引擎防护配置
     *
     * @param intSemConf
     */
    public GetDomainAntiConfigResult intSemConf(IntSemConf intSemConf) {
        this.intSemConf = intSemConf;
        return this;
    }

    /**
     * set 网站恶意ip防护配置
     *
     * @param ipbanConf
     */
    public GetDomainAntiConfigResult ipbanConf(IpbanConf ipbanConf) {
        this.ipbanConf = ipbanConf;
        return this;
    }

    /**
     * set 网站限速规则防护配置
     *
     * @param ratelimitConf
     */
    public GetDomainAntiConfigResult ratelimitConf(RatelimitConf ratelimitConf) {
        this.ratelimitConf = ratelimitConf;
        return this;
    }

    /**
     * set 网站威胁情报防护配置
     *
     * @param threatinfoConf
     */
    public GetDomainAntiConfigResult threatinfoConf(EnableConf threatinfoConf) {
        this.threatinfoConf = threatinfoConf;
        return this;
    }

    /**
     * set 网站自定义页面配置
     *
     * @param userDefPageConf
     */
    public GetDomainAntiConfigResult userDefPageConf(UserDefPageConf userDefPageConf) {
        this.userDefPageConf = userDefPageConf;
        return this;
    }

    /**
     * set 网站waf防护配置
     *
     * @param wafConf
     */
    public GetDomainAntiConfigResult wafConf(WafConf wafConf) {
        this.wafConf = wafConf;
        return this;
    }

    /**
     * set 网站web自定义规则防护配置
     *
     * @param webUserdefConf
     */
    public GetDomainAntiConfigResult webUserdefConf(WebUserdefConf webUserdefConf) {
        this.webUserdefConf = webUserdefConf;
        return this;
    }

    /**
     * set 网站防篡改防护配置
     *
     * @param webcacheConf
     */
    public GetDomainAntiConfigResult webcacheConf(EnableConf webcacheConf) {
        this.webcacheConf = webcacheConf;
        return this;
    }

    /**
     * set 网站白名单防护配置
     *
     * @param skipConf
     */
    public GetDomainAntiConfigResult skipConf(SkipConf skipConf) {
        this.skipConf = skipConf;
        return this;
    }

    /**
     * set 网站请求头管理防护配置
     *
     * @param filterHeaderConf
     */
    public GetDomainAntiConfigResult filterHeaderConf(FilterHeaderConf filterHeaderConf) {
        this.filterHeaderConf = filterHeaderConf;
        return this;
    }

    /**
     * set 网站敏感信息防护配置
     *
     * @param filterSenseConf
     */
    public GetDomainAntiConfigResult filterSenseConf(FilterSenseConf filterSenseConf) {
        this.filterSenseConf = filterSenseConf;
        return this;
    }

    /**
     * set 状态码修改配置
     *
     * @param statusConf
     */
    public GetDomainAntiConfigResult statusConf(StatusConf statusConf) {
        this.statusConf = statusConf;
        return this;
    }

    /**
     * set 网站uri重写规则配置
     *
     * @param uriRewriteConf
     */
    public GetDomainAntiConfigResult uriRewriteConf(UriRewriteConf uriRewriteConf) {
        this.uriRewriteConf = uriRewriteConf;
        return this;
    }

    /**
     * set proxy缓存配置
     *
     * @param proxycacheConf
     */
    public GetDomainAntiConfigResult proxycacheConf(EnableConf proxycacheConf) {
        this.proxycacheConf = proxycacheConf;
        return this;
    }

    /**
     * set risk配置
     *
     * @param riskConf
     */
    public GetDomainAntiConfigResult riskConf(EnableConf riskConf) {
        this.riskConf = riskConf;
        return this;
    }


}