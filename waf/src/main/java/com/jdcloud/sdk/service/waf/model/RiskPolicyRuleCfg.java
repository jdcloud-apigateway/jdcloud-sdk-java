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

package com.jdcloud.sdk.service.waf.model;


/**
 * riskPolicyRuleCfg
 */
public class RiskPolicyRuleCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 名称
     */
    private String name;

    /**
     * 左变量类型
     */
    private String leftType;

    /**
     * 左变量
     */
    private String left;

    /**
     * 操作符
     */
    private String operator;

    /**
     * 右变量类型
     */
    private String rightType;

    /**
     * 右变量
     */
    private String right;


    /**
     * get 名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 左变量类型
     *
     * @return
     */
    public String getLeftType() {
        return leftType;
    }

    /**
     * set 左变量类型
     *
     * @param leftType
     */
    public void setLeftType(String leftType) {
        this.leftType = leftType;
    }

    /**
     * get 左变量
     *
     * @return
     */
    public String getLeft() {
        return left;
    }

    /**
     * set 左变量
     *
     * @param left
     */
    public void setLeft(String left) {
        this.left = left;
    }

    /**
     * get 操作符
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set 操作符
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * get 右变量类型
     *
     * @return
     */
    public String getRightType() {
        return rightType;
    }

    /**
     * set 右变量类型
     *
     * @param rightType
     */
    public void setRightType(String rightType) {
        this.rightType = rightType;
    }

    /**
     * get 右变量
     *
     * @return
     */
    public String getRight() {
        return right;
    }

    /**
     * set 右变量
     *
     * @param right
     */
    public void setRight(String right) {
        this.right = right;
    }


    /**
     * set 名称
     *
     * @param name
     */
    public RiskPolicyRuleCfg name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 左变量类型
     *
     * @param leftType
     */
    public RiskPolicyRuleCfg leftType(String leftType) {
        this.leftType = leftType;
        return this;
    }

    /**
     * set 左变量
     *
     * @param left
     */
    public RiskPolicyRuleCfg left(String left) {
        this.left = left;
        return this;
    }

    /**
     * set 操作符
     *
     * @param operator
     */
    public RiskPolicyRuleCfg operator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * set 右变量类型
     *
     * @param rightType
     */
    public RiskPolicyRuleCfg rightType(String rightType) {
        this.rightType = rightType;
        return this;
    }

    /**
     * set 右变量
     *
     * @param right
     */
    public RiskPolicyRuleCfg right(String right) {
        this.right = right;
        return this;
    }


}