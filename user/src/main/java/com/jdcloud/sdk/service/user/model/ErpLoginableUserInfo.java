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

package com.jdcloud.sdk.service.user.model;

import java.util.List;
import java.util.ArrayList;

/**
 * erpLoginableUserInfo
 */
public class ErpLoginableUserInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 账号名
     */
    private String loginName;

    /**
     * 用户归属（集团-1、京东科技内部-3)
     */
    private Integer userReportType;

    /**
     * 是否禁止其他登录方式，包括京东、APP扫码、微信、账密登录（禁止-1、不禁止-0)
     */
    private Integer disableOtherLogin;

    /**
     * 关联的ERP列表
     */
    
    private List<String> erps;
    /**
     * 用户资源池类型
     */
    private String userResourceType;



    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 账号名
     *
     * @return
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * set 账号名
     *
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    /**
     * get 用户归属（集团-1、京东科技内部-3)
     *
     * @return
     */
    public Integer getUserReportType() {
        return userReportType;
    }

    /**
     * set 用户归属（集团-1、京东科技内部-3)
     *
     * @param userReportType
     */
    public void setUserReportType(Integer userReportType) {
        this.userReportType = userReportType;
    }


    /**
     * get 是否禁止其他登录方式，包括京东、APP扫码、微信、账密登录（禁止-1、不禁止-0)
     *
     * @return
     */
    public Integer getDisableOtherLogin() {
        return disableOtherLogin;
    }

    /**
     * set 是否禁止其他登录方式，包括京东、APP扫码、微信、账密登录（禁止-1、不禁止-0)
     *
     * @param disableOtherLogin
     */
    public void setDisableOtherLogin(Integer disableOtherLogin) {
        this.disableOtherLogin = disableOtherLogin;
    }


    /**
    * get 关联的ERP列表
    *
    * @return
    */
    public List<String> getErps() {
        return erps;
    }

    /**
    * set 关联的ERP列表
    *
    * @param erps
    */
    public void setErps(List<String> erps) {
        this.erps = erps;
    }


    /**
     * get 用户资源池类型
     *
     * @return
     */
    public String getUserResourceType() {
        return userResourceType;
    }

    /**
     * set 用户资源池类型
     *
     * @param userResourceType
     */
    public void setUserResourceType(String userResourceType) {
        this.userResourceType = userResourceType;
    }



    /**
     * set 用户pin
     *
     * @param pin
     */
    public ErpLoginableUserInfo pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 账号名
     *
     * @param loginName
     */
    public ErpLoginableUserInfo loginName(String loginName) {
        this.loginName = loginName;
        return this;
    }


    /**
     * set 用户归属（集团-1、京东科技内部-3)
     *
     * @param userReportType
     */
    public ErpLoginableUserInfo userReportType(Integer userReportType) {
        this.userReportType = userReportType;
        return this;
    }


    /**
     * set 是否禁止其他登录方式，包括京东、APP扫码、微信、账密登录（禁止-1、不禁止-0)
     *
     * @param disableOtherLogin
     */
    public ErpLoginableUserInfo disableOtherLogin(Integer disableOtherLogin) {
        this.disableOtherLogin = disableOtherLogin;
        return this;
    }


    /**
    * set 关联的ERP列表
    *
    * @param erps
    */
    public ErpLoginableUserInfo erps(List<String> erps) {
        this.erps = erps;
        return this;
    }


    /**
     * set 用户资源池类型
     *
     * @param userResourceType
     */
    public ErpLoginableUserInfo userResourceType(String userResourceType) {
        this.userResourceType = userResourceType;
        return this;
    }



    /**
     * add item to 关联的ERP列表
     *
     * @param erp
     */
    public void addErp(String erp) {
        if (this.erps == null) {
            this.erps = new ArrayList<>();
        }
        this.erps.add(erp);
    }
}