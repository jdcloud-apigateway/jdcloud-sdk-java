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
 * WorkspaceController
 * 工作空间WorkspaceController接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import com.jdcloud.sdk.service.shenhaiplatform.model.OwnerIntegrationResource;
import com.jdcloud.sdk.service.shenhaiplatform.model.CreateProjectResourceParam;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 工作空间开通接口
 */
public class WorkspaceCreatProductRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * region
     */
    private String region;

    /**
     * az
     */
    private String az;

    /**
     * ownerIntegrationResource
     */
    private OwnerIntegrationResource ownerIntegrationResource;

    /**
     * payPlan
     */
    private String payPlan;

    /**
     * billingVersion
     */
    private String billingVersion;

    /**
     * billingModel
     */
    private String billingModel;

    /**
     * autoRenewal
     */
    private Boolean autoRenewal;

    /**
     * purchaseDuration
     */
    private Integer purchaseDuration;

    /**
     * projectResourceReq
     */
    private CreateProjectResourceParam projectResourceReq;

    /**
     * returnUrl
     */
    private String returnUrl;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private String appName;



    /**
     * get region
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set region
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * get az
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set az
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }


    /**
     * get ownerIntegrationResource
     *
     * @return
     */
    public OwnerIntegrationResource getOwnerIntegrationResource() {
        return ownerIntegrationResource;
    }

    /**
     * set ownerIntegrationResource
     *
     * @param ownerIntegrationResource
     */
    public void setOwnerIntegrationResource(OwnerIntegrationResource ownerIntegrationResource) {
        this.ownerIntegrationResource = ownerIntegrationResource;
    }


    /**
     * get payPlan
     *
     * @return
     */
    public String getPayPlan() {
        return payPlan;
    }

    /**
     * set payPlan
     *
     * @param payPlan
     */
    public void setPayPlan(String payPlan) {
        this.payPlan = payPlan;
    }


    /**
     * get billingVersion
     *
     * @return
     */
    public String getBillingVersion() {
        return billingVersion;
    }

    /**
     * set billingVersion
     *
     * @param billingVersion
     */
    public void setBillingVersion(String billingVersion) {
        this.billingVersion = billingVersion;
    }


    /**
     * get billingModel
     *
     * @return
     */
    public String getBillingModel() {
        return billingModel;
    }

    /**
     * set billingModel
     *
     * @param billingModel
     */
    public void setBillingModel(String billingModel) {
        this.billingModel = billingModel;
    }


    /**
     * get autoRenewal
     *
     * @return
     */
    public Boolean getAutoRenewal() {
        return autoRenewal;
    }

    /**
     * set autoRenewal
     *
     * @param autoRenewal
     */
    public void setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
    }


    /**
     * get purchaseDuration
     *
     * @return
     */
    public Integer getPurchaseDuration() {
        return purchaseDuration;
    }

    /**
     * set purchaseDuration
     *
     * @param purchaseDuration
     */
    public void setPurchaseDuration(Integer purchaseDuration) {
        this.purchaseDuration = purchaseDuration;
    }


    /**
     * get projectResourceReq
     *
     * @return
     */
    public CreateProjectResourceParam getProjectResourceReq() {
        return projectResourceReq;
    }

    /**
     * set projectResourceReq
     *
     * @param projectResourceReq
     */
    public void setProjectResourceReq(CreateProjectResourceParam projectResourceReq) {
        this.projectResourceReq = projectResourceReq;
    }


    /**
     * get returnUrl
     *
     * @return
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * set returnUrl
     *
     * @param returnUrl
     */
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }



    /**
     * set region
     *
     * @param region
     */
    public WorkspaceCreatProductRequest region(String region) {
        this.region = region;
        return this;
    }


    /**
     * set az
     *
     * @param az
     */
    public WorkspaceCreatProductRequest az(String az) {
        this.az = az;
        return this;
    }


    /**
     * set ownerIntegrationResource
     *
     * @param ownerIntegrationResource
     */
    public WorkspaceCreatProductRequest ownerIntegrationResource(OwnerIntegrationResource ownerIntegrationResource) {
        this.ownerIntegrationResource = ownerIntegrationResource;
        return this;
    }


    /**
     * set payPlan
     *
     * @param payPlan
     */
    public WorkspaceCreatProductRequest payPlan(String payPlan) {
        this.payPlan = payPlan;
        return this;
    }


    /**
     * set billingVersion
     *
     * @param billingVersion
     */
    public WorkspaceCreatProductRequest billingVersion(String billingVersion) {
        this.billingVersion = billingVersion;
        return this;
    }


    /**
     * set billingModel
     *
     * @param billingModel
     */
    public WorkspaceCreatProductRequest billingModel(String billingModel) {
        this.billingModel = billingModel;
        return this;
    }


    /**
     * set autoRenewal
     *
     * @param autoRenewal
     */
    public WorkspaceCreatProductRequest autoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }


    /**
     * set purchaseDuration
     *
     * @param purchaseDuration
     */
    public WorkspaceCreatProductRequest purchaseDuration(Integer purchaseDuration) {
        this.purchaseDuration = purchaseDuration;
        return this;
    }


    /**
     * set projectResourceReq
     *
     * @param projectResourceReq
     */
    public WorkspaceCreatProductRequest projectResourceReq(CreateProjectResourceParam projectResourceReq) {
        this.projectResourceReq = projectResourceReq;
        return this;
    }


    /**
     * set returnUrl
     *
     * @param returnUrl
     */
    public WorkspaceCreatProductRequest returnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public WorkspaceCreatProductRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public WorkspaceCreatProductRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}