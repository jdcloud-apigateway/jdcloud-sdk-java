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

package com.jdcloud.sdk.service.eid.model;


/**
 * txBody
 */
public class TxBody  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * cOMMON
     */
    private Common cOMMON;

    /**
     * eNTITY
     */
    private Entity eNTITY;



    /**
     * get cOMMON
     *
     * @return
     */
    public Common getCOMMON() {
        return cOMMON;
    }

    /**
     * set cOMMON
     *
     * @param cOMMON
     */
    public void setCOMMON(Common cOMMON) {
        this.cOMMON = cOMMON;
    }


    /**
     * get eNTITY
     *
     * @return
     */
    public Entity getENTITY() {
        return eNTITY;
    }

    /**
     * set eNTITY
     *
     * @param eNTITY
     */
    public void setENTITY(Entity eNTITY) {
        this.eNTITY = eNTITY;
    }



    /**
     * set cOMMON
     *
     * @param cOMMON
     */
    public TxBody cOMMON(Common cOMMON) {
        this.cOMMON = cOMMON;
        return this;
    }


    /**
     * set eNTITY
     *
     * @param eNTITY
     */
    public TxBody eNTITY(Entity eNTITY) {
        this.eNTITY = eNTITY;
        return this;
    }


}