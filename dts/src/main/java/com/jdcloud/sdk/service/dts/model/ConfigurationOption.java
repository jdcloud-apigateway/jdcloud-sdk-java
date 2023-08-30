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

package com.jdcloud.sdk.service.dts.model;

import java.util.List;
import java.util.ArrayList;

/**
 * configurationOption
 */
public class ConfigurationOption  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务配置属性（废弃）
     */
    
    private List<Property> taskOption;
    /**
     * 数据传输初始化类型
     */
    private Property transmissionMode;

    /**
     * 任务设置项
     */
    
    private List<Property> options;
    /**
     * 传输对象配置支持的属性
     */
    private TransmissionObjectOption transmissionObjectOption;

    /**
     * 任务自定义设置项
     */
    private CustomOptions customOptions;



    /**
    * get 任务配置属性（废弃）
    *
    * @return
    */
    public List<Property> getTaskOption() {
        return taskOption;
    }

    /**
    * set 任务配置属性（废弃）
    *
    * @param taskOption
    */
    public void setTaskOption(List<Property> taskOption) {
        this.taskOption = taskOption;
    }


    /**
     * get 数据传输初始化类型
     *
     * @return
     */
    public Property getTransmissionMode() {
        return transmissionMode;
    }

    /**
     * set 数据传输初始化类型
     *
     * @param transmissionMode
     */
    public void setTransmissionMode(Property transmissionMode) {
        this.transmissionMode = transmissionMode;
    }


    /**
    * get 任务设置项
    *
    * @return
    */
    public List<Property> getOptions() {
        return options;
    }

    /**
    * set 任务设置项
    *
    * @param options
    */
    public void setOptions(List<Property> options) {
        this.options = options;
    }


    /**
     * get 传输对象配置支持的属性
     *
     * @return
     */
    public TransmissionObjectOption getTransmissionObjectOption() {
        return transmissionObjectOption;
    }

    /**
     * set 传输对象配置支持的属性
     *
     * @param transmissionObjectOption
     */
    public void setTransmissionObjectOption(TransmissionObjectOption transmissionObjectOption) {
        this.transmissionObjectOption = transmissionObjectOption;
    }


    /**
     * get 任务自定义设置项
     *
     * @return
     */
    public CustomOptions getCustomOptions() {
        return customOptions;
    }

    /**
     * set 任务自定义设置项
     *
     * @param customOptions
     */
    public void setCustomOptions(CustomOptions customOptions) {
        this.customOptions = customOptions;
    }



    /**
    * set 任务配置属性（废弃）
    *
    * @param taskOption
    */
    public ConfigurationOption taskOption(List<Property> taskOption) {
        this.taskOption = taskOption;
        return this;
    }


    /**
     * set 数据传输初始化类型
     *
     * @param transmissionMode
     */
    public ConfigurationOption transmissionMode(Property transmissionMode) {
        this.transmissionMode = transmissionMode;
        return this;
    }


    /**
    * set 任务设置项
    *
    * @param options
    */
    public ConfigurationOption options(List<Property> options) {
        this.options = options;
        return this;
    }


    /**
     * set 传输对象配置支持的属性
     *
     * @param transmissionObjectOption
     */
    public ConfigurationOption transmissionObjectOption(TransmissionObjectOption transmissionObjectOption) {
        this.transmissionObjectOption = transmissionObjectOption;
        return this;
    }


    /**
     * set 任务自定义设置项
     *
     * @param customOptions
     */
    public ConfigurationOption customOptions(CustomOptions customOptions) {
        this.customOptions = customOptions;
        return this;
    }



    /**
     * add item to 任务配置属性（废弃）
     *
     * @param taskOption
     */
    public void addTaskOption(Property taskOption) {
        if (this.taskOption == null) {
            this.taskOption = new ArrayList<>();
        }
        this.taskOption.add(taskOption);
    }

    /**
     * add item to 任务设置项
     *
     * @param option
     */
    public void addOption(Property option) {
        if (this.options == null) {
            this.options = new ArrayList<>();
        }
        this.options.add(option);
    }
}