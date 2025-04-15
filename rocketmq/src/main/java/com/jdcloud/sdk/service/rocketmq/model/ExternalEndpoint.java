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

package com.jdcloud.sdk.service.rocketmq.model;

import java.util.List;
import java.util.ArrayList;

/**
 * externalEndpoint
 */
public class ExternalEndpoint  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 外部访问地址
     */
    
    private List<EndpointEntry> external;
    /**
     * 内部访问地址
     */
    
    private List<EndpointEntry> internal;
    /**
     * 公网访问地址
     */
    
    private List<EndpointEntry> publicNetwork;


    /**
    * get 外部访问地址
    *
    * @return
    */
    public List<EndpointEntry> getExternal() {
        return external;
    }

    /**
    * set 外部访问地址
    *
    * @param external
    */
    public void setExternal(List<EndpointEntry> external) {
        this.external = external;
    }


    /**
    * get 内部访问地址
    *
    * @return
    */
    public List<EndpointEntry> getInternal() {
        return internal;
    }

    /**
    * set 内部访问地址
    *
    * @param internal
    */
    public void setInternal(List<EndpointEntry> internal) {
        this.internal = internal;
    }


    /**
    * get 公网访问地址
    *
    * @return
    */
    public List<EndpointEntry> getPublicNetwork() {
        return publicNetwork;
    }

    /**
    * set 公网访问地址
    *
    * @param publicNetwork
    */
    public void setPublicNetwork(List<EndpointEntry> publicNetwork) {
        this.publicNetwork = publicNetwork;
    }



    /**
    * set 外部访问地址
    *
    * @param external
    */
    public ExternalEndpoint external(List<EndpointEntry> external) {
        this.external = external;
        return this;
    }


    /**
    * set 内部访问地址
    *
    * @param internal
    */
    public ExternalEndpoint internal(List<EndpointEntry> internal) {
        this.internal = internal;
        return this;
    }


    /**
    * set 公网访问地址
    *
    * @param publicNetwork
    */
    public ExternalEndpoint publicNetwork(List<EndpointEntry> publicNetwork) {
        this.publicNetwork = publicNetwork;
        return this;
    }



    /**
     * add item to 外部访问地址
     *
     * @param external
     */
    public void addExternal(EndpointEntry external) {
        if (this.external == null) {
            this.external = new ArrayList<>();
        }
        this.external.add(external);
    }

    /**
     * add item to 内部访问地址
     *
     * @param internal
     */
    public void addInternal(EndpointEntry internal) {
        if (this.internal == null) {
            this.internal = new ArrayList<>();
        }
        this.internal.add(internal);
    }

    /**
     * add item to 公网访问地址
     *
     * @param publicNetwork
     */
    public void addPublicNetwork(EndpointEntry publicNetwork) {
        if (this.publicNetwork == null) {
            this.publicNetwork = new ArrayList<>();
        }
        this.publicNetwork.add(publicNetwork);
    }
}