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
 * JrtcStatistic
 * 数据统计
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.openjrtc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.openjrtc.model.CallDuration;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取近7天通讯时长

 */
public class DescribeDailyCallDurationResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * content
     */
    
    private List<CallDuration> content;


    /**
    * get content
    *
    * @return
    */
    public List<CallDuration> getContent() {
        return content;
    }

    /**
    * set content
    *
    * @param content
    */
    public void setContent(List<CallDuration> content) {
        this.content = content;
    }



    /**
    * set content
    *
    * @param content
    */
    public DescribeDailyCallDurationResult content(List<CallDuration> content) {
        this.content = content;
        return this;
    }



    /**
     * add item to content
     *
     * @param content
     */
    public void addContent(CallDuration content) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(content);
    }
}