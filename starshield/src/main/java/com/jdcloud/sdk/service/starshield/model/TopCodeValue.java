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

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;

/**
 * topCodeValue
 */
public class TopCodeValue  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 排名
     */
    private Integer rank;

    /**
     * 具体值
     */
    private String src;

    /**
     * 统计值
     */
    private Integer pv;

    /**
     * status_code
     */
    
    private List<KVPair> status_code;


    /**
     * get 排名
     *
     * @return
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * set 排名
     *
     * @param rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }


    /**
     * get 具体值
     *
     * @return
     */
    public String getSrc() {
        return src;
    }

    /**
     * set 具体值
     *
     * @param src
     */
    public void setSrc(String src) {
        this.src = src;
    }


    /**
     * get 统计值
     *
     * @return
     */
    public Integer getPv() {
        return pv;
    }

    /**
     * set 统计值
     *
     * @param pv
     */
    public void setPv(Integer pv) {
        this.pv = pv;
    }


    /**
    * get status_code
    *
    * @return
    */
    public List<KVPair> getStatus_code() {
        return status_code;
    }

    /**
    * set status_code
    *
    * @param status_code
    */
    public void setStatus_code(List<KVPair> status_code) {
        this.status_code = status_code;
    }



    /**
     * set 排名
     *
     * @param rank
     */
    public TopCodeValue rank(Integer rank) {
        this.rank = rank;
        return this;
    }


    /**
     * set 具体值
     *
     * @param src
     */
    public TopCodeValue src(String src) {
        this.src = src;
        return this;
    }


    /**
     * set 统计值
     *
     * @param pv
     */
    public TopCodeValue pv(Integer pv) {
        this.pv = pv;
        return this;
    }


    /**
    * set status_code
    *
    * @param status_code
    */
    public TopCodeValue status_code(List<KVPair> status_code) {
        this.status_code = status_code;
        return this;
    }



    /**
     * add item to status_code
     *
     * @param status_code
     */
    public void addStatus_code(KVPair status_code) {
        if (this.status_code == null) {
            this.status_code = new ArrayList<>();
        }
        this.status_code.add(status_code);
    }
}