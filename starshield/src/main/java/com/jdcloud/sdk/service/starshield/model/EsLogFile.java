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

package com.jdcloud.sdk.service.starshield.model;


/**
 * esLogFile
 */
public class EsLogFile  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志唯一key值
     */
    private String key;

    /**
     * 日志文件名称
     */
    private String fileName;

    /**
     * 日志更新时间
     */
    private Integer updateTime;

    /**
     * 文件大小
     */
    private Integer size;



    /**
     * get 日志唯一key值
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set 日志唯一key值
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }


    /**
     * get 日志文件名称
     *
     * @return
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * set 日志文件名称
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * get 日志更新时间
     *
     * @return
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * set 日志更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 文件大小
     *
     * @return
     */
    public Integer getSize() {
        return size;
    }

    /**
     * set 文件大小
     *
     * @param size
     */
    public void setSize(Integer size) {
        this.size = size;
    }



    /**
     * set 日志唯一key值
     *
     * @param key
     */
    public EsLogFile key(String key) {
        this.key = key;
        return this;
    }


    /**
     * set 日志文件名称
     *
     * @param fileName
     */
    public EsLogFile fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }


    /**
     * set 日志更新时间
     *
     * @param updateTime
     */
    public EsLogFile updateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 文件大小
     *
     * @param size
     */
    public EsLogFile size(Integer size) {
        this.size = size;
        return this;
    }


}