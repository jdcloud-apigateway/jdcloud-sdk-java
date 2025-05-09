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

package com.jdcloud.sdk.service.shenhaiplatform.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * 表权限请求
 */
public class JtlasPageSearchTablePrivilegeReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库（工作空间编码）
     * Required:true
     */
    @Required
    private String database;

    /**
     * 表名称
     * Required:true
     */
    @Required
    private String tableName;

    /**
     * privilegeTypes
     */
    
    private List<String> privilegeTypes;
    /**
     * 分页参数-页码
     * Required:true
     */
    @Required
    private Integer pageNum;

    /**
     * 分页参数-页数
     * Required:true
     */
    @Required
    private Integer pageSize;



    /**
     * get 数据库（工作空间编码）
     *
     * @return
     */
    public String getDatabase() {
        return database;
    }

    /**
     * set 数据库（工作空间编码）
     *
     * @param database
     */
    public void setDatabase(String database) {
        this.database = database;
    }


    /**
     * get 表名称
     *
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * set 表名称
     *
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    /**
    * get privilegeTypes
    *
    * @return
    */
    public List<String> getPrivilegeTypes() {
        return privilegeTypes;
    }

    /**
    * set privilegeTypes
    *
    * @param privilegeTypes
    */
    public void setPrivilegeTypes(List<String> privilegeTypes) {
        this.privilegeTypes = privilegeTypes;
    }


    /**
     * get 分页参数-页码
     *
     * @return
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * set 分页参数-页码
     *
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }


    /**
     * get 分页参数-页数
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页参数-页数
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }



    /**
     * set 数据库（工作空间编码）
     *
     * @param database
     */
    public JtlasPageSearchTablePrivilegeReq database(String database) {
        this.database = database;
        return this;
    }


    /**
     * set 表名称
     *
     * @param tableName
     */
    public JtlasPageSearchTablePrivilegeReq tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }


    /**
    * set privilegeTypes
    *
    * @param privilegeTypes
    */
    public JtlasPageSearchTablePrivilegeReq privilegeTypes(List<String> privilegeTypes) {
        this.privilegeTypes = privilegeTypes;
        return this;
    }


    /**
     * set 分页参数-页码
     *
     * @param pageNum
     */
    public JtlasPageSearchTablePrivilegeReq pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }


    /**
     * set 分页参数-页数
     *
     * @param pageSize
     */
    public JtlasPageSearchTablePrivilegeReq pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }



    /**
     * add item to privilegeTypes
     *
     * @param privilegeType
     */
    public void addPrivilegeType(String privilegeType) {
        if (this.privilegeTypes == null) {
            this.privilegeTypes = new ArrayList<>();
        }
        this.privilegeTypes.add(privilegeType);
    }
}