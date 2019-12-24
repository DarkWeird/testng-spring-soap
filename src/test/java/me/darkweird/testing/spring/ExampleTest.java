package me.darkweird.testing.spring;


import me.darkweird.testing.calc.Calculator;
import me.darkweird.testing.service.CalculatorSoap;
import me.darkweird.testing.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class ExampleTest extends SpringBaseTest {

    @Autowired
    ExampleService exampleService;

    @Autowired
    CalculatorSoap calculatorSoap;

    @Test
    public void exampleTest() {
        Assert.assertEquals(exampleService.returnsFour(), 4);
    }

    @Test
    public void addTest() {
        Assert.assertEquals(calculatorSoap.add(2, 2), 4);
    }

    @Test
    public void subtractTest() {
        Assert.assertEquals(calculatorSoap.subtract(6, 2), 4);
    }

    @Test
    public void multiplyTest() {
        Assert.assertEquals(calculatorSoap.multiply(2, 2), 4);
    }

    @Test
    public void divideTest() {
        Assert.assertEquals(calculatorSoap.divide(2, 2), 1);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void nullPointerExceptionTest() {
        CalculatorSoap nullCalcSoap = null;
        Assert.assertEquals(nullCalcSoap.add(2, 2), 4);
    }
}
