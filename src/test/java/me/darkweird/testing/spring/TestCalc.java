package me.darkweird.testing.spring;

import generated.org.tempuri.CalculatorSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc extends SpringBaseTest {

   @Autowired
   CalculatorSoap calculatorSoap;

   @Test
    public void Add(){
      Assert.assertEquals(calculatorSoap.add(2,2), 4);
   }

   @Test
   public void Divide(){
      Assert.assertEquals(calculatorSoap.divide(3,3), 1);
   }

   @Test
   public void Multiply(){
      Assert.assertEquals(calculatorSoap.multiply(3,3), 9);
   }

   @Test
   public void Subtract(){
      Assert.assertEquals(calculatorSoap.subtract(5,3), 2);
   }
}

