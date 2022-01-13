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


/**
 * ipResource
 */
public class IpResource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公网 IP 所在区域
     */
    private String region;

    /**
     * 公网 IP 类型或绑定资源类型. 
&lt;br&gt;- 0: 未知类型
&lt;br&gt;- 1: 弹性公网 IP(IP 为弹性公网 IP, 绑定资源类型未知)
&lt;br&gt;- 10: 弹性公网 IP(IP 为弹性公网 IP, 但未绑定资源)
&lt;br&gt;- 11: 云主机
&lt;br&gt;- 12: 负载均衡
&lt;br&gt;- 13: 原生容器实例
&lt;br&gt;- 14: 原生容器 Pod
&lt;br&gt;- 2: 云物理服务器公网 IP
&lt;br&gt;- 3: Web应用防火墙 IP
&lt;br&gt;- 4: 托管区公网 IP

     */
    private Integer resourceType;

    /**
     * 公网 IP 地址
     */
    private String ip;

    /**
     * 带宽上限, 单位 Mbps
     */
    private Integer bandwidth;

    /**
     * 请求流量清洗触发值, 单位 bps/s
     */
    private Long cleanThresholdBps;

    /**
     * 报文请求清洗触发值, 单位 pps/s
     */
    private Long cleanThresholdPps;

    /**
     * 黑洞阈值
     */
    private Long balckHoleThreshold;

    /**
     * 绑定防护包 ID, 为空字符时表示未绑定防护包
     */
    private String instanceId;

    /**
     * 绑定防护包名称, 为空字符串时表示未绑定防护包
     */
    private String instanceName;

    /**
     * 安全状态. &lt;br&gt;- 0: 安全 &lt;br&gt;- 1: 清洗 &lt;br&gt;- 2: 黑洞
     */
    private Integer safeStatus;


    /**
     * get 公网 IP 所在区域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 公网 IP 所在区域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 公网 IP 类型或绑定资源类型. 
&lt;br&gt;- 0: 未知类型
&lt;br&gt;- 1: 弹性公网 IP(IP 为弹性公网 IP, 绑定资源类型未知)
&lt;br&gt;- 10: 弹性公网 IP(IP 为弹性公网 IP, 但未绑定资源)
&lt;br&gt;- 11: 云主机
&lt;br&gt;- 12: 负载均衡
&lt;br&gt;- 13: 原生容器实例
&lt;br&gt;- 14: 原生容器 Pod
&lt;br&gt;- 2: 云物理服务器公网 IP
&lt;br&gt;- 3: Web应用防火墙 IP
&lt;br&gt;- 4: 托管区公网 IP

     *
     * @return
     */
    public Integer getResourceType() {
        return resourceType;
    }

    /**
     * set 公网 IP 类型或绑定资源类型. 
&lt;br&gt;- 0: 未知类型
&lt;br&gt;- 1: 弹性公网 IP(IP 为弹性公网 IP, 绑定资源类型未知)
&lt;br&gt;- 10: 弹性公网 IP(IP 为弹性公网 IP, 但未绑定资源)
&lt;br&gt;- 11: 云主机
&lt;br&gt;- 12: 负载均衡
&lt;br&gt;- 13: 原生容器实例
&lt;br&gt;- 14: 原生容器 Pod
&lt;br&gt;- 2: 云物理服务器公网 IP
&lt;br&gt;- 3: Web应用防火墙 IP
&lt;br&gt;- 4: 托管区公网 IP

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
    public Integer getBandwidth() {
        return bandwidth;
    }

    /**
     * set 带宽上限, 单位 Mbps
     *
     * @param bandwidth
     */
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * get 请求流量清洗触发值, 单位 bps/s
     *
     * @return
     */
    public Long getCleanThresholdBps() {
        return cleanThresholdBps;
    }

    /**
     * set 请求流量清洗触发值, 单位 bps/s
     *
     * @param cleanThresholdBps
     */
    public void setCleanThresholdBps(Long cleanThresholdBps) {
        this.cleanThresholdBps = cleanThresholdBps;
    }

    /**
     * get 报文请求清洗触发值, 单位 pps/s
     *
     * @return
     */
    public Long getCleanThresholdPps() {
        return cleanThresholdPps;
    }

    /**
     * set 报文请求清洗触发值, 单位 pps/s
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
    public Long getBalckHoleThreshold() {
        return balckHoleThreshold;
    }

    /**
     * set 黑洞阈值
     *
     * @param balckHoleThreshold
     */
    public void setBalckHoleThreshold(Long balckHoleThreshold) {
        this.balckHoleThreshold = balckHoleThreshold;
    }

    /**
     * get 绑定防护包 ID, 为空字符时表示未绑定防护包
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 绑定防护包 ID, 为空字符时表示未绑定防护包
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
     * get 安全状态. &lt;br&gt;- 0: 安全 &lt;br&gt;- 1: 清洗 &lt;br&gt;- 2: 黑洞
     *
     * @return
     */
    public Integer getSafeStatus() {
        return safeStatus;
    }

    /**
     * set 安全状态. &lt;br&gt;- 0: 安全 &lt;br&gt;- 1: 清洗 &lt;br&gt;- 2: 黑洞
     *
     * @param safeStatus
     */
    public void setSafeStatus(Integer safeStatus) {
        this.safeStatus = safeStatus;
    }


    /**
     * set 公网 IP 所在区域
     *
     * @param region
     */
    public IpResource region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 公网 IP 类型或绑定资源类型. 
