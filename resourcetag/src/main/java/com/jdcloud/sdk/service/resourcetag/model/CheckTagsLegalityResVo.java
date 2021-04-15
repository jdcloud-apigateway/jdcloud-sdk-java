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

package com.jdcloud.sdk.service.resourcetag.model;


/**
 * 校验标签参数响应结果
 */
public class CheckTagsLegalityResVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 校验状态
     */
    private Boolean success;

    /**
     * 校验参数结果描述
校验成功时msg为操作成功
校验失败时msg为失败的原因

     */
    private String msg;


    /**
     * get 校验状态
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set 校验状态
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * get 校验参数结果描述
校验成功时msg为操作成功
校验失败时msg为失败的原因

     *
     * @return
     */
    public String getMsg() {
        return msg;
    }

    /**
     * set 校验参数结果描述
校验成功时msg为操作成功
校验失败时msg为失败的原因

     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }


    /**
     * set 校验状态
     *
     * @param success
     */
    public CheckTagsLegalityResVo success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * set 校验参数结果描述
校验成功时msg为操作成功
校验失败时msg为失败的原因

     *
     * @param msg
     */
    public CheckTagsLegalityResVo msg(String msg) {
        this.msg = msg;
        return this;
    }


}