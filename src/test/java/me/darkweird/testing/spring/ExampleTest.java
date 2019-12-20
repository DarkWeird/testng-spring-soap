package me.darkweird.testing.spring;

import me.darkweird.testing.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class ExampleTest extends AbstractTestNGSpringContextTests {

    @Autowired
    ExampleService exampleService;

    @Test
    public void exampleTest() {
        Assert.assertEquals(exampleService.returnsFour(), 4);
    }
}
