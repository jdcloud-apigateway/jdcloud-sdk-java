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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * customLogSearchSpec
 */
public class CustomLogSearchSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * appName
     * Required:true
     */
    @Required
    
    private List<String> appName;
    /**
     * from
     */
    private Long from;

    /**
     * logTopicId
     */
    private String logTopicId;

    /**
     * match
     */
    
    private List<Match> match;
    /**
     * recordId
     */
    private String recordId;

    /**
     * resp
     */
    
    private List<String> resp;
    /**
     * size
     */
    private Long size;

    /**
     * sort
     */
    private String sort;

    /**
     * timeRange
     * Required:true
     */
    @Required
    private DateTimeRange timeRange;

    /**
     * uuid
     */
    private String uuid;



    /**
    * get appName
    *
    * @return
    */
    public List<String> getAppName() {
        return appName;
    }

    /**
    * set appName
    *
    * @param appName
    */
    public void setAppName(List<String> appName) {
        this.appName = appName;
    }


    /**
     * get from
     *
     * @return
     */
    public Long getFrom() {
        return from;
    }

    /**
     * set from
     *
     * @param from
     */
    public void setFrom(Long from) {
        this.from = from;
    }


    /**
     * get logTopicId
     *
     * @return
     */
    public String getLogTopicId() {
        return logTopicId;
    }

    /**
     * set logTopicId
     *
     * @param logTopicId
     */
    public void setLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
    }


    /**
    * get match
    *
    * @return
    */
    public List<Match> getMatch() {
        return match;
    }

    /**
    * set match
    *
    * @param match
    */
    public void setMatch(List<Match> match) {
        this.match = match;
    }


    /**
     * get recordId
     *
     * @return
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * set recordId
     *
     * @param recordId
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }


    /**
    * get resp
    *
    * @return
    */
    public List<String> getResp() {
        return resp;
    }

    /**
    * set resp
    *
    * @param resp
    */
    public void setResp(List<String> resp) {
        this.resp = resp;
    }


    /**
     * get size
     *
     * @return
     */
    public Long getSize() {
        return size;
    }

    /**
     * set size
     *
     * @param size
     */
    public void setSize(Long size) {
        this.size = size;
    }


    /**
     * get sort
     *
     * @return
     */
    public String getSort() {
        return sort;
    }

    /**
     * set sort
     *
     * @param sort
     */
    public void setSort(String sort) {
        this.sort = sort;
    }


    /**
     * get timeRange
     *
     * @return
     */
    public DateTimeRange getTimeRange() {
        return timeRange;
    }

    /**
     * set timeRange
     *
     * @param timeRange
     */
    public void setTimeRange(DateTimeRange timeRange) {
        this.timeRange = timeRange;
    }


    /**
     * get uuid
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set uuid
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }



    /**
    * set appName
    *
    * @param appName
    */
    public CustomLogSearchSpec appName(List<String> appName) {
        this.appName = appName;
        return this;
    }


    /**
     * set from
     *
     * @param from
     */
    public CustomLogSearchSpec from(Long from) {
        this.from = from;
        return this;
    }


    /**
     * set logTopicId
     *
     * @param logTopicId
     */
    public CustomLogSearchSpec logTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
        return this;
    }


    /**
    * set match
    *
    * @param match
    */
    public CustomLogSearchSpec match(List<Match> match) {
        this.match = match;
        return this;
    }


    /**
     * set recordId
     *
     * @param recordId
     */
    public CustomLogSearchSpec recordId(String recordId) {
        this.recordId = recordId;
        return this;
    }


    /**
    * set resp
    *
    * @param resp
    */
    public CustomLogSearchSpec resp(List<String> resp) {
        this.resp = resp;
        return this;
    }


    /**
     * set size
     *
     * @param size
     */
    public CustomLogSearchSpec size(Long size) {
        this.size = size;
        return this;
    }


    /**
     * set sort
     *
     * @param sort
     */
    public CustomLogSearchSpec sort(String sort) {
        this.sort = sort;
        return this;
    }


    /**
     * set timeRange
     *
     * @param timeRange
     */
    public CustomLogSearchSpec timeRange(DateTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }


    /**
     * set uuid
     *
     * @param uuid
     */
    public CustomLogSearchSpec uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }



    /**
     * add item to appName
     *
     * @param appName
     */
    public void addAppName(String appName) {
        if (this.appName == null) {
            this.appName = new ArrayList<>();
        }
        this.appName.add(appName);
    }

    /**
     * add item to match
     *
     * @param match
     */
    public void addMatch(Match match) {
        if (this.match == null) {
            this.match = new ArrayList<>();
        }
        this.match.add(match);
    }

    /**
     * add item to resp
     *
     * @param resp
     */
    public void addResp(String resp) {
        if (this.resp == null) {
            this.resp = new ArrayList<>();
        }
        this.resp.add(resp);
    }
}