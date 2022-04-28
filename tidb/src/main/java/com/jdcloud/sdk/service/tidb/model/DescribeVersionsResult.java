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
 * Common
 * 公共接口管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取TiDB产品提供的所有版本
 */
public class DescribeVersionsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * versions
     */
    private List<String> versions;


    /**
     * get versions
     *
     * @return
     */
    public List<String> getVersions() {
        return versions;
    }

    /**
     * set versions
     *
     * @param versions
     */
    public void setVersions(List<String> versions) {
        this.versions = versions;
    }


    /**
     * set versions
     *
     * @param versions
     */
    public DescribeVersionsResult versions(List<String> versions) {
        this.versions = versions;
        return this;
    }


    /**
     * add item to versions
     *
     * @param version
     */
    public void addVersion(String version) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(version);
    }

}