package task3

object neg extends App{
  val empty: String => Boolean = _ == ""

  val neg: (String => Boolean) => String => Boolean = pred => s => !pred(s)

  val notEmpty = neg(empty)

  println(notEmpty("ciao"))
  println(neg(empty)(""))


}
