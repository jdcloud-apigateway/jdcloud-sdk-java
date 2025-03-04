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

package com.jdcloud.sdk.service.vm.model;


/**
 * 物理机型信息
 */
public class HostGroupWithTag  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主机组ID
     */
    private String hostGroupId;

    /**
     * 主机组名称
     */
    private String hostGroupName;

    /**
     * 主机组tag
     */
    private String tag;



    /**
     * get 主机组ID
     *
     * @return
     */
    public String getHostGroupId() {
        return hostGroupId;
    }

    /**
     * set 主机组ID
     *
     * @param hostGroupId
     */
    public void setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }


    /**
     * get 主机组名称
     *
     * @return
     */
    public String getHostGroupName() {
        return hostGroupName;
    }

    /**
     * set 主机组名称
     *
     * @param hostGroupName
     */
    public void setHostGroupName(String hostGroupName) {
        this.hostGroupName = hostGroupName;
    }


    /**
     * get 主机组tag
     *
     * @return
     */
    public String getTag() {
        return tag;
    }

    /**
     * set 主机组tag
     *
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }



    /**
     * set 主机组ID
     *
     * @param hostGroupId
     */
    public HostGroupWithTag hostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }


    /**
     * set 主机组名称
     *
     * @param hostGroupName
     */
    public HostGroupWithTag hostGroupName(String hostGroupName) {
        this.hostGroupName = hostGroupName;
        return this;
    }


    /**
     * set 主机组tag
     *
     * @param tag
     */
    public HostGroupWithTag tag(String tag) {
        this.tag = tag;
        return this;
    }


}