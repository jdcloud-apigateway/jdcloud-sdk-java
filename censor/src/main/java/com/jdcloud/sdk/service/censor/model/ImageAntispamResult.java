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
 * 图片检测相关接口
 * API related to image scan
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.censor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * imageAntispamResult
 */
public class ImageAntispamResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片名称(或图片标识)
     */
    private String name;

    /**
     * 本次请求数据标识，可以根据该标识查询数据最新结果
     */
    private String taskId;

    /**
     * 图片检测状态码，定义为：0：检测成功，610：图片下载失败，620：图片格式错误，630：其它
     */
    private Integer status;

    /**
     * 建议动作，2：建议删除，1：建议审核，0：建议通过
     */
    private Integer action;

    /**
     * 审核模式，0：纯机审，1：机审+部分人审，2：机审+全量人审
     */
    private Integer censorType;

    /**
     * 策略版本号，策略调整后会更新，可用于追溯机审调优效果
     */
    private String strategyVersion;

    /**
     * 分类信息
     */
    private List<AntispamLabelItem> labels;


    /**
     * get 图片名称(或图片标识)
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 图片名称(或图片标识)
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 本次请求数据标识，可以根据该标识查询数据最新结果
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 本次请求数据标识，可以根据该标识查询数据最新结果
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * get 图片检测状态码，定义为：0：检测成功，610：图片下载失败，620：图片格式错误，630：其它
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 图片检测状态码，定义为：0：检测成功，610：图片下载失败，620：图片格式错误，630：其它
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 建议动作，2：建议删除，1：建议审核，0：建议通过
     *
     * @return
     */
    public Integer getAction() {
        return action;
    }

    /**
     * set 建议动作，2：建议删除，1：建议审核，0：建议通过
     *
     * @param action
     */
    public void setAction(Integer action) {
        this.action = action;
    }

    /**
     * get 审核模式，0：纯机审，1：机审+部分人审，2：机审+全量人审
     *
     * @return
     */
    public Integer getCensorType() {
        return censorType;
    }

    /**
     * set 审核模式，0：纯机审，1：机审+部分人审，2：机审+全量人审
     *
     * @param censorType
     */
    public void setCensorType(Integer censorType) {
        this.censorType = censorType;
    }

    /**
     * get 策略版本号，策略调整后会更新，可用于追溯机审调优效果
     *
     * @return
     */
    public String getStrategyVersion() {
        return strategyVersion;
    }

    /**
     * set 策略版本号，策略调整后会更新，可用于追溯机审调优效果
     *
     * @param strategyVersion
     */
    public void setStrategyVersion(String strategyVersion) {
        this.strategyVersion = strategyVersion;
    }

    /**
     * get 分类信息
     *
     * @return
     */
    public List<AntispamLabelItem> getLabels() {
        return labels;
    }

    /**
     * set 分类信息
     *
     * @param labels
     */
    public void setLabels(List<AntispamLabelItem> labels) {
        this.labels = labels;
    }


    /**
     * set 图片名称(或图片标识)
     *
     * @param name
     */
    public ImageAntispamResult name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 本次请求数据标识，可以根据该标识查询数据最新结果
     *
     * @param taskId
     */
    public ImageAntispamResult taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * set 图片检测状态码，定义为：0：检测成功，610：图片下载失败，620：图片格式错误，630：其它
     *
     * @param status
     */
    public ImageAntispamResult status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 建议动作，2：建议删除，1：建议审核，0：建议通过
     *
     * @param action
     */
    public ImageAntispamResult action(Integer action) {
        this.action = action;
        return this;
    }

    /**
     * set 审核模式，0：纯机审，1：机审+部分人审，2：机审+全量人审
     *
     * @param censorType
     */
    public ImageAntispamResult censorType(Integer censorType) {
        this.censorType = censorType;
        return this;
    }

    /**
     * set 策略版本号，策略调整后会更新，可用于追溯机审调优效果
     *
     * @param strategyVersion
     */
    public ImageAntispamResult strategyVersion(String strategyVersion) {
        this.strategyVersion = strategyVersion;
        return this;
    }

    /**
     * set 分类信息
     *
     * @param labels
     */
    public ImageAntispamResult labels(List<AntispamLabelItem> labels) {
        this.labels = labels;
        return this;
    }


    /**
     * add item to 分类信息
     *
     * @param label
     */
    public void addLabel(AntispamLabelItem label) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(label);
    }

}