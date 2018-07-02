/*
 * BitMEX API
 *
 * ## REST API for the BitMEX Trading Platform  [View Changelog](/app/apiChangelog)    #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  *All* table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  *This is only a small subset of what is available, to get you started.*  Fill in the parameters and click the `Try it out!` button to try any of these queries.  * [Pricing Data](#!/Quote/Quote_get)  * [Trade Data](#!/Trade/Trade_get)  * [OrderBook Data](#!/OrderBook/OrderBook_getL2)  * [Settlement Data](#!/Settlement/Settlement_get)  * [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)    ## All API Endpoints  Click to expand a section. 
 *
 * API version: 1.2.0
 * Contact: support@bitmex.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package swagger

import (
	"time"
)

// Summary of Open and Closed Positions
type Position struct {
	Account float32 `json:"account"`
	Symbol string `json:"symbol"`
	Currency string `json:"currency"`
	Underlying string `json:"underlying,omitempty"`
	QuoteCurrency string `json:"quoteCurrency,omitempty"`
	Commission float64 `json:"commission,omitempty"`
	InitMarginReq float64 `json:"initMarginReq,omitempty"`
	MaintMarginReq float64 `json:"maintMarginReq,omitempty"`
	RiskLimit float32 `json:"riskLimit,omitempty"`
	Leverage float64 `json:"leverage,omitempty"`
	CrossMargin bool `json:"crossMargin,omitempty"`
	DeleveragePercentile float64 `json:"deleveragePercentile,omitempty"`
	RebalancedPnl float32 `json:"rebalancedPnl,omitempty"`
	PrevRealisedPnl float32 `json:"prevRealisedPnl,omitempty"`
	PrevUnrealisedPnl float32 `json:"prevUnrealisedPnl,omitempty"`
	PrevClosePrice float64 `json:"prevClosePrice,omitempty"`
	OpeningTimestamp time.Time `json:"openingTimestamp,omitempty"`
	OpeningQty float32 `json:"openingQty,omitempty"`
	OpeningCost float32 `json:"openingCost,omitempty"`
	OpeningComm float32 `json:"openingComm,omitempty"`
	OpenOrderBuyQty float32 `json:"openOrderBuyQty,omitempty"`
	OpenOrderBuyCost float32 `json:"openOrderBuyCost,omitempty"`
	OpenOrderBuyPremium float32 `json:"openOrderBuyPremium,omitempty"`
	OpenOrderSellQty float32 `json:"openOrderSellQty,omitempty"`
	OpenOrderSellCost float32 `json:"openOrderSellCost,omitempty"`
	OpenOrderSellPremium float32 `json:"openOrderSellPremium,omitempty"`
	ExecBuyQty float32 `json:"execBuyQty,omitempty"`
	ExecBuyCost float32 `json:"execBuyCost,omitempty"`
	ExecSellQty float32 `json:"execSellQty,omitempty"`
	ExecSellCost float32 `json:"execSellCost,omitempty"`
	ExecQty float32 `json:"execQty,omitempty"`
	ExecCost float32 `json:"execCost,omitempty"`
	ExecComm float32 `json:"execComm,omitempty"`
	CurrentTimestamp time.Time `json:"currentTimestamp,omitempty"`
	CurrentQty float32 `json:"currentQty,omitempty"`
	CurrentCost float32 `json:"currentCost,omitempty"`
	CurrentComm float32 `json:"currentComm,omitempty"`
	RealisedCost float32 `json:"realisedCost,omitempty"`
	UnrealisedCost float32 `json:"unrealisedCost,omitempty"`
	GrossOpenCost float32 `json:"grossOpenCost,omitempty"`
	GrossOpenPremium float32 `json:"grossOpenPremium,omitempty"`
	GrossExecCost float32 `json:"grossExecCost,omitempty"`
	IsOpen bool `json:"isOpen,omitempty"`
	MarkPrice float64 `json:"markPrice,omitempty"`
	MarkValue float32 `json:"markValue,omitempty"`
	RiskValue float32 `json:"riskValue,omitempty"`
	HomeNotional float64 `json:"homeNotional,omitempty"`
	ForeignNotional float64 `json:"foreignNotional,omitempty"`
	PosState string `json:"posState,omitempty"`
	PosCost float32 `json:"posCost,omitempty"`
	PosCost2 float32 `json:"posCost2,omitempty"`
	PosCross float32 `json:"posCross,omitempty"`
	PosInit float32 `json:"posInit,omitempty"`
	PosComm float32 `json:"posComm,omitempty"`
	PosLoss float32 `json:"posLoss,omitempty"`
	PosMargin float32 `json:"posMargin,omitempty"`
	PosMaint float32 `json:"posMaint,omitempty"`
	PosAllowance float32 `json:"posAllowance,omitempty"`
	TaxableMargin float32 `json:"taxableMargin,omitempty"`
	InitMargin float32 `json:"initMargin,omitempty"`
	MaintMargin float32 `json:"maintMargin,omitempty"`
	SessionMargin float32 `json:"sessionMargin,omitempty"`
	TargetExcessMargin float32 `json:"targetExcessMargin,omitempty"`
	VarMargin float32 `json:"varMargin,omitempty"`
	RealisedGrossPnl float32 `json:"realisedGrossPnl,omitempty"`
	RealisedTax float32 `json:"realisedTax,omitempty"`
	RealisedPnl float32 `json:"realisedPnl,omitempty"`
	UnrealisedGrossPnl float32 `json:"unrealisedGrossPnl,omitempty"`
	LongBankrupt float32 `json:"longBankrupt,omitempty"`
	ShortBankrupt float32 `json:"shortBankrupt,omitempty"`
	TaxBase float32 `json:"taxBase,omitempty"`
	IndicativeTaxRate float64 `json:"indicativeTaxRate,omitempty"`
	IndicativeTax float32 `json:"indicativeTax,omitempty"`
	UnrealisedTax float32 `json:"unrealisedTax,omitempty"`
	UnrealisedPnl float32 `json:"unrealisedPnl,omitempty"`
	UnrealisedPnlPcnt float64 `json:"unrealisedPnlPcnt,omitempty"`
	UnrealisedRoePcnt float64 `json:"unrealisedRoePcnt,omitempty"`
	SimpleQty float64 `json:"simpleQty,omitempty"`
	SimpleCost float64 `json:"simpleCost,omitempty"`
	SimpleValue float64 `json:"simpleValue,omitempty"`
	SimplePnl float64 `json:"simplePnl,omitempty"`
	SimplePnlPcnt float64 `json:"simplePnlPcnt,omitempty"`
	AvgCostPrice float64 `json:"avgCostPrice,omitempty"`
	AvgEntryPrice float64 `json:"avgEntryPrice,omitempty"`
	BreakEvenPrice float64 `json:"breakEvenPrice,omitempty"`
	MarginCallPrice float64 `json:"marginCallPrice,omitempty"`
	LiquidationPrice float64 `json:"liquidationPrice,omitempty"`
	BankruptPrice float64 `json:"bankruptPrice,omitempty"`
	Timestamp time.Time `json:"timestamp,omitempty"`
	LastPrice float64 `json:"lastPrice,omitempty"`
	LastValue float32 `json:"lastValue,omitempty"`
}
