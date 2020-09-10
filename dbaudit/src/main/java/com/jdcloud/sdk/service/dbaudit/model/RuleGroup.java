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

package com.jdcloud.sdk.service.dbaudit.model;


/**
 * 规则组
 */
public class RuleGroup  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则组ID(新建规则组时不需要传递此值)
     */
    private String ruleGroupId;

    /**
     * 规则组名称
     */
    private String ruleGroupName;

    /**
     * 数据库用户是否区分大小写
     */
    private Boolean dbUserCase;

    /**
     * 操作系统用户是否区分大小写
     */
    private Boolean osUserCase;

    /**
     * 客户端程序是否区分大小写
     */
    private Boolean programCase;

    /**
     * 规则组是否启用
     */
    private Boolean enabled;

    /**
     * 标识从哪个规则组复制而来
     */
    private Integer copyFromId;


    /**
     * get 规则组ID(新建规则组时不需要传递此值)
     *
     * @return
     */
    public String getRuleGroupId() {
        return ruleGroupId;
    }

    /**
     * set 规则组ID(新建规则组时不需要传递此值)
     *
     * @param ruleGroupId
     */
    public void setRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    /**
     * get 规则组名称
     *
     * @return
     */
    public String getRuleGroupName() {
        return ruleGroupName;
    }

    /**
     * set 规则组名称
     *
     * @param ruleGroupName
     */
    public void setRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
    }

    /**
     * get 数据库用户是否区分大小写
     *
     * @return
     */
    public Boolean getDbUserCase() {
        return dbUserCase;
    }

    /**
     * set 数据库用户是否区分大小写
     *
     * @param dbUserCase
     */
    public void setDbUserCase(Boolean dbUserCase) {
        this.dbUserCase = dbUserCase;
    }

    /**
     * get 操作系统用户是否区分大小写
     *
     * @return
     */
    public Boolean getOsUserCase() {
        return osUserCase;
    }

    /**
     * set 操作系统用户是否区分大小写
     *
     * @param osUserCase
     */
    public void setOsUserCase(Boolean osUserCase) {
        this.osUserCase = osUserCase;
    }

    /**
     * get 客户端程序是否区分大小写
     *
     * @return
     */
    public Boolean getProgramCase() {
        return programCase;
    }

    /**
     * set 客户端程序是否区分大小写
     *
     * @param programCase
     */
    public void setProgramCase(Boolean programCase) {
        this.programCase = programCase;
    }

    /**
     * get 规则组是否启用
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set 规则组是否启用
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * get 标识从哪个规则组复制而来
     *
     * @return
     */
    public Integer getCopyFromId() {
        return copyFromId;
    }

    /**
     * set 标识从哪个规则组复制而来
     *
     * @param copyFromId
     */
    public void setCopyFromId(Integer copyFromId) {
        this.copyFromId = copyFromId;
    }


    /**
     * set 规则组ID(新建规则组时不需要传递此值)
     *
     * @param ruleGroupId
     */
    public RuleGroup ruleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
        return this;
    }

    /**
     * set 规则组名称
     *
     * @param ruleGroupName
     */
    public RuleGroup ruleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
        return this;
    }

    /**
     * set 数据库用户是否区分大小写
     *
     * @param dbUserCase
     */
    public RuleGroup dbUserCase(Boolean dbUserCase) {
        this.dbUserCase = dbUserCase;
        return this;
    }

    /**
     * set 操作系统用户是否区分大小写
     *
     * @param osUserCase
     */
    public RuleGroup osUserCase(Boolean osUserCase) {
        this.osUserCase = osUserCase;
        return this;
    }

    /**
     * set 客户端程序是否区分大小写
     *
     * @param programCase
     */
    public RuleGroup programCase(Boolean programCase) {
        this.programCase = programCase;
        return this;
    }

    /**
     * set 规则组是否启用
     *
     * @param enabled
     */
    public RuleGroup enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 标识从哪个规则组复制而来
     *
     * @param copyFromId
     */
    public RuleGroup copyFromId(Integer copyFromId) {
        this.copyFromId = copyFromId;
        return this;
    }


}