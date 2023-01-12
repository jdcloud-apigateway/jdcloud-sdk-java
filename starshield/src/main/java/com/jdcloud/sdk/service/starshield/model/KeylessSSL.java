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
 * keylessSSL
 */
public class KeylessSSL  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The keyless SSL port used to commmunicate between JDC StarShield and the client&#39;s Keyless SSL server
     */
    private Number port;

    /**
     * Whether or not the Keyless SSL is on or off
     */
    private Boolean enabled;

    /**
     * Available permissions for the Keyless SSL for the current user requesting the item
     */
    
    private List<String> permissions;
    /**
     * The keyless SSL name
     */
    private String host;

    /**
     * The keyless SSL name
     */
    private String name;

    /**
     * Status of the Keyless SSL
     */
    private String status;

    /**
     * When the Keyless SSL was last modified
     */
    private String modified_on;

    /**
     * When the Keyless SSL was created
     */
    private String created_on;

    /**
     * Keyless certificate identifier tag
     */
    private String id;



    /**
     * get The keyless SSL port used to commmunicate between JDC StarShield and the client&#39;s Keyless SSL server
     *
     * @return
     */
    public Number getPort() {
        return port;
    }

    /**
     * set The keyless SSL port used to commmunicate between JDC StarShield and the client&#39;s Keyless SSL server
     *
     * @param port
     */
    public void setPort(Number port) {
        this.port = port;
    }


    /**
     * get Whether or not the Keyless SSL is on or off
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set Whether or not the Keyless SSL is on or off
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
    * get Available permissions for the Keyless SSL for the current user requesting the item
    *
    * @return
    */
    public List<String> getPermissions() {
        return permissions;
    }

    /**
    * set Available permissions for the Keyless SSL for the current user requesting the item
    *
    * @param permissions
    */
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }


    /**
     * get The keyless SSL name
     *
     * @return
     */
    public String getHost() {
        return host;
    }

    /**
     * set The keyless SSL name
     *
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }


    /**
     * get The keyless SSL name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set The keyless SSL name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get Status of the Keyless SSL
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set Status of the Keyless SSL
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get When the Keyless SSL was last modified
     *
     * @return
     */
    public String getModified_on() {
        return modified_on;
    }

    /**
     * set When the Keyless SSL was last modified
     *
     * @param modified_on
     */
    public void setModified_on(String modified_on) {
        this.modified_on = modified_on;
    }


    /**
     * get When the Keyless SSL was created
     *
     * @return
     */
    public String getCreated_on() {
        return created_on;
    }

    /**
     * set When the Keyless SSL was created
     *
     * @param created_on
     */
    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }


    /**
     * get Keyless certificate identifier tag
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set Keyless certificate identifier tag
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }



    /**
     * set The keyless SSL port used to commmunicate between JDC StarShield and the client&#39;s Keyless SSL server
     *
     * @param port
     */
    public KeylessSSL port(Number port) {
        this.port = port;
        return this;
    }


    /**
     * set Whether or not the Keyless SSL is on or off
     *
     * @param enabled
     */
    public KeylessSSL enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }


    /**
    * set Available permissions for the Keyless SSL for the current user requesting the item
    *
    * @param permissions
    */
    public KeylessSSL permissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }


    /**
     * set The keyless SSL name
     *
     * @param host
     */
    public KeylessSSL host(String host) {
        this.host = host;
        return this;
    }


    /**
     * set The keyless SSL name
     *
     * @param name
     */
    public KeylessSSL name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set Status of the Keyless SSL
     *
     * @param status
     */
    public KeylessSSL status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set When the Keyless SSL was last modified
     *
     * @param modified_on
     */
    public KeylessSSL modified_on(String modified_on) {
        this.modified_on = modified_on;
        return this;
    }


    /**
     * set When the Keyless SSL was created
     *
     * @param created_on
     */
    public KeylessSSL created_on(String created_on) {
        this.created_on = created_on;
        return this;
    }


    /**
     * set Keyless certificate identifier tag
     *
     * @param id
     */
    public KeylessSSL id(String id) {
        this.id = id;
        return this;
    }



    /**
     * add item to Available permissions for the Keyless SSL for the current user requesting the item
     *
     * @param permission
     */
    public void addPermission(String permission) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permission);
    }
}