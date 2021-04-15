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

package com.jdcloud.sdk.service.monitor.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * enableOneClickAlarmsSpec
 */
public class EnableOneClickAlarmsSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 一键报警规则下的报警规则id
     * Required:true
     */
    @Required
    private String rulePolicyId;

    /**
     * 1启动、0关闭
     * Required:true
     */
    @Required
    private Long state;


    /**
     * get 一键报警规则下的报警规则id
     *
     * @return
     */
    public String getRulePolicyId() {
        return rulePolicyId;
    }

    /**
     * set 一键报警规则下的报警规则id
     *
     * @param rulePolicyId
     */
    public void setRulePolicyId(String rulePolicyId) {
        this.rulePolicyId = rulePolicyId;
    }

    /**
     * get 1启动、0关闭
     *
     * @return
     */
    public Long getState() {
        return state;
    }

    /**
     * set 1启动、0关闭
     *
     * @param state
     */
    public void setState(Long state) {
        this.state = state;
    }


    /**
     * set 一键报警规则下的报警规则id
     *
     * @param rulePolicyId
     */
    public EnableOneClickAlarmsSpec rulePolicyId(String rulePolicyId) {
        this.rulePolicyId = rulePolicyId;
        return this;
    }

    /**
     * set 1启动、0关闭
     *
     * @param state
     */
    public EnableOneClickAlarmsSpec state(Long state) {
        this.state = state;
        return this;
    }


}