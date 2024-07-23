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
 * SSH密钥对
 * 关于SSH密钥对的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lavm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.lavm.model.Keypair;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 
批量查询密钥对。

详细操作说明请参考帮助文档：[密钥概述](https://docs.jdcloud.com/cn/virtual-machines/keypair-overview)

## 接口说明
- 使用 &#x60;filters&#x60; 过滤器进行条件筛选，每个 &#x60;filter&#x60; 之间的关系为逻辑与（AND）的关系。
- 单次查询最大可查询100条密钥数据。

 */
public class DescribeKeypairsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * keypairs
     */
    
    private List<Keypair> keypairs;
    /**
     * 本次查询可匹配到的总记录数，使用者需要结合 &#x60;pageNumber&#x60; 和 &#x60;pageSize&#x60; 计算是否可以继续分页。
     */
    private Number totalCount;



    /**
    * get keypairs
    *
    * @return
    */
    public List<Keypair> getKeypairs() {
        return keypairs;
    }

    /**
    * set keypairs
    *
    * @param keypairs
    */
    public void setKeypairs(List<Keypair> keypairs) {
        this.keypairs = keypairs;
    }


    /**
     * get 本次查询可匹配到的总记录数，使用者需要结合 &#x60;pageNumber&#x60; 和 &#x60;pageSize&#x60; 计算是否可以继续分页。
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set 本次查询可匹配到的总记录数，使用者需要结合 &#x60;pageNumber&#x60; 和 &#x60;pageSize&#x60; 计算是否可以继续分页。
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set keypairs
    *
    * @param keypairs
    */
    public DescribeKeypairsResult keypairs(List<Keypair> keypairs) {
        this.keypairs = keypairs;
        return this;
    }


    /**
     * set 本次查询可匹配到的总记录数，使用者需要结合 &#x60;pageNumber&#x60; 和 &#x60;pageSize&#x60; 计算是否可以继续分页。
     *
     * @param totalCount
     */
    public DescribeKeypairsResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to keypairs
     *
     * @param keypair
     */
    public void addKeypair(Keypair keypair) {
        if (this.keypairs == null) {
            this.keypairs = new ArrayList<>();
        }
        this.keypairs.add(keypair);
    }
}