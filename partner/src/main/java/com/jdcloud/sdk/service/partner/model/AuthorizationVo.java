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

package com.jdcloud.sdk.service.partner.model;


/**
 * authorizationVo
 */
public class AuthorizationVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * erp
     */
    private String erp;

    /**
     * 权限说明
     */
    private String desc;



    /**
     * get erp
     *
     * @return
     */
    public String getErp() {
        return erp;
    }

    /**
     * set erp
     *
     * @param erp
     */
    public void setErp(String erp) {
        this.erp = erp;
    }


    /**
     * get 权限说明
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 权限说明
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }



    /**
     * set erp
     *
     * @param erp
     */
    public AuthorizationVo erp(String erp) {
        this.erp = erp;
        return this;
    }


    /**
     * set 权限说明
     *
     * @param desc
     */
    public AuthorizationVo desc(String desc) {
        this.desc = desc;
        return this;
    }


}