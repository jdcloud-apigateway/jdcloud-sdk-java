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

package com.jdcloud.sdk.service.jdccs.model;


/**
 * 流量采样数据
 */
public class TrafficSamplingData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 源IP
     */
    private String srcIp;

    /**
     * 目的IP
     */
    private String dstIp;

    /**
     * 源端口
     */
    private Integer srcPort;

    /**
     * 目的端口
     */
    private Integer dstPort;

    /**
     * 采样包长度
     */
    private Integer sampleDataLength;

    /**
     * 采样比
     */
    private Integer samplingInterval;

    /**
     * 协议
     */
    private String protocolName;

    /**
     * 时间戳
     */
    private Integer timestamp;

    /**
     * 唯一ID标识
     */
    private String uniqueId;

    /**
     * 运营商类型 移动:CM 联通:CU 电信:CT
     */
    private String operatorType;



    /**
     * get 源IP
     *
     * @return
     */
    public String getSrcIp() {
        return srcIp;
    }

    /**
     * set 源IP
     *
     * @param srcIp
     */
    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }


    /**
     * get 目的IP
     *
     * @return
     */
    public String getDstIp() {
        return dstIp;
    }

    /**
     * set 目的IP
     *
     * @param dstIp
     */
    public void setDstIp(String dstIp) {
        this.dstIp = dstIp;
    }


    /**
     * get 源端口
     *
     * @return
     */
    public Integer getSrcPort() {
        return srcPort;
    }

    /**
     * set 源端口
     *
     * @param srcPort
     */
    public void setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
    }


    /**
     * get 目的端口
     *
     * @return
     */
    public Integer getDstPort() {
        return dstPort;
    }

    /**
     * set 目的端口
     *
     * @param dstPort
     */
    public void setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
    }


    /**
     * get 采样包长度
     *
     * @return
     */
    public Integer getSampleDataLength() {
        return sampleDataLength;
    }

    /**
     * set 采样包长度
     *
     * @param sampleDataLength
     */
    public void setSampleDataLength(Integer sampleDataLength) {
        this.sampleDataLength = sampleDataLength;
    }


    /**
     * get 采样比
     *
     * @return
     */
    public Integer getSamplingInterval() {
        return samplingInterval;
    }

    /**
     * set 采样比
     *
     * @param samplingInterval
     */
    public void setSamplingInterval(Integer samplingInterval) {
        this.samplingInterval = samplingInterval;
    }


    /**
     * get 协议
     *
     * @return
     */
    public String getProtocolName() {
        return protocolName;
    }

    /**
     * set 协议
     *
     * @param protocolName
     */
    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }


    /**
     * get 时间戳
     *
     * @return
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * set 时间戳
     *
     * @param timestamp
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * get 唯一ID标识
     *
     * @return
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * set 唯一ID标识
     *
     * @param uniqueId
     */
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }


    /**
     * get 运营商类型 移动:CM 联通:CU 电信:CT
     *
     * @return
     */
    public String getOperatorType() {
        return operatorType;
    }

    /**
     * set 运营商类型 移动:CM 联通:CU 电信:CT
     *
     * @param operatorType
     */
    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }



    /**
     * set 源IP
     *
     * @param srcIp
     */
    public TrafficSamplingData srcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }


    /**
     * set 目的IP
     *
     * @param dstIp
     */
    public TrafficSamplingData dstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }


    /**
     * set 源端口
     *
     * @param srcPort
     */
    public TrafficSamplingData srcPort(Integer srcPort) {
        this.srcPort = srcPort;
        return this;
    }


    /**
     * set 目的端口
     *
     * @param dstPort
     */
    public TrafficSamplingData dstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }


    /**
     * set 采样包长度
     *
     * @param sampleDataLength
     */
    public TrafficSamplingData sampleDataLength(Integer sampleDataLength) {
        this.sampleDataLength = sampleDataLength;
        return this;
    }


    /**
     * set 采样比
     *
     * @param samplingInterval
     */
    public TrafficSamplingData samplingInterval(Integer samplingInterval) {
        this.samplingInterval = samplingInterval;
        return this;
    }


    /**
     * set 协议
     *
     * @param protocolName
     */
    public TrafficSamplingData protocolName(String protocolName) {
        this.protocolName = protocolName;
        return this;
    }


    /**
     * set 时间戳
     *
     * @param timestamp
     */
    public TrafficSamplingData timestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }


    /**
     * set 唯一ID标识
     *
     * @param uniqueId
     */
    public TrafficSamplingData uniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }


    /**
     * set 运营商类型 移动:CM 联通:CU 电信:CT
     *
     * @param operatorType
     */
    public TrafficSamplingData operatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }


}