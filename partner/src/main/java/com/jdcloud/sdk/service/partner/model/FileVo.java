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

package com.jdcloud.sdk.service.partner.model;


/**
 * fileVo
 */
public class FileVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件下载地址
     */
    private String url;

    /**
     * 文件唯一标识
     */
    private String fileUuid;



    /**
     * get 文件名称
     *
     * @return
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * set 文件名称
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * get 文件下载地址
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set 文件下载地址
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * get 文件唯一标识
     *
     * @return
     */
    public String getFileUuid() {
        return fileUuid;
    }

    /**
     * set 文件唯一标识
     *
     * @param fileUuid
     */
    public void setFileUuid(String fileUuid) {
        this.fileUuid = fileUuid;
    }



    /**
     * set 文件名称
     *
     * @param fileName
     */
    public FileVo fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }


    /**
     * set 文件下载地址
     *
     * @param url
     */
    public FileVo url(String url) {
        this.url = url;
        return this;
    }


    /**
     * set 文件唯一标识
     *
     * @param fileUuid
     */
    public FileVo fileUuid(String fileUuid) {
        this.fileUuid = fileUuid;
        return this;
    }


}