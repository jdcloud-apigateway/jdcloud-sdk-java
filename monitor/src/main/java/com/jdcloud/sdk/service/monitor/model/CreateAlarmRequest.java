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
 * Monitoring Rules APIs
 * 云监控规则相关接口，提供创建、查询、修改、删除监控规则等功能
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.monitor.model.BaseContact;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.monitor.model.WebHookOption;
import com.jdcloud.sdk.service.monitor.model.NoticeOption;
import com.jdcloud.sdk.service.monitor.model.ResourceOption;
import com.jdcloud.sdk.service.monitor.model.RuleOption;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建报警规则
 */
public class CreateAlarmRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 弹性伸缩组Id。注：仅ag\asg产品线内部使用
     */
    private String autoScalingPolicyId;

    /**
     * 告警通知联系人
     */
    private List<BaseContact> baseContact;

    /**
     * 幂等性校验参数,最长36位,若两个请求clientToken相等，则返回第一次创建的规则id，只创建一次规则
     * Required:true
     */
    @Required
    private String clientToken;

    /**
     * 数据所有者，1云监控控制台; 2云鼎。默认为1
     */
    private Long dataOwner;

    /**
     * 资源维度，可用的维度请使用 describeProductsForAlarm接口查询
     */
    private String dimension;

    /**
     * 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     */
    private Long enabled;

    /**
     * url回调设置数组
     */
    private List<WebHookOption> multiWebHook;

    /**
     * 通知策略
     */
    private List<NoticeOption> noticeOption;

    /**
     * 资源类型, 可用的资源类型列表请使用 describeProductsForAlarm接口查询。
     * Required:true
     */
    @Required
    private String product;

    /**
     * resourceOption
     * Required:true
     */
    @Required
    private ResourceOption resourceOption;

    /**
     * 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     * Required:true
     */
    @Required
    private String ruleName;

    /**
     * ruleOption
     * Required:true
     */
    @Required
    private RuleOption ruleOption;

    /**
     * 规则类型, 默认为resourceMonitor
     */
    private String ruleType;

    /**
     * 资源维度，指定监控数据实例的维度标签,如resourceId&#x3D;id。(请确认资源的监控数据带有该标签，否则规则会报数据不足)
     */
    private Object tags;

    /**
     * webHookOption
     */
    private WebHookOption webHookOption;


    /**
     * get 弹性伸缩组Id。注：仅ag\asg产品线内部使用
     *
     * @return
     */
    public String getAutoScalingPolicyId() {
        return autoScalingPolicyId;
    }

    /**
     * set 弹性伸缩组Id。注：仅ag\asg产品线内部使用
     *
     * @param autoScalingPolicyId
     */
    public void setAutoScalingPolicyId(String autoScalingPolicyId) {
        this.autoScalingPolicyId = autoScalingPolicyId;
    }

    /**
     * get 告警通知联系人
     *
     * @return
     */
    public List<BaseContact> getBaseContact() {
        return baseContact;
    }

    /**
     * set 告警通知联系人
     *
     * @param baseContact
     */
    public void setBaseContact(List<BaseContact> baseContact) {
        this.baseContact = baseContact;
    }

    /**
     * get 幂等性校验参数,最长36位,若两个请求clientToken相等，则返回第一次创建的规则id，只创建一次规则
     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 幂等性校验参数,最长36位,若两个请求clientToken相等，则返回第一次创建的规则id，只创建一次规则
     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * get 数据所有者，1云监控控制台; 2云鼎。默认为1
     *
     * @return
     */
    public Long getDataOwner() {
        return dataOwner;
    }

    /**
     * set 数据所有者，1云监控控制台; 2云鼎。默认为1
     *
     * @param dataOwner
     */
    public void setDataOwner(Long dataOwner) {
        this.dataOwner = dataOwner;
    }

    /**
     * get 资源维度，可用的维度请使用 describeProductsForAlarm接口查询
     *
     * @return
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * set 资源维度，可用的维度请使用 describeProductsForAlarm接口查询
     *
     * @param dimension
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * get 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @return
     */
    public Long getEnabled() {
        return enabled;
    }

    /**
     * set 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @param enabled
     */
    public void setEnabled(Long enabled) {
        this.enabled = enabled;
    }

    /**
     * get url回调设置数组
     *
     * @return
     */
    public List<WebHookOption> getMultiWebHook() {
        return multiWebHook;
    }

    /**
     * set url回调设置数组
     *
     * @param multiWebHook
     */
    public void setMultiWebHook(List<WebHookOption> multiWebHook) {
        this.multiWebHook = multiWebHook;
    }

    /**
     * get 通知策略
     *
     * @return
     */
    public List<NoticeOption> getNoticeOption() {
        return noticeOption;
    }

    /**
     * set 通知策略
     *
     * @param noticeOption
     */
    public void setNoticeOption(List<NoticeOption> noticeOption) {
        this.noticeOption = noticeOption;
    }

    /**
     * get 资源类型, 可用的资源类型列表请使用 describeProductsForAlarm接口查询。
     *
     * @return
     */
    public String getProduct() {
        return product;
    }

    /**
     * set 资源类型, 可用的资源类型列表请使用 describeProductsForAlarm接口查询。
     *
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * get resourceOption
     *
     * @return
     */
    public ResourceOption getResourceOption() {
        return resourceOption;
    }

    /**
     * set resourceOption
     *
     * @param resourceOption
     */
    public void setResourceOption(ResourceOption resourceOption) {
        this.resourceOption = resourceOption;
    }

    /**
     * get 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @return
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * set 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @param ruleName
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * get ruleOption
     *
     * @return
     */
    public RuleOption getRuleOption() {
        return ruleOption;
    }

    /**
     * set ruleOption
     *
     * @param ruleOption
     */
    public void setRuleOption(RuleOption ruleOption) {
        this.ruleOption = ruleOption;
    }

    /**
     * get 规则类型, 默认为resourceMonitor
     *
     * @return
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * set 规则类型, 默认为resourceMonitor
     *
     * @param ruleType
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * get 资源维度，指定监控数据实例的维度标签,如resourceId&#x3D;id。(请确认资源的监控数据带有该标签，否则规则会报数据不足)
     *
     * @return
     */
    public Object getTags() {
        return tags;
    }

    /**
     * set 资源维度，指定监控数据实例的维度标签,如resourceId&#x3D;id。(请确认资源的监控数据带有该标签，否则规则会报数据不足)
     *
     * @param tags
     */
    public void setTags(Object tags) {
        this.tags = tags;
    }

    /**
     * get webHookOption
     *
     * @return
     */
    public WebHookOption getWebHookOption() {
        return webHookOption;
    }

    /**
     * set webHookOption
     *
     * @param webHookOption
     */
    public void setWebHookOption(WebHookOption webHookOption) {
        this.webHookOption = webHookOption;
    }


    /**
     * set 弹性伸缩组Id。注：仅ag\asg产品线内部使用
     *
     * @param autoScalingPolicyId
     */
    public CreateAlarmRequest autoScalingPolicyId(String autoScalingPolicyId) {
        this.autoScalingPolicyId = autoScalingPolicyId;
        return this;
    }

    /**
     * set 告警通知联系人
     *
     * @param baseContact
     */
    public CreateAlarmRequest baseContact(List<BaseContact> baseContact) {
        this.baseContact = baseContact;
        return this;
    }

    /**
     * set 幂等性校验参数,最长36位,若两个请求clientToken相等，则返回第一次创建的规则id，只创建一次规则
     *
     * @param clientToken
     */
    public CreateAlarmRequest clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set 数据所有者，1云监控控制台; 2云鼎。默认为1
     *
     * @param dataOwner
     */
    public CreateAlarmRequest dataOwner(Long dataOwner) {
        this.dataOwner = dataOwner;
        return this;
    }

    /**
     * set 资源维度，可用的维度请使用 describeProductsForAlarm接口查询
     *
     * @param dimension
     */
    public CreateAlarmRequest dimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * set 是否启用, 1表示启用规则，0表示禁用规则，默认为1
     *
     * @param enabled
     */
    public CreateAlarmRequest enabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set url回调设置数组
     *
     * @param multiWebHook
     */
    public CreateAlarmRequest multiWebHook(List<WebHookOption> multiWebHook) {
        this.multiWebHook = multiWebHook;
        return this;
    }

    /**
     * set 通知策略
     *
     * @param noticeOption
     */
    public CreateAlarmRequest noticeOption(List<NoticeOption> noticeOption) {
        this.noticeOption = noticeOption;
        return this;
    }

    /**
     * set 资源类型, 可用的资源类型列表请使用 describeProductsForAlarm接口查询。
     *
     * @param product
     */
    public CreateAlarmRequest product(String product) {
        this.product = product;
        return this;
    }

    /**
     * set resourceOption
     *
     * @param resourceOption
     */
    public CreateAlarmRequest resourceOption(ResourceOption resourceOption) {
        this.resourceOption = resourceOption;
        return this;
    }

    /**
     * set 规则名称，规则名称，最大长度42个字符，只允许中英文、数字、&#39;&#39;-&#39;&#39;和&quot;_&quot;
     *
     * @param ruleName
     */
    public CreateAlarmRequest ruleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * set ruleOption
     *
     * @param ruleOption
     */
    public CreateAlarmRequest ruleOption(RuleOption ruleOption) {
        this.ruleOption = ruleOption;
        return this;
    }

    /**
     * set 规则类型, 默认为resourceMonitor
     *
     * @param ruleType
     */
    public CreateAlarmRequest ruleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * set 资源维度，指定监控数据实例的维度标签,如resourceId&#x3D;id。(请确认资源的监控数据带有该标签，否则规则会报数据不足)
     *
     * @param tags
     */
    public CreateAlarmRequest tags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set webHookOption
     *
     * @param webHookOption
     */
    public CreateAlarmRequest webHookOption(WebHookOption webHookOption) {
        this.webHookOption = webHookOption;
        return this;
    }


    /**
     * add item to 告警通知联系人
     *
     * @param baseContact
     */
    public void addBaseContact(BaseContact baseContact) {
        if (this.baseContact == null) {
            this.baseContact = new ArrayList<>();
        }
        this.baseContact.add(baseContact);
    }

    /**
     * add item to url回调设置数组
     *
     * @param multiWebHook
     */
    public void addMultiWebHook(WebHookOption multiWebHook) {
        if (this.multiWebHook == null) {
            this.multiWebHook = new ArrayList<>();
        }
        this.multiWebHook.add(multiWebHook);
    }

    /**
     * add item to 通知策略
     *
     * @param noticeOption
     */
    public void addNoticeOption(NoticeOption noticeOption) {
        if (this.noticeOption == null) {
            this.noticeOption = new ArrayList<>();
        }
        this.noticeOption.add(noticeOption);
    }

}