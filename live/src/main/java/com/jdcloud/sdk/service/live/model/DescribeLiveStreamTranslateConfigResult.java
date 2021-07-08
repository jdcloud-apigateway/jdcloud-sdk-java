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
 * Live-Video
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.live.model.TranslateTemplateConfig;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询翻译模板配置
- 翻译模板配置按照 域名,应用,流 3级配置添加,以最小的粒度配置生效原则
- 域名、应用、流 依次粒度递减 即: 域名&gt;应用&gt;流
- 该查询旨在查询域名、应用、流最终生效的翻译模板配置,并非各级的模板绑定情况

 */
public class DescribeLiveStreamTranslateConfigResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页码
     */
    private Integer pageNumber;

    /**
     * 每页数量
     */
    private Integer pageSize;

    /**
     * 查询总数
     */
    private Integer totalCount;

    /**
     * translateConfigs
     */
    private List<TranslateTemplateConfig> translateConfigs;


    /**
     * get 当前页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 每页数量
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页数量
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 查询总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 查询总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get translateConfigs
     *
     * @return
     */
    public List<TranslateTemplateConfig> getTranslateConfigs() {
        return translateConfigs;
    }

    /**
     * set translateConfigs
     *
     * @param translateConfigs
     */
    public void setTranslateConfigs(List<TranslateTemplateConfig> translateConfigs) {
        this.translateConfigs = translateConfigs;
    }


    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public DescribeLiveStreamTranslateConfigResult pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 每页数量
     *
     * @param pageSize
     */
    public DescribeLiveStreamTranslateConfigResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 查询总数
     *
     * @param totalCount
     */
    public DescribeLiveStreamTranslateConfigResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set translateConfigs
     *
     * @param translateConfigs
     */
    public DescribeLiveStreamTranslateConfigResult translateConfigs(List<TranslateTemplateConfig> translateConfigs) {
        this.translateConfigs = translateConfigs;
        return this;
    }


    /**
     * add item to translateConfigs
     *
     * @param translateConfig
     */
    public void addTranslateConfig(TranslateTemplateConfig translateConfig) {
        if (this.translateConfigs == null) {
            this.translateConfigs = new ArrayList<>();
        }
        this.translateConfigs.add(translateConfig);
    }

}