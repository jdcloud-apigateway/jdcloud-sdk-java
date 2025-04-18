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

package com.jdcloud.sdk.service.shenhaiplatform.model;

import java.util.List;
import java.util.ArrayList;

/**
 * jcwSpaceIncreUsedByDayVo
 */
public class JcwSpaceIncreUsedByDayVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 每日增量
     */
    
    private List<Number> increments;
    /**
     * 每日增量(用作显示)
     */
    
    private List<String> views;
    /**
     * 日期
     */
    
    private List<String> dates;


    /**
    * get 每日增量
    *
    * @return
    */
    public List<Number> getIncrements() {
        return increments;
    }

    /**
    * set 每日增量
    *
    * @param increments
    */
    public void setIncrements(List<Number> increments) {
        this.increments = increments;
    }


    /**
    * get 每日增量(用作显示)
    *
    * @return
    */
    public List<String> getViews() {
        return views;
    }

    /**
    * set 每日增量(用作显示)
    *
    * @param views
    */
    public void setViews(List<String> views) {
        this.views = views;
    }


    /**
    * get 日期
    *
    * @return
    */
    public List<String> getDates() {
        return dates;
    }

    /**
    * set 日期
    *
    * @param dates
    */
    public void setDates(List<String> dates) {
        this.dates = dates;
    }



    /**
    * set 每日增量
    *
    * @param increments
    */
    public JcwSpaceIncreUsedByDayVo increments(List<Number> increments) {
        this.increments = increments;
        return this;
    }


    /**
    * set 每日增量(用作显示)
    *
    * @param views
    */
    public JcwSpaceIncreUsedByDayVo views(List<String> views) {
        this.views = views;
        return this;
    }


    /**
    * set 日期
    *
    * @param dates
    */
    public JcwSpaceIncreUsedByDayVo dates(List<String> dates) {
        this.dates = dates;
        return this;
    }



    /**
     * add item to 每日增量
     *
     * @param increment
     */
    public void addIncrement(Number increment) {
        if (this.increments == null) {
            this.increments = new ArrayList<>();
        }
        this.increments.add(increment);
    }

    /**
     * add item to 每日增量(用作显示)
     *
     * @param view
     */
    public void addView(String view) {
        if (this.views == null) {
            this.views = new ArrayList<>();
        }
        this.views.add(view);
    }

    /**
     * add item to 日期
     *
     * @param date
     */
    public void addDate(String date) {
        if (this.dates == null) {
            this.dates = new ArrayList<>();
        }
        this.dates.add(date);
    }
}