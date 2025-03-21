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

package com.jdcloud.sdk.service.logs.model;


/**
 * logInfo
 */
public class LogInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用名
     */
    private String app;

    /**
     * 纳秒时间戳
     */
    private String timestamp;

    /**
     * ip
     */
    private String host;

    /**
     * 日志级别
     */
    private String level;

    /**
     * sgm traceId
     */
    private String traceId;

    /**
     * filepath
     */
    private String filePath;

    /**
     * 前端默认展开
     */
    private String _expanded;

    /**
     * t_h_r
     */
    private String t_h_r;

    /**
     * c_l_s
     */
    private String c_l_s;

    /**
     * m_s_g
     */
    private String m_s_g;



    /**
     * get 应用名
     *
     * @return
     */
    public String getApp() {
        return app;
    }

    /**
     * set 应用名
     *
     * @param app
     */
    public void setApp(String app) {
        this.app = app;
    }


    /**
     * get 纳秒时间戳
     *
     * @return
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * set 纳秒时间戳
     *
     * @param timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * get ip
     *
     * @return
     */
    public String getHost() {
        return host;
    }

    /**
     * set ip
     *
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }


    /**
     * get 日志级别
     *
     * @return
     */
    public String getLevel() {
        return level;
    }

    /**
     * set 日志级别
     *
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
    }


    /**
     * get sgm traceId
     *
     * @return
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * set sgm traceId
     *
     * @param traceId
     */
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }


    /**
     * get filepath
     *
     * @return
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * set filepath
     *
     * @param filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


    /**
     * get 前端默认展开
     *
     * @return
     */
    public String get_expanded() {
        return _expanded;
    }

    /**
     * set 前端默认展开
     *
     * @param _expanded
     */
    public void set_expanded(String _expanded) {
        this._expanded = _expanded;
    }


    /**
     * get t_h_r
     *
     * @return
     */
    public String getT_h_r() {
        return t_h_r;
    }

    /**
     * set t_h_r
     *
     * @param t_h_r
     */
    public void setT_h_r(String t_h_r) {
        this.t_h_r = t_h_r;
    }


    /**
     * get c_l_s
     *
     * @return
     */
    public String getC_l_s() {
        return c_l_s;
    }

    /**
     * set c_l_s
     *
     * @param c_l_s
     */
    public void setC_l_s(String c_l_s) {
        this.c_l_s = c_l_s;
    }


    /**
     * get m_s_g
     *
     * @return
     */
    public String getM_s_g() {
        return m_s_g;
    }

    /**
     * set m_s_g
     *
     * @param m_s_g
     */
    public void setM_s_g(String m_s_g) {
        this.m_s_g = m_s_g;
    }



    /**
     * set 应用名
     *
     * @param app
     */
    public LogInfo app(String app) {
        this.app = app;
        return this;
    }


    /**
     * set 纳秒时间戳
     *
     * @param timestamp
     */
    public LogInfo timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }


    /**
     * set ip
     *
     * @param host
     */
    public LogInfo host(String host) {
        this.host = host;
        return this;
    }


    /**
     * set 日志级别
     *
     * @param level
     */
    public LogInfo level(String level) {
        this.level = level;
        return this;
    }


    /**
     * set sgm traceId
     *
     * @param traceId
     */
    public LogInfo traceId(String traceId) {
        this.traceId = traceId;
        return this;
    }


    /**
     * set filepath
     *
     * @param filePath
     */
    public LogInfo filePath(String filePath) {
        this.filePath = filePath;
        return this;
    }


    /**
     * set 前端默认展开
     *
     * @param _expanded
     */
    public LogInfo _expanded(String _expanded) {
        this._expanded = _expanded;
        return this;
    }


    /**
     * set t_h_r
     *
     * @param t_h_r
     */
    public LogInfo t_h_r(String t_h_r) {
        this.t_h_r = t_h_r;
        return this;
    }


    /**
     * set c_l_s
     *
     * @param c_l_s
     */
    public LogInfo c_l_s(String c_l_s) {
        this.c_l_s = c_l_s;
        return this;
    }


    /**
     * set m_s_g
     *
     * @param m_s_g
     */
    public LogInfo m_s_g(String m_s_g) {
        this.m_s_g = m_s_g;
        return this;
    }


}