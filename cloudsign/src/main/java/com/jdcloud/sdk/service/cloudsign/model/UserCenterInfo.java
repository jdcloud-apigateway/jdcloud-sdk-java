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

package com.jdcloud.sdk.service.cloudsign.model;


/**
 * userCenterInfo
 */
public class UserCenterInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 个人用户-姓名,企业用户-法人姓名
     */
    private String name;

    /**
     * 个人用户-身份证号,企业用户-法人身份证号
     */
    private String idCardNum;

    /**
     * 个人用户-个人手机号,企业用户-法人手机号
     */
    private String mobile;



    /**
     * get 个人用户-姓名,企业用户-法人姓名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 个人用户-姓名,企业用户-法人姓名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 个人用户-身份证号,企业用户-法人身份证号
     *
     * @return
     */
    public String getIdCardNum() {
        return idCardNum;
    }

    /**
     * set 个人用户-身份证号,企业用户-法人身份证号
     *
     * @param idCardNum
     */
    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }


    /**
     * get 个人用户-个人手机号,企业用户-法人手机号
     *
     * @return
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * set 个人用户-个人手机号,企业用户-法人手机号
     *
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



    /**
     * set 个人用户-姓名,企业用户-法人姓名
     *
     * @param name
     */
    public UserCenterInfo name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 个人用户-身份证号,企业用户-法人身份证号
     *
     * @param idCardNum
     */
    public UserCenterInfo idCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
        return this;
    }


    /**
     * set 个人用户-个人手机号,企业用户-法人手机号
     *
     * @param mobile
     */
    public UserCenterInfo mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }


}