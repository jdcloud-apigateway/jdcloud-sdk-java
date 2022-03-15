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

package com.jdcloud.sdk.service.monitor.model;


/**
 * alarmDimension
 */
public class AlarmDimension  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    private Integer id;

    /**
     * 类型id
     */
    private Integer categoryId;

    /**
     * 代码
     */
    private String dimension;

    /**
     * 中文名称
     */
    private String dimensionNameCH;

    /**
     * 英文名称
     */
    private String dimensionNameEN;

    /**
     * 标签服务处注册的serviceCode
     */
    private String tagServiceCode;

    /**
     * 前端控制台链接的serviceCode
     */
    private String webCode;

    /**
     * dashboard是否可用
     */
    private Integer dashboard;

    /**
     * 是否有子节点，一般认为，当下方配置的tags不为空时，即有子节点
     */
    private Integer hasSubNode;

    /**
     * 当有维度时，此处可空，无时需要设置
     */
    private String groupCodes;

    /**
     * 除资源tag外，其他需要重点关注的tag，当报警规则运行时，会附加该tag去查询数据，当有维度(dimension)时，此处可空
     */
    private String tags;

    /**
     * 排序字段
     */
    private String column;

    /**
     * 排序方式
     */
    private String dir;

    /**
     * 页码
     */
    private Integer number;

    /**
     * 查询条数
     */
    private Integer size;


    /**
     * get 自增id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 自增id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 类型id
     *
     * @return
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * set 类型id
     *
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * get 代码
     *
     * @return
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * set 代码
     *
     * @param dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * get 中文名称
     *
     * @return
     */
    public String getDimensionNameCH() {
        return dimensionNameCH;
    }

    /**
     * set 中文名称
     *
     * @param dimensionNameCH
     */
    public void setDimensionNameCH(String dimensionNameCH) {
        this.dimensionNameCH = dimensionNameCH;
    }

    /**
     * get 英文名称
     *
     * @return
     */
    public String getDimensionNameEN() {
        return dimensionNameEN;
    }

    /**
     * set 英文名称
     *
     * @param dimensionNameEN
     */
    public void setDimensionNameEN(String dimensionNameEN) {
        this.dimensionNameEN = dimensionNameEN;
    }

    /**
     * get 标签服务处注册的serviceCode
     *
     * @return
     */
    public String getTagServiceCode() {
        return tagServiceCode;
    }

    /**
     * set 标签服务处注册的serviceCode
     *
     * @param tagServiceCode
     */
    public void setTagServiceCode(String tagServiceCode) {
        this.tagServiceCode = tagServiceCode;
    }

    /**
     * get 前端控制台链接的serviceCode
     *
     * @return
     */
    public String getWebCode() {
        return webCode;
    }

    /**
     * set 前端控制台链接的serviceCode
     *
     * @param webCode
     */
    public void setWebCode(String webCode) {
        this.webCode = webCode;
    }

    /**
     * get dashboard是否可用
     *
     * @return
     */
    public Integer getDashboard() {
        return dashboard;
    }

    /**
     * set dashboard是否可用
     *
     * @param dashboard
     */
    public void setDashboard(Integer dashboard) {
        this.dashboard = dashboard;
    }

    /**
     * get 是否有子节点，一般认为，当下方配置的tags不为空时，即有子节点
     *
     * @return
     */
    public Integer getHasSubNode() {
        return hasSubNode;
    }

    /**
     * set 是否有子节点，一般认为，当下方配置的tags不为空时，即有子节点
     *
     * @param hasSubNode
     */
    public void setHasSubNode(Integer hasSubNode) {
        this.hasSubNode = hasSubNode;
    }

    /**
     * get 当有维度时，此处可空，无时需要设置
     *
     * @return
     */
    public String getGroupCodes() {
        return groupCodes;
    }

    /**
     * set 当有维度时，此处可空，无时需要设置
     *
     * @param groupCodes
     */
    public void setGroupCodes(String groupCodes) {
        this.groupCodes = groupCodes;
    }

    /**
     * get 除资源tag外，其他需要重点关注的tag，当报警规则运行时，会附加该tag去查询数据，当有维度(dimension)时，此处可空
     *
     * @return
     */
    public String getTags() {
        return tags;
    }

    /**
     * set 除资源tag外，其他需要重点关注的tag，当报警规则运行时，会附加该tag去查询数据，当有维度(dimension)时，此处可空
     *
     * @param tags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * get 排序字段
     *
     * @return
     */
    public String getColumn() {
        return column;
    }

    /**
     * set 排序字段
     *
     * @param column
     */
    public void setColumn(String column) {
        this.column = column;
    }

    /**
     * get 排序方式
     *
     * @return
     */
    public String getDir() {
        return dir;
    }

    /**
     * set 排序方式
     *
     * @param dir
     */
    public void setDir(String dir) {
        this.dir = dir;
    }

    /**
     * get 页码
     *
     * @return
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * set 页码
     *
     * @param number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * get 查询条数
     *
     * @return
     */
    public Integer getSize() {
        return size;
    }

    /**
     * set 查询条数
     *
     * @param size
     */
    public void setSize(Integer size) {
        this.size = size;
    }


    /**
     * set 自增id
     *
     * @param id
     */
    public AlarmDimension id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 类型id
     *
     * @param categoryId
     */
    public AlarmDimension categoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * set 代码
     *
     * @param dimension
     */
    public AlarmDimension dimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * set 中文名称
     *
     * @param dimensionNameCH
     */
    public AlarmDimension dimensionNameCH(String dimensionNameCH) {
        this.dimensionNameCH = dimensionNameCH;
        return this;
    }

    /**
     * set 英文名称
     *
     * @param dimensionNameEN
     */
    public AlarmDimension dimensionNameEN(String dimensionNameEN) {
        this.dimensionNameEN = dimensionNameEN;
        return this;
    }

    /**
     * set 标签服务处注册的serviceCode
     *
     * @param tagServiceCode
     */
    public AlarmDimension tagServiceCode(String tagServiceCode) {
        this.tagServiceCode = tagServiceCode;
        return this;
    }

    /**
     * set 前端控制台链接的serviceCode
     *
     * @param webCode
     */
    public AlarmDimension webCode(String webCode) {
        this.webCode = webCode;
        return this;
    }

    /**
     * set dashboard是否可用
     *
     * @param dashboard
     */
    public AlarmDimension dashboard(Integer dashboard) {
        this.dashboard = dashboard;
        return this;
    }

    /**
     * set 是否有子节点，一般认为，当下方配置的tags不为空时，即有子节点
     *
     * @param hasSubNode
     */
    public AlarmDimension hasSubNode(Integer hasSubNode) {
        this.hasSubNode = hasSubNode;
        return this;
    }

    /**
     * set 当有维度时，此处可空，无时需要设置
     *
     * @param groupCodes
     */
    public AlarmDimension groupCodes(String groupCodes) {
        this.groupCodes = groupCodes;
        return this;
    }

    /**
     * set 除资源tag外，其他需要重点关注的tag，当报警规则运行时，会附加该tag去查询数据，当有维度(dimension)时，此处可空
     *
     * @param tags
     */
    public AlarmDimension tags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 排序字段
     *
     * @param column
     */
    public AlarmDimension column(String column) {
        this.column = column;
        return this;
    }

    /**
     * set 排序方式
     *
     * @param dir
     */
    public AlarmDimension dir(String dir) {
        this.dir = dir;
        return this;
    }

    /**
     * set 页码
     *
     * @param number
     */
    public AlarmDimension number(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * set 查询条数
     *
     * @param size
     */
    public AlarmDimension size(Integer size) {
        this.size = size;
        return this;
    }


}