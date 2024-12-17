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

package com.jdcloud.sdk.service.logs.model;


/**
 * lokiResponseStats
 */
public class LokiResponseStats  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * summary
     */
    private LokiResponseSummary summary;

    /**
     * metric
     */
    private LokiResponseStatsChunkHit chunkHit;



    /**
     * get summary
     *
     * @return
     */
    public LokiResponseSummary getSummary() {
        return summary;
    }

    /**
     * set summary
     *
     * @param summary
     */
    public void setSummary(LokiResponseSummary summary) {
        this.summary = summary;
    }


    /**
     * get metric
     *
     * @return
     */
    public LokiResponseStatsChunkHit getChunkHit() {
        return chunkHit;
    }

    /**
     * set metric
     *
     * @param chunkHit
     */
    public void setChunkHit(LokiResponseStatsChunkHit chunkHit) {
        this.chunkHit = chunkHit;
    }



    /**
     * set summary
     *
     * @param summary
     */
    public LokiResponseStats summary(LokiResponseSummary summary) {
        this.summary = summary;
        return this;
    }


    /**
     * set metric
     *
     * @param chunkHit
     */
    public LokiResponseStats chunkHit(LokiResponseStatsChunkHit chunkHit) {
        this.chunkHit = chunkHit;
        return this;
    }


}