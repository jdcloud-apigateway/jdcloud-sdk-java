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

package com.jdcloud.sdk.service.ag.model;


/**
 * 简单规则信息
 */
public class SimpleAsRuleInfoByAsAlarm  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 伸缩调整方式，取值范围：[&#x60;Number&#x60;,&#x60;Percentage&#x60;,&#x60;Total&#x60;]
- &#x60;Number&#x60;：增加或减少指定数量的实例
- &#x60;Percentage&#x60;：增加或减少指定百分比的实例
- &#x60;Total&#x60;：将当前伸缩组的实例数量调整到指定数量

     */
    private String adjustmentType;

    /**
     * 伸缩的调整值，负数表示减少，正数表示增加
- &#x60;adjustmentType&#x60;为&#x60;Number&#x60;时，取值范围：[&#x60;-300&#x60; ~ &#x60;300&#x60;]
- &#x60;adjustmentType&#x60;为&#x60;Percentage&#x60;时，单位为百分比，取值范围：[&#x60;-100&#x60; ~ &#x60;10000&#x60;]
- &#x60;adjustmentType&#x60;为&#x60;Total&#x60;时，取值范围：[&#x60;0&#x60; ~ &#x60;100000&#x60;]

     */
    private Integer adjustmentValue;



    /**
     * get 伸缩调整方式，取值范围：[&#x60;Number&#x60;,&#x60;Percentage&#x60;,&#x60;Total&#x60;]
- &#x60;Number&#x60;：增加或减少指定数量的实例
- &#x60;Percentage&#x60;：增加或减少指定百分比的实例
- &#x60;Total&#x60;：将当前伸缩组的实例数量调整到指定数量

     *
     * @return
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * set 伸缩调整方式，取值范围：[&#x60;Number&#x60;,&#x60;Percentage&#x60;,&#x60;Total&#x60;]
- &#x60;Number&#x60;：增加或减少指定数量的实例
- &#x60;Percentage&#x60;：增加或减少指定百分比的实例
- &#x60;Total&#x60;：将当前伸缩组的实例数量调整到指定数量

     *
     * @param adjustmentType
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }


    /**
     * get 伸缩的调整值，负数表示减少，正数表示增加
- &#x60;adjustmentType&#x60;为&#x60;Number&#x60;时，取值范围：[&#x60;-300&#x60; ~ &#x60;300&#x60;]
- &#x60;adjustmentType&#x60;为&#x60;Percentage&#x60;时，单位为百分比，取值范围：[&#x60;-100&#x60; ~ &#x60;10000&#x60;]
- &#x60;adjustmentType&#x60;为&#x60;Total&#x60;时，取值范围：[&#x60;0&#x60; ~ &#x60;100000&#x60;]

     *
     * @return
     */
    public Integer getAdjustmentValue() {
        return adjustmentValue;
    }

    /**
     * set 伸缩的调整值，负数表示减少，正数表示增加
- &#x60;adjustmentType&#x60;为&#x60;Number&#x60;时，取值范围：[&#x60;-300&#x60; ~ &#x60;300&#x60;]
- &#x60;adjustmentType&#x60;为&#x60;Percentage&#x60;时，单位为百分比，取值范围：[&#x60;-100&#x60; ~ &#x60;10000&#x60;]
- &#x60;adjustmentType&#x60;为&#x60;Total&#x60;时，取值范围：[&#x60;0&#x60; ~ &#x60;100000&#x60;]

     *
     * @param adjustmentValue
     */
    public void setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
    }



    /**
     * set 伸缩调整方式，取值范围：[&#x60;Number&#x60;,&#x60;Percentage&#x60;,&#x60;Total&#x60;]
- &#x60;Number&#x60;：增加或减少指定数量的实例
- &#x60;Percentage&#x60;：增加或减少指定百分比的实例
- &#x60;Total&#x60;：将当前伸缩组的实例数量调整到指定数量

     *
     * @param adjustmentType
     */
    public SimpleAsRuleInfoByAsAlarm adjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }


    /**
     * set 伸缩的调整值，负数表示减少，正数表示增加
- &#x60;adjustmentType&#x60;为&#x60;Number&#x60;时，取值范围：[&#x60;-300&#x60; ~ &#x60;300&#x60;]
- &#x60;adjustmentType&#x60;为&#x60;Percentage&#x60;时，单位为百分比，取值范围：[&#x60;-100&#x60; ~ &#x60;10000&#x60;]
- &#x60;adjustmentType&#x60;为&#x60;Total&#x60;时，取值范围：[&#x60;0&#x60; ~ &#x60;100000&#x60;]

     *
     * @param adjustmentValue
     */
    public SimpleAsRuleInfoByAsAlarm adjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }


}