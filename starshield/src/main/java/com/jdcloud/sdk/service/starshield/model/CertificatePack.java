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

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;

/**
 * certificatePack
 */
public class CertificatePack  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 证书包的唯一标识符
     */
    private String id;

    /**
     * 证书包的类型，有效值universal/sni_custom/advanced
universal    通用
sni_custom   自定义
advanced     专用

     */
    private String type;

    /**
     * 证书包的类型，有效值universal/sni_custom/advanced
universal    通用
sni_custom   自定义
advanced     专用
(值同type)

     */
    private String ty_pe;

    /**
     * 证书包的有效主机名的逗号分隔列表。必须包含域的顶级域名，不能包含超过50个主机，并且不能为空。
     */
    
    private List<String> hosts;
    /**
     * certificates
     */
    
    private List<Certificate> certificates;
    /**
     * 包中主证书的标识符
     */
    private String primary_certificate;



    /**
     * get 证书包的唯一标识符
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 证书包的唯一标识符
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * get 证书包的类型，有效值universal/sni_custom/advanced
universal    通用
sni_custom   自定义
advanced     专用

     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 证书包的类型，有效值universal/sni_custom/advanced
universal    通用
sni_custom   自定义
advanced     专用

     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * get 证书包的类型，有效值universal/sni_custom/advanced
universal    通用
sni_custom   自定义
advanced     专用
(值同type)

     *
     * @return
     */
    public String getTy_pe() {
        return ty_pe;
    }

    /**
     * set 证书包的类型，有效值universal/sni_custom/advanced
universal    通用
sni_custom   自定义
advanced     专用
(值同type)

     *
     * @param ty_pe
     */
    public void setTy_pe(String ty_pe) {
        this.ty_pe = ty_pe;
    }


    /**
    * get 证书包的有效主机名的逗号分隔列表。必须包含域的顶级域名，不能包含超过50个主机，并且不能为空。
    *
    * @return
    */
    public List<String> getHosts() {
        return hosts;
    }

    /**
    * set 证书包的有效主机名的逗号分隔列表。必须包含域的顶级域名，不能包含超过50个主机，并且不能为空。
    *
    * @param hosts
    */
    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }


    /**
    * get certificates
    *
    * @return
    */
    public List<Certificate> getCertificates() {
        return certificates;
    }

    /**
    * set certificates
    *
    * @param certificates
    */
    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }


    /**
     * get 包中主证书的标识符
     *
     * @return
     */
    public String getPrimary_certificate() {
        return primary_certificate;
    }

    /**
     * set 包中主证书的标识符
     *
     * @param primary_certificate
     */
    public void setPrimary_certificate(String primary_certificate) {
        this.primary_certificate = primary_certificate;
    }



    /**
     * set 证书包的唯一标识符
     *
     * @param id
     */
    public CertificatePack id(String id) {
        this.id = id;
        return this;
    }


    /**
     * set 证书包的类型，有效值universal/sni_custom/advanced
universal    通用
sni_custom   自定义
advanced     专用

     *
     * @param type
     */
    public CertificatePack type(String type) {
        this.type = type;
        return this;
    }


    /**
     * set 证书包的类型，有效值universal/sni_custom/advanced
universal    通用
sni_custom   自定义
advanced     专用
(值同type)

     *
     * @param ty_pe
     */
    public CertificatePack ty_pe(String ty_pe) {
        this.ty_pe = ty_pe;
        return this;
    }


    /**
    * set 证书包的有效主机名的逗号分隔列表。必须包含域的顶级域名，不能包含超过50个主机，并且不能为空。
    *
    * @param hosts
    */
    public CertificatePack hosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }


    /**
    * set certificates
    *
    * @param certificates
    */
    public CertificatePack certificates(List<Certificate> certificates) {
        this.certificates = certificates;
        return this;
    }


    /**
     * set 包中主证书的标识符
     *
     * @param primary_certificate
     */
    public CertificatePack primary_certificate(String primary_certificate) {
        this.primary_certificate = primary_certificate;
        return this;
    }



    /**
     * add item to 证书包的有效主机名的逗号分隔列表。必须包含域的顶级域名，不能包含超过50个主机，并且不能为空。
     *
     * @param host
     */
    public void addHost(String host) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(host);
    }

    /**
     * add item to certificates
     *
     * @param certificate
     */
    public void addCertificate(Certificate certificate) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        this.certificates.add(certificate);
    }
}