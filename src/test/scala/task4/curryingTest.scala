package task4

import org.junit.*
import org.junit.Assert.*
import currying.*

class curryingTest {

  val x: Int = 10
  val yLower: Int = 1
  val zLower: Int = 1
  val yWrong: Int = 9
  val zWrong: Int = 8
  val y: Int = 11
  val z: Int = 11



  @Test def testCurryingP1(): Unit =
    assertFalse(p1(x, yLower, zLower))
    assertFalse(p1(x, yWrong, zWrong))
    assertTrue(p1(x, y, z))

  @Test def testCurryingP2(): Unit =
    assertFalse(p2(x)(yLower)(zLower))
    assertFalse(p2(x)(yWrong)(zWrong))
    assertTrue(p2(x)(y)(z))

}
