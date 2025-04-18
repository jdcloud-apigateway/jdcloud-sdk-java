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
 * streamFilter
 */
public class StreamFilter  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * k
     */
    private String k;

    /**
     * v
     */
    private String v;

    /**
     * 表达式
     */
    private String exp;



    /**
     * get k
     *
     * @return
     */
    public String getK() {
        return k;
    }

    /**
     * set k
     *
     * @param k
     */
    public void setK(String k) {
        this.k = k;
    }


    /**
     * get v
     *
     * @return
     */
    public String getV() {
        return v;
    }

    /**
     * set v
     *
     * @param v
     */
    public void setV(String v) {
        this.v = v;
    }


    /**
     * get 表达式
     *
     * @return
     */
    public String getExp() {
        return exp;
    }

    /**
     * set 表达式
     *
     * @param exp
     */
    public void setExp(String exp) {
        this.exp = exp;
    }



    /**
     * set k
     *
     * @param k
     */
    public StreamFilter k(String k) {
        this.k = k;
        return this;
    }


    /**
     * set v
     *
     * @param v
     */
    public StreamFilter v(String v) {
        this.v = v;
        return this;
    }


    /**
     * set 表达式
     *
     * @param exp
     */
    public StreamFilter exp(String exp) {
        this.exp = exp;
        return this;
    }


}