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
 * 合同管理接口
 * 电子签章-合同管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudsign.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cloudsign.model.ContractInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取已签章合同列表
 */
public class DescribeContractListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * contractList
     */
    
    private List<ContractInfo> contractList;
    /**
     * 合同数量
     */
    private Integer totalCount;



    /**
    * get contractList
    *
    * @return
    */
    public List<ContractInfo> getContractList() {
        return contractList;
    }

    /**
    * set contractList
    *
    * @param contractList
    */
    public void setContractList(List<ContractInfo> contractList) {
        this.contractList = contractList;
    }


    /**
     * get 合同数量
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 合同数量
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set contractList
    *
    * @param contractList
    */
    public DescribeContractListResult contractList(List<ContractInfo> contractList) {
        this.contractList = contractList;
        return this;
    }


    /**
     * set 合同数量
     *
     * @param totalCount
     */
    public DescribeContractListResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to contractList
     *
     * @param contractList
     */
    public void addContractList(ContractInfo contractList) {
        if (this.contractList == null) {
            this.contractList = new ArrayList<>();
        }
        this.contractList.add(contractList);
    }
}