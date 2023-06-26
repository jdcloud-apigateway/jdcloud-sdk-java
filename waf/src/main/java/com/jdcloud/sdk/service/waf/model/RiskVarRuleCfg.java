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
 * riskVarRuleCfg
 */
public class RiskVarRuleCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 左表达式
     */
    private String left;

    /**
     * 操作符
     */
    private String operator;

    /**
     * 右表达式
     */
    private String right;

    /**
     * 结果比较运算符
     */
    private String resultOpt;

    /**
     * 结果右表达式
     */
    private String resultRight;



    /**
     * get 左表达式
     *
     * @return
     */
    public String getLeft() {
        return left;
    }

    /**
     * set 左表达式
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
     * get 右表达式
     *
     * @return
     */
    public String getRight() {
        return right;
    }

    /**
     * set 右表达式
     *
     * @param right
     */
    public void setRight(String right) {
        this.right = right;
    }


    /**
     * get 结果比较运算符
     *
     * @return
     */
    public String getResultOpt() {
        return resultOpt;
    }

    /**
     * set 结果比较运算符
     *
     * @param resultOpt
     */
    public void setResultOpt(String resultOpt) {
        this.resultOpt = resultOpt;
    }


    /**
     * get 结果右表达式
     *
     * @return
     */
    public String getResultRight() {
        return resultRight;
    }

    /**
     * set 结果右表达式
     *
     * @param resultRight
     */
    public void setResultRight(String resultRight) {
        this.resultRight = resultRight;
    }



    /**
     * set 左表达式
     *
     * @param left
     */
    public RiskVarRuleCfg left(String left) {
        this.left = left;
        return this;
    }


    /**
     * set 操作符
     *
     * @param operator
     */
    public RiskVarRuleCfg operator(String operator) {
        this.operator = operator;
        return this;
    }


    /**
     * set 右表达式
     *
     * @param right
     */
    public RiskVarRuleCfg right(String right) {
        this.right = right;
        return this;
    }


    /**
     * set 结果比较运算符
     *
     * @param resultOpt
     */
    public RiskVarRuleCfg resultOpt(String resultOpt) {
        this.resultOpt = resultOpt;
        return this;
    }


    /**
     * set 结果右表达式
     *
     * @param resultRight
     */
    public RiskVarRuleCfg resultRight(String resultRight) {
        this.resultRight = resultRight;
        return this;
    }


}