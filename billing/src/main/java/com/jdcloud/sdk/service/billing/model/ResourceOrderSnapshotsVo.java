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

package com.jdcloud.sdk.service.billing.model;

import java.util.List;
import java.util.ArrayList;

/**
 * resourceOrderSnapshotsVo
 */
public class ResourceOrderSnapshotsVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 资源单快照列表
     */
    
    private List<ResourceOrderSnapshotVo> resourceOrderSnapshotVos;


    /**
     * get 资源id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    /**
    * get 资源单快照列表
    *
    * @return
    */
    public List<ResourceOrderSnapshotVo> getResourceOrderSnapshotVos() {
        return resourceOrderSnapshotVos;
    }

    /**
    * set 资源单快照列表
    *
    * @param resourceOrderSnapshotVos
    */
    public void setResourceOrderSnapshotVos(List<ResourceOrderSnapshotVo> resourceOrderSnapshotVos) {
        this.resourceOrderSnapshotVos = resourceOrderSnapshotVos;
    }



    /**
     * set 资源id
     *
     * @param resourceId
     */
    public ResourceOrderSnapshotsVo resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
    * set 资源单快照列表
    *
    * @param resourceOrderSnapshotVos
    */
    public ResourceOrderSnapshotsVo resourceOrderSnapshotVos(List<ResourceOrderSnapshotVo> resourceOrderSnapshotVos) {
        this.resourceOrderSnapshotVos = resourceOrderSnapshotVos;
        return this;
    }



    /**
     * add item to 资源单快照列表
     *
     * @param resourceOrderSnapshotVo
     */
    public void addResourceOrderSnapshotVo(ResourceOrderSnapshotVo resourceOrderSnapshotVo) {
        if (this.resourceOrderSnapshotVos == null) {
            this.resourceOrderSnapshotVos = new ArrayList<>();
        }
        this.resourceOrderSnapshotVos.add(resourceOrderSnapshotVo);
    }
}