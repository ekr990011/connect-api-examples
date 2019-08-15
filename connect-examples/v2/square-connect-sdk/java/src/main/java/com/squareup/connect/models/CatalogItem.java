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
import com.squareup.connect.models.CatalogItemModifierListInfo;
import com.squareup.connect.models.CatalogItemOptionForItem;
import com.squareup.connect.models.CatalogObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * An item (i.e., product family) in the Catalog object model.
 */
@ApiModel(description = "An item (i.e., product family) in the Catalog object model.")

public class CatalogItem {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("abbreviation")
  private String abbreviation = null;

  @JsonProperty("label_color")
  private String labelColor = null;

  @JsonProperty("available_online")
  private Boolean availableOnline = null;

  @JsonProperty("available_for_pickup")
  private Boolean availableForPickup = null;

  @JsonProperty("available_electronically")
  private Boolean availableElectronically = null;

  @JsonProperty("category_id")
  private String categoryId = null;

  @JsonProperty("tax_ids")
  private List<String> taxIds = new ArrayList<String>();

  @JsonProperty("modifier_list_info")
  private List<CatalogItemModifierListInfo> modifierListInfo = new ArrayList<CatalogItemModifierListInfo>();

  @JsonProperty("variations")
  private List<CatalogObject> variations = new ArrayList<CatalogObject>();

  @JsonProperty("product_type")
  private String productType = null;

  @JsonProperty("skip_modifier_screen")
  private Boolean skipModifierScreen = null;

  @JsonProperty("item_options")
  private List<CatalogItemOptionForItem> itemOptions = new ArrayList<CatalogItemOptionForItem>();

