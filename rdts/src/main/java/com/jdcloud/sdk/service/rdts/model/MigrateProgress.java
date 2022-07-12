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

package com.jdcloud.sdk.service.rdts.model;


/**
 * 迁移进度
 */
public class MigrateProgress  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 源端key数量，即key总数量
     */
    private Long sourceKeysCount;

    /**
     * 目的端key数量，即已迁移的key数量
     */
    private Long targetKeysCount;

    /**
     * 迁移key数量百分比
     */
    private Float percent;

    /**
     * 数据校验状态（CheckPhaseInit：初始化，CheckPhaseRunning：检验中，CheckPhaseFinished：验证完成）
     */
    private String checkPhase;

    /**
     * 迁移启动时间(ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ)
     */
    private String startTime;


    /**
     * get 源端key数量，即key总数量
     *
     * @return
     */
    public Long getSourceKeysCount() {
        return sourceKeysCount;
    }

    /**
     * set 源端key数量，即key总数量
     *
     * @param sourceKeysCount
     */
    public void setSourceKeysCount(Long sourceKeysCount) {
        this.sourceKeysCount = sourceKeysCount;
    }

    /**
     * get 目的端key数量，即已迁移的key数量
     *
     * @return
     */
    public Long getTargetKeysCount() {
        return targetKeysCount;
    }

    /**
     * set 目的端key数量，即已迁移的key数量
     *
     * @param targetKeysCount
     */
    public void setTargetKeysCount(Long targetKeysCount) {
        this.targetKeysCount = targetKeysCount;
    }

    /**
     * get 迁移key数量百分比
     *
     * @return
     */
    public Float getPercent() {
        return percent;
    }

    /**
     * set 迁移key数量百分比
     *
     * @param percent
     */
    public void setPercent(Float percent) {
        this.percent = percent;
    }

    /**
     * get 数据校验状态（CheckPhaseInit：初始化，CheckPhaseRunning：检验中，CheckPhaseFinished：验证完成）
     *
     * @return
     */
    public String getCheckPhase() {
        return checkPhase;
    }

    /**
     * set 数据校验状态（CheckPhaseInit：初始化，CheckPhaseRunning：检验中，CheckPhaseFinished：验证完成）
     *
     * @param checkPhase
     */
    public void setCheckPhase(String checkPhase) {
        this.checkPhase = checkPhase;
    }

    /**
     * get 迁移启动时间(ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ)
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 迁移启动时间(ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ)
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * set 源端key数量，即key总数量
     *
     * @param sourceKeysCount
     */
    public MigrateProgress sourceKeysCount(Long sourceKeysCount) {
        this.sourceKeysCount = sourceKeysCount;
        return this;
    }

    /**
     * set 目的端key数量，即已迁移的key数量
     *
     * @param targetKeysCount
     */
    public MigrateProgress targetKeysCount(Long targetKeysCount) {
        this.targetKeysCount = targetKeysCount;
        return this;
    }

    /**
     * set 迁移key数量百分比
     *
     * @param percent
     */
    public MigrateProgress percent(Float percent) {
        this.percent = percent;
        return this;
    }

    /**
     * set 数据校验状态（CheckPhaseInit：初始化，CheckPhaseRunning：检验中，CheckPhaseFinished：验证完成）
     *
     * @param checkPhase
     */
    public MigrateProgress checkPhase(String checkPhase) {
        this.checkPhase = checkPhase;
        return this;
    }

    /**
     * set 迁移启动时间(ISO 8601标准的UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ)
     *
     * @param startTime
     */
    public MigrateProgress startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


}