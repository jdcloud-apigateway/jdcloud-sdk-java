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

package com.jdcloud.sdk.service.starshield.model;


/**
 * verification_info
 */
public class Verification_info  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Name of CNAME record
     */
    private String record_name;

    /**
     * Target of CNAME record
     */
    private String record_target;

    /**
     * record_value
     */
    private String record_value;

    /**
     * http_url
     */
    private String http_url;

    /**
     * http_body
     */
    private String http_body;

    /**
     * cname
     */
    private String cname;

    /**
     * cname_target
     */
    private String cname_target;

    /**
     * txt_name
     */
    private String txt_name;

    /**
     * txt_value
     */
    private String txt_value;


    /**
     * get Name of CNAME record
     *
     * @return
     */
    public String getRecord_name() {
        return record_name;
    }

    /**
     * set Name of CNAME record
     *
     * @param record_name
     */
    public void setRecord_name(String record_name) {
        this.record_name = record_name;
    }

    /**
     * get Target of CNAME record
     *
     * @return
     */
    public String getRecord_target() {
        return record_target;
    }

    /**
     * set Target of CNAME record
     *
     * @param record_target
     */
    public void setRecord_target(String record_target) {
        this.record_target = record_target;
    }

    /**
     * get record_value
     *
     * @return
     */
    public String getRecord_value() {
        return record_value;
    }

    /**
     * set record_value
     *
     * @param record_value
     */
    public void setRecord_value(String record_value) {
        this.record_value = record_value;
    }

    /**
     * get http_url
     *
     * @return
     */
    public String getHttp_url() {
        return http_url;
    }

    /**
     * set http_url
     *
     * @param http_url
     */
    public void setHttp_url(String http_url) {
        this.http_url = http_url;
    }

    /**
     * get http_body
     *
     * @return
     */
    public String getHttp_body() {
        return http_body;
    }

    /**
     * set http_body
     *
     * @param http_body
     */
    public void setHttp_body(String http_body) {
        this.http_body = http_body;
    }

    /**
     * get cname
     *
     * @return
     */
    public String getCname() {
        return cname;
    }

    /**
     * set cname
     *
     * @param cname
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * get cname_target
     *
     * @return
     */
    public String getCname_target() {
        return cname_target;
    }

    /**
     * set cname_target
     *
     * @param cname_target
     */
    public void setCname_target(String cname_target) {
        this.cname_target = cname_target;
    }

    /**
     * get txt_name
     *
     * @return
     */
    public String getTxt_name() {
        return txt_name;
    }

    /**
     * set txt_name
     *
     * @param txt_name
     */
    public void setTxt_name(String txt_name) {
        this.txt_name = txt_name;
    }

    /**
     * get txt_value
     *
     * @return
     */
    public String getTxt_value() {
        return txt_value;
    }

    /**
     * set txt_value
     *
     * @param txt_value
     */
    public void setTxt_value(String txt_value) {
        this.txt_value = txt_value;
    }


    /**
     * set Name of CNAME record
     *
     * @param record_name
     */
    public Verification_info record_name(String record_name) {
        this.record_name = record_name;
        return this;
    }

    /**
     * set Target of CNAME record
     *
     * @param record_target
     */
    public Verification_info record_target(String record_target) {
        this.record_target = record_target;
        return this;
    }

    /**
     * set record_value
     *
     * @param record_value
     */
    public Verification_info record_value(String record_value) {
        this.record_value = record_value;
        return this;
    }

    /**
     * set http_url
     *
     * @param http_url
     */
    public Verification_info http_url(String http_url) {
        this.http_url = http_url;
        return this;
    }

    /**
     * set http_body
     *
     * @param http_body
     */
    public Verification_info http_body(String http_body) {
        this.http_body = http_body;
        return this;
    }

    /**
     * set cname
     *
     * @param cname
     */
    public Verification_info cname(String cname) {
        this.cname = cname;
        return this;
    }

    /**
     * set cname_target
     *
     * @param cname_target
     */
    public Verification_info cname_target(String cname_target) {
        this.cname_target = cname_target;
        return this;
    }

    /**
     * set txt_name
     *
     * @param txt_name
     */
    public Verification_info txt_name(String txt_name) {
        this.txt_name = txt_name;
        return this;
    }

    /**
     * set txt_value
     *
     * @param txt_value
     */
    public Verification_info txt_value(String txt_value) {
        this.txt_value = txt_value;
        return this;
    }


}