package com.biteasy.market.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by weijun on 16/3/25.
 */
@Entity
public class MetalMarket {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column
    private String Outcome;

    @Column
    private String Message;

    @Column
    private String Identity;

    @Column
    private double Delay;

    @Column
    private String Name;

    @Column
    private String Symbol;

    @Column
    private String Unit;

    @Column
    private String QuoteType;

    @Column
    private String Currency;

    @Column
    private String Date;

    @Column
    private String Time;

    @Column
    private double Bid;

    @Column
    private double Mid;

    @Column
    private double Ask;

    @Column
    private double Spread;

    @Column
    private String Source;

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
