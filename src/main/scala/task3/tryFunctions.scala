package task3


object tryFunctions extends App {
  val posNegLiteral: Int => String = _ match
    case n if n >= 0 => "positive"
    case _ => "negative"

  def posNegMethod(num: Int): String = num match
    case n if n >= 0 => "positive"
    case _ => "negative"

  println(posNegLiteral(-1))

  println(posNegMethod(0))

}
