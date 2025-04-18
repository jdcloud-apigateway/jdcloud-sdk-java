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


/**
 * jtlasSearchNode
 */
public class JtlasSearchNode  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 节点id
     */
    private String id;

    /**
     * 节点方向
     */
    private String direction;

    /**
     * 节点数据
     */
    private Object data;



    /**
     * get 节点id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 节点id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * get 节点方向
     *
     * @return
     */
    public String getDirection() {
        return direction;
    }

    /**
     * set 节点方向
     *
     * @param direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }


    /**
     * get 节点数据
     *
     * @return
     */
    public Object getData() {
        return data;
    }

    /**
     * set 节点数据
     *
     * @param data
     */
    public void setData(Object data) {
        this.data = data;
    }



    /**
     * set 节点id
     *
     * @param id
     */
    public JtlasSearchNode id(String id) {
        this.id = id;
        return this;
    }


    /**
     * set 节点方向
     *
     * @param direction
     */
    public JtlasSearchNode direction(String direction) {
        this.direction = direction;
        return this;
    }


    /**
     * set 节点数据
     *
     * @param data
     */
    public JtlasSearchNode data(Object data) {
        this.data = data;
        return this;
    }


}