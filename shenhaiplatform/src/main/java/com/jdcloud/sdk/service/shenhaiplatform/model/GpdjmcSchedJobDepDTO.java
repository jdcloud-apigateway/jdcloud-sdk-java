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


/**
 * gpdjmcSchedJobDepDTO
 */
public class GpdjmcSchedJobDepDTO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * jobName
     */
    private String jobName;

    /**
     * flagParallel
     */
    private String flagParallel;

    /**
     * necessary
     */
    private String necessary;

    /**
     * cycle
     */
    private String cycle;



    /**
     * get jobName
     *
     * @return
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * set jobName
     *
     * @param jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }


    /**
     * get flagParallel
     *
     * @return
     */
    public String getFlagParallel() {
        return flagParallel;
    }

    /**
     * set flagParallel
     *
     * @param flagParallel
     */
    public void setFlagParallel(String flagParallel) {
        this.flagParallel = flagParallel;
    }


    /**
     * get necessary
     *
     * @return
     */
    public String getNecessary() {
        return necessary;
    }

    /**
     * set necessary
     *
     * @param necessary
     */
    public void setNecessary(String necessary) {
        this.necessary = necessary;
    }


    /**
     * get cycle
     *
     * @return
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * set cycle
     *
     * @param cycle
     */
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }



    /**
     * set jobName
     *
     * @param jobName
     */
    public GpdjmcSchedJobDepDTO jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set flagParallel
     *
     * @param flagParallel
     */
    public GpdjmcSchedJobDepDTO flagParallel(String flagParallel) {
        this.flagParallel = flagParallel;
        return this;
    }


    /**
     * set necessary
     *
     * @param necessary
     */
    public GpdjmcSchedJobDepDTO necessary(String necessary) {
        this.necessary = necessary;
        return this;
    }


    /**
     * set cycle
     *
     * @param cycle
     */
    public GpdjmcSchedJobDepDTO cycle(String cycle) {
        this.cycle = cycle;
        return this;
    }


}