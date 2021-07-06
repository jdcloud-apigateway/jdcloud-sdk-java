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

package com.jdcloud.sdk.service.censor.model;


/**
 * frontPicsItem
 */
public class FrontPicsItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 命中截图前3个截图URL信息，不满3个按实际存在截图返回
     */
    private String url;


    /**
     * get 命中截图前3个截图URL信息，不满3个按实际存在截图返回
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set 命中截图前3个截图URL信息，不满3个按实际存在截图返回
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * set 命中截图前3个截图URL信息，不满3个按实际存在截图返回
     *
     * @param url
     */
    public FrontPicsItem url(String url) {
        this.url = url;
        return this;
    }


}