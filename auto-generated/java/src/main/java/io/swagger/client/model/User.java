/*
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  [View Changelog](/app/apiChangelog)    #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  *All* table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  *This is only a small subset of what is available, to get you started.*  Fill in the parameters and click the `Try it out!` button to try any of these queries.  * [Pricing Data](#!/Quote/Quote_get)  * [Trade Data](#!/Trade/Trade_get)  * [OrderBook Data](#!/OrderBook/OrderBook_getL2)  * [Settlement Data](#!/Settlement/Settlement_get)  * [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)    ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserPreferences;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * Account Operations
 */
@ApiModel(description = "Account Operations")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-16T16:31:01.031Z")
public class User {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("ownerId")
  private BigDecimal ownerId = null;

  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("lastname")
  private String lastname = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("preferences")
  private UserPreferences preferences = null;

  @SerializedName("TFAEnabled")
  private String tfAEnabled = null;

  @SerializedName("affiliateID")
  private String affiliateID = null;

  @SerializedName("pgpPubKey")
  private String pgpPubKey = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("geoipCountry")
  private String geoipCountry = null;

  @SerializedName("geoipRegion")
  private String geoipRegion = null;

  @SerializedName("typ")
  private String typ = null;

  public User id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public User ownerId(BigDecimal ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(BigDecimal ownerId) {
    this.ownerId = ownerId;
  }

  public User firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @ApiModelProperty(value = "")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public User lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @ApiModelProperty(value = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public User created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public User lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public User preferences(UserPreferences preferences) {
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @ApiModelProperty(value = "")
  public UserPreferences getPreferences() {
    return preferences;
  }

  public void setPreferences(UserPreferences preferences) {
    this.preferences = preferences;
  }

  public User tfAEnabled(String tfAEnabled) {
    this.tfAEnabled = tfAEnabled;
    return this;
  }

   /**
   * Get tfAEnabled
   * @return tfAEnabled
  **/
  @ApiModelProperty(value = "")
  public String getTfAEnabled() {
    return tfAEnabled;
  }

  public void setTfAEnabled(String tfAEnabled) {
    this.tfAEnabled = tfAEnabled;
  }

  public User affiliateID(String affiliateID) {
    this.affiliateID = affiliateID;
    return this;
  }

   /**
   * Get affiliateID
   * @return affiliateID
  **/
  @ApiModelProperty(value = "")
  public String getAffiliateID() {
    return affiliateID;
  }

  public void setAffiliateID(String affiliateID) {
    this.affiliateID = affiliateID;
  }

  public User pgpPubKey(String pgpPubKey) {
    this.pgpPubKey = pgpPubKey;
    return this;
  }

   /**
   * Get pgpPubKey
   * @return pgpPubKey
  **/
  @ApiModelProperty(value = "")
  public String getPgpPubKey() {
    return pgpPubKey;
  }

  public void setPgpPubKey(String pgpPubKey) {
    this.pgpPubKey = pgpPubKey;
  }

  public User country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public User geoipCountry(String geoipCountry) {
    this.geoipCountry = geoipCountry;
    return this;
  }

   /**
   * Get geoipCountry
   * @return geoipCountry
  **/
  @ApiModelProperty(value = "")
  public String getGeoipCountry() {
    return geoipCountry;
  }

  public void setGeoipCountry(String geoipCountry) {
    this.geoipCountry = geoipCountry;
  }

  public User geoipRegion(String geoipRegion) {
    this.geoipRegion = geoipRegion;
    return this;
  }

   /**
   * Get geoipRegion
   * @return geoipRegion
  **/
  @ApiModelProperty(value = "")
  public String getGeoipRegion() {
    return geoipRegion;
  }

  public void setGeoipRegion(String geoipRegion) {
    this.geoipRegion = geoipRegion;
  }

  public User typ(String typ) {
    this.typ = typ;
    return this;
  }

   /**
   * Get typ
   * @return typ
  **/
  @ApiModelProperty(value = "")
  public String getTyp() {
    return typ;
  }

  public void setTyp(String typ) {
    this.typ = typ;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.ownerId, user.ownerId) &&
        Objects.equals(this.firstname, user.firstname) &&
        Objects.equals(this.lastname, user.lastname) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.created, user.created) &&
        Objects.equals(this.lastUpdated, user.lastUpdated) &&
        Objects.equals(this.preferences, user.preferences) &&
        Objects.equals(this.tfAEnabled, user.tfAEnabled) &&
        Objects.equals(this.affiliateID, user.affiliateID) &&
        Objects.equals(this.pgpPubKey, user.pgpPubKey) &&
        Objects.equals(this.country, user.country) &&
        Objects.equals(this.geoipCountry, user.geoipCountry) &&
        Objects.equals(this.geoipRegion, user.geoipRegion) &&
        Objects.equals(this.typ, user.typ);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ownerId, firstname, lastname, username, email, phone, created, lastUpdated, preferences, tfAEnabled, affiliateID, pgpPubKey, country, geoipCountry, geoipRegion, typ);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    tfAEnabled: ").append(toIndentedString(tfAEnabled)).append("\n");
    sb.append("    affiliateID: ").append(toIndentedString(affiliateID)).append("\n");
    sb.append("    pgpPubKey: ").append(toIndentedString(pgpPubKey)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    geoipCountry: ").append(toIndentedString(geoipCountry)).append("\n");
    sb.append("    geoipRegion: ").append(toIndentedString(geoipRegion)).append("\n");
    sb.append("    typ: ").append(toIndentedString(typ)).append("\n");
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

