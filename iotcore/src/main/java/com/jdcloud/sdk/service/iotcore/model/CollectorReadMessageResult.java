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
 * ElevatorAPI
 * 电梯API
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotcore.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取协议信息
 */
public class CollectorReadMessageResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 读取寄存器值，key：寄存器地址 value:寄存器值
如读取语音播报控制器-输入端子的响应为
{
  &quot;0&quot;:0,
  &quot;1&quot;:0,
  &quot;2&quot;:0,
  &quot;3&quot;:0,
  &quot;4&quot;:0,
  &quot;5&quot;:0,
  &quot;6&quot;:0,
  &quot;7&quot;:0
}
如读取语音播报控制器-播放信息的响应为
{
  &quot;36&quot;:0,
  &quot;37&quot;:0,
  &quot;38&quot;:0,
  &quot;39&quot;:0,
  &quot;40&quot;:0,
  &quot;41&quot;:0,
  &quot;42&quot;:0,
  &quot;43&quot;:0,
  &quot;44&quot;:1,
  &quot;45&quot;:3,
  &quot;46&quot;:0,
  &quot;47&quot;:0
}
如读取LR001-516-5B边缘数据采集器-传感器管理的响应为
{
  &quot;40426&quot;:1,
  &quot;40427&quot;:1,
  &quot;40428&quot;:2,
  &quot;40429&quot;:1,
  &quot;40430&quot;:1,
  &quot;40431&quot;:1,
  &quot;40432&quot;:1,
  &quot;40433&quot;:2,
  &quot;40434&quot;:1,
  &quot;40435&quot;:1,
  &quot;40436&quot;:1,
  &quot;40437&quot;:1,
  &quot;40438&quot;:1,
  &quot;40439&quot;:1,
  &quot;40440&quot;:1
}

     */
    private Object readData;


    /**
     * get 读取寄存器值，key：寄存器地址 value:寄存器值
如读取语音播报控制器-输入端子的响应为
{
  &quot;0&quot;:0,
  &quot;1&quot;:0,
  &quot;2&quot;:0,
  &quot;3&quot;:0,
  &quot;4&quot;:0,
  &quot;5&quot;:0,
  &quot;6&quot;:0,
  &quot;7&quot;:0
}
如读取语音播报控制器-播放信息的响应为
{
  &quot;36&quot;:0,
  &quot;37&quot;:0,
  &quot;38&quot;:0,
  &quot;39&quot;:0,
  &quot;40&quot;:0,
  &quot;41&quot;:0,
  &quot;42&quot;:0,
  &quot;43&quot;:0,
  &quot;44&quot;:1,
  &quot;45&quot;:3,
  &quot;46&quot;:0,
  &quot;47&quot;:0
}
如读取LR001-516-5B边缘数据采集器-传感器管理的响应为
{
  &quot;40426&quot;:1,
  &quot;40427&quot;:1,
  &quot;40428&quot;:2,
  &quot;40429&quot;:1,
  &quot;40430&quot;:1,
  &quot;40431&quot;:1,
  &quot;40432&quot;:1,
  &quot;40433&quot;:2,
  &quot;40434&quot;:1,
  &quot;40435&quot;:1,
  &quot;40436&quot;:1,
  &quot;40437&quot;:1,
  &quot;40438&quot;:1,
  &quot;40439&quot;:1,
  &quot;40440&quot;:1
}

     *
     * @return
     */
    public Object getReadData() {
        return readData;
    }

    /**
     * set 读取寄存器值，key：寄存器地址 value:寄存器值
如读取语音播报控制器-输入端子的响应为
{
  &quot;0&quot;:0,
  &quot;1&quot;:0,
  &quot;2&quot;:0,
  &quot;3&quot;:0,
  &quot;4&quot;:0,
  &quot;5&quot;:0,
  &quot;6&quot;:0,
  &quot;7&quot;:0
}
如读取语音播报控制器-播放信息的响应为
{
  &quot;36&quot;:0,
  &quot;37&quot;:0,
  &quot;38&quot;:0,
  &quot;39&quot;:0,
  &quot;40&quot;:0,
  &quot;41&quot;:0,
  &quot;42&quot;:0,
  &quot;43&quot;:0,
  &quot;44&quot;:1,
  &quot;45&quot;:3,
  &quot;46&quot;:0,
  &quot;47&quot;:0
}
如读取LR001-516-5B边缘数据采集器-传感器管理的响应为
{
  &quot;40426&quot;:1,
  &quot;40427&quot;:1,
  &quot;40428&quot;:2,
  &quot;40429&quot;:1,
  &quot;40430&quot;:1,
  &quot;40431&quot;:1,
  &quot;40432&quot;:1,
  &quot;40433&quot;:2,
  &quot;40434&quot;:1,
  &quot;40435&quot;:1,
  &quot;40436&quot;:1,
  &quot;40437&quot;:1,
  &quot;40438&quot;:1,
  &quot;40439&quot;:1,
  &quot;40440&quot;:1
}

     *
     * @param readData
     */
    public void setReadData(Object readData) {
        this.readData = readData;
    }


    /**
     * set 读取寄存器值，key：寄存器地址 value:寄存器值
如读取语音播报控制器-输入端子的响应为
{
  &quot;0&quot;:0,
  &quot;1&quot;:0,
  &quot;2&quot;:0,
  &quot;3&quot;:0,
  &quot;4&quot;:0,
  &quot;5&quot;:0,
  &quot;6&quot;:0,
  &quot;7&quot;:0
}
如读取语音播报控制器-播放信息的响应为
{
  &quot;36&quot;:0,
  &quot;37&quot;:0,
  &quot;38&quot;:0,
  &quot;39&quot;:0,
  &quot;40&quot;:0,
  &quot;41&quot;:0,
  &quot;42&quot;:0,
  &quot;43&quot;:0,
  &quot;44&quot;:1,
  &quot;45&quot;:3,
  &quot;46&quot;:0,
  &quot;47&quot;:0
}
如读取LR001-516-5B边缘数据采集器-传感器管理的响应为
{
  &quot;40426&quot;:1,
  &quot;40427&quot;:1,
  &quot;40428&quot;:2,
  &quot;40429&quot;:1,
  &quot;40430&quot;:1,
  &quot;40431&quot;:1,
  &quot;40432&quot;:1,
  &quot;40433&quot;:2,
  &quot;40434&quot;:1,
  &quot;40435&quot;:1,
  &quot;40436&quot;:1,
  &quot;40437&quot;:1,
  &quot;40438&quot;:1,
  &quot;40439&quot;:1,
  &quot;40440&quot;:1
}

     *
     * @param readData
     */
    public CollectorReadMessageResult readData(Object readData) {
        this.readData = readData;
        return this;
    }


}