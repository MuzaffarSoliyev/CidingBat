package recursion1;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Recursion1Test {
  private Recursion1 recursion1;

  @Before
  public void createSolverObject() {
    recursion1 = new Recursion1();
  }

  @Test
  public void fibonacciTest1() {
    Assert.assertEquals(0, recursion1.fibonacci(0));
  }

  @Test
  public void fibonacciTest2() {
    Assert.assertEquals(1, recursion1.fibonacci(1));

  }

  @Test
  public void fibonacciTest3() {
    Assert.assertEquals(1, recursion1.fibonacci(2));

  }

  @Test
  public void fibonacciTest4() {
    Assert.assertEquals(2, recursion1.fibonacci(3));

  }

  @Test
  public void countXTest() {
    Assert.assertEquals(4, recursion1.countX("xxhixx"));
  }

  @Test
  public void countHiTest() {
    Assert.assertEquals(4, recursion1.countHi("ihihihihih"));
  }

  @Test
  public void endXTest() {
    Assert.assertEquals("rexx", recursion1.endX("xxre"));
  }


  @Test
  public void countHi2Test() {
    Assert.assertEquals(0, recursion1.countHi2("xxhi"));
  }

  @Test
  public void parentBitTest() {
    Assert.assertEquals("(abc)", recursion1.parenBit("xyz(abc)123"));
  }

  @Test
  public void strCountTest() {
    Assert.assertEquals(2, recursion1.strCount("catcowcat", "cat"));
  }


}
