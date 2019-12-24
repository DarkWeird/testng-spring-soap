package me.darkweird.testing.spring;

import me.darkweird.testing.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class ExampleTest extends SpringBaseTest {

    @Autowired
        ExampleService exampleService;

    @Test
        public void exampleTest() {
        Assert.assertEquals(exampleService.returnsFour(), 4);
    }
}
