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
 * 线性统计数据VO对象
 */
public class GpmnLineStringDataVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 统计信息清单
     */
    
    private List<GpmnLineData> countInfoList;
    /**
     * xdata
     */
    
    private List<String> xdata;


    /**
    * get 统计信息清单
    *
    * @return
    */
    public List<GpmnLineData> getCountInfoList() {
        return countInfoList;
    }

    /**
    * set 统计信息清单
    *
    * @param countInfoList
    */
    public void setCountInfoList(List<GpmnLineData> countInfoList) {
        this.countInfoList = countInfoList;
    }


    /**
    * get xdata
    *
    * @return
    */
    public List<String> getXdata() {
        return xdata;
    }

    /**
    * set xdata
    *
    * @param xdata
    */
    public void setXdata(List<String> xdata) {
        this.xdata = xdata;
    }



    /**
    * set 统计信息清单
    *
    * @param countInfoList
    */
    public GpmnLineStringDataVo countInfoList(List<GpmnLineData> countInfoList) {
        this.countInfoList = countInfoList;
        return this;
    }


    /**
    * set xdata
    *
    * @param xdata
    */
    public GpmnLineStringDataVo xdata(List<String> xdata) {
        this.xdata = xdata;
        return this;
    }



    /**
     * add item to 统计信息清单
     *
     * @param countInfoList
     */
    public void addCountInfoList(GpmnLineData countInfoList) {
        if (this.countInfoList == null) {
            this.countInfoList = new ArrayList<>();
        }
        this.countInfoList.add(countInfoList);
    }

    /**
     * add item to xdata
     *
     * @param xdata
     */
    public void addXdata(String xdata) {
        if (this.xdata == null) {
            this.xdata = new ArrayList<>();
        }
        this.xdata.add(xdata);
    }
}