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
import com.squareup.connect.models.Address;
import com.squareup.connect.models.CardPaymentDetails;
import com.squareup.connect.models.Money;
import com.squareup.connect.models.ProcessingFee;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a payment processed by the Square API.
 */
@ApiModel(description = "Represents a payment processed by the Square API.")

public class Payment {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  @JsonProperty("amount_money")
  private Money amountMoney = null;

  @JsonProperty("tip_money")
  private Money tipMoney = null;

  @JsonProperty("total_money")
  private Money totalMoney = null;

  @JsonProperty("app_fee_money")
  private Money appFeeMoney = null;

  @JsonProperty("processing_fee")
  private List<ProcessingFee> processingFee = new ArrayList<ProcessingFee>();

  @JsonProperty("refunded_money")
  private Money refundedMoney = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("source_type")
  private String sourceType = null;

  @JsonProperty("card_details")
  private CardPaymentDetails cardDetails = null;

  @JsonProperty("location_id")
  private String locationId = null;

  @JsonProperty("order_id")
  private String orderId = null;

  @JsonProperty("reference_id")
  private String referenceId = null;

  @JsonProperty("customer_id")
  private String customerId = null;

  @JsonProperty("refund_ids")
  private List<String> refundIds = new ArrayList<String>();

  @JsonProperty("buyer_email_address")
  private String buyerEmailAddress = null;

  @JsonProperty("billing_address")
  private Address billingAddress = null;

  @JsonProperty("shipping_address")
  private Address shippingAddress = null;

  @JsonProperty("note")
  private String note = null;

