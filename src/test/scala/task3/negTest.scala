package task3

import org.junit.*
import org.junit.Assert.*
import neg.*

class negTest {

  val empty: String => Boolean = _ == ""
  val zero: Int => Boolean = _ == 0


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

}
