package task4

import task4.SumTypes.Arithmetic.Add

object SumTypes {
  enum Arithmetic:
    case Literal(num: Int)
    case Add(num1: Int, num2: Int)
    case Multiply(num1: Int, num2: Int)

  def evaluate(a: Arithmetic): Int = a match
    case Arithmetic.Literal(n) => n
    case Arithmetic.Add(n1, n2) => n1 + n2
    case Arithmetic.Multiply(n1, n2) => n1 * n2

  def show(a: Arithmetic): String = a match
    case Arithmetic.Literal(n) => "Literal: ( " + n + " )"
    case Arithmetic.Add(n1, n2) => "Add: ( " + n1 + " + " + n2 + " )"
    case Arithmetic.Multiply(n1, n2) => "Multiply: ( " + n1 + " * " + n2 + " )"

}
