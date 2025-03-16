package task3

object neg extends App{
  val empty: String => Boolean = _ == ""
  val zero: Int => Boolean = _ == 0

  val neg: (String => Boolean) => String => Boolean = pred => s => !pred(s)

  def genericNeg[X](pred: (X => Boolean))(s: X) : Boolean =
    !pred(s)

  val notEmpty = neg(empty)

}
