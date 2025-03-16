package task3

object neg extends App{
  val empty: String => Boolean = _ == ""
  val zero: Int => Boolean = _ == 0

  val neg: (String => Boolean) => String => Boolean = pred => s => !pred(s)

  def genericNeg[X](s: X, pred: (X => Boolean)) : Boolean =
    !pred(s)

  val notEmpty = neg(empty)



}
