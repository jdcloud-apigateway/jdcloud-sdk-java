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

import com.jdcloud.sdk.annotation.Required;

/**
 * autoUserReportReqVo
 */
public class AutoUserReportReqVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户pin
     * Required:true
     */
    @Required
    private String pin;

    /**
     * 报备名称
     */
    private String reportName;

    /**
     * 归属(集团-1、外部-2、京东科技内部-3)
     * Required:true
     */
    @Required
    private Integer affiliation;

    /**
     * 业务线二级部门
     * Required:true
     */
    @Required
    private Integer businessLine;

    /**
     * 业务线三级部门
     */
    private String subBusinessLine;

    /**
     * 用户分组
     * Required:true
     */
    @Required
    private Integer userGroup;

    /**
     * 销售员erp
     * Required:true
     */
    @Required
    private String sellerErp;

    /**
     * 子集团
     */
    private String organizationCode;

    /**
     * 集团业务负责人ERP1
     */
    private String contact;

    /**
     * 集团业务负责人ERP1的手机号
     */
    private String contactPhone;

    /**
     * 集团业务负责人ERP2
     */
    private String subContact;

    /**
     * 集团业务负责人ERP2的手机号
     */
    private String subContactPhone;

    /**
     * 集团上云专题类型(自用上云-1、赋能上云-2、回家上云-3、其他-4)
     */
    private Integer enterpriseAffiliation;

    /**
     * 服务商合作类型
     */
    private String serviceType;

    /**
     * 操作者
     * Required:true
     */
    @Required
    private String operator;

    /**
     * 报备来源：渠道系统-2，云鼎-3，CRM-4，科技生态合作平台(biz-shengtai)-5，默认2
     */
    private Integer source;

    /**
     * 集团费用部门编码
     */
    private String costDepartmentCode;

    /**
     * 集团费用部门名称
     */
    private String costDepartmentName;

    /**
     * 财务计收归属：（集团-1、外部-2、云内部-3）
     */
    private Integer accountAffiliation;

    /**
     * 财务计收归属子属性
     */
    private String accountAffiliationCode;



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
     * get 报备名称
     *
     * @return
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * set 报备名称
     *
     * @param reportName
     */
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }


    /**
     * get 归属(集团-1、外部-2、京东科技内部-3)
     *
     * @return
     */
    public Integer getAffiliation() {
        return affiliation;
    }

    /**
     * set 归属(集团-1、外部-2、京东科技内部-3)
     *
     * @param affiliation
     */
    public void setAffiliation(Integer affiliation) {
        this.affiliation = affiliation;
    }


    /**
     * get 业务线二级部门
     *
     * @return
     */
    public Integer getBusinessLine() {
        return businessLine;
    }

    /**
     * set 业务线二级部门
     *
     * @param businessLine
     */
    public void setBusinessLine(Integer businessLine) {
        this.businessLine = businessLine;
    }


    /**
     * get 业务线三级部门
     *
     * @return
     */
    public String getSubBusinessLine() {
        return subBusinessLine;
    }

    /**
     * set 业务线三级部门
     *
     * @param subBusinessLine
     */
    public void setSubBusinessLine(String subBusinessLine) {
        this.subBusinessLine = subBusinessLine;
    }


    /**
     * get 用户分组
     *
     * @return
     */
    public Integer getUserGroup() {
        return userGroup;
    }

    /**
     * set 用户分组
     *
     * @param userGroup
     */
    public void setUserGroup(Integer userGroup) {
        this.userGroup = userGroup;
    }


    /**
     * get 销售员erp
     *
     * @return
     */
    public String getSellerErp() {
        return sellerErp;
    }

    /**
     * set 销售员erp
     *
     * @param sellerErp
     */
    public void setSellerErp(String sellerErp) {
        this.sellerErp = sellerErp;
    }


    /**
     * get 子集团
     *
     * @return
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * set 子集团
     *
     * @param organizationCode
     */
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }


    /**
     * get 集团业务负责人ERP1
     *
     * @return
     */
    public String getContact() {
        return contact;
    }

    /**
     * set 集团业务负责人ERP1
     *
     * @param contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }


    /**
     * get 集团业务负责人ERP1的手机号
     *
     * @return
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * set 集团业务负责人ERP1的手机号
     *
     * @param contactPhone
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }


    /**
     * get 集团业务负责人ERP2
     *
     * @return
     */
    public String getSubContact() {
        return subContact;
    }

    /**
     * set 集团业务负责人ERP2
     *
     * @param subContact
     */
    public void setSubContact(String subContact) {
        this.subContact = subContact;
    }


    /**
     * get 集团业务负责人ERP2的手机号
     *
     * @return
     */
    public String getSubContactPhone() {
        return subContactPhone;
    }

    /**
     * set 集团业务负责人ERP2的手机号
     *
     * @param subContactPhone
     */
    public void setSubContactPhone(String subContactPhone) {
        this.subContactPhone = subContactPhone;
    }


    /**
     * get 集团上云专题类型(自用上云-1、赋能上云-2、回家上云-3、其他-4)
     *
     * @return
     */
    public Integer getEnterpriseAffiliation() {
        return enterpriseAffiliation;
    }

    /**
     * set 集团上云专题类型(自用上云-1、赋能上云-2、回家上云-3、其他-4)
     *
     * @param enterpriseAffiliation
     */
    public void setEnterpriseAffiliation(Integer enterpriseAffiliation) {
        this.enterpriseAffiliation = enterpriseAffiliation;
    }


    /**
     * get 服务商合作类型
     *
     * @return
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * set 服务商合作类型
     *
     * @param serviceType
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * get 操作者
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set 操作者
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }


    /**
     * get 报备来源：渠道系统-2，云鼎-3，CRM-4，科技生态合作平台(biz-shengtai)-5，默认2
     *
     * @return
     */
    public Integer getSource() {
        return source;
    }

    /**
     * set 报备来源：渠道系统-2，云鼎-3，CRM-4，科技生态合作平台(biz-shengtai)-5，默认2
     *
     * @param source
     */
    public void setSource(Integer source) {
        this.source = source;
    }


    /**
     * get 集团费用部门编码
     *
     * @return
     */
    public String getCostDepartmentCode() {
        return costDepartmentCode;
    }

    /**
     * set 集团费用部门编码
     *
     * @param costDepartmentCode
     */
    public void setCostDepartmentCode(String costDepartmentCode) {
        this.costDepartmentCode = costDepartmentCode;
    }


    /**
     * get 集团费用部门名称
     *
     * @return
     */
    public String getCostDepartmentName() {
        return costDepartmentName;
    }

    /**
     * set 集团费用部门名称
     *
     * @param costDepartmentName
     */
    public void setCostDepartmentName(String costDepartmentName) {
        this.costDepartmentName = costDepartmentName;
    }


    /**
     * get 财务计收归属：（集团-1、外部-2、云内部-3）
     *
     * @return
     */
    public Integer getAccountAffiliation() {
        return accountAffiliation;
    }

    /**
     * set 财务计收归属：（集团-1、外部-2、云内部-3）
     *
     * @param accountAffiliation
     */
    public void setAccountAffiliation(Integer accountAffiliation) {
        this.accountAffiliation = accountAffiliation;
    }


    /**
     * get 财务计收归属子属性
     *
     * @return
     */
    public String getAccountAffiliationCode() {
        return accountAffiliationCode;
    }

    /**
     * set 财务计收归属子属性
     *
     * @param accountAffiliationCode
     */
    public void setAccountAffiliationCode(String accountAffiliationCode) {
        this.accountAffiliationCode = accountAffiliationCode;
    }



    /**
     * set 用户pin
     *
     * @param pin
     */
    public AutoUserReportReqVo pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 报备名称
     *
     * @param reportName
     */
    public AutoUserReportReqVo reportName(String reportName) {
        this.reportName = reportName;
        return this;
    }


    /**
     * set 归属(集团-1、外部-2、京东科技内部-3)
     *
     * @param affiliation
     */
    public AutoUserReportReqVo affiliation(Integer affiliation) {
        this.affiliation = affiliation;
        return this;
    }


    /**
     * set 业务线二级部门
     *
     * @param businessLine
     */
    public AutoUserReportReqVo businessLine(Integer businessLine) {
        this.businessLine = businessLine;
        return this;
    }


    /**
     * set 业务线三级部门
     *
     * @param subBusinessLine
     */
    public AutoUserReportReqVo subBusinessLine(String subBusinessLine) {
        this.subBusinessLine = subBusinessLine;
        return this;
    }


    /**
     * set 用户分组
     *
     * @param userGroup
     */
    public AutoUserReportReqVo userGroup(Integer userGroup) {
        this.userGroup = userGroup;
        return this;
    }


    /**
     * set 销售员erp
     *
     * @param sellerErp
     */
    public AutoUserReportReqVo sellerErp(String sellerErp) {
        this.sellerErp = sellerErp;
        return this;
    }


    /**
     * set 子集团
     *
     * @param organizationCode
     */
    public AutoUserReportReqVo organizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }


    /**
     * set 集团业务负责人ERP1
     *
     * @param contact
     */
    public AutoUserReportReqVo contact(String contact) {
        this.contact = contact;
        return this;
    }


    /**
     * set 集团业务负责人ERP1的手机号
     *
     * @param contactPhone
     */
    public AutoUserReportReqVo contactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }


    /**
     * set 集团业务负责人ERP2
     *
     * @param subContact
     */
    public AutoUserReportReqVo subContact(String subContact) {
        this.subContact = subContact;
        return this;
    }


    /**
     * set 集团业务负责人ERP2的手机号
     *
     * @param subContactPhone
     */
    public AutoUserReportReqVo subContactPhone(String subContactPhone) {
        this.subContactPhone = subContactPhone;
        return this;
    }


    /**
     * set 集团上云专题类型(自用上云-1、赋能上云-2、回家上云-3、其他-4)
     *
     * @param enterpriseAffiliation
     */
    public AutoUserReportReqVo enterpriseAffiliation(Integer enterpriseAffiliation) {
        this.enterpriseAffiliation = enterpriseAffiliation;
        return this;
    }


    /**
     * set 服务商合作类型
     *
     * @param serviceType
     */
    public AutoUserReportReqVo serviceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }


    /**
     * set 操作者
     *
     * @param operator
     */
    public AutoUserReportReqVo operator(String operator) {
        this.operator = operator;
        return this;
    }


    /**
     * set 报备来源：渠道系统-2，云鼎-3，CRM-4，科技生态合作平台(biz-shengtai)-5，默认2
     *
     * @param source
     */
    public AutoUserReportReqVo source(Integer source) {
        this.source = source;
        return this;
    }


    /**
     * set 集团费用部门编码
     *
     * @param costDepartmentCode
     */
    public AutoUserReportReqVo costDepartmentCode(String costDepartmentCode) {
        this.costDepartmentCode = costDepartmentCode;
        return this;
    }


    /**
     * set 集团费用部门名称
     *
     * @param costDepartmentName
     */
    public AutoUserReportReqVo costDepartmentName(String costDepartmentName) {
        this.costDepartmentName = costDepartmentName;
        return this;
    }


    /**
     * set 财务计收归属：（集团-1、外部-2、云内部-3）
     *
     * @param accountAffiliation
     */
    public AutoUserReportReqVo accountAffiliation(Integer accountAffiliation) {
        this.accountAffiliation = accountAffiliation;
        return this;
    }


    /**
     * set 财务计收归属子属性
     *
     * @param accountAffiliationCode
     */
    public AutoUserReportReqVo accountAffiliationCode(String accountAffiliationCode) {
        this.accountAffiliationCode = accountAffiliationCode;
        return this;
    }


}