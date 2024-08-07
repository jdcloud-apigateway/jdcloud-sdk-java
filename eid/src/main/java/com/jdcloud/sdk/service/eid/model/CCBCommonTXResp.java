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

package com.jdcloud.sdk.service.eid.model;


/**
 * cCBCommonTXResp
 */
public class CCBCommonTXResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * tX_HEADER
     */
    private TxHeader tX_HEADER;

    /**
     * tX_BODY
     */
    private TxBody tX_BODY;



    /**
     * get tX_HEADER
     *
     * @return
     */
    public TxHeader getTX_HEADER() {
        return tX_HEADER;
    }

    /**
     * set tX_HEADER
     *
     * @param tX_HEADER
     */
    public void setTX_HEADER(TxHeader tX_HEADER) {
        this.tX_HEADER = tX_HEADER;
    }


    /**
     * get tX_BODY
     *
     * @return
     */
    public TxBody getTX_BODY() {
        return tX_BODY;
    }

    /**
     * set tX_BODY
     *
     * @param tX_BODY
     */
    public void setTX_BODY(TxBody tX_BODY) {
        this.tX_BODY = tX_BODY;
    }



    /**
     * set tX_HEADER
     *
     * @param tX_HEADER
     */
    public CCBCommonTXResp tX_HEADER(TxHeader tX_HEADER) {
        this.tX_HEADER = tX_HEADER;
        return this;
    }


    /**
     * set tX_BODY
     *
     * @param tX_BODY
     */
    public CCBCommonTXResp tX_BODY(TxBody tX_BODY) {
        this.tX_BODY = tX_BODY;
        return this;
    }


}