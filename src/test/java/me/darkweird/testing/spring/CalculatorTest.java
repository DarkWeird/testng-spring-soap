package me.darkweird.testing.spring;

import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.tempuri.CalculatorSoap;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CalculatorTest extends SpringBaseTest{


    @Autowired
    CalculatorSoap calculatorSoap;

    @Test(expectedExceptions = ServerSOAPFaultException.class)
    public void testDivideByZero(){
            calculatorSoap.divide(5, 0);
        }

    @Test()
    public void testAdd(){
        Assert.assertEquals(calculatorSoap.add(5, 2), 7);
    }

    @Test()
    public void testAddMinus(){
        Assert.assertEquals(calculatorSoap.add(-5, -2), -7);
    }

    @Test()
    public void testMultiply(){
        Assert.assertEquals(calculatorSoap.multiply(5, 2), 10);
    }

    @Test()
    public void testMinus(){
        Assert.assertEquals(calculatorSoap.subtract(5, 2), 3);
    }
}


