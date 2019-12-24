package me.darkweird.testing.spring;

import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;
import generated.DetailsType;
import me.darkweird.testing.data.BLZDao;
import me.darkweird.testing.model.BLZ;
import me.darkweird.testing.service.BlzCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.List;

public class CalculatorTest extends SpringBaseTest{

    @Autowired
    Calculator calculator;

    @Test(expectedExceptions = ServerSOAPFaultException.class)
        public void testDivideByZero(){
            calculator.getCalculatorSoap().divide(5, 0);
        }

    @Test()
    public void testAdd(){
        Assert.assertEquals(calculator.getCalculatorSoap().add(5, 2), 7);
}
    }


