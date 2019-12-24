package me.darkweird.testing.spring;

import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import java.util.Random;

public class AllureTest {

    @Test
    @Epic("LEROOOOOOY JEEEENKIIINS!!!")
    public void allureReportUgly(){
        step1();
        step2(new Random().nextInt());
    }

    @Step("первый шаг, типа логин (картинок не будет)")
    public void step1(){
        nestedStep();
    }

    @Step("Вложеный шаг")
    public void nestedStep(){

    }

    @Step("второй, вроде. с параметрами int: {random}")
    public void step2(int random){
        nestedStep();
    }
}
