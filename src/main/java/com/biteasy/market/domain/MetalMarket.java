package com.biteasy.market.domain;

import com.xignite.sdk.api.webservices.XigniteGlobalMetals.Models.MetalQuote;

/**
 * Created by weijun on 16/3/25.
 */
public class MetalMarket {

    private Long id;


    private String Outcome;


    private String Message;


    private String Identity;


    private double Delay;


    private String Name;


    private String Symbol;


    private String Unit;


    private String QuoteType;


    private String Currency;


    private String Date;


    private String Time;


    private double Bid;


    private double Mid;


    private double Ask;


    private double Spread;


    private String Source;

    public MetalMarket (MetalQuote quote) {
        setOutcome (quote.Outcome);
        setMessage(quote.Message);
        setIdentity(quote.Identity);
        setDelay(quote.Delay);
        setName(quote.Name);
        setSymbol(quote.Symbol);
        setUnit(quote.Unit);
        setQuoteType(quote.QuoteType);
        setCurrency(quote.Currency);
        setDate(quote.Date);
        setTime(quote.Time);
        setBid(quote.Bid);
        setAsk(quote.Ask);
        setSpread(quote.Spread);
        setSource (quote.Source);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutcome() {
        return Outcome;
    }

    public void setOutcome(String outcome) {
        Outcome = outcome;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getIdentity() {
        return Identity;
    }

    public void setIdentity(String identity) {
        Identity = identity;
    }

    public double getDelay() {
        return Delay;
    }

    public void setDelay(double delay) {
        Delay = delay;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getQuoteType() {
        return QuoteType;
    }

    public void setQuoteType(String quoteType) {
        QuoteType = quoteType;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public double getBid() {
        return Bid;
    }

    public void setBid(double bid) {
        Bid = bid;
    }

    public double getMid() {
        return Mid;
    }

    public void setMid(double mid) {
        Mid = mid;
    }

    public double getAsk() {
        return Ask;
    }

    public void setAsk(double ask) {
        Ask = ask;
    }

    public double getSpread() {
        return Spread;
    }

    public void setSpread(double spread) {
        Spread = spread;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }
}
