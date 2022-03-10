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
 * Sql
 * Sql操作
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dms.model.TableStruct;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 表结构导出
 */
public class ExportStructResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * tableStructs
     */
    private List<TableStruct> tableStructs;


    /**
     * get tableStructs
     *
     * @return
     */
    public List<TableStruct> getTableStructs() {
        return tableStructs;
    }

    /**
     * set tableStructs
     *
     * @param tableStructs
     */
    public void setTableStructs(List<TableStruct> tableStructs) {
        this.tableStructs = tableStructs;
    }


    /**
     * set tableStructs
     *
     * @param tableStructs
     */
    public ExportStructResult tableStructs(List<TableStruct> tableStructs) {
        this.tableStructs = tableStructs;
        return this;
    }


    /**
     * add item to tableStructs
     *
     * @param tableStruct
     */
    public void addTableStruct(TableStruct tableStruct) {
        if (this.tableStructs == null) {
            this.tableStructs = new ArrayList<>();
        }
        this.tableStructs.add(tableStruct);
    }

}