package task4

object currying extends App {
  val p1: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z

  val p2: Int => Int => Int => Boolean = x => y => z => x <= y && y == z

  def p3(x: Int)(y: Int)(z: Int) =
    x <= y && y == z


}
