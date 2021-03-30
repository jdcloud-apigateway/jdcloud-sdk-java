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

import com.jdcloud.sdk.annotation.Required;

/**
 * panelPositionForUpdate
 */
public class PanelPositionForUpdate  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 该panel所在列
     * Required:true
     */
    @Required
    private Long col;

    /**
     * 该panel高度
     * Required:true
     */
    @Required
    private Long height;

    /**
     * 该panel在dashboard中的顺序
     * Required:true
     */
    @Required
    private Long order;

    /**
     * 更新panel的uuid
     * Required:true
     */
    @Required
    private String panelUid;

    /**
     * 该panel所在行
     * Required:true
     */
    @Required
    private Long row;

    /**
     * 该panel宽度
     * Required:true
     */
    @Required
    private Long width;


    /**
     * get 该panel所在列
     *
     * @return
     */
    public Long getCol() {
        return col;
    }

    /**
     * set 该panel所在列
     *
     * @param col
     */
    public void setCol(Long col) {
        this.col = col;
    }

    /**
     * get 该panel高度
     *
     * @return
     */
    public Long getHeight() {
        return height;
    }

    /**
     * set 该panel高度
     *
     * @param height
     */
    public void setHeight(Long height) {
        this.height = height;
    }

    /**
     * get 该panel在dashboard中的顺序
     *
     * @return
     */
    public Long getOrder() {
        return order;
    }

    /**
     * set 该panel在dashboard中的顺序
     *
     * @param order
     */
    public void setOrder(Long order) {
        this.order = order;
    }

    /**
     * get 更新panel的uuid
     *
     * @return
     */
    public String getPanelUid() {
        return panelUid;
    }

    /**
     * set 更新panel的uuid
     *
     * @param panelUid
     */
    public void setPanelUid(String panelUid) {
        this.panelUid = panelUid;
    }

    /**
     * get 该panel所在行
     *
     * @return
     */
    public Long getRow() {
        return row;
    }

    /**
     * set 该panel所在行
     *
     * @param row
     */
    public void setRow(Long row) {
        this.row = row;
    }

    /**
     * get 该panel宽度
     *
     * @return
     */
    public Long getWidth() {
        return width;
    }

    /**
     * set 该panel宽度
     *
     * @param width
     */
    public void setWidth(Long width) {
        this.width = width;
    }


    /**
     * set 该panel所在列
     *
     * @param col
     */
    public PanelPositionForUpdate col(Long col) {
        this.col = col;
        return this;
    }

    /**
     * set 该panel高度
     *
     * @param height
     */
    public PanelPositionForUpdate height(Long height) {
        this.height = height;
        return this;
    }

    /**
     * set 该panel在dashboard中的顺序
     *
     * @param order
     */
    public PanelPositionForUpdate order(Long order) {
        this.order = order;
        return this;
    }

    /**
     * set 更新panel的uuid
     *
     * @param panelUid
     */
    public PanelPositionForUpdate panelUid(String panelUid) {
        this.panelUid = panelUid;
        return this;
    }

    /**
     * set 该panel所在行
     *
     * @param row
     */
    public PanelPositionForUpdate row(Long row) {
        this.row = row;
        return this;
    }

    /**
     * set 该panel宽度
     *
     * @param width
     */
    public PanelPositionForUpdate width(Long width) {
        this.width = width;
        return this;
    }


}