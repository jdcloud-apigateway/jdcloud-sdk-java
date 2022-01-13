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

package com.jdcloud.sdk.service.antipro.model;

import java.util.List;
import java.util.ArrayList;

/**
 * protectionRuleSpec
 */
public class ProtectionRuleSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 被防护 IP, 缺省时修改防护包实例防护规则
     */
    private String ip;

    /**
     * 防护规则类型, 修改 ip 防护规则时必传, 0: 设置 ip 使用防护包规则, 1: 设置 IP 使用自定义规则
     */
    private Integer type;

    /**
     * 清洗触发值 bps, 修改实例防护规则或自定义 IP 防护规则时必传
     */
    private Long cleanThresholdBps;

    /**
     * 清洗触发值 pps, 修改实例防护规则或自定义 IP 防护规则时必传
     */
    private Long cleanThresholdPps;

    /**
     * 虚假源, 0: 关闭, 1: 开启, 修改实例防护规则或自定义 IP 防护规则时必传
     */
    private Integer spoofIpEnable;

    /**
     * 源新建连接限速, 0: 关闭, 1: 开启, 修改实例防护规则或自定义 IP 防护规则时必传
     */
    private Integer srcNewConnLimitEnable;

    /**
     * 源新建连接速率, 修改实例防护规则或自定义 IP 防护规则时必传
     */
    private Long srcNewConnLimitValue;

    /**
     * 目的新建连接, 0: 关闭, 1: 开启, 修改实例防护规则或自定义 IP 防护规则时必传
     */
    private Integer dstNewConnLimitEnable;

    /**
     * 目的新建连接速率, 修改实例防护规则或自定义 IP 防护规则时必传
     */
    private Long dstNewConnLimitValue;

    /**
     * 报文最小长度, 取值范围 [1, datagramRangeMax)
     */
    private Long datagramRangeMin;

    /**
     * 报文最大长度, 取值范围 (datagramRangeMin, 1518]
     */
    private Long datagramRangeMax;

    /**
     * geo 拦截地域编码列表. 查询 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-protection-package/api/describegeoareas&#39;&gt;describeGeoAreas&lt;/a&gt; 接口获取可设置的地域编码列表
     */
    private List<String> geoBlackList;

    /**
     * IP 黑名单列表
     */
    private List<String> ipBlackList;

    /**
     * IP 白名单列表
     */
    private List<String> ipWhiteList;


    /**
     * get 被防护 IP, 缺省时修改防护包实例防护规则
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 被防护 IP, 缺省时修改防护包实例防护规则
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get 防护规则类型, 修改 ip 防护规则时必传, 0: 设置 ip 使用防护包规则, 1: 设置 IP 使用自定义规则
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 防护规则类型, 修改 ip 防护规则时必传, 0: 设置 ip 使用防护包规则, 1: 设置 IP 使用自定义规则
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * get 清洗触发值 bps, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @return
     */
    public Long getCleanThresholdBps() {
        return cleanThresholdBps;
    }

    /**
     * set 清洗触发值 bps, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @param cleanThresholdBps
     */
    public void setCleanThresholdBps(Long cleanThresholdBps) {
        this.cleanThresholdBps = cleanThresholdBps;
    }

    /**
     * get 清洗触发值 pps, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @return
     */
    public Long getCleanThresholdPps() {
        return cleanThresholdPps;
    }

    /**
     * set 清洗触发值 pps, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @param cleanThresholdPps
     */
    public void setCleanThresholdPps(Long cleanThresholdPps) {
        this.cleanThresholdPps = cleanThresholdPps;
    }

    /**
     * get 虚假源, 0: 关闭, 1: 开启, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @return
     */
    public Integer getSpoofIpEnable() {
        return spoofIpEnable;
    }

    /**
     * set 虚假源, 0: 关闭, 1: 开启, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @param spoofIpEnable
     */
    public void setSpoofIpEnable(Integer spoofIpEnable) {
        this.spoofIpEnable = spoofIpEnable;
    }

    /**
     * get 源新建连接限速, 0: 关闭, 1: 开启, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @return
     */
    public Integer getSrcNewConnLimitEnable() {
        return srcNewConnLimitEnable;
    }

    /**
     * set 源新建连接限速, 0: 关闭, 1: 开启, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @param srcNewConnLimitEnable
     */
    public void setSrcNewConnLimitEnable(Integer srcNewConnLimitEnable) {
        this.srcNewConnLimitEnable = srcNewConnLimitEnable;
    }

    /**
     * get 源新建连接速率, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @return
     */
    public Long getSrcNewConnLimitValue() {
        return srcNewConnLimitValue;
    }

    /**
     * set 源新建连接速率, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @param srcNewConnLimitValue
     */
    public void setSrcNewConnLimitValue(Long srcNewConnLimitValue) {
        this.srcNewConnLimitValue = srcNewConnLimitValue;
    }

    /**
     * get 目的新建连接, 0: 关闭, 1: 开启, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @return
     */
    public Integer getDstNewConnLimitEnable() {
        return dstNewConnLimitEnable;
    }

    /**
     * set 目的新建连接, 0: 关闭, 1: 开启, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @param dstNewConnLimitEnable
     */
    public void setDstNewConnLimitEnable(Integer dstNewConnLimitEnable) {
        this.dstNewConnLimitEnable = dstNewConnLimitEnable;
    }

    /**
     * get 目的新建连接速率, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @return
     */
    public Long getDstNewConnLimitValue() {
        return dstNewConnLimitValue;
    }

    /**
     * set 目的新建连接速率, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @param dstNewConnLimitValue
     */
    public void setDstNewConnLimitValue(Long dstNewConnLimitValue) {
        this.dstNewConnLimitValue = dstNewConnLimitValue;
    }

    /**
     * get 报文最小长度, 取值范围 [1, datagramRangeMax)
     *
     * @return
     */
    public Long getDatagramRangeMin() {
        return datagramRangeMin;
    }

    /**
     * set 报文最小长度, 取值范围 [1, datagramRangeMax)
     *
     * @param datagramRangeMin
     */
    public void setDatagramRangeMin(Long datagramRangeMin) {
        this.datagramRangeMin = datagramRangeMin;
    }

    /**
     * get 报文最大长度, 取值范围 (datagramRangeMin, 1518]
     *
     * @return
     */
    public Long getDatagramRangeMax() {
        return datagramRangeMax;
    }

    /**
     * set 报文最大长度, 取值范围 (datagramRangeMin, 1518]
     *
     * @param datagramRangeMax
     */
    public void setDatagramRangeMax(Long datagramRangeMax) {
        this.datagramRangeMax = datagramRangeMax;
    }

    /**
     * get geo 拦截地域编码列表. 查询 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-protection-package/api/describegeoareas&#39;&gt;describeGeoAreas&lt;/a&gt; 接口获取可设置的地域编码列表
     *
     * @return
     */
    public List<String> getGeoBlackList() {
        return geoBlackList;
    }

    /**
     * set geo 拦截地域编码列表. 查询 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-protection-package/api/describegeoareas&#39;&gt;describeGeoAreas&lt;/a&gt; 接口获取可设置的地域编码列表
     *
     * @param geoBlackList
     */
    public void setGeoBlackList(List<String> geoBlackList) {
        this.geoBlackList = geoBlackList;
    }

    /**
     * get IP 黑名单列表
     *
     * @return
     */
    public List<String> getIpBlackList() {
        return ipBlackList;
    }

    /**
     * set IP 黑名单列表
     *
     * @param ipBlackList
     */
    public void setIpBlackList(List<String> ipBlackList) {
        this.ipBlackList = ipBlackList;
    }

    /**
     * get IP 白名单列表
     *
     * @return
     */
    public List<String> getIpWhiteList() {
        return ipWhiteList;
    }

    /**
     * set IP 白名单列表
     *
     * @param ipWhiteList
     */
    public void setIpWhiteList(List<String> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }


    /**
     * set 被防护 IP, 缺省时修改防护包实例防护规则
     *
     * @param ip
     */
    public ProtectionRuleSpec ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 防护规则类型, 修改 ip 防护规则时必传, 0: 设置 ip 使用防护包规则, 1: 设置 IP 使用自定义规则
     *
     * @param type
     */
    public ProtectionRuleSpec type(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * set 清洗触发值 bps, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @param cleanThresholdBps
     */
    public ProtectionRuleSpec cleanThresholdBps(Long cleanThresholdBps) {
        this.cleanThresholdBps = cleanThresholdBps;
        return this;
    }

    /**
     * set 清洗触发值 pps, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @param cleanThresholdPps
     */
    public ProtectionRuleSpec cleanThresholdPps(Long cleanThresholdPps) {
        this.cleanThresholdPps = cleanThresholdPps;
        return this;
    }

    /**
     * set 虚假源, 0: 关闭, 1: 开启, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @param spoofIpEnable
     */
    public ProtectionRuleSpec spoofIpEnable(Integer spoofIpEnable) {
        this.spoofIpEnable = spoofIpEnable;
        return this;
    }

    /**
     * set 源新建连接限速, 0: 关闭, 1: 开启, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @param srcNewConnLimitEnable
     */
    public ProtectionRuleSpec srcNewConnLimitEnable(Integer srcNewConnLimitEnable) {
        this.srcNewConnLimitEnable = srcNewConnLimitEnable;
        return this;
    }

    /**
     * set 源新建连接速率, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @param srcNewConnLimitValue
     */
    public ProtectionRuleSpec srcNewConnLimitValue(Long srcNewConnLimitValue) {
        this.srcNewConnLimitValue = srcNewConnLimitValue;
        return this;
    }

    /**
     * set 目的新建连接, 0: 关闭, 1: 开启, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @param dstNewConnLimitEnable
     */
    public ProtectionRuleSpec dstNewConnLimitEnable(Integer dstNewConnLimitEnable) {
        this.dstNewConnLimitEnable = dstNewConnLimitEnable;
        return this;
    }

    /**
     * set 目的新建连接速率, 修改实例防护规则或自定义 IP 防护规则时必传
     *
     * @param dstNewConnLimitValue
     */
    public ProtectionRuleSpec dstNewConnLimitValue(Long dstNewConnLimitValue) {
        this.dstNewConnLimitValue = dstNewConnLimitValue;
        return this;
    }

    /**
     * set 报文最小长度, 取值范围 [1, datagramRangeMax)
     *
     * @param datagramRangeMin
     */
    public ProtectionRuleSpec datagramRangeMin(Long datagramRangeMin) {
        this.datagramRangeMin = datagramRangeMin;
        return this;
    }

    /**
     * set 报文最大长度, 取值范围 (datagramRangeMin, 1518]
     *
     * @param datagramRangeMax
     */
    public ProtectionRuleSpec datagramRangeMax(Long datagramRangeMax) {
        this.datagramRangeMax = datagramRangeMax;
        return this;
    }

    /**
     * set geo 拦截地域编码列表. 查询 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-protection-package/api/describegeoareas&#39;&gt;describeGeoAreas&lt;/a&gt; 接口获取可设置的地域编码列表
     *
     * @param geoBlackList
     */
    public ProtectionRuleSpec geoBlackList(List<String> geoBlackList) {
        this.geoBlackList = geoBlackList;
        return this;
    }

    /**
     * set IP 黑名单列表
     *
     * @param ipBlackList
     */
    public ProtectionRuleSpec ipBlackList(List<String> ipBlackList) {
        this.ipBlackList = ipBlackList;
        return this;
    }

    /**
     * set IP 白名单列表
     *
     * @param ipWhiteList
     */
    public ProtectionRuleSpec ipWhiteList(List<String> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
        return this;
    }


    /**
     * add item to geo 拦截地域编码列表. 查询 &lt;a href&#x3D;&#39;http://docs.jdcloud.com/anti-ddos-protection-package/api/describegeoareas&#39;&gt;describeGeoAreas&lt;/a&gt; 接口获取可设置的地域编码列表
     *
     * @param geoBlackList
     */
    public void addGeoBlackList(String geoBlackList) {
        if (this.geoBlackList == null) {
            this.geoBlackList = new ArrayList<>();
        }
        this.geoBlackList.add(geoBlackList);
    }

    /**
     * add item to IP 黑名单列表
     *
     * @param ipBlackList
     */
    public void addIpBlackList(String ipBlackList) {
        if (this.ipBlackList == null) {
            this.ipBlackList = new ArrayList<>();
        }
        this.ipBlackList.add(ipBlackList);
    }

    /**
     * add item to IP 白名单列表
     *
     * @param ipWhiteList
     */
    public void addIpWhiteList(String ipWhiteList) {
        if (this.ipWhiteList == null) {
            this.ipWhiteList = new ArrayList<>();
        }
        this.ipWhiteList.add(ipWhiteList);
    }

}