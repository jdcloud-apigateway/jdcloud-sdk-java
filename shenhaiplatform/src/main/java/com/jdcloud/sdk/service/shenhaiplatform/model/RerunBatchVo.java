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

package com.jdcloud.sdk.service.shenhaiplatform.model;


/**
 * rerunBatchVo
 */
public class RerunBatchVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 批次id
     */
    private Integer id;

    /**
     * 重跑原因
     */
    private String remark;

    /**
     * 操作人员
     */
    private String operator;

    /**
     * 状态
     */
    private String status;

    /**
     * 状态-展示
     */
    private String statusLabel;

    /**
     * 提交成功数量
     */
    private Integer submitSuccessCount;

    /**
     * 提交失败数量
     */
    private Integer submitFailCount;

    /**
     * 提交待处理数量
     */
    private Integer submitPendingCount;

    /**
     * 提交中数量
     */
    private Integer submitSubmittingCount;

    /**
     * 提交总数
     */
    private Integer submitTotalCount;

    /**
     * 操作时间
     */
    private Long createTime;



    /**
     * get 批次id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 批次id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get 重跑原因
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 重跑原因
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }


    /**
     * get 操作人员
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set 操作人员
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }


    /**
     * get 状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 状态-展示
     *
     * @return
     */
    public String getStatusLabel() {
        return statusLabel;
    }

    /**
     * set 状态-展示
     *
     * @param statusLabel
     */
    public void setStatusLabel(String statusLabel) {
        this.statusLabel = statusLabel;
    }


    /**
     * get 提交成功数量
     *
     * @return
     */
    public Integer getSubmitSuccessCount() {
        return submitSuccessCount;
    }

    /**
     * set 提交成功数量
     *
     * @param submitSuccessCount
     */
    public void setSubmitSuccessCount(Integer submitSuccessCount) {
        this.submitSuccessCount = submitSuccessCount;
    }


    /**
     * get 提交失败数量
     *
     * @return
     */
    public Integer getSubmitFailCount() {
        return submitFailCount;
    }

    /**
     * set 提交失败数量
     *
     * @param submitFailCount
     */
    public void setSubmitFailCount(Integer submitFailCount) {
        this.submitFailCount = submitFailCount;
    }


    /**
     * get 提交待处理数量
     *
     * @return
     */
    public Integer getSubmitPendingCount() {
        return submitPendingCount;
    }

    /**
     * set 提交待处理数量
     *
     * @param submitPendingCount
     */
    public void setSubmitPendingCount(Integer submitPendingCount) {
        this.submitPendingCount = submitPendingCount;
    }


    /**
     * get 提交中数量
     *
     * @return
     */
    public Integer getSubmitSubmittingCount() {
        return submitSubmittingCount;
    }

    /**
     * set 提交中数量
     *
     * @param submitSubmittingCount
     */
    public void setSubmitSubmittingCount(Integer submitSubmittingCount) {
        this.submitSubmittingCount = submitSubmittingCount;
    }


    /**
     * get 提交总数
     *
     * @return
     */
    public Integer getSubmitTotalCount() {
        return submitTotalCount;
    }

    /**
     * set 提交总数
     *
     * @param submitTotalCount
     */
    public void setSubmitTotalCount(Integer submitTotalCount) {
        this.submitTotalCount = submitTotalCount;
    }


    /**
     * get 操作时间
     *
     * @return
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * set 操作时间
     *
     * @param createTime
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }



    /**
     * set 批次id
     *
     * @param id
     */
    public RerunBatchVo id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set 重跑原因
     *
     * @param remark
     */
    public RerunBatchVo remark(String remark) {
        this.remark = remark;
        return this;
    }


    /**
     * set 操作人员
     *
     * @param operator
     */
    public RerunBatchVo operator(String operator) {
        this.operator = operator;
        return this;
    }


    /**
     * set 状态
     *
     * @param status
     */
    public RerunBatchVo status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 状态-展示
     *
     * @param statusLabel
     */
    public RerunBatchVo statusLabel(String statusLabel) {
        this.statusLabel = statusLabel;
        return this;
    }


    /**
     * set 提交成功数量
     *
     * @param submitSuccessCount
     */
    public RerunBatchVo submitSuccessCount(Integer submitSuccessCount) {
        this.submitSuccessCount = submitSuccessCount;
        return this;
    }


    /**
     * set 提交失败数量
     *
     * @param submitFailCount
     */
    public RerunBatchVo submitFailCount(Integer submitFailCount) {
        this.submitFailCount = submitFailCount;
        return this;
    }


    /**
     * set 提交待处理数量
     *
     * @param submitPendingCount
     */
    public RerunBatchVo submitPendingCount(Integer submitPendingCount) {
        this.submitPendingCount = submitPendingCount;
        return this;
    }


    /**
     * set 提交中数量
     *
     * @param submitSubmittingCount
     */
    public RerunBatchVo submitSubmittingCount(Integer submitSubmittingCount) {
        this.submitSubmittingCount = submitSubmittingCount;
        return this;
    }


    /**
     * set 提交总数
     *
     * @param submitTotalCount
     */
    public RerunBatchVo submitTotalCount(Integer submitTotalCount) {
        this.submitTotalCount = submitTotalCount;
        return this;
    }


    /**
     * set 操作时间
     *
     * @param createTime
     */
    public RerunBatchVo createTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }


}