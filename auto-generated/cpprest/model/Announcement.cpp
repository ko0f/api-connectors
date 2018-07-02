/**
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  [View Changelog](/app/apiChangelog)    #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  *All* table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  *This is only a small subset of what is available, to get you started.*  Fill in the parameters and click the `Try it out!` button to try any of these queries.  * [Pricing Data](#!/Quote/Quote_get)  * [Trade Data](#!/Trade/Trade_get)  * [OrderBook Data](#!/OrderBook/OrderBook_getL2)  * [Settlement Data](#!/Settlement/Settlement_get)  * [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)    ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.0-SNAPSHOT.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */



#include "Announcement.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Announcement::Announcement()
{
    m_Id = 0.0;
    m_Link = utility::conversions::to_string_t("");
    m_LinkIsSet = false;
    m_Title = utility::conversions::to_string_t("");
    m_TitleIsSet = false;
    m_Content = utility::conversions::to_string_t("");
    m_ContentIsSet = false;
    m_date = utility::datetime();
    m_dateIsSet = false;
}

Announcement::~Announcement()
{
}

void Announcement::validate()
{
    // TODO: implement validation
}

web::json::value Announcement::toJson() const
{
    web::json::value val = web::json::value::object();

    val[utility::conversions::to_string_t("id")] = ModelBase::toJson(m_Id);
    if(m_LinkIsSet)
    {
        val[utility::conversions::to_string_t("link")] = ModelBase::toJson(m_Link);
    }
    if(m_TitleIsSet)
    {
        val[utility::conversions::to_string_t("title")] = ModelBase::toJson(m_Title);
    }
    if(m_ContentIsSet)
    {
        val[utility::conversions::to_string_t("content")] = ModelBase::toJson(m_Content);
    }
    if(m_dateIsSet)
    {
        val[utility::conversions::to_string_t("date")] = ModelBase::toJson(m_date);
    }

    return val;
}

void Announcement::fromJson(web::json::value& val)
{
    setId(ModelBase::doubleFromJson(val[utility::conversions::to_string_t("id")]));
    if(val.has_field(utility::conversions::to_string_t("link")))
    {
        setLink(ModelBase::stringFromJson(val[utility::conversions::to_string_t("link")]));
    }
    if(val.has_field(utility::conversions::to_string_t("title")))
    {
        setTitle(ModelBase::stringFromJson(val[utility::conversions::to_string_t("title")]));
    }
    if(val.has_field(utility::conversions::to_string_t("content")))
    {
        setContent(ModelBase::stringFromJson(val[utility::conversions::to_string_t("content")]));
    }
    if(val.has_field(utility::conversions::to_string_t("date")))
    {
        setDate(ModelBase::dateFromJson(val[utility::conversions::to_string_t("date")]));
    }
}

void Announcement::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("id"), m_Id));
    if(m_LinkIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("link"), m_Link));
        
    }
    if(m_TitleIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("title"), m_Title));
        
    }
    if(m_ContentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("content"), m_Content));
        
    }
    if(m_dateIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("date"), m_date));
        
    }
}

void Announcement::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    setId(ModelBase::doubleFromHttpContent(multipart->getContent(utility::conversions::to_string_t("id"))));
    if(multipart->hasContent(utility::conversions::to_string_t("link")))
    {
        setLink(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("link"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("title")))
    {
        setTitle(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("title"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("content")))
    {
        setContent(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("content"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("date")))
    {
        setDate(ModelBase::dateFromHttpContent(multipart->getContent(utility::conversions::to_string_t("date"))));
    }
}

double Announcement::getId() const
{
    return m_Id;
}


void Announcement::setId(double value)
{
    m_Id = value;
    
}
utility::string_t Announcement::getLink() const
{
    return m_Link;
}


void Announcement::setLink(utility::string_t value)
{
    m_Link = value;
    m_LinkIsSet = true;
}
bool Announcement::linkIsSet() const
{
    return m_LinkIsSet;
}

void Announcement::unsetLink()
{
    m_LinkIsSet = false;
}

utility::string_t Announcement::getTitle() const
{
    return m_Title;
}


void Announcement::setTitle(utility::string_t value)
{
    m_Title = value;
    m_TitleIsSet = true;
}
bool Announcement::titleIsSet() const
{
    return m_TitleIsSet;
}

void Announcement::unsetTitle()
{
    m_TitleIsSet = false;
}

utility::string_t Announcement::getContent() const
{
    return m_Content;
}


void Announcement::setContent(utility::string_t value)
{
    m_Content = value;
    m_ContentIsSet = true;
}
bool Announcement::contentIsSet() const
{
    return m_ContentIsSet;
}

void Announcement::unsetContent()
{
    m_ContentIsSet = false;
}

utility::datetime Announcement::getDate() const
{
    return m_date;
}


void Announcement::setDate(utility::datetime value)
{
    m_date = value;
    m_dateIsSet = true;
}
bool Announcement::dateIsSet() const
{
    return m_dateIsSet;
}

void Announcement::unsetdate()
{
    m_dateIsSet = false;
}

}
}
}
}

