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

package com.jdcloud.sdk.service.gcs.model;


/**
 * artImage
 */
public class ArtImage  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像ID
     */
    private String imageId;

    /**
     * 镜像名称
     */
    private String name;

    /**
     * 镜像基础描述信息
     */
    private String app;



    /**
     * get 镜像ID
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }


    /**
     * get 镜像名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 镜像名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 镜像基础描述信息
     *
     * @return
     */
    public String getApp() {
        return app;
    }

    /**
     * set 镜像基础描述信息
     *
     * @param app
     */
    public void setApp(String app) {
        this.app = app;
    }



    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public ArtImage imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }


    /**
     * set 镜像名称
     *
     * @param name
     */
    public ArtImage name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 镜像基础描述信息
     *
     * @param app
     */
    public ArtImage app(String app) {
        this.app = app;
        return this;
    }


}