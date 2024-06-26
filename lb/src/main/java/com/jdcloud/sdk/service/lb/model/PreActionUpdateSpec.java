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

package com.jdcloud.sdk.service.lb.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * preActionUpdateSpec
 */
public class PreActionUpdateSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 负载均衡将客户端流量向后端服务器转发时的前置动作类型：1.rewrite动作；2.mirror动作；3.插入http header动作；4.删除http header动作
     * Required:true
     */
    @Required
    private Integer extendActionType;

    /**
     * mirror动作的目的backendId，当extendActionType为2时必须配置本参数，不允许与forward的目的backendId相同，一条rule中最多配置一个mirror动作
     */
    private String mirrorBackendId;

    /**
     * 插入http header动作配置，当extendActionType为3时必须配置本参数
     */
    private InsertHeaderSpec insertHeaderSpec;

    /**
     * 删除http header动作配置，当extendActionType为4时必须配置本参数
     */
    private DeleteHeaderSpec deleteHeaderSpec;

    /**
     * rewrite动作配置，当extendActionType为1时必须配置本参数，一条rule中最多配置一个rewrite动作
     */
    private RewriteSpec rewriteSpec;



    /**
     * get 负载均衡将客户端流量向后端服务器转发时的前置动作类型：1.rewrite动作；2.mirror动作；3.插入http header动作；4.删除http header动作
     *
     * @return
     */
    public Integer getExtendActionType() {
        return extendActionType;
    }

    /**
     * set 负载均衡将客户端流量向后端服务器转发时的前置动作类型：1.rewrite动作；2.mirror动作；3.插入http header动作；4.删除http header动作
     *
     * @param extendActionType
     */
    public void setExtendActionType(Integer extendActionType) {
        this.extendActionType = extendActionType;
    }


    /**
     * get mirror动作的目的backendId，当extendActionType为2时必须配置本参数，不允许与forward的目的backendId相同，一条rule中最多配置一个mirror动作
     *
     * @return
     */
    public String getMirrorBackendId() {
        return mirrorBackendId;
    }

    /**
     * set mirror动作的目的backendId，当extendActionType为2时必须配置本参数，不允许与forward的目的backendId相同，一条rule中最多配置一个mirror动作
     *
     * @param mirrorBackendId
     */
    public void setMirrorBackendId(String mirrorBackendId) {
        this.mirrorBackendId = mirrorBackendId;
    }


    /**
     * get 插入http header动作配置，当extendActionType为3时必须配置本参数
     *
     * @return
     */
    public InsertHeaderSpec getInsertHeaderSpec() {
        return insertHeaderSpec;
    }

    /**
     * set 插入http header动作配置，当extendActionType为3时必须配置本参数
     *
     * @param insertHeaderSpec
     */
    public void setInsertHeaderSpec(InsertHeaderSpec insertHeaderSpec) {
        this.insertHeaderSpec = insertHeaderSpec;
    }


    /**
     * get 删除http header动作配置，当extendActionType为4时必须配置本参数
     *
     * @return
     */
    public DeleteHeaderSpec getDeleteHeaderSpec() {
        return deleteHeaderSpec;
    }

    /**
     * set 删除http header动作配置，当extendActionType为4时必须配置本参数
     *
     * @param deleteHeaderSpec
     */
    public void setDeleteHeaderSpec(DeleteHeaderSpec deleteHeaderSpec) {
        this.deleteHeaderSpec = deleteHeaderSpec;
    }


    /**
     * get rewrite动作配置，当extendActionType为1时必须配置本参数，一条rule中最多配置一个rewrite动作
     *
     * @return
     */
    public RewriteSpec getRewriteSpec() {
        return rewriteSpec;
    }

    /**
     * set rewrite动作配置，当extendActionType为1时必须配置本参数，一条rule中最多配置一个rewrite动作
     *
     * @param rewriteSpec
     */
    public void setRewriteSpec(RewriteSpec rewriteSpec) {
        this.rewriteSpec = rewriteSpec;
    }



    /**
     * set 负载均衡将客户端流量向后端服务器转发时的前置动作类型：1.rewrite动作；2.mirror动作；3.插入http header动作；4.删除http header动作
     *
     * @param extendActionType
     */
    public PreActionUpdateSpec extendActionType(Integer extendActionType) {
        this.extendActionType = extendActionType;
        return this;
    }


    /**
     * set mirror动作的目的backendId，当extendActionType为2时必须配置本参数，不允许与forward的目的backendId相同，一条rule中最多配置一个mirror动作
     *
     * @param mirrorBackendId
     */
    public PreActionUpdateSpec mirrorBackendId(String mirrorBackendId) {
        this.mirrorBackendId = mirrorBackendId;
        return this;
    }


    /**
     * set 插入http header动作配置，当extendActionType为3时必须配置本参数
     *
     * @param insertHeaderSpec
     */
    public PreActionUpdateSpec insertHeaderSpec(InsertHeaderSpec insertHeaderSpec) {
        this.insertHeaderSpec = insertHeaderSpec;
        return this;
    }


    /**
     * set 删除http header动作配置，当extendActionType为4时必须配置本参数
     *
     * @param deleteHeaderSpec
     */
    public PreActionUpdateSpec deleteHeaderSpec(DeleteHeaderSpec deleteHeaderSpec) {
        this.deleteHeaderSpec = deleteHeaderSpec;
        return this;
    }


    /**
     * set rewrite动作配置，当extendActionType为1时必须配置本参数，一条rule中最多配置一个rewrite动作
     *
     * @param rewriteSpec
     */
    public PreActionUpdateSpec rewriteSpec(RewriteSpec rewriteSpec) {
        this.rewriteSpec = rewriteSpec;
        return this;
    }


}