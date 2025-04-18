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
 * DataLoadController
 * 流程画布DataLoadController接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.shenhaiplatform.model.PartitionInfo;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 数据上传
 */
public class UranusTableDataLoadRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件路径（key）
     * Required:true
     */
    @Required
    private String fileKey;

    /**
     * 文件类型：csv、text、xls、xlsx
     * Required:true
     */
    @Required
    private String fileType;

    /**
     * 分隔符: en-comma 英文逗号，en-semicolon 英文分号，space 空格，pipe 竖线，hash 井号，and 与号，line-feed-lf 换行符（UNIX），line-feed-crlf 换行符（Windows）
     */
    private String delimiter;

    /**
     * 字符集: GBK、UTF-8、ISO-8859-1
     */
    private String characterSet;

    /**
     * 导入起始行
     */
    private Integer startRow;

    /**
     * 项目环境: prod 生产环境、dev开发环境
     * Required:true
     */
    @Required
    private String projectEnv;

    /**
     * 项目编码
     * Required:true
     */
    @Required
    private String projectCode;

    /**
     * 目标表名
     * Required:true
     */
    @Required
    private String tableName;

    /**
     * 导入分区，如果是分区表则必传
     */
    
    private List<PartitionInfo> partitionInfos;
    /**
     * 导入策略：append 追加、overwrite 覆盖
     * Required:true
     */
    @Required
    private String importStrategy;

    /**
     * 资源组编码
     * Required:true
     */
    @Required
    private String resourceCode;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private String appName;



    /**
     * get 文件路径（key）
     *
     * @return
     */
    public String getFileKey() {
        return fileKey;
    }

    /**
     * set 文件路径（key）
     *
     * @param fileKey
     */
    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }


    /**
     * get 文件类型：csv、text、xls、xlsx
     *
     * @return
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * set 文件类型：csv、text、xls、xlsx
     *
     * @param fileType
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }


    /**
     * get 分隔符: en-comma 英文逗号，en-semicolon 英文分号，space 空格，pipe 竖线，hash 井号，and 与号，line-feed-lf 换行符（UNIX），line-feed-crlf 换行符（Windows）
     *
     * @return
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * set 分隔符: en-comma 英文逗号，en-semicolon 英文分号，space 空格，pipe 竖线，hash 井号，and 与号，line-feed-lf 换行符（UNIX），line-feed-crlf 换行符（Windows）
     *
     * @param delimiter
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }


    /**
     * get 字符集: GBK、UTF-8、ISO-8859-1
     *
     * @return
     */
    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * set 字符集: GBK、UTF-8、ISO-8859-1
     *
     * @param characterSet
     */
    public void setCharacterSet(String characterSet) {
        this.characterSet = characterSet;
    }


    /**
     * get 导入起始行
     *
     * @return
     */
    public Integer getStartRow() {
        return startRow;
    }

    /**
     * set 导入起始行
     *
     * @param startRow
     */
    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }


    /**
     * get 项目环境: prod 生产环境、dev开发环境
     *
     * @return
     */
    public String getProjectEnv() {
        return projectEnv;
    }

    /**
     * set 项目环境: prod 生产环境、dev开发环境
     *
     * @param projectEnv
     */
    public void setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
    }


    /**
     * get 项目编码
     *
     * @return
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * set 项目编码
     *
     * @param projectCode
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }


    /**
     * get 目标表名
     *
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * set 目标表名
     *
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    /**
    * get 导入分区，如果是分区表则必传
    *
    * @return
    */
    public List<PartitionInfo> getPartitionInfos() {
        return partitionInfos;
    }

    /**
    * set 导入分区，如果是分区表则必传
    *
    * @param partitionInfos
    */
    public void setPartitionInfos(List<PartitionInfo> partitionInfos) {
        this.partitionInfos = partitionInfos;
    }


    /**
     * get 导入策略：append 追加、overwrite 覆盖
     *
     * @return
     */
    public String getImportStrategy() {
        return importStrategy;
    }

    /**
     * set 导入策略：append 追加、overwrite 覆盖
     *
     * @param importStrategy
     */
    public void setImportStrategy(String importStrategy) {
        this.importStrategy = importStrategy;
    }


    /**
     * get 资源组编码
     *
     * @return
     */
    public String getResourceCode() {
        return resourceCode;
    }

    /**
     * set 资源组编码
     *
     * @param resourceCode
     */
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }



    /**
     * set 文件路径（key）
     *
     * @param fileKey
     */
    public UranusTableDataLoadRequest fileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }


    /**
     * set 文件类型：csv、text、xls、xlsx
     *
     * @param fileType
     */
    public UranusTableDataLoadRequest fileType(String fileType) {
        this.fileType = fileType;
        return this;
    }


    /**
     * set 分隔符: en-comma 英文逗号，en-semicolon 英文分号，space 空格，pipe 竖线，hash 井号，and 与号，line-feed-lf 换行符（UNIX），line-feed-crlf 换行符（Windows）
     *
     * @param delimiter
     */
    public UranusTableDataLoadRequest delimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }


    /**
     * set 字符集: GBK、UTF-8、ISO-8859-1
     *
     * @param characterSet
     */
    public UranusTableDataLoadRequest characterSet(String characterSet) {
        this.characterSet = characterSet;
        return this;
    }


    /**
     * set 导入起始行
     *
     * @param startRow
     */
    public UranusTableDataLoadRequest startRow(Integer startRow) {
        this.startRow = startRow;
        return this;
    }


    /**
     * set 项目环境: prod 生产环境、dev开发环境
     *
     * @param projectEnv
     */
    public UranusTableDataLoadRequest projectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }


    /**
     * set 项目编码
     *
     * @param projectCode
     */
    public UranusTableDataLoadRequest projectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }


    /**
     * set 目标表名
     *
     * @param tableName
     */
    public UranusTableDataLoadRequest tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }


    /**
    * set 导入分区，如果是分区表则必传
    *
    * @param partitionInfos
    */
    public UranusTableDataLoadRequest partitionInfos(List<PartitionInfo> partitionInfos) {
        this.partitionInfos = partitionInfos;
        return this;
    }


    /**
     * set 导入策略：append 追加、overwrite 覆盖
     *
     * @param importStrategy
     */
    public UranusTableDataLoadRequest importStrategy(String importStrategy) {
        this.importStrategy = importStrategy;
        return this;
    }


    /**
     * set 资源组编码
     *
     * @param resourceCode
     */
    public UranusTableDataLoadRequest resourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public UranusTableDataLoadRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public UranusTableDataLoadRequest appName(String appName) {
        this.appName = appName;
        return this;
    }



    /**
     * add item to 导入分区，如果是分区表则必传
     *
     * @param partitionInfo
     */
    public void addPartitionInfo(PartitionInfo partitionInfo) {
        if (this.partitionInfos == null) {
            this.partitionInfos = new ArrayList<>();
        }
        this.partitionInfos.add(partitionInfo);
    }
}