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
 * userReportByNameVo
 */
public class UserReportByNameVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     */
    private String pin;

    /**
     * 报备名称
     */
    private String reportName;

    /**
     * 财务计收归属：（集团-1、外部-2、云内部-3）
     */
    private Integer accountAffiliation;

    /**
     * 财务计收归属子属性
     */
    private String accountAffiliationCode;

    /**
     * 销售员erp
     */
    private String sellerErp;



    /**
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
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
     * set pin
     *
     * @param pin
     */
    public UserReportByNameVo pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 报备名称
     *
     * @param reportName
     */
    public UserReportByNameVo reportName(String reportName) {
        this.reportName = reportName;
        return this;
    }


    /**
     * set 财务计收归属：（集团-1、外部-2、云内部-3）
     *
     * @param accountAffiliation
     */
    public UserReportByNameVo accountAffiliation(Integer accountAffiliation) {
        this.accountAffiliation = accountAffiliation;
        return this;
    }


    /**
     * set 财务计收归属子属性
     *
     * @param accountAffiliationCode
     */
    public UserReportByNameVo accountAffiliationCode(String accountAffiliationCode) {
        this.accountAffiliationCode = accountAffiliationCode;
        return this;
    }


    /**
     * set 销售员erp
     *
     * @param sellerErp
     */
    public UserReportByNameVo sellerErp(String sellerErp) {
        this.sellerErp = sellerErp;
        return this;
    }


}