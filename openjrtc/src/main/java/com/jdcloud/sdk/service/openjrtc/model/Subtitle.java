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

package com.jdcloud.sdk.service.openjrtc.model;


/**
 * subtitle
 */
public class Subtitle  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否开启翻译 true-转写+翻译 false-只转写 默认false
     */
    private Boolean enableTranslate;

    /**
     * 源语言 支持[&quot;cn&quot;,&quot;en&quot;]，默认cn
     */
    private String sourceLang;

    /**
     * 支持[&quot;cn&quot;,&quot;en&quot;,&quot;de&quot;,&quot;ja&quot;,&quot;ko&quot;]，默认en
     */
    private String targetLang;



    /**
     * get 是否开启翻译 true-转写+翻译 false-只转写 默认false
     *
     * @return
     */
    public Boolean getEnableTranslate() {
        return enableTranslate;
    }

    /**
     * set 是否开启翻译 true-转写+翻译 false-只转写 默认false
     *
     * @param enableTranslate
     */
    public void setEnableTranslate(Boolean enableTranslate) {
        this.enableTranslate = enableTranslate;
    }


    /**
     * get 源语言 支持[&quot;cn&quot;,&quot;en&quot;]，默认cn
     *
     * @return
     */
    public String getSourceLang() {
        return sourceLang;
    }

    /**
     * set 源语言 支持[&quot;cn&quot;,&quot;en&quot;]，默认cn
     *
     * @param sourceLang
     */
    public void setSourceLang(String sourceLang) {
        this.sourceLang = sourceLang;
    }


    /**
     * get 支持[&quot;cn&quot;,&quot;en&quot;,&quot;de&quot;,&quot;ja&quot;,&quot;ko&quot;]，默认en
     *
     * @return
     */
    public String getTargetLang() {
        return targetLang;
    }

    /**
     * set 支持[&quot;cn&quot;,&quot;en&quot;,&quot;de&quot;,&quot;ja&quot;,&quot;ko&quot;]，默认en
     *
     * @param targetLang
     */
    public void setTargetLang(String targetLang) {
        this.targetLang = targetLang;
    }



    /**
     * set 是否开启翻译 true-转写+翻译 false-只转写 默认false
     *
     * @param enableTranslate
     */
    public Subtitle enableTranslate(Boolean enableTranslate) {
        this.enableTranslate = enableTranslate;
        return this;
    }


    /**
     * set 源语言 支持[&quot;cn&quot;,&quot;en&quot;]，默认cn
     *
     * @param sourceLang
     */
    public Subtitle sourceLang(String sourceLang) {
        this.sourceLang = sourceLang;
        return this;
    }


    /**
     * set 支持[&quot;cn&quot;,&quot;en&quot;,&quot;de&quot;,&quot;ja&quot;,&quot;ko&quot;]，默认en
     *
     * @param targetLang
     */
    public Subtitle targetLang(String targetLang) {
        this.targetLang = targetLang;
        return this;
    }


}