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
 * bastion
 * 云堡垒机相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.bastion.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.bastion.model.Bastion;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 批量查询堡垒机的信息，此接口支持分页查询，默认每页20条
 */
public class DescribeBastionsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * bastions
     */
    
    private List<Bastion> bastions;
    /**
     * totalCount
     */
    private Number totalCount;



    /**
    * get bastions
    *
    * @return
    */
    public List<Bastion> getBastions() {
        return bastions;
    }

    /**
    * set bastions
    *
    * @param bastions
    */
    public void setBastions(List<Bastion> bastions) {
        this.bastions = bastions;
    }


    /**
     * get totalCount
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }



    /**
    * set bastions
    *
    * @param bastions
    */
    public DescribeBastionsResult bastions(List<Bastion> bastions) {
        this.bastions = bastions;
        return this;
    }


    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeBastionsResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }



    /**
     * add item to bastions
     *
     * @param bastion
     */
    public void addBastion(Bastion bastion) {
        if (this.bastions == null) {
            this.bastions = new ArrayList<>();
        }
        this.bastions.add(bastion);
    }
}