&lt;br&gt;- 0: 未知类型
&lt;br&gt;- 1: 弹性公网 IP(IP 为弹性公网 IP, 绑定资源类型未知)
&lt;br&gt;- 10: 弹性公网 IP(IP 为弹性公网 IP, 但未绑定资源)
&lt;br&gt;- 11: 云主机
&lt;br&gt;- 12: 负载均衡
&lt;br&gt;- 13: 原生容器实例
&lt;br&gt;- 14: 原生容器 Pod
&lt;br&gt;- 2: 云物理服务器公网 IP
&lt;br&gt;- 3: Web应用防火墙 IP
&lt;br&gt;- 4: 托管区公网 IP

     *
     * @param resourceType
     */
    public IpResource resourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set 公网 IP 地址
     *
     * @param ip
     */
    public IpResource ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 带宽上限, 单位 Mbps
     *
     * @param bandwidth
     */
    public IpResource bandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set 请求流量清洗触发值, 单位 bps/s
     *
     * @param cleanThresholdBps
     */
    public IpResource cleanThresholdBps(Long cleanThresholdBps) {
        this.cleanThresholdBps = cleanThresholdBps;
        return this;
    }

    /**
     * set 报文请求清洗触发值, 单位 pps/s
     *
     * @param cleanThresholdPps
     */
    public IpResource cleanThresholdPps(Long cleanThresholdPps) {
        this.cleanThresholdPps = cleanThresholdPps;
        return this;
    }

    /**
     * set 黑洞阈值
     *
     * @param balckHoleThreshold
     */
    public IpResource balckHoleThreshold(Long balckHoleThreshold) {
        this.balckHoleThreshold = balckHoleThreshold;
        return this;
    }

    /**
     * set 绑定防护包 ID, 为空字符时表示未绑定防护包
     *
     * @param instanceId
     */
    public IpResource instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 绑定防护包名称, 为空字符串时表示未绑定防护包
     *
     * @param instanceName
     */
    public IpResource instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 安全状态. &lt;br&gt;- 0: 安全 &lt;br&gt;- 1: 清洗 &lt;br&gt;- 2: 黑洞
     *
     * @param safeStatus
     */
    public IpResource safeStatus(Integer safeStatus) {
        this.safeStatus = safeStatus;
        return this;
    }


}