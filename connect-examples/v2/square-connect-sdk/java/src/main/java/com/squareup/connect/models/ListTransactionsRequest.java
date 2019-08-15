/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defines the query parameters that can be included in a request to the [ListTransactions](#endpoint-listtransactions) endpoint.  Deprecated - recommend using [SearchOrders](#endpoint-orders-searchorders)
 */
@ApiModel(description = "Defines the query parameters that can be included in a request to the [ListTransactions](#endpoint-listtransactions) endpoint.  Deprecated - recommend using [SearchOrders](#endpoint-orders-searchorders)")

public class ListTransactionsRequest {
  @JsonProperty("begin_time")
  private String beginTime = null;

  @JsonProperty("end_time")
  private String endTime = null;

  @JsonProperty("sort_order")
  private String sortOrder = null;

  @JsonProperty("cursor")
  private String cursor = null;

  public ListTransactionsRequest beginTime(String beginTime) {
    this.beginTime = beginTime;
    return this;
  }

   /**
   * The beginning of the requested reporting period, in RFC 3339 format.  See [Date ranges](#dateranges) for details on date inclusivity/exclusivity.  Default value: The current time minus one year.
   * @return beginTime
  **/
  @ApiModelProperty(value = "The beginning of the requested reporting period, in RFC 3339 format.  See [Date ranges](#dateranges) for details on date inclusivity/exclusivity.  Default value: The current time minus one year.")
  public String getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(String beginTime) {
    this.beginTime = beginTime;
  }

  public ListTransactionsRequest endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The end of the requested reporting period, in RFC 3339 format.  See [Date ranges](#dateranges) for details on date inclusivity/exclusivity.  Default value: The current time.
   * @return endTime
  **/
  @ApiModelProperty(value = "The end of the requested reporting period, in RFC 3339 format.  See [Date ranges](#dateranges) for details on date inclusivity/exclusivity.  Default value: The current time.")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public ListTransactionsRequest sortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * The order in which results are listed in the response (`ASC` for oldest first, `DESC` for newest first).  Default value: `DESC` See [SortOrder](#type-sortorder) for possible values
   * @return sortOrder
  **/
  @ApiModelProperty(value = "The order in which results are listed in the response (`ASC` for oldest first, `DESC` for newest first).  Default value: `DESC` See [SortOrder](#type-sortorder) for possible values")
  public String getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }

  public ListTransactionsRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for your original query.  See [Pagination](/basics/api101/pagination) for more information.
   * @return cursor
  **/
  @ApiModelProperty(value = "A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for your original query.  See [Pagination](/basics/api101/pagination) for more information.")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTransactionsRequest listTransactionsRequest = (ListTransactionsRequest) o;
    return Objects.equals(this.beginTime, listTransactionsRequest.beginTime) &&
        Objects.equals(this.endTime, listTransactionsRequest.endTime) &&
        Objects.equals(this.sortOrder, listTransactionsRequest.sortOrder) &&
        Objects.equals(this.cursor, listTransactionsRequest.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginTime, endTime, sortOrder, cursor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsRequest {\n");

    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

