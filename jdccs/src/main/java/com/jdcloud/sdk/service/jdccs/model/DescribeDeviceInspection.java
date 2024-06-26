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
 * 设备巡检
 */
public class DescribeDeviceInspection  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 巡检时间,UTC时间
     */
    private String inspectionTime;

    /**
     * 机房英文标识
     */
    private String idc;

    /**
     * 机房名称
     */
    private String idcName;

    /**
     * 故障状态
     */
    private String status;

    /**
     * 设备编码
     */
    private String deviceNo;

    /**
     * 设备SN号
     */
    private String snNo;

    /**
     * 设备类型
     */
    private String deviceType;

    /**
     * 故障类型
     */
    private String faultType;



    /**
     * get 巡检时间,UTC时间
     *
     * @return
     */
    public String getInspectionTime() {
        return inspectionTime;
    }

    /**
     * set 巡检时间,UTC时间
     *
     * @param inspectionTime
     */
    public void setInspectionTime(String inspectionTime) {
        this.inspectionTime = inspectionTime;
    }


    /**
     * get 机房英文标识
     *
     * @return
     */
    public String getIdc() {
        return idc;
    }

    /**
     * set 机房英文标识
     *
     * @param idc
     */
    public void setIdc(String idc) {
        this.idc = idc;
    }


    /**
     * get 机房名称
     *
     * @return
     */
    public String getIdcName() {
        return idcName;
    }

    /**
     * set 机房名称
     *
     * @param idcName
     */
    public void setIdcName(String idcName) {
        this.idcName = idcName;
    }


    /**
     * get 故障状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 故障状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 设备编码
     *
     * @return
     */
    public String getDeviceNo() {
        return deviceNo;
    }

    /**
     * set 设备编码
     *
     * @param deviceNo
     */
    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }


    /**
     * get 设备SN号
     *
     * @return
     */
    public String getSnNo() {
        return snNo;
    }

    /**
     * set 设备SN号
     *
     * @param snNo
     */
    public void setSnNo(String snNo) {
        this.snNo = snNo;
    }


    /**
     * get 设备类型
     *
     * @return
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * set 设备类型
     *
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * get 故障类型
     *
     * @return
     */
    public String getFaultType() {
        return faultType;
    }

    /**
     * set 故障类型
     *
     * @param faultType
     */
    public void setFaultType(String faultType) {
        this.faultType = faultType;
    }



    /**
     * set 巡检时间,UTC时间
     *
     * @param inspectionTime
     */
    public DescribeDeviceInspection inspectionTime(String inspectionTime) {
        this.inspectionTime = inspectionTime;
        return this;
    }


    /**
     * set 机房英文标识
     *
     * @param idc
     */
    public DescribeDeviceInspection idc(String idc) {
        this.idc = idc;
        return this;
    }


    /**
     * set 机房名称
     *
     * @param idcName
     */
    public DescribeDeviceInspection idcName(String idcName) {
        this.idcName = idcName;
        return this;
    }


    /**
     * set 故障状态
     *
     * @param status
     */
    public DescribeDeviceInspection status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 设备编码
     *
     * @param deviceNo
     */
    public DescribeDeviceInspection deviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
        return this;
    }


    /**
     * set 设备SN号
     *
     * @param snNo
     */
    public DescribeDeviceInspection snNo(String snNo) {
        this.snNo = snNo;
        return this;
    }


    /**
     * set 设备类型
     *
     * @param deviceType
     */
    public DescribeDeviceInspection deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }


    /**
     * set 故障类型
     *
     * @param faultType
     */
    public DescribeDeviceInspection faultType(String faultType) {
        this.faultType = faultType;
        return this;
    }


}