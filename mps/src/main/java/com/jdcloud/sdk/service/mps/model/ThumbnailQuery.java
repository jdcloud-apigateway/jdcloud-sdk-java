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
 * 媒体处理相关接口
 * 多媒体处理服务API，包括截图、转码、媒体处理消息通知等操作。本文档详细说明了媒体处理API及用法，适合开发人员阅读。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mps.model;

import java.util.List;
import java.util.ArrayList;

/**
 * thumbnailQuery
 */
public class ThumbnailQuery  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 状态 (SUCCESS, ERROR, PENDDING, RUNNING)
     */
    private String status;

    /**
     * 查询开始时间 时间格式(GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’
     */
    private String begin;

    /**
     * 查询结束时间 时间格式(GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’
     */
    private String end;

    /**
     * 本次请求的marker, 标记查询的起始位置, 此处为taskID
     */
    private String marker;

    /**
     * 本次请求返回的任务列表的最大元素个数, 有效值: [1-1000]，默认值: 1000
     */
    private Integer limit;

    /**
     * 获取下一页所需要传递的marker值(此处为taskID), 仅当isTruncated为true时(数据未全部返回)出现 (readonly)
     */
    private String nextMarker;

    /**
     * 指明返回数据是否被截断. true表示本页后面还有数据, 即数据未全部返回; false表示已是最后一页, 即数据已全部返回 (readonly)
     */
    private Boolean truncated;

    /**
     * 返回的task列表 (readonly)
     */
    private List<ThumbnailTask> taskList;


    /**
     * get 状态 (SUCCESS, ERROR, PENDDING, RUNNING)
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态 (SUCCESS, ERROR, PENDDING, RUNNING)
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 查询开始时间 时间格式(GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’
     *
     * @return
     */
    public String getBegin() {
        return begin;
    }

    /**
     * set 查询开始时间 时间格式(GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’
     *
     * @param begin
     */
    public void setBegin(String begin) {
        this.begin = begin;
    }

    /**
     * get 查询结束时间 时间格式(GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’
     *
     * @return
     */
    public String getEnd() {
        return end;
    }

    /**
     * set 查询结束时间 时间格式(GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’
     *
     * @param end
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * get 本次请求的marker, 标记查询的起始位置, 此处为taskID
     *
     * @return
     */
    public String getMarker() {
        return marker;
    }

    /**
     * set 本次请求的marker, 标记查询的起始位置, 此处为taskID
     *
     * @param marker
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * get 本次请求返回的任务列表的最大元素个数, 有效值: [1-1000]，默认值: 1000
     *
     * @return
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * set 本次请求返回的任务列表的最大元素个数, 有效值: [1-1000]，默认值: 1000
     *
     * @param limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * get 获取下一页所需要传递的marker值(此处为taskID), 仅当isTruncated为true时(数据未全部返回)出现 (readonly)
     *
     * @return
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * set 获取下一页所需要传递的marker值(此处为taskID), 仅当isTruncated为true时(数据未全部返回)出现 (readonly)
     *
     * @param nextMarker
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * get 指明返回数据是否被截断. true表示本页后面还有数据, 即数据未全部返回; false表示已是最后一页, 即数据已全部返回 (readonly)
     *
     * @return
     */
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * set 指明返回数据是否被截断. true表示本页后面还有数据, 即数据未全部返回; false表示已是最后一页, 即数据已全部返回 (readonly)
     *
     * @param truncated
     */
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * get 返回的task列表 (readonly)
     *
     * @return
     */
    public List<ThumbnailTask> getTaskList() {
        return taskList;
    }

    /**
     * set 返回的task列表 (readonly)
     *
     * @param taskList
     */
    public void setTaskList(List<ThumbnailTask> taskList) {
        this.taskList = taskList;
    }


    /**
     * set 状态 (SUCCESS, ERROR, PENDDING, RUNNING)
     *
     * @param status
     */
    public ThumbnailQuery status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 查询开始时间 时间格式(GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’
     *
     * @param begin
     */
    public ThumbnailQuery begin(String begin) {
        this.begin = begin;
        return this;
    }

    /**
     * set 查询结束时间 时间格式(GMT): yyyy-MM-dd’T’HH:mm:ss.SSS’Z’
     *
     * @param end
     */
    public ThumbnailQuery end(String end) {
        this.end = end;
        return this;
    }

    /**
     * set 本次请求的marker, 标记查询的起始位置, 此处为taskID
     *
     * @param marker
     */
    public ThumbnailQuery marker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * set 本次请求返回的任务列表的最大元素个数, 有效值: [1-1000]，默认值: 1000
     *
     * @param limit
     */
    public ThumbnailQuery limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * set 获取下一页所需要传递的marker值(此处为taskID), 仅当isTruncated为true时(数据未全部返回)出现 (readonly)
     *
     * @param nextMarker
     */
    public ThumbnailQuery nextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * set 指明返回数据是否被截断. true表示本页后面还有数据, 即数据未全部返回; false表示已是最后一页, 即数据已全部返回 (readonly)
     *
     * @param truncated
     */
    public ThumbnailQuery truncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    /**
     * set 返回的task列表 (readonly)
     *
     * @param taskList
     */
    public ThumbnailQuery taskList(List<ThumbnailTask> taskList) {
        this.taskList = taskList;
        return this;
    }


    /**
     * add item to 返回的task列表 (readonly)
     *
     * @param taskList
     */
    public void addTaskList(ThumbnailTask taskList) {
        if (this.taskList == null) {
            this.taskList = new ArrayList<>();
        }
        this.taskList.add(taskList);
    }

}