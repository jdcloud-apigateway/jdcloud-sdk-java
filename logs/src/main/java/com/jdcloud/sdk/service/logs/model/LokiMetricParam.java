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

package com.jdcloud.sdk.service.logs.model;


/**
 * lokiMetricParam
 */
public class LokiMetricParam  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * name
     */
    private LokiMetricRangeFun rangeFun;

    /**
     * aggOpName
     */
    private String aggOpName;

    /**
     * orderBy
     */
    private String orderBy;



    /**
     * get name
     *
     * @return
     */
    public LokiMetricRangeFun getRangeFun() {
        return rangeFun;
    }

    /**
     * set name
     *
     * @param rangeFun
     */
    public void setRangeFun(LokiMetricRangeFun rangeFun) {
        this.rangeFun = rangeFun;
    }


    /**
     * get aggOpName
     *
     * @return
     */
    public String getAggOpName() {
        return aggOpName;
    }

    /**
     * set aggOpName
     *
     * @param aggOpName
     */
    public void setAggOpName(String aggOpName) {
        this.aggOpName = aggOpName;
    }


    /**
     * get orderBy
     *
     * @return
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * set orderBy
     *
     * @param orderBy
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }



    /**
     * set name
     *
     * @param rangeFun
     */
    public LokiMetricParam rangeFun(LokiMetricRangeFun rangeFun) {
        this.rangeFun = rangeFun;
        return this;
    }


    /**
     * set aggOpName
     *
     * @param aggOpName
     */
    public LokiMetricParam aggOpName(String aggOpName) {
        this.aggOpName = aggOpName;
        return this;
    }


    /**
     * set orderBy
     *
     * @param orderBy
     */
    public LokiMetricParam orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }


}