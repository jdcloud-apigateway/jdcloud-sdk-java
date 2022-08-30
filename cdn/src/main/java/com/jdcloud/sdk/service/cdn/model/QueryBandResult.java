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
 * 统计查询类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cdn.model.BandTrafficDataItem;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 带宽查询接口
 */
public class QueryBandResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * resultList
     */
    
    private List<BandTrafficDataItem> resultList;


    /**
    * get resultList
    *
    * @return
    */
    public List<BandTrafficDataItem> getResultList() {
        return resultList;
    }

    /**
    * set resultList
    *
    * @param resultList
    */
    public void setResultList(List<BandTrafficDataItem> resultList) {
        this.resultList = resultList;
    }



    /**
    * set resultList
    *
    * @param resultList
    */
    public QueryBandResult resultList(List<BandTrafficDataItem> resultList) {
        this.resultList = resultList;
        return this;
    }



    /**
     * add item to resultList
     *
     * @param resultList
     */
    public void addResultList(BandTrafficDataItem resultList) {
        if (this.resultList == null) {
            this.resultList = new ArrayList<>();
        }
        this.resultList.add(resultList);
    }
}