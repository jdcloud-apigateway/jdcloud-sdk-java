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
 * DmsFunction
 * 函数相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 生成修改函数sql语句，支持Mysql
 */
public class GeneralAlterFunctionRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据源id。
     */
    private Integer dataSourceId;

    /**
     * 数据库名称。
     */
    private String dbName;

    /**
     * 函数名称。
     */
    private String functionName;

    /**
     * 函数名称。
     */
    private String originFunctionName;

    /**
     * 安全性，DEFAULT(&quot;DEFAULT&quot;, 1),DEFINER(&quot;DEFINER&quot;, 2), INVOKER(&quot;INVOKER&quot;, 3);
     */
    private String functionSecurity;

    /**
     * 数据访问，DEFAULT(&quot;DEFAULT&quot;, 1),NO_SQL(&quot;NO_SQL&quot;, 2), CONTAINS_SQL(&quot;CONTAINS_SQL&quot;, 3), READS_SQL_DATA(&quot;READS_SQL_DATA&quot;, 4), MODIFIES_SQL_DATA(&quot;MODIFIES_SQL_DATA&quot;, 5);
     */
    private String dataAccess;

    /**
     * 确定性。
     */
    private Boolean deterministic;

    /**
     * 函数定义SQL。
     */
    private String definitionSql;

    /**
     * 函数定义SQL。
     */
    private String completeSql;

    /**
     * 参数列表。
     */
    
    private List<Parameter> parameters;
    /**
     * 定义者。
     */
    private String definer;

    /**
     * 注释。
     */
    private String comment;

    /**
     * 返回值类型，TINYINT(&quot;TINYINT&quot;, 0), SMALLINT(&quot;SMALLINT&quot;, 1), MEDIUMINT(&quot;MEDIUMINT&quot;, 2), INT(&quot;INT&quot;, 3), BIGINT(&quot;BIGINT&quot;, 4), INTEGER(&quot;INTEGER&quot;, 5), FLOAT(&quot;FLOAT&quot;, 6), DOUBLE(&quot;DOUBLE&quot;, 7), REAL(&quot;REAL&quot;, 8), DECIMAL(&quot;DECIMAL&quot;, 9), CHAR(&quot;CHAR&quot;, 10), VARCHAR(&quot;VARCHAR&quot;, 11), TINYTEXT(&quot;TINYTEXT&quot;, 12), TEXT(&quot;TEXT&quot;, 13), MEDIUMTEXT(&quot;MEDIUMTEXT&quot;, 14), LONGTEXT(&quot;LONGTEXT&quot;, 15), DATE(&quot;DATE&quot;, 16), DATETIME(&quot;DATETIME&quot;, 17), TIMESTAMP(&quot;TIMESTAMP&quot;, 18), TIME(&quot;TIME&quot;, 19), YEAR(&quot;YEAR&quot;, 19), BINARY(&quot;BINARY&quot;, 20), VARBINARY(&quot;VARBINARY&quot;, 21), TINYBLOB(&quot;TINYBLOB&quot;, 22), BLOB(&quot;BLOB&quot;, 23), MEDIUMBLOB(&quot;MEDIUMBLOB&quot;, 24), LONGBLOB(&quot;LONGBLOB&quot;, 25);
     */
    private String returnType;

    /**
     * 返回值长度。
     */
    private Integer returnLength;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 数据源id。
     *
     * @return
     */
    public Integer getDataSourceId() {
        return dataSourceId;
    }

    /**
     * set 数据源id。
     *
     * @param dataSourceId
     */
    public void setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
    }


    /**
     * get 数据库名称。
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名称。
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }


    /**
     * get 函数名称。
     *
     * @return
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * set 函数名称。
     *
     * @param functionName
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }


    /**
     * get 函数名称。
     *
     * @return
     */
    public String getOriginFunctionName() {
        return originFunctionName;
    }

    /**
     * set 函数名称。
     *
     * @param originFunctionName
     */
    public void setOriginFunctionName(String originFunctionName) {
        this.originFunctionName = originFunctionName;
    }


    /**
     * get 安全性，DEFAULT(&quot;DEFAULT&quot;, 1),DEFINER(&quot;DEFINER&quot;, 2), INVOKER(&quot;INVOKER&quot;, 3);
     *
     * @return
     */
    public String getFunctionSecurity() {
        return functionSecurity;
    }

    /**
     * set 安全性，DEFAULT(&quot;DEFAULT&quot;, 1),DEFINER(&quot;DEFINER&quot;, 2), INVOKER(&quot;INVOKER&quot;, 3);
     *
     * @param functionSecurity
     */
    public void setFunctionSecurity(String functionSecurity) {
        this.functionSecurity = functionSecurity;
    }


    /**
     * get 数据访问，DEFAULT(&quot;DEFAULT&quot;, 1),NO_SQL(&quot;NO_SQL&quot;, 2), CONTAINS_SQL(&quot;CONTAINS_SQL&quot;, 3), READS_SQL_DATA(&quot;READS_SQL_DATA&quot;, 4), MODIFIES_SQL_DATA(&quot;MODIFIES_SQL_DATA&quot;, 5);
     *
     * @return
     */
    public String getDataAccess() {
        return dataAccess;
    }

    /**
     * set 数据访问，DEFAULT(&quot;DEFAULT&quot;, 1),NO_SQL(&quot;NO_SQL&quot;, 2), CONTAINS_SQL(&quot;CONTAINS_SQL&quot;, 3), READS_SQL_DATA(&quot;READS_SQL_DATA&quot;, 4), MODIFIES_SQL_DATA(&quot;MODIFIES_SQL_DATA&quot;, 5);
     *
     * @param dataAccess
     */
    public void setDataAccess(String dataAccess) {
        this.dataAccess = dataAccess;
    }


    /**
     * get 确定性。
     *
     * @return
     */
    public Boolean getDeterministic() {
        return deterministic;
    }

    /**
     * set 确定性。
     *
     * @param deterministic
     */
    public void setDeterministic(Boolean deterministic) {
        this.deterministic = deterministic;
    }


    /**
     * get 函数定义SQL。
     *
     * @return
     */
    public String getDefinitionSql() {
        return definitionSql;
    }

    /**
     * set 函数定义SQL。
     *
     * @param definitionSql
     */
    public void setDefinitionSql(String definitionSql) {
        this.definitionSql = definitionSql;
    }


    /**
     * get 函数定义SQL。
     *
     * @return
     */
    public String getCompleteSql() {
        return completeSql;
    }

    /**
     * set 函数定义SQL。
     *
     * @param completeSql
     */
    public void setCompleteSql(String completeSql) {
        this.completeSql = completeSql;
    }


    /**
    * get 参数列表。
    *
    * @return
    */
    public List<Parameter> getParameters() {
        return parameters;
    }

    /**
    * set 参数列表。
    *
    * @param parameters
    */
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }


    /**
     * get 定义者。
     *
     * @return
     */
    public String getDefiner() {
        return definer;
    }

    /**
     * set 定义者。
     *
     * @param definer
     */
    public void setDefiner(String definer) {
        this.definer = definer;
    }


    /**
     * get 注释。
     *
     * @return
     */
    public String getComment() {
        return comment;
    }

    /**
     * set 注释。
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }


    /**
     * get 返回值类型，TINYINT(&quot;TINYINT&quot;, 0), SMALLINT(&quot;SMALLINT&quot;, 1), MEDIUMINT(&quot;MEDIUMINT&quot;, 2), INT(&quot;INT&quot;, 3), BIGINT(&quot;BIGINT&quot;, 4), INTEGER(&quot;INTEGER&quot;, 5), FLOAT(&quot;FLOAT&quot;, 6), DOUBLE(&quot;DOUBLE&quot;, 7), REAL(&quot;REAL&quot;, 8), DECIMAL(&quot;DECIMAL&quot;, 9), CHAR(&quot;CHAR&quot;, 10), VARCHAR(&quot;VARCHAR&quot;, 11), TINYTEXT(&quot;TINYTEXT&quot;, 12), TEXT(&quot;TEXT&quot;, 13), MEDIUMTEXT(&quot;MEDIUMTEXT&quot;, 14), LONGTEXT(&quot;LONGTEXT&quot;, 15), DATE(&quot;DATE&quot;, 16), DATETIME(&quot;DATETIME&quot;, 17), TIMESTAMP(&quot;TIMESTAMP&quot;, 18), TIME(&quot;TIME&quot;, 19), YEAR(&quot;YEAR&quot;, 19), BINARY(&quot;BINARY&quot;, 20), VARBINARY(&quot;VARBINARY&quot;, 21), TINYBLOB(&quot;TINYBLOB&quot;, 22), BLOB(&quot;BLOB&quot;, 23), MEDIUMBLOB(&quot;MEDIUMBLOB&quot;, 24), LONGBLOB(&quot;LONGBLOB&quot;, 25);
     *
     * @return
     */
    public String getReturnType() {
        return returnType;
    }

    /**
     * set 返回值类型，TINYINT(&quot;TINYINT&quot;, 0), SMALLINT(&quot;SMALLINT&quot;, 1), MEDIUMINT(&quot;MEDIUMINT&quot;, 2), INT(&quot;INT&quot;, 3), BIGINT(&quot;BIGINT&quot;, 4), INTEGER(&quot;INTEGER&quot;, 5), FLOAT(&quot;FLOAT&quot;, 6), DOUBLE(&quot;DOUBLE&quot;, 7), REAL(&quot;REAL&quot;, 8), DECIMAL(&quot;DECIMAL&quot;, 9), CHAR(&quot;CHAR&quot;, 10), VARCHAR(&quot;VARCHAR&quot;, 11), TINYTEXT(&quot;TINYTEXT&quot;, 12), TEXT(&quot;TEXT&quot;, 13), MEDIUMTEXT(&quot;MEDIUMTEXT&quot;, 14), LONGTEXT(&quot;LONGTEXT&quot;, 15), DATE(&quot;DATE&quot;, 16), DATETIME(&quot;DATETIME&quot;, 17), TIMESTAMP(&quot;TIMESTAMP&quot;, 18), TIME(&quot;TIME&quot;, 19), YEAR(&quot;YEAR&quot;, 19), BINARY(&quot;BINARY&quot;, 20), VARBINARY(&quot;VARBINARY&quot;, 21), TINYBLOB(&quot;TINYBLOB&quot;, 22), BLOB(&quot;BLOB&quot;, 23), MEDIUMBLOB(&quot;MEDIUMBLOB&quot;, 24), LONGBLOB(&quot;LONGBLOB&quot;, 25);
     *
     * @param returnType
     */
    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }


    /**
     * get 返回值长度。
     *
     * @return
     */
    public Integer getReturnLength() {
        return returnLength;
    }

    /**
     * set 返回值长度。
     *
     * @param returnLength
     */
    public void setReturnLength(Integer returnLength) {
        this.returnLength = returnLength;
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
     * set 数据源id。
     *
     * @param dataSourceId
     */
    public GeneralAlterFunctionRequest dataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }


    /**
     * set 数据库名称。
     *
     * @param dbName
     */
    public GeneralAlterFunctionRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }


    /**
     * set 函数名称。
     *
     * @param functionName
     */
    public GeneralAlterFunctionRequest functionName(String functionName) {
        this.functionName = functionName;
        return this;
    }


    /**
     * set 函数名称。
     *
     * @param originFunctionName
     */
    public GeneralAlterFunctionRequest originFunctionName(String originFunctionName) {
        this.originFunctionName = originFunctionName;
        return this;
    }


    /**
     * set 安全性，DEFAULT(&quot;DEFAULT&quot;, 1),DEFINER(&quot;DEFINER&quot;, 2), INVOKER(&quot;INVOKER&quot;, 3);
     *
     * @param functionSecurity
     */
    public GeneralAlterFunctionRequest functionSecurity(String functionSecurity) {
        this.functionSecurity = functionSecurity;
        return this;
    }


    /**
     * set 数据访问，DEFAULT(&quot;DEFAULT&quot;, 1),NO_SQL(&quot;NO_SQL&quot;, 2), CONTAINS_SQL(&quot;CONTAINS_SQL&quot;, 3), READS_SQL_DATA(&quot;READS_SQL_DATA&quot;, 4), MODIFIES_SQL_DATA(&quot;MODIFIES_SQL_DATA&quot;, 5);
     *
     * @param dataAccess
     */
    public GeneralAlterFunctionRequest dataAccess(String dataAccess) {
        this.dataAccess = dataAccess;
        return this;
    }


    /**
     * set 确定性。
     *
     * @param deterministic
     */
    public GeneralAlterFunctionRequest deterministic(Boolean deterministic) {
        this.deterministic = deterministic;
        return this;
    }


    /**
     * set 函数定义SQL。
     *
     * @param definitionSql
     */
    public GeneralAlterFunctionRequest definitionSql(String definitionSql) {
        this.definitionSql = definitionSql;
        return this;
    }


    /**
     * set 函数定义SQL。
     *
     * @param completeSql
     */
    public GeneralAlterFunctionRequest completeSql(String completeSql) {
        this.completeSql = completeSql;
        return this;
    }


    /**
    * set 参数列表。
    *
    * @param parameters
    */
    public GeneralAlterFunctionRequest parameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }


    /**
     * set 定义者。
     *
     * @param definer
     */
    public GeneralAlterFunctionRequest definer(String definer) {
        this.definer = definer;
        return this;
    }


    /**
     * set 注释。
     *
     * @param comment
     */
    public GeneralAlterFunctionRequest comment(String comment) {
        this.comment = comment;
        return this;
    }


    /**
     * set 返回值类型，TINYINT(&quot;TINYINT&quot;, 0), SMALLINT(&quot;SMALLINT&quot;, 1), MEDIUMINT(&quot;MEDIUMINT&quot;, 2), INT(&quot;INT&quot;, 3), BIGINT(&quot;BIGINT&quot;, 4), INTEGER(&quot;INTEGER&quot;, 5), FLOAT(&quot;FLOAT&quot;, 6), DOUBLE(&quot;DOUBLE&quot;, 7), REAL(&quot;REAL&quot;, 8), DECIMAL(&quot;DECIMAL&quot;, 9), CHAR(&quot;CHAR&quot;, 10), VARCHAR(&quot;VARCHAR&quot;, 11), TINYTEXT(&quot;TINYTEXT&quot;, 12), TEXT(&quot;TEXT&quot;, 13), MEDIUMTEXT(&quot;MEDIUMTEXT&quot;, 14), LONGTEXT(&quot;LONGTEXT&quot;, 15), DATE(&quot;DATE&quot;, 16), DATETIME(&quot;DATETIME&quot;, 17), TIMESTAMP(&quot;TIMESTAMP&quot;, 18), TIME(&quot;TIME&quot;, 19), YEAR(&quot;YEAR&quot;, 19), BINARY(&quot;BINARY&quot;, 20), VARBINARY(&quot;VARBINARY&quot;, 21), TINYBLOB(&quot;TINYBLOB&quot;, 22), BLOB(&quot;BLOB&quot;, 23), MEDIUMBLOB(&quot;MEDIUMBLOB&quot;, 24), LONGBLOB(&quot;LONGBLOB&quot;, 25);
     *
     * @param returnType
     */
    public GeneralAlterFunctionRequest returnType(String returnType) {
        this.returnType = returnType;
        return this;
    }


    /**
     * set 返回值长度。
     *
     * @param returnLength
     */
    public GeneralAlterFunctionRequest returnLength(Integer returnLength) {
        this.returnLength = returnLength;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public GeneralAlterFunctionRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 参数列表。
     *
     * @param parameter
     */
    public void addParameter(Parameter parameter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parameter);
    }
}