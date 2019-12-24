package me.darkweird.testing.impl;

import me.darkweird.testing.service.CalculatorSoap;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceCalcImpl implements CalculatorSoap {


    @Override
    public int add(int intA, int intB) {
        return intA + intB;
    }

    @Override
    public int subtract(int intA, int intB) {
        return intA - intB;
    }

    @Override
    public int multiply(int intA, int intB) {
        return intA * intB;
    }

    @Override
    public int divide(int intA, int intB) {
        return intA / intB;
    }
}
