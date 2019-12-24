package me.darkweird.testing.config;

import generated.BLZService;
import generated.BLZServicePortType;
import me.darkweird.testing.calc.Calculator;
import me.darkweird.testing.service.CalculatorSoap;
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
    public Calculator CalculatorService() {return new Calculator(); }

    @Bean
    @Autowired
    public CalculatorSoap CalculatorSoapService(Calculator calculator){
        return calculator.getCalculatorSoap();
    }
}

