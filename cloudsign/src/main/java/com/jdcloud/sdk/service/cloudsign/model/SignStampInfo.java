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

package com.jdcloud.sdk.service.cloudsign.model;


/**
 * signStampInfo
 */
public class SignStampInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 印章id
     */
    private String stampId;

    /**
     * 印章名
     */
    private String stampName;

    /**
     * 印章url
     */
    private String stampUrl;



    /**
     * get 印章id
     *
     * @return
     */
    public String getStampId() {
        return stampId;
    }

    /**
     * set 印章id
     *
     * @param stampId
     */
    public void setStampId(String stampId) {
        this.stampId = stampId;
    }


    /**
     * get 印章名
     *
     * @return
     */
    public String getStampName() {
        return stampName;
    }

    /**
     * set 印章名
     *
     * @param stampName
     */
    public void setStampName(String stampName) {
        this.stampName = stampName;
    }


    /**
     * get 印章url
     *
     * @return
     */
    public String getStampUrl() {
        return stampUrl;
    }

    /**
     * set 印章url
     *
     * @param stampUrl
     */
    public void setStampUrl(String stampUrl) {
        this.stampUrl = stampUrl;
    }



    /**
     * set 印章id
     *
     * @param stampId
     */
    public SignStampInfo stampId(String stampId) {
        this.stampId = stampId;
        return this;
    }


    /**
     * set 印章名
     *
     * @param stampName
     */
    public SignStampInfo stampName(String stampName) {
        this.stampName = stampName;
        return this;
    }


    /**
     * set 印章url
     *
     * @param stampUrl
     */
    public SignStampInfo stampUrl(String stampUrl) {
        this.stampUrl = stampUrl;
        return this;
    }


}