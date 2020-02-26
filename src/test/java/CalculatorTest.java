import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void sumofnum()
    {
        Assert.assertEquals(60,Calculator.sumofnum(40,20));
    }
    public void sumofnum1()
    {
        Assert.assertEquals(24,Calculator.ProductOfNumbers1(2,3,4));
    }
public  void ProductOfNumbers()
{
  Assert.assertEquals(10,Calculator.ProductOfNumbers(5,2));
}
public void ProductOfNumbers1()
{
    Assert.assertEquals(40,Calculator.ProductOfNumbers1(5,2,4));
}
}