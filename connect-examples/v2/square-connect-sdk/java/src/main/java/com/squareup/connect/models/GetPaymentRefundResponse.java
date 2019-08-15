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
import com.squareup.connect.models.Error;
import com.squareup.connect.models.PaymentRefund;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the fields that are included in the response body of a request to the [GetRefund](#endpoint-refunds-getpaymentrefund) endpoint.  Note: if there are errors processing the request, the refund field may not be present, or it may be present in a FAILED state.
 */
@ApiModel(description = "Defines the fields that are included in the response body of a request to the [GetRefund](#endpoint-refunds-getpaymentrefund) endpoint.  Note: if there are errors processing the request, the refund field may not be present, or it may be present in a FAILED state.")

public class GetPaymentRefundResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("refund")
  private PaymentRefund refund = null;

  public GetPaymentRefundResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public GetPaymentRefundResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Information on errors encountered during the request.
   * @return errors
  **/
  @ApiModelProperty(value = "Information on errors encountered during the request.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public GetPaymentRefundResponse refund(PaymentRefund refund) {
    this.refund = refund;
    return this;
  }

   /**
   * The requested `PaymentRefund`.
   * @return refund
  **/
  @ApiModelProperty(value = "The requested `PaymentRefund`.")
  public PaymentRefund getRefund() {
    return refund;
  }

  public void setRefund(PaymentRefund refund) {
    this.refund = refund;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPaymentRefundResponse getPaymentRefundResponse = (GetPaymentRefundResponse) o;
    return Objects.equals(this.errors, getPaymentRefundResponse.errors) &&
        Objects.equals(this.refund, getPaymentRefundResponse.refund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, refund);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPaymentRefundResponse {\n");

    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
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

