package me.darkweird.testing.spring;

import com.sun.xml.ws.fault.ServerSOAPFaultException;
import me.darkweird.testing.config.SoapConfiguration;
import me.darkweird.testing.service.BlzCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;
import ru.Robar3.CalculatorSoap;

@Test
public class CalcExampleTest extends SpringCalcTest{
@Autowired
    CalculatorSoap calculatorSoap;
@Test
    public void testAdd(){
    Assert.assertEquals(calculatorSoap.add(2,2),4);
}
@Test
    public void testMultiple(){
    Assert.assertEquals(calculatorSoap.multiply(5,2),10);
}
@Test
    public void testSubtract(){
    Assert.assertEquals(calculatorSoap.subtract(10,5),5);
}
@Test
    public void testDivide(){
    Assert.assertEquals(calculatorSoap.divide(20,2),10);
}
@Test (expectedExceptions = ServerSOAPFaultException.class)
    public void testFailDivide() {
    calculatorSoap.divide(10,0);
    }
    @Test(expectedExceptions = ServerSOAPFaultException.class)
    public void testAddMaxValue(){
    calculatorSoap.add(Integer.MAX_VALUE,1);
    }
    @Test(expectedExceptions = ServerSOAPFaultException.class)
    public void testSubstractMinus(){
   calculatorSoap.subtract(Integer.MIN_VALUE,12);
    }

}
