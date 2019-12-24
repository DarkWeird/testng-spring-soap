package me.darkweird.testing.impl;

import generated.BLZServicePortType;
import generated.DetailsType;
import me.darkweird.testing.service.BlzCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.Robar3.CalculatorSoap;


@Service
public class BlzCodeServiceImpl implements BlzCodeService {

//    @Autowired
//    CalculatorSoap calculatorSoap;
    @Autowired
    BLZServicePortType blzServicePortType;

    @Override
    public DetailsType getBank(String blz) {
        return blzServicePortType.getBank(blz);
    }
//    @Override
//    public DetailsType getCalculatorSoap(String calc){
//        return calculatorSoap.
//    }
}
