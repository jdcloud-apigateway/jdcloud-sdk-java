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

package com.jdcloud.sdk.service.lb.model;

import java.util.List;
import java.util.ArrayList;

/**
 * healthCheck
 */
public class HealthCheck  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 健康检查协议 &lt;br&gt;【alb、nlb】取值为Http, Tcp, Icmp(仅支持alb/nlb的Udp的Backend) &lt;br&gt;【dnlb】取值为Tcp, Icmp(仅支持dnlb的Udp的Backend)
     */
    private String protocol;

    /**
     * 健康阀值，&gt;&#x3D;1，默认为3
     */
    private Integer healthyThresholdCount;

    /**
     * 不健康阀值，&gt;&#x3D;1, 默认为3
     */
    private Integer unhealthyThresholdCount;

    /**
     * 响应超时时间, 取值范围为[2,60]，默认为3s
     */
    private Integer checkTimeoutSeconds;

    /**
     * 健康检查间隔, 范围为[5,300], 默认为5s
     */
    private Integer intervalSeconds;

    /**
     * 健康检查的目标端口, 取值范围为[0,65535], 默认为0，默认端口为每个后端实例接收负载均衡流量的端口，Icmp不支持端口
     */
    private Integer port;

    /**
     * 健康检查的协议类型, HTTP1.0/HTTP1.1,默认选择HTTP1.0
     */
    private String httpVersion;

    /**
     * 健康检查的目标域名，仅支持HTTP协议。支持输入域名和IP地址。如果输入域名，仅支持大小写字母、数字、英文中划线&quot;-&quot;和点&quot;.&quot;，不区分大小写，且不超过255个字符。默认为空，表示健康检查不携带域名
     */
    private String httpDomain;

    /**
     * 健康检查的目标路径，仅支持HTTP协议。必须以&quot;/&quot;开头，支持大小写字母、数字、汉字和英文字符-/.%?#&amp;_;~!()*[]@^:&#39;,+&#x3D;&lt;&gt;{}。%后仅支持输入URL编码后字符，且不超过1000个字符
     */
    private String httpPath;

    /**
     * 健康检查的期望状态码，仅支持HTTP协议。检查来自后端目标服务器的成功响应时，要使用的HTTP状态码。您可以指定：单个数值（例如：&quot;200&quot;，取值范围200-499）、一段连续数值（例如：&quot;201-205&quot;，取值范围范围200-499，且前面的参数小于后面）和一类连续数值缩写（例如：&quot;3xx&quot;，等价于&quot;300-399&quot;，取值范围2xx、3xx和4xx）。多个数值之间通过&quot;,&quot;分割（例如：&quot;200,202-207,302,4xx&quot;）。目前仅支持2xx、3xx、4xx。
     */
    
    private List<String> httpCode;


    /**
     * get 健康检查协议 &lt;br&gt;【alb、nlb】取值为Http, Tcp, Icmp(仅支持alb/nlb的Udp的Backend) &lt;br&gt;【dnlb】取值为Tcp, Icmp(仅支持dnlb的Udp的Backend)
     *
     * @return
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * set 健康检查协议 &lt;br&gt;【alb、nlb】取值为Http, Tcp, Icmp(仅支持alb/nlb的Udp的Backend) &lt;br&gt;【dnlb】取值为Tcp, Icmp(仅支持dnlb的Udp的Backend)
     *
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }


    /**
     * get 健康阀值，&gt;&#x3D;1，默认为3
     *
     * @return
     */
    public Integer getHealthyThresholdCount() {
        return healthyThresholdCount;
    }

    /**
     * set 健康阀值，&gt;&#x3D;1，默认为3
     *
     * @param healthyThresholdCount
     */
    public void setHealthyThresholdCount(Integer healthyThresholdCount) {
        this.healthyThresholdCount = healthyThresholdCount;
    }


    /**
     * get 不健康阀值，&gt;&#x3D;1, 默认为3
     *
     * @return
     */
    public Integer getUnhealthyThresholdCount() {
        return unhealthyThresholdCount;
    }

    /**
     * set 不健康阀值，&gt;&#x3D;1, 默认为3
     *
     * @param unhealthyThresholdCount
     */
    public void setUnhealthyThresholdCount(Integer unhealthyThresholdCount) {
        this.unhealthyThresholdCount = unhealthyThresholdCount;
    }


    /**
     * get 响应超时时间, 取值范围为[2,60]，默认为3s
     *
     * @return
     */
    public Integer getCheckTimeoutSeconds() {
        return checkTimeoutSeconds;
    }

    /**
     * set 响应超时时间, 取值范围为[2,60]，默认为3s
     *
     * @param checkTimeoutSeconds
     */
    public void setCheckTimeoutSeconds(Integer checkTimeoutSeconds) {
        this.checkTimeoutSeconds = checkTimeoutSeconds;
    }


    /**
     * get 健康检查间隔, 范围为[5,300], 默认为5s
     *
     * @return
     */
    public Integer getIntervalSeconds() {
        return intervalSeconds;
    }

    /**
     * set 健康检查间隔, 范围为[5,300], 默认为5s
     *
     * @param intervalSeconds
     */
    public void setIntervalSeconds(Integer intervalSeconds) {
        this.intervalSeconds = intervalSeconds;
    }


    /**
     * get 健康检查的目标端口, 取值范围为[0,65535], 默认为0，默认端口为每个后端实例接收负载均衡流量的端口，Icmp不支持端口
     *
     * @return
     */
    public Integer getPort() {
        return port;
    }

    /**
     * set 健康检查的目标端口, 取值范围为[0,65535], 默认为0，默认端口为每个后端实例接收负载均衡流量的端口，Icmp不支持端口
     *
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }


    /**
     * get 健康检查的协议类型, HTTP1.0/HTTP1.1,默认选择HTTP1.0
     *
     * @return
     */
    public String getHttpVersion() {
        return httpVersion;
    }

    /**
     * set 健康检查的协议类型, HTTP1.0/HTTP1.1,默认选择HTTP1.0
     *
     * @param httpVersion
     */
    public void setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
    }


    /**
     * get 健康检查的目标域名，仅支持HTTP协议。支持输入域名和IP地址。如果输入域名，仅支持大小写字母、数字、英文中划线&quot;-&quot;和点&quot;.&quot;，不区分大小写，且不超过255个字符。默认为空，表示健康检查不携带域名
     *
     * @return
     */
    public String getHttpDomain() {
        return httpDomain;
    }

    /**
     * set 健康检查的目标域名，仅支持HTTP协议。支持输入域名和IP地址。如果输入域名，仅支持大小写字母、数字、英文中划线&quot;-&quot;和点&quot;.&quot;，不区分大小写，且不超过255个字符。默认为空，表示健康检查不携带域名
     *
     * @param httpDomain
     */
    public void setHttpDomain(String httpDomain) {
        this.httpDomain = httpDomain;
    }


    /**
     * get 健康检查的目标路径，仅支持HTTP协议。必须以&quot;/&quot;开头，支持大小写字母、数字、汉字和英文字符-/.%?#&amp;_;~!()*[]@^:&#39;,+&#x3D;&lt;&gt;{}。%后仅支持输入URL编码后字符，且不超过1000个字符
     *
     * @return
     */
    public String getHttpPath() {
        return httpPath;
    }

    /**
     * set 健康检查的目标路径，仅支持HTTP协议。必须以&quot;/&quot;开头，支持大小写字母、数字、汉字和英文字符-/.%?#&amp;_;~!()*[]@^:&#39;,+&#x3D;&lt;&gt;{}。%后仅支持输入URL编码后字符，且不超过1000个字符
     *
     * @param httpPath
     */
    public void setHttpPath(String httpPath) {
        this.httpPath = httpPath;
    }


    /**
    * get 健康检查的期望状态码，仅支持HTTP协议。检查来自后端目标服务器的成功响应时，要使用的HTTP状态码。您可以指定：单个数值（例如：&quot;200&quot;，取值范围200-499）、一段连续数值（例如：&quot;201-205&quot;，取值范围范围200-499，且前面的参数小于后面）和一类连续数值缩写（例如：&quot;3xx&quot;，等价于&quot;300-399&quot;，取值范围2xx、3xx和4xx）。多个数值之间通过&quot;,&quot;分割（例如：&quot;200,202-207,302,4xx&quot;）。目前仅支持2xx、3xx、4xx。
    *
    * @return
    */
    public List<String> getHttpCode() {
        return httpCode;
    }

    /**
    * set 健康检查的期望状态码，仅支持HTTP协议。检查来自后端目标服务器的成功响应时，要使用的HTTP状态码。您可以指定：单个数值（例如：&quot;200&quot;，取值范围200-499）、一段连续数值（例如：&quot;201-205&quot;，取值范围范围200-499，且前面的参数小于后面）和一类连续数值缩写（例如：&quot;3xx&quot;，等价于&quot;300-399&quot;，取值范围2xx、3xx和4xx）。多个数值之间通过&quot;,&quot;分割（例如：&quot;200,202-207,302,4xx&quot;）。目前仅支持2xx、3xx、4xx。
    *
    * @param httpCode
    */
    public void setHttpCode(List<String> httpCode) {
        this.httpCode = httpCode;
    }



    /**
     * set 健康检查协议 &lt;br&gt;【alb、nlb】取值为Http, Tcp, Icmp(仅支持alb/nlb的Udp的Backend) &lt;br&gt;【dnlb】取值为Tcp, Icmp(仅支持dnlb的Udp的Backend)
     *
     * @param protocol
     */
    public HealthCheck protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }


    /**
     * set 健康阀值，&gt;&#x3D;1，默认为3
     *
     * @param healthyThresholdCount
     */
    public HealthCheck healthyThresholdCount(Integer healthyThresholdCount) {
        this.healthyThresholdCount = healthyThresholdCount;
        return this;
    }


    /**
     * set 不健康阀值，&gt;&#x3D;1, 默认为3
     *
     * @param unhealthyThresholdCount
     */
    public HealthCheck unhealthyThresholdCount(Integer unhealthyThresholdCount) {
        this.unhealthyThresholdCount = unhealthyThresholdCount;
        return this;
    }


    /**
     * set 响应超时时间, 取值范围为[2,60]，默认为3s
     *
     * @param checkTimeoutSeconds
     */
    public HealthCheck checkTimeoutSeconds(Integer checkTimeoutSeconds) {
        this.checkTimeoutSeconds = checkTimeoutSeconds;
        return this;
    }


    /**
     * set 健康检查间隔, 范围为[5,300], 默认为5s
     *
     * @param intervalSeconds
     */
    public HealthCheck intervalSeconds(Integer intervalSeconds) {
        this.intervalSeconds = intervalSeconds;
        return this;
    }


    /**
     * set 健康检查的目标端口, 取值范围为[0,65535], 默认为0，默认端口为每个后端实例接收负载均衡流量的端口，Icmp不支持端口
     *
     * @param port
     */
    public HealthCheck port(Integer port) {
        this.port = port;
        return this;
    }


    /**
     * set 健康检查的协议类型, HTTP1.0/HTTP1.1,默认选择HTTP1.0
     *
     * @param httpVersion
     */
    public HealthCheck httpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
        return this;
    }


    /**
     * set 健康检查的目标域名，仅支持HTTP协议。支持输入域名和IP地址。如果输入域名，仅支持大小写字母、数字、英文中划线&quot;-&quot;和点&quot;.&quot;，不区分大小写，且不超过255个字符。默认为空，表示健康检查不携带域名
     *
     * @param httpDomain
     */
    public HealthCheck httpDomain(String httpDomain) {
        this.httpDomain = httpDomain;
        return this;
    }


    /**
     * set 健康检查的目标路径，仅支持HTTP协议。必须以&quot;/&quot;开头，支持大小写字母、数字、汉字和英文字符-/.%?#&amp;_;~!()*[]@^:&#39;,+&#x3D;&lt;&gt;{}。%后仅支持输入URL编码后字符，且不超过1000个字符
     *
     * @param httpPath
     */
    public HealthCheck httpPath(String httpPath) {
        this.httpPath = httpPath;
        return this;
    }


    /**
    * set 健康检查的期望状态码，仅支持HTTP协议。检查来自后端目标服务器的成功响应时，要使用的HTTP状态码。您可以指定：单个数值（例如：&quot;200&quot;，取值范围200-499）、一段连续数值（例如：&quot;201-205&quot;，取值范围范围200-499，且前面的参数小于后面）和一类连续数值缩写（例如：&quot;3xx&quot;，等价于&quot;300-399&quot;，取值范围2xx、3xx和4xx）。多个数值之间通过&quot;,&quot;分割（例如：&quot;200,202-207,302,4xx&quot;）。目前仅支持2xx、3xx、4xx。
    *
    * @param httpCode
    */
    public HealthCheck httpCode(List<String> httpCode) {
        this.httpCode = httpCode;
        return this;
    }



    /**
     * add item to 健康检查的期望状态码，仅支持HTTP协议。检查来自后端目标服务器的成功响应时，要使用的HTTP状态码。您可以指定：单个数值（例如：&quot;200&quot;，取值范围200-499）、一段连续数值（例如：&quot;201-205&quot;，取值范围范围200-499，且前面的参数小于后面）和一类连续数值缩写（例如：&quot;3xx&quot;，等价于&quot;300-399&quot;，取值范围2xx、3xx和4xx）。多个数值之间通过&quot;,&quot;分割（例如：&quot;200,202-207,302,4xx&quot;）。目前仅支持2xx、3xx、4xx。
     *
     * @param httpCode
     */
    public void addHttpCode(String httpCode) {
        if (this.httpCode == null) {
            this.httpCode = new ArrayList<>();
        }
        this.httpCode.add(httpCode);
    }
}