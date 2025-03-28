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
 * 跨区复制镜像的映射关系。
 */
public class CopyImage  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 复制的新镜像ID。
     */
    private String destinationImageId;

    /**
     * 源镜像ID。
     */
    private String sourceImageId;



    /**
     * get 复制的新镜像ID。
     *
     * @return
     */
    public String getDestinationImageId() {
        return destinationImageId;
    }

    /**
     * set 复制的新镜像ID。
     *
     * @param destinationImageId
     */
    public void setDestinationImageId(String destinationImageId) {
        this.destinationImageId = destinationImageId;
    }


    /**
     * get 源镜像ID。
     *
     * @return
     */
    public String getSourceImageId() {
        return sourceImageId;
    }

    /**
     * set 源镜像ID。
     *
     * @param sourceImageId
     */
    public void setSourceImageId(String sourceImageId) {
        this.sourceImageId = sourceImageId;
    }



    /**
     * set 复制的新镜像ID。
     *
     * @param destinationImageId
     */
    public CopyImage destinationImageId(String destinationImageId) {
        this.destinationImageId = destinationImageId;
        return this;
    }


    /**
     * set 源镜像ID。
     *
     * @param sourceImageId
     */
    public CopyImage sourceImageId(String sourceImageId) {
        this.sourceImageId = sourceImageId;
        return this;
    }


}