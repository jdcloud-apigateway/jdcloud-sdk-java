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

package com.jdcloud.sdk.service.billing.model;


/**
 * billAdjustRecord
 */
public class BillAdjustRecord  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     */
    private String pin;

    /**
     * 产品
     */
    private String serviceCode;

    /**
     * 资源ID
     */
    private String resourceId;

    /**
     * 应付金额
     */
    private Double actualFee;

    /**
     * 调整金额
     */
    private Double adjustFee;

    /**
     * 计费项
     */
    private String property;

    /**
     * 用量
     */
    private Double usage;

    /**
     * 调整用量
     */
    private Double adjustUsage;

    /**
     * 用量单位
     */
    private String usageUnit;

    /**
     * 操作类型 1 调整金额 2 调整用量 3 调账
     */
    private Integer opType;

    /**
     * 调整月份(yyyyMM)
     */
    private Integer billDate;

    /**
     * 状态 1调整中 2调整完成 3 失败
     */
    private Integer state;

    /**
     * 调整原因
     */
    private String reason;

    /**
     * 附件1名称
     */
    private String file1Name;

    /**
     * 附件1url
     */
    private String file1Url;

    /**
     * 附件2名称
     */
    private String file2Name;

    /**
     * 附件2url
     */
    private String file2Url;

    /**
     * 附件3名称
     */
    private String file3Name;

    /**
     * 附件3url
     */
    private String file3Url;

    /**
     * erp
     */
    private String erp;

    /**
     * createTime
     */
    private String createTime;

    /**
     * updateTime
     */
    private String updateTime;



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
     * get 产品
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 资源ID
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * get 应付金额
     *
     * @return
     */
    public Double getActualFee() {
        return actualFee;
    }

    /**
     * set 应付金额
     *
     * @param actualFee
     */
    public void setActualFee(Double actualFee) {
        this.actualFee = actualFee;
    }


    /**
     * get 调整金额
     *
     * @return
     */
    public Double getAdjustFee() {
        return adjustFee;
    }

    /**
     * set 调整金额
     *
     * @param adjustFee
     */
    public void setAdjustFee(Double adjustFee) {
        this.adjustFee = adjustFee;
    }


    /**
     * get 计费项
     *
     * @return
     */
    public String getProperty() {
        return property;
    }

    /**
     * set 计费项
     *
     * @param property
     */
    public void setProperty(String property) {
        this.property = property;
    }


    /**
     * get 用量
     *
     * @return
     */
    public Double getUsage() {
        return usage;
    }

    /**
     * set 用量
     *
     * @param usage
     */
    public void setUsage(Double usage) {
        this.usage = usage;
    }


    /**
     * get 调整用量
     *
     * @return
     */
    public Double getAdjustUsage() {
        return adjustUsage;
    }

    /**
     * set 调整用量
     *
     * @param adjustUsage
     */
    public void setAdjustUsage(Double adjustUsage) {
        this.adjustUsage = adjustUsage;
    }


    /**
     * get 用量单位
     *
     * @return
     */
    public String getUsageUnit() {
        return usageUnit;
    }

    /**
     * set 用量单位
     *
     * @param usageUnit
     */
    public void setUsageUnit(String usageUnit) {
        this.usageUnit = usageUnit;
    }


    /**
     * get 操作类型 1 调整金额 2 调整用量 3 调账
     *
     * @return
     */
    public Integer getOpType() {
        return opType;
    }

    /**
     * set 操作类型 1 调整金额 2 调整用量 3 调账
     *
     * @param opType
     */
    public void setOpType(Integer opType) {
        this.opType = opType;
    }


    /**
     * get 调整月份(yyyyMM)
     *
     * @return
     */
    public Integer getBillDate() {
        return billDate;
    }

    /**
     * set 调整月份(yyyyMM)
     *
     * @param billDate
     */
    public void setBillDate(Integer billDate) {
        this.billDate = billDate;
    }


    /**
     * get 状态 1调整中 2调整完成 3 失败
     *
     * @return
     */
    public Integer getState() {
        return state;
    }

    /**
     * set 状态 1调整中 2调整完成 3 失败
     *
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }


    /**
     * get 调整原因
     *
     * @return
     */
    public String getReason() {
        return reason;
    }

    /**
     * set 调整原因
     *
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }


    /**
     * get 附件1名称
     *
     * @return
     */
    public String getFile1Name() {
        return file1Name;
    }

    /**
     * set 附件1名称
     *
     * @param file1Name
     */
    public void setFile1Name(String file1Name) {
        this.file1Name = file1Name;
    }


    /**
     * get 附件1url
     *
     * @return
     */
    public String getFile1Url() {
        return file1Url;
    }

    /**
     * set 附件1url
     *
     * @param file1Url
     */
    public void setFile1Url(String file1Url) {
        this.file1Url = file1Url;
    }


    /**
     * get 附件2名称
     *
     * @return
     */
    public String getFile2Name() {
        return file2Name;
    }

    /**
     * set 附件2名称
     *
     * @param file2Name
     */
    public void setFile2Name(String file2Name) {
        this.file2Name = file2Name;
    }


    /**
     * get 附件2url
     *
     * @return
     */
    public String getFile2Url() {
        return file2Url;
    }

    /**
     * set 附件2url
     *
     * @param file2Url
     */
    public void setFile2Url(String file2Url) {
        this.file2Url = file2Url;
    }


    /**
     * get 附件3名称
     *
     * @return
     */
    public String getFile3Name() {
        return file3Name;
    }

    /**
     * set 附件3名称
     *
     * @param file3Name
     */
    public void setFile3Name(String file3Name) {
        this.file3Name = file3Name;
    }


    /**
     * get 附件3url
     *
     * @return
     */
    public String getFile3Url() {
        return file3Url;
    }

    /**
     * set 附件3url
     *
     * @param file3Url
     */
    public void setFile3Url(String file3Url) {
        this.file3Url = file3Url;
    }


    /**
     * get erp
     *
     * @return
     */
    public String getErp() {
        return erp;
    }

    /**
     * set erp
     *
     * @param erp
     */
    public void setErp(String erp) {
        this.erp = erp;
    }


    /**
     * get createTime
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }



    /**
     * set pin
     *
     * @param pin
     */
    public BillAdjustRecord pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 产品
     *
     * @param serviceCode
     */
    public BillAdjustRecord serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public BillAdjustRecord resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 应付金额
     *
     * @param actualFee
     */
    public BillAdjustRecord actualFee(Double actualFee) {
        this.actualFee = actualFee;
        return this;
    }


    /**
     * set 调整金额
     *
     * @param adjustFee
     */
    public BillAdjustRecord adjustFee(Double adjustFee) {
        this.adjustFee = adjustFee;
        return this;
    }


    /**
     * set 计费项
     *
     * @param property
     */
    public BillAdjustRecord property(String property) {
        this.property = property;
        return this;
    }


    /**
     * set 用量
     *
     * @param usage
     */
    public BillAdjustRecord usage(Double usage) {
        this.usage = usage;
        return this;
    }


    /**
     * set 调整用量
     *
     * @param adjustUsage
     */
    public BillAdjustRecord adjustUsage(Double adjustUsage) {
        this.adjustUsage = adjustUsage;
        return this;
    }


    /**
     * set 用量单位
     *
     * @param usageUnit
     */
    public BillAdjustRecord usageUnit(String usageUnit) {
        this.usageUnit = usageUnit;
        return this;
    }


    /**
     * set 操作类型 1 调整金额 2 调整用量 3 调账
     *
     * @param opType
     */
    public BillAdjustRecord opType(Integer opType) {
        this.opType = opType;
        return this;
    }


    /**
     * set 调整月份(yyyyMM)
     *
     * @param billDate
     */
    public BillAdjustRecord billDate(Integer billDate) {
        this.billDate = billDate;
        return this;
    }


    /**
     * set 状态 1调整中 2调整完成 3 失败
     *
     * @param state
     */
    public BillAdjustRecord state(Integer state) {
        this.state = state;
        return this;
    }


    /**
     * set 调整原因
     *
     * @param reason
     */
    public BillAdjustRecord reason(String reason) {
        this.reason = reason;
        return this;
    }


    /**
     * set 附件1名称
     *
     * @param file1Name
     */
    public BillAdjustRecord file1Name(String file1Name) {
        this.file1Name = file1Name;
        return this;
    }


    /**
     * set 附件1url
     *
     * @param file1Url
     */
    public BillAdjustRecord file1Url(String file1Url) {
        this.file1Url = file1Url;
        return this;
    }


    /**
     * set 附件2名称
     *
     * @param file2Name
     */
    public BillAdjustRecord file2Name(String file2Name) {
        this.file2Name = file2Name;
        return this;
    }


    /**
     * set 附件2url
     *
     * @param file2Url
     */
    public BillAdjustRecord file2Url(String file2Url) {
        this.file2Url = file2Url;
        return this;
    }


    /**
     * set 附件3名称
     *
     * @param file3Name
     */
    public BillAdjustRecord file3Name(String file3Name) {
        this.file3Name = file3Name;
        return this;
    }


    /**
     * set 附件3url
     *
     * @param file3Url
     */
    public BillAdjustRecord file3Url(String file3Url) {
        this.file3Url = file3Url;
        return this;
    }


    /**
     * set erp
     *
     * @param erp
     */
    public BillAdjustRecord erp(String erp) {
        this.erp = erp;
        return this;
    }


    /**
     * set createTime
     *
     * @param createTime
     */
    public BillAdjustRecord createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set updateTime
     *
     * @param updateTime
     */
    public BillAdjustRecord updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}