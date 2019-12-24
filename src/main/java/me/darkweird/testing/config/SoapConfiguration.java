package me.darkweird.testing.config;

import generated.generated.BLZService;
import generated.generated.BLZServicePortType;
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
}

