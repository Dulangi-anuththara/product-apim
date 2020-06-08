/*
 * WSO2 API Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.5.176/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.admin.api.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.wso2.am.integration.clients.admin.api.dto.CustomAttributeDTO;
import org.wso2.am.integration.clients.admin.api.dto.GraphQLQueryDTO;
import org.wso2.am.integration.clients.admin.api.dto.MonetizationInfoDTO;
import org.wso2.am.integration.clients.admin.api.dto.ThrottleLimitTypeDTO;
import org.wso2.am.integration.clients.admin.api.dto.ThrottlePolicyDTO;

/**
 * SubscriptionThrottlePolicyDTO
 */

public class SubscriptionThrottlePolicyDTO extends ThrottlePolicyDTO {
  @SerializedName("graphQLMaxComplexity")
  private Integer graphQLMaxComplexity = null;

  @SerializedName("graphQLMaxDepth")
  private Integer graphQLMaxDepth = null;

  @SerializedName("defaultLimit")
  private ThrottleLimitTypeDTO defaultLimit = null;

  @SerializedName("monetization")
  private MonetizationInfoDTO monetization = null;

  @SerializedName("rateLimitCount")
  private Integer rateLimitCount = null;

  @SerializedName("rateLimitTimeUnit")
  private String rateLimitTimeUnit = null;

  @SerializedName("customAttributes")
  private List<CustomAttributeDTO> customAttributes = null;

  @SerializedName("stopOnQuotaReach")
  private Boolean stopOnQuotaReach = false;

  @SerializedName("billingPlan")
  private String billingPlan = null;

  public SubscriptionThrottlePolicyDTO graphQLMaxComplexity(Integer graphQLMaxComplexity) {
    this.graphQLMaxComplexity = graphQLMaxComplexity;
    return this;
  }

   /**
   * Maximum Complexity of the GraphQL query
   * @return graphQLMaxComplexity
  **/
  @ApiModelProperty(example = "400", value = "Maximum Complexity of the GraphQL query")
  public Integer getGraphQLMaxComplexity() {
    return graphQLMaxComplexity;
  }

  public void setGraphQLMaxComplexity(Integer graphQLMaxComplexity) {
    this.graphQLMaxComplexity = graphQLMaxComplexity;
  }

  public SubscriptionThrottlePolicyDTO graphQLMaxDepth(Integer graphQLMaxDepth) {
    this.graphQLMaxDepth = graphQLMaxDepth;
    return this;
  }

   /**
   * Maximum Depth of the GraphQL query
   * @return graphQLMaxDepth
  **/
  @ApiModelProperty(example = "10", value = "Maximum Depth of the GraphQL query")
  public Integer getGraphQLMaxDepth() {
    return graphQLMaxDepth;
  }

  public void setGraphQLMaxDepth(Integer graphQLMaxDepth) {
    this.graphQLMaxDepth = graphQLMaxDepth;
  }

  public SubscriptionThrottlePolicyDTO defaultLimit(ThrottleLimitTypeDTO defaultLimit) {
    this.defaultLimit = defaultLimit;
    return this;
  }

   /**
   * Get defaultLimit
   * @return defaultLimit
  **/
  @ApiModelProperty(value = "")
  public ThrottleLimitTypeDTO getDefaultLimit() {
    return defaultLimit;
  }

  public void setDefaultLimit(ThrottleLimitTypeDTO defaultLimit) {
    this.defaultLimit = defaultLimit;
  }

  public SubscriptionThrottlePolicyDTO monetization(MonetizationInfoDTO monetization) {
    this.monetization = monetization;
    return this;
  }

   /**
   * Get monetization
   * @return monetization
  **/
  @ApiModelProperty(value = "")
  public MonetizationInfoDTO getMonetization() {
    return monetization;
  }

  public void setMonetization(MonetizationInfoDTO monetization) {
    this.monetization = monetization;
  }

  public SubscriptionThrottlePolicyDTO rateLimitCount(Integer rateLimitCount) {
    this.rateLimitCount = rateLimitCount;
    return this;
  }

   /**
   * Burst control request count
   * @return rateLimitCount
  **/
  @ApiModelProperty(example = "10", value = "Burst control request count")
  public Integer getRateLimitCount() {
    return rateLimitCount;
  }

  public void setRateLimitCount(Integer rateLimitCount) {
    this.rateLimitCount = rateLimitCount;
  }

  public SubscriptionThrottlePolicyDTO rateLimitTimeUnit(String rateLimitTimeUnit) {
    this.rateLimitTimeUnit = rateLimitTimeUnit;
    return this;
  }

