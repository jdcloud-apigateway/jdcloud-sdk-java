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

package com.jdcloud.sdk.service.iam.model;


/**
 * azMappingVo
 */
public class AzMappingVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 逻辑 Az
     */
    private String laz;

    /**
     * 物理 Az
     */
    private String paz;



    /**
     * get 逻辑 Az
     *
     * @return
     */
    public String getLaz() {
        return laz;
    }

    /**
     * set 逻辑 Az
     *
     * @param laz
     */
    public void setLaz(String laz) {
        this.laz = laz;
    }


    /**
     * get 物理 Az
     *
     * @return
     */
    public String getPaz() {
        return paz;
    }

    /**
     * set 物理 Az
     *
     * @param paz
     */
    public void setPaz(String paz) {
        this.paz = paz;
    }



    /**
     * set 逻辑 Az
     *
     * @param laz
     */
    public AzMappingVo laz(String laz) {
        this.laz = laz;
        return this;
    }


    /**
     * set 物理 Az
     *
     * @param paz
     */
    public AzMappingVo paz(String paz) {
        this.paz = paz;
        return this;
    }


}