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
 * Instance
 * 用户实例相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dms.model.DmsInstance;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询用户实例
 */
public class QueryInstanceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询分类方式：LOGIN_STATUS，DB_TYPE。
     */
    private String instanceQueryTypeEnum;

    /**
     * loginedInstance
     */
    private List<DmsInstance> loginedInstance;

    /**
     * unloginedInstance
     */
    private List<DmsInstance> unloginedInstance;

    /**
     * noNeedLoginInstance
     */
    private List<DmsInstance> noNeedLoginInstance;

    /**
     * rdsIntance
     */
    private List<DmsInstance> rdsIntance;

    /**
     * drdsIntance
     */
    private List<DmsInstance> drdsIntance;


    /**
     * get 查询分类方式：LOGIN_STATUS，DB_TYPE。
     *
     * @return
     */
    public String getInstanceQueryTypeEnum() {
        return instanceQueryTypeEnum;
    }

    /**
     * set 查询分类方式：LOGIN_STATUS，DB_TYPE。
     *
     * @param instanceQueryTypeEnum
     */
    public void setInstanceQueryTypeEnum(String instanceQueryTypeEnum) {
        this.instanceQueryTypeEnum = instanceQueryTypeEnum;
    }

    /**
     * get loginedInstance
     *
     * @return
     */
    public List<DmsInstance> getLoginedInstance() {
        return loginedInstance;
    }

    /**
     * set loginedInstance
     *
     * @param loginedInstance
     */
    public void setLoginedInstance(List<DmsInstance> loginedInstance) {
        this.loginedInstance = loginedInstance;
    }

    /**
     * get unloginedInstance
     *
     * @return
     */
    public List<DmsInstance> getUnloginedInstance() {
        return unloginedInstance;
    }

    /**
     * set unloginedInstance
     *
     * @param unloginedInstance
     */
    public void setUnloginedInstance(List<DmsInstance> unloginedInstance) {
        this.unloginedInstance = unloginedInstance;
    }

    /**
     * get noNeedLoginInstance
     *
     * @return
     */
    public List<DmsInstance> getNoNeedLoginInstance() {
        return noNeedLoginInstance;
    }

    /**
     * set noNeedLoginInstance
     *
     * @param noNeedLoginInstance
     */
    public void setNoNeedLoginInstance(List<DmsInstance> noNeedLoginInstance) {
        this.noNeedLoginInstance = noNeedLoginInstance;
    }

    /**
     * get rdsIntance
     *
     * @return
     */
    public List<DmsInstance> getRdsIntance() {
        return rdsIntance;
    }

    /**
     * set rdsIntance
     *
     * @param rdsIntance
     */
    public void setRdsIntance(List<DmsInstance> rdsIntance) {
        this.rdsIntance = rdsIntance;
    }

    /**
     * get drdsIntance
     *
     * @return
     */
    public List<DmsInstance> getDrdsIntance() {
        return drdsIntance;
    }

    /**
     * set drdsIntance
     *
     * @param drdsIntance
     */
    public void setDrdsIntance(List<DmsInstance> drdsIntance) {
        this.drdsIntance = drdsIntance;
    }


    /**
     * set 查询分类方式：LOGIN_STATUS，DB_TYPE。
     *
     * @param instanceQueryTypeEnum
     */
    public QueryInstanceResult instanceQueryTypeEnum(String instanceQueryTypeEnum) {
        this.instanceQueryTypeEnum = instanceQueryTypeEnum;
        return this;
    }

    /**
     * set loginedInstance
     *
     * @param loginedInstance
     */
    public QueryInstanceResult loginedInstance(List<DmsInstance> loginedInstance) {
        this.loginedInstance = loginedInstance;
        return this;
    }

    /**
     * set unloginedInstance
     *
     * @param unloginedInstance
     */
    public QueryInstanceResult unloginedInstance(List<DmsInstance> unloginedInstance) {
        this.unloginedInstance = unloginedInstance;
        return this;
    }

    /**
     * set noNeedLoginInstance
     *
     * @param noNeedLoginInstance
     */
    public QueryInstanceResult noNeedLoginInstance(List<DmsInstance> noNeedLoginInstance) {
        this.noNeedLoginInstance = noNeedLoginInstance;
        return this;
    }

    /**
     * set rdsIntance
     *
     * @param rdsIntance
     */
    public QueryInstanceResult rdsIntance(List<DmsInstance> rdsIntance) {
        this.rdsIntance = rdsIntance;
        return this;
    }

    /**
     * set drdsIntance
     *
     * @param drdsIntance
     */
    public QueryInstanceResult drdsIntance(List<DmsInstance> drdsIntance) {
        this.drdsIntance = drdsIntance;
        return this;
    }


    /**
     * add item to loginedInstance
     *
     * @param loginedInstance
     */
    public void addLoginedInstance(DmsInstance loginedInstance) {
        if (this.loginedInstance == null) {
            this.loginedInstance = new ArrayList<>();
        }
        this.loginedInstance.add(loginedInstance);
    }

    /**
     * add item to unloginedInstance
     *
     * @param unloginedInstance
     */
    public void addUnloginedInstance(DmsInstance unloginedInstance) {
        if (this.unloginedInstance == null) {
            this.unloginedInstance = new ArrayList<>();
        }
        this.unloginedInstance.add(unloginedInstance);
    }

    /**
     * add item to noNeedLoginInstance
     *
     * @param noNeedLoginInstance
     */
    public void addNoNeedLoginInstance(DmsInstance noNeedLoginInstance) {
        if (this.noNeedLoginInstance == null) {
            this.noNeedLoginInstance = new ArrayList<>();
        }
        this.noNeedLoginInstance.add(noNeedLoginInstance);
    }

    /**
     * add item to rdsIntance
     *
     * @param rdsIntance
     */
    public void addRdsIntance(DmsInstance rdsIntance) {
        if (this.rdsIntance == null) {
            this.rdsIntance = new ArrayList<>();
        }
        this.rdsIntance.add(rdsIntance);
    }

    /**
     * add item to drdsIntance
     *
     * @param drdsIntance
     */
    public void addDrdsIntance(DmsInstance drdsIntance) {
        if (this.drdsIntance == null) {
            this.drdsIntance = new ArrayList<>();
        }
        this.drdsIntance.add(drdsIntance);
    }

}