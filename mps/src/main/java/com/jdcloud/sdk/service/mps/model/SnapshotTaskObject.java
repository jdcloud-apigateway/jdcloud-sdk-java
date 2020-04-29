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

package com.jdcloud.sdk.service.mps.model;


/**
 * 截图任务信息
 */
public class SnapshotTaskObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务ID
     */
    private String taskId;

    /**
     * 截图起始时间
     */
    private Integer startTime;

    /**
     * 截图帧类型。
     */
    private String frameType;

    /**
     * 截图格式。取值范围：jpg、png
     */
    private String format;

    /**
     * 截图数量
     */
    private Integer number;

    /**
     * 截图间隔
     */
    private Integer interval;

    /**
     * 截图宽度
     */
    private Integer width;

    /**
     * 截图高度
     */
    private Integer height;

    /**
     * 填充方式
     */
    private String fillType;

    /**
     * 输入配置
     */
    private Input input;

    /**
     * 输出配置
     */
    private Output output;

    /**
     * 雪碧图参数配置
     */
    private SpriteConfig spriteConfig;

    /**
     * 雪碧图输出配置
     */
    private Output spriteOutput;

    /**
     * 任务状态。
- submitted
- cancelled
- running
- finished_success
- finished_failure

     */
    private String status;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 完成时间
     */
    private String finishTime;


    /**
     * get 任务ID
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 任务ID
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * get 截图起始时间
     *
     * @return
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * set 截图起始时间
     *
     * @param startTime
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * get 截图帧类型。
     *
     * @return
     */
    public String getFrameType() {
        return frameType;
    }

    /**
     * set 截图帧类型。
     *
     * @param frameType
     */
    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    /**
     * get 截图格式。取值范围：jpg、png
     *
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * set 截图格式。取值范围：jpg、png
     *
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * get 截图数量
     *
     * @return
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * set 截图数量
     *
     * @param number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * get 截图间隔
     *
     * @return
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * set 截图间隔
     *
     * @param interval
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * get 截图宽度
     *
     * @return
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * set 截图宽度
     *
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * get 截图高度
     *
     * @return
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * set 截图高度
     *
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * get 填充方式
     *
     * @return
     */
    public String getFillType() {
        return fillType;
    }

    /**
     * set 填充方式
     *
     * @param fillType
     */
    public void setFillType(String fillType) {
        this.fillType = fillType;
    }

    /**
     * get 输入配置
     *
     * @return
     */
    public Input getInput() {
        return input;
    }

    /**
     * set 输入配置
     *
     * @param input
     */
    public void setInput(Input input) {
        this.input = input;
    }

    /**
     * get 输出配置
     *
     * @return
     */
    public Output getOutput() {
        return output;
    }

    /**
     * set 输出配置
     *
     * @param output
     */
    public void setOutput(Output output) {
        this.output = output;
    }

    /**
     * get 雪碧图参数配置
     *
     * @return
     */
    public SpriteConfig getSpriteConfig() {
        return spriteConfig;
    }

    /**
     * set 雪碧图参数配置
     *
     * @param spriteConfig
     */
    public void setSpriteConfig(SpriteConfig spriteConfig) {
        this.spriteConfig = spriteConfig;
    }

    /**
     * get 雪碧图输出配置
     *
     * @return
     */
    public Output getSpriteOutput() {
        return spriteOutput;
    }

    /**
     * set 雪碧图输出配置
     *
     * @param spriteOutput
     */
    public void setSpriteOutput(Output spriteOutput) {
        this.spriteOutput = spriteOutput;
    }

    /**
     * get 任务状态。
- submitted
- cancelled
- running
- finished_success
- finished_failure

     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 任务状态。
- submitted
- cancelled
- running
- finished_success
- finished_failure

     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
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
     * get 完成时间
     *
     * @return
     */
    public String getFinishTime() {
        return finishTime;
    }

    /**
     * set 完成时间
     *
     * @param finishTime
     */
    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }


    /**
     * set 任务ID
     *
     * @param taskId
     */
    public SnapshotTaskObject taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * set 截图起始时间
     *
     * @param startTime
     */
    public SnapshotTaskObject startTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 截图帧类型。
     *
     * @param frameType
     */
    public SnapshotTaskObject frameType(String frameType) {
        this.frameType = frameType;
        return this;
    }

    /**
     * set 截图格式。取值范围：jpg、png
     *
     * @param format
     */
    public SnapshotTaskObject format(String format) {
        this.format = format;
        return this;
    }

    /**
     * set 截图数量
     *
     * @param number
     */
    public SnapshotTaskObject number(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * set 截图间隔
     *
     * @param interval
     */
    public SnapshotTaskObject interval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * set 截图宽度
     *
     * @param width
     */
    public SnapshotTaskObject width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * set 截图高度
     *
     * @param height
     */
    public SnapshotTaskObject height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * set 填充方式
     *
     * @param fillType
     */
    public SnapshotTaskObject fillType(String fillType) {
        this.fillType = fillType;
        return this;
    }

    /**
     * set 输入配置
     *
     * @param input
     */
    public SnapshotTaskObject input(Input input) {
        this.input = input;
        return this;
    }

    /**
     * set 输出配置
     *
     * @param output
     */
    public SnapshotTaskObject output(Output output) {
        this.output = output;
        return this;
    }

    /**
     * set 雪碧图参数配置
     *
     * @param spriteConfig
     */
    public SnapshotTaskObject spriteConfig(SpriteConfig spriteConfig) {
        this.spriteConfig = spriteConfig;
        return this;
    }

    /**
     * set 雪碧图输出配置
     *
     * @param spriteOutput
     */
    public SnapshotTaskObject spriteOutput(Output spriteOutput) {
        this.spriteOutput = spriteOutput;
        return this;
    }

    /**
     * set 任务状态。
- submitted
- cancelled
- running
- finished_success
- finished_failure

     *
     * @param status
     */
    public SnapshotTaskObject status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public SnapshotTaskObject createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 完成时间
     *
     * @param finishTime
     */
    public SnapshotTaskObject finishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }


}