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
 * Classification
 * 敏感数据保护-数据分级分类
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dcap.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.dcap.model.LevelSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改敏感数据分级策略
 */
public class ModifyLevelRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 敏感数据分级描述
     * Required:true
     */
    @Required
    private LevelSpec levelSpec;

    /**
     * 分级 ID
     * Required:true
     */
    @Required
    private Integer levelId;


    /**
     * get 敏感数据分级描述
     *
     * @return
     */
    public LevelSpec getLevelSpec() {
        return levelSpec;
    }

    /**
     * set 敏感数据分级描述
     *
     * @param levelSpec
     */
    public void setLevelSpec(LevelSpec levelSpec) {
        this.levelSpec = levelSpec;
    }

    /**
     * get 分级 ID
     *
     * @return
     */
    public Integer getLevelId() {
        return levelId;
    }

    /**
     * set 分级 ID
     *
     * @param levelId
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }


    /**
     * set 敏感数据分级描述
     *
     * @param levelSpec
     */
    public ModifyLevelRequest levelSpec(LevelSpec levelSpec) {
        this.levelSpec = levelSpec;
        return this;
    }

    /**
     * set 分级 ID
     *
     * @param levelId
     */
    public ModifyLevelRequest levelId(Integer levelId) {
        this.levelId = levelId;
        return this;
    }


}