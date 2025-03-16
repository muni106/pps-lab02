package task3

import org.junit.*
import org.junit.Assert.*
import neg.*

class negTest {

  val empty: String => Boolean = _ == ""

  @Test def testnegFunc() =
    assertFalse(neg(empty)(""))
    assertTrue(neg(empty)("ciao"))
}
