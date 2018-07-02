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
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * Trollbox Data
 */
@ApiModel(description = "Trollbox Data")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-31T16:00:32.015Z")
public class Chat {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("html")
  private String html = null;

  @SerializedName("fromBot")
  private Boolean fromBot = false;

  @SerializedName("channelID")
  private Double channelID = null;

  public Chat id(BigDecimal id) {
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

  public Chat date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Chat user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public Chat message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Chat html(String html) {
    this.html = html;
    return this;
  }

   /**
   * Get html
   * @return html
  **/
  @ApiModelProperty(required = true, value = "")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public Chat fromBot(Boolean fromBot) {
    this.fromBot = fromBot;
    return this;
  }

   /**
   * Get fromBot
   * @return fromBot
  **/
  @ApiModelProperty(value = "")
  public Boolean isFromBot() {
    return fromBot;
  }

  public void setFromBot(Boolean fromBot) {
    this.fromBot = fromBot;
  }

  public Chat channelID(Double channelID) {
    this.channelID = channelID;
    return this;
  }

   /**
   * Get channelID
   * @return channelID
  **/
  @ApiModelProperty(value = "")
  public Double getChannelID() {
    return channelID;
  }

  public void setChannelID(Double channelID) {
    this.channelID = channelID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chat chat = (Chat) o;
    return Objects.equals(this.id, chat.id) &&
        Objects.equals(this.date, chat.date) &&
        Objects.equals(this.user, chat.user) &&
        Objects.equals(this.message, chat.message) &&
        Objects.equals(this.html, chat.html) &&
        Objects.equals(this.fromBot, chat.fromBot) &&
        Objects.equals(this.channelID, chat.channelID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, user, message, html, fromBot, channelID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chat {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    fromBot: ").append(toIndentedString(fromBot)).append("\n");
    sb.append("    channelID: ").append(toIndentedString(channelID)).append("\n");
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

