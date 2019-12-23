package me.darkweird.testing.impl;

import generated.BLZServicePortType;
import generated.DetailsType;
import me.darkweird.testing.service.BlzCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BlzCodeServiceImpl implements BlzCodeService {

    @Autowired
    BLZServicePortType blzServicePortType;

    @Override
    public DetailsType getBank(String blz) {
        return blzServicePortType.getBank(blz);
    }
}
