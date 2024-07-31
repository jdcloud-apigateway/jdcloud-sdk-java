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

package com.jdcloud.sdk.service.user.model;


/**
 * userAzsVo
 */
public class UserAzsVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * lAz
     */
    private String lAz;

    /**
     * cloudManufacturer
     */
    private String cloudManufacturer;

    /**
     * pAz
     */
    private String pAz;



    /**
     * get lAz
     *
     * @return
     */
    public String getLAz() {
        return lAz;
    }

    /**
     * set lAz
     *
     * @param lAz
     */
    public void setLAz(String lAz) {
        this.lAz = lAz;
    }


    /**
     * get cloudManufacturer
     *
     * @return
     */
    public String getCloudManufacturer() {
        return cloudManufacturer;
    }

    /**
     * set cloudManufacturer
     *
     * @param cloudManufacturer
     */
    public void setCloudManufacturer(String cloudManufacturer) {
        this.cloudManufacturer = cloudManufacturer;
    }


    /**
     * get pAz
     *
     * @return
     */
    public String getPAz() {
        return pAz;
    }

    /**
     * set pAz
     *
     * @param pAz
     */
    public void setPAz(String pAz) {
        this.pAz = pAz;
    }



    /**
     * set lAz
     *
     * @param lAz
     */
    public UserAzsVo lAz(String lAz) {
        this.lAz = lAz;
        return this;
    }


    /**
     * set cloudManufacturer
     *
     * @param cloudManufacturer
     */
    public UserAzsVo cloudManufacturer(String cloudManufacturer) {
        this.cloudManufacturer = cloudManufacturer;
        return this;
    }


    /**
     * set pAz
     *
     * @param pAz
     */
    public UserAzsVo pAz(String pAz) {
        this.pAz = pAz;
        return this;
    }


}