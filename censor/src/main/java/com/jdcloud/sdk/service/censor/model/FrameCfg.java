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

package com.jdcloud.sdk.service.censor.model;

import java.util.List;
import java.util.ArrayList;

/**
 * frameCfg
 */
public class FrameCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * url前缀
     */
    private String prefix;

    /**
     * frames
     */
    private List<Frame> frames;


    /**
     * get url前缀
     *
     * @return
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * set url前缀
     *
     * @param prefix
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * get frames
     *
     * @return
     */
    public List<Frame> getFrames() {
        return frames;
    }

    /**
     * set frames
     *
     * @param frames
     */
    public void setFrames(List<Frame> frames) {
        this.frames = frames;
    }


    /**
     * set url前缀
     *
     * @param prefix
     */
    public FrameCfg prefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * set frames
     *
     * @param frames
     */
    public FrameCfg frames(List<Frame> frames) {
        this.frames = frames;
        return this;
    }


    /**
     * add item to frames
     *
     * @param frame
     */
    public void addFrame(Frame frame) {
        if (this.frames == null) {
            this.frames = new ArrayList<>();
        }
        this.frames.add(frame);
    }

}