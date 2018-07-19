package com.mihasud.sandbox;

import com.mihasud.sandbox.Square;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SqaureTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
