import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;
import me.darkweird.testing.spring.SpringBaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;
import tempuri.CalculatorSoap;

@Test
public class CalcTest extends SpringBaseTest {
    @Autowired
    CalculatorSoap calculatorSoap;

    @Test
    public void two_plus_two(){
        Assert.assertEquals(calculatorSoap.add(2,2),4);
    }

    @Test (expectedExceptions = ServerSOAPFaultException.class)
    public void devide_by_zero(){
        System.out.println(calculatorSoap.divide(4,0));
    }
}
