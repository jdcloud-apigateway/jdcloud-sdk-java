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
 * Backend
 * 后端服务相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.lb.model.Backend;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询后端服务列表
 */
public class DescribeBackendsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * backends
     */
    
    private List<Backend> backends;
    /**
     * 总数量
     */
    private Integer totalCount;



    /**
    * get backends
    *
    * @return
    */
    public List<Backend> getBackends() {
        return backends;
    }

    /**
    * set backends
    *
    * @param backends
    */
    public void setBackends(List<Backend> backends) {
        this.backends = backends;
    }


    /**
     * get 总数量
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set backends
    *
    * @param backends
    */
    public DescribeBackendsResult backends(List<Backend> backends) {
        this.backends = backends;
        return this;
    }


    /**
     * set 总数量
     *
     * @param totalCount
     */
    public DescribeBackendsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to backends
     *
     * @param backend
     */
    public void addBackend(Backend backend) {
        if (this.backends == null) {
            this.backends = new ArrayList<>();
        }
        this.backends.add(backend);
    }
}