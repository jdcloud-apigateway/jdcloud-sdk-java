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
 * 云鼎短信服务-应用相关接口
 * 云鼎短信服务-应用相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ydsms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.ydsms.model.SmsAppVO;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询应用列表
 */
public class ListSmsAppsUsingGETResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * smsApps
     */
    private List<SmsAppVO> smsApps;

    /**
     * totalCount
     */
    private Long totalCount;


    /**
     * get smsApps
     *
     * @return
     */
    public List<SmsAppVO> getSmsApps() {
        return smsApps;
    }

    /**
     * set smsApps
     *
     * @param smsApps
     */
    public void setSmsApps(List<SmsAppVO> smsApps) {
        this.smsApps = smsApps;
    }

    /**
     * get totalCount
     *
     * @return
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set smsApps
     *
     * @param smsApps
     */
    public ListSmsAppsUsingGETResult smsApps(List<SmsAppVO> smsApps) {
        this.smsApps = smsApps;
        return this;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public ListSmsAppsUsingGETResult totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to smsApps
     *
     * @param smsApp
     */
    public void addSmsApp(SmsAppVO smsApp) {
        if (this.smsApps == null) {
            this.smsApps = new ArrayList<>();
        }
        this.smsApps.add(smsApp);
    }

}