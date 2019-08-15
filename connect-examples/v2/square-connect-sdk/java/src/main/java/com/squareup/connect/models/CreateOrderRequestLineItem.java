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
import com.squareup.connect.models.CreateOrderRequestDiscount;
import com.squareup.connect.models.CreateOrderRequestModifier;
import com.squareup.connect.models.CreateOrderRequestTax;
import com.squareup.connect.models.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * __Deprecated__: Please use the [OrderLineItem](#type-orderlineitem) type in the order field of [CreateOrderRequest](#type-createorderrequest) instead.  Represents a line item to include in an order. Each line item describes a different product to purchase, with its own quantity and price details.  Line items can either reference objects from the merchant&#39;s catalog, or can alternatively specify a name and price instead.
 */
@ApiModel(description = "__Deprecated__: Please use the [OrderLineItem](#type-orderlineitem) type in the order field of [CreateOrderRequest](#type-createorderrequest) instead.  Represents a line item to include in an order. Each line item describes a different product to purchase, with its own quantity and price details.  Line items can either reference objects from the merchant's catalog, or can alternatively specify a name and price instead.")

public class CreateOrderRequestLineItem {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("quantity")
  private String quantity = null;

  @JsonProperty("base_price_money")
  private Money basePriceMoney = null;

  @JsonProperty("variation_name")
  private String variationName = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("catalog_object_id")
  private String catalogObjectId = null;

  @JsonProperty("modifiers")
  private List<CreateOrderRequestModifier> modifiers = new ArrayList<CreateOrderRequestModifier>();

  @JsonProperty("taxes")
  private List<CreateOrderRequestTax> taxes = new ArrayList<CreateOrderRequestTax>();

  @JsonProperty("discounts")
  private List<CreateOrderRequestDiscount> discounts = new ArrayList<CreateOrderRequestDiscount>();

  public CreateOrderRequestLineItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Only used for ad hoc line items. The name of the line item. This value cannot exceed 500 characters.  Do not provide a value for this field if you provide a value for `catalog_object_id`.
   * @return name
  **/
  @ApiModelProperty(value = "Only used for ad hoc line items. The name of the line item. This value cannot exceed 500 characters.  Do not provide a value for this field if you provide a value for `catalog_object_id`.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateOrderRequestLineItem quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity to purchase, as a string representation of a number.  This string must have a positive integer value.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity to purchase, as a string representation of a number.  This string must have a positive integer value.")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public CreateOrderRequestLineItem basePriceMoney(Money basePriceMoney) {
    this.basePriceMoney = basePriceMoney;
    return this;
  }

   /**
   * The base price for a single unit of the line item.  `base_price_money` is required for ad hoc line items and variable priced [CatalogItemVariation](#type-catalogitemvariation)s. If both `catalog_object_id` and `base_price_money` are set, `base_price_money` will override the CatalogItemVariation's price.
   * @return basePriceMoney
  **/
  @ApiModelProperty(value = "The base price for a single unit of the line item.  `base_price_money` is required for ad hoc line items and variable priced [CatalogItemVariation](#type-catalogitemvariation)s. If both `catalog_object_id` and `base_price_money` are set, `base_price_money` will override the CatalogItemVariation's price.")
  public Money getBasePriceMoney() {
    return basePriceMoney;
  }

  public void setBasePriceMoney(Money basePriceMoney) {
    this.basePriceMoney = basePriceMoney;
  }

  public CreateOrderRequestLineItem variationName(String variationName) {
    this.variationName = variationName;
    return this;
  }

   /**
   * Only used for ad hoc line items. The variation name of the line item. This value cannot exceed 255 characters.  If this value is not set for an ad hoc line item, the default value of `Regular` is used.  Do not provide a value for this field if you provide a value for the `catalog_object_id`.
   * @return variationName
  **/
  @ApiModelProperty(value = "Only used for ad hoc line items. The variation name of the line item. This value cannot exceed 255 characters.  If this value is not set for an ad hoc line item, the default value of `Regular` is used.  Do not provide a value for this field if you provide a value for the `catalog_object_id`.")
  public String getVariationName() {
    return variationName;
  }

  public void setVariationName(String variationName) {
    this.variationName = variationName;
  }

  public CreateOrderRequestLineItem note(String note) {
    this.note = note;
    return this;
  }

   /**
   * The note of the line item. This value cannot exceed 500 characters.
   * @return note
  **/
  @ApiModelProperty(value = "The note of the line item. This value cannot exceed 500 characters.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public CreateOrderRequestLineItem catalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
    return this;
  }

   /**
   * Only used for Catalog line items. The catalog object ID for an existing [CatalogItemVariation](#type-catalogitemvariation).  Do not provide a value for this field if you provide a value for `name` and `base_price_money`.
   * @return catalogObjectId
  **/
  @ApiModelProperty(value = "Only used for Catalog line items. The catalog object ID for an existing [CatalogItemVariation](#type-catalogitemvariation).  Do not provide a value for this field if you provide a value for `name` and `base_price_money`.")
  public String getCatalogObjectId() {
    return catalogObjectId;
  }

  public void setCatalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
  }

  public CreateOrderRequestLineItem modifiers(List<CreateOrderRequestModifier> modifiers) {
    this.modifiers = modifiers;
    return this;
  }

  public CreateOrderRequestLineItem addModifiersItem(CreateOrderRequestModifier modifiersItem) {
    this.modifiers.add(modifiersItem);
    return this;
  }

   /**
   * Only used for Catalog line items. The modifiers to include on the line item.
   * @return modifiers
  **/
  @ApiModelProperty(value = "Only used for Catalog line items. The modifiers to include on the line item.")
  public List<CreateOrderRequestModifier> getModifiers() {
    return modifiers;
  }

  public void setModifiers(List<CreateOrderRequestModifier> modifiers) {
    this.modifiers = modifiers;
  }

  public CreateOrderRequestLineItem taxes(List<CreateOrderRequestTax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public CreateOrderRequestLineItem addTaxesItem(CreateOrderRequestTax taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * The taxes to include on the line item.
   * @return taxes
  **/
  @ApiModelProperty(value = "The taxes to include on the line item.")
  public List<CreateOrderRequestTax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<CreateOrderRequestTax> taxes) {
    this.taxes = taxes;
  }

  public CreateOrderRequestLineItem discounts(List<CreateOrderRequestDiscount> discounts) {
    this.discounts = discounts;
    return this;
  }

  public CreateOrderRequestLineItem addDiscountsItem(CreateOrderRequestDiscount discountsItem) {
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * The discounts to include on the line item.
   * @return discounts
  **/
  @ApiModelProperty(value = "The discounts to include on the line item.")
  public List<CreateOrderRequestDiscount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<CreateOrderRequestDiscount> discounts) {
    this.discounts = discounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderRequestLineItem createOrderRequestLineItem = (CreateOrderRequestLineItem) o;
    return Objects.equals(this.name, createOrderRequestLineItem.name) &&
        Objects.equals(this.quantity, createOrderRequestLineItem.quantity) &&
        Objects.equals(this.basePriceMoney, createOrderRequestLineItem.basePriceMoney) &&
        Objects.equals(this.variationName, createOrderRequestLineItem.variationName) &&
        Objects.equals(this.note, createOrderRequestLineItem.note) &&
        Objects.equals(this.catalogObjectId, createOrderRequestLineItem.catalogObjectId) &&
        Objects.equals(this.modifiers, createOrderRequestLineItem.modifiers) &&
        Objects.equals(this.taxes, createOrderRequestLineItem.taxes) &&
        Objects.equals(this.discounts, createOrderRequestLineItem.discounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, quantity, basePriceMoney, variationName, note, catalogObjectId, modifiers, taxes, discounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequestLineItem {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    basePriceMoney: ").append(toIndentedString(basePriceMoney)).append("\n");
    sb.append("    variationName: ").append(toIndentedString(variationName)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    modifiers: ").append(toIndentedString(modifiers)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
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

