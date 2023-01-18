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

package com.jdcloud.sdk.service.pod.model;


/**
 * configFileToPathSource
 */
public class ConfigFileToPathSource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 配置文件Key
     */
    private String key;

    /**
     * 相关文件路径
     */
    private String path;

    /**
     * 文件目录权限
     */
    private String mode;



    /**
     * get 配置文件Key
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set 配置文件Key
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }


    /**
     * get 相关文件路径
     *
     * @return
     */
    public String getPath() {
        return path;
    }

    /**
     * set 相关文件路径
     *
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }


    /**
     * get 文件目录权限
     *
     * @return
     */
    public String getMode() {
        return mode;
    }

    /**
     * set 文件目录权限
     *
     * @param mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }



    /**
     * set 配置文件Key
     *
     * @param key
     */
    public ConfigFileToPathSource key(String key) {
        this.key = key;
        return this;
    }


    /**
     * set 相关文件路径
     *
     * @param path
     */
    public ConfigFileToPathSource path(String path) {
        this.path = path;
        return this;
    }


    /**
     * set 文件目录权限
     *
     * @param mode
     */
    public ConfigFileToPathSource mode(String mode) {
        this.mode = mode;
        return this;
    }


}