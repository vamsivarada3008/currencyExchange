package com.example.currencyexchange;

import com.example.currencyexchange.CurrencyExchangeBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<CurrencyExchangeBean, Long> {
    CurrencyExchangeBean findByFromAndTo(String from, String to);
}
