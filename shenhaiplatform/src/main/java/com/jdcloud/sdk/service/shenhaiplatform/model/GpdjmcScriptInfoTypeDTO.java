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

import java.util.List;
import java.util.ArrayList;

/**
 * gpdjmcScriptInfoTypeDTO
 */
public class GpdjmcScriptInfoTypeDTO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * otherInfoList
     */
    
    private List<GpdjmcScriptInfoTemplateDTO> otherInfoList;
    /**
     * mgrDictListScript
     */
    
    private List<GpdjmcMgrDictDTO> mgrDictListScript;


    /**
    * get otherInfoList
    *
    * @return
    */
    public List<GpdjmcScriptInfoTemplateDTO> getOtherInfoList() {
        return otherInfoList;
    }

    /**
    * set otherInfoList
    *
    * @param otherInfoList
    */
    public void setOtherInfoList(List<GpdjmcScriptInfoTemplateDTO> otherInfoList) {
        this.otherInfoList = otherInfoList;
    }


    /**
    * get mgrDictListScript
    *
    * @return
    */
    public List<GpdjmcMgrDictDTO> getMgrDictListScript() {
        return mgrDictListScript;
    }

    /**
    * set mgrDictListScript
    *
    * @param mgrDictListScript
    */
    public void setMgrDictListScript(List<GpdjmcMgrDictDTO> mgrDictListScript) {
        this.mgrDictListScript = mgrDictListScript;
    }



    /**
    * set otherInfoList
    *
    * @param otherInfoList
    */
    public GpdjmcScriptInfoTypeDTO otherInfoList(List<GpdjmcScriptInfoTemplateDTO> otherInfoList) {
        this.otherInfoList = otherInfoList;
        return this;
    }


    /**
    * set mgrDictListScript
    *
    * @param mgrDictListScript
    */
    public GpdjmcScriptInfoTypeDTO mgrDictListScript(List<GpdjmcMgrDictDTO> mgrDictListScript) {
        this.mgrDictListScript = mgrDictListScript;
        return this;
    }



    /**
     * add item to otherInfoList
     *
     * @param otherInfoList
     */
    public void addOtherInfoList(GpdjmcScriptInfoTemplateDTO otherInfoList) {
        if (this.otherInfoList == null) {
            this.otherInfoList = new ArrayList<>();
        }
        this.otherInfoList.add(otherInfoList);
    }

    /**
     * add item to mgrDictListScript
     *
     * @param mgrDictListScript
     */
    public void addMgrDictListScript(GpdjmcMgrDictDTO mgrDictListScript) {
        if (this.mgrDictListScript == null) {
            this.mgrDictListScript = new ArrayList<>();
        }
        this.mgrDictListScript.add(mgrDictListScript);
    }
}