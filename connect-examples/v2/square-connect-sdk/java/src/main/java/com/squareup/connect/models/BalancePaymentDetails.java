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
 * Reflects the current status of a balance payment.
 */
@ApiModel(description = "Reflects the current status of a balance payment.")

public class BalancePaymentDetails {
  @JsonProperty("account_id")
  private String accountId = null;

  @JsonProperty("status")
  private String status = null;

  public BalancePaymentDetails accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * ID for the account used to fund the payment.
   * @return accountId
  **/
  @ApiModelProperty(value = "ID for the account used to fund the payment.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public BalancePaymentDetails status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The balance payment’s current state. Can be `COMPLETED` or `FAILED`.
   * @return status
  **/
  @ApiModelProperty(value = "The balance payment’s current state. Can be `COMPLETED` or `FAILED`.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalancePaymentDetails balancePaymentDetails = (BalancePaymentDetails) o;
    return Objects.equals(this.accountId, balancePaymentDetails.accountId) &&
        Objects.equals(this.status, balancePaymentDetails.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalancePaymentDetails {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

