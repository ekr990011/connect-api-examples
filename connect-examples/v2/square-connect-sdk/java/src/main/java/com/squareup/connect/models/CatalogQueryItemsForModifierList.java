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
 *
 */
@ApiModel(description = "")

public class CatalogQueryItemsForModifierList {
  @JsonProperty("modifier_list_ids")
  private List<String> modifierListIds = new ArrayList<String>();

  public CatalogQueryItemsForModifierList modifierListIds(List<String> modifierListIds) {
    this.modifierListIds = modifierListIds;
    return this;
  }

  public CatalogQueryItemsForModifierList addModifierListIdsItem(String modifierListIdsItem) {
    this.modifierListIds.add(modifierListIdsItem);
    return this;
  }

   /**
   * A set of [CatalogModifierList](#type-catalogmodifierlist) IDs to be used to find associated [CatalogItem](#type-catalogitem)s.
   * @return modifierListIds
  **/
  @ApiModelProperty(required = true, value = "A set of [CatalogModifierList](#type-catalogmodifierlist) IDs to be used to find associated [CatalogItem](#type-catalogitem)s.")
  public List<String> getModifierListIds() {
    return modifierListIds;
  }

  public void setModifierListIds(List<String> modifierListIds) {
    this.modifierListIds = modifierListIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogQueryItemsForModifierList catalogQueryItemsForModifierList = (CatalogQueryItemsForModifierList) o;
    return Objects.equals(this.modifierListIds, catalogQueryItemsForModifierList.modifierListIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifierListIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogQueryItemsForModifierList {\n");

    sb.append("    modifierListIds: ").append(toIndentedString(modifierListIds)).append("\n");
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

