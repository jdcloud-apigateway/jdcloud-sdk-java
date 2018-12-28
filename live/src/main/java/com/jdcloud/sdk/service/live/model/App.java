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

package com.jdcloud.sdk.service.live.model;

import java.util.List;
import java.util.ArrayList;

/**
 * app
 */
public class App  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 推流域名
     */
    private String publishDomain;

    /**
     * config
     */
    private List<Config> transcodeConfig;


    /**
     * get 推流域名
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    /**
     * get config
     *
     * @return
     */
    public List<Config> getTranscodeConfig() {
        return transcodeConfig;
    }

    /**
     * set config
     *
     * @param transcodeConfig
     */
    public void setTranscodeConfig(List<Config> transcodeConfig) {
        this.transcodeConfig = transcodeConfig;
    }


    /**
     * set 推流域名
     *
     * @param publishDomain
     */
    public App publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set config
     *
     * @param transcodeConfig
     */
    public App transcodeConfig(List<Config> transcodeConfig) {
        this.transcodeConfig = transcodeConfig;
        return this;
    }


    /**
     * add item to config
     *
     * @param transcodeConfig
     */
    public void addTranscodeConfig(Config transcodeConfig) {
        if (this.transcodeConfig == null) {
            this.transcodeConfig = new ArrayList<>();
        }
        this.transcodeConfig.add(transcodeConfig);
    }

}