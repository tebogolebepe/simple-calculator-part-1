import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test

    public void sumofnum1()
    {
        Assert.assertEquals(9,Calculator.Add(2,3,4));
    }
    @Test
public  void ProductOfNumbers()
{
  Assert.assertEquals(50,Calculator.Multiply(5,2,5));
}

}