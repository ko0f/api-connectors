<?php
/**
 * User
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * BitMEX API
 *
 * ## REST API for the BitMEX Trading Platform  [View Changelog](/app/apiChangelog)    #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  *All* table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  *This is only a small subset of what is available, to get you started.*  Fill in the parameters and click the `Try it out!` button to try any of these queries.  * [Pricing Data](#!/Quote/Quote_get)  * [Trade Data](#!/Trade/Trade_get)  * [OrderBook Data](#!/OrderBook/OrderBook_getL2)  * [Settlement Data](#!/Settlement/Settlement_get)  * [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)    ## All API Endpoints  Click to expand a section.
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.0-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * User Class Doc Comment
 *
 * @category Class
 * @description Account Operations
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class User implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'User';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'id' => 'float',
        'owner_id' => 'float',
        'firstname' => 'string',
        'lastname' => 'string',
        'username' => 'string',
        'email' => 'string',
        'phone' => 'string',
        'created' => '\DateTime',
        'last_updated' => '\DateTime',
        'preferences' => '\Swagger\Client\Model\UserPreferences',
        'tfa_enabled' => 'string',
        'affiliate_id' => 'string',
        'pgp_pub_key' => 'string',
        'country' => 'string',
        'typ' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'id' => 'int32',
        'owner_id' => 'int32',
        'firstname' => null,
        'lastname' => null,
        'username' => null,
        'email' => null,
        'phone' => null,
        'created' => 'date-time',
        'last_updated' => 'date-time',
        'preferences' => null,
        'tfa_enabled' => null,
        'affiliate_id' => null,
        'pgp_pub_key' => null,
        'country' => null,
        'typ' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'id' => 'id',
        'owner_id' => 'ownerId',
        'firstname' => 'firstname',
        'lastname' => 'lastname',
        'username' => 'username',
        'email' => 'email',
        'phone' => 'phone',
        'created' => 'created',
        'last_updated' => 'lastUpdated',
        'preferences' => 'preferences',
        'tfa_enabled' => 'TFAEnabled',
        'affiliate_id' => 'affiliateID',
        'pgp_pub_key' => 'pgpPubKey',
        'country' => 'country',
        'typ' => 'typ'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'id' => 'setId',
        'owner_id' => 'setOwnerId',
        'firstname' => 'setFirstname',
        'lastname' => 'setLastname',
        'username' => 'setUsername',
        'email' => 'setEmail',
        'phone' => 'setPhone',
        'created' => 'setCreated',
        'last_updated' => 'setLastUpdated',
        'preferences' => 'setPreferences',
        'tfa_enabled' => 'setTfaEnabled',
        'affiliate_id' => 'setAffiliateId',
        'pgp_pub_key' => 'setPgpPubKey',
        'country' => 'setCountry',
        'typ' => 'setTyp'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'id' => 'getId',
        'owner_id' => 'getOwnerId',
        'firstname' => 'getFirstname',
        'lastname' => 'getLastname',
        'username' => 'getUsername',
        'email' => 'getEmail',
        'phone' => 'getPhone',
        'created' => 'getCreated',
        'last_updated' => 'getLastUpdated',
        'preferences' => 'getPreferences',
        'tfa_enabled' => 'getTfaEnabled',
        'affiliate_id' => 'getAffiliateId',
        'pgp_pub_key' => 'getPgpPubKey',
        'country' => 'getCountry',
        'typ' => 'getTyp'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['owner_id'] = isset($data['owner_id']) ? $data['owner_id'] : null;
        $this->container['firstname'] = isset($data['firstname']) ? $data['firstname'] : null;
        $this->container['lastname'] = isset($data['lastname']) ? $data['lastname'] : null;
        $this->container['username'] = isset($data['username']) ? $data['username'] : null;
        $this->container['email'] = isset($data['email']) ? $data['email'] : null;
        $this->container['phone'] = isset($data['phone']) ? $data['phone'] : null;
        $this->container['created'] = isset($data['created']) ? $data['created'] : null;
        $this->container['last_updated'] = isset($data['last_updated']) ? $data['last_updated'] : null;
        $this->container['preferences'] = isset($data['preferences']) ? $data['preferences'] : null;
        $this->container['tfa_enabled'] = isset($data['tfa_enabled']) ? $data['tfa_enabled'] : null;
        $this->container['affiliate_id'] = isset($data['affiliate_id']) ? $data['affiliate_id'] : null;
        $this->container['pgp_pub_key'] = isset($data['pgp_pub_key']) ? $data['pgp_pub_key'] : null;
        $this->container['country'] = isset($data['country']) ? $data['country'] : null;
        $this->container['typ'] = isset($data['typ']) ? $data['typ'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['username'] === null) {
            $invalidProperties[] = "'username' can't be null";
        }
        if ($this->container['email'] === null) {
            $invalidProperties[] = "'email' can't be null";
        }
        if (!is_null($this->container['affiliate_id']) && (mb_strlen($this->container['affiliate_id']) > 6)) {
            $invalidProperties[] = "invalid value for 'affiliate_id', the character length must be smaller than or equal to 6.";
        }

        if (!is_null($this->container['pgp_pub_key']) && (mb_strlen($this->container['pgp_pub_key']) > 16384)) {
            $invalidProperties[] = "invalid value for 'pgp_pub_key', the character length must be smaller than or equal to 16384.";
        }

        if (!is_null($this->container['country']) && (mb_strlen($this->container['country']) > 3)) {
            $invalidProperties[] = "invalid value for 'country', the character length must be smaller than or equal to 3.";
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets id
     *
     * @return float
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param float $id id
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets owner_id
     *
     * @return float
     */
    public function getOwnerId()
    {
        return $this->container['owner_id'];
    }

    /**
     * Sets owner_id
     *
     * @param float $owner_id owner_id
     *
     * @return $this
     */
    public function setOwnerId($owner_id)
    {
        $this->container['owner_id'] = $owner_id;

        return $this;
    }

    /**
     * Gets firstname
     *
     * @return string
     */
    public function getFirstname()
    {
        return $this->container['firstname'];
    }

    /**
     * Sets firstname
     *
     * @param string $firstname firstname
     *
     * @return $this
     */
    public function setFirstname($firstname)
    {
        $this->container['firstname'] = $firstname;

        return $this;
    }

    /**
     * Gets lastname
     *
     * @return string
     */
    public function getLastname()
    {
        return $this->container['lastname'];
    }

    /**
     * Sets lastname
     *
     * @param string $lastname lastname
     *
     * @return $this
     */
    public function setLastname($lastname)
    {
        $this->container['lastname'] = $lastname;

        return $this;
    }

    /**
     * Gets username
     *
     * @return string
     */
    public function getUsername()
    {
        return $this->container['username'];
    }

    /**
     * Sets username
     *
     * @param string $username username
     *
     * @return $this
     */
    public function setUsername($username)
    {
        $this->container['username'] = $username;

        return $this;
    }

    /**
     * Gets email
     *
     * @return string
     */
    public function getEmail()
    {
        return $this->container['email'];
    }

    /**
     * Sets email
     *
     * @param string $email email
     *
     * @return $this
     */
    public function setEmail($email)
    {
        $this->container['email'] = $email;

        return $this;
    }

    /**
     * Gets phone
     *
     * @return string
     */
    public function getPhone()
    {
        return $this->container['phone'];
    }

    /**
     * Sets phone
     *
     * @param string $phone phone
     *
     * @return $this
     */
    public function setPhone($phone)
    {
        $this->container['phone'] = $phone;

        return $this;
    }

    /**
     * Gets created
     *
     * @return \DateTime
     */
    public function getCreated()
    {
        return $this->container['created'];
    }

    /**
     * Sets created
     *
     * @param \DateTime $created created
     *
     * @return $this
     */
    public function setCreated($created)
    {
        $this->container['created'] = $created;

        return $this;
    }

    /**
     * Gets last_updated
     *
     * @return \DateTime
     */
    public function getLastUpdated()
    {
        return $this->container['last_updated'];
    }

    /**
     * Sets last_updated
     *
     * @param \DateTime $last_updated last_updated
     *
     * @return $this
     */
    public function setLastUpdated($last_updated)
    {
        $this->container['last_updated'] = $last_updated;

        return $this;
    }

    /**
     * Gets preferences
     *
     * @return \Swagger\Client\Model\UserPreferences
     */
    public function getPreferences()
    {
        return $this->container['preferences'];
    }

    /**
     * Sets preferences
     *
     * @param \Swagger\Client\Model\UserPreferences $preferences preferences
     *
     * @return $this
     */
    public function setPreferences($preferences)
    {
        $this->container['preferences'] = $preferences;

        return $this;
    }

    /**
     * Gets tfa_enabled
     *
     * @return string
     */
    public function getTfaEnabled()
    {
        return $this->container['tfa_enabled'];
    }

    /**
     * Sets tfa_enabled
     *
     * @param string $tfa_enabled tfa_enabled
     *
     * @return $this
     */
    public function setTfaEnabled($tfa_enabled)
    {
        $this->container['tfa_enabled'] = $tfa_enabled;

        return $this;
    }

    /**
     * Gets affiliate_id
     *
     * @return string
     */
    public function getAffiliateId()
    {
        return $this->container['affiliate_id'];
    }

    /**
     * Sets affiliate_id
     *
     * @param string $affiliate_id affiliate_id
     *
     * @return $this
     */
    public function setAffiliateId($affiliate_id)
    {
        if (!is_null($affiliate_id) && (mb_strlen($affiliate_id) > 6)) {
            throw new \InvalidArgumentException('invalid length for $affiliate_id when calling User., must be smaller than or equal to 6.');
        }

        $this->container['affiliate_id'] = $affiliate_id;

        return $this;
    }

    /**
     * Gets pgp_pub_key
     *
     * @return string
     */
    public function getPgpPubKey()
    {
        return $this->container['pgp_pub_key'];
    }

    /**
     * Sets pgp_pub_key
     *
     * @param string $pgp_pub_key pgp_pub_key
     *
     * @return $this
     */
    public function setPgpPubKey($pgp_pub_key)
    {
        if (!is_null($pgp_pub_key) && (mb_strlen($pgp_pub_key) > 16384)) {
            throw new \InvalidArgumentException('invalid length for $pgp_pub_key when calling User., must be smaller than or equal to 16384.');
        }

        $this->container['pgp_pub_key'] = $pgp_pub_key;

        return $this;
    }

    /**
     * Gets country
     *
     * @return string
     */
    public function getCountry()
    {
        return $this->container['country'];
    }

    /**
     * Sets country
     *
     * @param string $country country
     *
     * @return $this
     */
    public function setCountry($country)
    {
        if (!is_null($country) && (mb_strlen($country) > 3)) {
            throw new \InvalidArgumentException('invalid length for $country when calling User., must be smaller than or equal to 3.');
        }

        $this->container['country'] = $country;

        return $this;
    }

    /**
     * Gets typ
     *
     * @return string
     */
    public function getTyp()
    {
        return $this->container['typ'];
    }

    /**
     * Sets typ
     *
     * @param string $typ typ
     *
     * @return $this
     */
    public function setTyp($typ)
    {
        $this->container['typ'] = $typ;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


