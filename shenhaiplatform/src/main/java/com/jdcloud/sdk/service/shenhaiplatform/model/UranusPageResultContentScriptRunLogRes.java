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

/**
 * Object
 */
public class UranusPageResultContentScriptRunLogRes  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * totalPage
     */
    private Integer totalPage;

    /**
     * totalRecords
     */
    private Integer totalRecords;

    /**
     * list
     */
    
    private List<UranusScriptRunLogRes> list;


    /**
     * get totalPage
     *
     * @return
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * set totalPage
     *
     * @param totalPage
     */
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }


    /**
     * get totalRecords
     *
     * @return
     */
    public Integer getTotalRecords() {
        return totalRecords;
    }

    /**
     * set totalRecords
     *
     * @param totalRecords
     */
    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
    * get list
    *
    * @return
    */
    public List<UranusScriptRunLogRes> getList() {
        return list;
    }

    /**
    * set list
    *
    * @param list
    */
    public void setList(List<UranusScriptRunLogRes> list) {
        this.list = list;
    }



    /**
     * set totalPage
     *
     * @param totalPage
     */
    public UranusPageResultContentScriptRunLogRes totalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }


    /**
     * set totalRecords
     *
     * @param totalRecords
     */
    public UranusPageResultContentScriptRunLogRes totalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }


    /**
    * set list
    *
    * @param list
    */
    public UranusPageResultContentScriptRunLogRes list(List<UranusScriptRunLogRes> list) {
        this.list = list;
        return this;
    }



    /**
     * add item to list
     *
     * @param list
     */
    public void addList(UranusScriptRunLogRes list) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(list);
    }
}