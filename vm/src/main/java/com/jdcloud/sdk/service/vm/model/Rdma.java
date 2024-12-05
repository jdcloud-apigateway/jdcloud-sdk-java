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

package com.jdcloud.sdk.service.vm.model;


/**
 * 云主机规格RDMA信息。
 */
public class Rdma  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * RDMA网卡个数。
     */
    private Integer count;

    /**
     * RDMA网卡带宽。
     */
    private Integer bandwidthGbps;



    /**
     * get RDMA网卡个数。
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set RDMA网卡个数。
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }


    /**
     * get RDMA网卡带宽。
     *
     * @return
     */
    public Integer getBandwidthGbps() {
        return bandwidthGbps;
    }

    /**
     * set RDMA网卡带宽。
     *
     * @param bandwidthGbps
     */
    public void setBandwidthGbps(Integer bandwidthGbps) {
        this.bandwidthGbps = bandwidthGbps;
    }



    /**
     * set RDMA网卡个数。
     *
     * @param count
     */
    public Rdma count(Integer count) {
        this.count = count;
        return this;
    }


    /**
     * set RDMA网卡带宽。
     *
     * @param bandwidthGbps
     */
    public Rdma bandwidthGbps(Integer bandwidthGbps) {
        this.bandwidthGbps = bandwidthGbps;
        return this;
    }


}