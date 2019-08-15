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
import com.squareup.connect.models.InventoryChange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@ApiModel(description = "")

public class BatchChangeInventoryRequest {
  @JsonProperty("idempotency_key")
  private String idempotencyKey = null;

  @JsonProperty("changes")
  private List<InventoryChange> changes = new ArrayList<InventoryChange>();

  @JsonProperty("ignore_unchanged_counts")
  private Boolean ignoreUnchangedCounts = null;

  public BatchChangeInventoryRequest idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A client-supplied, universally unique identifier (UUID) for the request.  See [Idempotency](/basics/api101/idempotency) in the [API Development 101](/basics/api101/overview) section for more information.
   * @return idempotencyKey
  **/
  @ApiModelProperty(value = "A client-supplied, universally unique identifier (UUID) for the request.  See [Idempotency](/basics/api101/idempotency) in the [API Development 101](/basics/api101/overview) section for more information.")
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  public BatchChangeInventoryRequest changes(List<InventoryChange> changes) {
    this.changes = changes;
    return this;
  }

  public BatchChangeInventoryRequest addChangesItem(InventoryChange changesItem) {
    this.changes.add(changesItem);
    return this;
  }

   /**
   * The set of physical counts and inventory adjustments to be made. Changes are applied based on the client-supplied timestamp and may be sent out of order. Max size is 100 changes.
   * @return changes
  **/
  @ApiModelProperty(value = "The set of physical counts and inventory adjustments to be made. Changes are applied based on the client-supplied timestamp and may be sent out of order. Max size is 100 changes.")
  public List<InventoryChange> getChanges() {
    return changes;
  }

  public void setChanges(List<InventoryChange> changes) {
    this.changes = changes;
  }

  public BatchChangeInventoryRequest ignoreUnchangedCounts(Boolean ignoreUnchangedCounts) {
    this.ignoreUnchangedCounts = ignoreUnchangedCounts;
    return this;
  }

   /**
   * Indicates whether the current physical count should be ignored if the quantity is unchanged since the last physical count. Default: `true`.
   * @return ignoreUnchangedCounts
  **/
  @ApiModelProperty(value = "Indicates whether the current physical count should be ignored if the quantity is unchanged since the last physical count. Default: `true`.")
  public Boolean getIgnoreUnchangedCounts() {
    return ignoreUnchangedCounts;
  }

  public void setIgnoreUnchangedCounts(Boolean ignoreUnchangedCounts) {
    this.ignoreUnchangedCounts = ignoreUnchangedCounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchChangeInventoryRequest batchChangeInventoryRequest = (BatchChangeInventoryRequest) o;
    return Objects.equals(this.idempotencyKey, batchChangeInventoryRequest.idempotencyKey) &&
        Objects.equals(this.changes, batchChangeInventoryRequest.changes) &&
        Objects.equals(this.ignoreUnchangedCounts, batchChangeInventoryRequest.ignoreUnchangedCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idempotencyKey, changes, ignoreUnchangedCounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchChangeInventoryRequest {\n");

    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    ignoreUnchangedCounts: ").append(toIndentedString(ignoreUnchangedCounts)).append("\n");
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

