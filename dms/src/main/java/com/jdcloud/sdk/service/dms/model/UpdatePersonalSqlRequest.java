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
 * Personalsql
 * 收藏sql相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 更新收藏sql
 */
public class UpdatePersonalSqlRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Integer id;

    /**
     * sql备注
     */
    private String hint;

    /**
     * sql内容
     */
    private String sqlStr;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 主键id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 主键id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get sql备注
     *
     * @return
     */
    public String getHint() {
        return hint;
    }

    /**
     * set sql备注
     *
     * @param hint
     */
    public void setHint(String hint) {
        this.hint = hint;
    }


    /**
     * get sql内容
     *
     * @return
     */
    public String getSqlStr() {
        return sqlStr;
    }

    /**
     * set sql内容
     *
     * @param sqlStr
     */
    public void setSqlStr(String sqlStr) {
        this.sqlStr = sqlStr;
    }


    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 主键id
     *
     * @param id
     */
    public UpdatePersonalSqlRequest id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set sql备注
     *
     * @param hint
     */
    public UpdatePersonalSqlRequest hint(String hint) {
        this.hint = hint;
        return this;
    }


    /**
     * set sql内容
     *
     * @param sqlStr
     */
    public UpdatePersonalSqlRequest sqlStr(String sqlStr) {
        this.sqlStr = sqlStr;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public UpdatePersonalSqlRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}