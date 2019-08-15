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
import com.squareup.connect.models.OrderFulfillmentRecipient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains details necessary to fulfill a shipment order.
 */
@ApiModel(description = "Contains details necessary to fulfill a shipment order.")

public class OrderFulfillmentShipmentDetails {
  @JsonProperty("recipient")
  private OrderFulfillmentRecipient recipient = null;

  @JsonProperty("carrier")
  private String carrier = null;

  @JsonProperty("shipping_note")
  private String shippingNote = null;

  @JsonProperty("shipping_type")
  private String shippingType = null;

  @JsonProperty("tracking_number")
  private String trackingNumber = null;

  @JsonProperty("tracking_url")
  private String trackingUrl = null;

  @JsonProperty("placed_at")
  private String placedAt = null;

  @JsonProperty("in_progress_at")
  private String inProgressAt = null;

  @JsonProperty("packaged_at")
  private String packagedAt = null;

  @JsonProperty("expected_shipped_at")
  private String expectedShippedAt = null;

  @JsonProperty("shipped_at")
  private String shippedAt = null;

  @JsonProperty("canceled_at")
  private String canceledAt = null;

  @JsonProperty("cancel_reason")
  private String cancelReason = null;

  @JsonProperty("failed_at")
  private String failedAt = null;

  @JsonProperty("failure_reason")
  private String failureReason = null;

  public OrderFulfillmentShipmentDetails recipient(OrderFulfillmentRecipient recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * Information on the person meant to receive this shipment fulfillment.
   * @return recipient
  **/
  @ApiModelProperty(value = "Information on the person meant to receive this shipment fulfillment.")
  public OrderFulfillmentRecipient getRecipient() {
    return recipient;
  }

  public void setRecipient(OrderFulfillmentRecipient recipient) {
    this.recipient = recipient;
  }

  public OrderFulfillmentShipmentDetails carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * The shipping carrier being used to ship this fulfillment e.g. UPS, FedEx, USPS, etc.
   * @return carrier
  **/
  @ApiModelProperty(value = "The shipping carrier being used to ship this fulfillment e.g. UPS, FedEx, USPS, etc.")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public OrderFulfillmentShipmentDetails shippingNote(String shippingNote) {
    this.shippingNote = shippingNote;
    return this;
  }

   /**
   * A note with additional information for the shipping carrier.
   * @return shippingNote
  **/
  @ApiModelProperty(value = "A note with additional information for the shipping carrier.")
  public String getShippingNote() {
    return shippingNote;
  }

  public void setShippingNote(String shippingNote) {
    this.shippingNote = shippingNote;
  }

  public OrderFulfillmentShipmentDetails shippingType(String shippingType) {
    this.shippingType = shippingType;
    return this;
  }

   /**
   * A description of the type of shipping product purchased from the carrier. e.g. First Class, Priority, Express
   * @return shippingType
  **/
  @ApiModelProperty(value = "A description of the type of shipping product purchased from the carrier. e.g. First Class, Priority, Express")
  public String getShippingType() {
    return shippingType;
  }

  public void setShippingType(String shippingType) {
    this.shippingType = shippingType;
  }

  public OrderFulfillmentShipmentDetails trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * The reference number provided by the carrier to track the shipment's progress.
   * @return trackingNumber
  **/
  @ApiModelProperty(value = "The reference number provided by the carrier to track the shipment's progress.")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public OrderFulfillmentShipmentDetails trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * A link to the tracking webpage on the carrier's website.
   * @return trackingUrl
  **/
  @ApiModelProperty(value = "A link to the tracking webpage on the carrier's website.")
  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public OrderFulfillmentShipmentDetails placedAt(String placedAt) {
    this.placedAt = placedAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) indicating when the shipment was requested. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return placedAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) indicating when the shipment was requested. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getPlacedAt() {
    return placedAt;
  }

  public void setPlacedAt(String placedAt) {
    this.placedAt = placedAt;
  }

