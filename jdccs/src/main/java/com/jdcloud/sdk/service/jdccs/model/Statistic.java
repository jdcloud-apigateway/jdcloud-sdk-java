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

package com.jdcloud.sdk.service.jdccs.model;


/**
 * 统计值
 */
public class Statistic  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 最大值
     */
    private Double max;

    /**
     * 最小值
     */
    private Double min;

    /**
     * 平均值
     */
    private Double avg;



    /**
     * get 最大值
     *
     * @return
     */
    public Double getMax() {
        return max;
    }

    /**
     * set 最大值
     *
     * @param max
     */
    public void setMax(Double max) {
        this.max = max;
    }


    /**
     * get 最小值
     *
     * @return
     */
    public Double getMin() {
        return min;
    }

    /**
     * set 最小值
     *
     * @param min
     */
    public void setMin(Double min) {
        this.min = min;
    }


    /**
     * get 平均值
     *
     * @return
     */
    public Double getAvg() {
        return avg;
    }

    /**
     * set 平均值
     *
     * @param avg
     */
    public void setAvg(Double avg) {
        this.avg = avg;
    }



    /**
     * set 最大值
     *
     * @param max
     */
    public Statistic max(Double max) {
        this.max = max;
        return this;
    }


    /**
     * set 最小值
     *
     * @param min
     */
    public Statistic min(Double min) {
        this.min = min;
        return this;
    }


    /**
     * set 平均值
     *
     * @param avg
     */
    public Statistic avg(Double avg) {
        this.avg = avg;
        return this;
    }


}