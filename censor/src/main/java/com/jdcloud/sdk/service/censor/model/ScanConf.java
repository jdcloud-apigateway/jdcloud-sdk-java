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

package com.jdcloud.sdk.service.censor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * scanConf
 */
public class ScanConf  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 0-不开启检测，1-开启检测
     * Required:true
     */
    @Required
    private Integer enable;

    /**
     * 检测场景，porn-涉黄，terrorism-涉政暴恐，enable为1时必须
     */
    private List<String> scense;

    /**
     * 0-不开启自动冻结，1-开启自动冻结
     */
    private Integer frozen;

    /**
     * 自动冻结阈值，视频检测时阈值0表示不冻结，1表示违规冻结，不对阈值进行比较
     */
    private FrozenThreshold threshold;


    /**
     * get 0-不开启检测，1-开启检测
     *
     * @return
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * set 0-不开启检测，1-开启检测
     *
     * @param enable
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * get 检测场景，porn-涉黄，terrorism-涉政暴恐，enable为1时必须
     *
     * @return
     */
    public List<String> getScense() {
        return scense;
    }

    /**
     * set 检测场景，porn-涉黄，terrorism-涉政暴恐，enable为1时必须
     *
     * @param scense
     */
    public void setScense(List<String> scense) {
        this.scense = scense;
    }

    /**
     * get 0-不开启自动冻结，1-开启自动冻结
     *
     * @return
     */
    public Integer getFrozen() {
        return frozen;
    }

    /**
     * set 0-不开启自动冻结，1-开启自动冻结
     *
     * @param frozen
     */
    public void setFrozen(Integer frozen) {
        this.frozen = frozen;
    }

    /**
     * get 自动冻结阈值，视频检测时阈值0表示不冻结，1表示违规冻结，不对阈值进行比较
     *
     * @return
     */
    public FrozenThreshold getThreshold() {
        return threshold;
    }

    /**
     * set 自动冻结阈值，视频检测时阈值0表示不冻结，1表示违规冻结，不对阈值进行比较
     *
     * @param threshold
     */
    public void setThreshold(FrozenThreshold threshold) {
        this.threshold = threshold;
    }


    /**
     * set 0-不开启检测，1-开启检测
     *
     * @param enable
     */
    public ScanConf enable(Integer enable) {
        this.enable = enable;
        return this;
    }

    /**
     * set 检测场景，porn-涉黄，terrorism-涉政暴恐，enable为1时必须
     *
     * @param scense
     */
    public ScanConf scense(List<String> scense) {
        this.scense = scense;
        return this;
    }

    /**
     * set 0-不开启自动冻结，1-开启自动冻结
     *
     * @param frozen
     */
    public ScanConf frozen(Integer frozen) {
        this.frozen = frozen;
        return this;
    }

    /**
     * set 自动冻结阈值，视频检测时阈值0表示不冻结，1表示违规冻结，不对阈值进行比较
     *
     * @param threshold
     */
    public ScanConf threshold(FrozenThreshold threshold) {
        this.threshold = threshold;
        return this;
    }


    /**
     * add item to 检测场景，porn-涉黄，terrorism-涉政暴恐，enable为1时必须
     *
     * @param scense
     */
    public void addScense(String scense) {
        if (this.scense == null) {
            this.scense = new ArrayList<>();
        }
        this.scense.add(scense);
    }

}