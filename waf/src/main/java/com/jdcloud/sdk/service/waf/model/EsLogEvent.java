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


/**
 * esLogEvent
 */
public class EsLogEvent  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产生时间
     */
    private Integer accessTime;

    /**
     * 源ip
     */
    private String remoteAddr;

    /**
     * 客户端port
     */
    private String remotePort;

    /**
     * 域名
     */
    private String domain;

    /**
     * 来源地区
     */
    private String area;

    /**
     * 方法
     */
    private String method;

    /**
     * url
     */
    private String url;

    /**
     * 恶意负载
     */
    private String payLoad;

    /**
     * 响应信息
     */
    private String status;

    /**
     * 日志类型
     */
    private String logType;

    /**
     * 动作
     */
    private String action;

    /**
     * 请求ID
     */
    private String requestId;

    /**
     * 回源错误信息
     */
    private String upstreamErr;

    /**
     * 日志记录时间
     */
    private String timeLocal;

    /**
     * 本机域名
     */
    private String hostname;

    /**
     * 响应长度
     */
    private String bytesSent;

    /**
     * 请求长度
     */
    private String requestLength;

    /**
     * 客户端请求的域名
     */
    private String host;

    /**
     * jfe的server块监听IP
     */
    private String serverAddr;

    /**
     * jfe的server块监听port
     */
    private String serverPort;

    /**
     * 请求所连接的upstream名称
     */
    private String upstreamHttpName;

    /**
     * 请求所连接的upstream服务器IP
     */
    private String upstreamAddr;

    /**
     * 请求所连接的upstream服务器port
     */
    private String upstreamHttpPort;

    /**
     * 等待upstream建立连接的时间
     */
    private String upstreamConnectTime;

    /**
     * 接收upstream请求头的时间
     */
    private String upstreamHeaderTime;

    /**
     * 接收upstream响应头的时间
     */
    private String upstreamResponseTime;

    /**
     * 请求处理时间
     */
    private String requestTime;

    /**
     * 请求头的UA字段
     */
    private String httpUserAgent;

    /**
     * 攻击类型
     */
    private String antiReason;

    /**
     * 请求来源
     */
    private String httpReferer;

    /**
     * 请求协议
     */
    private String scheme;

    /**
     * uri
     */
    private String uri;

    /**
     * 断点续传响应分片位置
     */
    private String sentHttpContentRange;

    /**
     * 客户端IP
     */
    private String antiRemoteAddr;

    /**
     * 原响应码
     */
    private String antiStatus;

    /**
     * 命中规则请求原始请求报文
     */
    private String antiReqRaw;

    /**
     * 命中规则请求原始响应报文
     */
    private String antiRespRaw;

    /**
     * 来源地域信息
     */
    private String antiGeo;

    /**
     * 指纹ID
     */
    private String antiRiskFid;

    /**
     * 指纹采集详细信息
     */
    private String antiRiskRaw;


    /**
     * get 产生时间
     *
     * @return
     */
    public Integer getAccessTime() {
        return accessTime;
    }

    /**
     * set 产生时间
     *
     * @param accessTime
     */
    public void setAccessTime(Integer accessTime) {
        this.accessTime = accessTime;
    }

    /**
     * get 源ip
     *
     * @return
     */
    public String getRemoteAddr() {
        return remoteAddr;
    }

    /**
     * set 源ip
     *
     * @param remoteAddr
     */
    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    /**
     * get 客户端port
     *
     * @return
     */
    public String getRemotePort() {
        return remotePort;
    }

    /**
     * set 客户端port
     *
     * @param remotePort
     */
    public void setRemotePort(String remotePort) {
        this.remotePort = remotePort;
    }

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
     * get 来源地区
     *
     * @return
     */
    public String getArea() {
        return area;
    }

    /**
     * set 来源地区
     *
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * get 方法
     *
     * @return
     */
    public String getMethod() {
        return method;
    }

    /**
     * set 方法
     *
     * @param method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * get url
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set url
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * get 恶意负载
     *
     * @return
     */
    public String getPayLoad() {
        return payLoad;
    }

    /**
     * set 恶意负载
     *
     * @param payLoad
     */
    public void setPayLoad(String payLoad) {
        this.payLoad = payLoad;
    }

    /**
     * get 响应信息
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 响应信息
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 日志类型
     *
     * @return
     */
    public String getLogType() {
        return logType;
    }

    /**
     * set 日志类型
     *
     * @param logType
     */
    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * get 动作
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 动作
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get 请求ID
     *
     * @return
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * set 请求ID
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * get 回源错误信息
     *
     * @return
     */
    public String getUpstreamErr() {
        return upstreamErr;
    }

    /**
     * set 回源错误信息
     *
     * @param upstreamErr
     */
    public void setUpstreamErr(String upstreamErr) {
        this.upstreamErr = upstreamErr;
    }

    /**
     * get 日志记录时间
     *
     * @return
     */
    public String getTimeLocal() {
        return timeLocal;
    }

    /**
     * set 日志记录时间
     *
     * @param timeLocal
     */
    public void setTimeLocal(String timeLocal) {
        this.timeLocal = timeLocal;
    }

    /**
     * get 本机域名
     *
     * @return
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * set 本机域名
     *
     * @param hostname
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * get 响应长度
     *
     * @return
     */
    public String getBytesSent() {
        return bytesSent;
    }

    /**
     * set 响应长度
     *
     * @param bytesSent
     */
    public void setBytesSent(String bytesSent) {
        this.bytesSent = bytesSent;
    }

    /**
     * get 请求长度
     *
     * @return
     */
    public String getRequestLength() {
        return requestLength;
    }

    /**
     * set 请求长度
     *
     * @param requestLength
     */
    public void setRequestLength(String requestLength) {
        this.requestLength = requestLength;
    }

    /**
     * get 客户端请求的域名
     *
     * @return
     */
    public String getHost() {
        return host;
    }

    /**
     * set 客户端请求的域名
     *
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * get jfe的server块监听IP
     *
     * @return
     */
    public String getServerAddr() {
        return serverAddr;
    }

    /**
     * set jfe的server块监听IP
     *
     * @param serverAddr
     */
    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }

    /**
     * get jfe的server块监听port
     *
     * @return
     */
    public String getServerPort() {
        return serverPort;
    }

    /**
     * set jfe的server块监听port
     *
     * @param serverPort
     */
    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    /**
     * get 请求所连接的upstream名称
     *
     * @return
     */
    public String getUpstreamHttpName() {
        return upstreamHttpName;
    }

    /**
     * set 请求所连接的upstream名称
     *
     * @param upstreamHttpName
     */
    public void setUpstreamHttpName(String upstreamHttpName) {
        this.upstreamHttpName = upstreamHttpName;
    }

    /**
     * get 请求所连接的upstream服务器IP
     *
     * @return
     */
    public String getUpstreamAddr() {
        return upstreamAddr;
    }

    /**
     * set 请求所连接的upstream服务器IP
     *
     * @param upstreamAddr
     */
    public void setUpstreamAddr(String upstreamAddr) {
        this.upstreamAddr = upstreamAddr;
    }

    /**
     * get 请求所连接的upstream服务器port
     *
     * @return
     */
    public String getUpstreamHttpPort() {
        return upstreamHttpPort;
    }

    /**
     * set 请求所连接的upstream服务器port
     *
     * @param upstreamHttpPort
     */
    public void setUpstreamHttpPort(String upstreamHttpPort) {
        this.upstreamHttpPort = upstreamHttpPort;
    }

    /**
     * get 等待upstream建立连接的时间
     *
     * @return
     */
    public String getUpstreamConnectTime() {
        return upstreamConnectTime;
    }

    /**
     * set 等待upstream建立连接的时间
     *
     * @param upstreamConnectTime
     */
    public void setUpstreamConnectTime(String upstreamConnectTime) {
        this.upstreamConnectTime = upstreamConnectTime;
    }

    /**
     * get 接收upstream请求头的时间
     *
     * @return
     */
    public String getUpstreamHeaderTime() {
        return upstreamHeaderTime;
    }

    /**
     * set 接收upstream请求头的时间
     *
     * @param upstreamHeaderTime
     */
    public void setUpstreamHeaderTime(String upstreamHeaderTime) {
        this.upstreamHeaderTime = upstreamHeaderTime;
    }

    /**
     * get 接收upstream响应头的时间
     *
     * @return
     */
    public String getUpstreamResponseTime() {
        return upstreamResponseTime;
    }

    /**
     * set 接收upstream响应头的时间
     *
     * @param upstreamResponseTime
     */
    public void setUpstreamResponseTime(String upstreamResponseTime) {
        this.upstreamResponseTime = upstreamResponseTime;
    }

    /**
     * get 请求处理时间
     *
     * @return
     */
    public String getRequestTime() {
        return requestTime;
    }

    /**
     * set 请求处理时间
     *
     * @param requestTime
     */
    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * get 请求头的UA字段
     *
     * @return
     */
    public String getHttpUserAgent() {
        return httpUserAgent;
    }

    /**
     * set 请求头的UA字段
     *
     * @param httpUserAgent
     */
    public void setHttpUserAgent(String httpUserAgent) {
        this.httpUserAgent = httpUserAgent;
    }

    /**
     * get 攻击类型
     *
     * @return
     */
    public String getAntiReason() {
        return antiReason;
    }

    /**
     * set 攻击类型
     *
     * @param antiReason
     */
    public void setAntiReason(String antiReason) {
        this.antiReason = antiReason;
    }

    /**
     * get 请求来源
     *
     * @return
     */
    public String getHttpReferer() {
        return httpReferer;
    }

    /**
     * set 请求来源
     *
     * @param httpReferer
     */
    public void setHttpReferer(String httpReferer) {
        this.httpReferer = httpReferer;
    }

    /**
     * get 请求协议
     *
     * @return
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * set 请求协议
     *
     * @param scheme
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     * get uri
     *
     * @return
     */
    public String getUri() {
        return uri;
    }

    /**
     * set uri
     *
     * @param uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * get 断点续传响应分片位置
     *
     * @return
     */
    public String getSentHttpContentRange() {
        return sentHttpContentRange;
    }

    /**
     * set 断点续传响应分片位置
     *
     * @param sentHttpContentRange
     */
    public void setSentHttpContentRange(String sentHttpContentRange) {
        this.sentHttpContentRange = sentHttpContentRange;
    }

    /**
     * get 客户端IP
     *
     * @return
     */
    public String getAntiRemoteAddr() {
        return antiRemoteAddr;
    }

    /**
     * set 客户端IP
     *
     * @param antiRemoteAddr
     */
    public void setAntiRemoteAddr(String antiRemoteAddr) {
        this.antiRemoteAddr = antiRemoteAddr;
    }

    /**
     * get 原响应码
     *
     * @return
     */
    public String getAntiStatus() {
        return antiStatus;
    }

    /**
     * set 原响应码
     *
     * @param antiStatus
     */
    public void setAntiStatus(String antiStatus) {
        this.antiStatus = antiStatus;
    }

    /**
     * get 命中规则请求原始请求报文
     *
     * @return
     */
    public String getAntiReqRaw() {
        return antiReqRaw;
    }

    /**
     * set 命中规则请求原始请求报文
     *
     * @param antiReqRaw
     */
    public void setAntiReqRaw(String antiReqRaw) {
        this.antiReqRaw = antiReqRaw;
    }

    /**
     * get 命中规则请求原始响应报文
     *
     * @return
     */
    public String getAntiRespRaw() {
        return antiRespRaw;
    }

    /**
     * set 命中规则请求原始响应报文
     *
     * @param antiRespRaw
     */
    public void setAntiRespRaw(String antiRespRaw) {
        this.antiRespRaw = antiRespRaw;
    }

    /**
     * get 来源地域信息
     *
     * @return
     */
    public String getAntiGeo() {
        return antiGeo;
    }

    /**
     * set 来源地域信息
     *
     * @param antiGeo
     */
    public void setAntiGeo(String antiGeo) {
        this.antiGeo = antiGeo;
    }

    /**
     * get 指纹ID
     *
     * @return
     */
    public String getAntiRiskFid() {
        return antiRiskFid;
    }

    /**
     * set 指纹ID
     *
     * @param antiRiskFid
     */
    public void setAntiRiskFid(String antiRiskFid) {
        this.antiRiskFid = antiRiskFid;
    }

    /**
     * get 指纹采集详细信息
     *
     * @return
     */
    public String getAntiRiskRaw() {
        return antiRiskRaw;
    }

    /**
     * set 指纹采集详细信息
     *
     * @param antiRiskRaw
     */
    public void setAntiRiskRaw(String antiRiskRaw) {
        this.antiRiskRaw = antiRiskRaw;
    }


    /**
     * set 产生时间
     *
     * @param accessTime
     */
    public EsLogEvent accessTime(Integer accessTime) {
        this.accessTime = accessTime;
        return this;
    }

    /**
     * set 源ip
     *
     * @param remoteAddr
     */
    public EsLogEvent remoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
        return this;
    }

    /**
     * set 客户端port
     *
     * @param remotePort
     */
    public EsLogEvent remotePort(String remotePort) {
        this.remotePort = remotePort;
        return this;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public EsLogEvent domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 来源地区
     *
     * @param area
     */
    public EsLogEvent area(String area) {
        this.area = area;
        return this;
    }

    /**
     * set 方法
     *
     * @param method
     */
    public EsLogEvent method(String method) {
        this.method = method;
        return this;
    }

    /**
     * set url
     *
     * @param url
     */
    public EsLogEvent url(String url) {
        this.url = url;
        return this;
    }

    /**
     * set 恶意负载
     *
     * @param payLoad
     */
    public EsLogEvent payLoad(String payLoad) {
        this.payLoad = payLoad;
        return this;
    }

    /**
     * set 响应信息
     *
     * @param status
     */
    public EsLogEvent status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 日志类型
     *
     * @param logType
     */
    public EsLogEvent logType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * set 动作
     *
     * @param action
     */
    public EsLogEvent action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set 请求ID
     *
     * @param requestId
     */
    public EsLogEvent requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * set 回源错误信息
     *
     * @param upstreamErr
     */
    public EsLogEvent upstreamErr(String upstreamErr) {
        this.upstreamErr = upstreamErr;
        return this;
    }

    /**
     * set 日志记录时间
     *
     * @param timeLocal
     */
    public EsLogEvent timeLocal(String timeLocal) {
        this.timeLocal = timeLocal;
        return this;
    }

    /**
     * set 本机域名
     *
     * @param hostname
     */
    public EsLogEvent hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * set 响应长度
     *
     * @param bytesSent
     */
    public EsLogEvent bytesSent(String bytesSent) {
        this.bytesSent = bytesSent;
        return this;
    }

    /**
     * set 请求长度
     *
     * @param requestLength
     */
    public EsLogEvent requestLength(String requestLength) {
        this.requestLength = requestLength;
        return this;
    }

    /**
     * set 客户端请求的域名
     *
     * @param host
     */
    public EsLogEvent host(String host) {
        this.host = host;
        return this;
    }

    /**
     * set jfe的server块监听IP
     *
     * @param serverAddr
     */
    public EsLogEvent serverAddr(String serverAddr) {
        this.serverAddr = serverAddr;
        return this;
    }

    /**
     * set jfe的server块监听port
     *
     * @param serverPort
     */
    public EsLogEvent serverPort(String serverPort) {
        this.serverPort = serverPort;
        return this;
    }

    /**
     * set 请求所连接的upstream名称
     *
     * @param upstreamHttpName
     */
    public EsLogEvent upstreamHttpName(String upstreamHttpName) {
        this.upstreamHttpName = upstreamHttpName;
        return this;
    }

    /**
     * set 请求所连接的upstream服务器IP
     *
     * @param upstreamAddr
     */
    public EsLogEvent upstreamAddr(String upstreamAddr) {
        this.upstreamAddr = upstreamAddr;
        return this;
    }

    /**
     * set 请求所连接的upstream服务器port
     *
     * @param upstreamHttpPort
     */
    public EsLogEvent upstreamHttpPort(String upstreamHttpPort) {
        this.upstreamHttpPort = upstreamHttpPort;
        return this;
    }

    /**
     * set 等待upstream建立连接的时间
     *
     * @param upstreamConnectTime
     */
    public EsLogEvent upstreamConnectTime(String upstreamConnectTime) {
        this.upstreamConnectTime = upstreamConnectTime;
        return this;
    }

    /**
     * set 接收upstream请求头的时间
     *
     * @param upstreamHeaderTime
     */
    public EsLogEvent upstreamHeaderTime(String upstreamHeaderTime) {
        this.upstreamHeaderTime = upstreamHeaderTime;
        return this;
    }

    /**
     * set 接收upstream响应头的时间
     *
     * @param upstreamResponseTime
     */
    public EsLogEvent upstreamResponseTime(String upstreamResponseTime) {
        this.upstreamResponseTime = upstreamResponseTime;
        return this;
    }

    /**
     * set 请求处理时间
     *
     * @param requestTime
     */
    public EsLogEvent requestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    /**
     * set 请求头的UA字段
     *
     * @param httpUserAgent
     */
    public EsLogEvent httpUserAgent(String httpUserAgent) {
        this.httpUserAgent = httpUserAgent;
        return this;
    }

    /**
     * set 攻击类型
     *
     * @param antiReason
     */
    public EsLogEvent antiReason(String antiReason) {
        this.antiReason = antiReason;
        return this;
    }

    /**
     * set 请求来源
     *
     * @param httpReferer
     */
    public EsLogEvent httpReferer(String httpReferer) {
        this.httpReferer = httpReferer;
        return this;
    }

    /**
     * set 请求协议
     *
     * @param scheme
     */
    public EsLogEvent scheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * set uri
     *
     * @param uri
     */
    public EsLogEvent uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * set 断点续传响应分片位置
     *
     * @param sentHttpContentRange
     */
    public EsLogEvent sentHttpContentRange(String sentHttpContentRange) {
        this.sentHttpContentRange = sentHttpContentRange;
        return this;
    }

    /**
     * set 客户端IP
     *
     * @param antiRemoteAddr
     */
    public EsLogEvent antiRemoteAddr(String antiRemoteAddr) {
        this.antiRemoteAddr = antiRemoteAddr;
        return this;
    }

    /**
     * set 原响应码
     *
     * @param antiStatus
     */
    public EsLogEvent antiStatus(String antiStatus) {
        this.antiStatus = antiStatus;
        return this;
    }

    /**
     * set 命中规则请求原始请求报文
     *
     * @param antiReqRaw
     */
    public EsLogEvent antiReqRaw(String antiReqRaw) {
        this.antiReqRaw = antiReqRaw;
        return this;
    }

    /**
     * set 命中规则请求原始响应报文
     *
     * @param antiRespRaw
     */
    public EsLogEvent antiRespRaw(String antiRespRaw) {
        this.antiRespRaw = antiRespRaw;
        return this;
    }

    /**
     * set 来源地域信息
     *
     * @param antiGeo
     */
    public EsLogEvent antiGeo(String antiGeo) {
        this.antiGeo = antiGeo;
        return this;
    }

    /**
     * set 指纹ID
     *
     * @param antiRiskFid
     */
    public EsLogEvent antiRiskFid(String antiRiskFid) {
        this.antiRiskFid = antiRiskFid;
        return this;
    }

    /**
     * set 指纹采集详细信息
     *
     * @param antiRiskRaw
     */
    public EsLogEvent antiRiskRaw(String antiRiskRaw) {
        this.antiRiskRaw = antiRiskRaw;
        return this;
    }


}