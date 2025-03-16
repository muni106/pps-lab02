package task2

object Functions {

  val neg: (String => Boolean) => String => Boolean = pred => s => !pred(s)

  def genericNeg[X](pred: (X => Boolean))(s: X) : Boolean =
    !pred(s)

  val p1: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z

  val p2: Int => Int => Int => Boolean = x => y => z => x <= y && y == z

  def p3(x: Int)(y: Int)(z: Int): Boolean =
    x <= y && y == z

  def p4(x: Int, y: Int, z: Int): Boolean =
    x <= y && y == z

  def compose(f: Int => Int, g: Int => Int)(x: Int): Int =
    f(g(x))

  def genericCompose[A, B, C](f: B => C, g: A => B)(x: A): C =
    f(g(x))

  def composeThree[A, B, C, D](f: C => D, g: B => C, h: A => B)(x: A): D =
    f(genericCompose[A, B, C](g,h)(x))
}
