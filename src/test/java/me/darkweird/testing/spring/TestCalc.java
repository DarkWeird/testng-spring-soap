package me.darkweird.testing.spring;

import generated.org.tempuri.CalculatorSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc extends SpringBaseTest {

   @Autowired
   CalculatorSoap calculatorSoap;

   @Test
    public void add(){
      Assert.assertEquals(calculatorSoap.add(2,2), 4);
   }

   @Test
   public void divide(){
      Assert.assertEquals(calculatorSoap.divide(3,3), 1);
   }

   @Test
   public void multiply(){
      Assert.assertEquals(calculatorSoap.multiply(3,3), 9);
   }

   @Test
   public void subtract(){
      Assert.assertEquals(calculatorSoap.subtract(5,3), 2);
   }
}

