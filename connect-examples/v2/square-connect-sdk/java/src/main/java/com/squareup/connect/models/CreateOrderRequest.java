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
import com.squareup.connect.models.CreateOrderRequestDiscount;
import com.squareup.connect.models.CreateOrderRequestLineItem;
import com.squareup.connect.models.CreateOrderRequestTax;
import com.squareup.connect.models.Order;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@ApiModel(description = "")

public class CreateOrderRequest {
  @JsonProperty("order")
  private Order order = null;

  @JsonProperty("idempotency_key")
  private String idempotencyKey = null;

  @JsonProperty("reference_id")
  private String referenceId = null;

  @JsonProperty("line_items")
  private List<CreateOrderRequestLineItem> lineItems = new ArrayList<CreateOrderRequestLineItem>();

  @JsonProperty("taxes")
  private List<CreateOrderRequestTax> taxes = new ArrayList<CreateOrderRequestTax>();

  @JsonProperty("discounts")
  private List<CreateOrderRequestDiscount> discounts = new ArrayList<CreateOrderRequestDiscount>();

  public CreateOrderRequest order(Order order) {
    this.order = order;
    return this;
  }

   /**
   * The order to create. If this field is set, then the only other top-level field that can be set is the idempotency_key.
   * @return order
  **/
  @ApiModelProperty(value = "The order to create. If this field is set, then the only other top-level field that can be set is the idempotency_key.")
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public CreateOrderRequest idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A value you specify that uniquely identifies this order among orders you've created.  If you're unsure whether a particular order was created successfully, you can reattempt it with the same idempotency key without worrying about creating duplicate orders.  See [Idempotency](/basics/api101/idempotency) for more information.
   * @return idempotencyKey
  **/
  @ApiModelProperty(value = "A value you specify that uniquely identifies this order among orders you've created.  If you're unsure whether a particular order was created successfully, you can reattempt it with the same idempotency key without worrying about creating duplicate orders.  See [Idempotency](/basics/api101/idempotency) for more information.")
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  public CreateOrderRequest referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * __Deprecated__: Please set the reference_id on the nested [order](#type-order) field instead.  An optional ID you can associate with the order for your own purposes (such as to associate the order with an entity ID in your own database).  This value cannot exceed 40 characters.
   * @return referenceId
  **/
  @ApiModelProperty(value = "__Deprecated__: Please set the reference_id on the nested [order](#type-order) field instead.  An optional ID you can associate with the order for your own purposes (such as to associate the order with an entity ID in your own database).  This value cannot exceed 40 characters.")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public CreateOrderRequest lineItems(List<CreateOrderRequestLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public CreateOrderRequest addLineItemsItem(CreateOrderRequestLineItem lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * __Deprecated__: Please set the line_items on the nested [order](#type-order) field instead.  The line items to associate with this order.  Each line item represents a different product to include in a purchase.
   * @return lineItems
  **/
  @ApiModelProperty(value = "__Deprecated__: Please set the line_items on the nested [order](#type-order) field instead.  The line items to associate with this order.  Each line item represents a different product to include in a purchase.")
  public List<CreateOrderRequestLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<CreateOrderRequestLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public CreateOrderRequest taxes(List<CreateOrderRequestTax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public CreateOrderRequest addTaxesItem(CreateOrderRequestTax taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * __Deprecated__: Please set the taxes on the nested [order](#type-order) field instead.  The taxes to include on the order.
   * @return taxes
  **/
  @ApiModelProperty(value = "__Deprecated__: Please set the taxes on the nested [order](#type-order) field instead.  The taxes to include on the order.")
  public List<CreateOrderRequestTax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<CreateOrderRequestTax> taxes) {
    this.taxes = taxes;
  }

  public CreateOrderRequest discounts(List<CreateOrderRequestDiscount> discounts) {
    this.discounts = discounts;
    return this;
  }

  public CreateOrderRequest addDiscountsItem(CreateOrderRequestDiscount discountsItem) {
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * __Deprecated__: Please set the discounts on the nested [order](#type-order) field instead.  The discounts to include on the order.
   * @return discounts
  **/
  @ApiModelProperty(value = "__Deprecated__: Please set the discounts on the nested [order](#type-order) field instead.  The discounts to include on the order.")
  public List<CreateOrderRequestDiscount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<CreateOrderRequestDiscount> discounts) {
    this.discounts = discounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderRequest createOrderRequest = (CreateOrderRequest) o;
    return Objects.equals(this.order, createOrderRequest.order) &&
        Objects.equals(this.idempotencyKey, createOrderRequest.idempotencyKey) &&
        Objects.equals(this.referenceId, createOrderRequest.referenceId) &&
        Objects.equals(this.lineItems, createOrderRequest.lineItems) &&
        Objects.equals(this.taxes, createOrderRequest.taxes) &&
        Objects.equals(this.discounts, createOrderRequest.discounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, idempotencyKey, referenceId, lineItems, taxes, discounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequest {\n");

    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
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

