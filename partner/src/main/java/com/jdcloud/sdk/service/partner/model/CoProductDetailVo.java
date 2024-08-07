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

package com.jdcloud.sdk.service.partner.model;

import java.util.List;
import java.util.ArrayList;

/**
 * coProductDetailVo
 */
public class CoProductDetailVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 合作id
     */
    private String cooperationId;

    /**
     * 合作产品名称
     */
    private String productName;

    /**
     * 合作名称
     */
    private String name;

    /**
     * 合作伙伴公司名称
     */
    private String companyName;

    /**
     * 合作对接人列表
     */
    
    private List<Broker> brokers;
    /**
     * 合同信息
     */
    
    private List<Contract> contractInfos;
    /**
     * 产品类型
     */
    private Integer productType;

    /**
     * 产品类型名称
     */
    private String productTypeName;

    /**
     * 产品模式
     */
    private Integer productMode;

    /**
     * 产品模式名称
     */
    private String productModeName;

    /**
     * 产品简介
     */
    private String productDesc;

    /**
     * 目标客户
     */
    private String targetCustomer;

    /**
     * 市场规模
     */
    private String marketSize;

    /**
     * 主要竞品
     */
    private String comparableProduct;

    /**
     * 售卖形态  1套/n年、2套/n月、3套、4次
     */
    private Integer sellingForm;

    /**
     * 售卖形态名称  1套/n年、2套/n月、3套、4次
     */
    private String sellingFormName;

    /**
     * 售卖方式说明
     */
    
    private List<KeyValVo> sellingModes;
    /**
     * 定价
     */
    private String pricing;

    /**
     * 产品状态
     */
    private Integer productStatus;

    /**
     * 产品状态名称
     */
    private Integer productStatusName;

    /**
     * 收入预测
     */
    private String incomeForecast;

    /**
     * 成本结构
     */
    private String costStructure;

    /**
     * 毛利率预测
     */
    private String grossMarginForecast;

    /**
     * 定价策略 1市场对标， 2总成本加成，3变动成本加成
     */
    private Integer pricingStrategy;

    /**
     * 定价策略名称 1市场对标， 2总成本加成，3变动成本加成
     */
    private String pricingStrategyName;

    /**
     * 结算方式 1固定金额结算，2实际售价固定比例结算，3实际售价浮动比例结算
     */
    private Integer settlementMode;

    /**
     * 结算方式名称 1固定金额结算，2实际售价固定比例结算，3实际售价浮动比例结算
     */
    private String settlementModeName;

    /**
     * 结算周期 1周结后付款、2月结后付款、3季结后付款、4年结后付款，5 PO预付款
     */
    private Integer settlementCycle;

    /**
     * 结算周期名称 1周结后付款、2月结后付款、3季结后付款、4年结后付款，5 PO预付款
     */
    private String settlementCycleName;

    /**
     * 风险及建议
     */
    private String riskSuggestion;

    /**
     * 产品唯一标识id
     */
    private String uuid;

    /**
     * 合作公司
     */
    
    private List<CooperationCompanyVo> cooperationCompanys;


    /**
     * get 主键id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 主键id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * get 合作id
     *
     * @return
     */
    public String getCooperationId() {
        return cooperationId;
    }

    /**
     * set 合作id
     *
     * @param cooperationId
     */
    public void setCooperationId(String cooperationId) {
        this.cooperationId = cooperationId;
    }


    /**
     * get 合作产品名称
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     * set 合作产品名称
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }


    /**
     * get 合作名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 合作名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 合作伙伴公司名称
     *
     * @return
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * set 合作伙伴公司名称
     *
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
    * get 合作对接人列表
    *
    * @return
    */
    public List<Broker> getBrokers() {
        return brokers;
    }

    /**
    * set 合作对接人列表
    *
    * @param brokers
    */
    public void setBrokers(List<Broker> brokers) {
        this.brokers = brokers;
    }


    /**
    * get 合同信息
    *
    * @return
    */
    public List<Contract> getContractInfos() {
        return contractInfos;
    }

    /**
    * set 合同信息
    *
    * @param contractInfos
    */
    public void setContractInfos(List<Contract> contractInfos) {
        this.contractInfos = contractInfos;
    }


    /**
     * get 产品类型
     *
     * @return
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * set 产品类型
     *
     * @param productType
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }


    /**
     * get 产品类型名称
     *
     * @return
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * set 产品类型名称
     *
     * @param productTypeName
     */
    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }


    /**
     * get 产品模式
     *
     * @return
     */
    public Integer getProductMode() {
        return productMode;
    }

    /**
     * set 产品模式
     *
     * @param productMode
     */
    public void setProductMode(Integer productMode) {
        this.productMode = productMode;
    }


    /**
     * get 产品模式名称
     *
     * @return
     */
    public String getProductModeName() {
        return productModeName;
    }

    /**
     * set 产品模式名称
     *
     * @param productModeName
     */
    public void setProductModeName(String productModeName) {
        this.productModeName = productModeName;
    }


    /**
     * get 产品简介
     *
     * @return
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * set 产品简介
     *
     * @param productDesc
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }


    /**
     * get 目标客户
     *
     * @return
     */
    public String getTargetCustomer() {
        return targetCustomer;
    }

    /**
     * set 目标客户
     *
     * @param targetCustomer
     */
    public void setTargetCustomer(String targetCustomer) {
        this.targetCustomer = targetCustomer;
    }


    /**
     * get 市场规模
     *
     * @return
     */
    public String getMarketSize() {
        return marketSize;
    }

    /**
     * set 市场规模
     *
     * @param marketSize
     */
    public void setMarketSize(String marketSize) {
        this.marketSize = marketSize;
    }


    /**
     * get 主要竞品
     *
     * @return
     */
    public String getComparableProduct() {
        return comparableProduct;
    }

    /**
     * set 主要竞品
     *
     * @param comparableProduct
     */
    public void setComparableProduct(String comparableProduct) {
        this.comparableProduct = comparableProduct;
    }


    /**
     * get 售卖形态  1套/n年、2套/n月、3套、4次
     *
     * @return
     */
    public Integer getSellingForm() {
        return sellingForm;
    }

    /**
     * set 售卖形态  1套/n年、2套/n月、3套、4次
     *
     * @param sellingForm
     */
    public void setSellingForm(Integer sellingForm) {
        this.sellingForm = sellingForm;
    }


    /**
     * get 售卖形态名称  1套/n年、2套/n月、3套、4次
     *
     * @return
     */
    public String getSellingFormName() {
        return sellingFormName;
    }

    /**
     * set 售卖形态名称  1套/n年、2套/n月、3套、4次
     *
     * @param sellingFormName
     */
    public void setSellingFormName(String sellingFormName) {
        this.sellingFormName = sellingFormName;
    }


    /**
    * get 售卖方式说明
    *
    * @return
    */
    public List<KeyValVo> getSellingModes() {
        return sellingModes;
    }

    /**
    * set 售卖方式说明
    *
    * @param sellingModes
    */
    public void setSellingModes(List<KeyValVo> sellingModes) {
        this.sellingModes = sellingModes;
    }


    /**
     * get 定价
     *
     * @return
     */
    public String getPricing() {
        return pricing;
    }

    /**
     * set 定价
     *
     * @param pricing
     */
    public void setPricing(String pricing) {
        this.pricing = pricing;
    }


    /**
     * get 产品状态
     *
     * @return
     */
    public Integer getProductStatus() {
        return productStatus;
    }

    /**
     * set 产品状态
     *
     * @param productStatus
     */
    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }


    /**
     * get 产品状态名称
     *
     * @return
     */
    public Integer getProductStatusName() {
        return productStatusName;
    }

    /**
     * set 产品状态名称
     *
     * @param productStatusName
     */
    public void setProductStatusName(Integer productStatusName) {
        this.productStatusName = productStatusName;
    }


    /**
     * get 收入预测
     *
     * @return
     */
    public String getIncomeForecast() {
        return incomeForecast;
    }

    /**
     * set 收入预测
     *
     * @param incomeForecast
     */
    public void setIncomeForecast(String incomeForecast) {
        this.incomeForecast = incomeForecast;
    }


    /**
     * get 成本结构
     *
     * @return
     */
    public String getCostStructure() {
        return costStructure;
    }

    /**
     * set 成本结构
     *
     * @param costStructure
     */
    public void setCostStructure(String costStructure) {
        this.costStructure = costStructure;
    }


    /**
     * get 毛利率预测
     *
     * @return
     */
    public String getGrossMarginForecast() {
        return grossMarginForecast;
    }

    /**
     * set 毛利率预测
     *
     * @param grossMarginForecast
     */
    public void setGrossMarginForecast(String grossMarginForecast) {
        this.grossMarginForecast = grossMarginForecast;
    }


    /**
     * get 定价策略 1市场对标， 2总成本加成，3变动成本加成
     *
     * @return
     */
    public Integer getPricingStrategy() {
        return pricingStrategy;
    }

    /**
     * set 定价策略 1市场对标， 2总成本加成，3变动成本加成
     *
     * @param pricingStrategy
     */
    public void setPricingStrategy(Integer pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }


    /**
     * get 定价策略名称 1市场对标， 2总成本加成，3变动成本加成
     *
     * @return
     */
    public String getPricingStrategyName() {
        return pricingStrategyName;
    }

    /**
     * set 定价策略名称 1市场对标， 2总成本加成，3变动成本加成
     *
     * @param pricingStrategyName
     */
    public void setPricingStrategyName(String pricingStrategyName) {
        this.pricingStrategyName = pricingStrategyName;
    }


    /**
     * get 结算方式 1固定金额结算，2实际售价固定比例结算，3实际售价浮动比例结算
     *
     * @return
     */
    public Integer getSettlementMode() {
        return settlementMode;
    }

    /**
     * set 结算方式 1固定金额结算，2实际售价固定比例结算，3实际售价浮动比例结算
     *
     * @param settlementMode
     */
    public void setSettlementMode(Integer settlementMode) {
        this.settlementMode = settlementMode;
    }


    /**
     * get 结算方式名称 1固定金额结算，2实际售价固定比例结算，3实际售价浮动比例结算
     *
     * @return
     */
    public String getSettlementModeName() {
        return settlementModeName;
    }

    /**
     * set 结算方式名称 1固定金额结算，2实际售价固定比例结算，3实际售价浮动比例结算
     *
     * @param settlementModeName
     */
    public void setSettlementModeName(String settlementModeName) {
        this.settlementModeName = settlementModeName;
    }


    /**
     * get 结算周期 1周结后付款、2月结后付款、3季结后付款、4年结后付款，5 PO预付款
     *
     * @return
     */
    public Integer getSettlementCycle() {
        return settlementCycle;
    }

    /**
     * set 结算周期 1周结后付款、2月结后付款、3季结后付款、4年结后付款，5 PO预付款
     *
     * @param settlementCycle
     */
    public void setSettlementCycle(Integer settlementCycle) {
        this.settlementCycle = settlementCycle;
    }


    /**
     * get 结算周期名称 1周结后付款、2月结后付款、3季结后付款、4年结后付款，5 PO预付款
     *
     * @return
     */
    public String getSettlementCycleName() {
        return settlementCycleName;
    }

    /**
     * set 结算周期名称 1周结后付款、2月结后付款、3季结后付款、4年结后付款，5 PO预付款
     *
     * @param settlementCycleName
     */
    public void setSettlementCycleName(String settlementCycleName) {
        this.settlementCycleName = settlementCycleName;
    }


    /**
     * get 风险及建议
     *
     * @return
     */
    public String getRiskSuggestion() {
        return riskSuggestion;
    }

    /**
     * set 风险及建议
     *
     * @param riskSuggestion
     */
    public void setRiskSuggestion(String riskSuggestion) {
        this.riskSuggestion = riskSuggestion;
    }


    /**
     * get 产品唯一标识id
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set 产品唯一标识id
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    /**
    * get 合作公司
    *
    * @return
    */
    public List<CooperationCompanyVo> getCooperationCompanys() {
        return cooperationCompanys;
    }

    /**
    * set 合作公司
    *
    * @param cooperationCompanys
    */
    public void setCooperationCompanys(List<CooperationCompanyVo> cooperationCompanys) {
        this.cooperationCompanys = cooperationCompanys;
    }



    /**
     * set 主键id
     *
     * @param id
     */
    public CoProductDetailVo id(String id) {
        this.id = id;
        return this;
    }


    /**
     * set 合作id
     *
     * @param cooperationId
     */
    public CoProductDetailVo cooperationId(String cooperationId) {
        this.cooperationId = cooperationId;
        return this;
    }


    /**
     * set 合作产品名称
     *
     * @param productName
     */
    public CoProductDetailVo productName(String productName) {
        this.productName = productName;
        return this;
    }


    /**
     * set 合作名称
     *
     * @param name
     */
    public CoProductDetailVo name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 合作伙伴公司名称
     *
     * @param companyName
     */
    public CoProductDetailVo companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }


    /**
    * set 合作对接人列表
    *
    * @param brokers
    */
    public CoProductDetailVo brokers(List<Broker> brokers) {
        this.brokers = brokers;
        return this;
    }


    /**
    * set 合同信息
    *
    * @param contractInfos
    */
    public CoProductDetailVo contractInfos(List<Contract> contractInfos) {
        this.contractInfos = contractInfos;
        return this;
    }


    /**
     * set 产品类型
     *
     * @param productType
     */
    public CoProductDetailVo productType(Integer productType) {
        this.productType = productType;
        return this;
    }


    /**
     * set 产品类型名称
     *
     * @param productTypeName
     */
    public CoProductDetailVo productTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
        return this;
    }


    /**
     * set 产品模式
     *
     * @param productMode
     */
    public CoProductDetailVo productMode(Integer productMode) {
        this.productMode = productMode;
        return this;
    }


    /**
     * set 产品模式名称
     *
     * @param productModeName
     */
    public CoProductDetailVo productModeName(String productModeName) {
        this.productModeName = productModeName;
        return this;
    }


    /**
     * set 产品简介
     *
     * @param productDesc
     */
    public CoProductDetailVo productDesc(String productDesc) {
        this.productDesc = productDesc;
        return this;
    }


    /**
     * set 目标客户
     *
     * @param targetCustomer
     */
    public CoProductDetailVo targetCustomer(String targetCustomer) {
        this.targetCustomer = targetCustomer;
        return this;
    }


    /**
     * set 市场规模
     *
     * @param marketSize
     */
    public CoProductDetailVo marketSize(String marketSize) {
        this.marketSize = marketSize;
        return this;
    }


    /**
     * set 主要竞品
     *
     * @param comparableProduct
     */
    public CoProductDetailVo comparableProduct(String comparableProduct) {
        this.comparableProduct = comparableProduct;
        return this;
    }


    /**
     * set 售卖形态  1套/n年、2套/n月、3套、4次
     *
     * @param sellingForm
     */
    public CoProductDetailVo sellingForm(Integer sellingForm) {
        this.sellingForm = sellingForm;
        return this;
    }


    /**
     * set 售卖形态名称  1套/n年、2套/n月、3套、4次
     *
     * @param sellingFormName
     */
    public CoProductDetailVo sellingFormName(String sellingFormName) {
        this.sellingFormName = sellingFormName;
        return this;
    }


    /**
    * set 售卖方式说明
    *
    * @param sellingModes
    */
    public CoProductDetailVo sellingModes(List<KeyValVo> sellingModes) {
        this.sellingModes = sellingModes;
        return this;
    }


    /**
     * set 定价
     *
     * @param pricing
     */
    public CoProductDetailVo pricing(String pricing) {
        this.pricing = pricing;
        return this;
    }


    /**
     * set 产品状态
     *
     * @param productStatus
     */
    public CoProductDetailVo productStatus(Integer productStatus) {
        this.productStatus = productStatus;
        return this;
    }


    /**
     * set 产品状态名称
     *
     * @param productStatusName
     */
    public CoProductDetailVo productStatusName(Integer productStatusName) {
        this.productStatusName = productStatusName;
        return this;
    }


    /**
     * set 收入预测
     *
     * @param incomeForecast
     */
    public CoProductDetailVo incomeForecast(String incomeForecast) {
        this.incomeForecast = incomeForecast;
        return this;
    }


    /**
     * set 成本结构
     *
     * @param costStructure
     */
    public CoProductDetailVo costStructure(String costStructure) {
        this.costStructure = costStructure;
        return this;
    }


    /**
     * set 毛利率预测
     *
     * @param grossMarginForecast
     */
    public CoProductDetailVo grossMarginForecast(String grossMarginForecast) {
        this.grossMarginForecast = grossMarginForecast;
        return this;
    }


    /**
     * set 定价策略 1市场对标， 2总成本加成，3变动成本加成
     *
     * @param pricingStrategy
     */
    public CoProductDetailVo pricingStrategy(Integer pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
        return this;
    }


    /**
     * set 定价策略名称 1市场对标， 2总成本加成，3变动成本加成
     *
     * @param pricingStrategyName
     */
    public CoProductDetailVo pricingStrategyName(String pricingStrategyName) {
        this.pricingStrategyName = pricingStrategyName;
        return this;
    }


    /**
     * set 结算方式 1固定金额结算，2实际售价固定比例结算，3实际售价浮动比例结算
     *
     * @param settlementMode
     */
    public CoProductDetailVo settlementMode(Integer settlementMode) {
        this.settlementMode = settlementMode;
        return this;
    }


    /**
     * set 结算方式名称 1固定金额结算，2实际售价固定比例结算，3实际售价浮动比例结算
     *
     * @param settlementModeName
     */
    public CoProductDetailVo settlementModeName(String settlementModeName) {
        this.settlementModeName = settlementModeName;
        return this;
    }


    /**
     * set 结算周期 1周结后付款、2月结后付款、3季结后付款、4年结后付款，5 PO预付款
     *
     * @param settlementCycle
     */
    public CoProductDetailVo settlementCycle(Integer settlementCycle) {
        this.settlementCycle = settlementCycle;
        return this;
    }


    /**
     * set 结算周期名称 1周结后付款、2月结后付款、3季结后付款、4年结后付款，5 PO预付款
     *
     * @param settlementCycleName
     */
    public CoProductDetailVo settlementCycleName(String settlementCycleName) {
        this.settlementCycleName = settlementCycleName;
        return this;
    }


    /**
     * set 风险及建议
     *
     * @param riskSuggestion
     */
    public CoProductDetailVo riskSuggestion(String riskSuggestion) {
        this.riskSuggestion = riskSuggestion;
        return this;
    }


    /**
     * set 产品唯一标识id
     *
     * @param uuid
     */
    public CoProductDetailVo uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }


    /**
    * set 合作公司
    *
    * @param cooperationCompanys
    */
    public CoProductDetailVo cooperationCompanys(List<CooperationCompanyVo> cooperationCompanys) {
        this.cooperationCompanys = cooperationCompanys;
        return this;
    }



    /**
     * add item to 合作对接人列表
     *
     * @param broker
     */
    public void addBroker(Broker broker) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(broker);
    }

    /**
     * add item to 合同信息
     *
     * @param contractInfo
     */
    public void addContractInfo(Contract contractInfo) {
        if (this.contractInfos == null) {
            this.contractInfos = new ArrayList<>();
        }
        this.contractInfos.add(contractInfo);
    }

    /**
     * add item to 售卖方式说明
     *
     * @param sellingMode
     */
    public void addSellingMode(KeyValVo sellingMode) {
        if (this.sellingModes == null) {
            this.sellingModes = new ArrayList<>();
        }
        this.sellingModes.add(sellingMode);
    }

    /**
     * add item to 合作公司
     *
     * @param cooperationCompany
     */
    public void addCooperationCompany(CooperationCompanyVo cooperationCompany) {
        if (this.cooperationCompanys == null) {
            this.cooperationCompanys = new ArrayList<>();
        }
        this.cooperationCompanys.add(cooperationCompany);
    }
}