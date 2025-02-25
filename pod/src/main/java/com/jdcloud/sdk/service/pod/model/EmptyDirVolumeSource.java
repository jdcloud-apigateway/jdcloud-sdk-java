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


/**
 * EmptyDir卷源规格
 */
public class EmptyDirVolumeSource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 卷大小，单位MB
     */
    private Integer sizeMB;



    /**
     * get 卷大小，单位MB
     *
     * @return
     */
    public Integer getSizeMB() {
        return sizeMB;
    }

    /**
     * set 卷大小，单位MB
     *
     * @param sizeMB
     */
    public void setSizeMB(Integer sizeMB) {
        this.sizeMB = sizeMB;
    }



    /**
     * set 卷大小，单位MB
     *
     * @param sizeMB
     */
    public EmptyDirVolumeSource sizeMB(Integer sizeMB) {
        this.sizeMB = sizeMB;
        return this;
    }


}