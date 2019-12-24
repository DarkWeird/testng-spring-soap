package me.darkweird.testing.config;

import generated.BLZService;
import generated.BLZServicePortType;
import generated.Calculator;
import generated.CalculatorSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapConfiguration {

    @Bean
    public BLZService blzService(){
        return new BLZService();
    }

    @Bean
    @Autowired
    public BLZServicePortType blzServicePortType(BLZService blzService){
        return blzService.getBLZServiceSOAP11PortHttp();
    }

    @Bean
    public Calculator calculator(){
        return new Calculator();
    }

    @Bean
    @Autowired
    public CalculatorSoap calculatorSoapService(Calculator calculator){
        return calculator.getCalculatorSoap();
    }
}

