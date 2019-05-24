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

import java.util.List;
import java.util.ArrayList;

/**
 * attackLog
 */
public class AttackLog  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公网 IP 地址
     */
    private String ip;

    /**
     * 公网 IP 类型或绑定资源类型:
  0: 未知类型,
  1: 弹性公网 IP(IP 为弹性公网 IP, 绑定资源类型未知),
  10: 弹性公网 IP(IP 为弹性公网 IP, 但未绑定资源),
  11: 云主机,
  12: 负载均衡,
  13: 原生容器实例,
  14: 原生容器 Pod,
  2: 云物理服务器,

     */
    private Integer resourceType;

    /**
     * 攻击记录 ID
     */
    private String attackLogId;

    /**
     * 攻击开始时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     */
    private String startTime;

    /**
     * 攻击结束时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     */
    private String endTime;

    /**
     * 触发原因:
0: 未知,
1: 四层,
2: 七层,
3: 四层和七层

     */
    private Integer cause;

    /**
     * 状态, 0: 清洗完成, 1: 清洗中, 2: 黑洞中
     */
    private Integer status;

    /**
     * 是否黑洞
     */
    private Boolean blackHole;

    /**
     * 攻击流量峰值
     */
    private Number peak;

    /**
     * 攻击流量峰值单位
     */
    private String unit;

    /**
     * 攻击类型
     */
    private List<String> attackType;


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
     * get 公网 IP 类型或绑定资源类型:
  0: 未知类型,
  1: 弹性公网 IP(IP 为弹性公网 IP, 绑定资源类型未知),
  10: 弹性公网 IP(IP 为弹性公网 IP, 但未绑定资源),
  11: 云主机,
  12: 负载均衡,
  13: 原生容器实例,
  14: 原生容器 Pod,
  2: 云物理服务器,

     *
     * @return
     */
    public Integer getResourceType() {
        return resourceType;
    }

    /**
     * set 公网 IP 类型或绑定资源类型:
  0: 未知类型,
  1: 弹性公网 IP(IP 为弹性公网 IP, 绑定资源类型未知),
  10: 弹性公网 IP(IP 为弹性公网 IP, 但未绑定资源),
  11: 云主机,
  12: 负载均衡,
  13: 原生容器实例,
  14: 原生容器 Pod,
  2: 云物理服务器,

     *
     * @param resourceType
     */
    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * get 攻击记录 ID
     *
     * @return
     */
    public String getAttackLogId() {
        return attackLogId;
    }

    /**
     * set 攻击记录 ID
     *
     * @param attackLogId
     */
    public void setAttackLogId(String attackLogId) {
        this.attackLogId = attackLogId;
    }

    /**
     * get 攻击开始时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 攻击开始时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 攻击结束时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 攻击结束时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 触发原因:
0: 未知,
1: 四层,
2: 七层,
3: 四层和七层

     *
     * @return
     */
    public Integer getCause() {
        return cause;
    }

    /**
     * set 触发原因:
0: 未知,
1: 四层,
2: 七层,
3: 四层和七层

     *
     * @param cause
     */
    public void setCause(Integer cause) {
        this.cause = cause;
    }

    /**
     * get 状态, 0: 清洗完成, 1: 清洗中, 2: 黑洞中
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态, 0: 清洗完成, 1: 清洗中, 2: 黑洞中
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 是否黑洞
     *
     * @return
     */
    public Boolean getBlackHole() {
        return blackHole;
    }

    /**
     * set 是否黑洞
     *
     * @param blackHole
     */
    public void setBlackHole(Boolean blackHole) {
        this.blackHole = blackHole;
    }

    /**
     * get 攻击流量峰值
     *
     * @return
     */
    public Number getPeak() {
        return peak;
    }

    /**
     * set 攻击流量峰值
     *
     * @param peak
     */
    public void setPeak(Number peak) {
        this.peak = peak;
    }

    /**
     * get 攻击流量峰值单位
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set 攻击流量峰值单位
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * get 攻击类型
     *
     * @return
     */
    public List<String> getAttackType() {
        return attackType;
    }

    /**
     * set 攻击类型
     *
     * @param attackType
     */
    public void setAttackType(List<String> attackType) {
        this.attackType = attackType;
    }


    /**
     * set 公网 IP 地址
     *
     * @param ip
     */
    public AttackLog ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 公网 IP 类型或绑定资源类型:
  0: 未知类型,
  1: 弹性公网 IP(IP 为弹性公网 IP, 绑定资源类型未知),
  10: 弹性公网 IP(IP 为弹性公网 IP, 但未绑定资源),
  11: 云主机,
  12: 负载均衡,
  13: 原生容器实例,
  14: 原生容器 Pod,
  2: 云物理服务器,

     *
     * @param resourceType
     */
    public AttackLog resourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set 攻击记录 ID
     *
     * @param attackLogId
     */
    public AttackLog attackLogId(String attackLogId) {
        this.attackLogId = attackLogId;
        return this;
    }

    /**
     * set 攻击开始时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param startTime
     */
    public AttackLog startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 攻击结束时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param endTime
     */
    public AttackLog endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 触发原因:
0: 未知,
1: 四层,
2: 七层,
3: 四层和七层

     *
     * @param cause
     */
    public AttackLog cause(Integer cause) {
        this.cause = cause;
        return this;
    }

    /**
     * set 状态, 0: 清洗完成, 1: 清洗中, 2: 黑洞中
     *
     * @param status
     */
    public AttackLog status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 是否黑洞
     *
     * @param blackHole
     */
    public AttackLog blackHole(Boolean blackHole) {
        this.blackHole = blackHole;
        return this;
    }

    /**
     * set 攻击流量峰值
     *
     * @param peak
     */
    public AttackLog peak(Number peak) {
        this.peak = peak;
        return this;
    }

    /**
     * set 攻击流量峰值单位
     *
     * @param unit
     */
    public AttackLog unit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * set 攻击类型
     *
     * @param attackType
     */
    public AttackLog attackType(List<String> attackType) {
        this.attackType = attackType;
        return this;
    }


    /**
     * add item to 攻击类型
     *
     * @param attackType
     */
    public void addAttackType(String attackType) {
        if (this.attackType == null) {
            this.attackType = new ArrayList<>();
        }
        this.attackType.add(attackType);
    }

}