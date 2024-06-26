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

package com.jdcloud.sdk.service.lb.model;


/**
 * updateUrlMapSpec
 */
public class UpdateUrlMapSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 转发规则组描述,允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;

    /**
     * 转发规则组名称，同一个负载均衡下，名称不能重复,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     */
    private String urlMapName;



    /**
     * get 转发规则组描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 转发规则组描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 转发规则组名称，同一个负载均衡下，名称不能重复,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @return
     */
    public String getUrlMapName() {
        return urlMapName;
    }

    /**
     * set 转发规则组名称，同一个负载均衡下，名称不能重复,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param urlMapName
     */
    public void setUrlMapName(String urlMapName) {
        this.urlMapName = urlMapName;
    }



    /**
     * set 转发规则组描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public UpdateUrlMapSpec description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 转发规则组名称，同一个负载均衡下，名称不能重复,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param urlMapName
     */
    public UpdateUrlMapSpec urlMapName(String urlMapName) {
        this.urlMapName = urlMapName;
        return this;
    }


}