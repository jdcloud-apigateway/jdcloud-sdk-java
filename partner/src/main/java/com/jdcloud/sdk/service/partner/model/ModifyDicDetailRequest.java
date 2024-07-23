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
 * dictionary
 * 字典管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.partner.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 编辑字典
 */
public class ModifyDicDetailRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Number id;

    /**
     * 字典类型
     */
    private String codeType;

    /**
     * 字典编码
     */
    private String code;

    /**
     * 字典编码名称
     */
    private String name;

    /**
     * 字典编码值
     */
    private String value;

    /**
     * null
     */
    private Boolean useFlag;

    /**
     * 系统类型
     */
    private String systemType;

    /**
     * 引用值
     */
    private String refValue;

    /**
     * 顺序
     */
    private Integer seq;

    /**
     * 字典说明
     */
    private String remark;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 是否删除0未删除,1已删除
     */
    private Integer yn;

    /**
     * regionId
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get ID
     *
     * @return
     */
    public Number getId() {
        return id;
    }

    /**
     * set ID
     *
     * @param id
     */
    public void setId(Number id) {
        this.id = id;
    }


    /**
     * get 字典类型
     *
     * @return
     */
    public String getCodeType() {
        return codeType;
    }

    /**
     * set 字典类型
     *
     * @param codeType
     */
    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }


    /**
     * get 字典编码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set 字典编码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * get 字典编码名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 字典编码名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 字典编码值
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 字典编码值
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * get null
     *
     * @return
     */
    public Boolean getUseFlag() {
        return useFlag;
    }

    /**
     * set null
     *
     * @param useFlag
     */
    public void setUseFlag(Boolean useFlag) {
        this.useFlag = useFlag;
    }


    /**
     * get 系统类型
     *
     * @return
     */
    public String getSystemType() {
        return systemType;
    }

    /**
     * set 系统类型
     *
     * @param systemType
     */
    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }


    /**
     * get 引用值
     *
     * @return
     */
    public String getRefValue() {
        return refValue;
    }

    /**
     * set 引用值
     *
     * @param refValue
     */
    public void setRefValue(String refValue) {
        this.refValue = refValue;
    }


    /**
     * get 顺序
     *
     * @return
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * set 顺序
     *
     * @param seq
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }


    /**
     * get 字典说明
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 字典说明
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 创建人
     *
     * @return
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * set 创建人
     *
     * @param createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }


    /**
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 修改人
     *
     * @return
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * set 修改人
     *
     * @param updateUser
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }


    /**
     * get 是否删除0未删除,1已删除
     *
     * @return
     */
    public Integer getYn() {
        return yn;
    }

    /**
     * set 是否删除0未删除,1已删除
     *
     * @param yn
     */
    public void setYn(Integer yn) {
        this.yn = yn;
    }


    /**
     * get regionId
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set ID
     *
     * @param id
     */
    public ModifyDicDetailRequest id(Number id) {
        this.id = id;
        return this;
    }


    /**
     * set 字典类型
     *
     * @param codeType
     */
    public ModifyDicDetailRequest codeType(String codeType) {
        this.codeType = codeType;
        return this;
    }


    /**
     * set 字典编码
     *
     * @param code
     */
    public ModifyDicDetailRequest code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 字典编码名称
     *
     * @param name
     */
    public ModifyDicDetailRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 字典编码值
     *
     * @param value
     */
    public ModifyDicDetailRequest value(String value) {
        this.value = value;
        return this;
    }


    /**
     * set null
     *
     * @param useFlag
     */
    public ModifyDicDetailRequest useFlag(Boolean useFlag) {
        this.useFlag = useFlag;
        return this;
    }


    /**
     * set 系统类型
     *
     * @param systemType
     */
    public ModifyDicDetailRequest systemType(String systemType) {
        this.systemType = systemType;
        return this;
    }


    /**
     * set 引用值
     *
     * @param refValue
     */
    public ModifyDicDetailRequest refValue(String refValue) {
        this.refValue = refValue;
        return this;
    }


    /**
     * set 顺序
     *
     * @param seq
     */
    public ModifyDicDetailRequest seq(Integer seq) {
        this.seq = seq;
        return this;
    }


    /**
     * set 字典说明
     *
     * @param remark
     */
    public ModifyDicDetailRequest remark(String remark) {
        this.remark = remark;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public ModifyDicDetailRequest createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 创建人
     *
     * @param createUser
     */
    public ModifyDicDetailRequest createUser(String createUser) {
        this.createUser = createUser;
        return this;
    }


    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public ModifyDicDetailRequest updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 修改人
     *
     * @param updateUser
     */
    public ModifyDicDetailRequest updateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }


    /**
     * set 是否删除0未删除,1已删除
     *
     * @param yn
     */
    public ModifyDicDetailRequest yn(Integer yn) {
        this.yn = yn;
        return this;
    }


    /**
     * set regionId
     *
     * @param regionId
     */
    public ModifyDicDetailRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}