package task2

import org.junit.Assert.{assertFalse, assertTrue}
import org.junit.Test
import task2.Functions.{genericNeg, neg, p1, p2, p3, p4}

class testFunctions {
  val empty: String => Boolean = _ == ""
  val zero: Int => Boolean = _ == 0
  val x: Int = 10
  val yLower: Int = 1
  val zLower: Int = 1
  val yWrong: Int = 9
  val zWrong: Int = 8
  val y: Int = 11
  val z: Int = 11

  @Test def testNegFunc(): Unit =
    assertFalse(neg(empty)(""))
    assertTrue(neg(empty)("ciao"))

  @Test def testGenericNegFunc(): Unit =
    val trueZero: Int = 0
    val falseZero: Int = 9
    val emptyString = ""
    val notEmptyString = "ciao"
    assertFalse(genericNeg(empty)(emptyString))
    assertTrue(genericNeg( empty)(notEmptyString))
    assertFalse(genericNeg(zero)(trueZero))
    assertTrue(genericNeg(zero)(falseZero))

  @Test def testCurryingP1(): Unit =
    assertFalse(p1(x, yLower, zLower))
    assertFalse(p1(x, yWrong, zWrong))
    assertTrue(p1(x, y, z))

  @Test def testCurryingP2(): Unit =
    assertFalse(p2(x)(yLower)(zLower))
    assertFalse(p2(x)(yWrong)(zWrong))
    assertTrue(p2(x)(y)(z))

  @Test def testCurryingP3(): Unit =
    assertFalse(p3(x)(yLower)(zLower))
    assertFalse(p3(x)(yWrong)(zWrong))
    assertTrue(p3(x)(y)(z))

  @Test def testCurryingP4(): Unit =
    assertFalse(p4(x, yLower, zLower))
    assertFalse(p4(x, yWrong, zWrong))
    assertTrue(p4(x, y, z))
}
