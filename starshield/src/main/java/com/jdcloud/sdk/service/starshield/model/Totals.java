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


/**
 * totals
 */
public class Totals  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * since
     */
    private String since;

    /**
     * until
     */
    private String until;

    /**
     * requests
     */
    private Requests requests;

    /**
     * bandwidth
     */
    private Bandwidth bandwidth;


    /**
     * get since
     *
     * @return
     */
    public String getSince() {
        return since;
    }

    /**
     * set since
     *
     * @param since
     */
    public void setSince(String since) {
        this.since = since;
    }

    /**
     * get until
     *
     * @return
     */
    public String getUntil() {
        return until;
    }

    /**
     * set until
     *
     * @param until
     */
    public void setUntil(String until) {
        this.until = until;
    }

    /**
     * get requests
     *
     * @return
     */
    public Requests getRequests() {
        return requests;
    }

    /**
     * set requests
     *
     * @param requests
     */
    public void setRequests(Requests requests) {
        this.requests = requests;
    }

    /**
     * get bandwidth
     *
     * @return
     */
    public Bandwidth getBandwidth() {
        return bandwidth;
    }

    /**
     * set bandwidth
     *
     * @param bandwidth
     */
    public void setBandwidth(Bandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }


    /**
     * set since
     *
     * @param since
     */
    public Totals since(String since) {
        this.since = since;
        return this;
    }

    /**
     * set until
     *
     * @param until
     */
    public Totals until(String until) {
        this.until = until;
        return this;
    }

    /**
     * set requests
     *
     * @param requests
     */
    public Totals requests(Requests requests) {
        this.requests = requests;
        return this;
    }

    /**
     * set bandwidth
     *
     * @param bandwidth
     */
    public Totals bandwidth(Bandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }


}