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

package com.jdcloud.sdk.service.smartdba.model;


/**
 * indexInfo
 */
public class IndexInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 索引名称
     */
    private String indexName;

    /**
     * 库名
     */
    private String db;

    /**
     * 表名
     */
    private String tableName;


    /**
     * get 索引名称
     *
     * @return
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * set 索引名称
     *
     * @param indexName
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * get 库名
     *
     * @return
     */
    public String getDb() {
        return db;
    }

    /**
     * set 库名
     *
     * @param db
     */
    public void setDb(String db) {
        this.db = db;
    }

    /**
     * get 表名
     *
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * set 表名
     *
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    /**
     * set 索引名称
     *
     * @param indexName
     */
    public IndexInfo indexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * set 库名
     *
     * @param db
     */
    public IndexInfo db(String db) {
        this.db = db;
        return this;
    }

    /**
     * set 表名
     *
     * @param tableName
     */
    public IndexInfo tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }


}