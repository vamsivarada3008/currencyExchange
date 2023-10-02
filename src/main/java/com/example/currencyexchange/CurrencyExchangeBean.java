package com.example.currencyexchange;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
@Entity
public class CurrencyExchangeBean {
    @Id
    private Long id;
    @Column(name="currency_from")
    private String from;

    public CurrencyExchangeBean() {

    }

    @Column(name="currency_to")
    private String to;
    
    @Column(name="conversion_multiple")
    private BigDecimal conversionMultiple;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
}
