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


/**
 * companyAuthRecordVo
 */
public class CompanyAuthRecordVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 操作类型：0，认证，1，取消认证，2，实名过期
     */
    private Integer type;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作时间
     */
    private String createTime;



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
     * get 操作类型：0，认证，1，取消认证，2，实名过期
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 操作类型：0，认证，1，取消认证，2，实名过期
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }


    /**
     * get 操作人
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set 操作人
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }


    /**
     * get 备注
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 备注
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }


    /**
     * get 操作时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 操作时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }



    /**
     * set 用户pin
     *
     * @param pin
     */
    public CompanyAuthRecordVo pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 操作类型：0，认证，1，取消认证，2，实名过期
     *
     * @param type
     */
    public CompanyAuthRecordVo type(Integer type) {
        this.type = type;
        return this;
    }


    /**
     * set 操作人
     *
     * @param operator
     */
    public CompanyAuthRecordVo operator(String operator) {
        this.operator = operator;
        return this;
    }


    /**
     * set 备注
     *
     * @param remark
     */
    public CompanyAuthRecordVo remark(String remark) {
        this.remark = remark;
        return this;
    }


    /**
     * set 操作时间
     *
     * @param createTime
     */
    public CompanyAuthRecordVo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}