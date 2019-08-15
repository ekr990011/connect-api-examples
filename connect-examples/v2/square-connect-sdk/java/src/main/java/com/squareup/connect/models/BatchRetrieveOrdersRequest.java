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
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the fields that are included in requests to the BatchRetrieveOrders endpoint.
 */
@ApiModel(description = "Defines the fields that are included in requests to the BatchRetrieveOrders endpoint.")

public class BatchRetrieveOrdersRequest {
  @JsonProperty("order_ids")
  private List<String> orderIds = new ArrayList<String>();

  public BatchRetrieveOrdersRequest orderIds(List<String> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public BatchRetrieveOrdersRequest addOrderIdsItem(String orderIdsItem) {
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * The IDs of the orders to retrieve. A maximum of 100 orders can be retrieved per request.
   * @return orderIds
  **/
  @ApiModelProperty(required = true, value = "The IDs of the orders to retrieve. A maximum of 100 orders can be retrieved per request.")
  public List<String> getOrderIds() {
    return orderIds;
  }

  public void setOrderIds(List<String> orderIds) {
    this.orderIds = orderIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRetrieveOrdersRequest batchRetrieveOrdersRequest = (BatchRetrieveOrdersRequest) o;
    return Objects.equals(this.orderIds, batchRetrieveOrdersRequest.orderIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRetrieveOrdersRequest {\n");

    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
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

