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

package com.jdcloud.sdk.service.shenhaiplatform.model;


/**
 * workspaceUserReq
 */
public class WorkspaceUserReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pageNum
     */
    private Integer pageNum;

    /**
     * pageSize
     */
    private Integer pageSize;

    /**
     * id
     */
    private Long id;

    /**
     * userName
     */
    private String userName;

    /**
     * nickName
     */
    private String nickName;

    /**
     * userPin
     */
    private String userPin;

    /**
     * workspaceCode
     */
    private String workspaceCode;

    /**
     * companyCode
     */
    private String companyCode;



    /**
     * get pageNum
     *
     * @return
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * set pageNum
     *
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }


    /**
     * get pageSize
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set pageSize
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get id
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * get userName
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set userName
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * get nickName
     *
     * @return
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * set nickName
     *
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


    /**
     * get userPin
     *
     * @return
     */
    public String getUserPin() {
        return userPin;
    }

    /**
     * set userPin
     *
     * @param userPin
     */
    public void setUserPin(String userPin) {
        this.userPin = userPin;
    }


    /**
     * get workspaceCode
     *
     * @return
     */
    public String getWorkspaceCode() {
        return workspaceCode;
    }

    /**
     * set workspaceCode
     *
     * @param workspaceCode
     */
    public void setWorkspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
    }


    /**
     * get companyCode
     *
     * @return
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * set companyCode
     *
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }



    /**
     * set pageNum
     *
     * @param pageNum
     */
    public WorkspaceUserReq pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }


    /**
     * set pageSize
     *
     * @param pageSize
     */
    public WorkspaceUserReq pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set id
     *
     * @param id
     */
    public WorkspaceUserReq id(Long id) {
        this.id = id;
        return this;
    }


    /**
     * set userName
     *
     * @param userName
     */
    public WorkspaceUserReq userName(String userName) {
        this.userName = userName;
        return this;
    }


    /**
     * set nickName
     *
     * @param nickName
     */
    public WorkspaceUserReq nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }


    /**
     * set userPin
     *
     * @param userPin
     */
    public WorkspaceUserReq userPin(String userPin) {
        this.userPin = userPin;
        return this;
    }


    /**
     * set workspaceCode
     *
     * @param workspaceCode
     */
    public WorkspaceUserReq workspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
        return this;
    }


    /**
     * set companyCode
     *
     * @param companyCode
     */
    public WorkspaceUserReq companyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }


}