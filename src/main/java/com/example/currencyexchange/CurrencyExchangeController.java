package com.example.currencyexchange;

import com.example.currencyexchange.ExchangeValueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private ExchangeValueRepository repository;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchangeBean retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to
    ) {
        CurrencyExchangeBean exchangeValue = repository.findByFromAndTo(from, to);
        logger.info("ExchangeValue: {}", exchangeValue);
        return exchangeValue;
    }
}