  public OrderFulfillmentShipmentDetails inProgressAt(String inProgressAt) {
    this.inProgressAt = inProgressAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) indicating when this fulfillment was moved to the `RESERVED` state. Indicates that preparation of this shipment has begun. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return inProgressAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) indicating when this fulfillment was moved to the `RESERVED` state. Indicates that preparation of this shipment has begun. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getInProgressAt() {
    return inProgressAt;
  }

  public void setInProgressAt(String inProgressAt) {
    this.inProgressAt = inProgressAt;
  }

  public OrderFulfillmentShipmentDetails packagedAt(String packagedAt) {
    this.packagedAt = packagedAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) indicating when this fulfillment was moved to the `PREPARED` state. Indicates that the fulfillment is packaged. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return packagedAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) indicating when this fulfillment was moved to the `PREPARED` state. Indicates that the fulfillment is packaged. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getPackagedAt() {
    return packagedAt;
  }

  public void setPackagedAt(String packagedAt) {
    this.packagedAt = packagedAt;
  }

  public OrderFulfillmentShipmentDetails expectedShippedAt(String expectedShippedAt) {
    this.expectedShippedAt = expectedShippedAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) indicating when the shipment is expected to be delivered to the shipping carrier. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return expectedShippedAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) indicating when the shipment is expected to be delivered to the shipping carrier. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getExpectedShippedAt() {
    return expectedShippedAt;
  }

  public void setExpectedShippedAt(String expectedShippedAt) {
    this.expectedShippedAt = expectedShippedAt;
  }

  public OrderFulfillmentShipmentDetails shippedAt(String shippedAt) {
    this.shippedAt = shippedAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) indicating when this fulfillment was moved to the `COMPLETED`state. Indicates that the fulfillment has been given to the shipping carrier. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return shippedAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) indicating when this fulfillment was moved to the `COMPLETED`state. Indicates that the fulfillment has been given to the shipping carrier. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getShippedAt() {
    return shippedAt;
  }

  public void setShippedAt(String shippedAt) {
    this.shippedAt = shippedAt;
  }

  public OrderFulfillmentShipmentDetails canceledAt(String canceledAt) {
    this.canceledAt = canceledAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) indicating the shipment was canceled. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return canceledAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) indicating the shipment was canceled. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getCanceledAt() {
    return canceledAt;
  }

  public void setCanceledAt(String canceledAt) {
    this.canceledAt = canceledAt;
  }

  public OrderFulfillmentShipmentDetails cancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
    return this;
  }

   /**
   * A description of why the shipment was canceled.
   * @return cancelReason
  **/
  @ApiModelProperty(value = "A description of why the shipment was canceled.")
  public String getCancelReason() {
    return cancelReason;
  }

  public void setCancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
  }

  public OrderFulfillmentShipmentDetails failedAt(String failedAt) {
    this.failedAt = failedAt;
    return this;
  }

   /**
   * The [timestamp](#workingwithdates) indicating when the shipment failed to be completed. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return failedAt
  **/
  @ApiModelProperty(value = "The [timestamp](#workingwithdates) indicating when the shipment failed to be completed. Must be in RFC3339 timestamp format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getFailedAt() {
    return failedAt;
  }

  public void setFailedAt(String failedAt) {
    this.failedAt = failedAt;
  }

  public OrderFulfillmentShipmentDetails failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

   /**
   * A description of why the shipment failed to be completed.
   * @return failureReason
  **/
  @ApiModelProperty(value = "A description of why the shipment failed to be completed.")
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderFulfillmentShipmentDetails orderFulfillmentShipmentDetails = (OrderFulfillmentShipmentDetails) o;
    return Objects.equals(this.recipient, orderFulfillmentShipmentDetails.recipient) &&
        Objects.equals(this.carrier, orderFulfillmentShipmentDetails.carrier) &&
        Objects.equals(this.shippingNote, orderFulfillmentShipmentDetails.shippingNote) &&
        Objects.equals(this.shippingType, orderFulfillmentShipmentDetails.shippingType) &&
        Objects.equals(this.trackingNumber, orderFulfillmentShipmentDetails.trackingNumber) &&
        Objects.equals(this.trackingUrl, orderFulfillmentShipmentDetails.trackingUrl) &&
        Objects.equals(this.placedAt, orderFulfillmentShipmentDetails.placedAt) &&
        Objects.equals(this.inProgressAt, orderFulfillmentShipmentDetails.inProgressAt) &&
        Objects.equals(this.packagedAt, orderFulfillmentShipmentDetails.packagedAt) &&
        Objects.equals(this.expectedShippedAt, orderFulfillmentShipmentDetails.expectedShippedAt) &&
        Objects.equals(this.shippedAt, orderFulfillmentShipmentDetails.shippedAt) &&
        Objects.equals(this.canceledAt, orderFulfillmentShipmentDetails.canceledAt) &&
        Objects.equals(this.cancelReason, orderFulfillmentShipmentDetails.cancelReason) &&
        Objects.equals(this.failedAt, orderFulfillmentShipmentDetails.failedAt) &&
        Objects.equals(this.failureReason, orderFulfillmentShipmentDetails.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipient, carrier, shippingNote, shippingType, trackingNumber, trackingUrl, placedAt, inProgressAt, packagedAt, expectedShippedAt, shippedAt, canceledAt, cancelReason, failedAt, failureReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFulfillmentShipmentDetails {\n");

    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    shippingNote: ").append(toIndentedString(shippingNote)).append("\n");
    sb.append("    shippingType: ").append(toIndentedString(shippingType)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    placedAt: ").append(toIndentedString(placedAt)).append("\n");
    sb.append("    inProgressAt: ").append(toIndentedString(inProgressAt)).append("\n");
    sb.append("    packagedAt: ").append(toIndentedString(packagedAt)).append("\n");
    sb.append("    expectedShippedAt: ").append(toIndentedString(expectedShippedAt)).append("\n");
    sb.append("    shippedAt: ").append(toIndentedString(shippedAt)).append("\n");
    sb.append("    canceledAt: ").append(toIndentedString(canceledAt)).append("\n");
    sb.append("    cancelReason: ").append(toIndentedString(cancelReason)).append("\n");
    sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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

