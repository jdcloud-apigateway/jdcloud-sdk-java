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

package com.jdcloud.sdk.service.pod.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * imageCache 的数据
 */
public class ImageCacheSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像地址
     * Required:true
     */
    @Required
    private String image;

    /**
     * 镜像仓库认证信息；使用Docker Hub和京东云CR的镜像不需要secret
     */
    private String secret;

    /**
     * 创建镜像缓存使用的云盘大小
     */
    private Integer size;

    /**
     * 保留天数，传0为永不过期
     */
    private Integer retentionDays;



    /**
     * get 镜像地址
     *
     * @return
     */
    public String getImage() {
        return image;
    }

    /**
     * set 镜像地址
     *
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }


    /**
     * get 镜像仓库认证信息；使用Docker Hub和京东云CR的镜像不需要secret
     *
     * @return
     */
    public String getSecret() {
        return secret;
    }

    /**
     * set 镜像仓库认证信息；使用Docker Hub和京东云CR的镜像不需要secret
     *
     * @param secret
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }


    /**
     * get 创建镜像缓存使用的云盘大小
     *
     * @return
     */
    public Integer getSize() {
        return size;
    }

    /**
     * set 创建镜像缓存使用的云盘大小
     *
     * @param size
     */
    public void setSize(Integer size) {
        this.size = size;
    }


    /**
     * get 保留天数，传0为永不过期
     *
     * @return
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    /**
     * set 保留天数，传0为永不过期
     *
     * @param retentionDays
     */
    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }



    /**
     * set 镜像地址
     *
     * @param image
     */
    public ImageCacheSpec image(String image) {
        this.image = image;
        return this;
    }


    /**
     * set 镜像仓库认证信息；使用Docker Hub和京东云CR的镜像不需要secret
     *
     * @param secret
     */
    public ImageCacheSpec secret(String secret) {
        this.secret = secret;
        return this;
    }


    /**
     * set 创建镜像缓存使用的云盘大小
     *
     * @param size
     */
    public ImageCacheSpec size(Integer size) {
        this.size = size;
        return this;
    }


    /**
     * set 保留天数，传0为永不过期
     *
     * @param retentionDays
     */
    public ImageCacheSpec retentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }


}