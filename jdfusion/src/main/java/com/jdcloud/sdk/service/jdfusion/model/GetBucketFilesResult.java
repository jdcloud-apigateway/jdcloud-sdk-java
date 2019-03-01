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
 * Oss-Bucket
 * 与OSS存储桶相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.jdfusion.model.OssFileInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 根据过滤条件，取得指定OSS存储桶上的文件列表
 */
public class GetBucketFilesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否已被截断（表示没有更多数据了）
     */
    private Boolean isTruncated;

    /**
     * 本次查询的起点（文件key值）
     */
    private String marker;

    /**
     * files
     */
    private List<OssFileInfo> files;


    /**
     * get 是否已被截断（表示没有更多数据了）
     *
     * @return
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * set 是否已被截断（表示没有更多数据了）
     *
     * @param isTruncated
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * get 本次查询的起点（文件key值）
     *
     * @return
     */
    public String getMarker() {
        return marker;
    }

    /**
     * set 本次查询的起点（文件key值）
     *
     * @param marker
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * get files
     *
     * @return
     */
    public List<OssFileInfo> getFiles() {
        return files;
    }

    /**
     * set files
     *
     * @param files
     */
    public void setFiles(List<OssFileInfo> files) {
        this.files = files;
    }


    /**
     * set 是否已被截断（表示没有更多数据了）
     *
     * @param isTruncated
     */
    public GetBucketFilesResult isTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * set 本次查询的起点（文件key值）
     *
     * @param marker
     */
    public GetBucketFilesResult marker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * set files
     *
     * @param files
     */
    public GetBucketFilesResult files(List<OssFileInfo> files) {
        this.files = files;
        return this;
    }


    /**
     * add item to files
     *
     * @param file
     */
    public void addFile(OssFileInfo file) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(file);
    }

}