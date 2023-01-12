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
 * poPDetailRes
 */
public class PoPDetailRes  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * PoP节点ID
     */
    private Integer id;

    /**
     * PoP节点名称
     */
    private String name;

    /**
     * 区域
     */
    private String region;

    /**
     * 城市
     */
    private String city;

    /**
     * 节点状态
     */
    private String status;

    /**
     * 运营商信息(CT-&gt;中国电信 CM-&gt;中国移动 CU-&gt;中国联通)
     */
    private String isp;

    /**
     * routing_modes
     */
    private Object routing_modes;

    /**
     * service_levels
     */
    private Object service_levels;



    /**
     * get PoP节点ID
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set PoP节点ID
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get PoP节点名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set PoP节点名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 区域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 区域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * get 城市
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * set 城市
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * get 节点状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 节点状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 运营商信息(CT-&gt;中国电信 CM-&gt;中国移动 CU-&gt;中国联通)
     *
     * @return
     */
    public String getIsp() {
        return isp;
    }

    /**
     * set 运营商信息(CT-&gt;中国电信 CM-&gt;中国移动 CU-&gt;中国联通)
     *
     * @param isp
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }


    /**
     * get routing_modes
     *
     * @return
     */
    public Object getRouting_modes() {
        return routing_modes;
    }

    /**
     * set routing_modes
     *
     * @param routing_modes
     */
    public void setRouting_modes(Object routing_modes) {
        this.routing_modes = routing_modes;
    }


    /**
     * get service_levels
     *
     * @return
     */
    public Object getService_levels() {
        return service_levels;
    }

    /**
     * set service_levels
     *
     * @param service_levels
     */
    public void setService_levels(Object service_levels) {
        this.service_levels = service_levels;
    }



    /**
     * set PoP节点ID
     *
     * @param id
     */
    public PoPDetailRes id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set PoP节点名称
     *
     * @param name
     */
    public PoPDetailRes name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 区域
     *
     * @param region
     */
    public PoPDetailRes region(String region) {
        this.region = region;
        return this;
    }


    /**
     * set 城市
     *
     * @param city
     */
    public PoPDetailRes city(String city) {
        this.city = city;
        return this;
    }


    /**
     * set 节点状态
     *
     * @param status
     */
    public PoPDetailRes status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 运营商信息(CT-&gt;中国电信 CM-&gt;中国移动 CU-&gt;中国联通)
     *
     * @param isp
     */
    public PoPDetailRes isp(String isp) {
        this.isp = isp;
        return this;
    }


    /**
     * set routing_modes
     *
     * @param routing_modes
     */
    public PoPDetailRes routing_modes(Object routing_modes) {
        this.routing_modes = routing_modes;
        return this;
    }


    /**
     * set service_levels
     *
     * @param service_levels
     */
    public PoPDetailRes service_levels(Object service_levels) {
        this.service_levels = service_levels;
        return this;
    }


}