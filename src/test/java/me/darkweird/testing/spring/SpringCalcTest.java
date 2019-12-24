package me.darkweird.testing.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
@ContextConfiguration(locations ={"classpath:spring-context.xml"} )
public class SpringCalcTest extends AbstractTestNGSpringContextTests {
}
