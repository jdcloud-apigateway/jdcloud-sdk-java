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

package com.jdcloud.sdk.service.openjrtc.model;


/**
 * recordBucketObj
 */
public class RecordBucketObj  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * bucket
     */
    private String bucket;


    /**
     * get bucket
     *
     * @return
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * set bucket
     *
     * @param bucket
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }


    /**
     * set bucket
     *
     * @param bucket
     */
    public RecordBucketObj bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }


}