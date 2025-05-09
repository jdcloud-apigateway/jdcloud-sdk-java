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
 * JrtcUser
 * 用户管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.openjrtc.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询peer对应的用户信息

 */
public class DescribeUserByPeerRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * peerId
     * Required:true
     */
    @Required
    private Long peerId;



    /**
     * get peerId
     *
     * @return
     */
    public Long getPeerId() {
        return peerId;
    }

    /**
     * set peerId
     *
     * @param peerId
     */
    public void setPeerId(Long peerId) {
        this.peerId = peerId;
    }



    /**
     * set peerId
     *
     * @param peerId
     */
    public DescribeUserByPeerRequest peerId(Long peerId) {
        this.peerId = peerId;
        return this;
    }


}