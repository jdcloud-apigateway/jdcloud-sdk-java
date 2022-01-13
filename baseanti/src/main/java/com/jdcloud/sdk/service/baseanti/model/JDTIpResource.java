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

package com.jdcloud.sdk.service.baseanti.model;


/**
 * jDTIpResource
 */
public class JDTIpResource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公网 IP 所在区域编码
     */
    private String region;

    /**
     * 公网 IP 类型
&lt;br&gt;- 7: 京东科技公网 IP&quot;

     */
    private Integer resourceType;

    /**
     * 公网 IP 地址
     */
    private String ip;

    /**
     * 带宽上限, 单位 Mbps
     */
    private Long bandwidth;

    /**
     * 每秒请求流量
     */
    private Long cleanThresholdBps;

    /**
     * 每秒报文请求数
     */
    private Long cleanThresholdPps;

    /**
     * 黑洞阈值
     */
    private Long blackHoleThreshold;

    /**
     * 绑定防护包 ID, 为空字符串时表示未绑定防护包
     */
    private String instanceId;

    /**
     * 绑定防护包名称, 为空字符串时表示未绑定防护包
     */
    private String instanceName;

    /**
     * 套餐类型, 为 0 时未绑定防护包. &lt;br&gt;- 1: 独享 IP&lt;br&gt;- 2: 共享 IP
     */
    private Integer instanceType;

    /**
     * 安全状态. &lt;br&gt;- 0: 安全&lt;br&gt;- 1: 清洗&lt;br&gt;- 2: 黑洞
     */
    private Integer safeStatus;


    /**
     * get 公网 IP 所在区域编码
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 公网 IP 所在区域编码
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 公网 IP 类型
&lt;br&gt;- 7: 京东科技公网 IP&quot;

     *
     * @return
     */
    public Integer getResourceType() {
        return resourceType;
    }

    /**
     * set 公网 IP 类型
&lt;br&gt;- 7: 京东科技公网 IP&quot;

     *
     * @param resourceType
     */
    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * get 公网 IP 地址
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 公网 IP 地址
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get 带宽上限, 单位 Mbps
     *
     * @return
     */
    public Long getBandwidth() {
        return bandwidth;
    }

    /**
     * set 带宽上限, 单位 Mbps
     *
     * @param bandwidth
     */
    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * get 每秒请求流量
     *
     * @return
     */
    public Long getCleanThresholdBps() {
        return cleanThresholdBps;
    }

    /**
     * set 每秒请求流量
     *
     * @param cleanThresholdBps
     */
    public void setCleanThresholdBps(Long cleanThresholdBps) {
        this.cleanThresholdBps = cleanThresholdBps;
    }

    /**
     * get 每秒报文请求数
     *
     * @return
     */
    public Long getCleanThresholdPps() {
        return cleanThresholdPps;
    }

    /**
     * set 每秒报文请求数
     *
     * @param cleanThresholdPps
     */
    public void setCleanThresholdPps(Long cleanThresholdPps) {
        this.cleanThresholdPps = cleanThresholdPps;
    }

    /**
     * get 黑洞阈值
     *
     * @return
     */
    public Long getBlackHoleThreshold() {
        return blackHoleThreshold;
    }

    /**
     * set 黑洞阈值
     *
     * @param blackHoleThreshold
     */
    public void setBlackHoleThreshold(Long blackHoleThreshold) {
        this.blackHoleThreshold = blackHoleThreshold;
    }

    /**
     * get 绑定防护包 ID, 为空字符串时表示未绑定防护包
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 绑定防护包 ID, 为空字符串时表示未绑定防护包
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 绑定防护包名称, 为空字符串时表示未绑定防护包
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 绑定防护包名称, 为空字符串时表示未绑定防护包
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 套餐类型, 为 0 时未绑定防护包. &lt;br&gt;- 1: 独享 IP&lt;br&gt;- 2: 共享 IP
     *
     * @return
     */
    public Integer getInstanceType() {
        return instanceType;
    }

    /**
     * set 套餐类型, 为 0 时未绑定防护包. &lt;br&gt;- 1: 独享 IP&lt;br&gt;- 2: 共享 IP
     *
     * @param instanceType
     */
    public void setInstanceType(Integer instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 安全状态. &lt;br&gt;- 0: 安全&lt;br&gt;- 1: 清洗&lt;br&gt;- 2: 黑洞
     *
     * @return
     */
    public Integer getSafeStatus() {
        return safeStatus;
    }

    /**
     * set 安全状态. &lt;br&gt;- 0: 安全&lt;br&gt;- 1: 清洗&lt;br&gt;- 2: 黑洞
     *
     * @param safeStatus
     */
    public void setSafeStatus(Integer safeStatus) {
        this.safeStatus = safeStatus;
    }


    /**
     * set 公网 IP 所在区域编码
     *
     * @param region
     */
    public JDTIpResource region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 公网 IP 类型
&lt;br&gt;- 7: 京东科技公网 IP&quot;

     *
     * @param resourceType
     */
    public JDTIpResource resourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set 公网 IP 地址
     *
     * @param ip
     */
    public JDTIpResource ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 带宽上限, 单位 Mbps
     *
     * @param bandwidth
     */
    public JDTIpResource bandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set 每秒请求流量
     *
     * @param cleanThresholdBps
     */
    public JDTIpResource cleanThresholdBps(Long cleanThresholdBps) {
        this.cleanThresholdBps = cleanThresholdBps;
        return this;
    }

    /**
     * set 每秒报文请求数
     *
     * @param cleanThresholdPps
     */
    public JDTIpResource cleanThresholdPps(Long cleanThresholdPps) {
        this.cleanThresholdPps = cleanThresholdPps;
        return this;
    }

    /**
     * set 黑洞阈值
     *
     * @param blackHoleThreshold
     */
    public JDTIpResource blackHoleThreshold(Long blackHoleThreshold) {
        this.blackHoleThreshold = blackHoleThreshold;
        return this;
    }

    /**
     * set 绑定防护包 ID, 为空字符串时表示未绑定防护包
     *
     * @param instanceId
     */
    public JDTIpResource instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 绑定防护包名称, 为空字符串时表示未绑定防护包
     *
     * @param instanceName
     */
    public JDTIpResource instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 套餐类型, 为 0 时未绑定防护包. &lt;br&gt;- 1: 独享 IP&lt;br&gt;- 2: 共享 IP
     *
     * @param instanceType
     */
    public JDTIpResource instanceType(Integer instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 安全状态. &lt;br&gt;- 0: 安全&lt;br&gt;- 1: 清洗&lt;br&gt;- 2: 黑洞
     *
     * @param safeStatus
     */
    public JDTIpResource safeStatus(Integer safeStatus) {
        this.safeStatus = safeStatus;
        return this;
    }


}