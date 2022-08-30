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

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;

/**
 * bandData
 */
public class BandData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 月95(MB)
     */
    private Long monthly95;

    /**
     * 月峰值(MB)
     */
    private Long monthlyPeak;

    /**
     * 日峰值(MB)
     */
    
    private List<DailyPeakItem> dailyPeaks;
    /**
     * 5分钟详情
     */
    
    private List<FiveMinItem> details;


    /**
     * get 月95(MB)
     *
     * @return
     */
    public Long getMonthly95() {
        return monthly95;
    }

    /**
     * set 月95(MB)
     *
     * @param monthly95
     */
    public void setMonthly95(Long monthly95) {
        this.monthly95 = monthly95;
    }


    /**
     * get 月峰值(MB)
     *
     * @return
     */
    public Long getMonthlyPeak() {
        return monthlyPeak;
    }

    /**
     * set 月峰值(MB)
     *
     * @param monthlyPeak
     */
    public void setMonthlyPeak(Long monthlyPeak) {
        this.monthlyPeak = monthlyPeak;
    }


    /**
    * get 日峰值(MB)
    *
    * @return
    */
    public List<DailyPeakItem> getDailyPeaks() {
        return dailyPeaks;
    }

    /**
    * set 日峰值(MB)
    *
    * @param dailyPeaks
    */
    public void setDailyPeaks(List<DailyPeakItem> dailyPeaks) {
        this.dailyPeaks = dailyPeaks;
    }


    /**
    * get 5分钟详情
    *
    * @return
    */
    public List<FiveMinItem> getDetails() {
        return details;
    }

    /**
    * set 5分钟详情
    *
    * @param details
    */
    public void setDetails(List<FiveMinItem> details) {
        this.details = details;
    }



    /**
     * set 月95(MB)
     *
     * @param monthly95
     */
    public BandData monthly95(Long monthly95) {
        this.monthly95 = monthly95;
        return this;
    }


    /**
     * set 月峰值(MB)
     *
     * @param monthlyPeak
     */
    public BandData monthlyPeak(Long monthlyPeak) {
        this.monthlyPeak = monthlyPeak;
        return this;
    }


    /**
    * set 日峰值(MB)
    *
    * @param dailyPeaks
    */
    public BandData dailyPeaks(List<DailyPeakItem> dailyPeaks) {
        this.dailyPeaks = dailyPeaks;
        return this;
    }


    /**
    * set 5分钟详情
    *
    * @param details
    */
    public BandData details(List<FiveMinItem> details) {
        this.details = details;
        return this;
    }



    /**
     * add item to 日峰值(MB)
     *
     * @param dailyPeak
     */
    public void addDailyPeak(DailyPeakItem dailyPeak) {
        if (this.dailyPeaks == null) {
            this.dailyPeaks = new ArrayList<>();
        }
        this.dailyPeaks.add(dailyPeak);
    }

    /**
     * add item to 5分钟详情
     *
     * @param detail
     */
    public void addDetail(FiveMinItem detail) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detail);
    }
}