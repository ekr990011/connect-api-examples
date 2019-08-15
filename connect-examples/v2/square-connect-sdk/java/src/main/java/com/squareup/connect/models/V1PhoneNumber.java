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
 * Represents a phone number.
 */
@ApiModel(description = "Represents a phone number.")

public class V1PhoneNumber {
  @JsonProperty("calling_code")
  private String callingCode = null;

  @JsonProperty("number")
  private String number = null;

  public V1PhoneNumber callingCode(String callingCode) {
    this.callingCode = callingCode;
    return this;
  }

   /**
   * The phone number's international calling code. For US phone numbers, this value is +1.
   * @return callingCode
  **/
  @ApiModelProperty(required = true, value = "The phone number's international calling code. For US phone numbers, this value is +1.")
  public String getCallingCode() {
    return callingCode;
  }

  public void setCallingCode(String callingCode) {
    this.callingCode = callingCode;
  }

  public V1PhoneNumber number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The phone number.
   * @return number
  **/
  @ApiModelProperty(required = true, value = "The phone number.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PhoneNumber v1PhoneNumber = (V1PhoneNumber) o;
    return Objects.equals(this.callingCode, v1PhoneNumber.callingCode) &&
        Objects.equals(this.number, v1PhoneNumber.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callingCode, number);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PhoneNumber {\n");

    sb.append("    callingCode: ").append(toIndentedString(callingCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

