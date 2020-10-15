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


/**
 * auditRange
 */
public class AuditRange  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 正常数据是否入审，true-入审，false-不入审，缺省为 false
     */
    private Boolean pass;

    /**
     * 疑似数据是否入审，true-入审，false-不入审，缺省为 false
     */
    private Boolean review;

    /**
     * 确认违规数据是否入审，true-入审，false-不入审，缺省为 false
     */
    private Boolean block;


    /**
     * get 正常数据是否入审，true-入审，false-不入审，缺省为 false
     *
     * @return
     */
    public Boolean getPass() {
        return pass;
    }

    /**
     * set 正常数据是否入审，true-入审，false-不入审，缺省为 false
     *
     * @param pass
     */
    public void setPass(Boolean pass) {
        this.pass = pass;
    }

    /**
     * get 疑似数据是否入审，true-入审，false-不入审，缺省为 false
     *
     * @return
     */
    public Boolean getReview() {
        return review;
    }

    /**
     * set 疑似数据是否入审，true-入审，false-不入审，缺省为 false
     *
     * @param review
     */
    public void setReview(Boolean review) {
        this.review = review;
    }

    /**
     * get 确认违规数据是否入审，true-入审，false-不入审，缺省为 false
     *
     * @return
     */
    public Boolean getBlock() {
        return block;
    }

    /**
     * set 确认违规数据是否入审，true-入审，false-不入审，缺省为 false
     *
     * @param block
     */
    public void setBlock(Boolean block) {
        this.block = block;
    }


    /**
     * set 正常数据是否入审，true-入审，false-不入审，缺省为 false
     *
     * @param pass
     */
    public AuditRange pass(Boolean pass) {
        this.pass = pass;
        return this;
    }

    /**
     * set 疑似数据是否入审，true-入审，false-不入审，缺省为 false
     *
     * @param review
     */
    public AuditRange review(Boolean review) {
        this.review = review;
        return this;
    }

    /**
     * set 确认违规数据是否入审，true-入审，false-不入审，缺省为 false
     *
     * @param block
     */
    public AuditRange block(Boolean block) {
        this.block = block;
        return this;
    }


}