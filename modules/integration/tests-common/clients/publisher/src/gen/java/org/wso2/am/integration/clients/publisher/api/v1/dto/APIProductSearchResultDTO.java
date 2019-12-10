/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

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
import org.wso2.am.integration.clients.publisher.api.v1.dto.SearchResultDTO;

/**
 * APIProductSearchResultDTO
 */

public class APIProductSearchResultDTO extends SearchResultDTO {
  @SerializedName("description")
  private String description = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("thumbnailUri")
  private String thumbnailUri = null;

  public APIProductSearchResultDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A brief description about the API
   * @return description
  **/
  @ApiModelProperty(example = "A calculator API that supports basic operations", value = "A brief description about the API")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public APIProductSearchResultDTO context(String context) {
    this.context = context;
    return this;
  }

   /**
   * A string that represents the context of the user&#39;s request
   * @return context
  **/
  @ApiModelProperty(example = "CalculatorAPI", value = "A string that represents the context of the user's request")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public APIProductSearchResultDTO provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * If the provider value is not given, the user invoking the API will be used as the provider. 
   * @return provider
  **/
  @ApiModelProperty(example = "admin", value = "If the provider value is not given, the user invoking the API will be used as the provider. ")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public APIProductSearchResultDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * This describes in which status of the lifecycle the APIPRODUCT is
   * @return status
  **/
  @ApiModelProperty(example = "PUBLISHED", value = "This describes in which status of the lifecycle the APIPRODUCT is")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public APIProductSearchResultDTO thumbnailUri(String thumbnailUri) {
    this.thumbnailUri = thumbnailUri;
    return this;
  }

   /**
   * Get thumbnailUri
   * @return thumbnailUri
  **/
  @ApiModelProperty(example = "/apis/01234567-0123-0123-0123-012345678901/thumbnail", value = "")
  public String getThumbnailUri() {
    return thumbnailUri;
  }

  public void setThumbnailUri(String thumbnailUri) {
    this.thumbnailUri = thumbnailUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIProductSearchResultDTO apIProductSearchResult = (APIProductSearchResultDTO) o;
    return Objects.equals(this.description, apIProductSearchResult.description) &&
        Objects.equals(this.context, apIProductSearchResult.context) &&
        Objects.equals(this.provider, apIProductSearchResult.provider) &&
        Objects.equals(this.status, apIProductSearchResult.status) &&
        Objects.equals(this.thumbnailUri, apIProductSearchResult.thumbnailUri) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, context, provider, status, thumbnailUri, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIProductSearchResultDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thumbnailUri: ").append(toIndentedString(thumbnailUri)).append("\n");
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

