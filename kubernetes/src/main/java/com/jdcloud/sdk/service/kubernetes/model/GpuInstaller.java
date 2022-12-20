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

package com.jdcloud.sdk.service.kubernetes.model;


/**
 * GPU驱动安装器信息
 */
public class GpuInstaller  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 驱动安装器名称，驱动安装器名称格式：{GPU型号}-{驱动版本}-{CUDA版本}
     */
    private String installerName;

    /**
     * 驱动安装器镜像名称
     */
    private String imageName;

    /**
     * 驱动安装器镜像版本
     */
    private String imageVersion;

    /**
     * 设备配型，例如v100/p40
     */
    private String deviceType;

    /**
     * 驱动版本
     */
    private String driverVersion;

    /**
     * cuda版本
     */
    private String cudaVersion;

    /**
     * Gpu驱动安装器状态，1 启动，0禁用
     */
    private Integer status;



    /**
     * get 驱动安装器名称，驱动安装器名称格式：{GPU型号}-{驱动版本}-{CUDA版本}
     *
     * @return
     */
    public String getInstallerName() {
        return installerName;
    }

    /**
     * set 驱动安装器名称，驱动安装器名称格式：{GPU型号}-{驱动版本}-{CUDA版本}
     *
     * @param installerName
     */
    public void setInstallerName(String installerName) {
        this.installerName = installerName;
    }


    /**
     * get 驱动安装器镜像名称
     *
     * @return
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * set 驱动安装器镜像名称
     *
     * @param imageName
     */
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }


    /**
     * get 驱动安装器镜像版本
     *
     * @return
     */
    public String getImageVersion() {
        return imageVersion;
    }

    /**
     * set 驱动安装器镜像版本
     *
     * @param imageVersion
     */
    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }


    /**
     * get 设备配型，例如v100/p40
     *
     * @return
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * set 设备配型，例如v100/p40
     *
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * get 驱动版本
     *
     * @return
     */
    public String getDriverVersion() {
        return driverVersion;
    }

    /**
     * set 驱动版本
     *
     * @param driverVersion
     */
    public void setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
    }


    /**
     * get cuda版本
     *
     * @return
     */
    public String getCudaVersion() {
        return cudaVersion;
    }

    /**
     * set cuda版本
     *
     * @param cudaVersion
     */
    public void setCudaVersion(String cudaVersion) {
        this.cudaVersion = cudaVersion;
    }


    /**
     * get Gpu驱动安装器状态，1 启动，0禁用
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set Gpu驱动安装器状态，1 启动，0禁用
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }



    /**
     * set 驱动安装器名称，驱动安装器名称格式：{GPU型号}-{驱动版本}-{CUDA版本}
     *
     * @param installerName
     */
    public GpuInstaller installerName(String installerName) {
        this.installerName = installerName;
        return this;
    }


    /**
     * set 驱动安装器镜像名称
     *
     * @param imageName
     */
    public GpuInstaller imageName(String imageName) {
        this.imageName = imageName;
        return this;
    }


    /**
     * set 驱动安装器镜像版本
     *
     * @param imageVersion
     */
    public GpuInstaller imageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }


    /**
     * set 设备配型，例如v100/p40
     *
     * @param deviceType
     */
    public GpuInstaller deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }


    /**
     * set 驱动版本
     *
     * @param driverVersion
     */
    public GpuInstaller driverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
        return this;
    }


    /**
     * set cuda版本
     *
     * @param cudaVersion
     */
    public GpuInstaller cudaVersion(String cudaVersion) {
        this.cudaVersion = cudaVersion;
        return this;
    }


    /**
     * set Gpu驱动安装器状态，1 启动，0禁用
     *
     * @param status
     */
    public GpuInstaller status(Integer status) {
        this.status = status;
        return this;
    }


}