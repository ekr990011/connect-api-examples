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
import com.squareup.connect.models.Card;
import com.squareup.connect.models.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Reflects the current status of a card payment.
 */
@ApiModel(description = "Reflects the current status of a card payment.")

public class CardPaymentDetails {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("card")
  private Card card = null;

  @JsonProperty("entry_method")
  private String entryMethod = null;

  @JsonProperty("cvv_status")
  private String cvvStatus = null;

  @JsonProperty("avs_status")
  private String avsStatus = null;

  @JsonProperty("auth_result_code")
  private String authResultCode = null;

  @JsonProperty("application_identifier")
  private String applicationIdentifier = null;

  @JsonProperty("application_name")
  private String applicationName = null;

  @JsonProperty("application_cryptogram")
  private String applicationCryptogram = null;

  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  public CardPaymentDetails status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The card payment's current state. It can be one of: `AUTHORIZED`, `CAPTURED`, `VOIDED`, `FAILED`.
   * @return status
  **/
  @ApiModelProperty(value = "The card payment's current state. It can be one of: `AUTHORIZED`, `CAPTURED`, `VOIDED`, `FAILED`.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CardPaymentDetails card(Card card) {
    this.card = card;
    return this;
  }

   /**
   * The credit card's non-confidential details.
   * @return card
  **/
  @ApiModelProperty(value = "The credit card's non-confidential details.")
  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public CardPaymentDetails entryMethod(String entryMethod) {
    this.entryMethod = entryMethod;
    return this;
  }

   /**
   * The method used to enter the card's details for the payment.  Can be `KEYED`, `SWIPED`, `EMV`, `ON_FILE`, or `CONTACTLESS`.
   * @return entryMethod
  **/
  @ApiModelProperty(value = "The method used to enter the card's details for the payment.  Can be `KEYED`, `SWIPED`, `EMV`, `ON_FILE`, or `CONTACTLESS`.")
  public String getEntryMethod() {
    return entryMethod;
  }

  public void setEntryMethod(String entryMethod) {
    this.entryMethod = entryMethod;
  }

  public CardPaymentDetails cvvStatus(String cvvStatus) {
    this.cvvStatus = cvvStatus;
    return this;
  }

   /**
   * Status code returned from the Card Verification Value (CVV) check.
   * @return cvvStatus
  **/
  @ApiModelProperty(value = "Status code returned from the Card Verification Value (CVV) check.")
  public String getCvvStatus() {
    return cvvStatus;
  }

  public void setCvvStatus(String cvvStatus) {
    this.cvvStatus = cvvStatus;
  }

  public CardPaymentDetails avsStatus(String avsStatus) {
    this.avsStatus = avsStatus;
    return this;
  }

   /**
   * Status code returned from the Address Verification System (AVS) check.
   * @return avsStatus
  **/
  @ApiModelProperty(value = "Status code returned from the Address Verification System (AVS) check.")
  public String getAvsStatus() {
    return avsStatus;
  }

  public void setAvsStatus(String avsStatus) {
    this.avsStatus = avsStatus;
  }

  public CardPaymentDetails authResultCode(String authResultCode) {
    this.authResultCode = authResultCode;
    return this;
  }

   /**
   * Status code returned by the card issuer that describes the payment's authorization status.
   * @return authResultCode
  **/
  @ApiModelProperty(value = "Status code returned by the card issuer that describes the payment's authorization status.")
  public String getAuthResultCode() {
    return authResultCode;
  }

  public void setAuthResultCode(String authResultCode) {
    this.authResultCode = authResultCode;
  }

  public CardPaymentDetails applicationIdentifier(String applicationIdentifier) {
    this.applicationIdentifier = applicationIdentifier;
    return this;
  }

   /**
   * For EMV payments, identifies the EMV application used for the payment
   * @return applicationIdentifier
  **/
  @ApiModelProperty(value = "For EMV payments, identifies the EMV application used for the payment")
  public String getApplicationIdentifier() {
    return applicationIdentifier;
  }

  public void setApplicationIdentifier(String applicationIdentifier) {
    this.applicationIdentifier = applicationIdentifier;
  }

  public CardPaymentDetails applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * For EMV payments, the human-readable name of the EMV application used for the payment.
   * @return applicationName
  **/
  @ApiModelProperty(value = "For EMV payments, the human-readable name of the EMV application used for the payment.")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public CardPaymentDetails applicationCryptogram(String applicationCryptogram) {
    this.applicationCryptogram = applicationCryptogram;
    return this;
  }

   /**
   * For EMV payments, the cryptogram generated for the payment.
   * @return applicationCryptogram
  **/
  @ApiModelProperty(value = "For EMV payments, the cryptogram generated for the payment.")
  public String getApplicationCryptogram() {
    return applicationCryptogram;
  }

  public void setApplicationCryptogram(String applicationCryptogram) {
    this.applicationCryptogram = applicationCryptogram;
  }

  public CardPaymentDetails errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public CardPaymentDetails addErrorsItem(Error errorsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardPaymentDetails cardPaymentDetails = (CardPaymentDetails) o;
    return Objects.equals(this.status, cardPaymentDetails.status) &&
        Objects.equals(this.card, cardPaymentDetails.card) &&
        Objects.equals(this.entryMethod, cardPaymentDetails.entryMethod) &&
        Objects.equals(this.cvvStatus, cardPaymentDetails.cvvStatus) &&
        Objects.equals(this.avsStatus, cardPaymentDetails.avsStatus) &&
        Objects.equals(this.authResultCode, cardPaymentDetails.authResultCode) &&
        Objects.equals(this.applicationIdentifier, cardPaymentDetails.applicationIdentifier) &&
        Objects.equals(this.applicationName, cardPaymentDetails.applicationName) &&
        Objects.equals(this.applicationCryptogram, cardPaymentDetails.applicationCryptogram) &&
        Objects.equals(this.errors, cardPaymentDetails.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, card, entryMethod, cvvStatus, avsStatus, authResultCode, applicationIdentifier, applicationName, applicationCryptogram, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardPaymentDetails {\n");

    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    entryMethod: ").append(toIndentedString(entryMethod)).append("\n");
    sb.append("    cvvStatus: ").append(toIndentedString(cvvStatus)).append("\n");
    sb.append("    avsStatus: ").append(toIndentedString(avsStatus)).append("\n");
    sb.append("    authResultCode: ").append(toIndentedString(authResultCode)).append("\n");
    sb.append("    applicationIdentifier: ").append(toIndentedString(applicationIdentifier)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    applicationCryptogram: ").append(toIndentedString(applicationCryptogram)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

