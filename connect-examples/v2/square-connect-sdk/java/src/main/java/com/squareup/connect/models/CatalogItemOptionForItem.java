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
 *  A list of item option values that can be assigned to item variations. For example, a t-shirt item may offer a color option or a size option.
 */
@ApiModel(description = " A list of item option values that can be assigned to item variations. For example, a t-shirt item may offer a color option or a size option.")

public class CatalogItemOptionForItem {
  @JsonProperty("item_option_id")
  private String itemOptionId = null;

  public CatalogItemOptionForItem itemOptionId(String itemOptionId) {
    this.itemOptionId = itemOptionId;
    return this;
  }

   /**
   * The unique id of the item option, used to form the dimensions of the item option matrix in a specified order.
   * @return itemOptionId
  **/
  @ApiModelProperty(value = "The unique id of the item option, used to form the dimensions of the item option matrix in a specified order.")
  public String getItemOptionId() {
    return itemOptionId;
  }

  public void setItemOptionId(String itemOptionId) {
    this.itemOptionId = itemOptionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogItemOptionForItem catalogItemOptionForItem = (CatalogItemOptionForItem) o;
    return Objects.equals(this.itemOptionId, catalogItemOptionForItem.itemOptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemOptionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogItemOptionForItem {\n");

    sb.append("    itemOptionId: ").append(toIndentedString(itemOptionId)).append("\n");
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

