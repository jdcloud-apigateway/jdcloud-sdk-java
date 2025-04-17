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

package com.jdcloud.sdk.service.openjrtc.model;


/**
 * registerUserRequestObj
 */
public class RegisterUserRequestObj  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 业务接入方用户体系定义的userId
     */
    private String userId;

    /**
     * 用户头像url
     */
    private String portraitUrl;

    /**
     * 是否临时用户
     */
    private Boolean temporary;



    /**
     * get 应用ID
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }


    /**
     * get 用户名称
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set 用户名称
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * get 业务接入方用户体系定义的userId
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set 业务接入方用户体系定义的userId
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * get 用户头像url
     *
     * @return
     */
    public String getPortraitUrl() {
        return portraitUrl;
    }

    /**
     * set 用户头像url
     *
     * @param portraitUrl
     */
    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
    }


    /**
     * get 是否临时用户
     *
     * @return
     */
    public Boolean getTemporary() {
        return temporary;
    }

    /**
     * set 是否临时用户
     *
     * @param temporary
     */
    public void setTemporary(Boolean temporary) {
        this.temporary = temporary;
    }



    /**
     * set 应用ID
     *
     * @param appId
     */
    public RegisterUserRequestObj appId(String appId) {
        this.appId = appId;
        return this;
    }


    /**
     * set 用户名称
     *
     * @param userName
     */
    public RegisterUserRequestObj userName(String userName) {
        this.userName = userName;
        return this;
    }


    /**
     * set 业务接入方用户体系定义的userId
     *
     * @param userId
     */
    public RegisterUserRequestObj userId(String userId) {
        this.userId = userId;
        return this;
    }


    /**
     * set 用户头像url
     *
     * @param portraitUrl
     */
    public RegisterUserRequestObj portraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl;
        return this;
    }


    /**
     * set 是否临时用户
     *
     * @param temporary
     */
    public RegisterUserRequestObj temporary(Boolean temporary) {
        this.temporary = temporary;
        return this;
    }


}