   /**
   * Burst control time unit
   * @return rateLimitTimeUnit
  **/
  @ApiModelProperty(value = "Burst control time unit")
  public String getRateLimitTimeUnit() {
    return rateLimitTimeUnit;
  }

  public void setRateLimitTimeUnit(String rateLimitTimeUnit) {
    this.rateLimitTimeUnit = rateLimitTimeUnit;
  }

  public SubscriptionThrottlePolicyDTO customAttributes(List<CustomAttributeDTO> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  public SubscriptionThrottlePolicyDTO addCustomAttributesItem(CustomAttributeDTO customAttributesItem) {
    if (this.customAttributes == null) {
      this.customAttributes = new ArrayList<>();
    }
    this.customAttributes.add(customAttributesItem);
    return this;
  }

   /**
   * Custom attributes added to the Subscription Throttling Policy 
   * @return customAttributes
  **/
  @ApiModelProperty(example = "{}", value = "Custom attributes added to the Subscription Throttling Policy ")
  public List<CustomAttributeDTO> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<CustomAttributeDTO> customAttributes) {
    this.customAttributes = customAttributes;
  }

  public SubscriptionThrottlePolicyDTO stopOnQuotaReach(Boolean stopOnQuotaReach) {
    this.stopOnQuotaReach = stopOnQuotaReach;
    return this;
  }

   /**
   * This indicates the action to be taken when a user goes beyond the allocated quota. If checked, the user&#39;s requests will be dropped. If unchecked, the requests will be allowed to pass through. 
   * @return stopOnQuotaReach
  **/
  @ApiModelProperty(value = "This indicates the action to be taken when a user goes beyond the allocated quota. If checked, the user's requests will be dropped. If unchecked, the requests will be allowed to pass through. ")
  public Boolean isStopOnQuotaReach() {
    return stopOnQuotaReach;
  }

  public void setStopOnQuotaReach(Boolean stopOnQuotaReach) {
    this.stopOnQuotaReach = stopOnQuotaReach;
  }

  public SubscriptionThrottlePolicyDTO billingPlan(String billingPlan) {
    this.billingPlan = billingPlan;
    return this;
  }

   /**
   * define whether this is Paid or a Free plan. Allowed values are FREE or COMMERCIAL. 
   * @return billingPlan
  **/
  @ApiModelProperty(value = "define whether this is Paid or a Free plan. Allowed values are FREE or COMMERCIAL. ")
  public String getBillingPlan() {
    return billingPlan;
  }

  public void setBillingPlan(String billingPlan) {
    this.billingPlan = billingPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionThrottlePolicyDTO subscriptionThrottlePolicy = (SubscriptionThrottlePolicyDTO) o;
    return Objects.equals(this.graphQLMaxComplexity, subscriptionThrottlePolicy.graphQLMaxComplexity) &&
        Objects.equals(this.graphQLMaxDepth, subscriptionThrottlePolicy.graphQLMaxDepth) &&
        Objects.equals(this.defaultLimit, subscriptionThrottlePolicy.defaultLimit) &&
        Objects.equals(this.monetization, subscriptionThrottlePolicy.monetization) &&
        Objects.equals(this.rateLimitCount, subscriptionThrottlePolicy.rateLimitCount) &&
        Objects.equals(this.rateLimitTimeUnit, subscriptionThrottlePolicy.rateLimitTimeUnit) &&
        Objects.equals(this.customAttributes, subscriptionThrottlePolicy.customAttributes) &&
        Objects.equals(this.stopOnQuotaReach, subscriptionThrottlePolicy.stopOnQuotaReach) &&
        Objects.equals(this.billingPlan, subscriptionThrottlePolicy.billingPlan) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graphQLMaxComplexity, graphQLMaxDepth, defaultLimit, monetization, rateLimitCount, rateLimitTimeUnit, customAttributes, stopOnQuotaReach, billingPlan, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionThrottlePolicyDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    graphQLMaxComplexity: ").append(toIndentedString(graphQLMaxComplexity)).append("\n");
    sb.append("    graphQLMaxDepth: ").append(toIndentedString(graphQLMaxDepth)).append("\n");
    sb.append("    defaultLimit: ").append(toIndentedString(defaultLimit)).append("\n");
    sb.append("    monetization: ").append(toIndentedString(monetization)).append("\n");
    sb.append("    rateLimitCount: ").append(toIndentedString(rateLimitCount)).append("\n");
    sb.append("    rateLimitTimeUnit: ").append(toIndentedString(rateLimitTimeUnit)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    stopOnQuotaReach: ").append(toIndentedString(stopOnQuotaReach)).append("\n");
    sb.append("    billingPlan: ").append(toIndentedString(billingPlan)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

