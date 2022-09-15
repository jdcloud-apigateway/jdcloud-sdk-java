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

package com.jdcloud.sdk.service.redis.model;


/**
 * 节点信息
 */
public class Node  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * ip
     */
    private String ip;

    /**
     * port
     */
    private Integer port;



    /**
     * get id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * get ip
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set ip
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }


    /**
     * get port
     *
     * @return
     */
    public Integer getPort() {
        return port;
    }

    /**
     * set port
     *
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }



    /**
     * set id
     *
     * @param id
     */
    public Node id(String id) {
        this.id = id;
        return this;
    }


    /**
     * set ip
     *
     * @param ip
     */
    public Node ip(String ip) {
        this.ip = ip;
        return this;
    }


    /**
     * set port
     *
     * @param port
     */
    public Node port(Integer port) {
        this.port = port;
        return this;
    }


}