  public CatalogItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The item's name. Searchable. This field must not be empty. This field has max length of 512 Unicode code points.
   * @return name
  **/
  @ApiModelProperty(value = "The item's name. Searchable. This field must not be empty. This field has max length of 512 Unicode code points.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The item's description. Searchable. This field has max length of 4096 Unicode code points.
   * @return description
  **/
  @ApiModelProperty(value = "The item's description. Searchable. This field has max length of 4096 Unicode code points.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogItem abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

   /**
   * The text of the item's display label in the Square Point of Sale app. Only up to the first five characters of the string are used. Searchable. This field has max length of 24 Unicode code points.
   * @return abbreviation
  **/
  @ApiModelProperty(value = "The text of the item's display label in the Square Point of Sale app. Only up to the first five characters of the string are used. Searchable. This field has max length of 24 Unicode code points.")
  public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public CatalogItem labelColor(String labelColor) {
    this.labelColor = labelColor;
    return this;
  }

   /**
   * The color of the item's display label in the Square Point of Sale app. This must be a valid hex color code.
   * @return labelColor
  **/
  @ApiModelProperty(value = "The color of the item's display label in the Square Point of Sale app. This must be a valid hex color code.")
  public String getLabelColor() {
    return labelColor;
  }

  public void setLabelColor(String labelColor) {
    this.labelColor = labelColor;
  }

  public CatalogItem availableOnline(Boolean availableOnline) {
    this.availableOnline = availableOnline;
    return this;
  }

   /**
   * If `true`, the item can be added to shipping orders from the merchant's online store.
   * @return availableOnline
  **/
  @ApiModelProperty(value = "If `true`, the item can be added to shipping orders from the merchant's online store.")
  public Boolean getAvailableOnline() {
    return availableOnline;
  }

  public void setAvailableOnline(Boolean availableOnline) {
    this.availableOnline = availableOnline;
  }

  public CatalogItem availableForPickup(Boolean availableForPickup) {
    this.availableForPickup = availableForPickup;
    return this;
  }

   /**
   * If `true`, the item can be added to pickup orders from the merchant's online store.
   * @return availableForPickup
  **/
  @ApiModelProperty(value = "If `true`, the item can be added to pickup orders from the merchant's online store.")
  public Boolean getAvailableForPickup() {
    return availableForPickup;
  }

  public void setAvailableForPickup(Boolean availableForPickup) {
    this.availableForPickup = availableForPickup;
  }

  public CatalogItem availableElectronically(Boolean availableElectronically) {
    this.availableElectronically = availableElectronically;
    return this;
  }

   /**
   * If `true`, the item can be added to electronically fulfilled orders from the merchant's online store.
   * @return availableElectronically
  **/
  @ApiModelProperty(value = "If `true`, the item can be added to electronically fulfilled orders from the merchant's online store.")
  public Boolean getAvailableElectronically() {
    return availableElectronically;
  }

  public void setAvailableElectronically(Boolean availableElectronically) {
    this.availableElectronically = availableElectronically;
  }

  public CatalogItem categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The ID of the item's category, if any.
   * @return categoryId
  **/
  @ApiModelProperty(value = "The ID of the item's category, if any.")
  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public CatalogItem taxIds(List<String> taxIds) {
    this.taxIds = taxIds;
    return this;
  }

  public CatalogItem addTaxIdsItem(String taxIdsItem) {
    this.taxIds.add(taxIdsItem);
    return this;
  }

   /**
   * A set of IDs indicating the [CatalogTax](#type-catalogtax)es that are enabled for this item. When updating an item, any taxes listed here will be added to the item. [CatalogTax](#type-catalogtax)es may also be added to or deleted from an item using `UpdateItemTaxes`.
   * @return taxIds
  **/
  @ApiModelProperty(value = "A set of IDs indicating the [CatalogTax](#type-catalogtax)es that are enabled for this item. When updating an item, any taxes listed here will be added to the item. [CatalogTax](#type-catalogtax)es may also be added to or deleted from an item using `UpdateItemTaxes`.")
  public List<String> getTaxIds() {
    return taxIds;
  }

  public void setTaxIds(List<String> taxIds) {
    this.taxIds = taxIds;
  }

  public CatalogItem modifierListInfo(List<CatalogItemModifierListInfo> modifierListInfo) {
    this.modifierListInfo = modifierListInfo;
    return this;
  }

  public CatalogItem addModifierListInfoItem(CatalogItemModifierListInfo modifierListInfoItem) {
    this.modifierListInfo.add(modifierListInfoItem);
    return this;
  }

   /**
   * A set of [CatalogItemModifierListInfo](#type-catalogitemmodifierlistinfo) objects representing the modifier lists that apply to this item, along with the overrides and min and max limits that are specific to this item. [CatalogModifierList](#type-catalogmodifierlist)s may also be added to or deleted from an item using `UpdateItemModifierLists`.
   * @return modifierListInfo
  **/
  @ApiModelProperty(value = "A set of [CatalogItemModifierListInfo](#type-catalogitemmodifierlistinfo) objects representing the modifier lists that apply to this item, along with the overrides and min and max limits that are specific to this item. [CatalogModifierList](#type-catalogmodifierlist)s may also be added to or deleted from an item using `UpdateItemModifierLists`.")
  public List<CatalogItemModifierListInfo> getModifierListInfo() {
    return modifierListInfo;
  }

  public void setModifierListInfo(List<CatalogItemModifierListInfo> modifierListInfo) {
    this.modifierListInfo = modifierListInfo;
  }

  public CatalogItem variations(List<CatalogObject> variations) {
    this.variations = variations;
    return this;
  }

  public CatalogItem addVariationsItem(CatalogObject variationsItem) {
    this.variations.add(variationsItem);
    return this;
  }

   /**
   * A list of [CatalogObject](#type-catalogobject)s containing the [CatalogItemVariation](#type-catalogitemvariation)s for this item.  Maximum: 250 item variations
   * @return variations
  **/
  @ApiModelProperty(value = "A list of [CatalogObject](#type-catalogobject)s containing the [CatalogItemVariation](#type-catalogitemvariation)s for this item.  Maximum: 250 item variations")
  public List<CatalogObject> getVariations() {
    return variations;
  }

  public void setVariations(List<CatalogObject> variations) {
    this.variations = variations;
  }

  public CatalogItem productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * The product type of the item. May not be changed once an item has been created.  Only items of product type `REGULAR` or `APPOINTMENTS_SERVICE` may be created by this API; items with other product types are read-only. See [CatalogItemProductType](#type-catalogitemproducttype) for possible values
   * @return productType
  **/
  @ApiModelProperty(value = "The product type of the item. May not be changed once an item has been created.  Only items of product type `REGULAR` or `APPOINTMENTS_SERVICE` may be created by this API; items with other product types are read-only. See [CatalogItemProductType](#type-catalogitemproducttype) for possible values")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public CatalogItem skipModifierScreen(Boolean skipModifierScreen) {
    this.skipModifierScreen = skipModifierScreen;
    return this;
  }

   /**
   * If `false`, the Square Point of Sale app will present the [CatalogItem](#type-catalogitem)'s details screen immediately, allowing the merchant to choose [CatalogModifier](#type-catalogmodifier)s before adding the item to the cart.  This is the default behavior.  If `true`, the Square Point of Sale app will immediately add the item to the cart with the pre-selected modifiers, and merchants can edit modifiers by drilling down onto the item's details.  Third-party clients are encouraged to implement similar behaviors.
   * @return skipModifierScreen
  **/
  @ApiModelProperty(value = "If `false`, the Square Point of Sale app will present the [CatalogItem](#type-catalogitem)'s details screen immediately, allowing the merchant to choose [CatalogModifier](#type-catalogmodifier)s before adding the item to the cart.  This is the default behavior.  If `true`, the Square Point of Sale app will immediately add the item to the cart with the pre-selected modifiers, and merchants can edit modifiers by drilling down onto the item's details.  Third-party clients are encouraged to implement similar behaviors.")
  public Boolean getSkipModifierScreen() {
    return skipModifierScreen;
  }

  public void setSkipModifierScreen(Boolean skipModifierScreen) {
    this.skipModifierScreen = skipModifierScreen;
  }

  public CatalogItem itemOptions(List<CatalogItemOptionForItem> itemOptions) {
    this.itemOptions = itemOptions;
    return this;
  }

  public CatalogItem addItemOptionsItem(CatalogItemOptionForItem itemOptionsItem) {
    this.itemOptions.add(itemOptionsItem);
    return this;
  }

   /**
   * List of item options IDs for this item. Used to manage and group item variations in a specified order.  Maximum: 6 item options.
   * @return itemOptions
  **/
  @ApiModelProperty(value = "List of item options IDs for this item. Used to manage and group item variations in a specified order.  Maximum: 6 item options.")
  public List<CatalogItemOptionForItem> getItemOptions() {
    return itemOptions;
  }

  public void setItemOptions(List<CatalogItemOptionForItem> itemOptions) {
    this.itemOptions = itemOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogItem catalogItem = (CatalogItem) o;
    return Objects.equals(this.name, catalogItem.name) &&
        Objects.equals(this.description, catalogItem.description) &&
        Objects.equals(this.abbreviation, catalogItem.abbreviation) &&
        Objects.equals(this.labelColor, catalogItem.labelColor) &&
        Objects.equals(this.availableOnline, catalogItem.availableOnline) &&
        Objects.equals(this.availableForPickup, catalogItem.availableForPickup) &&
        Objects.equals(this.availableElectronically, catalogItem.availableElectronically) &&
        Objects.equals(this.categoryId, catalogItem.categoryId) &&
        Objects.equals(this.taxIds, catalogItem.taxIds) &&
        Objects.equals(this.modifierListInfo, catalogItem.modifierListInfo) &&
        Objects.equals(this.variations, catalogItem.variations) &&
        Objects.equals(this.productType, catalogItem.productType) &&
        Objects.equals(this.skipModifierScreen, catalogItem.skipModifierScreen) &&
        Objects.equals(this.itemOptions, catalogItem.itemOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, abbreviation, labelColor, availableOnline, availableForPickup, availableElectronically, categoryId, taxIds, modifierListInfo, variations, productType, skipModifierScreen, itemOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogItem {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    labelColor: ").append(toIndentedString(labelColor)).append("\n");
    sb.append("    availableOnline: ").append(toIndentedString(availableOnline)).append("\n");
    sb.append("    availableForPickup: ").append(toIndentedString(availableForPickup)).append("\n");
    sb.append("    availableElectronically: ").append(toIndentedString(availableElectronically)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    taxIds: ").append(toIndentedString(taxIds)).append("\n");
    sb.append("    modifierListInfo: ").append(toIndentedString(modifierListInfo)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    skipModifierScreen: ").append(toIndentedString(skipModifierScreen)).append("\n");
    sb.append("    itemOptions: ").append(toIndentedString(itemOptions)).append("\n");
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

