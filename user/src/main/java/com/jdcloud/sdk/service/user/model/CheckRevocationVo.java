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

package com.jdcloud.sdk.service.user.model;


/**
 * checkRevocationVo
 */
public class CheckRevocationVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * code
     */
    private Integer code;

    /**
     * 编码
     */
    private String status;

    /**
     * 描述
     */
    private String desc;



    /**
     * get code
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set code
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }


    /**
     * get 编码
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 编码
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 描述
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 描述
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }



    /**
     * set code
     *
     * @param code
     */
    public CheckRevocationVo code(Integer code) {
        this.code = code;
        return this;
    }


    /**
     * set 编码
     *
     * @param status
     */
    public CheckRevocationVo status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 描述
     *
     * @param desc
     */
    public CheckRevocationVo desc(String desc) {
        this.desc = desc;
        return this;
    }


}