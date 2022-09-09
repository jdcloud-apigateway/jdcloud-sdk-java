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

package com.jdcloud.sdk.service.dms.model;


/**
 * dmsSubFileImport
 */
public class DmsSubFileImport  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * parentId
     */
    private Integer parentId;

    /**
     * 分片号
     */
    private Integer fileIndex;

    /**
     * 上传状态
     */
    private String uploadStatus;

    /**
     * MD5
     */
    private String chkSumMd5;

    /**
     * 开始时间
     */
    private String beginDate;

    /**
     * 完成时间
     */
    private String finishDate;



    /**
     * get id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get parentId
     *
     * @return
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * set parentId
     *
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }


    /**
     * get 分片号
     *
     * @return
     */
    public Integer getFileIndex() {
        return fileIndex;
    }

    /**
     * set 分片号
     *
     * @param fileIndex
     */
    public void setFileIndex(Integer fileIndex) {
        this.fileIndex = fileIndex;
    }


    /**
     * get 上传状态
     *
     * @return
     */
    public String getUploadStatus() {
        return uploadStatus;
    }

    /**
     * set 上传状态
     *
     * @param uploadStatus
     */
    public void setUploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
    }


    /**
     * get MD5
     *
     * @return
     */
    public String getChkSumMd5() {
        return chkSumMd5;
    }

    /**
     * set MD5
     *
     * @param chkSumMd5
     */
    public void setChkSumMd5(String chkSumMd5) {
        this.chkSumMd5 = chkSumMd5;
    }


    /**
     * get 开始时间
     *
     * @return
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * set 开始时间
     *
     * @param beginDate
     */
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }


    /**
     * get 完成时间
     *
     * @return
     */
    public String getFinishDate() {
        return finishDate;
    }

    /**
     * set 完成时间
     *
     * @param finishDate
     */
    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }



    /**
     * set id
     *
     * @param id
     */
    public DmsSubFileImport id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set parentId
     *
     * @param parentId
     */
    public DmsSubFileImport parentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }


    /**
     * set 分片号
     *
     * @param fileIndex
     */
    public DmsSubFileImport fileIndex(Integer fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }


    /**
     * set 上传状态
     *
     * @param uploadStatus
     */
    public DmsSubFileImport uploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
        return this;
    }


    /**
     * set MD5
     *
     * @param chkSumMd5
     */
    public DmsSubFileImport chkSumMd5(String chkSumMd5) {
        this.chkSumMd5 = chkSumMd5;
        return this;
    }


    /**
     * set 开始时间
     *
     * @param beginDate
     */
    public DmsSubFileImport beginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }


    /**
     * set 完成时间
     *
     * @param finishDate
     */
    public DmsSubFileImport finishDate(String finishDate) {
        this.finishDate = finishDate;
        return this;
    }


}