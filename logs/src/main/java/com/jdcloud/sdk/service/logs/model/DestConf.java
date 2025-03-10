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

package com.jdcloud.sdk.service.logs.model;

import java.util.List;
import java.util.ArrayList;

/**
 * destConf
 */
public class DestConf  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自定义目的地
     */
    
    private List<CustomConf> custom;
    /**
     * 是否设置日志主题作为目的地
     */
    private Boolean jcloud;



    /**
    * get 自定义目的地
    *
    * @return
    */
    public List<CustomConf> getCustom() {
        return custom;
    }

    /**
    * set 自定义目的地
    *
    * @param custom
    */
    public void setCustom(List<CustomConf> custom) {
        this.custom = custom;
    }


    /**
     * get 是否设置日志主题作为目的地
     *
     * @return
     */
    public Boolean getJcloud() {
        return jcloud;
    }

    /**
     * set 是否设置日志主题作为目的地
     *
     * @param jcloud
     */
    public void setJcloud(Boolean jcloud) {
        this.jcloud = jcloud;
    }



    /**
    * set 自定义目的地
    *
    * @param custom
    */
    public DestConf custom(List<CustomConf> custom) {
        this.custom = custom;
        return this;
    }


    /**
     * set 是否设置日志主题作为目的地
     *
     * @param jcloud
     */
    public DestConf jcloud(Boolean jcloud) {
        this.jcloud = jcloud;
        return this;
    }



    /**
     * add item to 自定义目的地
     *
     * @param custom
     */
    public void addCustom(CustomConf custom) {
        if (this.custom == null) {
            this.custom = new ArrayList<>();
        }
        this.custom.add(custom);
    }
}