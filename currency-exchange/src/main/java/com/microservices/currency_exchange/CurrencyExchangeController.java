package com.microservices.currency_exchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private CurrencyExchangeRepository repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange currencyExchange(@PathVariable String from,@PathVariable String to){
        //return new CurrencyExchange(1L,"USD","INR", BigDecimal.valueOf(83));
        return repository.findByFromAndTo(from,to);
    }
}