  public Payment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique ID for the payment.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique ID for the payment.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Payment createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when the payment was created, in RFC 3339 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "Timestamp of when the payment was created, in RFC 3339 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Payment updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of when the payment was last updated, in RFC 3339 format.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Timestamp of when the payment was last updated, in RFC 3339 format.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Payment amountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The amount of money processed for this payment, not including `tip_money`. Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents. For more information, see [Working with monetary amounts](/build-basics/working-with-monetary-amounts).
   * @return amountMoney
  **/
  @ApiModelProperty(required = true, value = "The amount of money processed for this payment, not including `tip_money`. Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents. For more information, see [Working with monetary amounts](/build-basics/working-with-monetary-amounts).")
  public Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
  }

  public Payment tipMoney(Money tipMoney) {
    this.tipMoney = tipMoney;
    return this;
  }

   /**
   * The amount designated as a tip. Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.
   * @return tipMoney
  **/
  @ApiModelProperty(value = "The amount designated as a tip. Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.")
  public Money getTipMoney() {
    return tipMoney;
  }

  public void setTipMoney(Money tipMoney) {
    this.tipMoney = tipMoney;
  }

  public Payment totalMoney(Money totalMoney) {
    this.totalMoney = totalMoney;
    return this;
  }

   /**
   * The total money for the payment, including `amount_money` and `tip_money`. Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.
   * @return totalMoney
  **/
  @ApiModelProperty(value = "The total money for the payment, including `amount_money` and `tip_money`. Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.")
  public Money getTotalMoney() {
    return totalMoney;
  }

  public void setTotalMoney(Money totalMoney) {
    this.totalMoney = totalMoney;
  }

  public Payment appFeeMoney(Money appFeeMoney) {
    this.appFeeMoney = appFeeMoney;
    return this;
  }

   /**
   * The amount of money the developer is taking as a fee for facilitating the payment on behalf of the seller. Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.  For more information, see [Take Payments and Collect Fees](/payments-api/take-payments-and-collect-fees).  Cannot be more than 90% of the `total_money` value.
   * @return appFeeMoney
  **/
  @ApiModelProperty(value = "The amount of money the developer is taking as a fee for facilitating the payment on behalf of the seller. Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.  For more information, see [Take Payments and Collect Fees](/payments-api/take-payments-and-collect-fees).  Cannot be more than 90% of the `total_money` value.")
  public Money getAppFeeMoney() {
    return appFeeMoney;
  }

  public void setAppFeeMoney(Money appFeeMoney) {
    this.appFeeMoney = appFeeMoney;
  }

  public Payment processingFee(List<ProcessingFee> processingFee) {
    this.processingFee = processingFee;
    return this;
  }

  public Payment addProcessingFeeItem(ProcessingFee processingFeeItem) {
    this.processingFee.add(processingFeeItem);
    return this;
  }

   /**
   * Processing fees and fee adjustments assessed by Square on this payment.
   * @return processingFee
  **/
  @ApiModelProperty(value = "Processing fees and fee adjustments assessed by Square on this payment.")
  public List<ProcessingFee> getProcessingFee() {
    return processingFee;
  }

  public void setProcessingFee(List<ProcessingFee> processingFee) {
    this.processingFee = processingFee;
  }

  public Payment refundedMoney(Money refundedMoney) {
    this.refundedMoney = refundedMoney;
    return this;
  }

   /**
   * Total amount of the payment refunded to-date. Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.
   * @return refundedMoney
  **/
  @ApiModelProperty(value = "Total amount of the payment refunded to-date. Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.")
  public Money getRefundedMoney() {
    return refundedMoney;
  }

  public void setRefundedMoney(Money refundedMoney) {
    this.refundedMoney = refundedMoney;
  }

  public Payment status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates whether the payment is `APPROVED`, `COMPLETED`, `CANCELED`, or `FAILED`.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates whether the payment is `APPROVED`, `COMPLETED`, `CANCELED`, or `FAILED`.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Payment sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * The source type for this payment
   * @return sourceType
  **/
  @ApiModelProperty(value = "The source type for this payment")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public Payment cardDetails(CardPaymentDetails cardDetails) {
    this.cardDetails = cardDetails;
    return this;
  }

   /**
   * Non-confidential details about the source. Only populated if the `source_type` is `CARD`.
   * @return cardDetails
  **/
  @ApiModelProperty(value = "Non-confidential details about the source. Only populated if the `source_type` is `CARD`.")
  public CardPaymentDetails getCardDetails() {
    return cardDetails;
  }

  public void setCardDetails(CardPaymentDetails cardDetails) {
    this.cardDetails = cardDetails;
  }

  public Payment locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * ID of the location associated with the payment.
   * @return locationId
  **/
  @ApiModelProperty(value = "ID of the location associated with the payment.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Payment orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * ID of the order associated with this payment.
   * @return orderId
  **/
  @ApiModelProperty(value = "ID of the order associated with this payment.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Payment referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * An optional ID that associates this payment with an entity in another system.
   * @return referenceId
  **/
  @ApiModelProperty(value = "An optional ID that associates this payment with an entity in another system.")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public Payment customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * An optional customer_id to be entered by the developer when creating a payment.
   * @return customerId
  **/
  @ApiModelProperty(value = "An optional customer_id to be entered by the developer when creating a payment.")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Payment refundIds(List<String> refundIds) {
    this.refundIds = refundIds;
    return this;
  }

  public Payment addRefundIdsItem(String refundIdsItem) {
    this.refundIds.add(refundIdsItem);
    return this;
  }

   /**
   * List of `refund_id`s identifying refunds for this payment.
   * @return refundIds
  **/
  @ApiModelProperty(value = "List of `refund_id`s identifying refunds for this payment.")
  public List<String> getRefundIds() {
    return refundIds;
  }

  public void setRefundIds(List<String> refundIds) {
    this.refundIds = refundIds;
  }

  public Payment buyerEmailAddress(String buyerEmailAddress) {
    this.buyerEmailAddress = buyerEmailAddress;
    return this;
  }

   /**
   * The buyer's e-mail address
   * @return buyerEmailAddress
  **/
  @ApiModelProperty(value = "The buyer's e-mail address")
  public String getBuyerEmailAddress() {
    return buyerEmailAddress;
  }

  public void setBuyerEmailAddress(String buyerEmailAddress) {
    this.buyerEmailAddress = buyerEmailAddress;
  }

  public Payment billingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * The buyer's billing address
   * @return billingAddress
  **/
  @ApiModelProperty(value = "The buyer's billing address")
  public Address getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  public Payment shippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * The buyer's shipping address
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "The buyer's shipping address")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public Payment note(String note) {
    this.note = note;
    return this;
  }

   /**
   * An optional note to include when creating a payment
   * @return note
  **/
  @ApiModelProperty(value = "An optional note to include when creating a payment")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.id, payment.id) &&
        Objects.equals(this.createdAt, payment.createdAt) &&
        Objects.equals(this.updatedAt, payment.updatedAt) &&
        Objects.equals(this.amountMoney, payment.amountMoney) &&
        Objects.equals(this.tipMoney, payment.tipMoney) &&
        Objects.equals(this.totalMoney, payment.totalMoney) &&
        Objects.equals(this.appFeeMoney, payment.appFeeMoney) &&
        Objects.equals(this.processingFee, payment.processingFee) &&
        Objects.equals(this.refundedMoney, payment.refundedMoney) &&
        Objects.equals(this.status, payment.status) &&
        Objects.equals(this.sourceType, payment.sourceType) &&
        Objects.equals(this.cardDetails, payment.cardDetails) &&
        Objects.equals(this.locationId, payment.locationId) &&
        Objects.equals(this.orderId, payment.orderId) &&
        Objects.equals(this.referenceId, payment.referenceId) &&
        Objects.equals(this.customerId, payment.customerId) &&
        Objects.equals(this.refundIds, payment.refundIds) &&
        Objects.equals(this.buyerEmailAddress, payment.buyerEmailAddress) &&
        Objects.equals(this.billingAddress, payment.billingAddress) &&
        Objects.equals(this.shippingAddress, payment.shippingAddress) &&
        Objects.equals(this.note, payment.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, amountMoney, tipMoney, totalMoney, appFeeMoney, processingFee, refundedMoney, status, sourceType, cardDetails, locationId, orderId, referenceId, customerId, refundIds, buyerEmailAddress, billingAddress, shippingAddress, note);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
    sb.append("    tipMoney: ").append(toIndentedString(tipMoney)).append("\n");
    sb.append("    totalMoney: ").append(toIndentedString(totalMoney)).append("\n");
    sb.append("    appFeeMoney: ").append(toIndentedString(appFeeMoney)).append("\n");
    sb.append("    processingFee: ").append(toIndentedString(processingFee)).append("\n");
    sb.append("    refundedMoney: ").append(toIndentedString(refundedMoney)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    cardDetails: ").append(toIndentedString(cardDetails)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    refundIds: ").append(toIndentedString(refundIds)).append("\n");
    sb.append("    buyerEmailAddress: ").append(toIndentedString(buyerEmailAddress)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

