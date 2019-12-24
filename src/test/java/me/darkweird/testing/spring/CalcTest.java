package me.darkweird.testing.spring;

import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;
import tempuri.CalculatorSoap;

@Test
public class CalcTest extends SpringBaseTest {
    @Autowired
    CalculatorSoap calculatorSoap;

    @Test (description = "Проверка операции сложения")
    public void two_plus_two(){
        Assert.assertEquals(calculatorSoap.add(2,2),4);
    }

    @Test (expectedExceptions = ServerSOAPFaultException.class, description = "Проверка того, что деление на 0 " +
            "выдаст ошибку")
    public void divByZero(){
        System.out.println(calculatorSoap.divide(4,0));
    }

    @Test (expectedExceptions = ServerSOAPFaultException.class, description = "Проверка результата сложения 2х max_int")
    public void maxint(){
        Integer max = Integer.MAX_VALUE;
        System.out.println(calculatorSoap.add(max,max));
    }

    @Test (description = "Проверка того, что ответ сервера при деление на 0 будет содержать слово Overflow")
    public void divByZeroTryCatch(){
        try {
            calculatorSoap.divide(4,0);
        } catch (ServerSOAPFaultException err){
            Assert.assertTrue(err.getMessage().contains("Overflow"));
        }
    }

    @Test (expectedExceptions = ServerSOAPFaultException.class,
            description = "Проверка, что вычитание из Integer.MIN_VALUE возвращает ошибку")
    public void subFromIntMin(){
        calculatorSoap.subtract(Integer.MIN_VALUE,256);
    }

    @Test (expectedExceptions = ServerSOAPFaultException.class)
    public void multMaxInt(){
        calculatorSoap.multiply(Integer.MAX_VALUE,(int)(Math.random()*10));
    }

    @Test
    public void intMaxPlusZero(){
        Assert.assertEquals(calculatorSoap.add(Integer.MAX_VALUE,0),Integer.MAX_VALUE);
    }

    @Test (expectedExceptions = ServerSOAPFaultException.class)
    public void intMaxPlusOne(){
        Assert.assertEquals(calculatorSoap.add(Integer.MAX_VALUE,1),Integer.MAX_VALUE);
    }




}
