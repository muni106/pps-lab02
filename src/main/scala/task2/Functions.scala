package task2

object Functions {
  val empty: String => Boolean = _ == ""
  val zero: Int => Boolean = _ == 0

  val neg: (String => Boolean) => String => Boolean = pred => s => !pred(s)

  def genericNeg[X](pred: (X => Boolean))(s: X) : Boolean =
    !pred(s)

  val notEmpty = neg(empty)

  val p1: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z

  val p2: Int => Int => Int => Boolean = x => y => z => x <= y && y == z

  def p3(x: Int)(y: Int)(z: Int) =
    x <= y && y == z

  def p4(x: Int, y: Int, z: Int) =
    x <= y && y == z
}
