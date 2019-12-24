package me.darkweird.testing.config;

import generated.org.tempuri.Calculator;
import generated.org.tempuri.CalculatorSoap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCalc {

    @Bean
    public CalculatorSoap getCalculatorSoap() {
      return new Calculator().getCalculatorSoap();
    }
}
