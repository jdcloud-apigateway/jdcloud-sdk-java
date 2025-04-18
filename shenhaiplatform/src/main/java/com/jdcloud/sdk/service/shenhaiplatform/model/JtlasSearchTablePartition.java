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
 * jtlasSearchTablePartition
 */
public class JtlasSearchTablePartition  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分区名称
     */
    private String partName;

    /**
     * 分区存储路径
     */
    private String location;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 分区大小
     */
    private Long totalSize;

    /**
     * 分区行数
     */
    private Long numRow;

    /**
     * 原始数据大小
     */
    private Long rawDataSize;



    /**
     * get 分区名称
     *
     * @return
     */
    public String getPartName() {
        return partName;
    }

    /**
     * set 分区名称
     *
     * @param partName
     */
    public void setPartName(String partName) {
        this.partName = partName;
    }


    /**
     * get 分区存储路径
     *
     * @return
     */
    public String getLocation() {
        return location;
    }

    /**
     * set 分区存储路径
     *
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 分区大小
     *
     * @return
     */
    public Long getTotalSize() {
        return totalSize;
    }

    /**
     * set 分区大小
     *
     * @param totalSize
     */
    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }


    /**
     * get 分区行数
     *
     * @return
     */
    public Long getNumRow() {
        return numRow;
    }

    /**
     * set 分区行数
     *
     * @param numRow
     */
    public void setNumRow(Long numRow) {
        this.numRow = numRow;
    }


    /**
     * get 原始数据大小
     *
     * @return
     */
    public Long getRawDataSize() {
        return rawDataSize;
    }

    /**
     * set 原始数据大小
     *
     * @param rawDataSize
     */
    public void setRawDataSize(Long rawDataSize) {
        this.rawDataSize = rawDataSize;
    }



    /**
     * set 分区名称
     *
     * @param partName
     */
    public JtlasSearchTablePartition partName(String partName) {
        this.partName = partName;
        return this;
    }


    /**
     * set 分区存储路径
     *
     * @param location
     */
    public JtlasSearchTablePartition location(String location) {
        this.location = location;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public JtlasSearchTablePartition createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 分区大小
     *
     * @param totalSize
     */
    public JtlasSearchTablePartition totalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }


    /**
     * set 分区行数
     *
     * @param numRow
     */
    public JtlasSearchTablePartition numRow(Long numRow) {
        this.numRow = numRow;
        return this;
    }


    /**
     * set 原始数据大小
     *
     * @param rawDataSize
     */
    public JtlasSearchTablePartition rawDataSize(Long rawDataSize) {
        this.rawDataSize = rawDataSize;
        return this;
    }


}