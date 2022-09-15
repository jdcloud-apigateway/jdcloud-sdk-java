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
 * Redis Instance API
 * 缓存Redis实例的创建、删除、修改基本信息、设置密码、变配、实例列表、备份、配置参数等接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.redis.model.ConfigItem;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看缓存Redis实例的当前配置参数
 */
public class DescribeInstanceConfigResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * unSupportConfigs
     */
    
    private List<String> unSupportConfigs;
    /**
     * instanceConfig
     */
    
    private List<ConfigItem> instanceConfig;


    /**
    * get unSupportConfigs
    *
    * @return
    */
    public List<String> getUnSupportConfigs() {
        return unSupportConfigs;
    }

    /**
    * set unSupportConfigs
    *
    * @param unSupportConfigs
    */
    public void setUnSupportConfigs(List<String> unSupportConfigs) {
        this.unSupportConfigs = unSupportConfigs;
    }


    /**
    * get instanceConfig
    *
    * @return
    */
    public List<ConfigItem> getInstanceConfig() {
        return instanceConfig;
    }

    /**
    * set instanceConfig
    *
    * @param instanceConfig
    */
    public void setInstanceConfig(List<ConfigItem> instanceConfig) {
        this.instanceConfig = instanceConfig;
    }



    /**
    * set unSupportConfigs
    *
    * @param unSupportConfigs
    */
    public DescribeInstanceConfigResult unSupportConfigs(List<String> unSupportConfigs) {
        this.unSupportConfigs = unSupportConfigs;
        return this;
    }


    /**
    * set instanceConfig
    *
    * @param instanceConfig
    */
    public DescribeInstanceConfigResult instanceConfig(List<ConfigItem> instanceConfig) {
        this.instanceConfig = instanceConfig;
        return this;
    }



    /**
     * add item to unSupportConfigs
     *
     * @param unSupportConfig
     */
    public void addUnSupportConfig(String unSupportConfig) {
        if (this.unSupportConfigs == null) {
            this.unSupportConfigs = new ArrayList<>();
        }
        this.unSupportConfigs.add(unSupportConfig);
    }

    /**
     * add item to instanceConfig
     *
     * @param instanceConfig
     */
    public void addInstanceConfig(ConfigItem instanceConfig) {
        if (this.instanceConfig == null) {
            this.instanceConfig = new ArrayList<>();
        }
        this.instanceConfig.add(instanceConfig);
    }
}