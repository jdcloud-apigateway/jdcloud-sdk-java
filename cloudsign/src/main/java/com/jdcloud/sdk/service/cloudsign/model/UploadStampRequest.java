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
 * 印章管理接口
 * 电子签章-印章管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudsign.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.cloudsign.model.StampSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 上传印章
 */
public class UploadStampRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * stampSpec
     * Required:true
     */
    @Required
    private StampSpec stampSpec;



    /**
     * get stampSpec
     *
     * @return
     */
    public StampSpec getStampSpec() {
        return stampSpec;
    }

    /**
     * set stampSpec
     *
     * @param stampSpec
     */
    public void setStampSpec(StampSpec stampSpec) {
        this.stampSpec = stampSpec;
    }



    /**
     * set stampSpec
     *
     * @param stampSpec
     */
    public UploadStampRequest stampSpec(StampSpec stampSpec) {
        this.stampSpec = stampSpec;
        return this;
    }


}