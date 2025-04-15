package task4

import org.junit.Assert.assertTrue
import org.junit.Test
import task4.SumTypes
import task4.SumTypes.{Arithmetic, evaluate, show}
import task4.SumTypes.Arithmetic.{Add, Literal, Multiply}

class testSumTypes {
  val literal: Arithmetic = Literal(15)
  val add: Arithmetic = Add(10, 5)
  val multiply: Arithmetic = Multiply(5, 3)
  @Test def testExprEvaluation(): Unit =
    assertTrue(evaluate(literal) == 15)
    assertTrue(evaluate(add) == 15)
    assertTrue(evaluate(multiply) == 15)

  @Test def testShowExpr(): Unit =
    assertTrue(show(literal) == "Literal: ( 15 )")
    assertTrue(show(add) == "Add: ( 10 + 5 )")
    assertTrue(show(multiply) == "Multiply: ( 5 * 3 )")
}
