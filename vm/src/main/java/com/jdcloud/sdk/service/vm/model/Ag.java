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
 * 高可用组信息。
 */
public class Ag  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 高可用组名称。
     */
    private String name;

    /**
     * 高可用组ID。
     */
    private String id;



    /**
     * get 高可用组名称。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 高可用组名称。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 高可用组ID。
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 高可用组ID。
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }



    /**
     * set 高可用组名称。
     *
     * @param name
     */
    public Ag name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 高可用组ID。
     *
     * @param id
     */
    public Ag id(String id) {
        this.id = id;
        return this;
    }


}