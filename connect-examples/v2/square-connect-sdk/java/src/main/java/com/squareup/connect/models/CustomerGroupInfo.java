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
 * Contains some brief information about a customer group with its identifier included.
 */
@ApiModel(description = "Contains some brief information about a customer group with its identifier included.")

public class CustomerGroupInfo {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public CustomerGroupInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the customer group.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the customer group.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerGroupInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the customer group.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the customer group.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerGroupInfo customerGroupInfo = (CustomerGroupInfo) o;
    return Objects.equals(this.id, customerGroupInfo.id) &&
        Objects.equals(this.name, customerGroupInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerGroupInfo {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

