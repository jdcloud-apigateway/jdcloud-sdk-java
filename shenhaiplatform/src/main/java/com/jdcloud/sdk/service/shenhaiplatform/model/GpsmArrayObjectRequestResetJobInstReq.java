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
 * gpsmArrayObjectRequestResetJobInstReq
 */
public class GpsmArrayObjectRequestResetJobInstReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * arrayObjectParam
     */
    
    private List<GpsmResetJobInstReq> arrayObjectParam;


    /**
    * get arrayObjectParam
    *
    * @return
    */
    public List<GpsmResetJobInstReq> getArrayObjectParam() {
        return arrayObjectParam;
    }

    /**
    * set arrayObjectParam
    *
    * @param arrayObjectParam
    */
    public void setArrayObjectParam(List<GpsmResetJobInstReq> arrayObjectParam) {
        this.arrayObjectParam = arrayObjectParam;
    }



    /**
    * set arrayObjectParam
    *
    * @param arrayObjectParam
    */
    public GpsmArrayObjectRequestResetJobInstReq arrayObjectParam(List<GpsmResetJobInstReq> arrayObjectParam) {
        this.arrayObjectParam = arrayObjectParam;
        return this;
    }



    /**
     * add item to arrayObjectParam
     *
     * @param arrayObjectParam
     */
    public void addArrayObjectParam(GpsmResetJobInstReq arrayObjectParam) {
        if (this.arrayObjectParam == null) {
            this.arrayObjectParam = new ArrayList<>();
        }
        this.arrayObjectParam.add(arrayObjectParam);
    }
}