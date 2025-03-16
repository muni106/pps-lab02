package task3

import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test
import task3.Recursion.{power, powerTail, reverseNumber}

class testRecursion {
  @Test def testPowerFunc(): Unit =
    assertTrue(power(2, 3) == 8.0)
    assertTrue(power(5, 2) == 25.0)
    assertTrue(powerTail(2, 3) == 8.0)
    assertTrue(powerTail(5, 2) == 25.0)

  @Test def testReverseFunc(): Unit =
    assertTrue(reverseNumber(12345) == 54321)

}
