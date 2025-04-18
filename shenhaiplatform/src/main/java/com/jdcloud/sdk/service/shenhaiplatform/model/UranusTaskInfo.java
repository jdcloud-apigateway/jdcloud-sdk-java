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
 * uranusTaskInfo
 */
public class UranusTaskInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * taskInfo
     */
    private UranusTaskInfoRes taskInfo;

    /**
     * taskNodeInfo
     */
    private UranusTaskInfoNodeReq taskNodeInfo;

    /**
     * fileInfo
     */
    private UranusTaskInfoFileReq fileInfo;

    /**
     * sparkJarInfo
     */
    private TaskInfoSparkJarReq sparkJarInfo;

    /**
     * loopInfo
     */
    private TaskInfoLoopReq loopInfo;



    /**
     * get taskInfo
     *
     * @return
     */
    public UranusTaskInfoRes getTaskInfo() {
        return taskInfo;
    }

    /**
     * set taskInfo
     *
     * @param taskInfo
     */
    public void setTaskInfo(UranusTaskInfoRes taskInfo) {
        this.taskInfo = taskInfo;
    }


    /**
     * get taskNodeInfo
     *
     * @return
     */
    public UranusTaskInfoNodeReq getTaskNodeInfo() {
        return taskNodeInfo;
    }

    /**
     * set taskNodeInfo
     *
     * @param taskNodeInfo
     */
    public void setTaskNodeInfo(UranusTaskInfoNodeReq taskNodeInfo) {
        this.taskNodeInfo = taskNodeInfo;
    }


    /**
     * get fileInfo
     *
     * @return
     */
    public UranusTaskInfoFileReq getFileInfo() {
        return fileInfo;
    }

    /**
     * set fileInfo
     *
     * @param fileInfo
     */
    public void setFileInfo(UranusTaskInfoFileReq fileInfo) {
        this.fileInfo = fileInfo;
    }


    /**
     * get sparkJarInfo
     *
     * @return
     */
    public TaskInfoSparkJarReq getSparkJarInfo() {
        return sparkJarInfo;
    }

    /**
     * set sparkJarInfo
     *
     * @param sparkJarInfo
     */
    public void setSparkJarInfo(TaskInfoSparkJarReq sparkJarInfo) {
        this.sparkJarInfo = sparkJarInfo;
    }


    /**
     * get loopInfo
     *
     * @return
     */
    public TaskInfoLoopReq getLoopInfo() {
        return loopInfo;
    }

    /**
     * set loopInfo
     *
     * @param loopInfo
     */
    public void setLoopInfo(TaskInfoLoopReq loopInfo) {
        this.loopInfo = loopInfo;
    }



    /**
     * set taskInfo
     *
     * @param taskInfo
     */
    public UranusTaskInfo taskInfo(UranusTaskInfoRes taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }


    /**
     * set taskNodeInfo
     *
     * @param taskNodeInfo
     */
    public UranusTaskInfo taskNodeInfo(UranusTaskInfoNodeReq taskNodeInfo) {
        this.taskNodeInfo = taskNodeInfo;
        return this;
    }


    /**
     * set fileInfo
     *
     * @param fileInfo
     */
    public UranusTaskInfo fileInfo(UranusTaskInfoFileReq fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }


    /**
     * set sparkJarInfo
     *
     * @param sparkJarInfo
     */
    public UranusTaskInfo sparkJarInfo(TaskInfoSparkJarReq sparkJarInfo) {
        this.sparkJarInfo = sparkJarInfo;
        return this;
    }


    /**
     * set loopInfo
     *
     * @param loopInfo
     */
    public UranusTaskInfo loopInfo(TaskInfoLoopReq loopInfo) {
        this.loopInfo = loopInfo;
        return this;
    }


}