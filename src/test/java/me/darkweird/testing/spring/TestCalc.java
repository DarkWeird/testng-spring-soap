package me.darkweird.testing.spring;

import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;
import generated.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc extends SpringBaseTest{

    @Autowired
    Calculator calculator;

    @Test
    public void testSoapMultiply(){
        Assert.assertEquals(calculator.getCalculatorSoap().multiply(4,5),20);
    }

    @Test
    public void testSoapDivide(){
        Assert.assertEquals(calculator.getCalculatorSoap().divide(10,2),5);
    }

    @Test(expectedExceptions = ServerSOAPFaultException.class)
    public void testSoapDivideOnZero(){
        Assert.assertEquals(calculator.getCalculatorSoap().divide(10,0),0);
    }

    @Test
    public void testSoapAdd(){
        Assert.assertEquals(calculator.getCalculatorSoap().add(500,500),1000);
    }

    @Test
    public void testSoapAddBinary(){
        Assert.assertEquals(calculator.getCalculatorSoap().add(0b010,0b010),4);
    }
}
