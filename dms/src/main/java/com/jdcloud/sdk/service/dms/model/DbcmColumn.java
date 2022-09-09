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

package com.jdcloud.sdk.service.dms.model;


/**
 * dbcmColumn
 */
public class DbcmColumn  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 原始列表。
     */
    private String old_column_name;

    /**
     * 列名。
     */
    private String column_name;

    /**
     * 列类型。
     */
    private String column_type;

    /**
     * 列长度。
     */
    private Integer column_length;

    /**
     * 小数点后长度。
     */
    private String column_point;

    /**
     * 是否可以为空。
     */
    private Boolean is_null;

    /**
     * 列默认值。
     */
    private String column_value;

    /**
     * 是否自增。
     */
    private Boolean auto_incre;

    /**
     * 是否为主键。
     */
    private Boolean pk_index;

    /**
     * 列注释。
     */
    private String column_comments;



    /**
     * get 原始列表。
     *
     * @return
     */
    public String getOld_column_name() {
        return old_column_name;
    }

    /**
     * set 原始列表。
     *
     * @param old_column_name
     */
    public void setOld_column_name(String old_column_name) {
        this.old_column_name = old_column_name;
    }


    /**
     * get 列名。
     *
     * @return
     */
    public String getColumn_name() {
        return column_name;
    }

    /**
     * set 列名。
     *
     * @param column_name
     */
    public void setColumn_name(String column_name) {
        this.column_name = column_name;
    }


    /**
     * get 列类型。
     *
     * @return
     */
    public String getColumn_type() {
        return column_type;
    }

    /**
     * set 列类型。
     *
     * @param column_type
     */
    public void setColumn_type(String column_type) {
        this.column_type = column_type;
    }


    /**
     * get 列长度。
     *
     * @return
     */
    public Integer getColumn_length() {
        return column_length;
    }

    /**
     * set 列长度。
     *
     * @param column_length
     */
    public void setColumn_length(Integer column_length) {
        this.column_length = column_length;
    }


    /**
     * get 小数点后长度。
     *
     * @return
     */
    public String getColumn_point() {
        return column_point;
    }

    /**
     * set 小数点后长度。
     *
     * @param column_point
     */
    public void setColumn_point(String column_point) {
        this.column_point = column_point;
    }


    /**
     * get 是否可以为空。
     *
     * @return
     */
    public Boolean getIs_null() {
        return is_null;
    }

    /**
     * set 是否可以为空。
     *
     * @param is_null
     */
    public void setIs_null(Boolean is_null) {
        this.is_null = is_null;
    }


    /**
     * get 列默认值。
     *
     * @return
     */
    public String getColumn_value() {
        return column_value;
    }

    /**
     * set 列默认值。
     *
     * @param column_value
     */
    public void setColumn_value(String column_value) {
        this.column_value = column_value;
    }


    /**
     * get 是否自增。
     *
     * @return
     */
    public Boolean getAuto_incre() {
        return auto_incre;
    }

    /**
     * set 是否自增。
     *
     * @param auto_incre
     */
    public void setAuto_incre(Boolean auto_incre) {
        this.auto_incre = auto_incre;
    }


    /**
     * get 是否为主键。
     *
     * @return
     */
    public Boolean getPk_index() {
        return pk_index;
    }

    /**
     * set 是否为主键。
     *
     * @param pk_index
     */
    public void setPk_index(Boolean pk_index) {
        this.pk_index = pk_index;
    }


    /**
     * get 列注释。
     *
     * @return
     */
    public String getColumn_comments() {
        return column_comments;
    }

    /**
     * set 列注释。
     *
     * @param column_comments
     */
    public void setColumn_comments(String column_comments) {
        this.column_comments = column_comments;
    }



    /**
     * set 原始列表。
     *
     * @param old_column_name
     */
    public DbcmColumn old_column_name(String old_column_name) {
        this.old_column_name = old_column_name;
        return this;
    }


    /**
     * set 列名。
     *
     * @param column_name
     */
    public DbcmColumn column_name(String column_name) {
        this.column_name = column_name;
        return this;
    }


    /**
     * set 列类型。
     *
     * @param column_type
     */
    public DbcmColumn column_type(String column_type) {
        this.column_type = column_type;
        return this;
    }


    /**
     * set 列长度。
     *
     * @param column_length
     */
    public DbcmColumn column_length(Integer column_length) {
        this.column_length = column_length;
        return this;
    }


    /**
     * set 小数点后长度。
     *
     * @param column_point
     */
    public DbcmColumn column_point(String column_point) {
        this.column_point = column_point;
        return this;
    }


    /**
     * set 是否可以为空。
     *
     * @param is_null
     */
    public DbcmColumn is_null(Boolean is_null) {
        this.is_null = is_null;
        return this;
    }


    /**
     * set 列默认值。
     *
     * @param column_value
     */
    public DbcmColumn column_value(String column_value) {
        this.column_value = column_value;
        return this;
    }


    /**
     * set 是否自增。
     *
     * @param auto_incre
     */
    public DbcmColumn auto_incre(Boolean auto_incre) {
        this.auto_incre = auto_incre;
        return this;
    }


    /**
     * set 是否为主键。
     *
     * @param pk_index
     */
    public DbcmColumn pk_index(Boolean pk_index) {
        this.pk_index = pk_index;
        return this;
    }


    /**
     * set 列注释。
     *
     * @param column_comments
     */
    public DbcmColumn column_comments(String column_comments) {
        this.column_comments = column_comments;
        return this;
    }


}