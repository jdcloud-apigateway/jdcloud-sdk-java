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
 * 云鼎短信服务-发送短信相关接口
 * 云鼎短信服务-发送短信相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ydsms.model;

import com.jdcloud.sdk.service.ydsms.model.MtResVO;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 根据pin发送短信
 */
public class SendMessagesByPinUsingPOSTResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * mtResVO
     */
    private MtResVO mtResVO;


    /**
     * get mtResVO
     *
     * @return
     */
    public MtResVO getMtResVO() {
        return mtResVO;
    }

    /**
     * set mtResVO
     *
     * @param mtResVO
     */
    public void setMtResVO(MtResVO mtResVO) {
        this.mtResVO = mtResVO;
    }


    /**
     * set mtResVO
     *
     * @param mtResVO
     */
    public SendMessagesByPinUsingPOSTResult mtResVO(MtResVO mtResVO) {
        this.mtResVO = mtResVO;
        return this;
    }


}